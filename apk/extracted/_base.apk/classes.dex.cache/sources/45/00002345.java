package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;

@DoNotStrip
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeRunnable implements Runnable {
    private final HybridData mHybridData;

    private NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // java.lang.Runnable
    public native void run();
}