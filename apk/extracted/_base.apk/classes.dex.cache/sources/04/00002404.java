package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CxxModuleWrapperBase implements NativeModule {
    @InterfaceC6107a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public CxxModuleWrapperBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public native String getName();

    @Override // com.facebook.react.bridge.NativeModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.mHybridData.resetNative();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
    }

    protected void resetModule(HybridData hybridData) {
        HybridData hybridData2 = this.mHybridData;
        if (hybridData != hybridData2) {
            hybridData2.resetNative();
            this.mHybridData = hybridData;
        }
    }
}