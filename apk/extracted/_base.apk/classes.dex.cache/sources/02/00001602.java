package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class NativeDeviceLocaleManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNDeviceLocaleManager";

    public NativeDeviceLocaleManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @InterfaceC6107a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNDeviceLocaleManager";
    }

    protected abstract Map<String, Object> getTypedExportedConstants();
}