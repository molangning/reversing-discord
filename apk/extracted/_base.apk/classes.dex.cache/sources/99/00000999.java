package p029b9;

/* renamed from: b9.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2201q {

    /* renamed from: b */
    private static C2201q f6194b;

    /* renamed from: c */
    private static final C2204r f6195c = new C2204r(0, false, false, 0, 0);

    /* renamed from: a */
    private C2204r f6196a;

    private C2201q() {
    }

    /* renamed from: b */
    public static synchronized C2201q m33976b() {
        C2201q c2201q;
        synchronized (C2201q.class) {
            if (f6194b == null) {
                f6194b = new C2201q();
            }
            c2201q = f6194b;
        }
        return c2201q;
    }

    /* renamed from: a */
    public C2204r m33977a() {
        return this.f6196a;
    }

    /* renamed from: c */
    public final synchronized void m33975c(C2204r c2204r) {
        if (c2204r == null) {
            this.f6196a = f6195c;
            return;
        }
        C2204r c2204r2 = this.f6196a;
        if (c2204r2 != null && c2204r2.m33969H() >= c2204r.m33969H()) {
            return;
        }
        this.f6196a = c2204r;
    }
}