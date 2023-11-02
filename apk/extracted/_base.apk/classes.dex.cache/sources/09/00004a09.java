package p296q6;

import java.util.Arrays;
import p151i6.C7402m;
import p195k8.C9197r;
import p195k8.C9208y;

/* renamed from: q6.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11737d0 {

    /* renamed from: q6.d0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11738a {

        /* renamed from: a */
        public final int f30590a;

        /* renamed from: b */
        public final int f30591b;

        /* renamed from: c */
        public final long[] f30592c;

        /* renamed from: d */
        public final int f30593d;

        /* renamed from: e */
        public final boolean f30594e;

        public C11738a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f30590a = i;
            this.f30591b = i2;
            this.f30592c = jArr;
            this.f30593d = i3;
            this.f30594e = z;
        }
    }

    /* renamed from: q6.d0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11739b {

        /* renamed from: a */
        public final String f30595a;

        /* renamed from: b */
        public final String[] f30596b;

        /* renamed from: c */
        public final int f30597c;

        public C11739b(String str, String[] strArr, int i) {
            this.f30595a = str;
            this.f30596b = strArr;
            this.f30597c = i;
        }
    }

    /* renamed from: q6.d0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11740c {

        /* renamed from: a */
        public final boolean f30598a;

        /* renamed from: b */
        public final int f30599b;

        /* renamed from: c */
        public final int f30600c;

        /* renamed from: d */
        public final int f30601d;

        public C11740c(boolean z, int i, int i2, int i3) {
            this.f30598a = z;
            this.f30599b = i;
            this.f30600c = i2;
            this.f30601d = i3;
        }
    }

    /* renamed from: q6.d0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11741d {

        /* renamed from: a */
        public final int f30602a;

        /* renamed from: b */
        public final int f30603b;

        /* renamed from: c */
        public final int f30604c;

        /* renamed from: d */
        public final int f30605d;

        /* renamed from: e */
        public final int f30606e;

        /* renamed from: f */
        public final int f30607f;

        /* renamed from: g */
        public final int f30608g;

        /* renamed from: h */
        public final int f30609h;

        /* renamed from: i */
        public final boolean f30610i;

        /* renamed from: j */
        public final byte[] f30611j;

        public C11741d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f30602a = i;
            this.f30603b = i2;
            this.f30604c = i3;
            this.f30605d = i4;
            this.f30606e = i5;
            this.f30607f = i6;
            this.f30608g = i7;
            this.f30609h = i8;
            this.f30610i = z;
            this.f30611j = bArr;
        }
    }

    /* renamed from: a */
    public static int m7030a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    private static long m7029b(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* renamed from: c */
    private static C11738a m7028c(C11735c0 c11735c0) {
        if (c11735c0.m7033d(24) == 5653314) {
            int m7033d = c11735c0.m7033d(16);
            int m7033d2 = c11735c0.m7033d(24);
            long[] jArr = new long[m7033d2];
            boolean m7034c = c11735c0.m7034c();
            long j = 0;
            if (!m7034c) {
                boolean m7034c2 = c11735c0.m7034c();
                for (int i = 0; i < m7033d2; i++) {
                    if (m7034c2) {
                        if (c11735c0.m7034c()) {
                            jArr[i] = c11735c0.m7033d(5) + 1;
                        } else {
                            jArr[i] = 0;
                        }
                    } else {
                        jArr[i] = c11735c0.m7033d(5) + 1;
                    }
                }
            } else {
                int m7033d3 = c11735c0.m7033d(5) + 1;
                int i2 = 0;
                while (i2 < m7033d2) {
                    int m7033d4 = c11735c0.m7033d(m7030a(m7033d2 - i2));
                    for (int i3 = 0; i3 < m7033d4 && i2 < m7033d2; i3++) {
                        jArr[i2] = m7033d3;
                        i2++;
                    }
                    m7033d3++;
                }
            }
            int m7033d5 = c11735c0.m7033d(4);
            if (m7033d5 <= 2) {
                if (m7033d5 == 1 || m7033d5 == 2) {
                    c11735c0.m7032e(32);
                    c11735c0.m7032e(32);
                    int m7033d6 = c11735c0.m7033d(4) + 1;
                    c11735c0.m7032e(1);
                    if (m7033d5 == 1) {
                        if (m7033d != 0) {
                            j = m7029b(m7033d2, m7033d);
                        }
                    } else {
                        j = m7033d2 * m7033d;
                    }
                    c11735c0.m7032e((int) (j * m7033d6));
                }
                return new C11738a(m7033d, m7033d2, jArr, m7033d5, m7034c);
            }
            throw new C7402m("lookup type greater than 2 not decodable: " + m7033d5);
        }
        throw new C7402m("expected code book to start with [0x56, 0x43, 0x42] at " + c11735c0.m7035b());
    }

    /* renamed from: d */
    private static void m7027d(C11735c0 c11735c0) {
        int m7033d = c11735c0.m7033d(6) + 1;
        for (int i = 0; i < m7033d; i++) {
            int m7033d2 = c11735c0.m7033d(16);
            if (m7033d2 != 0) {
                if (m7033d2 == 1) {
                    int m7033d3 = c11735c0.m7033d(5);
                    int[] iArr = new int[m7033d3];
                    int i2 = -1;
                    for (int i3 = 0; i3 < m7033d3; i3++) {
                        int m7033d4 = c11735c0.m7033d(4);
                        iArr[i3] = m7033d4;
                        if (m7033d4 > i2) {
                            i2 = m7033d4;
                        }
                    }
                    int i4 = i2 + 1;
                    int[] iArr2 = new int[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        iArr2[i5] = c11735c0.m7033d(3) + 1;
                        int m7033d5 = c11735c0.m7033d(2);
                        if (m7033d5 > 0) {
                            c11735c0.m7032e(8);
                        }
                        for (int i6 = 0; i6 < (1 << m7033d5); i6++) {
                            c11735c0.m7032e(8);
                        }
                    }
                    c11735c0.m7032e(2);
                    int m7033d6 = c11735c0.m7033d(4);
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 0; i9 < m7033d3; i9++) {
                        i7 += iArr2[iArr[i9]];
                        while (i8 < i7) {
                            c11735c0.m7032e(m7033d6);
                            i8++;
                        }
                    }
                } else {
                    throw new C7402m("floor type greater than 1 not decodable: " + m7033d2);
                }
            } else {
                c11735c0.m7032e(8);
                c11735c0.m7032e(16);
                c11735c0.m7032e(16);
                c11735c0.m7032e(6);
                c11735c0.m7032e(8);
                int m7033d7 = c11735c0.m7033d(4) + 1;
                for (int i10 = 0; i10 < m7033d7; i10++) {
                    c11735c0.m7032e(8);
                }
            }
        }
    }

    /* renamed from: e */
    private static void m7026e(int i, C11735c0 c11735c0) {
        int i2;
        int m7033d = c11735c0.m7033d(6) + 1;
        for (int i3 = 0; i3 < m7033d; i3++) {
            int m7033d2 = c11735c0.m7033d(16);
            if (m7033d2 != 0) {
                C9197r.m16183c("VorbisUtil", "mapping type other than 0 not supported: " + m7033d2);
            } else {
                if (c11735c0.m7034c()) {
                    i2 = c11735c0.m7033d(4) + 1;
                } else {
                    i2 = 1;
                }
                if (c11735c0.m7034c()) {
                    int m7033d3 = c11735c0.m7033d(8) + 1;
                    for (int i4 = 0; i4 < m7033d3; i4++) {
                        int i5 = i - 1;
                        c11735c0.m7032e(m7030a(i5));
                        c11735c0.m7032e(m7030a(i5));
                    }
                }
                if (c11735c0.m7033d(2) == 0) {
                    if (i2 > 1) {
                        for (int i6 = 0; i6 < i; i6++) {
                            c11735c0.m7032e(4);
                        }
                    }
                    for (int i7 = 0; i7 < i2; i7++) {
                        c11735c0.m7032e(8);
                        c11735c0.m7032e(8);
                        c11735c0.m7032e(8);
                    }
                } else {
                    throw new C7402m("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    /* renamed from: f */
    private static C11740c[] m7025f(C11735c0 c11735c0) {
        int m7033d = c11735c0.m7033d(6) + 1;
        C11740c[] c11740cArr = new C11740c[m7033d];
        for (int i = 0; i < m7033d; i++) {
            c11740cArr[i] = new C11740c(c11735c0.m7034c(), c11735c0.m7033d(16), c11735c0.m7033d(16), c11735c0.m7033d(8));
        }
        return c11740cArr;
    }

    /* renamed from: g */
    private static void m7024g(C11735c0 c11735c0) {
        int i;
        int m7033d = c11735c0.m7033d(6) + 1;
        for (int i2 = 0; i2 < m7033d; i2++) {
            if (c11735c0.m7033d(16) <= 2) {
                c11735c0.m7032e(24);
                c11735c0.m7032e(24);
                c11735c0.m7032e(24);
                int m7033d2 = c11735c0.m7033d(6) + 1;
                c11735c0.m7032e(8);
                int[] iArr = new int[m7033d2];
                for (int i3 = 0; i3 < m7033d2; i3++) {
                    int m7033d3 = c11735c0.m7033d(3);
                    if (c11735c0.m7034c()) {
                        i = c11735c0.m7033d(5);
                    } else {
                        i = 0;
                    }
                    iArr[i3] = (i * 8) + m7033d3;
                }
                for (int i4 = 0; i4 < m7033d2; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        if ((iArr[i4] & (1 << i5)) != 0) {
                            c11735c0.m7032e(8);
                        }
                    }
                }
            } else {
                throw new C7402m("residueType greater than 2 is not decodable");
            }
        }
    }

    /* renamed from: h */
    public static C11739b m7023h(C9208y c9208y) {
        return m7022i(c9208y, true, true);
    }

    /* renamed from: i */
    public static C11739b m7022i(C9208y c9208y, boolean z, boolean z2) {
        if (z) {
            m7019l(3, c9208y, false);
        }
        String m16114A = c9208y.m16114A((int) c9208y.m16078t());
        int length = 11 + m16114A.length();
        long m16078t = c9208y.m16078t();
        String[] strArr = new String[(int) m16078t];
        int i = length + 4;
        for (int i2 = 0; i2 < m16078t; i2++) {
            String m16114A2 = c9208y.m16114A((int) c9208y.m16078t());
            strArr[i2] = m16114A2;
            i = i + 4 + m16114A2.length();
        }
        if (z2 && (c9208y.m16111D() & 1) == 0) {
            throw new C7402m("framing bit expected to be set");
        }
        return new C11739b(m16114A, strArr, i + 1);
    }

    /* renamed from: j */
    public static C11741d m7021j(C9208y c9208y) {
        boolean z = true;
        m7019l(1, c9208y, false);
        int m16077u = c9208y.m16077u();
        int m16111D = c9208y.m16111D();
        int m16077u2 = c9208y.m16077u();
        int m16081q = c9208y.m16081q();
        if (m16081q <= 0) {
            m16081q = -1;
        }
        int m16081q2 = c9208y.m16081q();
        if (m16081q2 <= 0) {
            m16081q2 = -1;
        }
        int m16081q3 = c9208y.m16081q();
        if (m16081q3 <= 0) {
            m16081q3 = -1;
        }
        int m16111D2 = c9208y.m16111D();
        int pow = (int) Math.pow(2.0d, m16111D2 & 15);
        int pow2 = (int) Math.pow(2.0d, (m16111D2 & 240) >> 4);
        if ((c9208y.m16111D() & 1) <= 0) {
            z = false;
        }
        return new C11741d(m16077u, m16111D, m16077u2, m16081q, m16081q2, m16081q3, pow, pow2, z, Arrays.copyOf(c9208y.m16094d(), c9208y.m16092f()));
    }

    /* renamed from: k */
    public static C11740c[] m7020k(C9208y c9208y, int i) {
        m7019l(5, c9208y, false);
        int m16111D = c9208y.m16111D() + 1;
        C11735c0 c11735c0 = new C11735c0(c9208y.m16094d());
        c11735c0.m7032e(c9208y.m16093e() * 8);
        for (int i2 = 0; i2 < m16111D; i2++) {
            m7028c(c11735c0);
        }
        int m7033d = c11735c0.m7033d(6) + 1;
        for (int i3 = 0; i3 < m7033d; i3++) {
            if (c11735c0.m7033d(16) != 0) {
                throw new C7402m("placeholder of time domain transforms not zeroed out");
            }
        }
        m7027d(c11735c0);
        m7024g(c11735c0);
        m7026e(i, c11735c0);
        C11740c[] m7025f = m7025f(c11735c0);
        if (c11735c0.m7034c()) {
            return m7025f;
        }
        throw new C7402m("framing bit after modes not set as expected");
    }

    /* renamed from: l */
    public static boolean m7019l(int i, C9208y c9208y, boolean z) {
        if (c9208y.m16097a() < 7) {
            if (z) {
                return false;
            }
            throw new C7402m("too short header: " + c9208y.m16097a());
        } else if (c9208y.m16111D() != i) {
            if (z) {
                return false;
            }
            throw new C7402m("expected header type " + Integer.toHexString(i));
        } else if (c9208y.m16111D() == 118 && c9208y.m16111D() == 111 && c9208y.m16111D() == 114 && c9208y.m16111D() == 98 && c9208y.m16111D() == 105 && c9208y.m16111D() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C7402m("expected characters 'vorbis'");
        }
    }
}