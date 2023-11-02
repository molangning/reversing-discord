package com.facebook.yoga;

/* renamed from: com.facebook.yoga.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4339c extends AbstractC4338b {
    /* renamed from: c */
    public void m29972c() {
        long j = this.f11101a;
        if (j != 0) {
            this.f11101a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j);
        }
    }

    protected void finalize() {
        try {
            m29972c();
        } finally {
            super.finalize();
        }
    }
}