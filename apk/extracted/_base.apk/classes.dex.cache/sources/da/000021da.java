package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "AccessibilityInfo";

    public NativeAccessibilityInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void announceForAccessibility(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC6107a
    public void getRecommendedTimeoutMillis(double d, Callback callback) {
    }

    @ReactMethod
    @InterfaceC6107a
    public void isAccessibilityServiceEnabled(Callback callback) {
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void isReduceMotionEnabled(Callback callback);

    @ReactMethod
    @InterfaceC6107a
    public abstract void isTouchExplorationEnabled(Callback callback);

    @ReactMethod
    @InterfaceC6107a
    public abstract void setAccessibilityFocus(double d);
}