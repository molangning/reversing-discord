package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeLinkingManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "LinkingManager";

    public NativeLinkingManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC6107a
    public abstract void canOpenURL(String str, Promise promise);

    @ReactMethod
    @InterfaceC6107a
    public abstract void getInitialURL(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void openSettings(Promise promise);

    @ReactMethod
    @InterfaceC6107a
    public abstract void openURL(String str, Promise promise);

    @ReactMethod
    @InterfaceC6107a
    public abstract void removeListeners(double d);
}
