package androidx.core.graphics;

import android.graphics.Color;

/* renamed from: androidx.core.graphics.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0995a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f3344a = new ThreadLocal<>();

    /* renamed from: a */
    public static void m38187a(int i, int i2, int i3, double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d = i / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = i2 / 255.0d;
            if (d2 < 0.04045d) {
                pow2 = d2 / 12.92d;
            } else {
                pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = i3 / 255.0d;
            if (d3 < 0.04045d) {
                pow3 = d3 / 12.92d;
            } else {
                pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: b */
    public static int m38186b(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d8 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d9 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        return Color.rgb(m38179i((int) Math.round(d4 * 255.0d), 0, 255), m38179i((int) Math.round(d5 * 255.0d), 0, 255), m38179i((int) Math.round(d6 * 255.0d), 0, 255));
    }

    /* renamed from: c */
    public static int m38185c(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: d */
    public static double m38184d(int i) {
        double[] m38178j = m38178j();
        m38183e(i, m38178j);
        return m38178j[1] / 100.0d;
    }

    /* renamed from: e */
    public static void m38183e(int i, double[] dArr) {
        m38187a(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: f */
    private static int m38182f(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: g */
    public static int m38181g(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int m38182f = m38182f(alpha2, alpha);
        return Color.argb(m38182f, m38180h(Color.red(i), alpha2, Color.red(i2), alpha, m38182f), m38180h(Color.green(i), alpha2, Color.green(i2), alpha, m38182f), m38180h(Color.blue(i), alpha2, Color.blue(i2), alpha, m38182f));
    }

    /* renamed from: h */
    private static int m38180h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: i */
    private static int m38179i(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    /* renamed from: j */
    private static double[] m38178j() {
        ThreadLocal<double[]> threadLocal = f3344a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    /* renamed from: k */
    public static int m38177k(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
