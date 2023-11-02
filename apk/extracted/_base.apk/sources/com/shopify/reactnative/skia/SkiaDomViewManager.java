package com.shopify.reactnative.skia;

import com.facebook.react.uimanager.ThemedReactContext;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SkiaDomViewManager extends SkiaBaseViewManager {
    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SkiaDomView";
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SkiaDomView createViewInstance(ThemedReactContext themedReactContext) {
        return new SkiaDomView(themedReactContext);
    }
}
