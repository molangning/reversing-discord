package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.horcrux.svg.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5252y {

    /* renamed from: d */
    private static ArrayList<C5252y> f14878d;

    /* renamed from: e */
    private static int f14879e;

    /* renamed from: f */
    private static C5249w f14880f;

    /* renamed from: g */
    private static C5249w f14881g;

    /* renamed from: h */
    private static C5249w f14882h;

    /* renamed from: i */
    private static C5249w f14883i;

    /* renamed from: j */
    private static boolean f14884j;

    /* renamed from: a */
    EnumC5254z f14885a;

    /* renamed from: b */
    C5249w f14886b;

    /* renamed from: c */
    double f14887c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C5253a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14888a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14889b;

        static {
            int[] iArr = new int[EnumC5213f.values().length];
            f14889b = iArr;
            try {
                iArr[EnumC5213f.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14889b[EnumC5213f.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14889b[EnumC5213f.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14889b[EnumC5213f.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14889b[EnumC5213f.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC5254z.values().length];
            f14888a = iArr2;
            try {
                iArr2[EnumC5254z.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14888a[EnumC5254z.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14888a[EnumC5254z.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private C5252y(EnumC5254z enumC5254z, C5249w c5249w, double d) {
        this.f14885a = enumC5254z;
        this.f14886b = c5249w;
        this.f14887c = d;
    }

    /* renamed from: a */
    private static double m25660a(double d, double d2) {
        if (Math.abs(d - d2) > 180.0d) {
            d += 360.0d;
        }
        return (d + d2) / 2.0d;
    }

    /* renamed from: b */
    private static void m25659b(C5208c0 c5208c0, C5249w c5249w, C5249w c5249w2, C5249w c5249w3) {
        c5208c0.f14614a = m25650k(c5249w2, c5249w);
        c5208c0.f14615b = m25650k(c5249w3, c5249w2);
        if (m25652i(c5208c0.f14614a)) {
            c5208c0.f14614a = c5208c0.f14615b;
        } else if (m25652i(c5208c0.f14615b)) {
            c5208c0.f14615b = c5208c0.f14614a;
        }
    }

    /* renamed from: c */
    private static double m25658c(EnumC5254z enumC5254z) {
        double m25651j = m25651j(m25655f(f14882h));
        double m25651j2 = m25651j(m25655f(f14883i));
        int i = C5253a.f14888a[enumC5254z.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return 0.0d;
                }
                return m25651j;
            }
            return m25660a(m25651j, m25651j2);
        } else if (f14884j) {
            return m25651j2 + 180.0d;
        } else {
            return m25651j2;
        }
    }

    /* renamed from: d */
    private static C5208c0 m25657d(C5241s c5241s) {
        C5208c0 c5208c0 = new C5208c0();
        C5249w[] c5249wArr = c5241s.f14827b;
        int i = C5253a.f14889b[c5241s.f14826a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        C5249w c5249w = f14881g;
                        c5208c0.f14616c = c5249w;
                        c5208c0.f14614a = m25650k(c5249w, f14880f);
                        c5208c0.f14615b = m25650k(c5208c0.f14616c, f14880f);
                    }
                } else {
                    C5249w c5249w2 = c5249wArr[0];
                    c5208c0.f14616c = c5249w2;
                    c5208c0.f14614a = m25650k(c5249w2, f14880f);
                    c5208c0.f14615b = m25650k(c5208c0.f14616c, f14880f);
                }
            } else {
                C5249w c5249w3 = c5249wArr[1];
                c5208c0.f14616c = c5249w3;
                m25659b(c5208c0, f14880f, c5249wArr[0], c5249w3);
            }
        } else {
            c5208c0.f14616c = c5249wArr[2];
            c5208c0.f14614a = m25650k(c5249wArr[0], f14880f);
            c5208c0.f14615b = m25650k(c5249wArr[2], c5249wArr[1]);
            if (m25652i(c5208c0.f14614a)) {
                m25659b(c5208c0, c5249wArr[0], c5249wArr[1], c5249wArr[2]);
            } else if (m25652i(c5208c0.f14615b)) {
                m25659b(c5208c0, f14880f, c5249wArr[0], c5249wArr[1]);
            }
        }
        return c5208c0;
    }

    /* renamed from: e */
    private static void m25656e() {
        EnumC5254z enumC5254z = EnumC5254z.kEndMarker;
        f14878d.add(new C5252y(enumC5254z, f14880f, m25658c(enumC5254z)));
    }

    /* renamed from: f */
    private static double m25655f(C5249w c5249w) {
        return Math.atan2(c5249w.f14876b, c5249w.f14875a);
    }

    /* renamed from: g */
    private static void m25654g(C5241s c5241s) {
        EnumC5254z enumC5254z;
        C5208c0 m25657d = m25657d(c5241s);
        f14883i = m25657d.f14614a;
        int i = f14879e;
        if (i > 0) {
            if (i == 1) {
                enumC5254z = EnumC5254z.kStartMarker;
            } else {
                enumC5254z = EnumC5254z.kMidMarker;
            }
            f14878d.add(new C5252y(enumC5254z, f14880f, m25658c(enumC5254z)));
        }
        f14882h = m25657d.f14615b;
        f14880f = m25657d.f14616c;
        EnumC5213f enumC5213f = c5241s.f14826a;
        if (enumC5213f == EnumC5213f.kCGPathElementMoveToPoint) {
            f14881g = c5241s.f14827b[0];
        } else if (enumC5213f == EnumC5213f.kCGPathElementCloseSubpath) {
            f14881g = new C5249w(0.0d, 0.0d);
        }
        f14879e++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static ArrayList<C5252y> m25653h(ArrayList<C5241s> arrayList) {
        f14878d = new ArrayList<>();
        f14879e = 0;
        f14880f = new C5249w(0.0d, 0.0d);
        f14881g = new C5249w(0.0d, 0.0d);
        Iterator<C5241s> it = arrayList.iterator();
        while (it.hasNext()) {
            m25654g(it.next());
        }
        m25656e();
        return f14878d;
    }

    /* renamed from: i */
    private static boolean m25652i(C5249w c5249w) {
        return c5249w.f14875a == 0.0d && c5249w.f14876b == 0.0d;
    }

    /* renamed from: j */
    private static double m25651j(double d) {
        return d * 57.29577951308232d;
    }

    /* renamed from: k */
    private static C5249w m25650k(C5249w c5249w, C5249w c5249w2) {
        return new C5249w(c5249w2.f14875a - c5249w.f14875a, c5249w2.f14876b - c5249w.f14876b);
    }
}
