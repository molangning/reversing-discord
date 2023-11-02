package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import p129h5.C7018a;

@DoNotStrip
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ThreadScopeSupport {
    static {
        C7018a.m21531d("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
