package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SensorSetter {
    @InterfaceC6107a
    private final HybridData mHybridData;

    @InterfaceC6107a
    private SensorSetter(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void sensorSetter(float[] fArr, int i);
}
