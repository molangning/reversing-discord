package net.time4j.calendar;

import java.util.Locale;
import net.time4j.base.C10616c;
import net.time4j.calendar.AbstractC10644f;
import p162ij.AbstractC7658m;
import p162ij.InterfaceC7632c0;
import p162ij.InterfaceC7659m0;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7676z;
import p184jj.InterfaceC8977c;

/* renamed from: net.time4j.calendar.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC10644f<U, D extends AbstractC10644f<U, D>> extends AbstractC7658m<U, D> {

    /* renamed from: j */
    private final transient int f27746j;

    /* renamed from: k */
    private final transient int f27747k;

    /* renamed from: l */
    private final transient C10651h f27748l;

    /* renamed from: m */
    private final transient int f27749m;

    /* renamed from: n */
    private final transient long f27750n;

    /* renamed from: o */
    private final transient int f27751o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.calendar.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10646b<D extends AbstractC10644f<?, D>> implements InterfaceC7676z<D, C10640c> {

        /* renamed from: j */
        private final InterfaceC7664p<?> f27752j;

        /* renamed from: k */
        private final boolean f27753k;

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(D d) {
            return this.f27752j;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(D d) {
            return this.f27752j;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public C10640c mo9922f(D d) {
            return C10640c.m10947o(d.m10921a0() == 94 ? 56 : 60);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public C10640c mo9917l(D d) {
            if (this.f27753k) {
                if (d.m10921a0() == 75) {
                    return C10640c.m10947o(10);
                }
                return C10640c.m10947o(1);
            } else if (d.m10921a0() == 72) {
                return C10640c.m10947o(22);
            } else {
                return C10640c.m10947o(1);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public C10640c mo9915o(D d) {
            return d.m10910k0();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(D d, C10640c c10640c) {
            C10640c mo9917l = mo9917l(d);
            C10640c mo9922f = mo9922f(d);
            if (c10640c != null && mo9917l.compareTo(c10640c) <= 0 && mo9922f.compareTo(c10640c) >= 0) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r8v8, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public D mo9916n(D d, C10640c c10640c, boolean z) {
            C10651h c10651h;
            if (mo9920i(d, c10640c)) {
                AbstractC10642d<D> mo10922Z = d.mo10922Z();
                int m10908r = d.m10908r();
                C10651h m10914g0 = d.m10914g0();
                int number = c10640c.getNumber();
                int m10921a0 = d.m10921a0();
                if (m10914g0.m10871c() && m10914g0.getNumber() != mo10922Z.m10943g(m10921a0, number)) {
                    c10651h = C10651h.m10870d(m10914g0.getNumber());
                } else {
                    c10651h = m10914g0;
                }
                if (m10908r <= 29) {
                    return mo10922Z.mo10945e(m10921a0, number, c10651h, m10908r, mo10922Z.m10930t(m10921a0, number, c10651h, m10908r));
                }
                long m10930t = mo10922Z.m10930t(m10921a0, number, c10651h, 1);
                int min = Math.min(m10908r, mo10922Z.mo10629b(m10930t).lengthOfMonth());
                return mo10922Z.mo10945e(m10921a0, number, c10651h, min, (m10930t + min) - 1);
            }
            throw new IllegalArgumentException("Invalid cyclic year: " + c10640c);
        }

        private C10646b(InterfaceC7664p<?> interfaceC7664p, boolean z) {
            this.f27752j = interfaceC7664p;
            this.f27753k = z;
        }
    }

    /* renamed from: net.time4j.calendar.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10647c<D extends AbstractC10644f<?, D>> implements InterfaceC7659m0<D> {

        /* renamed from: a */
        private final int f27754a;

        C10647c(int i) {
            this.f27754a = i;
        }

        /* renamed from: e */
        private static <D extends AbstractC10644f<?, D>> long m10898e(D d, D d2, int i) {
            int compareTo;
            D d3;
            D d4;
            int m10943g;
            AbstractC10642d<D> mo10922Z = d.mo10922Z();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                return d2.mo10920b() - d.mo10920b();
                            }
                            throw new UnsupportedOperationException();
                        }
                        return (d2.mo10920b() - d.mo10920b()) / 7;
                    }
                    boolean m20132S = d.m20132S(d2);
                    if (m20132S) {
                        d4 = d;
                        d3 = d2;
                    } else {
                        d3 = d;
                        d4 = d2;
                    }
                    int m10921a0 = d3.m10921a0();
                    int number = d3.m10910k0().getNumber();
                    C10651h m10914g0 = d3.m10914g0();
                    int number2 = m10914g0.getNumber();
                    boolean m10871c = m10914g0.m10871c();
                    int m10943g2 = mo10922Z.m10943g(m10921a0, number);
                    int i2 = 0;
                    while (true) {
                        if (m10921a0 == d4.m10921a0() && number == d4.m10910k0().getNumber() && m10914g0.equals(d4.m10914g0())) {
                            break;
                        }
                        if (m10871c) {
                            number2++;
                            m10871c = false;
                        } else if (m10943g2 == number2) {
                            m10871c = true;
                        } else {
                            number2++;
                        }
                        if (!m10871c) {
                            if (number2 == 13) {
                                number++;
                                if (number == 61) {
                                    m10921a0++;
                                    number = 1;
                                }
                                m10943g = mo10922Z.m10943g(m10921a0, number);
                                number2 = 1;
                            } else if (number2 == 0) {
                                number--;
                                if (number == 0) {
                                    m10921a0--;
                                    number = 60;
                                }
                                m10943g = mo10922Z.m10943g(m10921a0, number);
                                number2 = 12;
                            }
                            m10943g2 = m10943g;
                        }
                        m10914g0 = C10651h.m10870d(number2);
                        if (m10871c) {
                            m10914g0 = m10914g0.m10869e();
                        }
                        i2++;
                    }
                    if (i2 > 0 && d3.m10908r() > d4.m10908r()) {
                        i2--;
                    }
                    if (m20132S) {
                        i2 = -i2;
                    }
                    return i2;
                }
                int m10921a02 = (((d2.m10921a0() * 60) + d2.m10910k0().getNumber()) - (d.m10921a0() * 60)) - d.m10910k0().getNumber();
                if (m10921a02 > 0) {
                    int compareTo2 = d.m10914g0().compareTo(d2.m10914g0());
                    if (compareTo2 > 0 || (compareTo2 == 0 && d.m10908r() > d2.m10908r())) {
                        m10921a02--;
                    }
                } else if (m10921a02 < 0 && ((compareTo = d.m10914g0().compareTo(d2.m10914g0())) < 0 || (compareTo == 0 && d.m10908r() < d2.m10908r()))) {
                    m10921a02++;
                }
                return m10921a02;
            }
            return m10898e(d, d2, 1) / 60;
        }

        /* renamed from: f */
        private static void m10897f(long j) {
            if (j > 1200 || j < -1200) {
                throw new ArithmeticException("Month arithmetic limited to delta not greater than 1200.");
            }
        }

        /* renamed from: g */
        private static <D extends AbstractC10644f<?, D>> D m10896g(int i, int i2, C10651h c10651h, int i3, AbstractC10642d<D> abstractC10642d) {
            if (i3 <= 29) {
                return abstractC10642d.mo10945e(i, i2, c10651h, i3, abstractC10642d.m10930t(i, i2, c10651h, i3));
            }
            long m10930t = abstractC10642d.m10930t(i, i2, c10651h, 1);
            int min = Math.min(i3, abstractC10642d.mo10629b(m10930t).lengthOfMonth());
            return abstractC10642d.mo10945e(i, i2, c10651h, min, (m10930t + min) - 1);
        }

        /* JADX WARN: Type inference failed for: r0v16, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        @Override // p162ij.InterfaceC7659m0
        /* renamed from: c */
        public D mo10475b(D d, long j) {
            int i;
            long j2 = j;
            AbstractC10642d<D> mo10922Z = d.mo10922Z();
            int m10908r = d.m10908r();
            int m10921a0 = d.m10921a0();
            int number = d.m10910k0().getNumber();
            C10651h m10914g0 = d.m10914g0();
            int i2 = this.f27754a;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new UnsupportedOperationException();
                            }
                        } else {
                            j2 = C10616c.m11033i(j2, 7L);
                        }
                        return mo10922Z.mo10629b(C10616c.m11036f(d.mo10920b(), j2));
                    }
                    m10897f(j);
                    if (j2 > 0) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    int number2 = m10914g0.getNumber();
                    boolean m10871c = m10914g0.m10871c();
                    int m10943g = mo10922Z.m10943g(m10921a0, number);
                    for (long j3 = 0; j2 != j3; j3 = 0) {
                        if (m10871c) {
                            m10871c = false;
                            if (i == 1) {
                                number2++;
                            }
                        } else {
                            if (i != 1 || m10943g != number2) {
                                if (i == -1 && m10943g == number2 - 1) {
                                    number2--;
                                } else {
                                    number2 += i;
                                }
                            }
                            m10871c = true;
                        }
                        if (!m10871c) {
                            if (number2 == 13) {
                                number++;
                                if (number == 61) {
                                    m10921a0++;
                                    number = 1;
                                }
                                number2 = 1;
                                m10943g = mo10922Z.m10943g(m10921a0, number);
                            } else if (number2 == 0) {
                                number--;
                                if (number == 0) {
                                    m10921a0--;
                                    number = 60;
                                }
                                m10943g = mo10922Z.m10943g(m10921a0, number);
                                number2 = 12;
                            }
                        }
                        j2 -= i;
                    }
                    C10651h m10870d = C10651h.m10870d(number2);
                    if (m10871c) {
                        m10870d = m10870d.m10869e();
                    }
                    return (D) m10896g(m10921a0, number, m10870d, m10908r, mo10922Z);
                }
            } else {
                j2 = C10616c.m11033i(j2, 60L);
            }
            long m11036f = C10616c.m11036f(((m10921a0 * 60) + number) - 1, j2);
            int m11035g = C10616c.m11035g(C10616c.m11040b(m11036f, 60));
            int m11038d = C10616c.m11038d(m11036f, 60) + 1;
            if (m10914g0.m10871c() && mo10922Z.m10943g(m11035g, m11038d) != m10914g0.getNumber()) {
                m10914g0 = C10651h.m10870d(m10914g0.getNumber());
            }
            return (D) m10896g(m11035g, m11038d, m10914g0, m10908r, mo10922Z);
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: d */
        public long mo10476a(D d, D d2) {
            return m10898e(d, d2, this.f27754a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.calendar.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10648d<D extends AbstractC10644f<?, D>> implements InterfaceC7632c0<D> {

        /* renamed from: j */
        private final InterfaceC7664p<?> f27755j;

        /* renamed from: k */
        private final int f27756k;

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(D d) {
            return this.f27755j;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(D d) {
            return this.f27755j;
        }

        @Override // p162ij.InterfaceC7632c0
        /* renamed from: e */
        public int mo10646m(D d) {
            int i = this.f27756k;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return d.m10921a0();
                        }
                        throw new UnsupportedOperationException("Unknown element index: " + this.f27756k);
                    }
                    int number = d.m10914g0().getNumber();
                    int m10915f0 = d.m10915f0();
                    if ((m10915f0 > 0 && m10915f0 < number) || d.m10914g0().m10871c()) {
                        return number + 1;
                    }
                    return number;
                }
                return d.m10917d0();
            }
            return d.m10908r();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public Integer mo9922f(D d) {
            int lengthOfMonth;
            int i = this.f27756k;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            AbstractC10642d<D> mo10922Z = d.mo10922Z();
                            lengthOfMonth = ((AbstractC10644f) mo10922Z.mo10629b(mo10922Z.mo10630a())).m10921a0();
                        } else {
                            throw new UnsupportedOperationException("Unknown element index: " + this.f27756k);
                        }
                    } else if (d.isLeapYear()) {
                        lengthOfMonth = 13;
                    } else {
                        lengthOfMonth = 12;
                    }
                } else {
                    lengthOfMonth = d.lengthOfYear();
                }
            } else {
                lengthOfMonth = d.lengthOfMonth();
            }
            return Integer.valueOf(lengthOfMonth);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Integer mo9917l(D d) {
            if (this.f27756k == 3) {
                AbstractC10642d<D> mo10922Z = d.mo10922Z();
                return Integer.valueOf(((AbstractC10644f) mo10922Z.mo10629b(mo10922Z.mo10627d())).m10921a0());
            }
            return 1;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public Integer mo9915o(D d) {
            return Integer.valueOf(mo10646m(d));
        }

        /* renamed from: p */
        public boolean m10889p(D d, int i) {
            if (i < 1) {
                return false;
            }
            int i2 = this.f27756k;
            if (i2 == 0) {
                if (i > 30) {
                    return false;
                }
                if (i == 30 && d.lengthOfMonth() != 30) {
                    return false;
                }
                return true;
            } else if (i2 == 1) {
                if (i > d.lengthOfYear()) {
                    return false;
                }
                return true;
            } else if (i2 == 2) {
                if (i > 12 && (i != 13 || d.m10915f0() <= 0)) {
                    return false;
                }
                return true;
            } else if (i2 == 3) {
                AbstractC10642d<D> mo10922Z = d.mo10922Z();
                int m10921a0 = ((AbstractC10644f) mo10922Z.mo10629b(mo10922Z.mo10627d())).m10921a0();
                int m10921a02 = ((AbstractC10644f) mo10922Z.mo10629b(mo10922Z.mo10630a())).m10921a0();
                if (i < m10921a0 || i > m10921a02) {
                    return false;
                }
                return true;
            } else {
                throw new UnsupportedOperationException("Unknown element index: " + this.f27756k);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public boolean mo9920i(D d, Integer num) {
            return num != null && m10889p(d, num.intValue());
        }

        /* JADX WARN: Type inference failed for: r12v2, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r12v4, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r12v6, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        @Override // p162ij.InterfaceC7632c0
        /* renamed from: r */
        public D mo10650g(D d, int i, boolean z) {
            int i2 = this.f27756k;
            boolean z2 = true;
            if (i2 != 0) {
                if (i2 != 1) {
                    boolean z3 = false;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (m10889p(d, i)) {
                                return (D) AbstractC10644f.m10911j0(0).mo10475b(d, i - d.m10921a0());
                            }
                            throw new IllegalArgumentException("Sexagesimal cycle out of range: " + i);
                        }
                        throw new UnsupportedOperationException("Unknown element index: " + this.f27756k);
                    } else if (m10889p(d, i)) {
                        int m10915f0 = d.m10915f0();
                        if (m10915f0 > 0 && m10915f0 < i) {
                            if (i != m10915f0 + 1) {
                                z2 = false;
                            }
                            i--;
                            z3 = z2;
                        }
                        C10651h m10870d = C10651h.m10870d(i);
                        if (z3) {
                            m10870d = m10870d.m10869e();
                        }
                        return (D) C10649e.m10879p(d, m10870d);
                    } else {
                        throw new IllegalArgumentException("Ordinal month out of range: " + i);
                    }
                } else if (!z && (i < 1 || i > d.lengthOfYear())) {
                    throw new IllegalArgumentException("Day of year out of range: " + i);
                } else {
                    return d.mo10922Z().mo10629b((d.mo10920b() + i) - d.m10917d0());
                }
            } else if (z) {
                return d.mo10922Z().mo10629b((d.mo10920b() + i) - d.m10908r());
            } else if (i >= 1 && i <= 30 && (i != 30 || d.lengthOfMonth() >= 30)) {
                return d.mo10922Z().mo10945e(d.m10921a0(), d.m10910k0().getNumber(), d.m10914g0(), i, (d.mo10920b() + i) - d.m10908r());
            } else {
                throw new IllegalArgumentException("Day of month out of range: " + i);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: s */
        public D mo9916n(D d, Integer num, boolean z) {
            if (num != null) {
                return mo10650g(d, num.intValue(), z);
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        private C10648d(int i, InterfaceC7664p<?> interfaceC7664p) {
            this.f27756k = i;
            this.f27755j = interfaceC7664p;
        }
    }

    /* renamed from: net.time4j.calendar.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10649e<D extends AbstractC10644f<?, D>> implements InterfaceC7676z<D, C10651h> {

        /* renamed from: j */
        private final InterfaceC7664p<?> f27757j;

        /* JADX WARN: Type inference failed for: r9v1, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r9v2, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* renamed from: p */
        static <D extends AbstractC10644f<?, D>> D m10879p(D d, C10651h c10651h) {
            AbstractC10642d<D> mo10922Z = d.mo10922Z();
            int m10908r = d.m10908r();
            int number = d.m10910k0().getNumber();
            if (m10908r <= 29) {
                return mo10922Z.mo10945e(d.m10921a0(), number, c10651h, m10908r, mo10922Z.m10930t(d.m10921a0(), number, c10651h, m10908r));
            }
            long m10930t = mo10922Z.m10930t(d.m10921a0(), number, c10651h, 1);
            int min = Math.min(m10908r, mo10922Z.mo10629b(m10930t).lengthOfMonth());
            return mo10922Z.mo10945e(d.m10921a0(), number, c10651h, min, (m10930t + min) - 1);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(D d) {
            return this.f27757j;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(D d) {
            return this.f27757j;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public C10651h mo9922f(D d) {
            return C10651h.m10870d(12);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public C10651h mo9917l(D d) {
            return C10651h.m10870d(1);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public C10651h mo9915o(D d) {
            return d.m10914g0();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(D d, C10651h c10651h) {
            return c10651h != null && (!c10651h.m10871c() || c10651h.getNumber() == d.m10915f0());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public D mo9916n(D d, C10651h c10651h, boolean z) {
            if (mo9920i(d, c10651h)) {
                return (D) m10879p(d, c10651h);
            }
            throw new IllegalArgumentException("Invalid month: " + c10651h);
        }

        private C10649e(InterfaceC7664p<?> interfaceC7664p) {
            this.f27757j = interfaceC7664p;
        }
    }

    public AbstractC10644f(int i, int i2, C10651h c10651h, int i3, long j) {
        this.f27746j = i;
        this.f27747k = i2;
        this.f27748l = c10651h;
        this.f27749m = i3;
        this.f27750n = j;
        this.f27751o = mo10922Z().m10943g(i, i2);
    }

    /* renamed from: b0 */
    public static <D extends AbstractC10644f<?, D>> InterfaceC7676z<D, Integer> m10919b0(InterfaceC7664p<?> interfaceC7664p) {
        return new C10648d(3, interfaceC7664p);
    }

    /* renamed from: c0 */
    public static <D extends AbstractC10644f<?, D>> InterfaceC7676z<D, Integer> m10918c0() {
        return new C10648d(0, null);
    }

    /* renamed from: e0 */
    public static <D extends AbstractC10644f<?, D>> InterfaceC7676z<D, Integer> m10916e0() {
        return new C10648d(1, null);
    }

    /* renamed from: h0 */
    public static <D extends AbstractC10644f<?, D>> InterfaceC7676z<D, Integer> m10913h0(InterfaceC7664p<?> interfaceC7664p) {
        return new C10648d(2, interfaceC7664p);
    }

    /* renamed from: i0 */
    public static <D extends AbstractC10644f<?, D>> InterfaceC7676z<D, C10651h> m10912i0(InterfaceC7664p<?> interfaceC7664p) {
        return new C10649e(interfaceC7664p);
    }

    /* renamed from: j0 */
    public static <D extends AbstractC10644f<?, D>> InterfaceC7659m0<D> m10911j0(int i) {
        return new C10647c(i);
    }

    /* renamed from: l0 */
    public static <D extends AbstractC10644f<?, D>> InterfaceC7676z<D, C10640c> m10909l0(InterfaceC7664p<?> interfaceC7664p) {
        return new C10646b(interfaceC7664p, false);
    }

    /* renamed from: Z */
    public abstract AbstractC10642d<D> mo10922Z();

    /* renamed from: a0 */
    public int m10921a0() {
        return this.f27746j;
    }

    @Override // p162ij.AbstractC7658m, p162ij.InterfaceC7641g
    /* renamed from: b */
    public long mo10920b() {
        return this.f27750n;
    }

    /* renamed from: d0 */
    public int m10917d0() {
        return (int) ((this.f27750n - mo10922Z().m10933q(this.f27746j, this.f27747k)) + 1);
    }

    @Override // p162ij.AbstractC7658m
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC10644f abstractC10644f = (AbstractC10644f) obj;
        if (this.f27746j == abstractC10644f.f27746j && this.f27747k == abstractC10644f.f27747k && this.f27749m == abstractC10644f.f27749m && this.f27748l.equals(abstractC10644f.f27748l) && this.f27750n == abstractC10644f.f27750n) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    int m10915f0() {
        return this.f27751o;
    }

    /* renamed from: g0 */
    public C10651h m10914g0() {
        return this.f27748l;
    }

    @Override // p162ij.AbstractC7658m
    public int hashCode() {
        long j = this.f27750n;
        return (int) (j ^ (j >>> 32));
    }

    public boolean isLeapYear() {
        return this.f27751o > 0;
    }

    /* renamed from: k0 */
    public C10640c m10910k0() {
        return C10640c.m10947o(this.f27747k);
    }

    public int lengthOfMonth() {
        return (int) (((this.f27749m + mo10922Z().m10934p(this.f27750n + 1)) - this.f27750n) - 1);
    }

    public int lengthOfYear() {
        int i = this.f27746j;
        int i2 = 1;
        int i3 = this.f27747k + 1;
        if (i3 > 60) {
            i++;
        } else {
            i2 = i3;
        }
        return (int) (mo10922Z().m10933q(i, i2) - mo10922Z().m10933q(this.f27746j, this.f27747k));
    }

    /* renamed from: r */
    public int m10908r() {
        return this.f27749m;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String value = ((InterfaceC8977c) getClass().getAnnotation(InterfaceC8977c.class)).value();
        if (value.equals("dangi")) {
            value = "korean";
        }
        sb2.append(value);
        sb2.append('[');
        sb2.append(m10910k0().m10811g(Locale.ROOT));
        sb2.append('(');
        sb2.append(mo10218c(C10632b.f27731a));
        sb2.append(")-");
        sb2.append(this.f27748l.toString());
        sb2.append('-');
        if (this.f27749m < 10) {
            sb2.append('0');
        }
        sb2.append(this.f27749m);
        sb2.append(']');
        return sb2.toString();
    }
}