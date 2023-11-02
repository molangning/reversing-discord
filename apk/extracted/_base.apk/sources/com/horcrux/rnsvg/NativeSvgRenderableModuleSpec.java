package com.horcrux.rnsvg;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeSvgRenderableModuleSpec extends ReactContextBaseJavaModule {
    public NativeSvgRenderableModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract WritableMap getBBox(Double d, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract WritableMap getCTM(Double d);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract WritableMap getPointAtLength(Double d, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC6107a
    public abstract void getRawResource(String str, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract WritableMap getScreenCTM(Double d);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract double getTotalLength(Double d);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract boolean isPointInFill(Double d, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC6107a
    public abstract boolean isPointInStroke(Double d, ReadableMap readableMap);
}
