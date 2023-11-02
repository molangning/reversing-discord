package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import p380v4.C13065e;

/* renamed from: com.facebook.imagepipeline.producers.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C3760a1 {
    /* renamed from: a */
    public static int m30895a(int i) {
        return (int) (i * 1.3333334f);
    }

    /* renamed from: b */
    public static boolean m30894b(int i, int i2, ResizeOptions resizeOptions) {
        if (resizeOptions == null) {
            if (m30895a(i) >= 2048.0f && m30895a(i2) >= 2048) {
                return true;
            }
            return false;
        } else if (m30895a(i) >= resizeOptions.f10300a && m30895a(i2) >= resizeOptions.f10301b) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m30893c(C13065e c13065e, ResizeOptions resizeOptions) {
        if (c13065e == null) {
            return false;
        }
        int m3347I = c13065e.m3347I();
        if (m3347I != 90 && m3347I != 270) {
            return m30894b(c13065e.m3343S(), c13065e.m3326v(), resizeOptions);
        }
        return m30894b(c13065e.m3326v(), c13065e.m3343S(), resizeOptions);
    }
}