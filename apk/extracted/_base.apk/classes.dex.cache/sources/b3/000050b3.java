package p401w9;

/* renamed from: w9.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13443f extends AbstractC13436b0 {

    /* renamed from: l */
    private final transient Object[] f34687l;

    /* renamed from: m */
    private final transient int f34688m;

    /* renamed from: n */
    private final transient int f34689n;

    public C13443f(Object[] objArr, int i, int i2) {
        this.f34687l = objArr;
        this.f34688m = i;
        this.f34689n = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C13459t.m2441a(i, this.f34689n, "index");
        Object obj = this.f34687l[i + i + this.f34688m];
        obj.getClass();
        return obj;
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: k */
    public final boolean mo2428k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34689n;
    }
}