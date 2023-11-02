package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.base.AbstractC10617d;
import net.time4j.base.C10615b;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10614a;
import p162ij.AbstractC7635e;
import p162ij.AbstractC7665q;
import p162ij.C7672x;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7660n;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7676z;
import p164j$.util.concurrent.ConcurrentHashMap;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.C9013s;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9002l;
import p184jj.InterfaceC9014t;
import p184jj.InterfaceC9029y;

/* renamed from: net.time4j.z0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10852z0 implements Serializable {
    private static final long serialVersionUID = 7794495882610436763L;

    /* renamed from: u */
    private static final Map<Locale, C10852z0> f28325u = new ConcurrentHashMap();

    /* renamed from: v */
    public static final C10852z0 f28326v = new C10852z0(EnumC10846x0.MONDAY, 4, EnumC10846x0.SATURDAY, EnumC10846x0.SUNDAY);

    /* renamed from: w */
    private static final InterfaceC9029y f28327w;

    /* renamed from: j */
    private final transient EnumC10846x0 f28328j;

    /* renamed from: k */
    private final transient int f28329k;

    /* renamed from: l */
    private final transient EnumC10846x0 f28330l;

    /* renamed from: m */
    private final transient EnumC10846x0 f28331m;

    /* renamed from: n */
    private final transient InterfaceC10622c<Integer, C10697f0> f28332n;

    /* renamed from: o */
    private final transient InterfaceC10622c<Integer, C10697f0> f28333o;

    /* renamed from: p */
    private final transient InterfaceC10622c<Integer, C10697f0> f28334p;

    /* renamed from: q */
    private final transient InterfaceC10622c<Integer, C10697f0> f28335q;

    /* renamed from: r */
    private final transient InterfaceC10623c0<EnumC10846x0> f28336r;

    /* renamed from: s */
    private final transient Set<InterfaceC7664p<?>> f28337s;

    /* renamed from: t */
    private final transient InterfaceC7660n<InterfaceC10614a> f28338t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.z0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C10853a implements InterfaceC7660n<InterfaceC10614a> {

        /* renamed from: j */
        final /* synthetic */ EnumC10846x0 f28339j;

        /* renamed from: k */
        final /* synthetic */ EnumC10846x0 f28340k;

        C10853a(EnumC10846x0 enumC10846x0, EnumC10846x0 enumC10846x02) {
            C10852z0.this = r1;
            this.f28339j = enumC10846x0;
            this.f28340k = enumC10846x02;
        }

        @Override // p162ij.InterfaceC7660n
        /* renamed from: a */
        public boolean test(InterfaceC10614a interfaceC10614a) {
            EnumC10846x0 m9993f = EnumC10846x0.m9993f(C10615b.m11052c(interfaceC10614a.mo10482o(), interfaceC10614a.mo10481p(), interfaceC10614a.mo10480r()));
            if (m9993f != this.f28339j && m9993f != this.f28340k) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: net.time4j.z0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10854b<T extends AbstractC7665q<T>> implements InterfaceC7676z<T, Integer> {

        /* renamed from: j */
        private final C10856d f28342j;

        /* synthetic */ C10854b(C10856d c10856d, C10853a c10853a) {
            this(c10856d);
        }

        /* renamed from: a */
        private InterfaceC7664p<?> m9963a(T t, boolean z) {
            int i;
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(C10697f0.f27906w);
            InterfaceC10623c0<EnumC10846x0> m9970i = this.f28342j.m9933D().m9970i();
            int intValue = mo9915o(t).intValue();
            if (z) {
                if (this.f28342j.m9931F()) {
                    i = 52;
                } else {
                    i = 4;
                }
                if (intValue >= i) {
                    C10697f0 c10697f02 = (C10697f0) c10697f0.mo14419F(m9970i, t.mo10211l(m9970i));
                    if (this.f28342j.m9931F()) {
                        if (c10697f02.m10719G0() < c10697f0.m10719G0()) {
                            return C10697f0.f27890F;
                        }
                    } else if (c10697f02.mo10480r() < c10697f0.mo10480r()) {
                        return C10697f0.f27888D;
                    }
                }
            } else if (intValue <= 1) {
                C10697f0 c10697f03 = (C10697f0) c10697f0.mo14419F(m9970i, t.mo10215f(m9970i));
                if (this.f28342j.m9931F()) {
                    if (c10697f03.m10719G0() > c10697f0.m10719G0()) {
                        return C10697f0.f27890F;
                    }
                } else if (c10697f03.mo10480r() > c10697f0.mo10480r()) {
                    return C10697f0.f27888D;
                }
            }
            return m9970i;
        }

        /* renamed from: h */
        private int m9960h(C10697f0 c10697f0) {
            if (this.f28342j.m9931F()) {
                if (C10615b.m11050e(c10697f0.mo10482o())) {
                    return 366;
                }
                return 365;
            }
            return C10615b.m11051d(c10697f0.mo10482o(), c10697f0.mo10481p());
        }

        /* renamed from: j */
        private int m9959j(C10697f0 c10697f0) {
            return m9953t(c10697f0, 1);
        }

        /* renamed from: p */
        private int m9957p(C10697f0 c10697f0) {
            return m9953t(c10697f0, -1);
        }

        /* renamed from: s */
        private int m9954s(C10697f0 c10697f0) {
            return m9953t(c10697f0, 0);
        }

        /* renamed from: t */
        private int m9953t(C10697f0 c10697f0, int i) {
            int mo10480r;
            int i2;
            if (this.f28342j.m9931F()) {
                mo10480r = c10697f0.m10719G0();
            } else {
                mo10480r = c10697f0.mo10480r();
            }
            int m9996c = C10852z0.m9976c((c10697f0.m10718H0() - mo10480r) + 1).m9996c(this.f28342j.m9933D());
            if (m9996c <= 8 - this.f28342j.m9933D().m9972g()) {
                i2 = 2 - m9996c;
            } else {
                i2 = 9 - m9996c;
            }
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        mo10480r = m9960h(c10697f0);
                    } else {
                        throw new AssertionError("Unexpected: " + i);
                    }
                }
            } else {
                mo10480r = 1;
            }
            return C10616c.m11041a(mo10480r - i2, 7) + 1;
        }

        /* renamed from: v */
        private C10697f0 m9951v(C10697f0 c10697f0, int i) {
            int m9954s = m9954s(c10697f0);
            if (i == m9954s) {
                return c10697f0;
            }
            return c10697f0.m10701X0(c10697f0.m10718H0() + ((i - m9954s) * 7));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9926b(T t) {
            return m9963a(t, true);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9925c(T t) {
            return m9963a(t, false);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public Integer mo9922f(T t) {
            return Integer.valueOf(m9959j((C10697f0) t.mo10212i(C10697f0.f27906w)));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public Integer mo9917l(T t) {
            return Integer.valueOf(m9957p((C10697f0) t.mo10212i(C10697f0.f27906w)));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: r */
        public Integer mo9915o(T t) {
            return Integer.valueOf(m9954s((C10697f0) t.mo10212i(C10697f0.f27906w)));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: u */
        public boolean mo9920i(T t, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(C10697f0.f27906w);
            if (intValue < m9957p(c10697f0) || intValue > m9959j(c10697f0)) {
                return false;
            }
            return true;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: w */
        public T mo9916n(T t, Integer num, boolean z) {
            InterfaceC7664p<C10697f0> interfaceC7664p = C10697f0.f27906w;
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(interfaceC7664p);
            if (num != null && (z || mo9920i(t, num))) {
                return (T) t.mo14419F(interfaceC7664p, m9951v(c10697f0, num.intValue()));
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + t + ")");
        }

        private C10854b(C10856d c10856d) {
            this.f28342j = c10856d;
        }
    }

    /* renamed from: net.time4j.z0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10855c<T extends AbstractC7665q<T>> implements InterfaceC7676z<T, Integer> {

        /* renamed from: j */
        private final C10856d f28343j;

        /* synthetic */ C10855c(C10856d c10856d, C10853a c10853a) {
            this(c10856d);
        }

        /* renamed from: a */
        private int m9949a(C10697f0 c10697f0) {
            int mo10480r;
            if (this.f28343j.m9931F()) {
                mo10480r = c10697f0.m10719G0();
            } else {
                mo10480r = c10697f0.mo10480r();
            }
            int m9945j = m9945j(c10697f0, 0);
            if (m9945j <= mo10480r) {
                int i = ((mo10480r - m9945j) / 7) + 1;
                if ((i >= 53 || (!this.f28343j.m9931F() && i >= 5)) && m9945j(c10697f0, 1) + m9944k(c10697f0, 0) <= mo10480r) {
                    return 1;
                }
                return i;
            }
            return (((mo10480r + m9944k(c10697f0, -1)) - m9945j(c10697f0, -1)) / 7) + 1;
        }

        /* renamed from: d */
        private InterfaceC7664p<?> m9948d() {
            return this.f28343j.m9933D().m9970i();
        }

        /* renamed from: j */
        private int m9945j(C10697f0 c10697f0, int i) {
            EnumC10846x0 m9939t = m9939t(c10697f0, i);
            C10852z0 m9933D = this.f28343j.m9933D();
            int m9996c = m9939t.m9996c(m9933D);
            if (m9996c <= 8 - m9933D.m9972g()) {
                return 2 - m9996c;
            }
            return 9 - m9996c;
        }

        /* renamed from: k */
        private int m9944k(C10697f0 c10697f0, int i) {
            if (this.f28343j.m9931F()) {
                if (C10615b.m11050e(c10697f0.mo10482o() + i)) {
                    return 366;
                }
                return 365;
            }
            int mo10482o = c10697f0.mo10482o();
            int mo10481p = c10697f0.mo10481p() + i;
            if (mo10481p == 0) {
                mo10482o--;
                mo10481p = 12;
            } else if (mo10481p == 13) {
                mo10482o++;
                mo10481p = 1;
            }
            return C10615b.m11051d(mo10482o, mo10481p);
        }

        /* renamed from: p */
        private int m9943p(C10697f0 c10697f0) {
            int mo10480r;
            if (this.f28343j.m9931F()) {
                mo10480r = c10697f0.m10719G0();
            } else {
                mo10480r = c10697f0.mo10480r();
            }
            int m9945j = m9945j(c10697f0, 0);
            if (m9945j <= mo10480r) {
                int m9945j2 = m9945j(c10697f0, 1) + m9944k(c10697f0, 0);
                if (m9945j2 <= mo10480r) {
                    try {
                        int m9945j3 = m9945j(c10697f0, 1);
                        m9945j2 = m9945j(c10697f0, 2) + m9944k(c10697f0, 1);
                        m9945j = m9945j3;
                    } catch (RuntimeException unused) {
                        m9945j2 += 7;
                    }
                }
                return (m9945j2 - m9945j) / 7;
            }
            return ((m9945j + m9944k(c10697f0, -1)) - m9945j(c10697f0, -1)) / 7;
        }

        /* renamed from: t */
        private EnumC10846x0 m9939t(C10697f0 c10697f0, int i) {
            if (this.f28343j.m9931F()) {
                return EnumC10846x0.m9993f(C10615b.m11052c(c10697f0.mo10482o() + i, 1, 1));
            }
            int mo10482o = c10697f0.mo10482o();
            int mo10481p = c10697f0.mo10481p() + i;
            if (mo10481p == 0) {
                mo10482o--;
                mo10481p = 12;
            } else if (mo10481p == 13) {
                mo10482o++;
                mo10481p = 1;
            } else if (mo10481p == 14) {
                mo10482o++;
                mo10481p = 2;
            }
            return EnumC10846x0.m9993f(C10615b.m11052c(mo10482o, mo10481p, 1));
        }

        /* renamed from: v */
        private C10697f0 m9937v(C10697f0 c10697f0, int i) {
            int m9949a = m9949a(c10697f0);
            if (i == m9949a) {
                return c10697f0;
            }
            return c10697f0.m10701X0(c10697f0.m10718H0() + ((i - m9949a) * 7));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9926b(T t) {
            return m9948d();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public InterfaceC7664p<?> mo9925c(T t) {
            return m9948d();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public Integer mo9922f(T t) {
            return Integer.valueOf(m9943p((C10697f0) t.mo10212i(C10697f0.f27906w)));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: r */
        public Integer mo9917l(T t) {
            return 1;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: s */
        public Integer mo9915o(T t) {
            return Integer.valueOf(m9949a((C10697f0) t.mo10212i(C10697f0.f27906w)));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: u */
        public boolean mo9920i(T t, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            if (this.f28343j.m9931F() && intValue >= 1 && intValue <= 52) {
                return true;
            }
            if (this.f28343j.m9931F() && intValue != 53) {
                return false;
            }
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(C10697f0.f27906w);
            if (intValue < 1 || intValue > m9943p(c10697f0)) {
                return false;
            }
            return true;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: w */
        public T mo9916n(T t, Integer num, boolean z) {
            InterfaceC7664p<C10697f0> interfaceC7664p = C10697f0.f27906w;
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(interfaceC7664p);
            if (num != null && (z || mo9920i(t, num))) {
                return (T) t.mo14419F(interfaceC7664p, m9937v(c10697f0, num.intValue()));
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + t + ")");
        }

        private C10855c(C10856d c10856d) {
            this.f28343j = c10856d;
        }
    }

    /* renamed from: net.time4j.z0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C10856d extends AbstractC10581a<Integer> {
        private static final long serialVersionUID = -5936254509996557266L;
        private final int category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10856d(String str, int i) {
            super(str);
            C10852z0.this = r1;
            this.category = i;
        }

        /* renamed from: D */
        public C10852z0 m9933D() {
            return C10852z0.this;
        }

        /* renamed from: E */
        private boolean m9932E() {
            return this.category >= 2;
        }

        /* renamed from: F */
        public boolean m9931F() {
            return this.category % 2 == 0;
        }

        private Object readResolve() {
            C10852z0 m9933D = m9933D();
            int i = this.category;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return m9933D.m9978a();
                        }
                        throw new InvalidObjectException("Unknown category: " + this.category);
                    }
                    return m9933D.m9977b();
                }
                return m9933D.m9966m();
            }
            return m9933D.m9965n();
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: B */
        public Integer mo9551e() {
            return Integer.valueOf(m9931F() ? 52 : 5);
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: C */
        public Integer mo9554U() {
            return 1;
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
            int i = this.category;
            if (i != 0) {
                if (i != 1) {
                    return super.mo9552a();
                }
                return 'W';
            }
            return 'w';
        }

        @Override // p162ij.InterfaceC7664p
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
        /* renamed from: k */
        public boolean mo9930k() {
            return true;
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: p */
        public <T extends AbstractC7665q<T>> InterfaceC7676z<T, Integer> mo9901p(C7672x<T> c7672x) {
            if (!c7672x.m20107w(C10697f0.f27906w)) {
                return null;
            }
            if (m9932E()) {
                return new C10854b(this, null);
            }
            return new C10855c(this, null);
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: q */
        protected boolean mo9900q(AbstractC7635e<?> abstractC7635e) {
            return m9933D().equals(((C10856d) abstractC7635e).m9933D());
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: s */
        public InterfaceC7664p<?> mo9899s() {
            return C10697f0.f27892H;
        }
    }

    /* renamed from: net.time4j.z0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10857e<T extends AbstractC7665q<T>> implements InterfaceC7676z<T, EnumC10846x0> {

        /* renamed from: j */
        final C10858f f28344j;

        /* synthetic */ C10857e(C10858f c10858f, C10853a c10853a) {
            this(c10858f);
        }

        /* renamed from: a */
        private InterfaceC7664p<?> m9927a(T t) {
            InterfaceC7664p<C10711g0> interfaceC7664p = C10711g0.f27966x;
            if (t.mo10210q(interfaceC7664p)) {
                return interfaceC7664p;
            }
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9926b(T t) {
            return m9927a(t);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9925c(T t) {
            return m9927a(t);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public EnumC10846x0 mo9922f(T t) {
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(C10697f0.f27906w);
            if ((c10697f0.mo10920b() + 7) - c10697f0.m10720F0().m9996c(this.f28344j.m9910D()) > C10697f0.m10673w0().mo20115n().mo10630a()) {
                return EnumC10846x0.FRIDAY;
            }
            return this.f28344j.mo9551e();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public EnumC10846x0 mo9917l(T t) {
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(C10697f0.f27906w);
            if ((c10697f0.mo10920b() + 1) - c10697f0.m10720F0().m9996c(this.f28344j.m9910D()) < C10697f0.m10673w0().mo20115n().mo10627d()) {
                return EnumC10846x0.MONDAY;
            }
            return this.f28344j.mo9554U();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public EnumC10846x0 mo9915o(T t) {
            return ((C10697f0) t.mo10212i(C10697f0.f27906w)).m10720F0();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public boolean mo9920i(T t, EnumC10846x0 enumC10846x0) {
            if (enumC10846x0 == null) {
                return false;
            }
            try {
                mo9916n(t, enumC10846x0, false);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public T mo9916n(T t, EnumC10846x0 enumC10846x0, boolean z) {
            if (enumC10846x0 != null) {
                InterfaceC7664p<C10697f0> interfaceC7664p = C10697f0.f27906w;
                C10697f0 c10697f0 = (C10697f0) t.mo10212i(interfaceC7664p);
                long m10718H0 = c10697f0.m10718H0();
                EnumC10846x0 m9976c = C10852z0.m9976c(m10718H0);
                if (enumC10846x0 == m9976c) {
                    return t;
                }
                return (T) t.mo14419F(interfaceC7664p, c10697f0.m10701X0((m10718H0 + enumC10846x0.m9996c(this.f28344j.m9910D())) - m9976c.m9996c(this.f28344j.m9910D())));
            }
            throw new IllegalArgumentException("Missing weekday.");
        }

        private C10857e(C10858f c10858f) {
            this.f28344j = c10858f;
        }
    }

    /* renamed from: net.time4j.z0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C10858f extends AbstractC10581a<EnumC10846x0> implements InterfaceC10623c0<EnumC10846x0>, InterfaceC9002l<EnumC10846x0>, InterfaceC9014t<EnumC10846x0> {
        private static final long serialVersionUID = 1945670789283677398L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10858f() {
            super("LOCAL_DAY_OF_WEEK");
            C10852z0.this = r1;
        }

        /* renamed from: D */
        public C10852z0 m9910D() {
            return C10852z0.this;
        }

        private Object readResolve() {
            return C10852z0.this.m9970i();
        }

        /* renamed from: y */
        private C9013s m9897y(InterfaceC7633d interfaceC7633d, EnumC9003m enumC9003m) {
            return C8972b.m16914d((Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT)).m16902p((EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE), enumC9003m);
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: B */
        public EnumC10846x0 mo9551e() {
            return C10852z0.this.m9973f().m9995d(6);
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: C */
        public EnumC10846x0 mo9554U() {
            return C10852z0.this.m9973f();
        }

        /* renamed from: E */
        public int m9909E(EnumC10846x0 enumC10846x0) {
            return enumC10846x0.m9996c(C10852z0.this);
        }

        @Override // p184jj.InterfaceC9014t
        /* renamed from: F */
        public EnumC10846x0 mo9903d(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d) {
            int index = parsePosition.getIndex();
            InterfaceC7631c<EnumC9003m> interfaceC7631c = C8969a.f23567h;
            EnumC9003m enumC9003m = EnumC9003m.FORMAT;
            EnumC9003m enumC9003m2 = (EnumC9003m) interfaceC7633d.mo14441b(interfaceC7631c, enumC9003m);
            EnumC10846x0 enumC10846x0 = (EnumC10846x0) m9897y(interfaceC7633d, enumC9003m2).m16858c(charSequence, parsePosition, getType(), interfaceC7633d);
            if (enumC10846x0 == null && ((Boolean) interfaceC7633d.mo14441b(C8969a.f23570k, Boolean.TRUE)).booleanValue()) {
                parsePosition.setErrorIndex(-1);
                parsePosition.setIndex(index);
                if (enumC9003m2 == enumC9003m) {
                    enumC9003m = EnumC9003m.STANDALONE;
                }
                return (EnumC10846x0) m9897y(interfaceC7633d, enumC9003m).m16858c(charSequence, parsePosition, getType(), interfaceC7633d);
            }
            return enumC10846x0;
        }

        @Override // p184jj.InterfaceC9002l
        /* renamed from: G */
        public boolean mo9907G(AbstractC7665q<?> abstractC7665q, int i) {
            EnumC10846x0[] values;
            for (EnumC10846x0 enumC10846x0 : EnumC10846x0.values()) {
                if (enumC10846x0.m9996c(C10852z0.this) == i) {
                    abstractC7665q.mo14419F(this, enumC10846x0);
                    return true;
                }
            }
            return false;
        }

        @Override // p184jj.InterfaceC9002l
        /* renamed from: I */
        public int mo9906H(EnumC10846x0 enumC10846x0, InterfaceC7662o interfaceC7662o, InterfaceC7633d interfaceC7633d) {
            return m9909E(enumC10846x0);
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: M */
        public boolean mo9555M() {
            return true;
        }

        @Override // p184jj.InterfaceC9014t
        /* renamed from: Q */
        public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
            appendable.append(m9897y(interfaceC7633d, (EnumC9003m) interfaceC7633d.mo14441b(C8969a.f23567h, EnumC9003m.FORMAT)).m16855f((Enum) interfaceC7662o.mo10212i(this)));
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: V */
        public boolean mo9553V() {
            return false;
        }

        @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
        /* renamed from: a */
        public char mo9552a() {
            return 'e';
        }

        @Override // p162ij.InterfaceC7664p
        public Class<EnumC10846x0> getType() {
            return EnumC10846x0.class;
        }

        @Override // p162ij.AbstractC7635e, java.util.Comparator
        /* renamed from: j */
        public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
            int m9996c = ((EnumC10846x0) interfaceC7662o.mo10212i(this)).m9996c(C10852z0.this);
            int m9996c2 = ((EnumC10846x0) interfaceC7662o2.mo10212i(this)).m9996c(C10852z0.this);
            if (m9996c < m9996c2) {
                return -1;
            }
            if (m9996c == m9996c2) {
                return 0;
            }
            return 1;
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: p */
        public <T extends AbstractC7665q<T>> InterfaceC7676z<T, EnumC10846x0> mo9901p(C7672x<T> c7672x) {
            if (!c7672x.m20107w(C10697f0.f27906w)) {
                return null;
            }
            return new C10857e(this, null);
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: q */
        protected boolean mo9900q(AbstractC7635e<?> abstractC7635e) {
            return m9910D().equals(((C10858f) abstractC7635e).m9910D());
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: s */
        public InterfaceC7664p<?> mo9899s() {
            return C10697f0.f27889E;
        }
    }

    static {
        InterfaceC9029y interfaceC9029y;
        Iterator it = AbstractC10617d.m11026c().mo11022g(InterfaceC9029y.class).iterator();
        if (it.hasNext()) {
            interfaceC9029y = (InterfaceC9029y) it.next();
        } else {
            interfaceC9029y = null;
        }
        f28327w = interfaceC9029y;
    }

    private C10852z0(EnumC10846x0 enumC10846x0, int i, EnumC10846x0 enumC10846x02, EnumC10846x0 enumC10846x03) {
        if (enumC10846x0 != null) {
            if (i >= 1 && i <= 7) {
                if (enumC10846x02 != null) {
                    if (enumC10846x03 != null) {
                        this.f28328j = enumC10846x0;
                        this.f28329k = i;
                        this.f28330l = enumC10846x02;
                        this.f28331m = enumC10846x03;
                        C10856d c10856d = new C10856d("WEEK_OF_YEAR", 0);
                        this.f28332n = c10856d;
                        C10856d c10856d2 = new C10856d("WEEK_OF_MONTH", 1);
                        this.f28333o = c10856d2;
                        C10856d c10856d3 = new C10856d("BOUNDED_WEEK_OF_YEAR", 2);
                        this.f28334p = c10856d3;
                        C10856d c10856d4 = new C10856d("BOUNDED_WEEK_OF_MONTH", 3);
                        this.f28335q = c10856d4;
                        C10858f c10858f = new C10858f();
                        this.f28336r = c10858f;
                        this.f28338t = new C10853a(enumC10846x02, enumC10846x03);
                        HashSet hashSet = new HashSet();
                        hashSet.add(c10856d);
                        hashSet.add(c10856d2);
                        hashSet.add(c10858f);
                        hashSet.add(c10856d3);
                        hashSet.add(c10856d4);
                        this.f28337s = Collections.unmodifiableSet(hashSet);
                        return;
                    }
                    throw new NullPointerException("Missing end of weekend.");
                }
                throw new NullPointerException("Missing start of weekend.");
            }
            throw new IllegalArgumentException("Minimal days in first week out of range: " + i);
        }
        throw new NullPointerException("Missing first day of week.");
    }

    /* renamed from: c */
    static EnumC10846x0 m9976c(long j) {
        return EnumC10846x0.m9993f(C10616c.m11038d(j + 5, 7) + 1);
    }

    /* renamed from: j */
    public static C10852z0 m9969j(Locale locale) {
        int i;
        if (locale.getCountry().isEmpty()) {
            return f28326v;
        }
        Map<Locale, C10852z0> map = f28325u;
        C10852z0 c10852z0 = map.get(locale);
        if (c10852z0 != null) {
            return c10852z0;
        }
        InterfaceC9029y interfaceC9029y = f28327w;
        if (interfaceC9029y == null) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
            int firstDayOfWeek = gregorianCalendar.getFirstDayOfWeek();
            if (firstDayOfWeek == 1) {
                i = 7;
            } else {
                i = firstDayOfWeek - 1;
            }
            return m9968k(EnumC10846x0.m9993f(i), gregorianCalendar.getMinimalDaysInFirstWeek());
        }
        C10852z0 c10852z02 = new C10852z0(EnumC10846x0.m9993f(interfaceC9029y.mo8982d(locale)), interfaceC9029y.mo8984b(locale), EnumC10846x0.m9993f(interfaceC9029y.mo8983c(locale)), EnumC10846x0.m9993f(interfaceC9029y.mo8985a(locale)));
        if (map.size() > 150) {
            map.clear();
        }
        map.put(locale, c10852z02);
        return c10852z02;
    }

    /* renamed from: k */
    public static C10852z0 m9968k(EnumC10846x0 enumC10846x0, int i) {
        return m9967l(enumC10846x0, i, EnumC10846x0.SATURDAY, EnumC10846x0.SUNDAY);
    }

    /* renamed from: l */
    public static C10852z0 m9967l(EnumC10846x0 enumC10846x0, int i, EnumC10846x0 enumC10846x02, EnumC10846x0 enumC10846x03) {
        if (enumC10846x0 == EnumC10846x0.MONDAY && i == 4 && enumC10846x02 == EnumC10846x0.SATURDAY && enumC10846x03 == EnumC10846x0.SUNDAY) {
            return f28326v;
        }
        return new C10852z0(enumC10846x0, i, enumC10846x02, enumC10846x03);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    /* renamed from: a */
    public InterfaceC10622c<Integer, C10697f0> m9978a() {
        return this.f28335q;
    }

    /* renamed from: b */
    public InterfaceC10622c<Integer, C10697f0> m9977b() {
        return this.f28334p;
    }

    /* renamed from: d */
    public Set<InterfaceC7664p<?>> m9975d() {
        return this.f28337s;
    }

    /* renamed from: e */
    public EnumC10846x0 m9974e() {
        return this.f28331m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10852z0)) {
            return false;
        }
        C10852z0 c10852z0 = (C10852z0) obj;
        if (this.f28328j == c10852z0.f28328j && this.f28329k == c10852z0.f28329k && this.f28330l == c10852z0.f28330l && this.f28331m == c10852z0.f28331m) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public EnumC10846x0 m9973f() {
        return this.f28328j;
    }

    /* renamed from: g */
    public int m9972g() {
        return this.f28329k;
    }

    /* renamed from: h */
    public EnumC10846x0 m9971h() {
        return this.f28330l;
    }

    public int hashCode() {
        return (this.f28328j.name().hashCode() * 17) + (this.f28329k * 37);
    }

    /* renamed from: i */
    public InterfaceC10623c0<EnumC10846x0> m9970i() {
        return this.f28336r;
    }

    /* renamed from: m */
    public InterfaceC10622c<Integer, C10697f0> m9966m() {
        return this.f28333o;
    }

    /* renamed from: n */
    public InterfaceC10622c<Integer, C10697f0> m9965n() {
        return this.f28332n;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C10852z0.class.getName());
        sb2.append("[firstDayOfWeek=");
        sb2.append(this.f28328j);
        sb2.append(",minimalDaysInFirstWeek=");
        sb2.append(this.f28329k);
        sb2.append(",startOfWeekend=");
        sb2.append(this.f28330l);
        sb2.append(",endOfWeekend=");
        sb2.append(this.f28331m);
        sb2.append(']');
        return sb2.toString();
    }
}