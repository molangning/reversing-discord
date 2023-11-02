package ua;

/* renamed from: ua.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12941a {
    /* renamed from: a */
    public static float m3641a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: b */
    public static float m3640b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m3638d(m3641a(f, f2, f3, f4), m3641a(f, f2, f5, f4), m3641a(f, f2, f5, f6), m3641a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m3639c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    private static float m3638d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
