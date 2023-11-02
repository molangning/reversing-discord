package p445yc;

/* renamed from: yc.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13975d {

    /* renamed from: a */
    private final int f35961a;

    /* renamed from: b */
    private final int f35962b;

    /* renamed from: c */
    private final int f35963c;

    /* renamed from: d */
    private final int f35964d;

    /* renamed from: e */
    private int f35965e = -1;

    public C13975d(int i, int i2, int i3, int i4) {
        this.f35961a = i;
        this.f35962b = i2;
        this.f35963c = i3;
        this.f35964d = i4;
    }

    /* renamed from: a */
    public int m1034a() {
        return this.f35963c;
    }

    /* renamed from: b */
    public int m1033b() {
        return this.f35962b;
    }

    /* renamed from: c */
    public int m1032c() {
        return this.f35965e;
    }

    /* renamed from: d */
    public int m1031d() {
        return this.f35961a;
    }

    /* renamed from: e */
    public int m1030e() {
        return this.f35964d;
    }

    /* renamed from: f */
    public int m1029f() {
        return this.f35962b - this.f35961a;
    }

    /* renamed from: g */
    public boolean m1028g() {
        return m1027h(this.f35965e);
    }

    /* renamed from: h */
    public boolean m1027h(int i) {
        return i != -1 && this.f35963c == (i % 3) * 3;
    }

    /* renamed from: i */
    public void m1026i(int i) {
        this.f35965e = i;
    }

    /* renamed from: j */
    public void m1025j() {
        this.f35965e = ((this.f35964d / 30) * 3) + (this.f35963c / 3);
    }

    public String toString() {
        return this.f35965e + "|" + this.f35964d;
    }
}