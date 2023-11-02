package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0623c extends Drawable {

    /* renamed from: a */
    private static final double f2107a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m39535a(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - f2107a) * f2)) : f;
    }

    /* renamed from: b */
    public static float m39534b(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - f2107a) * f2)) : f * 1.5f;
    }
}