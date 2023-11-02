package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
import p149i4.C7381a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class HermesExecutor extends JavaScriptExecutor {

    /* renamed from: a */
    private static String f10263a;

    static {
        loadLibrary();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HermesExecutor(C7381a c7381a, boolean z, String str) {
        super(initHybridDefaultConfig(z, str));
    }

    public static native boolean canLoadFile(String str);

    private static native HybridData initHybrid(boolean z, String str, long j);

    private static native HybridData initHybridDefaultConfig(boolean z, String str);

    public static void loadLibrary() {
        if (f10263a == null) {
            SoLoader.m30164r("hermes");
            SoLoader.m30164r("hermes_executor");
            f10263a = "Release";
        }
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f10263a;
    }
}
