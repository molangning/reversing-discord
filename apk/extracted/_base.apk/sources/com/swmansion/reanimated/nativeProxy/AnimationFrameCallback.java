package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.swmansion.reanimated.NodesManager;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AnimationFrameCallback implements NodesManager.OnAnimationFrame {
    @InterfaceC6107a
    private final HybridData mHybridData;

    @InterfaceC6107a
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.swmansion.reanimated.NodesManager.OnAnimationFrame
    public native void onAnimationFrame(double d);
}
