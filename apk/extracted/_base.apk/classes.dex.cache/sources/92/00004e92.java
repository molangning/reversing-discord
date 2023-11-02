package p366u9;

import java.util.Iterator;

/* renamed from: u9.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12898c0<E> extends AbstractC12935v<E> {

    /* renamed from: l */
    private final transient E f33584l;

    /* renamed from: m */
    private transient int f33585m;

    public C12898c0(E e) {
        this.f33584l = (E) C12919n.m3674b(e);
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: a */
    final int mo3648a(Object[] objArr, int i) {
        objArr[0] = this.f33584l;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f33584l.equals(obj);
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: d */
    public final AbstractC12896b0<E> mo3647d() {
        return new C12933u(this.f33584l);
    }

    @Override // p366u9.AbstractC12935v, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f33585m;
        if (i == 0) {
            int hashCode = this.f33584l.hashCode();
            this.f33585m = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // p366u9.AbstractC12935v, p366u9.AbstractC12927r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo3647d();
    }

    @Override // p366u9.AbstractC12935v
    /* renamed from: r */
    final boolean mo3643r() {
        return this.f33585m != 0;
    }

    @Override // p366u9.AbstractC12935v
    /* renamed from: s */
    final AbstractC12925q<E> mo3642s() {
        return AbstractC12925q.m3662p(this.f33584l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f33584l.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    public C12898c0(E e, int i) {
        this.f33584l = e;
        this.f33585m = i;
    }
}