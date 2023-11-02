package com.discord.react_gesture_handler.passthrough_touch;

import com.discord.react_gesture_handler.passthrough_touch.events.OnTouchDownData;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.PassthroughTouchViewManagerDelegate;
import com.facebook.react.viewmanagers.PassthroughTouchViewManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@ReactModule(name = PassthroughTouchViewManager.NAME)
@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J$\u0010\r\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/react_gesture_handler/passthrough_touch/PassthroughTouchViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/react_gesture_handler/passthrough_touch/PassthroughTouchViewGroup;", "Lcom/facebook/react/viewmanagers/PassthroughTouchViewManagerInterface;", "()V", "mDelegate", "Lcom/facebook/react/viewmanagers/PassthroughTouchViewManagerDelegate;", "kotlin.jvm.PlatformType", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "Companion", "react_gesture_handler_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class PassthroughTouchViewManager extends ViewGroupManager<PassthroughTouchViewGroup> implements PassthroughTouchViewManagerInterface<PassthroughTouchViewGroup> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "PassthroughTouchView";
    private final PassthroughTouchViewManagerDelegate<PassthroughTouchViewGroup, PassthroughTouchViewManager> mDelegate = new PassthroughTouchViewManagerDelegate<>(this);
    private final ReactEvents reactEvents = new ReactEvents(C11591x.m7577a("onTouchDown", C9591f0.m13969b(OnTouchDownData.class)));

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/react_gesture_handler/passthrough_touch/PassthroughTouchViewManager$Companion;", "", "()V", "NAME", "", "react_gesture_handler_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public PassthroughTouchViewGroup createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        PassthroughTouchViewGroup passthroughTouchViewGroup = new PassthroughTouchViewGroup(reactContext);
        passthroughTouchViewGroup.setOnTouchDown(new PassthroughTouchViewManager$createViewInstance$1$1(this, reactContext, passthroughTouchViewGroup));
        return passthroughTouchViewGroup;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public PassthroughTouchViewManagerDelegate<PassthroughTouchViewGroup, PassthroughTouchViewManager> getDelegate() {
        return this.mDelegate;
    }
}
