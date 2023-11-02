package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p394w2.C13379j;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeBlurFilter {
    static {
        C3739e.m30943a();
    }

    /* renamed from: a */
    public static void m30954a(Bitmap bitmap, int i, int i2) {
        boolean z;
        C13379j.m2677g(bitmap);
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        if (i2 <= 0) {
            z2 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z2));
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @InterfaceC13370d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}