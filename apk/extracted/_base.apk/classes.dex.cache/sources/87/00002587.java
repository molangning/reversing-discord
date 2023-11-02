package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricSoLoader;
import p077e5.InterfaceC6107a;

@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class EventEmitterWrapper {
    @InterfaceC6107a
    private final HybridData mHybridData = initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    private EventEmitterWrapper() {
    }

    private static native HybridData initHybrid();

    private native void invokeEvent(String str, NativeMap nativeMap, int i);

    private native void invokeUniqueEvent(String str, NativeMap nativeMap, int i);

    private boolean isValid() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            return hybridData.isValid();
        }
        return false;
    }

    public synchronized void destroy() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
    }

    public synchronized void invoke(String str, WritableMap writableMap, int i) {
        if (!isValid()) {
            return;
        }
        invokeEvent(str, (NativeMap) writableMap, i);
    }

    public synchronized void invokeUnique(String str, WritableMap writableMap, int i) {
        if (!isValid()) {
            return;
        }
        invokeUniqueEvent(str, (NativeMap) writableMap, i);
    }
}