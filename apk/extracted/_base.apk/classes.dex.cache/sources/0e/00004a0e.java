package p296q6;

import p195k8.C9191p0;
import p296q6.InterfaceC11766y;

/* renamed from: q6.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11742e implements InterfaceC11766y {

    /* renamed from: a */
    private final long f30612a;

    /* renamed from: b */
    private final long f30613b;

    /* renamed from: c */
    private final int f30614c;

    /* renamed from: d */
    private final long f30615d;

    /* renamed from: e */
    private final int f30616e;

    /* renamed from: f */
    private final long f30617f;

    public C11742e(long j, long j2, int i, int i2) {
        this.f30612a = j;
        this.f30613b = j2;
        this.f30614c = i2 == -1 ? 1 : i2;
        this.f30616e = i;
        if (j == -1) {
            this.f30615d = -1L;
            this.f30617f = -9223372036854775807L;
            return;
        }
        this.f30615d = j - j2;
        this.f30617f = m7016d(j, j2, i);
    }

    /* renamed from: a */
    private long m7018a(long j) {
        int i = this.f30614c;
        return this.f30613b + C9191p0.m16225s((((j * this.f30616e) / 8000000) / i) * i, 0L, this.f30615d - i);
    }

    /* renamed from: d */
    private static long m7016d(long j, long j2, int i) {
        return ((Math.max(0L, j - j2) * 8) * 1000000) / i;
    }

    /* renamed from: b */
    public long m7017b(long j) {
        return m7016d(j, this.f30613b, this.f30616e);
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: f */
    public InterfaceC11766y.C11767a mo1210f(long j) {
        if (this.f30615d == -1) {
            return new InterfaceC11766y.C11767a(new C11769z(0L, this.f30613b));
        }
        long m7018a = m7018a(j);
        long m7017b = m7017b(m7018a);
        C11769z c11769z = new C11769z(m7017b, m7018a);
        if (m7017b < j) {
            int i = this.f30614c;
            if (i + m7018a < this.f30612a) {
                long j2 = m7018a + i;
                return new InterfaceC11766y.C11767a(c11769z, new C11769z(m7017b(j2), j2));
            }
        }
        return new InterfaceC11766y.C11767a(c11769z);
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: h */
    public boolean mo1209h() {
        return this.f30615d != -1;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: i */
    public long mo1208i() {
        return this.f30617f;
    }
}