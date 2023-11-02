package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ComponentFactory {
    @InterfaceC6107a
    private final HybridData mHybridData = initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    @InterfaceC6107a
    private static native HybridData initHybrid();
}
