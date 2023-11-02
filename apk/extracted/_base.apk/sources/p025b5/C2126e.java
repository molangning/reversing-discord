package p025b5;

import android.graphics.Matrix;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import p380v4.C13065e;
import p394w2.C13371e;

/* renamed from: b5.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2126e {

    /* renamed from: a */
    public static final C13371e<Integer> f5989a = C13371e.m2697d(2, 7, 4, 5);

    /* renamed from: a */
    public static int m34162a(int i) {
        return Math.max(1, 8 / i);
    }

    /* renamed from: b */
    public static float m34161b(ResizeOptions resizeOptions, int i, int i2) {
        if (resizeOptions == null) {
            return 1.0f;
        }
        float f = i;
        float f2 = i2;
        float max = Math.max(resizeOptions.f10300a / f, resizeOptions.f10301b / f2);
        float f3 = resizeOptions.f10302c;
        if (f * max > f3) {
            max = f3 / f;
        }
        if (f2 * max > f3) {
            return f3 / f2;
        }
        return max;
    }

    /* renamed from: c */
    private static int m34160c(C13065e c13065e) {
        int m3347I = c13065e.m3347I();
        if (m3347I != 90 && m3347I != 180 && m3347I != 270) {
            return 0;
        }
        return c13065e.m3347I();
    }

    /* renamed from: d */
    public static int m34159d(RotationOptions rotationOptions, C13065e c13065e) {
        int i;
        int m3329s = c13065e.m3329s();
        C13371e<Integer> c13371e = f5989a;
        int indexOf = c13371e.indexOf(Integer.valueOf(m3329s));
        if (indexOf >= 0) {
            if (!rotationOptions.m31183g()) {
                i = rotationOptions.m31185e();
            } else {
                i = 0;
            }
            return c13371e.get((indexOf + (i / 90)) % c13371e.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    /* renamed from: e */
    public static int m34158e(RotationOptions rotationOptions, C13065e c13065e) {
        if (!rotationOptions.m31184f()) {
            return 0;
        }
        int m34160c = m34160c(c13065e);
        if (rotationOptions.m31183g()) {
            return m34160c;
        }
        return (m34160c + rotationOptions.m31185e()) % 360;
    }

    /* renamed from: f */
    public static int m34157f(RotationOptions rotationOptions, ResizeOptions resizeOptions, C13065e c13065e, boolean z) {
        int i;
        int m3343S;
        int m3326v;
        if (!z || resizeOptions == null) {
            return 8;
        }
        int m34158e = m34158e(rotationOptions, c13065e);
        boolean z2 = false;
        if (f5989a.contains(Integer.valueOf(c13065e.m3329s()))) {
            i = m34159d(rotationOptions, c13065e);
        } else {
            i = 0;
        }
        if (m34158e == 90 || m34158e == 270 || i == 5 || i == 7) {
            z2 = true;
        }
        if (z2) {
            m3343S = c13065e.m3326v();
        } else {
            m3343S = c13065e.m3343S();
        }
        if (z2) {
            m3326v = c13065e.m3343S();
        } else {
            m3326v = c13065e.m3326v();
        }
        int m34152k = m34152k(m34161b(resizeOptions, m3343S, m3326v), resizeOptions.f10303d);
        if (m34152k > 8) {
            return 8;
        }
        if (m34152k < 1) {
            return 1;
        }
        return m34152k;
    }

    /* renamed from: g */
    public static Matrix m34156g(C13065e c13065e, RotationOptions rotationOptions) {
        if (f5989a.contains(Integer.valueOf(c13065e.m3329s()))) {
            return m34155h(m34159d(rotationOptions, c13065e));
        }
        int m34158e = m34158e(rotationOptions, c13065e);
        if (m34158e != 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate(m34158e);
            return matrix;
        }
        return null;
    }

    /* renamed from: h */
    private static Matrix m34155h(int i) {
        Matrix matrix = new Matrix();
        if (i != 2) {
            if (i != 7) {
                if (i != 4) {
                    if (i != 5) {
                        return null;
                    }
                    matrix.setRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                } else {
                    matrix.setRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                }
            } else {
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
            }
        } else {
            matrix.setScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    /* renamed from: i */
    public static boolean m34154i(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: j */
    public static boolean m34153j(int i) {
        return i >= 0 && i <= 270 && i % 90 == 0;
    }

    /* renamed from: k */
    public static int m34152k(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }
}
