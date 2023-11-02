package com.discord.react_gesture_handler;

import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootView;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, m14357d2 = {"Lcom/discord/react_gesture_handler/DiscordGestureHandlerRootViewManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootViewManager;", "()V", "canOverrideExistingModule", "", "createViewInstance", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "react_gesture_handler_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class DiscordGestureHandlerRootViewManager extends RNGestureHandlerRootViewManager {
    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager, com.facebook.react.uimanager.ViewManager
    public RNGestureHandlerRootView createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        return new DiscordGestureHandlerEnabledRootView(reactContext);
    }
}