package org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class VideoFileRenderer implements VideoSink {
    private static final String TAG = "VideoFileRenderer";
    private EglBase eglBase;
    private final HandlerThread fileThread;
    private final Handler fileThreadHandler;
    private int frameCount;
    private final int outputFileHeight;
    private final String outputFileName;
    private final int outputFileWidth;
    private final ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final FileOutputStream videoOutFile;
    private YuvConverter yuvConverter;

    public VideoFileRenderer(String str, int i, int i2, final EglBase.Context context) {
        if (i % 2 != 1 && i2 % 2 != 1) {
            this.outputFileName = str;
            this.outputFileWidth = i;
            this.outputFileHeight = i2;
            int i3 = ((i * i2) * 3) / 2;
            this.outputFrameSize = i3;
            this.outputFrameBuffer = ByteBuffer.allocateDirect(i3);
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            this.videoOutFile = fileOutputStream;
            fileOutputStream.write(("YUV4MPEG2 C420 W" + i + " H" + i2 + " Ip F30:1 A1:1\n").getBytes(Charset.forName("US-ASCII")));
            HandlerThread handlerThread = new HandlerThread("VideoFileRendererRenderThread");
            this.renderThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.renderThreadHandler = handler;
            HandlerThread handlerThread2 = new HandlerThread("VideoFileRendererFileThread");
            this.fileThread = handlerThread2;
            handlerThread2.start();
            this.fileThreadHandler = new Handler(handlerThread2.getLooper());
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: org.webrtc.VideoFileRenderer.1
                @Override // java.lang.Runnable
                public void run() {
                    VideoFileRenderer.this.eglBase = C11326o.m8289d(context, EglBase.CONFIG_PIXEL_BUFFER);
                    VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                    VideoFileRenderer.this.eglBase.makeCurrent();
                    VideoFileRenderer.this.yuvConverter = new YuvConverter();
                }
            });
            return;
        }
        throw new IllegalArgumentException("Does not support uneven width or height");
    }

    public /* synthetic */ void lambda$release$2(CountDownLatch countDownLatch) {
        this.yuvConverter.release();
        this.eglBase.release();
        this.renderThread.quit();
        countDownLatch.countDown();
    }

    public /* synthetic */ void lambda$release$3() {
        try {
            this.videoOutFile.close();
            String str = this.outputFileName;
            int i = this.frameCount;
            int i2 = this.outputFileWidth;
            int i3 = this.outputFileHeight;
            Logging.m8411d(TAG, "Video written to disk as " + str + ". The number of frames is " + i + " and the dimensions of the frames are " + i2 + "x" + i3 + ".");
            this.fileThread.quit();
        } catch (IOException e) {
            throw new RuntimeException("Error closing output file", e);
        }
    }

    public /* synthetic */ void lambda$renderFrameOnRenderThread$1(VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), this.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.getRotation());
        i420Buffer.release();
        try {
            this.videoOutFile.write("FRAME\n".getBytes(Charset.forName("US-ASCII")));
            this.videoOutFile.write(this.outputFrameBuffer.array(), this.outputFrameBuffer.arrayOffset(), this.outputFrameSize);
            this.frameCount++;
        } catch (IOException e) {
            throw new RuntimeException("Error writing video to disk", e);
        }
    }

    /* renamed from: renderFrameOnRenderThread */
    public void lambda$onFrame$0(final VideoFrame videoFrame) {
        int i;
        int i2;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (videoFrame.getRotation() % 180 == 0) {
            i = this.outputFileWidth;
        } else {
            i = this.outputFileHeight;
        }
        int i3 = i;
        if (videoFrame.getRotation() % 180 == 0) {
            i2 = this.outputFileHeight;
        } else {
            i2 = this.outputFileWidth;
        }
        int i4 = i2;
        float width = buffer.getWidth() / buffer.getHeight();
        float f = i3 / i4;
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f > width) {
            height = (int) (height * (width / f));
        } else {
            width2 = (int) (width2 * (f / width));
        }
        VideoFrame.Buffer cropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i3, i4);
        videoFrame.release();
        final VideoFrame.I420Buffer i420 = cropAndScale.toI420();
        cropAndScale.release();
        this.fileThreadHandler.post(new Runnable() { // from class: org.webrtc.p1
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.this.lambda$renderFrameOnRenderThread$1(i420, videoFrame);
            }
        });
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.o1
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.this.lambda$onFrame$0(videoFrame);
            }
        });
    }

    public void release() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.m1
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.this.lambda$release$2(countDownLatch);
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.fileThreadHandler.post(new Runnable() { // from class: org.webrtc.n1
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.this.lambda$release$3();
            }
        });
        try {
            this.fileThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Logging.m8409e(TAG, "Interrupted while waiting for the write to disk to complete.", e);
        }
    }
}