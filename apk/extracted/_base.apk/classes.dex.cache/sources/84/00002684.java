package com.facebook.react.uimanager;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.soloader.SoLoader;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ComponentNameResolverManager {
    @InterfaceC6107a
    private final HybridData mHybridData;

    static {
        staticInit();
    }

    public ComponentNameResolverManager(RuntimeExecutor runtimeExecutor, Object obj) {
        this.mHybridData = initHybrid(runtimeExecutor, obj);
        installJSIBindings();
    }

    private native HybridData initHybrid(RuntimeExecutor runtimeExecutor, Object obj);

    private native void installJSIBindings();

    private static void staticInit() {
        SoLoader.m30164r("uimanagerjni");
    }
}