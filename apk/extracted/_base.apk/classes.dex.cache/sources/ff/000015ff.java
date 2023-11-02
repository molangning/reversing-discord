package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class NativeAppIconManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNAppIconManager";

    public NativeAppIconManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void getAvailableIcons(Promise promise);

    @ReactMethod
    @InterfaceC6107a
    public abstract void getCurrentIcon(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNAppIconManager";
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void setIcon(String str, Promise promise);
}