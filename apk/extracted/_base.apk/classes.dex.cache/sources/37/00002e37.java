package com.mrousavy.camera.frameprocessor;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class FrameProcessor {
    @InterfaceC6107a
    @Keep
    private final HybridData mHybridData;

    public native void call(Frame frame);
}