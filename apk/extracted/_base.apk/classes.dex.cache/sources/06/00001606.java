package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class NativeHeartbeatKeyProviderSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNHeartbeatKeyProvider";

    public NativeHeartbeatKeyProviderSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract String getHeartbeatInitializedTimestamp();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract String getHeartbeatRefreshedTimestamp();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract String getHeartbeatUUID();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract String getLatestHeartbeatEventTimestamp();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNHeartbeatKeyProvider";
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void setHeartbeatInitializedTimestamp(String str);

    @ReactMethod
    @InterfaceC6107a
    public abstract void setHeartbeatRefreshedTimestamp(String str);

    @ReactMethod
    @InterfaceC6107a
    public abstract void setHeartbeatUUID(String str);

    @ReactMethod
    @InterfaceC6107a
    public abstract void setLatestHeartbeatEventTimestamp(String str);
}