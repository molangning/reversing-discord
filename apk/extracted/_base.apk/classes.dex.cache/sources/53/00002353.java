package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import javax.inject.Provider;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class EagerModuleProvider implements Provider<NativeModule> {
    private final NativeModule mModule;

    public EagerModuleProvider(NativeModule nativeModule) {
        this.mModule = nativeModule;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return this.mModule;
    }
}