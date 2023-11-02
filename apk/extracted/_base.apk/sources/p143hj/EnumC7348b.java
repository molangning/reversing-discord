package p143hj;

import net.time4j.C10582a0;
import p288pj.C11648d;
import p288pj.EnumC11651f;

/* renamed from: hj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC7348b {
    VERNAL_EQUINOX,
    SUMMER_SOLSTICE,
    AUTUMNAL_EQUINOX,
    WINTER_SOLSTICE;
    

    /* renamed from: n */
    private static final int[] f19797n = {485, 203, 199, 182, 156, 136, 77, 74, 70, 58, 52, 50, 45, 44, 29, 18, 17, 16, 14, 12, 12, 12, 9, 8};

    /* renamed from: o */
    private static final double[] f19798o = {324.96d, 337.23d, 342.08d, 27.85d, 73.14d, 171.52d, 222.54d, 296.72d, 243.58d, 119.81d, 297.17d, 21.02d, 247.54d, 325.15d, 60.93d, 155.12d, 288.79d, 198.04d, 199.76d, 95.39d, 287.11d, 320.81d, 227.73d, 15.45d};

    /* renamed from: p */
    private static final double[] f19799p = {1934.136d, 32964.467d, 20.186d, 445267.112d, 45036.886d, 22518.443d, 65928.934d, 3034.906d, 9037.513d, 33718.147d, 150.678d, 2281.226d, 29929.562d, 31555.956d, 4443.417d, 67555.328d, 4562.452d, 62894.029d, 31436.921d, 14577.848d, 31931.756d, 34777.259d, 1222.114d, 16859.074d};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hj.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C7349a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19801a;

        static {
            int[] iArr = new int[EnumC7348b.values().length];
            f19801a = iArr;
            try {
                iArr[EnumC7348b.VERNAL_EQUINOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19801a[EnumC7348b.SUMMER_SOLSTICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19801a[EnumC7348b.AUTUMNAL_EQUINOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19801a[EnumC7348b.WINTER_SOLSTICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    private static void m20896a(int i) {
        if (i < -2000 || i > 3000) {
            throw new IllegalArgumentException("Year out of supported range: -2000 <= " + i + " <= +3000");
        }
    }

    /* renamed from: b */
    private static double m20895b(double d) {
        return Math.cos((d * 3.141592653589793d) / 180.0d);
    }

    /* renamed from: d */
    private double m20893d(int i) {
        double m20892e = m20892e(i);
        double d = (m20892e - 2451545.0d) / 36525.0d;
        double d2 = (35999.373d * d) - 2.47d;
        return m20892e + ((m20891f(d) * 1.0E-5d) / (((m20895b(d2) * 0.0334d) + 1.0d) + (m20895b(d2 * 2.0d) * 7.0E-4d)));
    }

    /* renamed from: e */
    private double m20892e(int i) {
        double d;
        double d2;
        double d3;
        double d4;
        if (i < 1000) {
            double d5 = i / 1000.0d;
            int i2 = C7349a.f19801a[ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            d = ((((((-0.00933d) - (6.0E-5d * d5)) * d5) - 0.00769d) * d5) + 365242.88257d) * d5;
                            d2 = 1721414.39987d;
                        } else {
                            throw new AssertionError(this);
                        }
                    } else {
                        d3 = ((((((7.4E-4d * d5) - 0.00297d) * d5) - 0.11677d) * d5) + 365242.49558d) * d5;
                        d4 = 1721325.70455d;
                    }
                } else {
                    d3 = ((((((2.5E-4d * d5) + 0.00907d) * d5) - 0.05323d) * d5) + 365241.72562d) * d5;
                    d4 = 1721233.25401d;
                }
                return d3 + d4;
            }
            d = (((((0.00111d - (7.1E-4d * d5)) * d5) + 0.06134d) * d5) + 365242.1374d) * d5;
            d2 = 1721139.29189d;
            return d + d2;
        }
        double d6 = (i - 2000) / 1000.0d;
        int i3 = C7349a.f19801a[ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        d3 = ((((((3.2E-4d * d6) - 0.00823d) * d6) - 0.06223d) * d6) + 365242.74049d) * d6;
                        d4 = 2451900.05952d;
                    } else {
                        throw new AssertionError(this);
                    }
                } else {
                    d3 = ((((((7.8E-4d * d6) + 0.00337d) * d6) - 0.11575d) * d6) + 365242.01767d) * d6;
                    d4 = 2451810.21715d;
                }
                return d3 + d4;
            }
            d = (((((0.00888d - (3.0E-4d * d6)) * d6) + 0.00325d) * d6) + 365241.62603d) * d6;
            d2 = 2451716.56767d;
        } else {
            d = ((((((-0.00411d) - (5.7E-4d * d6)) * d6) + 0.05169d) * d6) + 365242.37404d) * d6;
            d2 = 2451623.80984d;
        }
        return d + d2;
    }

    /* renamed from: f */
    private static double m20891f(double d) {
        double d2 = 0.0d;
        for (int i = 0; i < 24; i++) {
            d2 += f19797n[i] * m20895b(f19798o[i] + (f19799p[i] * d));
        }
        return d2;
    }

    /* renamed from: c */
    public C10582a0 m20894c(int i) {
        double m7351b;
        EnumC11651f enumC11651f;
        m20896a(i);
        double m20893d = (m20893d(i) - 2441317.5d) * 86400.0d;
        boolean m7373C = C11648d.m7361w().m7373C();
        if (m7373C && i >= 1972) {
            m7351b = m20893d - 42.184d;
            enumC11651f = EnumC11651f.UTC;
        } else {
            m7351b = m20893d - EnumC11651f.m7351b(i, (ordinal() + 1) * 3);
            enumC11651f = EnumC11651f.UT;
        }
        long floor = (long) Math.floor(m7351b);
        int i2 = (int) ((m7351b - floor) * 1.0E9d);
        if (!m7373C) {
            floor += 63072000;
            enumC11651f = EnumC11651f.POSIX;
        }
        return C10582a0.m11146p0(floor, i2, enumC11651f);
    }
}
