package p418x6;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p102fb.InterfaceC6376f;
import p151i6.C7402m;
import p173j7.C8856b;
import p193k6.C9070c;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9204w;
import p195k8.C9208y;
import p296q6.C11752n;
import p296q6.C11762u;
import p296q6.C11765x;
import p296q6.C11769z;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;
import p418x6.AbstractC13691a;

/* renamed from: x6.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13713k implements InterfaceC11746i, InterfaceC11766y {

    /* renamed from: y */
    public static final InterfaceC11753o f35309y = new InterfaceC11753o() { // from class: x6.i
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m1676r;
            m1676r = C13713k.m1676r();
            return m1676r;
        }
    };

    /* renamed from: a */
    private final int f35310a;

    /* renamed from: b */
    private final C9208y f35311b;

    /* renamed from: c */
    private final C9208y f35312c;

    /* renamed from: d */
    private final C9208y f35313d;

    /* renamed from: e */
    private final C9208y f35314e;

    /* renamed from: f */
    private final ArrayDeque<AbstractC13691a.C13692a> f35315f;

    /* renamed from: g */
    private final C13717m f35316g;

    /* renamed from: h */
    private final List<Metadata.InterfaceC4429b> f35317h;

    /* renamed from: i */
    private int f35318i;

    /* renamed from: j */
    private int f35319j;

    /* renamed from: k */
    private long f35320k;

    /* renamed from: l */
    private int f35321l;

    /* renamed from: m */
    private C9208y f35322m;

    /* renamed from: n */
    private int f35323n;

    /* renamed from: o */
    private int f35324o;

    /* renamed from: p */
    private int f35325p;

    /* renamed from: q */
    private int f35326q;

    /* renamed from: r */
    private InterfaceC11748k f35327r;

    /* renamed from: s */
    private C13714a[] f35328s;

    /* renamed from: t */
    private long[][] f35329t;

    /* renamed from: u */
    private int f35330u;

    /* renamed from: v */
    private long f35331v;

    /* renamed from: w */
    private int f35332w;

    /* renamed from: x */
    private C8856b f35333x;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13714a {

        /* renamed from: a */
        public final C13720o f35334a;

        /* renamed from: b */
        public final C13723r f35335b;

        /* renamed from: c */
        public final InterfaceC11732b0 f35336c;

        /* renamed from: d */
        public int f35337d;

        public C13714a(C13720o c13720o, C13723r c13723r, InterfaceC11732b0 interfaceC11732b0) {
            this.f35334a = c13720o;
            this.f35335b = c13723r;
            this.f35336c = interfaceC11732b0;
        }
    }

    public C13713k() {
        this(0);
    }

    /* renamed from: A */
    private boolean m1690A(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        boolean z;
        long j = this.f35320k - this.f35321l;
        long position = interfaceC11747j.getPosition() + j;
        C9208y c9208y = this.f35322m;
        if (c9208y != null) {
            interfaceC11747j.readFully(c9208y.m16094d(), this.f35321l, (int) j);
            if (this.f35319j == 1718909296) {
                this.f35332w = m1671w(c9208y);
            } else if (!this.f35315f.isEmpty()) {
                this.f35315f.peek().m1794e(new AbstractC13691a.C13693b(this.f35319j, c9208y));
            }
        } else if (j < 262144) {
            interfaceC11747j.mo6965k((int) j);
        } else {
            c11765x.f30668a = interfaceC11747j.getPosition() + j;
            z = true;
            m1673u(position);
            if (!z && this.f35318i != 2) {
                return true;
            }
            return false;
        }
        z = false;
        m1673u(position);
        if (!z) {
        }
        return false;
    }

    /* renamed from: B */
    private int m1689B(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        long position = interfaceC11747j.getPosition();
        if (this.f35323n == -1) {
            int m1678p = m1678p(position);
            this.f35323n = m1678p;
            if (m1678p == -1) {
                return -1;
            }
        }
        C13714a c13714a = ((C13714a[]) C9191p0.m16243j(this.f35328s))[this.f35323n];
        InterfaceC11732b0 interfaceC11732b0 = c13714a.f35336c;
        int i = c13714a.f35337d;
        C13723r c13723r = c13714a.f35335b;
        long j = c13723r.f35387c[i];
        int i2 = c13723r.f35388d[i];
        long j2 = (j - position) + this.f35324o;
        if (j2 >= 0 && j2 < 262144) {
            if (c13714a.f35334a.f35356g == 1) {
                j2 += 8;
                i2 -= 8;
            }
            interfaceC11747j.mo6965k((int) j2);
            C13720o c13720o = c13714a.f35334a;
            if (c13720o.f35359j != 0) {
                byte[] m16094d = this.f35312c.m16094d();
                m16094d[0] = 0;
                m16094d[1] = 0;
                m16094d[2] = 0;
                int i3 = c13714a.f35334a.f35359j;
                int i4 = 4 - i3;
                while (this.f35325p < i2) {
                    int i5 = this.f35326q;
                    if (i5 == 0) {
                        interfaceC11747j.readFully(m16094d, i4, i3);
                        this.f35324o += i3;
                        this.f35312c.m16099P(0);
                        int m16084n = this.f35312c.m16084n();
                        if (m16084n >= 0) {
                            this.f35326q = m16084n;
                            this.f35311b.m16099P(0);
                            interfaceC11732b0.mo6170a(this.f35311b, 4);
                            this.f35325p += 4;
                            i2 += i4;
                        } else {
                            throw new C7402m("Invalid NAL length");
                        }
                    } else {
                        int mo6167d = interfaceC11732b0.mo6167d(interfaceC11747j, i5, false);
                        this.f35324o += mo6167d;
                        this.f35325p += mo6167d;
                        this.f35326q -= mo6167d;
                    }
                }
            } else {
                if ("audio/ac4".equals(c13720o.f35355f.f11197u)) {
                    if (this.f35325p == 0) {
                        C9070c.m16769a(i2, this.f35313d);
                        interfaceC11732b0.mo6170a(this.f35313d, 7);
                        this.f35325p += 7;
                    }
                    i2 += 7;
                }
                while (true) {
                    int i6 = this.f35325p;
                    if (i6 >= i2) {
                        break;
                    }
                    int mo6167d2 = interfaceC11732b0.mo6167d(interfaceC11747j, i2 - i6, false);
                    this.f35324o += mo6167d2;
                    this.f35325p += mo6167d2;
                    this.f35326q -= mo6167d2;
                }
            }
            C13723r c13723r2 = c13714a.f35335b;
            interfaceC11732b0.mo6162f(c13723r2.f35390f[i], c13723r2.f35391g[i], i2, 0, null);
            c13714a.f35337d++;
            this.f35323n = -1;
            this.f35324o = 0;
            this.f35325p = 0;
            this.f35326q = 0;
            return 0;
        }
        c11765x.f30668a = j;
        return 1;
    }

    /* renamed from: C */
    private int m1688C(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        int m1655c = this.f35316g.m1655c(interfaceC11747j, c11765x, this.f35317h);
        if (m1655c == 1 && c11765x.f30668a == 0) {
            m1680n();
        }
        return m1655c;
    }

    /* renamed from: D */
    private static boolean m1687D(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* renamed from: E */
    private static boolean m1686E(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    @RequiresNonNull({"tracks"})
    /* renamed from: F */
    private void m1685F(long j) {
        C13714a[] c13714aArr;
        for (C13714a c13714a : this.f35328s) {
            C13723r c13723r = c13714a.f35335b;
            int m1637a = c13723r.m1637a(j);
            if (m1637a == -1) {
                m1637a = c13723r.m1636b(j);
            }
            c13714a.f35337d = m1637a;
        }
    }

    /* renamed from: l */
    private static int m1682l(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: m */
    private static long[][] m1681m(C13714a[] c13714aArr) {
        long[][] jArr = new long[c13714aArr.length];
        int[] iArr = new int[c13714aArr.length];
        long[] jArr2 = new long[c13714aArr.length];
        boolean[] zArr = new boolean[c13714aArr.length];
        for (int i = 0; i < c13714aArr.length; i++) {
            jArr[i] = new long[c13714aArr[i].f35335b.f35386b];
            jArr2[i] = c13714aArr[i].f35335b.f35390f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < c13714aArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < c13714aArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            C13723r c13723r = c13714aArr[i3].f35335b;
            j += c13723r.f35388d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = c13723r.f35390f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: n */
    private void m1680n() {
        this.f35318i = 0;
        this.f35321l = 0;
    }

    /* renamed from: o */
    private static int m1679o(C13723r c13723r, long j) {
        int m1637a = c13723r.m1637a(j);
        if (m1637a == -1) {
            return c13723r.m1636b(j);
        }
        return m1637a;
    }

    /* renamed from: p */
    private int m1678p(long j) {
        boolean z;
        int i = -1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        boolean z2 = true;
        long j3 = Long.MAX_VALUE;
        boolean z3 = true;
        long j4 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((C13714a[]) C9191p0.m16243j(this.f35328s)).length; i3++) {
            C13714a c13714a = this.f35328s[i3];
            int i4 = c13714a.f35337d;
            C13723r c13723r = c13714a.f35335b;
            if (i4 != c13723r.f35386b) {
                long j5 = c13723r.f35387c[i4];
                long j6 = ((long[][]) C9191p0.m16243j(this.f35329t))[i3][i4];
                long j7 = j5 - j;
                if (j7 >= 0 && j7 < 262144) {
                    z = false;
                } else {
                    z = true;
                }
                if ((!z && z3) || (z == z3 && j7 < j4)) {
                    z3 = z;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z2 = z;
                    i = i3;
                    j2 = j6;
                }
            }
        }
        if (j2 == Long.MAX_VALUE || !z2 || j3 < j2 + 10485760) {
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ C13720o m1677q(C13720o c13720o) {
        return c13720o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ InterfaceC11746i[] m1676r() {
        return new InterfaceC11746i[]{new C13713k()};
    }

    /* renamed from: s */
    private static long m1675s(C13723r c13723r, long j, long j2) {
        int m1679o = m1679o(c13723r, j);
        if (m1679o == -1) {
            return j2;
        }
        return Math.min(c13723r.f35387c[m1679o], j2);
    }

    /* renamed from: t */
    private void m1674t(InterfaceC11747j interfaceC11747j) {
        this.f35313d.m16103L(8);
        interfaceC11747j.mo6963n(this.f35313d.m16094d(), 0, 8);
        C13694b.m1785d(this.f35313d);
        interfaceC11747j.mo6965k(this.f35313d.m16093e());
        interfaceC11747j.mo6969e();
    }

    /* renamed from: u */
    private void m1673u(long j) {
        while (!this.f35315f.isEmpty() && this.f35315f.peek().f35217b == j) {
            AbstractC13691a.C13692a pop = this.f35315f.pop();
            if (pop.f35216a == 1836019574) {
                m1670x(pop);
                this.f35315f.clear();
                this.f35318i = 2;
            } else if (!this.f35315f.isEmpty()) {
                this.f35315f.peek().m1795d(pop);
            }
        }
        if (this.f35318i != 2) {
            m1680n();
        }
    }

    /* renamed from: v */
    private void m1672v() {
        Metadata metadata;
        if (this.f35332w == 2 && (this.f35310a & 2) != 0) {
            InterfaceC11748k interfaceC11748k = (InterfaceC11748k) C9149a.m16448e(this.f35327r);
            InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(0, 4);
            if (this.f35333x == null) {
                metadata = null;
            } else {
                metadata = new Metadata(this.f35333x);
            }
            mo3740e.mo6168c(new Format.C4362b().m29895X(metadata).m29914E());
            interfaceC11748k.mo3738s();
            interfaceC11748k.mo3739i(new InterfaceC11766y.C11768b(-9223372036854775807L));
        }
    }

    /* renamed from: w */
    private static int m1671w(C9208y c9208y) {
        c9208y.m16099P(8);
        int m1682l = m1682l(c9208y.m16084n());
        if (m1682l != 0) {
            return m1682l;
        }
        c9208y.m16098Q(4);
        while (c9208y.m16097a() > 0) {
            int m1682l2 = m1682l(c9208y.m16084n());
            if (m1682l2 != 0) {
                return m1682l2;
            }
        }
        return 0;
    }

    /* renamed from: x */
    private void m1670x(AbstractC13691a.C13692a c13692a) {
        boolean z;
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        boolean z2;
        ArrayList arrayList;
        List<C13723r> list;
        int i;
        Metadata metadata4;
        int i2;
        ArrayList arrayList2 = new ArrayList();
        if (this.f35332w == 1) {
            z = true;
        } else {
            z = false;
        }
        C11762u c11762u = new C11762u();
        AbstractC13691a.C13693b m1792g = c13692a.m1792g(1969517665);
        if (m1792g != null) {
            Pair<Metadata, Metadata> m1791A = C13694b.m1791A(m1792g);
            Metadata metadata5 = (Metadata) m1791A.first;
            Metadata metadata6 = (Metadata) m1791A.second;
            if (metadata5 != null) {
                c11762u.m6960c(metadata5);
            }
            metadata = metadata6;
            metadata2 = metadata5;
        } else {
            metadata = null;
            metadata2 = null;
        }
        AbstractC13691a.C13692a m1793f = c13692a.m1793f(1835365473);
        if (m1793f != null) {
            metadata3 = C13694b.m1776m(m1793f);
        } else {
            metadata3 = null;
        }
        if ((this.f35310a & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Metadata metadata7 = metadata3;
        List<C13723r> m1763z = C13694b.m1763z(c13692a, c11762u, -9223372036854775807L, null, z2, z, new InterfaceC6376f() { // from class: x6.j
            @Override // p102fb.InterfaceC6376f
            public final Object apply(Object obj) {
                C13720o m1677q;
                m1677q = C13713k.m1677q((C13720o) obj);
                return m1677q;
            }
        });
        InterfaceC11748k interfaceC11748k = (InterfaceC11748k) C9149a.m16448e(this.f35327r);
        int size = m1763z.size();
        int i3 = 0;
        int i4 = -1;
        long j = -9223372036854775807L;
        while (i3 < size) {
            C13723r c13723r = m1763z.get(i3);
            if (c13723r.f35386b == 0) {
                list = m1763z;
                i = size;
                arrayList = arrayList2;
            } else {
                C13720o c13720o = c13723r.f35385a;
                int i5 = i4;
                arrayList = arrayList2;
                long j2 = c13720o.f35354e;
                if (j2 == -9223372036854775807L) {
                    j2 = c13723r.f35392h;
                }
                long max = Math.max(j, j2);
                list = m1763z;
                i = size;
                C13714a c13714a = new C13714a(c13720o, c13723r, interfaceC11748k.mo3740e(i3, c13720o.f35351b));
                Format.C4362b m29926a = c13720o.f35355f.m29926a();
                m29926a.m29896W(c13723r.f35389e + 30);
                if (c13720o.f35351b == 2 && j2 > 0 && (i2 = c13723r.f35386b) > 1) {
                    m29926a.m29903P(i2 / (((float) j2) / 1000000.0f));
                }
                C13710h.m1692k(c13720o.f35351b, c11762u, m29926a);
                int i6 = c13720o.f35351b;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                if (this.f35317h.isEmpty()) {
                    metadata4 = null;
                } else {
                    metadata4 = new Metadata(this.f35317h);
                }
                metadataArr[1] = metadata4;
                C13710h.m1691l(i6, metadata2, metadata7, m29926a, metadataArr);
                c13714a.f35336c.mo6168c(m29926a.m29914E());
                int i7 = i5;
                if (c13720o.f35351b == 2 && i7 == -1) {
                    i7 = arrayList.size();
                }
                i4 = i7;
                arrayList.add(c13714a);
                j = max;
            }
            i3++;
            arrayList2 = arrayList;
            m1763z = list;
            size = i;
        }
        this.f35330u = i4;
        this.f35331v = j;
        C13714a[] c13714aArr = (C13714a[]) arrayList2.toArray(new C13714a[0]);
        this.f35328s = c13714aArr;
        this.f35329t = m1681m(c13714aArr);
        interfaceC11748k.mo3738s();
        interfaceC11748k.mo3739i(this);
    }

    /* renamed from: y */
    private void m1669y(long j) {
        if (this.f35319j == 1836086884) {
            int i = this.f35321l;
            this.f35333x = new C8856b(0L, j, -9223372036854775807L, j + i, this.f35320k - i);
        }
    }

    /* renamed from: z */
    private boolean m1668z(InterfaceC11747j interfaceC11747j) {
        AbstractC13691a.C13692a peek;
        boolean z;
        boolean z2;
        if (this.f35321l == 0) {
            if (!interfaceC11747j.mo6968g(this.f35314e.m16094d(), 0, 8, true)) {
                m1672v();
                return false;
            }
            this.f35321l = 8;
            this.f35314e.m16099P(0);
            this.f35320k = this.f35314e.m16109F();
            this.f35319j = this.f35314e.m16084n();
        }
        long j = this.f35320k;
        if (j == 1) {
            interfaceC11747j.readFully(this.f35314e.m16094d(), 8, 8);
            this.f35321l += 8;
            this.f35320k = this.f35314e.m16106I();
        } else if (j == 0) {
            long length = interfaceC11747j.getLength();
            if (length == -1 && (peek = this.f35315f.peek()) != null) {
                length = peek.f35217b;
            }
            if (length != -1) {
                this.f35320k = (length - interfaceC11747j.getPosition()) + this.f35321l;
            }
        }
        if (this.f35320k >= this.f35321l) {
            if (m1687D(this.f35319j)) {
                long position = interfaceC11747j.getPosition();
                long j2 = this.f35320k;
                int i = this.f35321l;
                long j3 = (position + j2) - i;
                if (j2 != i && this.f35319j == 1835365473) {
                    m1674t(interfaceC11747j);
                }
                this.f35315f.push(new AbstractC13691a.C13692a(this.f35319j, j3));
                if (this.f35320k == this.f35321l) {
                    m1673u(j3);
                } else {
                    m1680n();
                }
            } else if (m1686E(this.f35319j)) {
                if (this.f35321l == 8) {
                    z = true;
                } else {
                    z = false;
                }
                C9149a.m16447f(z);
                if (this.f35320k <= 2147483647L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C9149a.m16447f(z2);
                C9208y c9208y = new C9208y((int) this.f35320k);
                System.arraycopy(this.f35314e.m16094d(), 0, c9208y.m16094d(), 0, 8);
                this.f35322m = c9208y;
                this.f35318i = 1;
            } else {
                m1669y(interfaceC11747j.getPosition() - this.f35321l);
                this.f35322m = null;
                this.f35318i = 1;
            }
            return true;
        }
        throw new C7402m("Atom size less than header length (unsupported).");
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        this.f35315f.clear();
        this.f35321l = 0;
        this.f35323n = -1;
        this.f35324o = 0;
        this.f35325p = 0;
        this.f35326q = 0;
        if (j == 0) {
            if (this.f35318i != 3) {
                m1680n();
                return;
            }
            this.f35316g.m1651g();
            this.f35317h.clear();
        } else if (this.f35328s != null) {
            m1685F(j2);
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f35327r = interfaceC11748k;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        while (true) {
            int i = this.f35318i;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return m1688C(interfaceC11747j, c11765x);
                        }
                        throw new IllegalStateException();
                    }
                    return m1689B(interfaceC11747j, c11765x);
                } else if (m1690A(interfaceC11747j, c11765x)) {
                    return 1;
                }
            } else if (!m1668z(interfaceC11747j)) {
                return -1;
            }
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        return C13719n.m1647d(interfaceC11747j, (this.f35310a & 2) != 0);
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: f */
    public InterfaceC11766y.C11767a mo1210f(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int m1636b;
        if (((C13714a[]) C9149a.m16448e(this.f35328s)).length == 0) {
            return new InterfaceC11766y.C11767a(C11769z.f30673c);
        }
        int i = this.f35330u;
        if (i != -1) {
            C13723r c13723r = this.f35328s[i].f35335b;
            int m1679o = m1679o(c13723r, j);
            if (m1679o == -1) {
                return new InterfaceC11766y.C11767a(C11769z.f30673c);
            }
            long j6 = c13723r.f35390f[m1679o];
            j2 = c13723r.f35387c[m1679o];
            if (j6 < j && m1679o < c13723r.f35386b - 1 && (m1636b = c13723r.m1636b(j)) != -1 && m1636b != m1679o) {
                j4 = c13723r.f35390f[m1636b];
                j5 = c13723r.f35387c[m1636b];
            } else {
                j5 = -1;
                j4 = -9223372036854775807L;
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C13714a[] c13714aArr = this.f35328s;
            if (i2 >= c13714aArr.length) {
                break;
            }
            if (i2 != this.f35330u) {
                C13723r c13723r2 = c13714aArr[i2].f35335b;
                long m1675s = m1675s(c13723r2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m1675s(c13723r2, j4, j3);
                }
                j2 = m1675s;
            }
            i2++;
        }
        C11769z c11769z = new C11769z(j, j2);
        if (j4 == -9223372036854775807L) {
            return new InterfaceC11766y.C11767a(c11769z);
        }
        return new InterfaceC11766y.C11767a(c11769z, new C11769z(j4, j3));
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: h */
    public boolean mo1209h() {
        return true;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: i */
    public long mo1208i() {
        return this.f35331v;
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }

    public C13713k(int i) {
        this.f35310a = i;
        this.f35318i = (i & 4) != 0 ? 3 : 0;
        this.f35316g = new C13717m();
        this.f35317h = new ArrayList();
        this.f35314e = new C9208y(16);
        this.f35315f = new ArrayDeque<>();
        this.f35311b = new C9208y(C9204w.f24210a);
        this.f35312c = new C9208y(4);
        this.f35313d = new C9208y();
        this.f35323n = -1;
    }
}
