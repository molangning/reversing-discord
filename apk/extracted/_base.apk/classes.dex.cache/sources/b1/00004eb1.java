package p366u9;

import java.util.List;

/* renamed from: u9.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12929s extends AbstractC12925q {

    /* renamed from: l */
    private final transient int f33634l;

    /* renamed from: m */
    private final transient int f33635m;

    /* renamed from: n */
    private final /* synthetic */ AbstractC12925q f33636n;

    public C12929s(AbstractC12925q abstractC12925q, int i, int i2) {
        this.f33636n = abstractC12925q;
        this.f33634l = i;
        this.f33635m = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C12919n.m3675a(i, this.f33635m);
        return this.f33636n.get(i + this.f33634l);
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: h */
    public final Object[] mo3646h() {
        return this.f33636n.mo3646h();
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: i */
    public final int mo3645i() {
        return this.f33636n.mo3645i() + this.f33634l;
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: k */
    final int mo3644k() {
        return this.f33636n.mo3645i() + this.f33634l + this.f33635m;
    }

    @Override // p366u9.AbstractC12925q
    /* renamed from: o */
    public final AbstractC12925q mo3658o(int i, int i2) {
        C12919n.m3672d(i, i2, this.f33635m);
        AbstractC12925q abstractC12925q = this.f33636n;
        int i3 = this.f33634l;
        return (AbstractC12925q) abstractC12925q.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33635m;
    }

    @Override // p366u9.AbstractC12925q, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}