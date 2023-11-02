package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p058d5.C5743a;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, ReadableNativeArray readableNativeArray);

    private native void putNativeMap(String str, ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.WritableMap
    public WritableMap copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(ReadableMap readableMap) {
        C5743a.m24584b(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(String str, ReadableArray readableArray) {
        boolean z;
        if (readableArray != null && !(readableArray instanceof ReadableNativeArray)) {
            z = false;
        } else {
            z = true;
        }
        C5743a.m24584b(z, "Illegal type provided");
        putNativeArray(str, (ReadableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(String str, boolean z);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(String str, double d);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(String str, int i);

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(String str, ReadableMap readableMap) {
        boolean z;
        if (readableMap != null && !(readableMap instanceof ReadableNativeMap)) {
            z = false;
        } else {
            z = true;
        }
        C5743a.m24584b(z, "Illegal type provided");
        putNativeMap(str, (ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(String str);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(String str, String str2);
}