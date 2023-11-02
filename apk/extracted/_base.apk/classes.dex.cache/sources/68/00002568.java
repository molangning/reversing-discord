package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CoreComponentsRegistry {
    @InterfaceC6107a
    private final HybridData mHybridData;

    static {
        FabricSoLoader.staticInit();
    }

    @InterfaceC6107a
    private CoreComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @InterfaceC6107a
    private native HybridData initHybrid(ComponentFactory componentFactory);

    @InterfaceC6107a
    public static CoreComponentsRegistry register(ComponentFactory componentFactory) {
        return new CoreComponentsRegistry(componentFactory);
    }
}