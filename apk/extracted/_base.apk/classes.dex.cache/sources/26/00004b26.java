package p311r1;

import p125h1.AbstractC6861a;

/* renamed from: r1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12022c<T> {

    /* renamed from: a */
    private final C12021b<T> f31038a;

    /* renamed from: b */
    private AbstractC6861a<?, ?> f31039b;

    /* renamed from: c */
    protected T f31040c;

    public C12022c() {
        this.f31038a = new C12021b<>();
        this.f31040c = null;
    }

    /* renamed from: a */
    public T mo6568a(C12021b<T> c12021b) {
        return this.f31040c;
    }

    /* renamed from: b */
    public final T m6567b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return mo6568a(this.f31038a.m6569h(f, f2, t, t2, f3, f4, f5));
    }

    /* renamed from: c */
    public final void m6566c(AbstractC6861a<?, ?> abstractC6861a) {
        this.f31039b = abstractC6861a;
    }

    public C12022c(T t) {
        this.f31038a = new C12021b<>();
        this.f31040c = t;
    }
}