package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final String KEY_BITRATE_MODE = "bitrate-mode";
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int REQUIRED_RESOLUTION_ALIGNMENT = 16;
    private static final String TAG = "HardwareVideoEncoder";
    private static final int VIDEO_AVC_LEVEL_3 = 256;
    private static final int VIDEO_AVC_PROFILE_HIGH = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private ByteBuffer configBuffer;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private long nextPresentationTimestampUs;
    private final BusyCount outputBuffersBusyCount;
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    private final Map<String, String> params;
    private volatile boolean running;
    private final EglBase14.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private final Integer surfaceColorFormat;
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class BusyCount {
        private int count;
        private final Object countLock;

        private BusyCount() {
            this.countLock = new Object();
        }

        public void decrement() {
            synchronized (this.countLock) {
                int i = this.count - 1;
                this.count = i;
                if (i == 0) {
                    this.countLock.notifyAll();
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z;
            synchronized (this.countLock) {
                z = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e) {
                        Logging.m8409e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e);
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static abstract class YuvFormat {
        private static final /* synthetic */ YuvFormat[] $VALUES;
        public static final YuvFormat I420;
        public static final YuvFormat NV12;

        /* renamed from: org.webrtc.HardwareVideoEncoder$YuvFormat$1 */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        enum C112421 extends YuvFormat {
            private C112421(String str, int i) {
                super(str, i);
            }

            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i, int i2) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), i, i2, i / 2, i2 / 2);
                i420.release();
            }
        }

        /* renamed from: org.webrtc.HardwareVideoEncoder$YuvFormat$2 */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        enum C112432 extends YuvFormat {
            private C112432(String str, int i) {
                super(str, i);
            }

            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i, int i2) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), i, i2);
                i420.release();
            }
        }

        static {
            C112421 c112421 = new C112421("I420", 0);
            I420 = c112421;
            C112432 c112432 = new C112432("NV12", 1);
            NV12 = c112432;
            $VALUES = new YuvFormat[]{c112421, c112432};
        }

        private YuvFormat(String str, int i) {
        }

        public static YuvFormat valueOf(String str) {
            return (YuvFormat) Enum.valueOf(YuvFormat.class, str);
        }

        public static YuvFormat[] values() {
            return (YuvFormat[]) $VALUES.clone();
        }

        abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i, int i2);

        static YuvFormat valueOf(int i) {
            if (i != 19) {
                if (i != 21 && i != 2141391872 && i != 2141391876) {
                    throw new IllegalArgumentException("Unsupported colorFormat: " + i);
                }
                return NV12;
            }
            return I420;
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i, int i2, BitrateAdjuster bitrateAdjuster, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i2);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        threadChecker.detachThread();
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new Thread() { // from class: org.webrtc.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j, VideoFrame.Buffer buffer, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer == -1) {
                Logging.m8411d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffer(dequeueInputBuffer), buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    Logging.m8409e(TAG, "queueInputBuffer failed", e);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e2) {
                Logging.m8409e(TAG, "getInputBuffer with index=" + dequeueInputBuffer + " failed", e2);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e3) {
            Logging.m8409e(TAG, "dequeueInputBuffer failed", e3);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j));
            return VideoCodecStatus.OK;
        } catch (RuntimeException e) {
            Logging.m8409e(TAG, "encodeTexture failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    private static int getSliceHeight(MediaFormat mediaFormat, int i) {
        if (mediaFormat != null && mediaFormat.containsKey("slice-height")) {
            return mediaFormat.getInteger("slice-height");
        }
        return i;
    }

    private static int getStride(MediaFormat mediaFormat, int i) {
        if (mediaFormat != null && mediaFormat.containsKey("stride")) {
            return mediaFormat.getInteger("stride");
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa A[Catch: IllegalStateException -> 0x0120, TryCatch #1 {IllegalStateException -> 0x0120, blocks: (B:9:0x0026, B:11:0x0060, B:15:0x006f, B:29:0x0095, B:30:0x00aa, B:20:0x007e, B:23:0x0088, B:31:0x00b8, B:33:0x00d6, B:34:0x00f2), top: B:44:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.webrtc.VideoCodecStatus initEncodeInternal() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.initEncodeInternal():org.webrtc.VideoCodecStatus");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverEncodedImage$0(int i) {
        try {
            this.codec.releaseOutputBuffer(i, false);
        } catch (Exception e) {
            Logging.m8409e(TAG, "releaseOutputBuffer failed", e);
        }
        this.outputBuffersBusyCount.decrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m8411d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.m8409e(TAG, "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.m8409e(TAG, "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        Logging.m8411d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            Logging.m8409e(TAG, "requestKeyFrame failed", e);
        }
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        if (i % 16 == 0 && i2 % 16 == 0) {
            this.width = i;
            this.height = i2;
            this.useSurfaceMode = z;
            return initEncodeInternal();
        }
        Logging.m8410e(TAG, "MediaCodec is only tested with resolutions that are 16x16 aligned.");
        return VideoCodecStatus.ERR_SIZE;
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        if (j2 > 0 && j > this.lastKeyFrameNs + j2) {
            return true;
        }
        return false;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e) {
            Logging.m8409e(TAG, "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ long createNativeVideoEncoder() {
        return C11310i1.m8303a(this);
    }

    protected void deliverEncodedImage() {
        ByteBuffer slice;
        EncodedImage.FrameType frameType;
        VideoCodecMimeType videoCodecMimeType;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            final int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -3) {
                    this.outputBuffersBusyCount.waitForZero();
                    return;
                }
                return;
            }
            ByteBuffer outputBuffer = this.codec.getOutputBuffer(dequeueOutputBuffer);
            ByteBuffer byteBuffer = (ByteBuffer) outputBuffer.position(bufferInfo.offset);
            ByteBuffer byteBuffer2 = (ByteBuffer) outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            if ((bufferInfo.flags & 2) != 0) {
                int i = bufferInfo.offset;
                int i2 = bufferInfo.size;
                Logging.m8411d(TAG, "Config frame generated. Offset: " + i + ". Size: " + i2);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                this.configBuffer = allocateDirect;
                allocateDirect.put(outputBuffer);
                return;
            }
            this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
            if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                updateBitrate();
            }
            boolean z = true;
            if ((bufferInfo.flags & 1) == 0) {
                z = false;
            }
            if (z) {
                Logging.m8411d(TAG, "Sync frame generated");
            }
            if (z && ((videoCodecMimeType = this.codecType) == VideoCodecMimeType.H264 || videoCodecMimeType == VideoCodecMimeType.H265)) {
                int capacity = this.configBuffer.capacity();
                int i3 = bufferInfo.offset;
                int i4 = bufferInfo.size;
                Logging.m8411d(TAG, "Prepending config frame of size " + capacity + " to output buffer with offset " + i3 + ", size " + i4);
                slice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                ByteBuffer byteBuffer3 = (ByteBuffer) this.configBuffer.rewind();
                slice.put(this.configBuffer);
                slice.put(outputBuffer);
                ByteBuffer byteBuffer4 = (ByteBuffer) slice.rewind();
            } else {
                slice = outputBuffer.slice();
            }
            if (z) {
                frameType = EncodedImage.FrameType.VideoFrameKey;
            } else {
                frameType = EncodedImage.FrameType.VideoFrameDelta;
            }
            this.outputBuffersBusyCount.increment();
            EncodedImage createEncodedImage = this.outputBuilders.poll().setBuffer(slice, new Runnable() { // from class: org.webrtc.b0
                @Override // java.lang.Runnable
                public final void run() {
                    HardwareVideoEncoder.this.lambda$deliverEncodedImage$0(dequeueOutputBuffer);
                }
            }).setFrameType(frameType).createEncodedImage();
            this.callback.onEncodedFrame(createEncodedImage, new VideoEncoder.CodecSpecificInfo());
            createEncodedImage.release();
        } catch (IllegalStateException e) {
            Logging.m8409e(TAG, "deliverOutput failed", e);
        }
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        boolean z;
        VideoCodecStatus resetCodec;
        VideoCodecStatus encodeByteBuffer;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        boolean z2 = buffer instanceof VideoFrame.TextureBuffer;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        if (canUseSurface() && z2) {
            z = true;
        } else {
            z = false;
        }
        if ((width != this.width || height != this.height || z != this.useSurfaceMode) && (resetCodec = resetCodec(width, height, z)) != VideoCodecStatus.OK) {
            return resetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            Logging.m8407w(TAG, "Dropped frame, encoder queue full");
            return VideoCodecStatus.NO_OUTPUT;
        }
        boolean z3 = false;
        for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                z3 = true;
            }
        }
        if (z3 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        int height2 = ((buffer.getHeight() * buffer.getWidth()) * 3) / 2;
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        long j = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (TimeUnit.SECONDS.toMicros(1L) / this.bitrateAdjuster.getAdjustedFramerateFps());
        if (this.useSurfaceMode) {
            encodeByteBuffer = encodeTextureBuffer(videoFrame, j);
        } else {
            encodeByteBuffer = encodeByteBuffer(videoFrame, j, buffer, height2);
        }
        if (encodeByteBuffer != VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        return encodeByteBuffer;
    }

    protected void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer, this.stride, this.sliceHeight);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(16, false);
    }

    @Override // org.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return C11310i1.m8301c(this);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.useSurfaceMode = canUseSurface();
        int i2 = settings.startBitrate;
        if (i2 != 0 && (i = settings.maxFramerate) != 0) {
            this.bitrateAdjuster.setTargets(i2 * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, i);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        int i3 = this.width;
        int i4 = this.height;
        int i5 = settings.startBitrate;
        int i6 = settings.maxFramerate;
        boolean z = this.useSurfaceMode;
        Logging.m8411d(TAG, "initEncode: " + i3 + " x " + i4 + ". @ " + i5 + "kbps. Fps: " + i6 + " Use surface mode: " + z);
        return initEncodeInternal();
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ boolean isHardwareEncoder() {
        return C11310i1.m8300d(this);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.m8410e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.m8409e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i > 30) {
            i = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i);
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }
}
