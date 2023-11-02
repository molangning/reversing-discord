package p401w9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13435b extends AbstractC13436b0 {

    /* renamed from: n */
    static final AbstractC13436b0 f34668n = new C13435b(new Object[0], 0);

    /* renamed from: l */
    final transient Object[] f34669l;

    /* renamed from: m */
    private final transient int f34670m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13435b(Object[] objArr, int i) {
        this.f34669l = objArr;
        this.f34670m = i;
    }

    @Override // p401w9.AbstractC13436b0, p401w9.AbstractC13464y
    /* renamed from: a */
    final int mo2433a(Object[] objArr, int i) {
        System.arraycopy(this.f34669l, 0, objArr, 0, this.f34670m);
        return this.f34670m;
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: d */
    final int mo2432d() {
        return this.f34670m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p401w9.AbstractC13464y
    /* renamed from: e */
    public final int mo2431e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C13459t.m2441a(i, this.f34670m, "index");
        Object obj = this.f34669l[i];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p401w9.AbstractC13464y
    /* renamed from: k */
    public final boolean mo2428k() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p401w9.AbstractC13464y
    /* renamed from: o */
    public final Object[] mo2427o() {
        return this.f34669l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34670m;
    }
}
