package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeArray implements NativeArrayInterface {
    @InterfaceC6107a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.NativeArrayInterface
    public native String toString();
}
