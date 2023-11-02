package p162ij;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p162ij.AbstractC7654k0;
import p162ij.C7672x;

/* renamed from: ij.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7644h0<U, T extends AbstractC7654k0<U, T>> extends C7672x<T> implements InterfaceC7650i0<T> {

    /* renamed from: q */
    private final Class<U> f20946q;

    /* renamed from: r */
    private final Map<U, InterfaceC7659m0<T>> f20947r;

    /* renamed from: s */
    private final Map<U, Double> f20948s;

    /* renamed from: t */
    private final Map<U, Set<U>> f20949t;

    /* renamed from: u */
    private final Map<InterfaceC7664p<?>, U> f20950u;

    /* renamed from: v */
    private final T f20951v;

    /* renamed from: w */
    private final T f20952w;

    /* renamed from: x */
    private final InterfaceC7653k<T> f20953x;

    /* renamed from: y */
    private final InterfaceC7664p<T> f20954y;

    /* renamed from: z */
    private final InterfaceC7650i0<T> f20955z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ij.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C7645a implements Comparator<U> {

        /* renamed from: j */
        final /* synthetic */ Map f20956j;

        C7645a(Map map) {
            this.f20956j = map;
        }

        @Override // java.util.Comparator
        public int compare(U u, U u2) {
            return Double.compare(C7644h0.m20172L(this.f20956j, u), C7644h0.m20172L(this.f20956j, u2));
        }
    }

    /* renamed from: ij.h0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7646b<U, T extends AbstractC7654k0<U, T>> extends C7672x.C7673a<T> {

        /* renamed from: f */
        private final Class<U> f20958f;

        /* renamed from: g */
        private final Map<U, InterfaceC7659m0<T>> f20959g;

        /* renamed from: h */
        private final Map<U, Double> f20960h;

        /* renamed from: i */
        private final Map<U, Set<U>> f20961i;

        /* renamed from: j */
        private final Map<InterfaceC7664p<?>, U> f20962j;

        /* renamed from: k */
        private final T f20963k;

        /* renamed from: l */
        private final T f20964l;

        /* renamed from: m */
        private final InterfaceC7653k<T> f20965m;

        /* renamed from: n */
        private InterfaceC7650i0<T> f20966n;

        private C7646b(Class<U> cls, Class<T> cls2, InterfaceC7669u<T> interfaceC7669u, T t, T t2, InterfaceC7653k<T> interfaceC7653k, InterfaceC7650i0<T> interfaceC7650i0) {
            super(cls2, interfaceC7669u);
            this.f20966n = null;
            if (cls != null) {
                if (t != null) {
                    if (t2 != null) {
                        if (AbstractC7658m.class.isAssignableFrom(cls2) && interfaceC7653k == null) {
                            throw new NullPointerException("Missing calendar system.");
                        }
                        this.f20958f = cls;
                        this.f20959g = new HashMap();
                        this.f20960h = new HashMap();
                        this.f20961i = new HashMap();
                        this.f20962j = new HashMap();
                        this.f20963k = t;
                        this.f20964l = t2;
                        this.f20965m = interfaceC7653k;
                        this.f20966n = interfaceC7650i0;
                        return;
                    }
                    throw new NullPointerException("Missing maximum of range.");
                }
                throw new NullPointerException("Missing minimum of range.");
            }
            throw new NullPointerException("Missing unit type.");
        }

        /* renamed from: i */
        private void m20162i(U u) {
            if (this.f20981b) {
                return;
            }
            for (U u2 : this.f20959g.keySet()) {
                if (u2.equals(u)) {
                    throw new IllegalArgumentException("Unit duplicate found: " + u.toString());
                }
            }
            if (u instanceof Enum) {
                String name = ((Enum) Enum.class.cast(u)).name();
                for (U u3 : this.f20959g.keySet()) {
                    if ((u3 instanceof Enum) && ((Enum) Enum.class.cast(u3)).name().equals(name)) {
                        throw new IllegalArgumentException("Unit duplicate found: " + name);
                    }
                }
            }
        }

        /* renamed from: j */
        public static <U, D extends AbstractC7658m<U, D>> C7646b<U, D> m20161j(Class<U> cls, Class<D> cls2, InterfaceC7669u<D> interfaceC7669u, InterfaceC7653k<D> interfaceC7653k) {
            EnumC7627a0[] values;
            C7646b<U, D> c7646b = new C7646b<>(cls, cls2, interfaceC7669u, interfaceC7653k.mo10629b(interfaceC7653k.mo10627d()), interfaceC7653k.mo10629b(interfaceC7653k.mo10630a()), interfaceC7653k, null);
            for (EnumC7627a0 enumC7627a0 : EnumC7627a0.values()) {
                c7646b.m20167d(enumC7627a0, enumC7627a0.m20219c(interfaceC7653k));
            }
            return c7646b;
        }

        /* renamed from: k */
        public static <U, T extends AbstractC7654k0<U, T>> C7646b<U, T> m20160k(Class<U> cls, Class<T> cls2, InterfaceC7669u<T> interfaceC7669u, T t, T t2) {
            return new C7646b<>(cls, cls2, interfaceC7669u, t, t2, null, null);
        }

        /* renamed from: d */
        public <V> C7646b<U, T> m20167d(InterfaceC7664p<V> interfaceC7664p, InterfaceC7676z<T, V> interfaceC7676z) {
            super.m20104a(interfaceC7664p, interfaceC7676z);
            return this;
        }

        /* renamed from: e */
        public <V> C7646b<U, T> m20166e(InterfaceC7664p<V> interfaceC7664p, InterfaceC7676z<T, V> interfaceC7676z, U u) {
            if (u != null) {
                super.m20104a(interfaceC7664p, interfaceC7676z);
                this.f20962j.put(interfaceC7664p, u);
                return this;
            }
            throw new NullPointerException("Missing base unit.");
        }

        /* renamed from: f */
        public C7646b<U, T> m20165f(InterfaceC7667s interfaceC7667s) {
            super.m20103b(interfaceC7667s);
            return this;
        }

        /* renamed from: g */
        public C7646b<U, T> m20164g(U u, InterfaceC7659m0<T> interfaceC7659m0, double d, Set<? extends U> set) {
            if (u != null) {
                if (interfaceC7659m0 != null) {
                    m20162i(u);
                    for (U u2 : set) {
                        if (u2 == null) {
                            throw new NullPointerException("Found convertible unit which is null.");
                        }
                    }
                    if (!Double.isNaN(d)) {
                        if (!Double.isInfinite(d)) {
                            this.f20959g.put(u, interfaceC7659m0);
                            this.f20960h.put(u, Double.valueOf(d));
                            HashSet hashSet = new HashSet(set);
                            hashSet.remove(u);
                            this.f20961i.put(u, hashSet);
                            return this;
                        }
                        throw new IllegalArgumentException("Infinite: " + d);
                    }
                    throw new IllegalArgumentException("Not a number: " + d);
                }
                throw new NullPointerException("Missing unit rule.");
            }
            throw new NullPointerException("Missing time unit.");
        }

        /* renamed from: h */
        public C7644h0<U, T> m20163h() {
            if (!this.f20959g.isEmpty()) {
                C7644h0<U, T> c7644h0 = new C7644h0<>(this.f20980a, this.f20958f, this.f20982c, this.f20983d, this.f20959g, this.f20960h, this.f20961i, this.f20984e, this.f20962j, this.f20963k, this.f20964l, this.f20965m, this.f20966n, null);
                C7672x.m20118C(c7644h0);
                return c7644h0;
            }
            throw new IllegalStateException("No time unit was registered.");
        }

        /* renamed from: l */
        public C7646b<U, T> m20159l(InterfaceC7650i0<T> interfaceC7650i0) {
            if (interfaceC7650i0 != null) {
                this.f20966n = interfaceC7650i0;
                return this;
            }
            throw new NullPointerException("Missing time line.");
        }
    }

    /* renamed from: ij.h0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C7647c<U, T extends AbstractC7654k0<U, T>> implements InterfaceC7650i0<T> {

        /* renamed from: j */
        private final U f20967j;

        /* renamed from: k */
        private final T f20968k;

        /* renamed from: l */
        private final T f20969l;

        C7647c(U u, T t, T t2) {
            this.f20967j = u;
            this.f20968k = t;
            this.f20969l = t2;
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(T t, T t2) {
            return t.compareTo(t2);
        }
    }

    /* renamed from: ij.h0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C7648d<T extends AbstractC7654k0<?, T>> extends AbstractC7635e<T> implements InterfaceC7676z<T, T> {
        private static final long serialVersionUID = 4777240530511579802L;
        private final T max;
        private final T min;
        private final Class<T> type;

        /* synthetic */ C7648d(Class cls, AbstractC7654k0 abstractC7654k0, AbstractC7654k0 abstractC7654k02, C7645a c7645a) {
            this(cls, abstractC7654k0, abstractC7654k02);
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: B */
        public T mo9554U() {
            return this.min;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: C */
        public T mo9922f(T t) {
            return mo9551e();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: D */
        public T mo9917l(T t) {
            return mo9554U();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: E */
        public T mo9915o(T t) {
            return t;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: F */
        public boolean mo9920i(T t, T t2) {
            return t2 != null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: I */
        public T mo9916n(T t, T t2, boolean z) {
            if (t2 != null) {
                return t2;
            }
            throw new IllegalArgumentException("Missing value.");
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: M */
        public boolean mo9555M() {
            return false;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: V */
        public boolean mo9553V() {
            return false;
        }

        @Override // p162ij.InterfaceC7664p
        public Class<T> getType() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p162ij.AbstractC7635e
        /* renamed from: p */
        public <X extends AbstractC7665q<X>> InterfaceC7676z<X, T> mo9901p(C7672x<X> c7672x) {
            if (c7672x.m20113p().equals(this.type)) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p162ij.AbstractC7635e
        /* renamed from: t */
        public String mo20151t(C7672x<?> c7672x) {
            return null;
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: v */
        protected boolean mo9550v() {
            return true;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: w */
        public InterfaceC7664p<?> mo9926b(T t) {
            throw new UnsupportedOperationException();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: x */
        public InterfaceC7664p<?> mo9925c(T t) {
            throw new UnsupportedOperationException();
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: y */
        public T mo9551e() {
            return this.max;
        }

        private C7648d(Class<T> cls, T t, T t2) {
            super(cls.getName() + "-AXIS");
            this.type = cls;
            this.min = t;
            this.max = t2;
        }
    }

    /* synthetic */ C7644h0(Class cls, Class cls2, InterfaceC7669u interfaceC7669u, Map map, Map map2, Map map3, Map map4, List list, Map map5, AbstractC7654k0 abstractC7654k0, AbstractC7654k0 abstractC7654k02, InterfaceC7653k interfaceC7653k, InterfaceC7650i0 interfaceC7650i0, C7645a c7645a) {
        this(cls, cls2, interfaceC7669u, map, map2, map3, map4, list, map5, abstractC7654k0, abstractC7654k02, interfaceC7653k, interfaceC7650i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static <U> double m20172L(Map<U, Double> map, U u) {
        Double d = map.get(u);
        if (d == null) {
            if (u instanceof InterfaceC7671w) {
                return ((InterfaceC7671w) InterfaceC7671w.class.cast(u)).getLength();
            }
            return Double.NaN;
        }
        return d.doubleValue();
    }

    @Override // java.util.Comparator
    /* renamed from: E */
    public int compare(T t, T t2) {
        return t.compareTo(t2);
    }

    @Override // p162ij.C7672x, p162ij.InterfaceC7669u
    /* renamed from: F */
    public T mo10453j(AbstractC7665q<?> abstractC7665q, InterfaceC7633d interfaceC7633d, boolean z, boolean z2) {
        if (abstractC7665q.mo10210q(this.f20954y)) {
            return (T) abstractC7665q.mo10212i(this.f20954y);
        }
        return (T) super.mo10453j(abstractC7665q, interfaceC7633d, z, z2);
    }

    /* renamed from: I */
    public InterfaceC7664p<T> m20174I() {
        return this.f20954y;
    }

    /* renamed from: K */
    public U m20173K(InterfaceC7664p<?> interfaceC7664p) {
        if (interfaceC7664p != null) {
            U u = this.f20950u.get(interfaceC7664p);
            if (u == null && (interfaceC7664p instanceof AbstractC7635e)) {
                u = this.f20950u.get(((AbstractC7635e) interfaceC7664p).mo9899s());
            }
            if (u != null) {
                return u;
            }
            throw new C7666r("Base unit not found for: " + interfaceC7664p.name());
        }
        throw new NullPointerException("Missing element.");
    }

    /* renamed from: N */
    public T m20171N() {
        return this.f20952w;
    }

    /* renamed from: O */
    public T m20170O() {
        return this.f20951v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public InterfaceC7659m0<T> m20169P(U u) {
        InterfaceC7659m0<T> mo10003c;
        if (u != null) {
            if (m20168R(u)) {
                return this.f20947r.get(u);
            }
            if ((u instanceof AbstractC7637f) && (mo10003c = ((AbstractC7637f) AbstractC7637f.class.cast(u)).mo10003c(this)) != null) {
                return mo10003c;
            }
            throw new C7636e0(this, u);
        }
        throw new NullPointerException("Missing chronological unit.");
    }

    /* renamed from: R */
    public boolean m20168R(U u) {
        return this.f20947r.containsKey(u);
    }

    @Override // p162ij.C7672x
    /* renamed from: n */
    public InterfaceC7653k<T> mo20115n() {
        InterfaceC7653k<T> interfaceC7653k = this.f20953x;
        if (interfaceC7653k == null) {
            return super.mo20115n();
        }
        return interfaceC7653k;
    }

    @Override // p162ij.C7672x
    /* renamed from: o */
    public InterfaceC7653k<T> mo20114o(String str) {
        if (str.isEmpty()) {
            return mo20115n();
        }
        return super.mo20114o(str);
    }

    private C7644h0(Class<T> cls, Class<U> cls2, InterfaceC7669u<T> interfaceC7669u, Map<InterfaceC7664p<?>, InterfaceC7676z<T, ?>> map, Map<U, InterfaceC7659m0<T>> map2, Map<U, Double> map3, Map<U, Set<U>> map4, List<InterfaceC7667s> list, Map<InterfaceC7664p<?>, U> map5, T t, T t2, InterfaceC7653k<T> interfaceC7653k, InterfaceC7650i0<T> interfaceC7650i0) {
        super(cls, interfaceC7669u, map, list);
        this.f20946q = cls2;
        this.f20947r = Collections.unmodifiableMap(map2);
        this.f20948s = Collections.unmodifiableMap(map3);
        this.f20949t = Collections.unmodifiableMap(map4);
        this.f20950u = Collections.unmodifiableMap(map5);
        this.f20951v = t;
        this.f20952w = t2;
        this.f20953x = interfaceC7653k;
        this.f20954y = new C7648d(cls, t, t2, null);
        if (interfaceC7650i0 == null) {
            ArrayList arrayList = new ArrayList(map2.keySet());
            Collections.sort(arrayList, new C7645a(map3));
            this.f20955z = new C7647c(arrayList.get(0), t, t2);
            return;
        }
        this.f20955z = interfaceC7650i0;
    }
}
