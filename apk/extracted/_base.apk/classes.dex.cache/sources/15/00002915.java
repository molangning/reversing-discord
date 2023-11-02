package com.facebook.yoga;

/* renamed from: com.facebook.yoga.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4345i extends YogaNodeJNIBase {
    public C4345i(YogaConfig yogaConfig) {
        super(yogaConfig);
    }

    protected void finalize() {
        try {
            m29964s0();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: s0 */
    public void m29964s0() {
        long j = this.f11070n;
        if (j != 0) {
            this.f11070n = 0L;
            YogaNative.jni_YGNodeFreeJNI(j);
        }
    }
}