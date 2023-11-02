package gb;

import p102fb.C6378h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gb.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6697s0<E> extends AbstractC6711w<E> {

    /* renamed from: l */
    final transient E f18899l;

    /* renamed from: m */
    private transient int f18900m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6697s0(E e) {
        this.f18899l = (E) C6378h.m22834j(e);
    }

    @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f18899l.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gb.AbstractC6683q
    /* renamed from: d */
    public int mo22075d(Object[] objArr, int i) {
        objArr[i] = this.f18899l;
        return i + 1;
    }

    @Override // gb.AbstractC6711w, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f18900m;
        if (i == 0) {
            int hashCode = this.f18899l.hashCode();
            this.f18900m = hashCode;
            return hashCode;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gb.AbstractC6683q
    /* renamed from: k */
    public boolean mo22122k() {
        return false;
    }

    @Override // gb.AbstractC6711w, gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o */
    public AbstractC6703u0<E> iterator() {
        return C6713y.m22045k(this.f18899l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f18899l.toString() + ']';
    }

    @Override // gb.AbstractC6711w
    /* renamed from: u */
    AbstractC6693s<E> mo22067u() {
        return AbstractC6693s.m22130y(this.f18899l);
    }

    @Override // gb.AbstractC6711w
    /* renamed from: v */
    boolean mo22066v() {
        return this.f18900m != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6697s0(E e, int i) {
        this.f18899l = e;
        this.f18900m = i;
    }
}
