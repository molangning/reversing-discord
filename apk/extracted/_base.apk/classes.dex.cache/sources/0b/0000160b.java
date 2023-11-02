package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class NativeTimersSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "TimersModule";

    public NativeTimersSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void clearInterval(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void clearTimeout(double d);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "TimersModule";
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void setInterval(double d, double d2);

    @ReactMethod
    @InterfaceC6107a
    public abstract void setTimeout(double d, double d2);
}