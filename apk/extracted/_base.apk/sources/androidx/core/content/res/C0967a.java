package androidx.core.content.res;

import androidx.core.graphics.C0995a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.res.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0967a {

    /* renamed from: a */
    private final float f3283a;

    /* renamed from: b */
    private final float f3284b;

    /* renamed from: c */
    private final float f3285c;

    /* renamed from: d */
    private final float f3286d;

    /* renamed from: e */
    private final float f3287e;

    /* renamed from: f */
    private final float f3288f;

    /* renamed from: g */
    private final float f3289g;

    /* renamed from: h */
    private final float f3290h;

    /* renamed from: i */
    private final float f3291i;

    C0967a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f3283a = f;
        this.f3284b = f2;
        this.f3285c = f3;
        this.f3286d = f4;
        this.f3287e = f5;
        this.f3288f = f6;
        this.f3289g = f7;
        this.f3290h = f8;
        this.f3291i = f9;
    }

    /* renamed from: b */
    private static C0967a m38316b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        C0967a c0967a = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int m38302p = m38313e(f8, f2, f).m38302p();
            float m38300b = C0968b.m38300b(m38302p);
            float abs = Math.abs(f3 - m38300b);
            if (abs < 0.2f) {
                C0967a m38315c = m38315c(m38302p);
                float m38317a = m38315c.m38317a(m38313e(m38315c.m38307k(), m38315c.m38309i(), f));
                if (m38317a <= 1.0f) {
                    c0967a = m38315c;
                    f5 = abs;
                    f7 = m38317a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            } else if (m38300b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return c0967a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C0967a m38315c(int i) {
        return m38314d(i, C0993m.f3328k);
    }

    /* renamed from: d */
    static C0967a m38314d(int i, C0993m c0993m) {
        float f;
        float pow;
        float[] m38296f = C0968b.m38296f(i);
        float[][] fArr = C0968b.f3292a;
        float f2 = m38296f[0];
        float[] fArr2 = fArr[0];
        float f3 = m38296f[1];
        float f4 = m38296f[2];
        float f5 = (fArr2[0] * f2) + (fArr2[1] * f3) + (fArr2[2] * f4);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[0] * f2) + (fArr3[1] * f3) + (fArr3[2] * f4);
        float[] fArr4 = fArr[2];
        float f7 = (f2 * fArr4[0]) + (f3 * fArr4[1]) + (f4 * fArr4[2]);
        float f8 = c0993m.m38196i()[0] * f5;
        float f9 = c0993m.m38196i()[1] * f6;
        float f10 = c0993m.m38196i()[2] * f7;
        float pow2 = (float) Math.pow((c0993m.m38202c() * Math.abs(f8)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((c0993m.m38202c() * Math.abs(f9)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((c0993m.m38202c() * Math.abs(f10)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f11 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f12 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = (((signum * 20.0f) + f13) + (21.0f * signum3)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = atan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float pow5 = ((float) Math.pow((f15 * c0993m.m38199f()) / c0993m.m38204a(), c0993m.m38203b() * c0993m.m38195j())) * 100.0f;
        float m38201d = c0993m.m38201d() * (4.0f / c0993m.m38203b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (c0993m.m38204a() + 4.0f);
        if (f16 < 20.14d) {
            f = 360.0f + f16;
        } else {
            f = f16;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0993m.m38200e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0993m.m38198g()) * c0993m.m38197h()) * ((float) Math.sqrt((f11 * f11) + (f12 * f12)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float m38201d2 = pow6 * c0993m.m38201d();
        float sqrt = ((float) Math.sqrt((pow * c0993m.m38203b()) / (c0993m.m38204a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * m38201d2) + 1.0f)) * 43.85965f;
        double d2 = f17;
        return new C0967a(f16, pow6, pow5, m38201d, m38201d2, sqrt, f18, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: e */
    private static C0967a m38313e(float f, float f2, float f3) {
        return m38312f(f, f2, f3, C0993m.f3328k);
    }

    /* renamed from: f */
    private static C0967a m38312f(float f, float f2, float f3, C0993m c0993m) {
        double d;
        float m38203b = (4.0f / c0993m.m38203b()) * ((float) Math.sqrt(f / 100.0d)) * (c0993m.m38204a() + 4.0f) * c0993m.m38201d();
        float m38201d = f2 * c0993m.m38201d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * c0993m.m38203b()) / (c0993m.m38204a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((m38201d * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C0967a(f3, f2, f, m38203b, m38201d, sqrt, f4, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m38305m(float f, float f2, float f3) {
        return m38304n(f, f2, f3, C0993m.f3328k);
    }

    /* renamed from: n */
    static int m38304n(float f, float f2, float f3, C0993m c0993m) {
        float min;
        if (f2 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
            if (f < 0.0f) {
                min = 0.0f;
            } else {
                min = Math.min(360.0f, f);
            }
            C0967a c0967a = null;
            boolean z = true;
            float f4 = 0.0f;
            float f5 = f2;
            while (Math.abs(f4 - f2) >= 0.4f) {
                C0967a m38316b = m38316b(min, f5, f3);
                if (z) {
                    if (m38316b != null) {
                        return m38316b.m38303o(c0993m);
                    }
                    f5 = ((f2 - f4) / 2.0f) + f4;
                    z = false;
                } else {
                    if (m38316b == null) {
                        f2 = f5;
                    } else {
                        f4 = f5;
                        c0967a = m38316b;
                    }
                    f5 = ((f2 - f4) / 2.0f) + f4;
                }
            }
            if (c0967a == null) {
                return C0968b.m38301a(f3);
            }
            return c0967a.m38303o(c0993m);
        }
        return C0968b.m38301a(f3);
    }

    /* renamed from: a */
    float m38317a(C0967a c0967a) {
        float m38306l = m38306l() - c0967a.m38306l();
        float m38311g = m38311g() - c0967a.m38311g();
        float m38310h = m38310h() - c0967a.m38310h();
        return (float) (Math.pow(Math.sqrt((m38306l * m38306l) + (m38311g * m38311g) + (m38310h * m38310h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    float m38311g() {
        return this.f3290h;
    }

    /* renamed from: h */
    float m38310h() {
        return this.f3291i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m38309i() {
        return this.f3284b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m38308j() {
        return this.f3283a;
    }

    /* renamed from: k */
    float m38307k() {
        return this.f3285c;
    }

    /* renamed from: l */
    float m38306l() {
        return this.f3289g;
    }

    /* renamed from: o */
    int m38303o(C0993m c0993m) {
        float f;
        float f2;
        if (m38309i() != 0.0d && m38307k() != 0.0d) {
            f = m38309i() / ((float) Math.sqrt(m38307k() / 100.0d));
        } else {
            f = 0.0f;
        }
        float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, c0993m.m38200e()), 0.73d), 1.1111111111111112d);
        double m38308j = (m38308j() * 3.1415927f) / 180.0f;
        float m38204a = c0993m.m38204a() * ((float) Math.pow(m38307k() / 100.0d, (1.0d / c0993m.m38203b()) / c0993m.m38195j()));
        float cos = ((float) (Math.cos(2.0d + m38308j) + 3.8d)) * 0.25f * 3846.1538f * c0993m.m38198g() * c0993m.m38197h();
        float m38199f = m38204a / c0993m.m38199f();
        float sin = (float) Math.sin(m38308j);
        float cos2 = (float) Math.cos(m38308j);
        float f3 = (((0.305f + m38199f) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = m38199f * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / c0993m.m38202c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / c0993m.m38202c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / c0993m.m38202c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f2) * 27.13d) / (400.0d - Math.abs(f2))), 2.380952380952381d));
        float f9 = signum / c0993m.m38196i()[0];
        float f10 = signum2 / c0993m.m38196i()[1];
        float f11 = signum3 / c0993m.m38196i()[2];
        float[][] fArr = C0968b.f3293b;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return C0995a.m38186b(f12, (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11), (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    /* renamed from: p */
    int m38302p() {
        return m38303o(C0993m.f3328k);
    }
}
