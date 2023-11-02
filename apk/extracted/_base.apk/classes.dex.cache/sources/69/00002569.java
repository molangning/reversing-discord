package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CppComponentRegistry {
    private final HybridData mHybridData;

    static {
        FabricSoLoader.staticInit();
    }

    private CppComponentRegistry(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private static native HybridData initHybrid();
}