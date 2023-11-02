package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "BlobModule";

    public NativeBlobModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void addNetworkingHandler();

    @ReactMethod
    @InterfaceC6107a
    public abstract void addWebSocketHandler(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void createFromParts(ReadableArray readableArray, String str);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @InterfaceC6107a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @InterfaceC6107a
    public abstract void release(String str);

    @ReactMethod
    @InterfaceC6107a
    public abstract void removeWebSocketHandler(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void sendOverSocket(ReadableMap readableMap, double d);
}
