package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeDevToolsSettingsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "DevToolsSettingsManager";

    public NativeDevToolsSettingsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract String getConsolePatchSettings();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public String getProfilingSettings() {
        return null;
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void setConsolePatchSettings(String str);

    @ReactMethod
    @InterfaceC6107a
    public void setProfilingSettings(String str) {
    }
}
