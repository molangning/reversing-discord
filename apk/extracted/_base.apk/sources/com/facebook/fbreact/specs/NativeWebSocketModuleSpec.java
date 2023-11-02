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
public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "WebSocketModule";

    public NativeWebSocketModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC6107a
    public abstract void close(double d, String str, double d2);

    @ReactMethod
    @InterfaceC6107a
    public abstract void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void ping(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void removeListeners(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void send(String str, double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void sendBinary(String str, double d);
}
