package com.mrousavy.camera.frameprocessor;

import com.facebook.jni.HybridData;
import com.mrousavy.camera.C5308g;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class VisionCameraScheduler {
    @InterfaceC6107a
    private final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    @InterfaceC6107a
    private void scheduleTrigger() {
        C5308g.f15086a.m25510b().m25512c().post(new Runnable() { // from class: com.mrousavy.camera.frameprocessor.c
            @Override // java.lang.Runnable
            public final void run() {
                VisionCameraScheduler.this.trigger();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void trigger();
}
