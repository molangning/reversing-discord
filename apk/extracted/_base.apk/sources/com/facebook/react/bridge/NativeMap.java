package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeMap {
    @InterfaceC6107a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native String toString();
}
