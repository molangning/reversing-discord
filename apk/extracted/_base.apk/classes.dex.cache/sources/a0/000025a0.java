package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class JSCExecutor extends JavaScriptExecutor {
    static {
        loadLibrary();
    }

    public JSCExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }

    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    public static void loadLibrary() {
        SoLoader.m30164r("jscexecutor");
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "JSCExecutor";
    }
}