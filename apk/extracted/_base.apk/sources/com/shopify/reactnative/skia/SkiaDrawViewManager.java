package com.shopify.reactnative.skia;

import com.facebook.react.uimanager.ThemedReactContext;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SkiaDrawViewManager extends SkiaBaseViewManager {
    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SkiaDrawView";
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SkiaDrawView createViewInstance(ThemedReactContext themedReactContext) {
        return new SkiaDrawView(themedReactContext);
    }
}
