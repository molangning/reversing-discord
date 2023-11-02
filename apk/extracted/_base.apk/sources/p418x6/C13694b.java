package p418x6;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import gb.AbstractC6693s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p102fb.InterfaceC6376f;
import p173j7.C8854a;
import p173j7.C8863e;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9200u;
import p195k8.C9208y;
import p213l8.C10061a;
import p213l8.C10066c;
import p213l8.C10072f;
import p259o6.C11028l;
import p296q6.C11762u;
import p418x6.AbstractC13691a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13694b {

    /* renamed from: a */
    private static final byte[] f35221a = C9191p0.m16238l0("OpusHead");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13695a {

        /* renamed from: a */
        public final int f35222a;

        /* renamed from: b */
        public int f35223b;

        /* renamed from: c */
        public int f35224c;

        /* renamed from: d */
        public long f35225d;

        /* renamed from: e */
        private final boolean f35226e;

        /* renamed from: f */
        private final C9208y f35227f;

        /* renamed from: g */
        private final C9208y f35228g;

        /* renamed from: h */
        private int f35229h;

        /* renamed from: i */
        private int f35230i;

        public C13695a(C9208y c9208y, C9208y c9208y2, boolean z) {
            this.f35228g = c9208y;
            this.f35227f = c9208y2;
            this.f35226e = z;
            c9208y2.m16099P(12);
            this.f35222a = c9208y2.m16107H();
            c9208y.m16099P(12);
            this.f35230i = c9208y.m16107H();
            C9149a.m16446g(c9208y.m16084n() == 1, "first_chunk must be 1");
            this.f35223b = -1;
        }

        /* renamed from: a */
        public boolean m1762a() {
            long m16109F;
            int i;
            int i2 = this.f35223b + 1;
            this.f35223b = i2;
            if (i2 == this.f35222a) {
                return false;
            }
            if (this.f35226e) {
                m16109F = this.f35227f.m16106I();
            } else {
                m16109F = this.f35227f.m16109F();
            }
            this.f35225d = m16109F;
            if (this.f35223b == this.f35229h) {
                this.f35224c = this.f35228g.m16107H();
                this.f35228g.m16098Q(4);
                int i3 = this.f35230i - 1;
                this.f35230i = i3;
                if (i3 > 0) {
                    i = this.f35228g.m16107H() - 1;
                } else {
                    i = -1;
                }
                this.f35229h = i;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC13696b {
        /* renamed from: a */
        int mo1761a();

        /* renamed from: b */
        int mo1760b();

        /* renamed from: c */
        int mo1759c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13697c {

        /* renamed from: a */
        public final C13721p[] f35231a;

        /* renamed from: b */
        public Format f35232b;

        /* renamed from: c */
        public int f35233c;

        /* renamed from: d */
        public int f35234d = 0;

        public C13697c(int i) {
            this.f35231a = new C13721p[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x6.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13698d implements InterfaceC13696b {

        /* renamed from: a */
        private final int f35235a;

        /* renamed from: b */
        private final int f35236b;

        /* renamed from: c */
        private final C9208y f35237c;

        public C13698d(AbstractC13691a.C13693b c13693b, Format format) {
            C9208y c9208y = c13693b.f35220b;
            this.f35237c = c9208y;
            c9208y.m16099P(12);
            int m16107H = c9208y.m16107H();
            if ("audio/raw".equals(format.f11197u)) {
                int m16256c0 = C9191p0.m16256c0(format.f11180J, format.f11178H);
                if (m16107H == 0 || m16107H % m16256c0 != 0) {
                    C9197r.m16178h("AtomParsers", "Audio sample size mismatch. stsd sample size: " + m16256c0 + ", stsz sample size: " + m16107H);
                    m16107H = m16256c0;
                }
            }
            this.f35235a = m16107H == 0 ? -1 : m16107H;
            this.f35236b = c9208y.m16107H();
        }

        @Override // p418x6.C13694b.InterfaceC13696b
        /* renamed from: a */
        public int mo1761a() {
            int i = this.f35235a;
            return i == -1 ? this.f35237c.m16107H() : i;
        }

        @Override // p418x6.C13694b.InterfaceC13696b
        /* renamed from: b */
        public int mo1760b() {
            return this.f35235a;
        }

        @Override // p418x6.C13694b.InterfaceC13696b
        /* renamed from: c */
        public int mo1759c() {
            return this.f35236b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x6.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13699e implements InterfaceC13696b {

        /* renamed from: a */
        private final C9208y f35238a;

        /* renamed from: b */
        private final int f35239b;

        /* renamed from: c */
        private final int f35240c;

        /* renamed from: d */
        private int f35241d;

        /* renamed from: e */
        private int f35242e;

        public C13699e(AbstractC13691a.C13693b c13693b) {
            C9208y c9208y = c13693b.f35220b;
            this.f35238a = c9208y;
            c9208y.m16099P(12);
            this.f35240c = c9208y.m16107H() & 255;
            this.f35239b = c9208y.m16107H();
        }

        @Override // p418x6.C13694b.InterfaceC13696b
        /* renamed from: a */
        public int mo1761a() {
            int i = this.f35240c;
            if (i == 8) {
                return this.f35238a.m16111D();
            }
            if (i == 16) {
                return this.f35238a.m16105J();
            }
            int i2 = this.f35241d;
            this.f35241d = i2 + 1;
            if (i2 % 2 == 0) {
                int m16111D = this.f35238a.m16111D();
                this.f35242e = m16111D;
                return (m16111D & 240) >> 4;
            }
            return this.f35242e & 15;
        }

        @Override // p418x6.C13694b.InterfaceC13696b
        /* renamed from: b */
        public int mo1760b() {
            return -1;
        }

        @Override // p418x6.C13694b.InterfaceC13696b
        /* renamed from: c */
        public int mo1759c() {
            return this.f35239b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13700f {

        /* renamed from: a */
        private final int f35243a;

        /* renamed from: b */
        private final long f35244b;

        /* renamed from: c */
        private final int f35245c;

        public C13700f(int i, long j, int i2) {
            this.f35243a = i;
            this.f35244b = j;
            this.f35245c = i2;
        }
    }

    /* renamed from: A */
    public static Pair<Metadata, Metadata> m1791A(AbstractC13691a.C13693b c13693b) {
        C9208y c9208y = c13693b.f35220b;
        c9208y.m16099P(8);
        Metadata metadata = null;
        Metadata metadata2 = null;
        while (c9208y.m16097a() >= 8) {
            int m16093e = c9208y.m16093e();
            int m16084n = c9208y.m16084n();
            int m16084n2 = c9208y.m16084n();
            if (m16084n2 == 1835365473) {
                c9208y.m16099P(m16093e);
                metadata = m1790B(c9208y, m16093e + m16084n);
            } else if (m16084n2 == 1936553057) {
                c9208y.m16099P(m16093e);
                metadata2 = m1769t(c9208y, m16093e + m16084n);
            }
            c9208y.m16099P(m16093e + m16084n);
        }
        return Pair.create(metadata, metadata2);
    }

    /* renamed from: B */
    private static Metadata m1790B(C9208y c9208y, int i) {
        c9208y.m16098Q(8);
        m1785d(c9208y);
        while (c9208y.m16093e() < i) {
            int m16093e = c9208y.m16093e();
            int m16084n = c9208y.m16084n();
            if (c9208y.m16084n() == 1768715124) {
                c9208y.m16099P(m16093e);
                return m1778k(c9208y, m16093e + m16084n);
            }
            c9208y.m16099P(m16093e + m16084n);
        }
        return null;
    }

    /* renamed from: C */
    private static void m1789C(C9208y c9208y, int i, int i2, int i3, int i4, int i5, C11028l c11028l, C13697c c13697c, int i6) {
        String str;
        C11028l c11028l2;
        List<byte[]> list;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        boolean z5;
        boolean z6;
        List<byte[]> list2;
        String str3;
        String str4;
        boolean z7;
        int i7 = i2;
        C11028l c11028l3 = c11028l;
        c9208y.m16099P(i7 + 8 + 8);
        c9208y.m16098Q(16);
        int m16105J = c9208y.m16105J();
        int m16105J2 = c9208y.m16105J();
        c9208y.m16098Q(50);
        int m16093e = c9208y.m16093e();
        String str5 = null;
        int i8 = i;
        if (i8 == 1701733238) {
            Pair<Integer, C13721p> m1771r = m1771r(c9208y, i7, i3);
            if (m1771r != null) {
                i8 = ((Integer) m1771r.first).intValue();
                if (c11028l3 == null) {
                    c11028l3 = null;
                } else {
                    c11028l3 = c11028l3.m9318u(((C13721p) m1771r.second).f35362b);
                }
                c13697c.f35231a[i6] = (C13721p) m1771r.second;
            }
            c9208y.m16099P(m16093e);
        }
        if (i8 == 1831958048) {
            str = "video/mpeg";
        } else {
            str = null;
        }
        float f = 1.0f;
        int i9 = -1;
        boolean z8 = false;
        byte[] bArr = null;
        List<byte[]> list3 = null;
        while (true) {
            if (m16093e - i7 < i3) {
                c9208y.m16099P(m16093e);
                int m16093e2 = c9208y.m16093e();
                c11028l2 = c11028l3;
                int m16084n = c9208y.m16084n();
                if (m16084n == 0) {
                    list = list3;
                    if (c9208y.m16093e() - i7 == i3) {
                        break;
                    }
                } else {
                    list = list3;
                }
                if (m16084n > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C9149a.m16446g(z, "childAtomSize should be positive");
                int m16084n2 = c9208y.m16084n();
                if (m16084n2 == 1635148611) {
                    if (str == null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    C9149a.m16447f(z7);
                    c9208y.m16099P(m16093e2 + 8);
                    C10061a m12469b = C10061a.m12469b(c9208y);
                    list2 = m12469b.f26157a;
                    c13697c.f35233c = m12469b.f26158b;
                    if (!z8) {
                        f = m12469b.f26161e;
                    }
                    str3 = m12469b.f26162f;
                    str4 = "video/avc";
                } else if (m16084n2 == 1752589123) {
                    if (str == null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    C9149a.m16447f(z6);
                    c9208y.m16099P(m16093e2 + 8);
                    C10072f m12408a = C10072f.m12408a(c9208y);
                    list2 = m12408a.f26197a;
                    c13697c.f35233c = m12408a.f26198b;
                    str3 = m12408a.f26199c;
                    str4 = "video/hevc";
                } else {
                    if (m16084n2 != 1685480259 && m16084n2 != 1685485123) {
                        if (m16084n2 == 1987076931) {
                            if (str == null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            C9149a.m16447f(z5);
                            if (i8 == 1987063864) {
                                str2 = "video/x-vnd.on2.vp8";
                            } else {
                                str2 = "video/x-vnd.on2.vp9";
                            }
                        } else if (m16084n2 == 1635135811) {
                            if (str == null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            C9149a.m16447f(z4);
                            str2 = "video/av01";
                        } else if (m16084n2 == 1681012275) {
                            if (str == null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            C9149a.m16447f(z3);
                            str2 = "video/3gpp";
                        } else {
                            if (m16084n2 == 1702061171) {
                                if (str == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                C9149a.m16447f(z2);
                                Pair<String, byte[]> m1781h = m1781h(c9208y, m16093e2);
                                str = (String) m1781h.first;
                                byte[] bArr2 = (byte[]) m1781h.second;
                                if (bArr2 != null) {
                                    list3 = AbstractC6693s.m22130y(bArr2);
                                }
                            } else if (m16084n2 == 1885434736) {
                                list3 = list;
                                f = m1773p(c9208y, m16093e2);
                                z8 = true;
                            } else if (m16084n2 == 1937126244) {
                                list3 = list;
                                bArr = m1772q(c9208y, m16093e2, m16084n);
                            } else if (m16084n2 == 1936995172) {
                                int m16111D = c9208y.m16111D();
                                c9208y.m16098Q(3);
                                if (m16111D == 0) {
                                    int m16111D2 = c9208y.m16111D();
                                    if (m16111D2 != 0) {
                                        int i10 = 1;
                                        if (m16111D2 != 1) {
                                            i10 = 2;
                                            if (m16111D2 != 2) {
                                                if (m16111D2 == 3) {
                                                    list3 = list;
                                                    i9 = 3;
                                                }
                                            }
                                        }
                                        i9 = i10;
                                    } else {
                                        list3 = list;
                                        i9 = 0;
                                    }
                                }
                            }
                            m16093e += m16084n;
                            i7 = i2;
                            c11028l3 = c11028l2;
                        }
                        list3 = list;
                        str = str2;
                        m16093e += m16084n;
                        i7 = i2;
                        c11028l3 = c11028l2;
                    } else {
                        C10066c m12430a = C10066c.m12430a(c9208y);
                        if (m12430a != null) {
                            str5 = m12430a.f26172c;
                            str = "video/dolby-vision";
                        }
                    }
                    list3 = list;
                    m16093e += m16084n;
                    i7 = i2;
                    c11028l3 = c11028l2;
                }
                list3 = list2;
                str = str4;
                str5 = str3;
                m16093e += m16084n;
                i7 = i2;
                c11028l3 = c11028l2;
            } else {
                c11028l2 = c11028l3;
                list = list3;
                break;
            }
        }
        if (str == null) {
            return;
        }
        c13697c.f35232b = new Format.C4362b().m29901R(i4).m29883e0(str).m29910I(str5).m29873j0(m16105J).m29902Q(m16105J2).m29891a0(f).m29885d0(i5).m29889b0(bArr).m29877h0(i9).m29899T(list).m29907L(c11028l2).m29914E();
    }

    /* renamed from: a */
    private static boolean m1788a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int m16227r = C9191p0.m16227r(4, 0, length);
        int m16227r2 = C9191p0.m16227r(jArr.length - 4, 0, length);
        if (jArr[0] <= j2 && j2 < jArr[m16227r] && jArr[m16227r2] < j3 && j3 <= j) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m1787b(C9208y c9208y, int i, int i2) {
        boolean z;
        int m16093e = c9208y.m16093e();
        while (m16093e - i < i2) {
            c9208y.m16099P(m16093e);
            int m16084n = c9208y.m16084n();
            if (m16084n > 0) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16446g(z, "childAtomSize should be positive");
            if (c9208y.m16084n() == 1702061171) {
                return m16093e;
            }
            m16093e += m16084n;
        }
        return -1;
    }

    /* renamed from: c */
    private static int m1786c(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* renamed from: d */
    public static void m1785d(C9208y c9208y) {
        int m16093e = c9208y.m16093e();
        c9208y.m16098Q(4);
        if (c9208y.m16084n() != 1751411826) {
            m16093e += 4;
        }
        c9208y.m16099P(m16093e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137  */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m1784e(p195k8.C9208y r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, p259o6.C11028l r27, p418x6.C13694b.C13697c r28, int r29) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p418x6.C13694b.m1784e(k8.y, int, int, int, int, java.lang.String, boolean, o6.l, x6.b$c, int):void");
    }

    /* renamed from: f */
    static Pair<Integer, C13721p> m1783f(C9208y c9208y, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        int i4 = -1;
        int i5 = 0;
        String str = null;
        Integer num = null;
        while (i3 - i < i2) {
            c9208y.m16099P(i3);
            int m16084n = c9208y.m16084n();
            int m16084n2 = c9208y.m16084n();
            if (m16084n2 == 1718775137) {
                num = Integer.valueOf(c9208y.m16084n());
            } else if (m16084n2 == 1935894637) {
                c9208y.m16098Q(4);
                str = c9208y.m16114A(4);
            } else if (m16084n2 == 1935894633) {
                i4 = i3;
                i5 = m16084n;
            }
            i3 += m16084n;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C9149a.m16444i(num, "frma atom is mandatory");
        if (i4 != -1) {
            z = true;
        }
        C9149a.m16446g(z, "schi atom is mandatory");
        return Pair.create(num, (C13721p) C9149a.m16444i(m1770s(c9208y, i4, i5, str), "tenc atom is mandatory"));
    }

    /* renamed from: g */
    private static Pair<long[], long[]> m1782g(AbstractC13691a.C13692a c13692a) {
        long m16109F;
        long m16084n;
        AbstractC13691a.C13693b m1792g = c13692a.m1792g(1701606260);
        if (m1792g == null) {
            return null;
        }
        C9208y c9208y = m1792g.f35220b;
        c9208y.m16099P(8);
        int m1796c = AbstractC13691a.m1796c(c9208y.m16084n());
        int m16107H = c9208y.m16107H();
        long[] jArr = new long[m16107H];
        long[] jArr2 = new long[m16107H];
        for (int i = 0; i < m16107H; i++) {
            if (m1796c == 1) {
                m16109F = c9208y.m16106I();
            } else {
                m16109F = c9208y.m16109F();
            }
            jArr[i] = m16109F;
            if (m1796c == 1) {
                m16084n = c9208y.m16075w();
            } else {
                m16084n = c9208y.m16084n();
            }
            jArr2[i] = m16084n;
            if (c9208y.m16072z() == 1) {
                c9208y.m16098Q(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: h */
    private static Pair<String, byte[]> m1781h(C9208y c9208y, int i) {
        c9208y.m16099P(i + 8 + 4);
        c9208y.m16098Q(1);
        m1780i(c9208y);
        c9208y.m16098Q(2);
        int m16111D = c9208y.m16111D();
        if ((m16111D & 128) != 0) {
            c9208y.m16098Q(2);
        }
        if ((m16111D & 64) != 0) {
            c9208y.m16098Q(c9208y.m16105J());
        }
        if ((m16111D & 32) != 0) {
            c9208y.m16098Q(2);
        }
        c9208y.m16098Q(1);
        m1780i(c9208y);
        String m16162h = C9200u.m16162h(c9208y.m16111D());
        if (!"audio/mpeg".equals(m16162h) && !"audio/vnd.dts".equals(m16162h) && !"audio/vnd.dts.hd".equals(m16162h)) {
            c9208y.m16098Q(12);
            c9208y.m16098Q(1);
            int m1780i = m1780i(c9208y);
            byte[] bArr = new byte[m1780i];
            c9208y.m16088j(bArr, 0, m1780i);
            return Pair.create(m16162h, bArr);
        }
        return Pair.create(m16162h, null);
    }

    /* renamed from: i */
    private static int m1780i(C9208y c9208y) {
        int m16111D = c9208y.m16111D();
        int i = m16111D & 127;
        while ((m16111D & 128) == 128) {
            m16111D = c9208y.m16111D();
            i = (i << 7) | (m16111D & 127);
        }
        return i;
    }

    /* renamed from: j */
    private static int m1779j(C9208y c9208y) {
        c9208y.m16099P(16);
        return c9208y.m16084n();
    }

    /* renamed from: k */
    private static Metadata m1778k(C9208y c9208y, int i) {
        c9208y.m16098Q(8);
        ArrayList arrayList = new ArrayList();
        while (c9208y.m16093e() < i) {
            Metadata.InterfaceC4429b m1700c = C13710h.m1700c(c9208y);
            if (m1700c != null) {
                arrayList.add(m1700c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* renamed from: l */
    private static Pair<Long, String> m1777l(C9208y c9208y) {
        int i;
        int i2 = 8;
        c9208y.m16099P(8);
        int m1796c = AbstractC13691a.m1796c(c9208y.m16084n());
        if (m1796c == 0) {
            i = 8;
        } else {
            i = 16;
        }
        c9208y.m16098Q(i);
        long m16109F = c9208y.m16109F();
        if (m1796c == 0) {
            i2 = 4;
        }
        c9208y.m16098Q(i2);
        int m16105J = c9208y.m16105J();
        return Pair.create(Long.valueOf(m16109F), "" + ((char) (((m16105J >> 10) & 31) + 96)) + ((char) (((m16105J >> 5) & 31) + 96)) + ((char) ((m16105J & 31) + 96)));
    }

    /* renamed from: m */
    public static Metadata m1776m(AbstractC13691a.C13692a c13692a) {
        AbstractC13691a.C13693b m1792g = c13692a.m1792g(1751411826);
        AbstractC13691a.C13693b m1792g2 = c13692a.m1792g(1801812339);
        AbstractC13691a.C13693b m1792g3 = c13692a.m1792g(1768715124);
        if (m1792g == null || m1792g2 == null || m1792g3 == null || m1779j(m1792g.f35220b) != 1835299937) {
            return null;
        }
        C9208y c9208y = m1792g2.f35220b;
        c9208y.m16099P(12);
        int m16084n = c9208y.m16084n();
        String[] strArr = new String[m16084n];
        for (int i = 0; i < m16084n; i++) {
            int m16084n2 = c9208y.m16084n();
            c9208y.m16098Q(4);
            strArr[i] = c9208y.m16114A(m16084n2 - 8);
        }
        C9208y c9208y2 = m1792g3.f35220b;
        c9208y2.m16099P(8);
        ArrayList arrayList = new ArrayList();
        while (c9208y2.m16097a() > 8) {
            int m16093e = c9208y2.m16093e();
            int m16084n3 = c9208y2.m16084n();
            int m16084n4 = c9208y2.m16084n() - 1;
            if (m16084n4 >= 0 && m16084n4 < m16084n) {
                C8854a m1697f = C13710h.m1697f(c9208y2, m16093e + m16084n3, strArr[m16084n4]);
                if (m1697f != null) {
                    arrayList.add(m1697f);
                }
            } else {
                C9197r.m16178h("AtomParsers", "Skipped metadata with unknown key index: " + m16084n4);
            }
            c9208y2.m16099P(m16093e + m16084n3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* renamed from: n */
    private static void m1775n(C9208y c9208y, int i, int i2, int i3, C13697c c13697c) {
        c9208y.m16099P(i2 + 8 + 8);
        if (i == 1835365492) {
            c9208y.m16074x();
            String m16074x = c9208y.m16074x();
            if (m16074x != null) {
                c13697c.f35232b = new Format.C4362b().m29901R(i3).m29883e0(m16074x).m29914E();
            }
        }
    }

    /* renamed from: o */
    private static long m1774o(C9208y c9208y) {
        int i = 8;
        c9208y.m16099P(8);
        if (AbstractC13691a.m1796c(c9208y.m16084n()) != 0) {
            i = 16;
        }
        c9208y.m16098Q(i);
        return c9208y.m16109F();
    }

    /* renamed from: p */
    private static float m1773p(C9208y c9208y, int i) {
        c9208y.m16099P(i + 8);
        return c9208y.m16107H() / c9208y.m16107H();
    }

    /* renamed from: q */
    private static byte[] m1772q(C9208y c9208y, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c9208y.m16099P(i3);
            int m16084n = c9208y.m16084n();
            if (c9208y.m16084n() == 1886547818) {
                return Arrays.copyOfRange(c9208y.m16094d(), i3, m16084n + i3);
            }
            i3 += m16084n;
        }
        return null;
    }

    /* renamed from: r */
    private static Pair<Integer, C13721p> m1771r(C9208y c9208y, int i, int i2) {
        boolean z;
        Pair<Integer, C13721p> m1783f;
        int m16093e = c9208y.m16093e();
        while (m16093e - i < i2) {
            c9208y.m16099P(m16093e);
            int m16084n = c9208y.m16084n();
            if (m16084n > 0) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16446g(z, "childAtomSize should be positive");
            if (c9208y.m16084n() == 1936289382 && (m1783f = m1783f(c9208y, m16093e, m16084n)) != null) {
                return m1783f;
            }
            m16093e += m16084n;
        }
        return null;
    }

    /* renamed from: s */
    private static C13721p m1770s(C9208y c9208y, int i, int i2, String str) {
        int i3;
        int i4;
        boolean z;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            c9208y.m16099P(i5);
            int m16084n = c9208y.m16084n();
            if (c9208y.m16084n() == 1952804451) {
                int m1796c = AbstractC13691a.m1796c(c9208y.m16084n());
                c9208y.m16098Q(1);
                if (m1796c == 0) {
                    c9208y.m16098Q(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int m16111D = c9208y.m16111D();
                    i3 = m16111D & 15;
                    i4 = (m16111D & 240) >> 4;
                }
                if (c9208y.m16111D() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int m16111D2 = c9208y.m16111D();
                byte[] bArr2 = new byte[16];
                c9208y.m16088j(bArr2, 0, 16);
                if (z && m16111D2 == 0) {
                    int m16111D3 = c9208y.m16111D();
                    bArr = new byte[m16111D3];
                    c9208y.m16088j(bArr, 0, m16111D3);
                }
                return new C13721p(z, str, m16111D2, bArr2, i4, i3, bArr);
            }
            i5 += m16084n;
        }
    }

    /* renamed from: t */
    private static Metadata m1769t(C9208y c9208y, int i) {
        float f;
        c9208y.m16098Q(12);
        while (c9208y.m16093e() < i) {
            int m16093e = c9208y.m16093e();
            int m16084n = c9208y.m16084n();
            if (c9208y.m16084n() == 1935766900) {
                if (m16084n < 14) {
                    return null;
                }
                c9208y.m16098Q(5);
                int m16111D = c9208y.m16111D();
                if (m16111D != 12 && m16111D != 13) {
                    return null;
                }
                if (m16111D == 12) {
                    f = 240.0f;
                } else {
                    f = 120.0f;
                }
                c9208y.m16098Q(1);
                return new Metadata(new C8863e(f, c9208y.m16111D()));
            }
            c9208y.m16099P(m16093e + m16084n);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0420 A[EDGE_INSN: B:207:0x0420->B:168:0x0420 ?: BREAK  , SYNTHETIC] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p418x6.C13723r m1768u(p418x6.C13720o r38, p418x6.AbstractC13691a.C13692a r39, p296q6.C11762u r40) {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p418x6.C13694b.m1768u(x6.o, x6.a$a, q6.u):x6.r");
    }

    /* renamed from: v */
    private static C13697c m1767v(C9208y c9208y, int i, int i2, String str, C11028l c11028l, boolean z) {
        boolean z2;
        int i3;
        c9208y.m16099P(12);
        int m16084n = c9208y.m16084n();
        C13697c c13697c = new C13697c(m16084n);
        for (int i4 = 0; i4 < m16084n; i4++) {
            int m16093e = c9208y.m16093e();
            int m16084n2 = c9208y.m16084n();
            if (m16084n2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9149a.m16446g(z2, "childAtomSize should be positive");
            int m16084n3 = c9208y.m16084n();
            if (m16084n3 != 1635148593 && m16084n3 != 1635148595 && m16084n3 != 1701733238 && m16084n3 != 1831958048 && m16084n3 != 1836070006 && m16084n3 != 1752589105 && m16084n3 != 1751479857 && m16084n3 != 1932670515 && m16084n3 != 1987063864 && m16084n3 != 1987063865 && m16084n3 != 1635135537 && m16084n3 != 1685479798 && m16084n3 != 1685479729 && m16084n3 != 1685481573 && m16084n3 != 1685481521) {
                if (m16084n3 != 1836069985 && m16084n3 != 1701733217 && m16084n3 != 1633889587 && m16084n3 != 1700998451 && m16084n3 != 1633889588 && m16084n3 != 1685353315 && m16084n3 != 1685353317 && m16084n3 != 1685353320 && m16084n3 != 1685353324 && m16084n3 != 1935764850 && m16084n3 != 1935767394 && m16084n3 != 1819304813 && m16084n3 != 1936684916 && m16084n3 != 1953984371 && m16084n3 != 778924082 && m16084n3 != 778924083 && m16084n3 != 1634492771 && m16084n3 != 1634492791 && m16084n3 != 1970037111 && m16084n3 != 1332770163 && m16084n3 != 1716281667) {
                    if (m16084n3 != 1414810956 && m16084n3 != 1954034535 && m16084n3 != 2004251764 && m16084n3 != 1937010800 && m16084n3 != 1664495672) {
                        if (m16084n3 == 1835365492) {
                            m1775n(c9208y, m16084n3, m16093e, i, c13697c);
                        } else if (m16084n3 == 1667329389) {
                            c13697c.f35232b = new Format.C4362b().m29901R(i).m29883e0("application/x-camera-motion").m29914E();
                        }
                    } else {
                        m1766w(c9208y, m16084n3, m16093e, m16084n2, i, str, c13697c);
                    }
                    i3 = m16093e;
                } else {
                    i3 = m16093e;
                    m1784e(c9208y, m16084n3, m16093e, m16084n2, i, str, z, c11028l, c13697c, i4);
                }
            } else {
                i3 = m16093e;
                m1789C(c9208y, m16084n3, i3, m16084n2, i, i2, c11028l, c13697c, i4);
            }
            c9208y.m16099P(i3 + m16084n2);
        }
        return c13697c;
    }

    /* renamed from: w */
    private static void m1766w(C9208y c9208y, int i, int i2, int i3, int i4, String str, C13697c c13697c) {
        c9208y.m16099P(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        AbstractC6693s abstractC6693s = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                c9208y.m16088j(bArr, 0, i5);
                abstractC6693s = AbstractC6693s.m22130y(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                c13697c.f35234d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        c13697c.f35232b = new Format.C4362b().m29901R(i4).m29883e0(str2).m29897V(str).m29875i0(j).m29899T(abstractC6693s).m29914E();
    }

    /* renamed from: x */
    private static C13700f m1765x(C9208y c9208y) {
        int i;
        boolean z;
        long m16106I;
        int i2 = 8;
        c9208y.m16099P(8);
        int m1796c = AbstractC13691a.m1796c(c9208y.m16084n());
        if (m1796c == 0) {
            i = 8;
        } else {
            i = 16;
        }
        c9208y.m16098Q(i);
        int m16084n = c9208y.m16084n();
        c9208y.m16098Q(4);
        int m16093e = c9208y.m16093e();
        if (m1796c == 0) {
            i2 = 4;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 < i2) {
                if (c9208y.m16094d()[m16093e + i4] != -1) {
                    z = false;
                    break;
                }
                i4++;
            } else {
                z = true;
                break;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            c9208y.m16098Q(i2);
        } else {
            if (m1796c == 0) {
                m16106I = c9208y.m16109F();
            } else {
                m16106I = c9208y.m16106I();
            }
            if (m16106I != 0) {
                j = m16106I;
            }
        }
        c9208y.m16098Q(16);
        int m16084n2 = c9208y.m16084n();
        int m16084n3 = c9208y.m16084n();
        c9208y.m16098Q(4);
        int m16084n4 = c9208y.m16084n();
        int m16084n5 = c9208y.m16084n();
        if (m16084n2 == 0 && m16084n3 == 65536 && m16084n4 == -65536 && m16084n5 == 0) {
            i3 = 90;
        } else if (m16084n2 == 0 && m16084n3 == -65536 && m16084n4 == 65536 && m16084n5 == 0) {
            i3 = 270;
        } else if (m16084n2 == -65536 && m16084n3 == 0 && m16084n4 == 0 && m16084n5 == -65536) {
            i3 = 180;
        }
        return new C13700f(m16084n, j, i3);
    }

    /* renamed from: y */
    private static C13720o m1764y(AbstractC13691a.C13692a c13692a, AbstractC13691a.C13693b c13693b, long j, C11028l c11028l, boolean z, boolean z2) {
        AbstractC13691a.C13693b c13693b2;
        long j2;
        long[] jArr;
        long[] jArr2;
        AbstractC13691a.C13692a m1793f;
        Pair<long[], long[]> m1782g;
        AbstractC13691a.C13692a c13692a2 = (AbstractC13691a.C13692a) C9149a.m16448e(c13692a.m1793f(1835297121));
        int m1786c = m1786c(m1779j(((AbstractC13691a.C13693b) C9149a.m16448e(c13692a2.m1792g(1751411826))).f35220b));
        if (m1786c == -1) {
            return null;
        }
        C13700f m1765x = m1765x(((AbstractC13691a.C13693b) C9149a.m16448e(c13692a.m1792g(1953196132))).f35220b);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            c13693b2 = c13693b;
            j2 = m1765x.f35244b;
        } else {
            c13693b2 = c13693b;
            j2 = j;
        }
        long m1774o = m1774o(c13693b2.f35220b);
        if (j2 != -9223372036854775807L) {
            j3 = C9191p0.m16296I0(j2, 1000000L, m1774o);
        }
        long j4 = j3;
        Pair<Long, String> m1777l = m1777l(((AbstractC13691a.C13693b) C9149a.m16448e(c13692a2.m1792g(1835296868))).f35220b);
        C13697c m1767v = m1767v(((AbstractC13691a.C13693b) C9149a.m16448e(((AbstractC13691a.C13692a) C9149a.m16448e(((AbstractC13691a.C13692a) C9149a.m16448e(c13692a2.m1793f(1835626086))).m1793f(1937007212))).m1792g(1937011556))).f35220b, m1765x.f35243a, m1765x.f35245c, (String) m1777l.second, c11028l, z2);
        if (!z && (m1793f = c13692a.m1793f(1701082227)) != null && (m1782g = m1782g(m1793f)) != null) {
            jArr2 = (long[]) m1782g.second;
            jArr = (long[]) m1782g.first;
        } else {
            jArr = null;
            jArr2 = null;
        }
        if (m1767v.f35232b == null) {
            return null;
        }
        return new C13720o(m1765x.f35243a, m1786c, ((Long) m1777l.first).longValue(), m1774o, j4, m1767v.f35232b, m1767v.f35234d, m1767v.f35231a, m1767v.f35233c, jArr, jArr2);
    }

    /* renamed from: z */
    public static List<C13723r> m1763z(AbstractC13691a.C13692a c13692a, C11762u c11762u, long j, C11028l c11028l, boolean z, boolean z2, InterfaceC6376f<C13720o, C13720o> interfaceC6376f) {
        C13720o apply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c13692a.f35219d.size(); i++) {
            AbstractC13691a.C13692a c13692a2 = c13692a.f35219d.get(i);
            if (c13692a2.f35216a == 1953653099 && (apply = interfaceC6376f.apply(m1764y(c13692a2, (AbstractC13691a.C13693b) C9149a.m16448e(c13692a.m1792g(1836476516)), j, c11028l, z, z2))) != null) {
                arrayList.add(m1768u(apply, (AbstractC13691a.C13692a) C9149a.m16448e(((AbstractC13691a.C13692a) C9149a.m16448e(((AbstractC13691a.C13692a) C9149a.m16448e(c13692a2.m1793f(1835297121))).m1793f(1835626086))).m1793f(1937007212)), c11762u));
            }
        }
        return arrayList;
    }
}
