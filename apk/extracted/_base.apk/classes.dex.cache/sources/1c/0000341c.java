package gb;

import p102fb.C6378h;

/* renamed from: gb.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6668l0<E> extends AbstractC6693s<E> {

    /* renamed from: n */
    static final AbstractC6693s<Object> f18853n = new C6668l0(new Object[0], 0);

    /* renamed from: l */
    final transient Object[] f18854l;

    /* renamed from: m */
    private final transient int f18855m;

    public C6668l0(Object[] objArr, int i) {
        this.f18854l = objArr;
        this.f18855m = i;
    }

    @Override // gb.AbstractC6693s, gb.AbstractC6683q
    /* renamed from: d */
    public int mo22075d(Object[] objArr, int i) {
        System.arraycopy(this.f18854l, 0, objArr, i, this.f18855m);
        return i + this.f18855m;
    }

    @Override // gb.AbstractC6683q
    /* renamed from: e */
    public Object[] mo22125e() {
        return this.f18854l;
    }

    @Override // java.util.List
    public E get(int i) {
        C6378h.m22836h(i, this.f18855m);
        return (E) this.f18854l[i];
    }

    @Override // gb.AbstractC6683q
    /* renamed from: h */
    int mo22124h() {
        return this.f18855m;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f18855m;
    }
}