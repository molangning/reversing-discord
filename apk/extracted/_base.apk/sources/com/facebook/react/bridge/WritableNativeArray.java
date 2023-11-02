package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p058d5.C5743a;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void pushNativeArray(ReadableNativeArray readableNativeArray);

    private native void pushNativeMap(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(ReadableArray readableArray) {
        boolean z;
        if (readableArray != null && !(readableArray instanceof ReadableNativeArray)) {
            z = false;
        } else {
            z = true;
        }
        C5743a.m24584b(z, "Illegal type provided");
        pushNativeArray((ReadableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushBoolean(boolean z);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushDouble(double d);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushInt(int i);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(ReadableMap readableMap) {
        boolean z;
        if (readableMap != null && !(readableMap instanceof ReadableNativeMap)) {
            z = false;
        } else {
            z = true;
        }
        C5743a.m24584b(z, "Illegal type provided");
        pushNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushNull();

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushString(String str);
}
