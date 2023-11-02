package p025b5;

import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import p170j4.C8792b;
import p380v4.C13065e;
import p394w2.C13379j;
import p414x2.C13677a;

/* renamed from: b5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2122a {
    /* renamed from: a */
    public static float m34169a(RotationOptions rotationOptions, ResizeOptions resizeOptions, C13065e c13065e) {
        boolean z;
        int m3343S;
        int m3326v;
        C13379j.m2682b(Boolean.valueOf(C13065e.m3338b0(c13065e)));
        if (resizeOptions != null && resizeOptions.f10301b > 0 && resizeOptions.f10300a > 0 && c13065e.m3343S() != 0 && c13065e.m3326v() != 0) {
            int m34166d = m34166d(rotationOptions, c13065e);
            if (m34166d != 90 && m34166d != 270) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                m3343S = c13065e.m3326v();
            } else {
                m3343S = c13065e.m3343S();
            }
            if (z) {
                m3326v = c13065e.m3343S();
            } else {
                m3326v = c13065e.m3326v();
            }
            float f = resizeOptions.f10300a / m3343S;
            float f2 = resizeOptions.f10301b / m3326v;
            float max = Math.max(f, f2);
            C13677a.m1875C("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(resizeOptions.f10300a), Integer.valueOf(resizeOptions.f10301b), Integer.valueOf(m3343S), Integer.valueOf(m3326v), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max));
            return max;
        }
        return 1.0f;
    }

    /* renamed from: b */
    public static int m34168b(RotationOptions rotationOptions, ResizeOptions resizeOptions, C13065e c13065e, int i) {
        int m34165e;
        float f;
        if (!C13065e.m3338b0(c13065e)) {
            return 1;
        }
        float m34169a = m34169a(rotationOptions, resizeOptions, c13065e);
        if (c13065e.m3358A() == C8792b.f23081a) {
            m34165e = m34164f(m34169a);
        } else {
            m34165e = m34165e(m34169a);
        }
        int max = Math.max(c13065e.m3326v(), c13065e.m3343S());
        if (resizeOptions != null) {
            f = resizeOptions.f10302c;
        } else {
            f = i;
        }
        while (max / m34165e > f) {
            if (c13065e.m3358A() == C8792b.f23081a) {
                m34165e *= 2;
            } else {
                m34165e++;
            }
        }
        return m34165e;
    }

    /* renamed from: c */
    public static int m34167c(C13065e c13065e, int i, int i2) {
        int m3345Q = c13065e.m3345Q();
        while ((((c13065e.m3343S() * c13065e.m3326v()) * i) / m3345Q) / m3345Q > i2) {
            m3345Q *= 2;
        }
        return m3345Q;
    }

    /* renamed from: d */
    private static int m34166d(RotationOptions rotationOptions, C13065e c13065e) {
        boolean z = false;
        if (!rotationOptions.m31183g()) {
            return 0;
        }
        int m3347I = c13065e.m3347I();
        C13379j.m2682b(Boolean.valueOf((m3347I == 0 || m3347I == 90 || m3347I == 180 || m3347I == 270) ? true : true));
        return m3347I;
    }

    /* renamed from: e */
    public static int m34165e(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = i;
            if ((1.0d / d) + ((1.0d / (Math.pow(d, 2.0d) - d)) * 0.3333333432674408d) <= f) {
                return i - 1;
            }
            i++;
        }
    }

    /* renamed from: f */
    public static int m34164f(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = 1.0d / i2;
            if (d + (0.3333333432674408d * d) <= f) {
                return i;
            }
            i = i2;
        }
    }
}
