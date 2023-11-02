package p366u9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u9.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12937w<E> extends AbstractC12925q<E> {

    /* renamed from: n */
    static final AbstractC12925q<Object> f33641n = new C12937w(new Object[0], 0);

    /* renamed from: l */
    private final transient Object[] f33642l;

    /* renamed from: m */
    private final transient int f33643m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12937w(Object[] objArr, int i) {
        this.f33642l = objArr;
        this.f33643m = i;
    }

    @Override // p366u9.AbstractC12925q, p366u9.AbstractC12927r
    /* renamed from: a */
    final int mo3648a(Object[] objArr, int i) {
        System.arraycopy(this.f33642l, 0, objArr, 0, this.f33643m);
        return this.f33643m + 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        C12919n.m3675a(i, this.f33643m);
        return (E) this.f33642l[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p366u9.AbstractC12927r
    /* renamed from: h */
    public final Object[] mo3646h() {
        return this.f33642l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p366u9.AbstractC12927r
    /* renamed from: i */
    public final int mo3645i() {
        return 0;
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: k */
    final int mo3644k() {
        return this.f33643m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33643m;
    }
}
