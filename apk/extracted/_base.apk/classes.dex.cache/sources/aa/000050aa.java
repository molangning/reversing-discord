package p401w9;

import java.util.List;

/* renamed from: w9.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13434a0 extends AbstractC13436b0 {

    /* renamed from: l */
    final transient int f34665l;

    /* renamed from: m */
    final transient int f34666m;

    /* renamed from: n */
    final /* synthetic */ AbstractC13436b0 f34667n;

    public C13434a0(AbstractC13436b0 abstractC13436b0, int i, int i2) {
        this.f34667n = abstractC13436b0;
        this.f34665l = i;
        this.f34666m = i2;
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: d */
    final int mo2432d() {
        return this.f34667n.mo2431e() + this.f34665l + this.f34666m;
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: e */
    public final int mo2431e() {
        return this.f34667n.mo2431e() + this.f34665l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C13459t.m2441a(i, this.f34666m, "index");
        return this.f34667n.get(i + this.f34665l);
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: k */
    public final boolean mo2428k() {
        return true;
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: o */
    public final Object[] mo2427o() {
        return this.f34667n.mo2427o();
    }

    @Override // p401w9.AbstractC13436b0
    /* renamed from: p */
    public final AbstractC13436b0 mo2496p(int i, int i2) {
        C13459t.m2438d(i, i2, this.f34666m);
        AbstractC13436b0 abstractC13436b0 = this.f34667n;
        int i3 = this.f34665l;
        return abstractC13436b0.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34666m;
    }

    @Override // p401w9.AbstractC13436b0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}