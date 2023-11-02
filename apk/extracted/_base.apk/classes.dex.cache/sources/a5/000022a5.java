package com.facebook.imagepipeline.platform;

import android.os.Build;
import androidx.core.util.Pools$SynchronizedPool;
import p437y4.C13904y;

/* renamed from: com.facebook.imagepipeline.platform.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3752h {
    /* renamed from: a */
    public static InterfaceC3751g m30919a(C13904y c13904y, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            int m1232e = c13904y.m1232e();
            return new C3750f(c13904y.m1235b(), m1232e, new Pools$SynchronizedPool(m1232e));
        }
        int m1232e2 = c13904y.m1232e();
        return new C3745a(c13904y.m1235b(), m1232e2, new Pools$SynchronizedPool(m1232e2));
    }
}