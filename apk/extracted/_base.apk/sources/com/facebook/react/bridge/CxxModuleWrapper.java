package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        SoLoader.m30164r(str);
        return makeDsoNative(SoLoader.m30156z(str).getAbsolutePath(), str2);
    }

    private static native CxxModuleWrapper makeDsoNative(String str, String str2);
}
