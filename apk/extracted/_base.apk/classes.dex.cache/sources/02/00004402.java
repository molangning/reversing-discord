package net.time4j;

import net.time4j.base.C10615b;
import net.time4j.base.C10616c;
import p162ij.AbstractC7665q;
import p162ij.EnumC7627a0;
import p162ij.InterfaceC7659m0;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7670v;
import p162ij.InterfaceC7676z;

/* renamed from: net.time4j.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10591a1 extends AbstractC10581a<Integer> {

    /* renamed from: o */
    private static final InterfaceC7659m0 f27655o = new C10594c();

    /* renamed from: p */
    static final C10591a1 f27656p = new C10591a1("YEAR_OF_WEEKDATE");
    private static final long serialVersionUID = -6907291758376370420L;

    /* renamed from: m */
    private final transient AbstractC10782o<C10697f0> f27657m;

    /* renamed from: n */
    private final transient AbstractC10782o<C10697f0> f27658n;

    /* renamed from: net.time4j.a1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10593b<T extends AbstractC7665q<T>> implements InterfaceC7676z<T, Integer> {
        private C10593b() {
        }

        /* renamed from: a */
        private InterfaceC7664p<?> m11090a() {
            return C10852z0.f28326v.m9965n();
        }

        /* renamed from: q */
        private static C10697f0 m11083q(C10697f0 c10697f0, int i) {
            int i2;
            int m11097I = C10591a1.m11097I(i);
            int m11094N = C10591a1.m11094N(c10697f0);
            long m20216i = EnumC7627a0.UNIX.m20216i(C10615b.m11045j(i, 1, 1), EnumC7627a0.MODIFIED_JULIAN_DATE) + (m11097I - 1) + ((m11094N - 1) * 7) + (c10697f0.m10720F0().m9996c(C10852z0.f28326v) - 1);
            if (m11094N == 53) {
                int m11097I2 = C10591a1.m11097I(i + 1);
                if (C10615b.m11050e(i)) {
                    i2 = 366;
                } else {
                    i2 = 365;
                }
                if (((m11097I2 + i2) - m11097I) / 7 < 53) {
                    m20216i -= 7;
                }
            }
            return c10697f0.m10701X0(m20216i - 730);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9926b(T t) {
            return m11090a();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9925c(T t) {
            return m11090a();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public Integer mo9922f(T t) {
            return C10591a1.f27656p.mo9551e();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Integer mo9917l(T t) {
            return C10591a1.f27656p.mo9554U();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public Integer mo9915o(T t) {
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(C10697f0.f27906w);
            int mo10482o = c10697f0.mo10482o();
            int m10719G0 = c10697f0.m10719G0();
            int m11096K = C10591a1.m11096K(c10697f0, 0);
            if (m11096K <= m10719G0) {
                if (((m10719G0 - m11096K) / 7) + 1 >= 53 && C10591a1.m11096K(c10697f0, 1) + C10591a1.m11095L(c10697f0, 0) <= m10719G0) {
                    mo10482o++;
                }
            } else {
                mo10482o--;
            }
            return Integer.valueOf(mo10482o);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public boolean mo9920i(T t, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= -999999999 && intValue <= 999999999;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: r */
        public T mo9916n(T t, Integer num, boolean z) {
            if (num != null) {
                InterfaceC7664p<C10697f0> interfaceC7664p = C10697f0.f27906w;
                return (T) t.mo14419F(interfaceC7664p, m11083q((C10697f0) t.mo10212i(interfaceC7664p), num.intValue()));
            }
            throw new IllegalArgumentException("Missing element value.");
        }
    }

    /* renamed from: net.time4j.a1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10594c<T extends AbstractC7665q<T>> implements InterfaceC7659m0<T> {
        private C10594c() {
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: c */
        public T mo10475b(T t, long j) {
            if (j == 0) {
                return t;
            }
            int m11035g = C10616c.m11035g(C10616c.m11036f(((Integer) t.mo10212i(C10591a1.f27656p)).intValue(), j));
            InterfaceC7664p<C10697f0> interfaceC7664p = C10697f0.f27906w;
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(interfaceC7664p);
            int m10716J0 = c10697f0.m10716J0();
            EnumC10846x0 m10720F0 = c10697f0.m10720F0();
            if (m10716J0 == 53) {
                m10716J0 = ((Integer) C10697f0.m10710O0(m11035g, 26, m10720F0).mo10211l(C10852z0.f28326v.m9965n())).intValue();
            }
            return (T) t.mo14419F(interfaceC7664p, C10697f0.m10710O0(m11035g, m10716J0, m10720F0));
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: d */
        public long mo10476a(T t, T t2) {
            InterfaceC7664p<C10697f0> interfaceC7664p = C10697f0.f27906w;
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(interfaceC7664p);
            C10697f0 c10697f02 = (C10697f0) t2.mo10212i(interfaceC7664p);
            C10591a1 c10591a1 = C10591a1.f27656p;
            long intValue = ((Integer) c10697f02.mo10212i(c10591a1)).intValue() - ((Integer) c10697f0.mo10212i(c10591a1)).intValue();
            int i = (intValue > 0L ? 1 : (intValue == 0L ? 0 : -1));
            if (i != 0) {
                int m11094N = C10591a1.m11094N(c10697f0);
                int m11094N2 = C10591a1.m11094N(c10697f02);
                if (i > 0 && m11094N > m11094N2) {
                    intValue--;
                } else if (i < 0 && m11094N < m11094N2) {
                    intValue++;
                }
                int i2 = (intValue > 0L ? 1 : (intValue == 0L ? 0 : -1));
                if (i2 != 0 && m11094N == m11094N2) {
                    int m9997b = c10697f0.m10720F0().m9997b();
                    int m9997b2 = c10697f02.m10720F0().m9997b();
                    if (i2 > 0 && m9997b > m9997b2) {
                        intValue--;
                    } else if (i2 < 0 && m9997b < m9997b2) {
                        intValue++;
                    }
                    int i3 = (intValue > 0L ? 1 : (intValue == 0L ? 0 : -1));
                    if (i3 != 0 && m9997b == m9997b2) {
                        InterfaceC7664p<C10711g0> interfaceC7664p2 = C10711g0.f27966x;
                        if (t.mo10210q(interfaceC7664p2) && t2.mo10210q(interfaceC7664p2)) {
                            C10711g0 c10711g0 = (C10711g0) t.mo10212i(interfaceC7664p2);
                            C10711g0 c10711g02 = (C10711g0) t2.mo10212i(interfaceC7664p2);
                            if (i3 > 0 && c10711g0.m10622B0(c10711g02)) {
                                return intValue - 1;
                            }
                            if (i3 < 0 && c10711g0.m10621C0(c10711g02)) {
                                return intValue + 1;
                            }
                            return intValue;
                        }
                        return intValue;
                    }
                    return intValue;
                }
                return intValue;
            }
            return intValue;
        }
    }

    /* renamed from: net.time4j.a1$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10595d extends AbstractC10782o<C10697f0> {

        /* renamed from: l */
        private final long f27659l;

        /* renamed from: m */
        private final InterfaceC7670v<C10722h0> f27660m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: net.time4j.a1$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public class C10596a implements InterfaceC7670v<C10722h0> {
            C10596a() {
                C10595d.this = r1;
            }

            @Override // p162ij.InterfaceC7670v
            /* renamed from: a */
            public C10722h0 apply(C10722h0 c10722h0) {
                return (C10722h0) C10591a1.m11093O().mo10475b(c10722h0, C10595d.this.f27659l);
            }
        }

        @Override // p162ij.InterfaceC7670v
        /* renamed from: c */
        public C10697f0 apply(C10697f0 c10697f0) {
            return (C10697f0) C10591a1.m11093O().mo10475b(c10697f0, this.f27659l);
        }

        private C10595d(long j) {
            super(C10591a1.f27656p, 8);
            this.f27659l = j;
            this.f27660m = new C10596a();
        }
    }

    private C10591a1(String str) {
        super(str);
        this.f27657m = new C10595d(-1L);
        this.f27658n = new C10595d(1L);
    }

    /* renamed from: D */
    public static <T extends AbstractC7665q<T>> InterfaceC7676z<T, Integer> m11100D(Class<T> cls) {
        return new C10593b();
    }

    /* renamed from: I */
    public static int m11097I(int i) {
        EnumC10846x0 m9993f = EnumC10846x0.m9993f(C10615b.m11052c(i, 1, 1));
        C10852z0 c10852z0 = C10852z0.f28326v;
        int m9996c = m9993f.m9996c(c10852z0);
        if (m9996c <= 8 - c10852z0.m9972g()) {
            return 2 - m9996c;
        }
        return 9 - m9996c;
    }

    /* renamed from: K */
    public static int m11096K(C10697f0 c10697f0, int i) {
        return m11097I(c10697f0.mo10482o() + i);
    }

    /* renamed from: L */
    public static int m11095L(C10697f0 c10697f0, int i) {
        return C10615b.m11050e(c10697f0.mo10482o() + i) ? 366 : 365;
    }

    /* renamed from: N */
    public static int m11094N(C10697f0 c10697f0) {
        int m10719G0 = c10697f0.m10719G0();
        int m11096K = m11096K(c10697f0, 0);
        if (m11096K <= m10719G0) {
            int i = ((m10719G0 - m11096K) / 7) + 1;
            if (i >= 53 && m11096K(c10697f0, 1) + m11095L(c10697f0, 0) <= m10719G0) {
                return 1;
            }
            return i;
        }
        return (((m10719G0 + m11095L(c10697f0, -1)) - m11096K(c10697f0, -1)) / 7) + 1;
    }

    /* renamed from: O */
    public static <T extends AbstractC7665q<T>> InterfaceC7659m0<T> m11093O() {
        return f27655o;
    }

    private Object readResolve() {
        return f27656p;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: E */
    public Integer mo9551e() {
        return C10697f0.f27899p;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: F */
    public Integer mo9554U() {
        return C10697f0.f27898o;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return 'Y';
    }

    @Override // p162ij.InterfaceC7664p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: v */
    protected boolean mo9550v() {
        return true;
    }
}