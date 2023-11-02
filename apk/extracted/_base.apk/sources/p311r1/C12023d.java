package p311r1;

/* renamed from: r1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12023d {

    /* renamed from: a */
    private float f31041a;

    /* renamed from: b */
    private float f31042b;

    public C12023d(float f, float f2) {
        this.f31041a = f;
        this.f31042b = f2;
    }

    /* renamed from: a */
    public boolean m6565a(float f, float f2) {
        return this.f31041a == f && this.f31042b == f2;
    }

    /* renamed from: b */
    public float m6564b() {
        return this.f31041a;
    }

    /* renamed from: c */
    public float m6563c() {
        return this.f31042b;
    }

    /* renamed from: d */
    public void m6562d(float f, float f2) {
        this.f31041a = f;
        this.f31042b = f2;
    }

    public String toString() {
        return m6564b() + "x" + m6563c();
    }

    public C12023d() {
        this(1.0f, 1.0f);
    }
}
