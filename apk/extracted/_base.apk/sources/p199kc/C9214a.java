package p199kc;

import lc.AbstractC10127i;
import lc.C10120b;
import mc.C10434a;
import mc.C10435b;
import nc.C10568a;
import nc.C10570c;
import nc.C10571d;
import p136hc.C7064j;
import p136hc.C7069o;
import p157ic.C7494a;

/* renamed from: kc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9214a {

    /* renamed from: g */
    private static final int[] f24249g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C10120b f24250a;

    /* renamed from: b */
    private boolean f24251b;

    /* renamed from: c */
    private int f24252c;

    /* renamed from: d */
    private int f24253d;

    /* renamed from: e */
    private int f24254e;

    /* renamed from: f */
    private int f24255f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kc.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9215a {

        /* renamed from: a */
        private final int f24256a;

        /* renamed from: b */
        private final int f24257b;

        C9215a(int i, int i2) {
            this.f24256a = i;
            this.f24257b = i2;
        }

        /* renamed from: a */
        int m16038a() {
            return this.f24256a;
        }

        /* renamed from: b */
        int m16037b() {
            return this.f24257b;
        }

        /* renamed from: c */
        C7069o m16036c() {
            return new C7069o(m16038a(), m16037b());
        }

        public String toString() {
            return "<" + this.f24256a + ' ' + this.f24257b + '>';
        }
    }

    public C9214a(C10120b c10120b) {
        this.f24250a = c10120b;
    }

    /* renamed from: b */
    private static float m16055b(C7069o c7069o, C7069o c7069o2) {
        return C10434a.m11571a(c7069o.m21455c(), c7069o.m21454d(), c7069o2.m21455c(), c7069o2.m21454d());
    }

    /* renamed from: c */
    private static float m16054c(C9215a c9215a, C9215a c9215a2) {
        return C10434a.m11570b(c9215a.m16038a(), c9215a.m16037b(), c9215a2.m16038a(), c9215a2.m16037b());
    }

    /* renamed from: d */
    private static C7069o[] m16053d(C7069o[] c7069oArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float m21455c = c7069oArr[0].m21455c() - c7069oArr[2].m21455c();
        float m21454d = c7069oArr[0].m21454d() - c7069oArr[2].m21454d();
        float m21455c2 = (c7069oArr[0].m21455c() + c7069oArr[2].m21455c()) / 2.0f;
        float m21454d2 = (c7069oArr[0].m21454d() + c7069oArr[2].m21454d()) / 2.0f;
        float f2 = m21455c * f;
        float f3 = m21454d * f;
        C7069o c7069o = new C7069o(m21455c2 + f2, m21454d2 + f3);
        C7069o c7069o2 = new C7069o(m21455c2 - f2, m21454d2 - f3);
        float m21455c3 = c7069oArr[1].m21455c() - c7069oArr[3].m21455c();
        float m21454d3 = c7069oArr[1].m21454d() - c7069oArr[3].m21454d();
        float m21455c4 = (c7069oArr[1].m21455c() + c7069oArr[3].m21455c()) / 2.0f;
        float m21454d4 = (c7069oArr[1].m21454d() + c7069oArr[3].m21454d()) / 2.0f;
        float f4 = m21455c3 * f;
        float f5 = f * m21454d3;
        return new C7069o[]{c7069o, new C7069o(m21455c4 + f4, m21454d4 + f5), c7069o2, new C7069o(m21455c4 - f4, m21454d4 - f5)};
    }

    /* renamed from: e */
    private void m16052e(C7069o[] c7069oArr) {
        long j;
        long j2;
        if (m16042o(c7069oArr[0]) && m16042o(c7069oArr[1]) && m16042o(c7069oArr[2]) && m16042o(c7069oArr[3])) {
            int i = this.f24254e * 2;
            int[] iArr = {m16039r(c7069oArr[0], c7069oArr[1], i), m16039r(c7069oArr[1], c7069oArr[2], i), m16039r(c7069oArr[2], c7069oArr[3], i), m16039r(c7069oArr[3], c7069oArr[0], i)};
            this.f24255f = m16044m(iArr, i);
            long j3 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = iArr[(this.f24255f + i2) % 4];
                if (this.f24251b) {
                    j = j3 << 7;
                    j2 = (i3 >> 1) & 127;
                } else {
                    j = j3 << 10;
                    j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
                }
                j3 = j + j2;
            }
            int m16049h = m16049h(j3, this.f24251b);
            if (this.f24251b) {
                this.f24252c = (m16049h >> 6) + 1;
                this.f24253d = (m16049h & 63) + 1;
                return;
            }
            this.f24252c = (m16049h >> 11) + 1;
            this.f24253d = (m16049h & 2047) + 1;
            return;
        }
        throw C7064j.m21461a();
    }

    /* renamed from: f */
    private C7069o[] m16051f(C9215a c9215a) {
        boolean z;
        this.f24254e = 1;
        C9215a c9215a2 = c9215a;
        C9215a c9215a3 = c9215a2;
        C9215a c9215a4 = c9215a3;
        boolean z2 = true;
        while (this.f24254e < 9) {
            C9215a m16047j = m16047j(c9215a, z2, 1, -1);
            C9215a m16047j2 = m16047j(c9215a2, z2, 1, 1);
            C9215a m16047j3 = m16047j(c9215a3, z2, -1, 1);
            C9215a m16047j4 = m16047j(c9215a4, z2, -1, -1);
            if (this.f24254e > 2) {
                double m16054c = (m16054c(m16047j4, m16047j) * this.f24254e) / (m16054c(c9215a4, c9215a) * (this.f24254e + 2));
                if (m16054c < 0.75d || m16054c > 1.25d || !m16041p(m16047j, m16047j2, m16047j3, m16047j4)) {
                    break;
                }
            }
            z2 = !z2;
            this.f24254e++;
            c9215a4 = m16047j4;
            c9215a = m16047j;
            c9215a2 = m16047j2;
            c9215a3 = m16047j3;
        }
        int i = this.f24254e;
        if (i != 5 && i != 7) {
            throw C7064j.m21461a();
        }
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        this.f24251b = z;
        C7069o[] c7069oArr = {new C7069o(c9215a.m16038a() + 0.5f, c9215a.m16037b() - 0.5f), new C7069o(c9215a2.m16038a() + 0.5f, c9215a2.m16037b() + 0.5f), new C7069o(c9215a3.m16038a() - 0.5f, c9215a3.m16037b() + 0.5f), new C7069o(c9215a4.m16038a() - 0.5f, c9215a4.m16037b() - 0.5f)};
        int i2 = this.f24254e;
        return m16053d(c7069oArr, (i2 * 2) - 3, i2 * 2);
    }

    /* renamed from: g */
    private int m16050g(C9215a c9215a, C9215a c9215a2) {
        float m16054c = m16054c(c9215a, c9215a2);
        float m16038a = (c9215a2.m16038a() - c9215a.m16038a()) / m16054c;
        float m16037b = (c9215a2.m16037b() - c9215a.m16037b()) / m16054c;
        float m16038a2 = c9215a.m16038a();
        float m16037b2 = c9215a.m16037b();
        boolean m12252e = this.f24250a.m12252e(c9215a.m16038a(), c9215a.m16037b());
        int ceil = (int) Math.ceil(m16054c);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            m16038a2 += m16038a;
            m16037b2 += m16037b;
            if (this.f24250a.m12252e(C10434a.m11569c(m16038a2), C10434a.m11569c(m16037b2)) != m12252e) {
                i++;
            }
        }
        float f = i / m16054c;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        if (z == m12252e) {
            return 1;
        }
        return -1;
    }

    /* renamed from: h */
    private static int m16049h(long j, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C10570c(C10568a.f27574k).m11203a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (C10571d unused) {
            throw C7064j.m21461a();
        }
    }

    /* renamed from: i */
    private int m16048i() {
        if (this.f24251b) {
            return (this.f24252c * 4) + 11;
        }
        int i = this.f24252c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    private C9215a m16047j(C9215a c9215a, boolean z, int i, int i2) {
        int m16038a = c9215a.m16038a() + i;
        int m16037b = c9215a.m16037b();
        while (true) {
            m16037b += i2;
            if (!m16043n(m16038a, m16037b) || this.f24250a.m12252e(m16038a, m16037b) != z) {
                break;
            }
            m16038a += i;
        }
        int i3 = m16038a - i;
        int i4 = m16037b - i2;
        while (m16043n(i3, i4) && this.f24250a.m12252e(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m16043n(i5, i4) && this.f24250a.m12252e(i5, i4) == z) {
            i4 += i2;
        }
        return new C9215a(i5, i4 - i2);
    }

    /* renamed from: k */
    private C9215a m16046k() {
        C7069o m16036c;
        C7069o c7069o;
        C7069o c7069o2;
        C7069o c7069o3;
        C7069o m16036c2;
        C7069o m16036c3;
        C7069o m16036c4;
        C7069o m16036c5;
        try {
            C7069o[] m11565c = new C10435b(this.f24250a).m11565c();
            c7069o2 = m11565c[0];
            c7069o3 = m11565c[1];
            c7069o = m11565c[2];
            m16036c = m11565c[3];
        } catch (C7064j unused) {
            int m12246m = this.f24250a.m12246m() / 2;
            int m12249j = this.f24250a.m12249j() / 2;
            int i = m12246m + 7;
            int i2 = m12249j - 7;
            C7069o m16036c6 = m16047j(new C9215a(i, i2), false, 1, -1).m16036c();
            int i3 = m12249j + 7;
            C7069o m16036c7 = m16047j(new C9215a(i, i3), false, 1, 1).m16036c();
            int i4 = m12246m - 7;
            C7069o m16036c8 = m16047j(new C9215a(i4, i3), false, -1, 1).m16036c();
            m16036c = m16047j(new C9215a(i4, i2), false, -1, -1).m16036c();
            c7069o = m16036c8;
            c7069o2 = m16036c6;
            c7069o3 = m16036c7;
        }
        int m11569c = C10434a.m11569c((((c7069o2.m21455c() + m16036c.m21455c()) + c7069o3.m21455c()) + c7069o.m21455c()) / 4.0f);
        int m11569c2 = C10434a.m11569c((((c7069o2.m21454d() + m16036c.m21454d()) + c7069o3.m21454d()) + c7069o.m21454d()) / 4.0f);
        try {
            C7069o[] m11565c2 = new C10435b(this.f24250a, 15, m11569c, m11569c2).m11565c();
            m16036c2 = m11565c2[0];
            m16036c3 = m11565c2[1];
            m16036c4 = m11565c2[2];
            m16036c5 = m11565c2[3];
        } catch (C7064j unused2) {
            int i5 = m11569c + 7;
            int i6 = m11569c2 - 7;
            m16036c2 = m16047j(new C9215a(i5, i6), false, 1, -1).m16036c();
            int i7 = m11569c2 + 7;
            m16036c3 = m16047j(new C9215a(i5, i7), false, 1, 1).m16036c();
            int i8 = m11569c - 7;
            m16036c4 = m16047j(new C9215a(i8, i7), false, -1, 1).m16036c();
            m16036c5 = m16047j(new C9215a(i8, i6), false, -1, -1).m16036c();
        }
        return new C9215a(C10434a.m11569c((((m16036c2.m21455c() + m16036c5.m21455c()) + m16036c3.m21455c()) + m16036c4.m21455c()) / 4.0f), C10434a.m11569c((((m16036c2.m21454d() + m16036c5.m21454d()) + m16036c3.m21454d()) + m16036c4.m21454d()) / 4.0f));
    }

    /* renamed from: l */
    private C7069o[] m16045l(C7069o[] c7069oArr) {
        return m16053d(c7069oArr, this.f24254e * 2, m16048i());
    }

    /* renamed from: m */
    private static int m16044m(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f24249g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C7064j.m21461a();
    }

    /* renamed from: n */
    private boolean m16043n(int i, int i2) {
        return i >= 0 && i < this.f24250a.m12246m() && i2 > 0 && i2 < this.f24250a.m12249j();
    }

    /* renamed from: o */
    private boolean m16042o(C7069o c7069o) {
        return m16043n(C10434a.m11569c(c7069o.m21455c()), C10434a.m11569c(c7069o.m21454d()));
    }

    /* renamed from: p */
    private boolean m16041p(C9215a c9215a, C9215a c9215a2, C9215a c9215a3, C9215a c9215a4) {
        C9215a c9215a5 = new C9215a(c9215a.m16038a() - 3, c9215a.m16037b() + 3);
        C9215a c9215a6 = new C9215a(c9215a2.m16038a() - 3, c9215a2.m16037b() - 3);
        C9215a c9215a7 = new C9215a(c9215a3.m16038a() + 3, c9215a3.m16037b() - 3);
        C9215a c9215a8 = new C9215a(c9215a4.m16038a() + 3, c9215a4.m16037b() + 3);
        int m16050g = m16050g(c9215a8, c9215a5);
        if (m16050g == 0 || m16050g(c9215a5, c9215a6) != m16050g || m16050g(c9215a6, c9215a7) != m16050g || m16050g(c9215a7, c9215a8) != m16050g) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private C10120b m16040q(C10120b c10120b, C7069o c7069o, C7069o c7069o2, C7069o c7069o3, C7069o c7069o4) {
        AbstractC10127i m12216b = AbstractC10127i.m12216b();
        int m16048i = m16048i();
        float f = m16048i / 2.0f;
        int i = this.f24254e;
        float f2 = f - i;
        float f3 = f + i;
        return m12216b.mo12215c(c10120b, m16048i, m16048i, f2, f2, f3, f2, f3, f3, f2, f3, c7069o.m21455c(), c7069o.m21454d(), c7069o2.m21455c(), c7069o2.m21454d(), c7069o3.m21455c(), c7069o3.m21454d(), c7069o4.m21455c(), c7069o4.m21454d());
    }

    /* renamed from: r */
    private int m16039r(C7069o c7069o, C7069o c7069o2, int i) {
        float m16055b = m16055b(c7069o, c7069o2);
        float f = m16055b / i;
        float m21455c = c7069o.m21455c();
        float m21454d = c7069o.m21454d();
        float m21455c2 = ((c7069o2.m21455c() - c7069o.m21455c()) * f) / m16055b;
        float m21454d2 = (f * (c7069o2.m21454d() - c7069o.m21454d())) / m16055b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f24250a.m12252e(C10434a.m11569c((f2 * m21455c2) + m21455c), C10434a.m11569c((f2 * m21454d2) + m21454d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public C7494a m16056a(boolean z) {
        C7069o[] m16051f = m16051f(m16046k());
        if (z) {
            C7069o c7069o = m16051f[0];
            m16051f[0] = m16051f[2];
            m16051f[2] = c7069o;
        }
        m16052e(m16051f);
        C10120b c10120b = this.f24250a;
        int i = this.f24255f;
        return new C7494a(m16040q(c10120b, m16051f[i % 4], m16051f[(i + 1) % 4], m16051f[(i + 2) % 4], m16051f[(i + 3) % 4]), m16045l(m16051f), this.f24251b, this.f24253d, this.f24252c);
    }
}
