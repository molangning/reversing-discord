package p398w6;

import p195k8.C9191p0;
import p195k8.C9198s;
import p296q6.C11769z;
import p296q6.InterfaceC11766y;

/* renamed from: w6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13408b implements InterfaceC13413g {

    /* renamed from: a */
    private final long f34495a;

    /* renamed from: b */
    private final C9198s f34496b;

    /* renamed from: c */
    private final C9198s f34497c;

    /* renamed from: d */
    private long f34498d;

    public C13408b(long j, long j2, long j3) {
        this.f34498d = j;
        this.f34495a = j3;
        C9198s c9198s = new C9198s();
        this.f34496b = c9198s;
        C9198s c9198s2 = new C9198s();
        this.f34497c = c9198s2;
        c9198s.m16176a(0L);
        c9198s2.m16176a(j2);
    }

    /* renamed from: a */
    public boolean m2626a(long j) {
        C9198s c9198s = this.f34496b;
        return j - c9198s.m16175b(c9198s.m16174c() - 1) < 100000;
    }

    /* renamed from: b */
    public void m2625b(long j, long j2) {
        if (m2626a(j)) {
            return;
        }
        this.f34496b.m16176a(j);
        this.f34497c.m16176a(j2);
    }

    @Override // p398w6.InterfaceC13413g
    /* renamed from: c */
    public long mo2599c(long j) {
        return this.f34496b.m16175b(C9191p0.m16249g(this.f34497c, j, true, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m2624d(long j) {
        this.f34498d = j;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: f */
    public InterfaceC11766y.C11767a mo1210f(long j) {
        int m16249g = C9191p0.m16249g(this.f34496b, j, true, true);
        C11769z c11769z = new C11769z(this.f34496b.m16175b(m16249g), this.f34497c.m16175b(m16249g));
        if (c11769z.f30674a != j && m16249g != this.f34496b.m16174c() - 1) {
            int i = m16249g + 1;
            return new InterfaceC11766y.C11767a(c11769z, new C11769z(this.f34496b.m16175b(i), this.f34497c.m16175b(i)));
        }
        return new InterfaceC11766y.C11767a(c11769z);
    }

    @Override // p398w6.InterfaceC13413g
    /* renamed from: g */
    public long mo2598g() {
        return this.f34495a;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: h */
    public boolean mo1209h() {
        return true;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: i */
    public long mo1208i() {
        return this.f34498d;
    }
}
