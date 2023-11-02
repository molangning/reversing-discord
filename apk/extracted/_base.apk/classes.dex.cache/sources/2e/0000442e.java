package net.time4j.calendar;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import net.time4j.C10852z0;
import net.time4j.EnumC10846x0;
import net.time4j.base.C10616c;
import net.time4j.calendar.service.C10679e;
import net.time4j.calendar.service.C10680f;
import p162ij.AbstractC7635e;
import p162ij.AbstractC7655l;
import p162ij.AbstractC7665q;
import p162ij.C7672x;
import p162ij.EnumC7627a0;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7667s;
import p162ij.InterfaceC7676z;

/* renamed from: net.time4j.calendar.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C10632b {

    /* renamed from: a */
    public static final InterfaceC7664p<Integer> f27731a = C10662m.f27768j;

    /* renamed from: net.time4j.calendar.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10634b<D extends AbstractC7665q<D>> implements InterfaceC7676z<D, Integer> {

        /* renamed from: j */
        private final C10636d<?> f27732j;

        /* renamed from: a */
        private InterfaceC7664p<?> m10990a(D d, boolean z) {
            C10638f m10949X = C10638f.m10949X(d.getClass(), ((C10636d) this.f27732j).model);
            int m10982r = m10982r(d);
            EnumC7627a0 enumC7627a0 = EnumC7627a0.UTC;
            long longValue = ((Long) d.mo10212i(enumC7627a0)).longValue();
            int mo10218c = d.mo10218c(((C10636d) this.f27732j).dayElement);
            if (z) {
                if (((Integer) d.mo10211l(((C10636d) this.f27732j).dayElement)).intValue() < mo10218c + (((Long) d.mo14419F(m10949X, d.mo10211l(m10949X)).mo10212i(enumC7627a0)).longValue() - longValue)) {
                    return ((C10636d) this.f27732j).dayElement;
                }
            } else if (m10982r <= 1) {
                if (((Integer) d.mo10215f(((C10636d) this.f27732j).dayElement)).intValue() > mo10218c - (longValue - ((Long) d.mo14419F(m10949X, d.mo10215f(m10949X)).mo10212i(enumC7627a0)).longValue())) {
                    return ((C10636d) this.f27732j).dayElement;
                }
            }
            return m10949X;
        }

        /* renamed from: h */
        private int m10987h(D d) {
            return m10981s(d, 1);
        }

        /* renamed from: k */
        private int m10985k(D d) {
            return m10981s(d, -1);
        }

        /* renamed from: r */
        private int m10982r(D d) {
            return m10981s(d, 0);
        }

        /* renamed from: s */
        private int m10981s(D d, int i) {
            int i2;
            int mo10218c = d.mo10218c(((C10636d) this.f27732j).dayElement);
            int m9996c = C10632b.m10992c((((Long) d.mo10212i(EnumC7627a0.UTC)).longValue() - mo10218c) + 1).m9996c(((C10636d) this.f27732j).model);
            if (m9996c <= 8 - ((C10636d) this.f27732j).model.m9972g()) {
                i2 = 2 - m9996c;
            } else {
                i2 = 9 - m9996c;
            }
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        mo10218c = ((Integer) d.mo10211l(((C10636d) this.f27732j).dayElement)).intValue();
                    } else {
                        throw new AssertionError("Unexpected: " + i);
                    }
                }
            } else {
                mo10218c = 1;
            }
            return C10616c.m11041a(mo10218c - i2, 7) + 1;
        }

        /* renamed from: u */
        private D m10979u(D d, int i) {
            int m10982r = m10982r(d);
            if (i == m10982r) {
                return d;
            }
            EnumC7627a0 enumC7627a0 = EnumC7627a0.UTC;
            return (D) d.m20121E(enumC7627a0, ((Long) d.mo10212i(enumC7627a0)).longValue() + ((i - m10982r) * 7));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9926b(D d) {
            return m10990a(d, true);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9925c(D d) {
            return m10990a(d, false);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Integer mo9922f(D d) {
            return Integer.valueOf(m10987h(d));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public Integer mo9917l(D d) {
            return Integer.valueOf(m10985k(d));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public Integer mo9915o(D d) {
            return Integer.valueOf(m10982r(d));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: t */
        public boolean mo9920i(D d, Integer num) {
            int intValue;
            if (num == null || (intValue = num.intValue()) < m10985k(d) || intValue > m10987h(d)) {
                return false;
            }
            return true;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: v */
        public D mo9916n(D d, Integer num, boolean z) {
            if (num != null && (z || mo9920i(d, num))) {
                return m10979u(d, num.intValue());
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + d + ")");
        }

        private C10634b(C10636d<?> c10636d) {
            this.f27732j = c10636d;
        }
    }

    /* renamed from: net.time4j.calendar.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10635c<D extends AbstractC7665q<D>> implements InterfaceC7676z<D, Integer> {

        /* renamed from: j */
        private final C10636d<?> f27733j;

        /* renamed from: a */
        private int m10977a(D d) {
            int m10972k;
            int mo10218c = d.mo10218c(((C10636d) this.f27733j).dayElement);
            int m10973j = m10973j(d, 0);
            if (m10973j <= mo10218c) {
                if (m10973j(d, 1) + m10972k(d, 0) <= mo10218c) {
                    return 1;
                }
                m10972k = (mo10218c - m10973j) / 7;
            } else {
                m10972k = ((mo10218c + m10972k(d, -1)) - m10973j(d, -1)) / 7;
            }
            return m10972k + 1;
        }

        /* renamed from: d */
        private InterfaceC7664p<?> m10976d(Object obj) {
            return new C10638f((Class) obj, ((C10636d) this.f27733j).model);
        }

        /* renamed from: j */
        private int m10973j(D d, int i) {
            EnumC10846x0 m10967t = m10967t(d, i);
            C10852z0 c10852z0 = ((C10636d) this.f27733j).model;
            int m9996c = m10967t.m9996c(c10852z0);
            if (m9996c <= 8 - c10852z0.m9972g()) {
                return 2 - m9996c;
            }
            return 9 - m9996c;
        }

        /* renamed from: k */
        private int m10972k(D d, int i) {
            int mo10218c = d.mo10218c(((C10636d) this.f27733j).dayElement);
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        int m10991d = C10632b.m10991d(((C10636d) this.f27733j).dayElement, d);
                        InterfaceC7664p interfaceC7664p = ((C10636d) this.f27733j).dayElement;
                        EnumC7627a0 enumC7627a0 = EnumC7627a0.UTC;
                        return C10632b.m10991d(interfaceC7664p, d.m20121E(enumC7627a0, ((((Long) d.mo10212i(enumC7627a0)).longValue() + m10991d) + 1) - mo10218c));
                    }
                    throw new AssertionError("Unexpected: " + i);
                }
                return C10632b.m10991d(((C10636d) this.f27733j).dayElement, d);
            }
            InterfaceC7664p interfaceC7664p2 = ((C10636d) this.f27733j).dayElement;
            EnumC7627a0 enumC7627a02 = EnumC7627a0.UTC;
            return C10632b.m10991d(interfaceC7664p2, d.m20121E(enumC7627a02, ((Long) d.mo10212i(enumC7627a02)).longValue() - mo10218c));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: p */
        private int m10971p(D d) {
            int mo10218c = d.mo10218c(((C10636d) this.f27733j).dayElement);
            int m10973j = m10973j(d, 0);
            if (m10973j <= mo10218c) {
                int m10973j2 = m10973j(d, 1) + m10972k(d, 0);
                if (m10973j2 <= mo10218c) {
                    try {
                        int m10973j3 = m10973j(d, 1);
                        EnumC7627a0 enumC7627a0 = EnumC7627a0.UTC;
                        m10973j2 = m10973j(d.m20121E(enumC7627a0, ((Long) d.mo10212i(enumC7627a0)).longValue() + 7), 1) + m10972k(d, 1);
                        m10973j = m10973j3;
                    } catch (RuntimeException unused) {
                        m10973j2 += 7;
                    }
                }
                return (m10973j2 - m10973j) / 7;
            }
            return ((m10973j + m10972k(d, -1)) - m10973j(d, -1)) / 7;
        }

        /* renamed from: t */
        private EnumC10846x0 m10967t(D d, int i) {
            int mo10218c = d.mo10218c(((C10636d) this.f27733j).dayElement);
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return C10632b.m10992c(((((Long) d.mo10212i(EnumC7627a0.UTC)).longValue() + C10632b.m10991d(((C10636d) this.f27733j).dayElement, d)) + 1) - mo10218c);
                    }
                    throw new AssertionError("Unexpected: " + i);
                }
                return C10632b.m10992c((((Long) d.mo10212i(EnumC7627a0.UTC)).longValue() - mo10218c) + 1);
            }
            EnumC7627a0 enumC7627a0 = EnumC7627a0.UTC;
            long longValue = ((Long) d.mo10212i(enumC7627a0)).longValue() - mo10218c;
            return C10632b.m10992c((longValue - d.m20121E(enumC7627a0, longValue).mo10218c(((C10636d) this.f27733j).dayElement)) + 1);
        }

        /* renamed from: v */
        private D m10965v(D d, int i) {
            int m10977a = m10977a(d);
            if (i == m10977a) {
                return d;
            }
            EnumC7627a0 enumC7627a0 = EnumC7627a0.UTC;
            return (D) d.m20121E(enumC7627a0, ((Long) d.mo10212i(enumC7627a0)).longValue() + ((i - m10977a) * 7));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9926b(D d) {
            return m10976d(d.getClass());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public InterfaceC7664p<?> mo9925c(D d) {
            return m10976d(d.getClass());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public Integer mo9922f(D d) {
            return Integer.valueOf(m10971p(d));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: r */
        public Integer mo9917l(D d) {
            return 1;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: s */
        public Integer mo9915o(D d) {
            return Integer.valueOf(m10977a(d));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: u */
        public boolean mo9920i(D d, Integer num) {
            int intValue;
            if (num == null || (intValue = num.intValue()) < 1 || intValue > m10971p(d)) {
                return false;
            }
            return true;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: w */
        public D mo9916n(D d, Integer num, boolean z) {
            int intValue = num.intValue();
            if (!z && !mo9920i(d, num)) {
                throw new IllegalArgumentException("Invalid value: " + intValue + " (context=" + d + ")");
            }
            return m10965v(d, intValue);
        }

        private C10635c(C10636d<?> c10636d) {
            this.f27733j = c10636d;
        }
    }

    /* renamed from: net.time4j.calendar.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10636d<T extends AbstractC7665q<T>> extends C10680f<T> {
        private static final long serialVersionUID = -7471192143785466686L;
        private final boolean bounded;
        private final InterfaceC7664p<Integer> dayElement;
        private final C10852z0 model;

        C10636d(String str, Class<T> cls, int i, int i2, char c, C10852z0 c10852z0, InterfaceC7664p<Integer> interfaceC7664p, boolean z) {
            super(str, cls, i, i2, c);
            if (c10852z0 != null) {
                this.model = c10852z0;
                this.dayElement = interfaceC7664p;
                this.bounded = z;
                return;
            }
            throw new NullPointerException("Missing week model.");
        }

        /* renamed from: D */
        static <T extends AbstractC7665q<T>> C10636d<T> m10961D(String str, Class<T> cls, int i, int i2, char c, C10852z0 c10852z0, InterfaceC7664p<Integer> interfaceC7664p, boolean z) {
            return new C10636d<>(str, cls, i, i2, c, c10852z0, interfaceC7664p, z);
        }

        @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
        /* renamed from: k */
        public boolean mo9930k() {
            return true;
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: p */
        public <D extends AbstractC7665q<D>> InterfaceC7676z<D, Integer> mo9901p(C7672x<D> c7672x) {
            if (!m10758w().equals(c7672x.m20113p())) {
                return null;
            }
            if (this.bounded) {
                return new C10634b(this);
            }
            return new C10635c(this);
        }

        @Override // net.time4j.calendar.service.AbstractC10678d, p162ij.AbstractC7635e
        /* renamed from: q */
        public boolean mo9900q(AbstractC7635e<?> abstractC7635e) {
            if (!super.mo9900q(abstractC7635e)) {
                return false;
            }
            C10636d c10636d = (C10636d) C10636d.class.cast(abstractC7635e);
            if (!this.model.equals(c10636d.model) || this.bounded != c10636d.bounded) {
                return false;
            }
            return true;
        }

        @Override // net.time4j.calendar.service.AbstractC10678d
        protected Object readResolve() {
            return this;
        }
    }

    /* renamed from: net.time4j.calendar.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10637e<T extends AbstractC7665q<T>> implements InterfaceC7676z<T, EnumC10846x0> {

        /* renamed from: j */
        private final C10638f<?> f27734j;

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(T t) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(T t) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public EnumC10846x0 mo9922f(T t) {
            long mo10630a;
            C7672x m20105y = C7672x.m20105y(t.getClass());
            if (t instanceof AbstractC7655l) {
                mo10630a = m20105y.mo20114o(((AbstractC7655l) AbstractC7655l.class.cast(t)).mo10407n()).mo10630a();
            } else {
                mo10630a = m20105y.mo20115n().mo10630a();
            }
            long longValue = ((Long) t.mo10212i(EnumC7627a0.UTC)).longValue();
            if ((longValue + 7) - C10632b.m10992c(longValue).m9996c(((C10638f) this.f27734j).model) > mo10630a) {
                return C10632b.m10992c(mo10630a);
            }
            return this.f27734j.mo9551e();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public EnumC10846x0 mo9917l(T t) {
            long mo10627d;
            C7672x m20105y = C7672x.m20105y(t.getClass());
            if (t instanceof AbstractC7655l) {
                mo10627d = m20105y.mo20114o(((AbstractC7655l) AbstractC7655l.class.cast(t)).mo10407n()).mo10627d();
            } else {
                mo10627d = m20105y.mo20115n().mo10627d();
            }
            long longValue = ((Long) t.mo10212i(EnumC7627a0.UTC)).longValue();
            if ((longValue + 1) - C10632b.m10992c(longValue).m9996c(((C10638f) this.f27734j).model) < mo10627d) {
                return C10632b.m10992c(mo10627d);
            }
            return this.f27734j.mo9554U();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public EnumC10846x0 mo9915o(T t) {
            return C10632b.m10992c(((Long) t.mo10212i(EnumC7627a0.UTC)).longValue());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(T t, EnumC10846x0 enumC10846x0) {
            if (enumC10846x0 == null) {
                return false;
            }
            try {
                mo9916n(t, enumC10846x0, false);
                return true;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public T mo9916n(T t, EnumC10846x0 enumC10846x0, boolean z) {
            EnumC7627a0 enumC7627a0 = EnumC7627a0.UTC;
            long longValue = ((Long) t.mo10212i(enumC7627a0)).longValue();
            EnumC10846x0 m10992c = C10632b.m10992c(longValue);
            if (enumC10846x0 == m10992c) {
                return t;
            }
            return (T) t.m20121E(enumC7627a0, (longValue + enumC10846x0.m9996c(((C10638f) this.f27734j).model)) - m10992c.m9996c(((C10638f) this.f27734j).model));
        }

        private C10637e(C10638f<?> c10638f) {
            this.f27734j = c10638f;
        }
    }

    /* renamed from: net.time4j.calendar.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10638f<T extends AbstractC7665q<T>> extends C10679e<EnumC10846x0, T> {
        private static final long serialVersionUID = 5613494586572932860L;
        private final C10852z0 model;

        C10638f(Class<T> cls, C10852z0 c10852z0) {
            super("LOCAL_DAY_OF_WEEK", cls, EnumC10846x0.class, 'e');
            this.model = c10852z0;
        }

        /* renamed from: X */
        static <T extends AbstractC7665q<T>> C10638f<T> m10949X(Class<T> cls, C10852z0 c10852z0) {
            return new C10638f<>(cls, c10852z0);
        }

        @Override // net.time4j.calendar.service.C10679e
        /* renamed from: K */
        protected boolean mo10753K() {
            return true;
        }

        @Override // net.time4j.calendar.service.C10679e, p162ij.InterfaceC7664p
        /* renamed from: S */
        public EnumC10846x0 mo9551e() {
            return this.model.m9973f().m9995d(6);
        }

        @Override // net.time4j.calendar.service.C10679e, p162ij.InterfaceC7664p
        /* renamed from: T */
        public EnumC10846x0 mo9554U() {
            return this.model.m9973f();
        }

        @Override // net.time4j.calendar.service.C10679e
        /* renamed from: W */
        public int mo10743N(EnumC10846x0 enumC10846x0) {
            return enumC10846x0.m9996c(this.model);
        }

        @Override // p162ij.AbstractC7635e, java.util.Comparator
        /* renamed from: j */
        public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
            int m9996c = ((EnumC10846x0) interfaceC7662o.mo10212i(this)).m9996c(this.model);
            int m9996c2 = ((EnumC10846x0) interfaceC7662o2.mo10212i(this)).m9996c(this.model);
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
        public <D extends AbstractC7665q<D>> InterfaceC7676z<D, EnumC10846x0> mo9901p(C7672x<D> c7672x) {
            if (!m10758w().equals(c7672x.m20113p())) {
                return null;
            }
            return new C10637e(this);
        }

        @Override // net.time4j.calendar.service.AbstractC10678d, p162ij.AbstractC7635e
        /* renamed from: q */
        public boolean mo9900q(AbstractC7635e<?> abstractC7635e) {
            if (super.mo9900q(abstractC7635e)) {
                return this.model.equals(((C10638f) C10638f.class.cast(abstractC7635e)).model);
            }
            return false;
        }

        @Override // net.time4j.calendar.service.AbstractC10678d
        protected Object readResolve() {
            return this;
        }
    }

    /* renamed from: net.time4j.calendar.b$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C10639g implements InterfaceC7667s {

        /* renamed from: a */
        private final Class<? extends AbstractC7665q> f27735a;

        /* renamed from: b */
        private final InterfaceC7664p<Integer> f27736b;

        /* renamed from: c */
        private final InterfaceC7664p<Integer> f27737c;

        /* renamed from: d */
        private final C10852z0 f27738d;

        public C10639g(Class<? extends AbstractC7665q> cls, InterfaceC7664p<Integer> interfaceC7664p, InterfaceC7664p<Integer> interfaceC7664p2, C10852z0 c10852z0) {
            this.f27735a = cls;
            this.f27736b = interfaceC7664p;
            this.f27737c = interfaceC7664p2;
            this.f27738d = c10852z0;
        }

        @Override // p162ij.InterfaceC7667s
        /* renamed from: a */
        public boolean mo9075a(InterfaceC7664p<?> interfaceC7664p) {
            return false;
        }

        @Override // p162ij.InterfaceC7667s
        /* renamed from: b */
        public Set<InterfaceC7664p<?>> mo9074b(Locale locale, InterfaceC7633d interfaceC7633d) {
            C10852z0 m9969j;
            if (locale.getCountry().isEmpty()) {
                m9969j = this.f27738d;
            } else {
                m9969j = C10852z0.m9969j(locale);
            }
            HashSet hashSet = new HashSet();
            hashSet.add(C10638f.m10949X(this.f27735a, m9969j));
            C10852z0 c10852z0 = m9969j;
            hashSet.add(C10636d.m10961D("WEEK_OF_MONTH", this.f27735a, 1, 5, 'W', c10852z0, this.f27736b, false));
            hashSet.add(C10636d.m10961D("WEEK_OF_YEAR", this.f27735a, 1, 52, 'w', c10852z0, this.f27737c, false));
            hashSet.add(C10636d.m10961D("BOUNDED_WEEK_OF_MONTH", this.f27735a, 1, 5, (char) 0, c10852z0, this.f27736b, true));
            hashSet.add(C10636d.m10961D("BOUNDED_WEEK_OF_YEAR", this.f27735a, 1, 52, (char) 0, c10852z0, this.f27737c, true));
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // p162ij.InterfaceC7667s
        /* renamed from: c */
        public AbstractC7665q<?> mo9073c(AbstractC7665q<?> abstractC7665q, Locale locale, InterfaceC7633d interfaceC7633d) {
            return abstractC7665q;
        }

        @Override // p162ij.InterfaceC7667s
        /* renamed from: d */
        public boolean mo9072d(Class<?> cls) {
            return this.f27735a.equals(cls);
        }
    }

    /* renamed from: c */
    public static EnumC10846x0 m10992c(long j) {
        return EnumC10846x0.m9993f(C10616c.m11038d(j + 5, 7) + 1);
    }

    /* renamed from: d */
    public static <D extends AbstractC7665q<D>> int m10991d(InterfaceC7664p<?> interfaceC7664p, D d) {
        return ((Integer) Integer.class.cast(d.mo10211l(interfaceC7664p))).intValue();
    }
}