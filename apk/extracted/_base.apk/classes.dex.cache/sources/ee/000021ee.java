package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "ExceptionsManager";

    public NativeExceptionsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public void dismissRedbox() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC6107a
    public void reportException(ReadableMap readableMap) {
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void reportFatalException(String str, ReadableArray readableArray, double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void reportSoftException(String str, ReadableArray readableArray, double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void updateExceptionMessage(String str, ReadableArray readableArray, double d);
}