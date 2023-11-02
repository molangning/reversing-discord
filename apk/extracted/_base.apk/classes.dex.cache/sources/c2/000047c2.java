package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class SurfaceTextureHelper {
    private static final String TAG = "SurfaceTextureHelper";
    private final EglBase eglBase;
    private final FrameRefMonitor frameRefMonitor;
    private int frameRotation;
    private final Handler handler;
    private boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    private VideoSink listener;
    private final int oesTextureId;
    private VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private final TextureBufferImpl.RefCountMonitor textureRefCountMonitor;
    private int textureWidth;
    private final TimestampAligner timestampAligner;
    private final YuvConverter yuvConverter;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface FrameRefMonitor {
        void onDestroyBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onNewBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onReleaseBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onRetainBuffer(VideoFrame.TextureBuffer textureBuffer);
    }

    private SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor) {
        this.textureRefCountMonitor = new TextureBufferImpl.RefCountMonitor() { // from class: org.webrtc.SurfaceTextureHelper.2
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                SurfaceTextureHelper.this.returnTextureFrame();
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onDestroyBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onReleaseBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onRetainBuffer(textureBufferImpl);
                }
            }
        };
        this.setListenerRunnable = new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                VideoSink videoSink = SurfaceTextureHelper.this.pendingListener;
                Logging.m8411d(SurfaceTextureHelper.TAG, "Setting listener to " + videoSink);
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler;
            this.timestampAligner = z ? new TimestampAligner() : null;
            this.yuvConverter = yuvConverter;
            this.frameRefMonitor = frameRefMonitor;
            EglBase m8289d = C11326o.m8289d(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = m8289d;
            try {
                m8289d.createDummyPbufferSurface();
                m8289d.makeCurrent();
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.webrtc.z0
                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                        SurfaceTextureHelper.this.lambda$new$0(surfaceTexture2);
                    }
                }, handler);
                return;
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z, final YuvConverter yuvConverter, final FrameRefMonitor frameRefMonitor) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: org.webrtc.SurfaceTextureHelper.1
            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, handler, z, yuvConverter, frameRefMonitor);
                } catch (RuntimeException e) {
                    String str2 = str;
                    Logging.m8409e(SurfaceTextureHelper.TAG, str2 + " create failure", e);
                    return null;
                }
            }
        });
    }

    public /* synthetic */ void lambda$dispose$6() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
    }

    public /* synthetic */ void lambda$forceFrame$3() {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture) {
        if (this.hasPendingTexture) {
            Logging.m8411d(TAG, "A frame is already pending, dropping frame.");
        }
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public /* synthetic */ void lambda$returnTextureFrame$5() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    public /* synthetic */ void lambda$setFrameRotation$4(int i) {
        this.frameRotation = i;
    }

    public /* synthetic */ void lambda$setTextureSize$2(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
        tryDeliverTextureFrame();
    }

    public /* synthetic */ void lambda$stopListening$1() {
        this.listener = null;
        this.pendingListener = null;
    }

    private void release() {
        if (this.handler.getLooper().getThread() == Thread.currentThread()) {
            if (!this.isTextureInUse && this.isQuitting) {
                this.yuvConverter.release();
                GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
                this.surfaceTexture.release();
                this.eglBase.release();
                this.handler.getLooper().quit();
                TimestampAligner timestampAligner = this.timestampAligner;
                if (timestampAligner != null) {
                    timestampAligner.dispose();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unexpected release.");
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: org.webrtc.a1
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$returnTextureFrame$5();
            }
        });
    }

    private void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() == Thread.currentThread()) {
            if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
                if (this.textureWidth != 0 && this.textureHeight != 0) {
                    this.isTextureInUse = true;
                    this.hasPendingTexture = false;
                    updateTexImage();
                    float[] fArr = new float[16];
                    this.surfaceTexture.getTransformMatrix(fArr);
                    long timestamp = this.surfaceTexture.getTimestamp();
                    TimestampAligner timestampAligner = this.timestampAligner;
                    if (timestampAligner != null) {
                        timestamp = timestampAligner.translateTimestamp(timestamp);
                    }
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, this.textureRefCountMonitor);
                    FrameRefMonitor frameRefMonitor = this.frameRefMonitor;
                    if (frameRefMonitor != null) {
                        frameRefMonitor.onNewBuffer(textureBufferImpl);
                    }
                    VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
                    this.listener.onFrame(videoFrame);
                    videoFrame.release();
                    return;
                }
                Logging.m8407w(TAG, "Texture size has not been set.");
                return;
            }
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        Logging.m8411d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.v0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$dispose$6();
            }
        });
    }

    public void forceFrame() {
        this.handler.post(new Runnable() { // from class: org.webrtc.u0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$forceFrame$3();
            }
        });
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void setFrameRotation(final int i) {
        this.handler.post(new Runnable() { // from class: org.webrtc.y0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$setFrameRotation$4(i);
            }
        });
    }

    public void setTextureSize(final int i, final int i2) {
        if (i > 0) {
            if (i2 > 0) {
                this.surfaceTexture.setDefaultBufferSize(i, i2);
                this.handler.post(new Runnable() { // from class: org.webrtc.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceTextureHelper.this.lambda$setTextureSize$2(i, i2);
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Texture height must be positive, but was " + i2);
        }
        throw new IllegalArgumentException("Texture width must be positive, but was " + i);
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public void stopListening() {
        Logging.m8411d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.x0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$stopListening$1();
            }
        });
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false, new YuvConverter(), null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, new YuvConverter(), null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter) {
        return create(str, context, z, yuvConverter, null);
    }
}