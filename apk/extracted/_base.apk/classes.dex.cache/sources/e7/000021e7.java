package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "DevMenu";

    public NativeDevMenuSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void debugRemotely(boolean z);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void reload();

    @ReactMethod
    @InterfaceC6107a
    public abstract void setHotLoadingEnabled(boolean z);

    @ReactMethod
    @InterfaceC6107a
    public abstract void setProfilingEnabled(boolean z);

    @ReactMethod
    @InterfaceC6107a
    public abstract void show();
}