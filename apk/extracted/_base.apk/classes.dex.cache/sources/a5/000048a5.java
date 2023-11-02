package p277p3;

/* renamed from: p3.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11381d {

    /* renamed from: a */
    private boolean f29650a;

    /* renamed from: b */
    private int f29651b;

    /* renamed from: c */
    private int f29652c;

    public C11381d() {
        m8195a();
    }

    /* renamed from: a */
    public void m8195a() {
        this.f29650a = false;
        this.f29651b = 4;
        m8193c();
    }

    /* renamed from: b */
    public void m8194b() {
        this.f29652c++;
    }

    /* renamed from: c */
    public void m8193c() {
        this.f29652c = 0;
    }

    /* renamed from: d */
    public void m8192d(boolean z) {
        this.f29650a = z;
    }

    /* renamed from: e */
    public boolean m8191e() {
        return this.f29650a && this.f29652c < this.f29651b;
    }
}