package p143hj;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.concurrent.TimeUnit;
import net.time4j.C10582a0;
import net.time4j.C10722h0;
import net.time4j.base.C10616c;

/* renamed from: hj.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC7352d {
    NEW_MOON(0),
    FIRST_QUARTER(90),
    FULL_MOON(180),
    LAST_QUARTER(270);
    

    /* renamed from: j */
    private final transient int f19821j;

    /* renamed from: o */
    private static final int[] f19809o = {100, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 10000, 100000};

    /* renamed from: p */
    private static final C10582a0 f19810p = C10722h0.m10490e0(2000, 1, 6, 18, 13, 42).m10500V();

    /* renamed from: q */
    private static final int[] f19811q = {0, 1, 0, 0, 1, 1, 2, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: r */
    private static final int[] f19812r = {0, 1, 1, 0, 0, 1, 2, 0, 0, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: s */
    private static final int[] f19813s = {0, 1, 0, 0, -1, 1, 2, 0, 0, 1, 0, 1, 1, -1, 2, 0, 3, 1, 0, 1, -1, -1, 1, 0};

    /* renamed from: t */
    private static final int[] f19814t = {0, 1, 1, 0, 0, -1, 2, 0, 0, 0, -1, 1, 1, 2, 1, -1, 0, 1, -2, 1, 3, 0, -1, 1};

    /* renamed from: u */
    private static final int[] f19815u = {1, 0, 2, 0, 1, 1, 0, 1, 1, 2, 3, 0, 0, 2, 1, 2, 0, 1, 2, 1, 1, 1, 3, 4};

    /* renamed from: v */
    private static final int[] f19816v = {1, 0, 1, 2, 0, 1, 0, 1, 1, 3, 2, 0, 0, 1, 2, 1, 2, 1, 1, 1, 0, 2, 1, 3};

    /* renamed from: w */
    private static final int[] f19817w = {0, 0, 0, 2, 0, 0, 0, -2, 2, 0, 0, 2, -2, 0, 0, -2, 0, -2, 2, 2, 2, -2, 0, 0};

    /* renamed from: x */
    private static final int[] f19818x = {0, 0, 0, 0, 2, 0, 0, -2, 2, 0, 0, 2, -2, 0, 0, -2, 2, 2, 0, -2, 0, -2, 2, 0};

    /* renamed from: y */
    private static final double[] f19819y = {-0.4072d, 0.17241d, 0.01608d, 0.01039d, 0.00739d, -0.00514d, 0.00208d, -0.00111d, -5.7E-4d, 5.6E-4d, -4.2E-4d, 4.2E-4d, 3.8E-4d, -2.4E-4d, -7.0E-5d, 4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, -3.0E-5d, 3.0E-5d, -2.0E-5d, -2.0E-5d, 2.0E-5d};

    /* renamed from: z */
    private static final double[] f19820z = {-0.40614d, 0.17302d, 0.01614d, 0.01043d, 0.00734d, -0.00515d, 0.00209d, -0.00111d, -5.7E-4d, 5.6E-4d, -4.2E-4d, 4.2E-4d, 3.8E-4d, -2.4E-4d, -7.0E-5d, 4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, -3.0E-5d, 3.0E-5d, -2.0E-5d, -2.0E-5d, 2.0E-5d};

    /* renamed from: A */
    private static final double[] f19803A = {-0.62801d, 0.17172d, -0.01183d, 0.00862d, 0.00804d, 0.00454d, 0.00204d, -0.0018d, -7.0E-4d, -4.0E-4d, -3.4E-4d, 3.2E-4d, 3.2E-4d, -2.8E-4d, 2.7E-4d, -5.0E-5d, 4.0E-5d, -4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, 2.0E-5d, 2.0E-5d, -2.0E-5d};

    EnumC7352d(int i) {
        this.f19821j = i;
    }

    /* renamed from: d */
    private static double m20879d(double d, double d2, double d3, double d4) {
        return (((0.00306d - ((d * 3.8E-4d) * m20878e(d2))) + (m20878e(d3) * 2.6E-4d)) - (m20878e(d3 - d2) * 2.0E-5d)) + (m20878e(d3 + d2) * 2.0E-5d) + (m20878e(d4 * 2.0d) * 2.0E-5d);
    }

    /* renamed from: e */
    private static double m20878e(double d) {
        return Math.cos((d * 3.141592653589793d) / 180.0d);
    }

    /* renamed from: f */
    private int m20877f(C10582a0 c10582a0) {
        return C10616c.m11035g(Math.round((f19810p.m20144M(c10582a0, TimeUnit.DAYS) / 29.530588861d) - (this.f19821j / 360.0d)));
    }

    /* renamed from: g */
    private double m20876g(double d, double d2, double d3, double d4) {
        double[] dArr;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        EnumC7352d enumC7352d = NEW_MOON;
        if (this == enumC7352d) {
            dArr = f19819y;
        } else if (this == FULL_MOON) {
            dArr = f19820z;
        } else {
            dArr = f19803A;
        }
        if (this != enumC7352d && this != FULL_MOON) {
            iArr = f19812r;
        } else {
            iArr = f19811q;
        }
        if (this != enumC7352d && this != FULL_MOON) {
            iArr2 = f19814t;
        } else {
            iArr2 = f19813s;
        }
        if (this != enumC7352d && this != FULL_MOON) {
            iArr3 = f19816v;
        } else {
            iArr3 = f19815u;
        }
        if (this != enumC7352d && this != FULL_MOON) {
            iArr4 = f19818x;
        } else {
            iArr4 = f19817w;
        }
        double d5 = 0.0d;
        for (int i = 23; i >= 0; i--) {
            double d6 = dArr[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 == 2) {
                    d6 *= d;
                } else {
                    d5 += d6 * m20875h((iArr2[i] * d2) + (iArr3[i] * d3) + (iArr4[i] * d4));
                }
            }
            d6 *= d;
            d5 += d6 * m20875h((iArr2[i] * d2) + (iArr3[i] * d3) + (iArr4[i] * d4));
        }
        return d5;
    }

    /* renamed from: h */
    private static double m20875h(double d) {
        return Math.sin((d * 3.141592653589793d) / 180.0d);
    }

    /* renamed from: a */
    public C10582a0 m20882a(int i) {
        double d = i + (this.f19821j / 360.0d);
        double d2 = d / 1236.85d;
        double d3 = d2 * d2;
        double d4 = 1.0d - (((7.4E-6d * d2) + 0.002516d) * d2);
        double d5 = ((29.1053567d * d) + 2.5534d) - (((1.1E-7d * d2) + 1.4E-6d) * d3);
        double d6 = (385.81693528d * d) + 201.5643d + ((((1.238E-5d - (5.8E-8d * d2)) * d2) + 0.0107582d) * d3);
        double d7 = (390.67050284d * d) + 160.7108d + (((((1.1E-8d * d2) - 2.27E-6d) * d2) - 0.0016118d) * d3);
        double sin = ((((29.530588861d * d) + 2451550.09766d) + (((((7.3E-10d * d2) - 1.5E-7d) * d2) + 1.5437E-4d) * d3)) - (Math.sin(Math.toRadians((124.7746d - (1.56375588d * d)) + (((2.15E-6d * d2) + 0.0020672d) * d3))) * 1.7E-4d)) + m20876g(d4, d5, d6, d7);
        if (this == FIRST_QUARTER) {
            sin += m20879d(d4, d5, d6, d7);
        } else if (this == LAST_QUARTER) {
            sin -= m20879d(d4, d5, d6, d7);
        }
        double[] dArr = {((0.107408d * d) + 299.77d) - (d3 * 0.009173d), 3.25E-4d, (0.016321d * d) + 251.88d, 1.65E-4d, (26.651886d * d) + 251.83d, 1.64E-4d, (36.412478d * d) + 349.42d, 1.26E-4d, (18.206239d * d) + 84.66d, 1.1E-4d, (53.303771d * d) + 141.74d, 6.2E-5d, (2.453732d * d) + 207.14d, 6.0E-5d, (7.30686d * d) + 154.84d, 5.6E-5d, (27.261239d * d) + 34.52d, 4.7E-5d, (0.121824d * d) + 207.19d, 4.2E-5d, (1.844379d * d) + 291.34d, 4.0E-5d, (24.198154d * d) + 161.72d, 3.7E-5d, (25.513099d * d) + 239.56d, 3.5E-5d, (d * 3.592518d) + 331.55d, 2.3E-5d};
        for (int i2 = 0; i2 < 28; i2 += 2) {
            sin += dArr[i2 + 1] * Math.sin(Math.toRadians(dArr[i2]));
        }
        return (C10582a0) C7350c.m20885f(sin).m20883h().mo14419F(C10582a0.f27643x, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public C10582a0 m20881b(C10582a0 c10582a0) {
        int m20877f = m20877f(c10582a0);
        C10582a0 m20882a = m20882a(m20877f);
        int i = m20877f;
        while (m20882a.m11149m0(c10582a0)) {
            i++;
            m20882a = m20882a(i);
        }
        if (i <= m20877f) {
            while (true) {
                i--;
                C10582a0 m20882a2 = m20882a(i);
                if (m20882a2.m11149m0(c10582a0)) {
                    break;
                }
                m20882a = m20882a2;
            }
        }
        return m20882a;
    }

    /* renamed from: c */
    public C10582a0 m20880c(C10582a0 c10582a0) {
        int m20877f = m20877f(c10582a0);
        C10582a0 m20882a = m20882a(m20877f);
        int i = m20877f;
        while (!m20882a.m11149m0(c10582a0)) {
            i--;
            m20882a = m20882a(i);
        }
        if (i >= m20877f) {
            while (m20882a.m20145L(29L, TimeUnit.DAYS).m11149m0(c10582a0)) {
                i++;
                C10582a0 m20882a2 = m20882a(i);
                if (!m20882a2.m11149m0(c10582a0)) {
                    break;
                }
                m20882a = m20882a2;
            }
        }
        return m20882a;
    }
}