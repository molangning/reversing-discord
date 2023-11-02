package com.shopify.reactnative.skia;

import com.facebook.react.uimanager.ThemedReactContext;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SkiaPictureViewManager extends SkiaBaseViewManager {
    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SkiaPictureView";
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SkiaPictureView createViewInstance(ThemedReactContext themedReactContext) {
        return new SkiaPictureView(themedReactContext);
    }
}