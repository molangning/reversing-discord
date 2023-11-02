package p143hj;

import net.time4j.C10711g0;
import net.time4j.C10722h0;
import net.time4j.p249tz.C10835p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: hj.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class EnumC7353e {

    /* renamed from: j */
    public static final EnumC7353e f19822j;

    /* renamed from: k */
    public static final EnumC7353e f19823k;

    /* renamed from: l */
    public static final EnumC7353e f19824l;

    /* renamed from: m */
    public static final EnumC7353e f19825m;

    /* renamed from: n */
    private static final int[] f19826n;

    /* renamed from: o */
    private static final double[] f19827o;

    /* renamed from: p */
    private static final double[] f19828p;

    /* renamed from: q */
    private static final double[][] f19829q;

    /* renamed from: r */
    private static final /* synthetic */ EnumC7353e[] f19830r;

    /* renamed from: hj.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    enum C7354a extends EnumC7353e {
        C7354a(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: l */
        private double m20867l(double d) {
            C10722h0 m11138x0 = C7350c.m20885f(d).m20883h().m11138x0(C10835p.f28295t);
            return m11138x0.m10496Z().m10719G0() + (((Integer) m11138x0.m10493b0().mo10212i(C10711g0.f27940I)).intValue() / 86400.0d);
        }

        /* renamed from: m */
        private double m20866m(double d) {
            double d2 = (d * 0.9856d) - 3.289d;
            return C7347a.m20897b((Math.sin(Math.toRadians(d2)) * 1.916d) + d2 + (Math.sin(Math.toRadians(d2) * 2.0d) * 0.02d) + 282.634d);
        }

        @Override // p143hj.EnumC7353e
        /* renamed from: e */
        public double mo20855e(double d) {
            return Math.toDegrees(Math.asin(Math.sin(Math.toRadians(m20866m(m20867l(d)))) * 0.39782d));
        }

        @Override // p143hj.EnumC7353e
        /* renamed from: i */
        public double mo20853i(double d) {
            double m20866m = m20866m(m20867l(d));
            double m20897b = C7347a.m20897b(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(m20866m)) * 0.91764d)));
            return (m20897b + (Math.floor(m20866m / 90.0d) * 90.0d)) - (Math.floor(m20897b / 90.0d) * 90.0d);
        }
    }

    static {
        C7354a c7354a = new C7354a("SIMPLE", 0);
        f19822j = c7354a;
        EnumC7353e enumC7353e = new EnumC7353e("NOAA", 1) { // from class: hj.e.b
            /* renamed from: l */
            private double m20865l(double d) {
                return Math.asin(Math.sin(Math.toRadians(m20861p(d))) * Math.sin(Math.toRadians(m20860q(d))));
            }

            /* renamed from: m */
            private double m20864m(double d) {
                double radians = Math.toRadians(m20863n(d));
                return (Math.sin(radians) * (1.914602d - (((1.4E-5d * d) + 0.004817d) * d))) + (Math.sin(2.0d * radians) * (0.019993d - (d * 1.01E-4d))) + (Math.sin(radians * 3.0d) * 2.89E-4d);
            }

            /* renamed from: n */
            private double m20863n(double d) {
                return ((35999.05029d - (1.537E-4d * d)) * d) + 357.52911d;
            }

            /* renamed from: o */
            private double m20862o(double d) {
                return ((((3.032E-4d * d) + 36000.76983d) * d) + 280.46646d) % 360.0d;
            }

            /* renamed from: p */
            private double m20861p(double d) {
                return (((((((0.001813d * d) - 5.9E-4d) * d) - 46.815d) * d) + 21.448d) / 3600.0d) + 23.433333333333334d + (Math.cos(Math.toRadians(125.04d - (d * 1934.136d))) * 0.00256d);
            }

            /* renamed from: q */
            private double m20860q(double d) {
                return ((m20862o(d) + m20864m(d)) - 0.00569d) - (Math.sin(Math.toRadians(125.04d - (d * 1934.136d))) * 0.00478d);
            }

            @Override // p143hj.EnumC7353e
            /* renamed from: e */
            public double mo20855e(double d) {
                return Math.toDegrees(m20865l(EnumC7353e.m20868k(d)));
            }

            @Override // p143hj.EnumC7353e
            /* renamed from: i */
            public double mo20853i(double d) {
                double m20868k = EnumC7353e.m20868k(d);
                double radians = Math.toRadians(m20860q(m20868k));
                return C7347a.m20897b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(m20861p(m20868k))) * Math.sin(radians), Math.cos(radians))));
            }
        };
        f19823k = enumC7353e;
        EnumC7353e enumC7353e2 = new EnumC7353e("CC", 2) { // from class: hj.e.c
            /* renamed from: l */
            private double m20859l(double d) {
                return Math.asin(Math.sin(Math.toRadians(m20856o(d))) * Math.sin(Math.toRadians(EnumC7353e.m20871d(d, m20857n(d)))));
            }

            /* renamed from: m */
            private double m20858m(double d) {
                return (((((4.8E-7d * d) - 1.559E-4d) * d) + 35999.0503d) * d) + 357.5291d;
            }

            /* renamed from: n */
            private double m20857n(double d) {
                return (Math.sin(Math.toRadians((((0.002063d * d) - 1934.134d) * d) + 124.9d)) * (-0.004778d)) - (Math.sin(Math.toRadians((((5.7E-4d * d) + 72001.5377d) * d) + 201.11d)) * 3.667E-4d);
            }

            /* renamed from: o */
            private double m20856o(double d) {
                return (((((((0.001813d * d) - 5.9E-4d) * d) - 46.815d) * d) + 21.448d) / 3600.0d) + 23.433333333333334d;
            }

            @Override // p143hj.EnumC7353e
            /* renamed from: e */
            public double mo20855e(double d) {
                return mo20854f(d, "declination");
            }

            @Override // p143hj.EnumC7353e
            /* renamed from: f */
            public double mo20854f(double d, String str) {
                double m20868k = EnumC7353e.m20868k(d);
                if (str.equals("declination")) {
                    return Math.toDegrees(m20859l(m20868k));
                }
                if (str.equals("right-ascension")) {
                    double radians = Math.toRadians(EnumC7353e.m20871d(m20868k, m20857n(m20868k)));
                    return C7347a.m20897b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(m20856o(m20868k))) * Math.sin(radians), Math.cos(radians))));
                } else if (str.equals("nutation")) {
                    return m20857n(m20868k);
                } else {
                    if (str.equals("obliquity")) {
                        return m20856o(m20868k);
                    }
                    if (str.equals("mean-anomaly")) {
                        return m20858m(m20868k);
                    }
                    if (str.equals("solar-longitude")) {
                        return EnumC7353e.m20871d(m20868k, m20857n(m20868k));
                    }
                    if (str.equals("solar-latitude")) {
                        return 0.0d;
                    }
                    return Double.NaN;
                }
            }

            @Override // p143hj.EnumC7353e
            /* renamed from: i */
            public double mo20853i(double d) {
                return mo20854f(d, "right-ascension");
            }
        };
        f19824l = enumC7353e2;
        EnumC7353e enumC7353e3 = new EnumC7353e("TIME4J", 3) { // from class: hj.e.d
            /* renamed from: l */
            private double m20852l(double d) {
                double[] dArr = new double[2];
                EnumC7353e.m20869h(d, dArr);
                return Math.asin(Math.sin(Math.toRadians(EnumC7353e.m20870g(d) + dArr[1])) * Math.sin(Math.toRadians(EnumC7353e.m20871d(d, dArr[0]))));
            }

            /* renamed from: m */
            private double m20851m(double d) {
                return ((35999.05029d - (1.537E-4d * d)) * d) + 357.52911d;
            }

            @Override // p143hj.EnumC7353e
            /* renamed from: e */
            public double mo20855e(double d) {
                return mo20854f(d, "declination");
            }

            @Override // p143hj.EnumC7353e
            /* renamed from: f */
            public double mo20854f(double d, String str) {
                double m20868k = EnumC7353e.m20868k(d);
                if (str.equals("declination")) {
                    return Math.toDegrees(m20852l(m20868k));
                }
                if (str.equals("right-ascension")) {
                    double[] dArr = new double[2];
                    EnumC7353e.m20869h(m20868k, dArr);
                    double radians = Math.toRadians(EnumC7353e.m20871d(m20868k, dArr[0]));
                    return C7347a.m20897b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(EnumC7353e.m20870g(m20868k) + dArr[1])) * Math.sin(radians), Math.cos(radians))));
                } else if (str.equals("nutation")) {
                    double[] dArr2 = new double[2];
                    EnumC7353e.m20869h(m20868k, dArr2);
                    return dArr2[0];
                } else if (str.equals("obliquity")) {
                    double[] dArr3 = new double[2];
                    EnumC7353e.m20869h(m20868k, dArr3);
                    return EnumC7353e.m20870g(m20868k) + dArr3[1];
                } else if (str.equals("mean-anomaly")) {
                    return m20851m(m20868k);
                } else {
                    if (str.equals("solar-longitude")) {
                        double[] dArr4 = new double[2];
                        EnumC7353e.m20869h(m20868k, dArr4);
                        return EnumC7353e.m20871d(m20868k, dArr4[0]);
                    } else if (str.equals("solar-latitude")) {
                        return 0.0d;
                    } else {
                        return Double.NaN;
                    }
                }
            }

            @Override // p143hj.EnumC7353e
            /* renamed from: i */
            public double mo20853i(double d) {
                return mo20854f(d, "right-ascension");
            }
        };
        f19825m = enumC7353e3;
        f19830r = new EnumC7353e[]{c7354a, enumC7353e, enumC7353e2, enumC7353e3};
        f19826n = new int[]{403406, 195207, 119433, 112392, 3891, 2819, 1721, 660, 350, 334, 314, 268, 242, 234, 158, 132, 129, 114, 99, 93, 86, 78, 72, 68, 64, 46, 38, 37, 32, 29, 28, 27, 27, 25, 24, 21, 21, 20, 18, 17, 14, 13, 13, 13, 12, 10, 10, 10, 10};
        f19827o = new double[]{270.54861d, 340.19128d, 63.91854d, 331.2622d, 317.843d, 86.631d, 240.052d, 310.26d, 247.23d, 260.87d, 297.82d, 343.14d, 166.79d, 81.53d, 3.5d, 132.75d, 182.95d, 162.03d, 29.8d, 266.4d, 249.2d, 157.6d, 257.8d, 185.1d, 69.9d, 8.0d, 197.1d, 250.4d, 65.3d, 162.7d, 341.5d, 291.6d, 98.5d, 146.7d, 110.0d, 5.2d, 342.6d, 230.9d, 256.1d, 45.3d, 242.9d, 115.2d, 151.8d, 285.3d, 53.3d, 126.6d, 205.7d, 85.9d, 146.1d};
        f19828p = new double[]{0.9287892d, 35999.1376958d, 35999.4089666d, 35998.7287385d, 71998.20261d, 71998.4403d, 36000.35726d, 71997.4812d, 32964.4678d, -19.441d, 445267.1117d, 45036.884d, 3.1008d, 22518.4434d, -19.9739d, 65928.9345d, 9038.0293d, 3034.7684d, 33718.148d, 3034.448d, -2280.773d, 29929.992d, 31556.493d, 149.588d, 9037.75d, 107997.405d, -4444.176d, 151.771d, 67555.316d, 31556.08d, -4561.54d, 107996.706d, 1221.655d, 62894.167d, 31437.369d, 14578.298d, -31931.757d, 34777.243d, 1221.999d, 62894.511d, -4442.039d, 107997.909d, 119.066d, 16859.071d, -4.578d, 26895.292d, -39.127d, 12297.536d, 90073.778d};
        f19829q = new double[][]{new double[]{0.0d, 0.0d, 0.0d, 0.0d, 1.0d, -171996.0d, -174.2d, 92025.0d, 8.9d}, new double[]{-2.0d, 0.0d, 0.0d, 2.0d, 2.0d, -13187.0d, -1.6d, 5736.0d, -3.1d}, new double[]{0.0d, 0.0d, 0.0d, 2.0d, 2.0d, -2274.0d, -0.2d, 977.0d, -0.5d}, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 2.0d, 2062.0d, 0.2d, -895.0d, 0.5d}, new double[]{0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1426.0d, -3.4d, 54.0d, -0.1d}, new double[]{0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 712.0d, 0.1d, -7.0d, 0.0d}, new double[]{-2.0d, 1.0d, 0.0d, 2.0d, 2.0d, -517.0d, 1.2d, 224.0d, -0.6d}, new double[]{0.0d, 0.0d, 0.0d, 2.0d, 1.0d, -386.0d, -0.4d, 200.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 2.0d, 2.0d, -301.0d, 0.0d, 129.0d, -0.1d}, new double[]{-2.0d, -1.0d, 0.0d, 2.0d, 2.0d, 217.0d, -0.5d, -95.0d, 0.3d}, new double[]{-2.0d, 0.0d, 1.0d, 0.0d, 0.0d, -158.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 0.0d, 2.0d, 1.0d, 129.0d, 0.1d, -70.0d, 0.0d}, new double[]{0.0d, 0.0d, -1.0d, 2.0d, 2.0d, 123.0d, 0.0d, -53.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 0.0d, 0.0d, 63.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 0.0d, 1.0d, 63.0d, 0.1d, -33.0d, 0.0d}, new double[]{2.0d, 0.0d, -1.0d, 2.0d, 2.0d, -59.0d, 0.0d, 26.0d, 0.0d}, new double[]{0.0d, 0.0d, -1.0d, 0.0d, 1.0d, -58.0d, -0.1d, 32.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 2.0d, 1.0d, -51.0d, 0.0d, 27.0d, 0.0d}, new double[]{-2.0d, 0.0d, 2.0d, 0.0d, 0.0d, 48.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, -2.0d, 2.0d, 1.0d, 46.0d, 0.0d, -24.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 2.0d, 2.0d, -38.0d, 0.0d, 16.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, 2.0d, 2.0d, -31.0d, 0.0d, 13.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, 0.0d, 0.0d, 29.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 1.0d, 2.0d, 2.0d, 29.0d, 0.0d, -12.0d, 0.0d}, new double[]{0.0d, 0.0d, 0.0d, 2.0d, 0.0d, 26.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 0.0d, 2.0d, 0.0d, -22.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, -1.0d, 2.0d, 1.0d, 21.0d, 0.0d, -10.0d, 0.0d}, new double[]{0.0d, 2.0d, 0.0d, 0.0d, 0.0d, 17.0d, -0.1d, 0.0d, 0.0d}, new double[]{2.0d, 0.0d, -1.0d, 0.0d, 1.0d, 16.0d, 0.0d, -8.0d, 0.0d}, new double[]{-2.0d, 2.0d, 0.0d, 2.0d, 2.0d, -16.0d, 0.1d, 7.0d, 0.0d}, new double[]{0.0d, 1.0d, 0.0d, 0.0d, 1.0d, -15.0d, 0.0d, 9.0d, 0.0d}, new double[]{-2.0d, 0.0d, 1.0d, 0.0d, 1.0d, -13.0d, 0.0d, 7.0d, 0.0d}, new double[]{0.0d, -1.0d, 0.0d, 0.0d, 1.0d, -12.0d, 0.0d, 6.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, -2.0d, 0.0d, 11.0d, 0.0d, 0.0d, 0.0d}, new double[]{2.0d, 0.0d, -1.0d, 2.0d, 1.0d, -10.0d, 0.0d, 5.0d, 0.0d}, new double[]{2.0d, 0.0d, 1.0d, 2.0d, 2.0d, -8.0d, 0.0d, 3.0d, 0.0d}, new double[]{0.0d, 1.0d, 0.0d, 2.0d, 2.0d, 7.0d, 0.0d, -3.0d, 0.0d}, new double[]{-2.0d, 1.0d, 1.0d, 0.0d, 0.0d, -7.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, -1.0d, 0.0d, 2.0d, 2.0d, -7.0d, 0.0d, 3.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 2.0d, 1.0d, -7.0d, 0.0d, 3.0d, 0.0d}, new double[]{2.0d, 0.0d, 1.0d, 0.0d, 0.0d, 6.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 2.0d, 2.0d, 2.0d, 6.0d, 0.0d, -3.0d, 0.0d}, new double[]{-2.0d, 0.0d, 1.0d, 2.0d, 1.0d, 6.0d, 0.0d, -3.0d, 0.0d}, new double[]{2.0d, 0.0d, -2.0d, 0.0d, 1.0d, -6.0d, 0.0d, 3.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 0.0d, 1.0d, -6.0d, 0.0d, 3.0d, 0.0d}, new double[]{0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 5.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, -1.0d, 0.0d, 2.0d, 1.0d, -5.0d, 0.0d, 3.0d, 0.0d}, new double[]{-2.0d, 0.0d, 0.0d, 0.0d, 1.0d, -5.0d, 0.0d, 3.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, 2.0d, 1.0d, -5.0d, 0.0d, 3.0d, 0.0d}, new double[]{-2.0d, 0.0d, 2.0d, 0.0d, 1.0d, 4.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 1.0d, 0.0d, 2.0d, 1.0d, 4.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, -2.0d, 0.0d, 4.0d, 0.0d, 0.0d, 0.0d}, new double[]{-1.0d, 0.0d, 1.0d, 0.0d, 0.0d, -4.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 1.0d, 0.0d, 0.0d, 0.0d, -4.0d, 0.0d, 0.0d, 0.0d}, new double[]{1.0d, 0.0d, 0.0d, 0.0d, 0.0d, -4.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 2.0d, 0.0d, 3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, -2.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{-1.0d, -1.0d, 1.0d, 0.0d, 0.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 1.0d, 1.0d, 0.0d, 0.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, -1.0d, 1.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{2.0d, -1.0d, -1.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 3.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{2.0d, -1.0d, 0.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}};
    }

    private EnumC7353e(String str, int i) {
    }

    /* renamed from: a */
    private static double m20874a(double d) {
        return (Math.cos(Math.toRadians((d * 35999.01848d) + 177.63d)) * 9.74E-5d) - 0.005575d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static double m20871d(double d, double d2) {
        double d3 = 0.0d;
        for (int length = f19826n.length - 1; length >= 0; length--) {
            d3 += f19826n[length] * Math.sin(Math.toRadians(f19827o[length] + (f19828p[length] * d)));
        }
        double m20874a = (((((36000.76953744d * d) + 282.7771834d) + ((d3 * 5.729577951308232d) / 1000000.0d)) + m20874a(d)) + d2) / 360.0d;
        return (m20874a - Math.floor(m20874a)) * 360.0d;
    }

    /* renamed from: g */
    static double m20870g(double d) {
        return (((((((0.001813d * d) - 5.9E-4d) * d) - 46.815d) * d) + 21.448d) / 3600.0d) + 23.433333333333334d;
    }

    /* renamed from: h */
    static void m20869h(double d, double[] dArr) {
        double radians = Math.toRadians((((((5.277768981496142E-6d * d) - 0.0019142d) * d) + 445267.11148d) * d) + 297.85036d);
        double radians2 = Math.toRadians(((((((-3.3333333333333333E-6d) * d) - 1.603E-4d) * d) + 35999.05034d) * d) + 357.52772d);
        double radians3 = Math.toRadians((((((1.7777777777777779E-4d * d) + 0.0086972d) * d) + 477198.867398d) * d) + 134.96298d);
        double radians4 = Math.toRadians((((((3.0555810187307116E-6d * d) - 0.0036825d) * d) + 483202.017538d) * d) + 93.27191d);
        double radians5 = Math.toRadians((((((2.222222222222222E-6d * d) + 0.0020708d) * d) - 1934.136261d) * d) + 125.04452d);
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (int length = f19829q.length - 1; length >= 0; length--) {
            double[] dArr2 = f19829q[length];
            double d4 = (dArr2[0] * radians) + (dArr2[1] * radians2) + (dArr2[2] * radians3) + (dArr2[3] * radians4) + (dArr2[4] * radians5);
            d2 += Math.sin(d4) * (dArr2[5] + (dArr2[6] * d));
            d3 += Math.cos(d4) * (dArr2[7] + (dArr2[8] * d));
        }
        dArr[0] = (d2 * 1.0E-4d) / 3600.0d;
        dArr[1] = (d3 * 1.0E-4d) / 3600.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static double m20868k(double d) {
        return (d - 2451545.0d) / 36525.0d;
    }

    public static EnumC7353e valueOf(String str) {
        return (EnumC7353e) Enum.valueOf(EnumC7353e.class, str);
    }

    public static EnumC7353e[] values() {
        return (EnumC7353e[]) f19830r.clone();
    }

    /* renamed from: e */
    public double mo20855e(double d) {
        throw new AbstractMethodError();
    }

    /* renamed from: f */
    public double mo20854f(double d, String str) {
        if (str.equals("declination")) {
            return mo20855e(d);
        }
        if (str.equals("right-ascension")) {
            return mo20853i(d);
        }
        return Double.NaN;
    }

    /* renamed from: i */
    public double mo20853i(double d) {
        throw new AbstractMethodError();
    }

    /* synthetic */ EnumC7353e(String str, int i, C7354a c7354a) {
        this(str, i);
    }
}
