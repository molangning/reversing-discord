package com.discord.media.engine.video;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.discord.media.engine.video.events.OnReadyEvent;
import com.discord.media.engine.video.events.OnSizeEvent;
import com.discord.media.engine.video.texture_view.VideoStreamTextureView;
import com.discord.reactevents.ReactEvents;
import com.discord.wakelock.ScreenWakeLock;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDVideoRendererManagerDelegate;
import com.facebook.react.viewmanagers.DCDVideoRendererManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.RendererCommon;
import pf.C11591x;

@ReactModule(name = "DCDVideoRenderer")
@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u001a\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/media/engine/video/texture_view/VideoStreamTextureView;", "Lcom/facebook/react/viewmanagers/DCDVideoRendererManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDVideoRendererManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "onDropViewInstance", "", "view", "setMirror", "value", "", "setStreamId", "Companion", "RenderListener", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class VideoStreamViewManager extends SimpleViewManager<VideoStreamTextureView> implements DCDVideoRendererManagerInterface<VideoStreamTextureView> {
    public static final String NAME = "DCDVideoRenderer";
    public static final String WAKE_LOCK_KEY = "DCDVideoRenderer";
    private final DCDVideoRendererManagerDelegate<VideoStreamTextureView, VideoStreamViewManager> delegate = new DCDVideoRendererManagerDelegate<>(this);
    public static final Companion Companion = new Companion(null);
    private static final ReactEvents reactEvents = new ReactEvents(C11591x.m7577a("onReady", C9591f0.m13969b(OnReadyEvent.class)), C11591x.m7577a("onSize", C9591f0.m13969b(OnSizeEvent.class)));

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m14357d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager$Companion;", "", "()V", "NAME", "", "WAKE_LOCK_KEY", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager$RenderListener;", "Lorg/webrtc/RendererCommon$RendererEvents;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "onFirstFrameRendered", "", "onFrameResolutionChanged", "width", "", "height", ViewProps.ROTATION, "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class RenderListener implements RendererCommon.RendererEvents {
        private final View view;

        public RenderListener(View view) {
            C9612q.m13917h(view, "view");
            this.view = view;
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFirstFrameRendered() {
            ReactEvents reactEvents = VideoStreamViewManager.reactEvents;
            Context context = this.view.getContext();
            C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            reactEvents.emitEvent((ReactContext) context, this.view, new OnReadyEvent());
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFrameResolutionChanged(int i, int i2, int i3) {
            int i4;
            int i5 = i3 % 180;
            if (i5 == 0) {
                i4 = i;
            } else {
                i4 = i2;
            }
            if (i5 == 0) {
                i = i2;
            }
            ReactEvents reactEvents = VideoStreamViewManager.reactEvents;
            Context context = this.view.getContext();
            C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            reactEvents.emitEvent((ReactContext) context, this.view, new OnSizeEvent(i4, i));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDVideoRenderer";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public VideoStreamTextureView createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        return new VideoStreamTextureView(reactContext, null, 2, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public DCDVideoRendererManagerDelegate<VideoStreamTextureView, VideoStreamViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VideoStreamTextureView view) {
        C9612q.m13917h(view, "view");
        setStreamId(view, (String) null);
    }

    @Override // com.facebook.react.viewmanagers.DCDVideoRendererManagerInterface
    @ReactProp(name = "mirror")
    public void setMirror(VideoStreamTextureView view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setMirror(z);
    }

    @Override // com.facebook.react.viewmanagers.DCDVideoRendererManagerInterface
    @ReactProp(name = "streamId")
    public void setStreamId(VideoStreamTextureView view, String str) {
        C9612q.m13917h(view, "view");
        if (str != null) {
            view.startRenderingStream(str, new RenderListener(view));
        } else {
            view.reset();
        }
        synchronized (this) {
            Context context = view.getContext();
            C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            Activity currentActivity = ((ReactContext) context).getCurrentActivity();
            if (currentActivity != null) {
                AttachedVideoSinks attachedVideoSinks = AttachedVideoSinks.INSTANCE;
                if (attachedVideoSinks.anySinksActive()) {
                    ScreenWakeLock.INSTANCE.requestLock(currentActivity, "DCDVideoRenderer");
                } else if (!attachedVideoSinks.anySinksActive()) {
                    ScreenWakeLock.INSTANCE.releaseLock(currentActivity, "DCDVideoRenderer");
                }
            }
            Unit unit = Unit.f25302a;
        }
    }
}