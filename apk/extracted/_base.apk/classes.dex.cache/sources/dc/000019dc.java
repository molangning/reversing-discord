package com.discord.media.engine.video.texture_view;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.logging.Log;
import com.discord.media.engine.MediaEngine;
import com.discord.media.engine.MediaEngineKt;
import com.discord.media.engine.types.Debug;
import com.discord.media.engine.video.AttachedVideoSinks;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ViewProps;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

@Metadata(m14358d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012H\u0016J0\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0012H\u0014J\u0018\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0012H\u0014J\b\u0010/\u001a\u00020\u0019H\u0016J\b\u00100\u001a\u00020\u0019H\u0007J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020'H\u0007J\u0018\u00103\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0003H\u0007J\b\u00104\u001a\u00020\nH\u0016J\b\u00105\u001a\u00020\u0019H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m14357d2 = {"Lcom/discord/media/engine/video/texture_view/VideoStreamTextureView;", "Landroid/view/TextureView;", "Lorg/webrtc/VideoSink;", "Lorg/webrtc/RendererCommon$RendererEvents;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "currentStreamId", "", "eglRenderer", "Lcom/discord/media/engine/video/texture_view/TextureViewEglRenderer;", "mediaEngine", "Lcom/discord/media/engine/MediaEngine;", ZeroconfModule.KEY_SERVICE_NAME, "rendererEvents", "rotatedFrameHeight", "", "rotatedFrameWidth", "startRenderingTimestampNs", "", "videoLayoutMeasure", "Lorg/webrtc/RendererCommon$VideoLayoutMeasure;", "attachToStream", "", "streamId", "events", "init", "onFirstFrameRendered", "onFrame", "videoFrame", "Lorg/webrtc/VideoFrame;", "onFrameResolutionChanged", "videoWidth", "videoHeight", ViewProps.ROTATION, ViewProps.ON_LAYOUT, "changed", "", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onMeasure", "widthSpec", "heightSpec", "requestLayout", "reset", "setMirror", "mirror", "startRenderingStream", "toString", "updateSurfaceSize", "Companion", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class VideoStreamTextureView extends TextureView implements VideoSink, RendererCommon.RendererEvents {
    private static final String TAG = "VideoStreamTextureView";
    private String currentStreamId;
    private final TextureViewEglRenderer eglRenderer;
    private final MediaEngine mediaEngine;
    private final String name;
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private long startRenderingTimestampNs;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;
    public static final Companion Companion = new Companion(null);
    private static final AtomicInteger count = new AtomicInteger();
    private static final AtomicInteger liveCount = new AtomicInteger();

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m14357d2 = {"Lcom/discord/media/engine/video/texture_view/VideoStreamTextureView$Companion;", "", "()V", "TAG", "", "count", "Ljava/util/concurrent/atomic/AtomicInteger;", "liveCount", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoStreamTextureView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ VideoStreamTextureView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void attachToStream(MediaEngine mediaEngine, String str, RendererCommon.RendererEvents rendererEvents) {
        if (ThreadUtilsKt.isOnMainThread()) {
            String str2 = this.currentStreamId;
            if (str2 != null) {
                Log log = Log.INSTANCE;
                String str3 = this.name;
                int decrementAndGet = liveCount.decrementAndGet();
                Log.i$default(log, str3, "Releasing, liveCount now " + decrementAndGet, (Throwable) null, 4, (Object) null);
                this.eglRenderer.release();
                AttachedVideoSinks.INSTANCE.removeSink(mediaEngine, this, str2);
                this.currentStreamId = null;
            }
            if (str != null) {
                this.currentStreamId = str;
                try {
                    if (rendererEvents != null) {
                        init(rendererEvents);
                        AttachedVideoSinks.INSTANCE.addSink(mediaEngine, this, str);
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } catch (RuntimeException e) {
                    Log.INSTANCE.m31912e(this.name, "Couldn't init EGLRenderer for stream", e);
                    return;
                }
            }
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public final void init(RendererCommon.RendererEvents rendererEvents) {
        System.nanoTime();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.initialize(rendererEvents);
        Log log = Log.INSTANCE;
        int incrementAndGet = liveCount.incrementAndGet();
        Log.i$default(log, TAG, "initialized, liveCount now " + incrementAndGet, (Throwable) null, 4, (Object) null);
        Debug debug = Debug.INSTANCE;
    }

    public final void updateSurfaceSize() {
        if (ThreadUtilsKt.isOnMainThread()) {
            if (isAvailable()) {
                Debug debug = Debug.INSTANCE;
                String unused = this.name;
                SurfaceTexture surfaceTexture = getSurfaceTexture();
                C9612q.m13920e(surfaceTexture);
                surfaceTexture.setDefaultBufferSize(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        Debug debug = Debug.INSTANCE;
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents == null) {
            C9612q.m13900y("rendererEvents");
            rendererEvents = null;
        }
        rendererEvents.onFirstFrameRendered();
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        C9612q.m13917h(videoFrame, "videoFrame");
        this.eglRenderer.onFrame(videoFrame);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i3 != 0 && i3 != 180) {
            i4 = i2;
        } else {
            i4 = i;
        }
        if (i3 != 0 && i3 != 180) {
            i5 = i;
        } else {
            i5 = i2;
        }
        Debug debug = Debug.INSTANCE;
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents == null) {
            C9612q.m13900y("rendererEvents");
            rendererEvents = null;
        }
        rendererEvents.onFrameResolutionChanged(i, i2, i3);
        if (ThreadUtilsKt.isOnMainThread()) {
            this.rotatedFrameWidth = i4;
            this.rotatedFrameHeight = i5;
            updateSurfaceSize();
            requestLayout();
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            float f = (i3 - i) / (i4 - i2);
            if (Float.isNaN(f)) {
                return;
            }
            Debug debug = Debug.INSTANCE;
            this.eglRenderer.setLayoutAspectRatio(f);
            updateSurfaceSize();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        Point measure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        if (this.rotatedFrameWidth != 0 || this.rotatedFrameHeight != 0) {
            Debug debug = Debug.INSTANCE;
        }
        setMeasuredDimension(measure.x, measure.y);
    }

    @Override // android.view.View
    public void requestLayout() {
        Debug debug = Debug.INSTANCE;
        super.requestLayout();
    }

    public final void reset() {
        Debug debug = Debug.INSTANCE;
        this.startRenderingTimestampNs = 0L;
        attachToStream(this.mediaEngine, null, null);
    }

    public final void setMirror(boolean z) {
        Debug debug = Debug.INSTANCE;
        this.eglRenderer.setMirror(z);
    }

    public final void startRenderingStream(String streamId, RendererCommon.RendererEvents events) {
        C9612q.m13917h(streamId, "streamId");
        C9612q.m13917h(events, "events");
        Debug debug = Debug.INSTANCE;
        this.startRenderingTimestampNs = System.nanoTime();
        attachToStream(this.mediaEngine, streamId, events);
    }

    @Override // android.view.View
    public String toString() {
        String str = this.name;
        String str2 = this.currentStreamId;
        return str + " (currentStreamId=" + str2 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStreamTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        String str = "VideoStreamTextureView-" + count.incrementAndGet();
        this.name = str;
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.mediaEngine = MediaEngineKt.getMediaEngine((ReactContext) context);
        this.eglRenderer = new TextureViewEglRenderer(str);
        setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.discord.media.engine.video.texture_view.VideoStreamTextureView.1
            private long startNs = System.nanoTime();
            private int surfaceTextureCount;

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
                C9612q.m13917h(surface, "surface");
                Debug debug = Debug.INSTANCE;
                String unused = VideoStreamTextureView.this.name;
                VideoStreamTextureView.this.updateSurfaceSize();
                VideoStreamTextureView.this.eglRenderer.onSurfaceTextureAvailable(surface, i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
                C9612q.m13917h(surface, "surface");
                System.nanoTime();
                boolean onSurfaceTextureDestroyed = VideoStreamTextureView.this.eglRenderer.onSurfaceTextureDestroyed(surface);
                Debug debug = Debug.INSTANCE;
                String unused = VideoStreamTextureView.this.name;
                return onSurfaceTextureDestroyed;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
                C9612q.m13917h(surface, "surface");
                Debug debug = Debug.INSTANCE;
                String unused = VideoStreamTextureView.this.name;
                VideoStreamTextureView.this.eglRenderer.onSurfaceTextureSizeChanged(surface, i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surface) {
                C9612q.m13917h(surface, "surface");
                VideoStreamTextureView.this.eglRenderer.onSurfaceTextureUpdated(surface);
            }
        });
    }
}