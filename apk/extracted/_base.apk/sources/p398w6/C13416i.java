package p398w6;

import p193k6.C9103k0;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9208y;
import p296q6.C11769z;
import p296q6.InterfaceC11766y;

/* renamed from: w6.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13416i implements InterfaceC13413g {

    /* renamed from: a */
    private final long f34528a;

    /* renamed from: b */
    private final int f34529b;

    /* renamed from: c */
    private final long f34530c;

    /* renamed from: d */
    private final long f34531d;

    /* renamed from: e */
    private final long f34532e;

    /* renamed from: f */
    private final long[] f34533f;

    private C13416i(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    /* renamed from: a */
    public static C13416i m2601a(long j, long j2, C9103k0.C9104a c9104a, C9208y c9208y) {
        int m16107H;
        int i = c9104a.f23929g;
        int i2 = c9104a.f23926d;
        int m16084n = c9208y.m16084n();
        if ((m16084n & 1) == 1 && (m16107H = c9208y.m16107H()) != 0) {
            long m16296I0 = C9191p0.m16296I0(m16107H, i * 1000000, i2);
            if ((m16084n & 6) != 6) {
                return new C13416i(j2, c9104a.f23925c, m16296I0);
            }
            long m16109F = c9208y.m16109F();
            long[] jArr = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr[i3] = c9208y.m16111D();
            }
            if (j != -1) {
                long j3 = j2 + m16109F;
                if (j != j3) {
                    C9197r.m16178h("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
                }
            }
            return new C13416i(j2, c9104a.f23925c, m16296I0, m16109F, jArr);
        }
        return null;
    }

    /* renamed from: b */
    private long m2600b(int i) {
        return (this.f34530c * i) / 100;
    }

    @Override // p398w6.InterfaceC13413g
    /* renamed from: c */
    public long mo2599c(long j) {
        long j2;
        double d;
        long j3 = j - this.f34528a;
        if (mo1209h() && j3 > this.f34529b) {
            long[] jArr = (long[]) C9149a.m16445h(this.f34533f);
            double d2 = (j3 * 256.0d) / this.f34531d;
            int m16245i = C9191p0.m16245i(jArr, (long) d2, true, true);
            long m2600b = m2600b(m16245i);
            long j4 = jArr[m16245i];
            int i = m16245i + 1;
            long m2600b2 = m2600b(i);
            if (m16245i == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i];
            }
            if (j4 == j2) {
                d = 0.0d;
            } else {
                d = (d2 - j4) / (j2 - j4);
            }
            return m2600b + Math.round(d * (m2600b2 - m2600b));
        }
        return 0L;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: f */
    public InterfaceC11766y.C11767a mo1210f(long j) {
        double d;
        if (!mo1209h()) {
            return new InterfaceC11766y.C11767a(new C11769z(0L, this.f34528a + this.f34529b));
        }
        long m16225s = C9191p0.m16225s(j, 0L, this.f34530c);
        double d2 = (m16225s * 100.0d) / this.f34530c;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = (long[]) C9149a.m16445h(this.f34533f);
                double d4 = jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = jArr[i + 1];
                }
                d3 = d4 + ((d2 - i) * (d - d4));
            }
        }
        return new InterfaceC11766y.C11767a(new C11769z(m16225s, this.f34528a + C9191p0.m16225s(Math.round((d3 / 256.0d) * this.f34531d), this.f34529b, this.f34531d - 1)));
    }

    @Override // p398w6.InterfaceC13413g
    /* renamed from: g */
    public long mo2598g() {
        return this.f34532e;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: h */
    public boolean mo1209h() {
        return this.f34533f != null;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: i */
    public long mo1208i() {
        return this.f34530c;
    }

    private C13416i(long j, int i, long j2, long j3, long[] jArr) {
        this.f34528a = j;
        this.f34529b = i;
        this.f34530c = j2;
        this.f34533f = jArr;
        this.f34531d = j3;
        this.f34532e = j3 != -1 ? j + j3 : -1L;
    }
}
