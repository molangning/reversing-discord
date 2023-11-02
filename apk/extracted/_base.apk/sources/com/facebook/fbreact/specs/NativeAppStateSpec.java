package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeAppStateSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "AppState";

    public NativeAppStateSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void addListener(String str);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @InterfaceC6107a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void getCurrentAppState(Callback callback, Callback callback2);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @InterfaceC6107a
    public abstract void removeListeners(double d);
}
