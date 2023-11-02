package p366u9;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u9.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12940z<E> extends AbstractC12935v<E> {

    /* renamed from: q */
    static final C12940z<Object> f33644q = new C12940z<>(new Object[0], 0, null, 0, 0);

    /* renamed from: l */
    private final transient Object[] f33645l;

    /* renamed from: m */
    private final transient Object[] f33646m;

    /* renamed from: n */
    private final transient int f33647n;

    /* renamed from: o */
    private final transient int f33648o;

    /* renamed from: p */
    private final transient int f33649p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12940z(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f33645l = objArr;
        this.f33646m = objArr2;
        this.f33647n = i2;
        this.f33648o = i;
        this.f33649p = i3;
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: a */
    final int mo3648a(Object[] objArr, int i) {
        System.arraycopy(this.f33645l, 0, objArr, 0, this.f33649p);
        return this.f33649p + 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f33646m;
        if (obj == null || objArr == null) {
            return false;
        }
        int m3666a = C12921o.m3666a(obj.hashCode());
        while (true) {
            int i = m3666a & this.f33647n;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m3666a = i + 1;
        }
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: d */
    public final AbstractC12896b0<E> mo3647d() {
        return (AbstractC12896b0) mo3655e().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p366u9.AbstractC12927r
    /* renamed from: h */
    public final Object[] mo3646h() {
        return this.f33645l;
    }

    @Override // p366u9.AbstractC12935v, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f33648o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p366u9.AbstractC12927r
    /* renamed from: i */
    public final int mo3645i() {
        return 0;
    }

    @Override // p366u9.AbstractC12935v, p366u9.AbstractC12927r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo3647d();
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: k */
    final int mo3644k() {
        return this.f33649p;
    }

    @Override // p366u9.AbstractC12935v
    /* renamed from: r */
    final boolean mo3643r() {
        return true;
    }

    @Override // p366u9.AbstractC12935v
    /* renamed from: s */
    final AbstractC12925q<E> mo3642s() {
        return AbstractC12925q.m3660s(this.f33645l, this.f33649p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33649p;
    }
}
