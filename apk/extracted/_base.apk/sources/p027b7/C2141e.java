package p027b7;

import p195k8.C9191p0;
import p296q6.C11769z;
import p296q6.InterfaceC11766y;

/* renamed from: b7.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2141e implements InterfaceC11766y {

    /* renamed from: a */
    private final C2138c f6035a;

    /* renamed from: b */
    private final int f6036b;

    /* renamed from: c */
    private final long f6037c;

    /* renamed from: d */
    private final long f6038d;

    /* renamed from: e */
    private final long f6039e;

    public C2141e(C2138c c2138c, int i, long j, long j2) {
        this.f6035a = c2138c;
        this.f6036b = i;
        this.f6037c = j;
        long j3 = (j2 - j) / c2138c.f6030e;
        this.f6038d = j3;
        this.f6039e = m34129a(j3);
    }

    /* renamed from: a */
    private long m34129a(long j) {
        return C9191p0.m16296I0(j * this.f6036b, 1000000L, this.f6035a.f6028c);
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: f */
    public InterfaceC11766y.C11767a mo1210f(long j) {
        long m16225s = C9191p0.m16225s((this.f6035a.f6028c * j) / (this.f6036b * 1000000), 0L, this.f6038d - 1);
        long j2 = this.f6037c + (this.f6035a.f6030e * m16225s);
        long m34129a = m34129a(m16225s);
        C11769z c11769z = new C11769z(m34129a, j2);
        if (m34129a < j && m16225s != this.f6038d - 1) {
            long j3 = m16225s + 1;
            return new InterfaceC11766y.C11767a(c11769z, new C11769z(m34129a(j3), this.f6037c + (this.f6035a.f6030e * j3)));
        }
        return new InterfaceC11766y.C11767a(c11769z);
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: h */
    public boolean mo1209h() {
        return true;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: i */
    public long mo1208i() {
        return this.f6039e;
    }
}
