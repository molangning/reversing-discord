package p291q1;

/* renamed from: q1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11672d {
    /* renamed from: a */
    private static float m7243a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: b */
    private static float m7242b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: c */
    public static int m7241c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float m7243a = m7243a(((i >> 16) & 255) / 255.0f);
        float m7243a2 = m7243a(((i >> 8) & 255) / 255.0f);
        float m7243a3 = m7243a((i & 255) / 255.0f);
        float m7243a4 = m7243a(((i2 >> 16) & 255) / 255.0f);
        float m7243a5 = m7243a(((i2 >> 8) & 255) / 255.0f);
        float m7243a6 = m7243a3 + (f * (m7243a((i2 & 255) / 255.0f) - m7243a3));
        return (Math.round(m7242b(m7243a + ((m7243a4 - m7243a) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m7242b(m7243a2 + ((m7243a5 - m7243a2) * f)) * 255.0f) << 8) | Math.round(m7242b(m7243a6) * 255.0f);
    }
}