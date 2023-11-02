package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeImageLoaderAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "ImageLoader";

    public NativeImageLoaderAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void abortRequest(double d);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void getSize(String str, Promise promise);

    @ReactMethod
    @InterfaceC6107a
    public abstract void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC6107a
    public abstract void prefetchImage(String str, double d, Promise promise);

    @ReactMethod
    @InterfaceC6107a
    public abstract void queryCache(ReadableArray readableArray, Promise promise);
}
