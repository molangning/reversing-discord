package p162ij;

import p162ij.AbstractC7665q;

/* renamed from: ij.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7642g0<T extends AbstractC7665q<T>> implements InterfaceC7670v<T> {

    /* renamed from: j */
    private final int f20941j;

    /* renamed from: k */
    private final InterfaceC7664p<?> f20942k;

    /* renamed from: l */
    private final Object f20943l;

    private C7642g0(int i, InterfaceC7664p<?> interfaceC7664p) {
        this(i, interfaceC7664p, null);
    }

    /* renamed from: a */
    private static <U, T extends AbstractC7654k0<U, T>> T m20198a(AbstractC7654k0<U, T> abstractC7654k0, InterfaceC7664p<?> interfaceC7664p, boolean z) {
        U m20173K = abstractC7654k0.mo10478v().m20173K(interfaceC7664p);
        if (z) {
            return abstractC7654k0.m20145L(1L, m20173K);
        }
        return abstractC7654k0.m20146K(1L, m20173K);
    }

    /* renamed from: c */
    public static <T extends AbstractC7665q<T>> InterfaceC7670v<T> m20196c(InterfaceC7664p<?> interfaceC7664p) {
        return new C7642g0(4, interfaceC7664p);
    }

    /* renamed from: d */
    public static <T extends AbstractC7665q<T>> InterfaceC7670v<T> m20195d(InterfaceC7664p<?> interfaceC7664p) {
        return new C7642g0(3, interfaceC7664p);
    }

    /* renamed from: e */
    private <V> T m20194e(AbstractC7665q<T> abstractC7665q, InterfaceC7664p<V> interfaceC7664p) {
        T mo10477w = abstractC7665q.mo10477w();
        while (true) {
            interfaceC7664p = (InterfaceC7664p<V>) mo10477w.mo10478v().m20108v(interfaceC7664p).mo9926b(mo10477w);
            if (interfaceC7664p == null) {
                return mo10477w;
            }
            mo10477w = m20182q(mo10477w, interfaceC7664p);
        }
    }

    /* renamed from: f */
    public static <T extends AbstractC7665q<T>> InterfaceC7670v<T> m20193f(InterfaceC7664p<?> interfaceC7664p) {
        return new C7642g0(6, interfaceC7664p);
    }

    /* renamed from: g */
    private <V> T m20192g(AbstractC7665q<T> abstractC7665q, InterfaceC7664p<V> interfaceC7664p) {
        T mo10477w = abstractC7665q.mo10477w();
        while (true) {
            interfaceC7664p = (InterfaceC7664p<V>) mo10477w.mo10478v().m20108v(interfaceC7664p).mo9925c(mo10477w);
            if (interfaceC7664p == null) {
                return mo10477w;
            }
            mo10477w = m20181r(mo10477w, interfaceC7664p);
        }
    }

    /* renamed from: h */
    public static <T extends AbstractC7665q<T>> InterfaceC7670v<T> m20191h(InterfaceC7664p<?> interfaceC7664p) {
        return new C7642g0(7, interfaceC7664p);
    }

    /* renamed from: i */
    private <V> T m20190i(AbstractC7665q<T> abstractC7665q, InterfaceC7664p<V> interfaceC7664p) {
        return abstractC7665q.mo14419F(interfaceC7664p, abstractC7665q.mo10211l(interfaceC7664p));
    }

    /* renamed from: j */
    public static <T extends AbstractC7665q<T>> InterfaceC7670v<T> m20189j(InterfaceC7664p<?> interfaceC7664p) {
        return new C7642g0(2, interfaceC7664p);
    }

    /* renamed from: k */
    private <V> T m20188k(AbstractC7665q<T> abstractC7665q, InterfaceC7664p<V> interfaceC7664p) {
        return abstractC7665q.mo14419F(interfaceC7664p, abstractC7665q.mo10215f(interfaceC7664p));
    }

    /* renamed from: l */
    public static <T extends AbstractC7665q<T>> InterfaceC7670v<T> m20187l(InterfaceC7664p<?> interfaceC7664p) {
        return new C7642g0(1, interfaceC7664p);
    }

    /* renamed from: m */
    private T m20186m(T t, boolean z) {
        if (t instanceof AbstractC7654k0) {
            return t.mo10478v().m20113p().cast(m20198a((AbstractC7654k0) AbstractC7654k0.class.cast(t), this.f20942k, z));
        }
        throw new C7666r("Base units not supported by: " + t.mo10478v().m20113p());
    }

    /* renamed from: n */
    public static <T extends AbstractC7665q<T>, V> InterfaceC7670v<T> m20185n(V v, InterfaceC7664p<V> interfaceC7664p) {
        return new C7642g0(0, interfaceC7664p, v);
    }

    /* renamed from: o */
    public static <T extends AbstractC7665q<T>, V> InterfaceC7670v<T> m20184o(V v, InterfaceC7664p<V> interfaceC7664p) {
        return new C7642g0(5, interfaceC7664p, v);
    }

    /* renamed from: p */
    private <V> T m20183p(AbstractC7665q<T> abstractC7665q, InterfaceC7664p<V> interfaceC7664p, Object obj, boolean z) {
        T mo10477w = abstractC7665q.mo10477w();
        return mo10477w.mo10478v().m20108v(interfaceC7664p).mo9916n(mo10477w, interfaceC7664p.getType().cast(obj), z);
    }

    /* renamed from: q */
    private <V> T m20182q(T t, InterfaceC7664p<V> interfaceC7664p) {
        InterfaceC7676z<T, V> m20108v = t.mo10478v().m20108v(interfaceC7664p);
        return m20108v.mo9916n(t, m20108v.mo9922f(t), interfaceC7664p.mo9930k());
    }

    /* renamed from: r */
    private <V> T m20181r(T t, InterfaceC7664p<V> interfaceC7664p) {
        InterfaceC7676z<T, V> m20108v = t.mo10478v().m20108v(interfaceC7664p);
        return m20108v.mo9916n(t, m20108v.mo9917l(t), interfaceC7664p.mo9930k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p162ij.InterfaceC7670v
    /* renamed from: b */
    public T apply(T t) {
        switch (this.f20941j) {
            case 0:
                return m20183p(t, this.f20942k, this.f20943l, false);
            case 1:
                return m20188k(t, this.f20942k);
            case 2:
                return m20190i(t, this.f20942k);
            case 3:
                return m20192g(t, this.f20942k);
            case 4:
                return m20194e(t, this.f20942k);
            case 5:
                return m20183p(t, this.f20942k, this.f20943l, true);
            case 6:
                return m20186m(t, false);
            case 7:
                return m20186m(t, true);
            default:
                throw new UnsupportedOperationException("Unknown mode: " + this.f20941j);
        }
    }

    private C7642g0(int i, InterfaceC7664p<?> interfaceC7664p, Object obj) {
        if (interfaceC7664p != null) {
            this.f20941j = i;
            this.f20942k = interfaceC7664p;
            this.f20943l = obj;
            return;
        }
        throw new NullPointerException("Missing chronological element.");
    }
}