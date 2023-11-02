package p398w6;

import p193k6.C9103k0;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9208y;
import p296q6.C11769z;
import p296q6.InterfaceC11766y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w6.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13415h implements InterfaceC13413g {

    /* renamed from: a */
    private final long[] f34524a;

    /* renamed from: b */
    private final long[] f34525b;

    /* renamed from: c */
    private final long f34526c;

    /* renamed from: d */
    private final long f34527d;

    private C13415h(long[] jArr, long[] jArr2, long j, long j2) {
        this.f34524a = jArr;
        this.f34525b = jArr2;
        this.f34526c = j;
        this.f34527d = j2;
    }

    /* renamed from: a */
    public static C13415h m2602a(long j, long j2, C9103k0.C9104a c9104a, C9208y c9208y) {
        int i;
        int m16111D;
        c9208y.m16098Q(10);
        int m16084n = c9208y.m16084n();
        if (m16084n <= 0) {
            return null;
        }
        int i2 = c9104a.f23926d;
        long j3 = m16084n;
        if (i2 >= 32000) {
            i = 1152;
        } else {
            i = 576;
        }
        long m16296I0 = C9191p0.m16296I0(j3, i * 1000000, i2);
        int m16105J = c9208y.m16105J();
        int m16105J2 = c9208y.m16105J();
        int m16105J3 = c9208y.m16105J();
        c9208y.m16098Q(2);
        long j4 = j2 + c9104a.f23925c;
        long[] jArr = new long[m16105J];
        long[] jArr2 = new long[m16105J];
        int i3 = 0;
        long j5 = j2;
        while (i3 < m16105J) {
            int i4 = m16105J2;
            long j6 = j4;
            jArr[i3] = (i3 * m16296I0) / m16105J;
            jArr2[i3] = Math.max(j5, j6);
            if (m16105J3 != 1) {
                if (m16105J3 != 2) {
                    if (m16105J3 != 3) {
                        if (m16105J3 != 4) {
                            return null;
                        }
                        m16111D = c9208y.m16107H();
                    } else {
                        m16111D = c9208y.m16108G();
                    }
                } else {
                    m16111D = c9208y.m16105J();
                }
            } else {
                m16111D = c9208y.m16111D();
            }
            j5 += m16111D * i4;
            i3++;
            j4 = j6;
            m16105J2 = i4;
        }
        if (j != -1 && j != j5) {
            C9197r.m16178h("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j5);
        }
        return new C13415h(jArr, jArr2, m16296I0, j5);
    }

    @Override // p398w6.InterfaceC13413g
    /* renamed from: c */
    public long mo2599c(long j) {
        return this.f34524a[C9191p0.m16245i(this.f34525b, j, true, true)];
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: f */
    public InterfaceC11766y.C11767a mo1210f(long j) {
        int m16245i = C9191p0.m16245i(this.f34524a, j, true, true);
        C11769z c11769z = new C11769z(this.f34524a[m16245i], this.f34525b[m16245i]);
        if (c11769z.f30674a < j && m16245i != this.f34524a.length - 1) {
            int i = m16245i + 1;
            return new InterfaceC11766y.C11767a(c11769z, new C11769z(this.f34524a[i], this.f34525b[i]));
        }
        return new InterfaceC11766y.C11767a(c11769z);
    }

    @Override // p398w6.InterfaceC13413g
    /* renamed from: g */
    public long mo2598g() {
        return this.f34527d;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: h */
    public boolean mo1209h() {
        return true;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: i */
    public long mo1208i() {
        return this.f34526c;
    }
}