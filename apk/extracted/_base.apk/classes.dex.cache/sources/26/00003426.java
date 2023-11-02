package gb;

/* renamed from: gb.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6678n0<E> extends AbstractC6711w<E> {

    /* renamed from: q */
    static final C6678n0<Object> f18875q = new C6678n0<>(new Object[0], 0, null, 0, 0);

    /* renamed from: l */
    final transient Object[] f18876l;

    /* renamed from: m */
    final transient Object[] f18877m;

    /* renamed from: n */
    private final transient int f18878n;

    /* renamed from: o */
    private final transient int f18879o;

    /* renamed from: p */
    private final transient int f18880p;

    public C6678n0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f18876l = objArr;
        this.f18877m = objArr2;
        this.f18878n = i2;
        this.f18879o = i;
        this.f18880p = i3;
    }

    @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f18877m;
        if (obj == null || objArr == null) {
            return false;
        }
        int m22156c = C6681p.m22156c(obj);
        while (true) {
            int i = m22156c & this.f18878n;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m22156c = i + 1;
        }
    }

    @Override // gb.AbstractC6683q
    /* renamed from: d */
    public int mo22075d(Object[] objArr, int i) {
        System.arraycopy(this.f18876l, 0, objArr, i, this.f18880p);
        return i + this.f18880p;
    }

    @Override // gb.AbstractC6683q
    /* renamed from: e */
    public Object[] mo22125e() {
        return this.f18876l;
    }

    @Override // gb.AbstractC6683q
    /* renamed from: h */
    int mo22124h() {
        return this.f18880p;
    }

    @Override // gb.AbstractC6711w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f18879o;
    }

    @Override // gb.AbstractC6683q
    /* renamed from: i */
    public int mo22123i() {
        return 0;
    }

    @Override // gb.AbstractC6683q
    /* renamed from: k */
    public boolean mo22122k() {
        return false;
    }

    @Override // gb.AbstractC6711w, gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o */
    public AbstractC6703u0<E> iterator() {
        return mo22073a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f18880p;
    }

    @Override // gb.AbstractC6711w
    /* renamed from: u */
    AbstractC6693s<E> mo22067u() {
        return AbstractC6693s.m22137r(this.f18876l, this.f18880p);
    }

    @Override // gb.AbstractC6711w
    /* renamed from: v */
    boolean mo22066v() {
        return true;
    }
}