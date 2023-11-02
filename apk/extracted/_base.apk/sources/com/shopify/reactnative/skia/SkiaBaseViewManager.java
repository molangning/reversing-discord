package com.shopify.reactnative.skia;

import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class SkiaBaseViewManager extends ReactViewManager {
    @ReactProp(name = "debug")
    public void setDebug(ReactViewGroup reactViewGroup, boolean z) {
        ((SkiaBaseView) reactViewGroup).setDebugMode(z);
    }

    @ReactProp(name = "mode")
    public void setMode(ReactViewGroup reactViewGroup, String str) {
        ((SkiaBaseView) reactViewGroup).setMode(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactViewGroup reactViewGroup) {
        super.onDropViewInstance((SkiaBaseViewManager) reactViewGroup);
        ((SkiaBaseView) reactViewGroup).unregisterView();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setNativeId(ReactViewGroup reactViewGroup, String str) {
        super.setNativeId((SkiaBaseViewManager) reactViewGroup, str);
        ((SkiaBaseView) reactViewGroup).registerView(Integer.parseInt(str));
    }
}
