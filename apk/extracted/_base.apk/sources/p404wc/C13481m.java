package p404wc;

/* renamed from: wc.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13481m {

    /* renamed from: a */
    private int f34709a = 0;

    /* renamed from: b */
    private EnumC13482a f34710b = EnumC13482a.NUMERIC;

    /* renamed from: wc.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private enum EnumC13482a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m2408a() {
        return this.f34709a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2407b(int i) {
        this.f34709a += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m2406c() {
        return this.f34710b == EnumC13482a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m2405d() {
        return this.f34710b == EnumC13482a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2404e() {
        this.f34710b = EnumC13482a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2403f() {
        this.f34710b = EnumC13482a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m2402g() {
        this.f34710b = EnumC13482a.NUMERIC;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m2401h(int i) {
        this.f34709a = i;
    }
}
