package com.shopify.reactnative.skia;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SkiaManager {
    @InterfaceC6107a
    private ReactContext mContext;
    @InterfaceC6107a
    private HybridData mHybridData;
    @InterfaceC6107a
    private PlatformContext mPlatformContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC6107a
    public SkiaManager(ReactContext reactContext) {
        this.mContext = reactContext;
        this.mPlatformContext = new PlatformContext(reactContext);
        this.mHybridData = initHybrid(reactContext.getJavaScriptContextHolder().get(), (CallInvokerHolderImpl) reactContext.getCatalystInstance().getJSCallInvokerHolder(), this.mPlatformContext);
        initializeRuntime();
    }

    private native HybridData initHybrid(long j, CallInvokerHolderImpl callInvokerHolderImpl, PlatformContext platformContext);

    private native void initializeRuntime();

    public void destroy() {
        this.mHybridData.resetNative();
    }

    public float getPixelDensity() {
        return this.mContext.getResources().getDisplayMetrics().density;
    }

    public PlatformContext getPlatformContext() {
        return this.mPlatformContext;
    }

    public native void invalidate();

    public void onHostPause() {
        this.mPlatformContext.onPause();
    }

    public void onHostResume() {
        this.mPlatformContext.onResume();
    }
}
