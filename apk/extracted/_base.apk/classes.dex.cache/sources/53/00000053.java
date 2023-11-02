package p008a7;

import p195k8.C9183l0;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.C11765x;
import p296q6.InterfaceC11747j;

/* renamed from: a7.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C0083y {

    /* renamed from: c */
    private boolean f397c;

    /* renamed from: d */
    private boolean f398d;

    /* renamed from: e */
    private boolean f399e;

    /* renamed from: a */
    private final C9183l0 f395a = new C9183l0(0);

    /* renamed from: f */
    private long f400f = -9223372036854775807L;

    /* renamed from: g */
    private long f401g = -9223372036854775807L;

    /* renamed from: h */
    private long f402h = -9223372036854775807L;

    /* renamed from: b */
    private final C9208y f396b = new C9208y();

    /* renamed from: a */
    private static boolean m41191a(byte[] bArr) {
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m41190b(InterfaceC11747j interfaceC11747j) {
        this.f396b.m16102M(C9191p0.f24176f);
        this.f397c = true;
        interfaceC11747j.mo6969e();
        return 0;
    }

    /* renamed from: f */
    private int m41186f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: h */
    private int m41184h(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        int min = (int) Math.min(20000L, interfaceC11747j.getLength());
        long j = 0;
        if (interfaceC11747j.getPosition() != j) {
            c11765x.f30668a = j;
            return 1;
        }
        this.f396b.m16103L(min);
        interfaceC11747j.mo6969e();
        interfaceC11747j.mo6963n(this.f396b.m16094d(), 0, min);
        this.f400f = m41183i(this.f396b);
        this.f398d = true;
        return 0;
    }

    /* renamed from: i */
    private long m41183i(C9208y c9208y) {
        int m16092f = c9208y.m16092f();
        for (int m16093e = c9208y.m16093e(); m16093e < m16092f - 3; m16093e++) {
            if (m41186f(c9208y.m16094d(), m16093e) == 442) {
                c9208y.m16099P(m16093e + 4);
                long m41180l = m41180l(c9208y);
                if (m41180l != -9223372036854775807L) {
                    return m41180l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: j */
    private int m41182j(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        long length = interfaceC11747j.getLength();
        int min = (int) Math.min(20000L, length);
        long j = length - min;
        if (interfaceC11747j.getPosition() != j) {
            c11765x.f30668a = j;
            return 1;
        }
        this.f396b.m16103L(min);
        interfaceC11747j.mo6969e();
        interfaceC11747j.mo6963n(this.f396b.m16094d(), 0, min);
        this.f401g = m41181k(this.f396b);
        this.f399e = true;
        return 0;
    }

    /* renamed from: k */
    private long m41181k(C9208y c9208y) {
        int m16093e = c9208y.m16093e();
        for (int m16092f = c9208y.m16092f() - 4; m16092f >= m16093e; m16092f--) {
            if (m41186f(c9208y.m16094d(), m16092f) == 442) {
                c9208y.m16099P(m16092f + 4);
                long m41180l = m41180l(c9208y);
                if (m41180l != -9223372036854775807L) {
                    return m41180l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: l */
    public static long m41180l(C9208y c9208y) {
        int m16093e = c9208y.m16093e();
        if (c9208y.m16097a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c9208y.m16088j(bArr, 0, 9);
        c9208y.m16099P(m16093e);
        if (!m41191a(bArr)) {
            return -9223372036854775807L;
        }
        return m41179m(bArr);
    }

    /* renamed from: m */
    private static long m41179m(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[2];
        return (((b & 56) >> 3) << 30) | ((b & 3) << 28) | ((bArr[1] & 255) << 20) | (((b2 & 248) >> 3) << 15) | ((b2 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    /* renamed from: c */
    public long m41189c() {
        return this.f402h;
    }

    /* renamed from: d */
    public C9183l0 m41188d() {
        return this.f395a;
    }

    /* renamed from: e */
    public boolean m41187e() {
        return this.f397c;
    }

    /* renamed from: g */
    public int m41185g(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        if (!this.f399e) {
            return m41182j(interfaceC11747j, c11765x);
        }
        if (this.f401g == -9223372036854775807L) {
            return m41190b(interfaceC11747j);
        }
        if (!this.f398d) {
            return m41184h(interfaceC11747j, c11765x);
        }
        long j = this.f400f;
        if (j == -9223372036854775807L) {
            return m41190b(interfaceC11747j);
        }
        this.f402h = this.f395a.m16345b(this.f401g) - this.f395a.m16345b(j);
        return m41190b(interfaceC11747j);
    }
}