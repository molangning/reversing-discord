package p401w9;

import java.util.Iterator;

/* renamed from: w9.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13441e extends AbstractC13444f0 {

    /* renamed from: l */
    private final transient AbstractC13442e0 f34682l;

    /* renamed from: m */
    private final transient AbstractC13436b0 f34683m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13441e(AbstractC13442e0 abstractC13442e0, AbstractC13436b0 abstractC13436b0) {
        this.f34682l = abstractC13442e0;
        this.f34683m = abstractC13436b0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p401w9.AbstractC13464y
    /* renamed from: a */
    public final int mo2433a(Object[] objArr, int i) {
        return this.f34683m.mo2433a(objArr, 0);
    }

    @Override // p401w9.AbstractC13464y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f34682l.get(obj) != null;
    }

    @Override // p401w9.AbstractC13444f0, p401w9.AbstractC13464y
    /* renamed from: h */
    public final AbstractC13436b0 mo2430h() {
        return this.f34683m;
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: i */
    public final AbstractC13448i mo2429i() {
        return this.f34683m.listIterator(0);
    }

    @Override // p401w9.AbstractC13464y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return this.f34683m.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34682l.size();
    }
}
