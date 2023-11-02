package p418x6;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.exoplayer2.Format;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p098f7.C6314a;
import p098f7.C6317c;
import p102fb.InterfaceC6376f;
import p151i6.C7402m;
import p193k6.C9070c;
import p195k8.C9149a;
import p195k8.C9183l0;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9204w;
import p195k8.C9208y;
import p259o6.C11028l;
import p296q6.C11734c;
import p296q6.C11736d;
import p296q6.C11752n;
import p296q6.C11762u;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;
import p418x6.AbstractC13691a;

/* renamed from: x6.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13707g implements InterfaceC11746i {

    /* renamed from: I */
    public static final InterfaceC11753o f35257I = new InterfaceC11753o() { // from class: x6.f
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m1730m;
            m1730m = C13707g.m1730m();
            return m1730m;
        }
    };

    /* renamed from: J */
    private static final byte[] f35258J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K */
    private static final Format f35259K = new Format.C4362b().m29883e0("application/x-emsg").m29914E();

    /* renamed from: A */
    private int f35260A;

    /* renamed from: B */
    private int f35261B;

    /* renamed from: C */
    private int f35262C;

    /* renamed from: D */
    private boolean f35263D;

    /* renamed from: E */
    private InterfaceC11748k f35264E;

    /* renamed from: F */
    private InterfaceC11732b0[] f35265F;

    /* renamed from: G */
    private InterfaceC11732b0[] f35266G;

    /* renamed from: H */
    private boolean f35267H;

    /* renamed from: a */
    private final int f35268a;

    /* renamed from: b */
    private final C13720o f35269b;

    /* renamed from: c */
    private final List<Format> f35270c;

    /* renamed from: d */
    private final SparseArray<C13709b> f35271d;

    /* renamed from: e */
    private final C9208y f35272e;

    /* renamed from: f */
    private final C9208y f35273f;

    /* renamed from: g */
    private final C9208y f35274g;

    /* renamed from: h */
    private final byte[] f35275h;

    /* renamed from: i */
    private final C9208y f35276i;

    /* renamed from: j */
    private final C9183l0 f35277j;

    /* renamed from: k */
    private final C6317c f35278k;

    /* renamed from: l */
    private final C9208y f35279l;

    /* renamed from: m */
    private final ArrayDeque<AbstractC13691a.C13692a> f35280m;

    /* renamed from: n */
    private final ArrayDeque<C13708a> f35281n;

    /* renamed from: o */
    private final InterfaceC11732b0 f35282o;

    /* renamed from: p */
    private int f35283p;

    /* renamed from: q */
    private int f35284q;

    /* renamed from: r */
    private long f35285r;

    /* renamed from: s */
    private int f35286s;

    /* renamed from: t */
    private C9208y f35287t;

    /* renamed from: u */
    private long f35288u;

    /* renamed from: v */
    private int f35289v;

    /* renamed from: w */
    private long f35290w;

    /* renamed from: x */
    private long f35291x;

    /* renamed from: y */
    private long f35292y;

    /* renamed from: z */
    private C13709b f35293z;

    /* renamed from: x6.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13708a {

        /* renamed from: a */
        public final long f35294a;

        /* renamed from: b */
        public final int f35295b;

        public C13708a(long j, int i) {
            this.f35294a = j;
            this.f35295b = i;
        }
    }

    /* renamed from: x6.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13709b {

        /* renamed from: a */
        public final InterfaceC11732b0 f35296a;

        /* renamed from: d */
        public C13723r f35299d;

        /* renamed from: e */
        public C13701c f35300e;

        /* renamed from: f */
        public int f35301f;

        /* renamed from: g */
        public int f35302g;

        /* renamed from: h */
        public int f35303h;

        /* renamed from: i */
        public int f35304i;

        /* renamed from: l */
        private boolean f35307l;

        /* renamed from: b */
        public final C13722q f35297b = new C13722q();

        /* renamed from: c */
        public final C9208y f35298c = new C9208y();

        /* renamed from: j */
        private final C9208y f35305j = new C9208y(1);

        /* renamed from: k */
        private final C9208y f35306k = new C9208y();

        public C13709b(InterfaceC11732b0 interfaceC11732b0, C13723r c13723r, C13701c c13701c) {
            this.f35296a = interfaceC11732b0;
            this.f35299d = c13723r;
            this.f35300e = c13701c;
            m1707j(c13723r, c13701c);
        }

        /* renamed from: c */
        public int m1714c() {
            int i;
            if (!this.f35307l) {
                i = this.f35299d.f35391g[this.f35301f];
            } else if (this.f35297b.f35377l[this.f35301f]) {
                i = 1;
            } else {
                i = 0;
            }
            if (m1710g() != null) {
                return i | 1073741824;
            }
            return i;
        }

        /* renamed from: d */
        public long m1713d() {
            if (!this.f35307l) {
                return this.f35299d.f35387c[this.f35301f];
            }
            return this.f35297b.f35372g[this.f35303h];
        }

        /* renamed from: e */
        public long m1712e() {
            if (!this.f35307l) {
                return this.f35299d.f35390f[this.f35301f];
            }
            return this.f35297b.m1642c(this.f35301f);
        }

        /* renamed from: f */
        public int m1711f() {
            if (!this.f35307l) {
                return this.f35299d.f35388d[this.f35301f];
            }
            return this.f35297b.f35374i[this.f35301f];
        }

        /* renamed from: g */
        public C13721p m1710g() {
            if (!this.f35307l) {
                return null;
            }
            int i = ((C13701c) C9191p0.m16243j(this.f35297b.f35366a)).f35246a;
            C13721p c13721p = this.f35297b.f35380o;
            if (c13721p == null) {
                c13721p = this.f35299d.f35385a.m1646a(i);
            }
            if (c13721p == null || !c13721p.f35361a) {
                return null;
            }
            return c13721p;
        }

        /* renamed from: h */
        public boolean m1709h() {
            this.f35301f++;
            if (!this.f35307l) {
                return false;
            }
            int i = this.f35302g + 1;
            this.f35302g = i;
            int[] iArr = this.f35297b.f35373h;
            int i2 = this.f35303h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f35303h = i2 + 1;
            this.f35302g = 0;
            return false;
        }

        /* renamed from: i */
        public int m1708i(int i, int i2) {
            C9208y c9208y;
            boolean z;
            int i3;
            C13721p m1710g = m1710g();
            if (m1710g == null) {
                return 0;
            }
            int i4 = m1710g.f35364d;
            if (i4 != 0) {
                c9208y = this.f35297b.f35381p;
            } else {
                byte[] bArr = (byte[]) C9191p0.m16243j(m1710g.f35365e);
                this.f35306k.m16101N(bArr, bArr.length);
                C9208y c9208y2 = this.f35306k;
                i4 = bArr.length;
                c9208y = c9208y2;
            }
            boolean m1638g = this.f35297b.m1638g(this.f35301f);
            if (!m1638g && i2 == 0) {
                z = false;
            } else {
                z = true;
            }
            byte[] m16094d = this.f35305j.m16094d();
            if (z) {
                i3 = 128;
            } else {
                i3 = 0;
            }
            m16094d[0] = (byte) (i3 | i4);
            this.f35305j.m16099P(0);
            this.f35296a.mo6169b(this.f35305j, 1, 1);
            this.f35296a.mo6169b(c9208y, i4, 1);
            if (!z) {
                return i4 + 1;
            }
            if (!m1638g) {
                this.f35298c.m16103L(8);
                byte[] m16094d2 = this.f35298c.m16094d();
                m16094d2[0] = 0;
                m16094d2[1] = 1;
                m16094d2[2] = (byte) ((i2 >> 8) & 255);
                m16094d2[3] = (byte) (i2 & 255);
                m16094d2[4] = (byte) ((i >> 24) & 255);
                m16094d2[5] = (byte) ((i >> 16) & 255);
                m16094d2[6] = (byte) ((i >> 8) & 255);
                m16094d2[7] = (byte) (i & 255);
                this.f35296a.mo6169b(this.f35298c, 8, 1);
                return i4 + 1 + 8;
            }
            C9208y c9208y3 = this.f35297b.f35381p;
            int m16105J = c9208y3.m16105J();
            c9208y3.m16098Q(-2);
            int i5 = (m16105J * 6) + 2;
            if (i2 != 0) {
                this.f35298c.m16103L(i5);
                byte[] m16094d3 = this.f35298c.m16094d();
                c9208y3.m16088j(m16094d3, 0, i5);
                int i6 = (((m16094d3[2] & 255) << 8) | (m16094d3[3] & 255)) + i2;
                m16094d3[2] = (byte) ((i6 >> 8) & 255);
                m16094d3[3] = (byte) (i6 & 255);
                c9208y3 = this.f35298c;
            }
            this.f35296a.mo6169b(c9208y3, i5, 1);
            return i4 + 1 + i5;
        }

        /* renamed from: j */
        public void m1707j(C13723r c13723r, C13701c c13701c) {
            this.f35299d = c13723r;
            this.f35300e = c13701c;
            this.f35296a.mo6168c(c13723r.f35385a.f35355f);
            m1706k();
        }

        /* renamed from: k */
        public void m1706k() {
            this.f35297b.m1639f();
            this.f35301f = 0;
            this.f35303h = 0;
            this.f35302g = 0;
            this.f35304i = 0;
            this.f35307l = false;
        }

        /* renamed from: l */
        public void m1705l(long j) {
            int i = this.f35301f;
            while (true) {
                C13722q c13722q = this.f35297b;
                if (i < c13722q.f35371f && c13722q.m1642c(i) < j) {
                    if (this.f35297b.f35377l[i]) {
                        this.f35304i = i;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: m */
        public void m1704m() {
            C13721p m1710g = m1710g();
            if (m1710g == null) {
                return;
            }
            C9208y c9208y = this.f35297b.f35381p;
            int i = m1710g.f35364d;
            if (i != 0) {
                c9208y.m16098Q(i);
            }
            if (this.f35297b.m1638g(this.f35301f)) {
                c9208y.m16098Q(c9208y.m16105J() * 6);
            }
        }

        /* renamed from: n */
        public void m1703n(C11028l c11028l) {
            String str;
            C13721p m1646a = this.f35299d.f35385a.m1646a(((C13701c) C9191p0.m16243j(this.f35297b.f35366a)).f35246a);
            if (m1646a != null) {
                str = m1646a.f35362b;
            } else {
                str = null;
            }
            this.f35296a.mo6168c(this.f35299d.f35385a.f35355f.m29926a().m29907L(c11028l.m9318u(str)).m29914E());
        }
    }

    public C13707g() {
        this(0);
    }

    /* renamed from: A */
    private static void m1754A(C9208y c9208y, C13722q c13722q) {
        m1717z(c9208y, 0, c13722q);
    }

    /* renamed from: B */
    private static Pair<Long, C11736d> m1753B(C9208y c9208y, long j) {
        long m16106I;
        long m16106I2;
        int[] iArr;
        c9208y.m16099P(8);
        int m1796c = AbstractC13691a.m1796c(c9208y.m16084n());
        c9208y.m16098Q(4);
        long m16109F = c9208y.m16109F();
        if (m1796c == 0) {
            m16106I = c9208y.m16109F();
            m16106I2 = c9208y.m16109F();
        } else {
            m16106I = c9208y.m16106I();
            m16106I2 = c9208y.m16106I();
        }
        long j2 = m16106I;
        long j3 = j + m16106I2;
        long m16296I0 = C9191p0.m16296I0(j2, 1000000L, m16109F);
        c9208y.m16098Q(2);
        int m16105J = c9208y.m16105J();
        int[] iArr2 = new int[m16105J];
        long[] jArr = new long[m16105J];
        long[] jArr2 = new long[m16105J];
        long[] jArr3 = new long[m16105J];
        long j4 = m16296I0;
        int i = 0;
        long j5 = j2;
        while (i < m16105J) {
            int m16084n = c9208y.m16084n();
            if ((m16084n & Integer.MIN_VALUE) == 0) {
                long m16109F2 = c9208y.m16109F();
                iArr2[i] = m16084n & ViewDefaults.NUMBER_OF_LINES;
                jArr[i] = j3;
                jArr3[i] = j4;
                long j6 = j5 + m16109F2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i2 = m16105J;
                long m16296I02 = C9191p0.m16296I0(j6, 1000000L, m16109F);
                jArr4[i] = m16296I02 - jArr5[i];
                c9208y.m16098Q(4);
                j3 += iArr[i];
                i++;
                iArr2 = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                m16105J = i2;
                j5 = j6;
                j4 = m16296I02;
            } else {
                throw new C7402m("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(m16296I0), new C11736d(iArr2, jArr, jArr2, jArr3));
    }

    /* renamed from: C */
    private static long m1752C(C9208y c9208y) {
        c9208y.m16099P(8);
        if (AbstractC13691a.m1796c(c9208y.m16084n()) == 1) {
            return c9208y.m16106I();
        }
        return c9208y.m16109F();
    }

    /* renamed from: D */
    private static C13709b m1751D(C9208y c9208y, SparseArray<C13709b> sparseArray) {
        int i;
        int i2;
        int i3;
        int i4;
        c9208y.m16099P(8);
        int m1797b = AbstractC13691a.m1797b(c9208y.m16084n());
        C13709b m1732k = m1732k(sparseArray, c9208y.m16084n());
        if (m1732k == null) {
            return null;
        }
        if ((m1797b & 1) != 0) {
            long m16106I = c9208y.m16106I();
            C13722q c13722q = m1732k.f35297b;
            c13722q.f35368c = m16106I;
            c13722q.f35369d = m16106I;
        }
        C13701c c13701c = m1732k.f35300e;
        if ((m1797b & 2) != 0) {
            i = c9208y.m16084n() - 1;
        } else {
            i = c13701c.f35246a;
        }
        if ((m1797b & 8) != 0) {
            i2 = c9208y.m16084n();
        } else {
            i2 = c13701c.f35247b;
        }
        if ((m1797b & 16) != 0) {
            i3 = c9208y.m16084n();
        } else {
            i3 = c13701c.f35248c;
        }
        if ((m1797b & 32) != 0) {
            i4 = c9208y.m16084n();
        } else {
            i4 = c13701c.f35249d;
        }
        m1732k.f35297b.f35366a = new C13701c(i, i2, i3, i4);
        return m1732k;
    }

    /* renamed from: E */
    private static void m1750E(AbstractC13691a.C13692a c13692a, SparseArray<C13709b> sparseArray, int i, byte[] bArr) {
        String str;
        C13709b m1751D = m1751D(((AbstractC13691a.C13693b) C9149a.m16448e(c13692a.m1792g(1952868452))).f35220b, sparseArray);
        if (m1751D == null) {
            return;
        }
        C13722q c13722q = m1751D.f35297b;
        long j = c13722q.f35383r;
        boolean z = c13722q.f35384s;
        m1751D.m1706k();
        m1751D.f35307l = true;
        AbstractC13691a.C13693b m1792g = c13692a.m1792g(1952867444);
        if (m1792g != null && (i & 2) == 0) {
            c13722q.f35383r = m1752C(m1792g.f35220b);
            c13722q.f35384s = true;
        } else {
            c13722q.f35383r = j;
            c13722q.f35384s = z;
        }
        m1747H(c13692a, m1751D, i);
        C13721p m1646a = m1751D.f35299d.f35385a.m1646a(((C13701c) C9149a.m16448e(c13722q.f35366a)).f35246a);
        AbstractC13691a.C13693b m1792g2 = c13692a.m1792g(1935763834);
        if (m1792g2 != null) {
            m1719x((C13721p) C9149a.m16448e(m1646a), m1792g2.f35220b, c13722q);
        }
        AbstractC13691a.C13693b m1792g3 = c13692a.m1792g(1935763823);
        if (m1792g3 != null) {
            m1720w(m1792g3.f35220b, c13722q);
        }
        AbstractC13691a.C13693b m1792g4 = c13692a.m1792g(1936027235);
        if (m1792g4 != null) {
            m1754A(m1792g4.f35220b, c13722q);
        }
        if (m1646a != null) {
            str = m1646a.f35362b;
        } else {
            str = null;
        }
        m1718y(c13692a, str, c13722q);
        int size = c13692a.f35218c.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC13691a.C13693b c13693b = c13692a.f35218c.get(i2);
            if (c13693b.f35216a == 1970628964) {
                m1746I(c13693b.f35220b, c13722q, bArr);
            }
        }
    }

    /* renamed from: F */
    private static Pair<Integer, C13701c> m1749F(C9208y c9208y) {
        c9208y.m16099P(12);
        return Pair.create(Integer.valueOf(c9208y.m16084n()), new C13701c(c9208y.m16084n() - 1, c9208y.m16084n(), c9208y.m16084n(), c9208y.m16084n()));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00bd  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m1748G(p418x6.C13707g.C13709b r36, int r37, int r38, p195k8.C9208y r39, int r40) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p418x6.C13707g.m1748G(x6.g$b, int, int, k8.y, int):int");
    }

    /* renamed from: H */
    private static void m1747H(AbstractC13691a.C13692a c13692a, C13709b c13709b, int i) {
        List<AbstractC13691a.C13693b> list = c13692a.f35218c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC13691a.C13693b c13693b = list.get(i4);
            if (c13693b.f35216a == 1953658222) {
                C9208y c9208y = c13693b.f35220b;
                c9208y.m16099P(12);
                int m16107H = c9208y.m16107H();
                if (m16107H > 0) {
                    i3 += m16107H;
                    i2++;
                }
            }
        }
        c13709b.f35303h = 0;
        c13709b.f35302g = 0;
        c13709b.f35301f = 0;
        c13709b.f35297b.m1640e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC13691a.C13693b c13693b2 = list.get(i7);
            if (c13693b2.f35216a == 1953658222) {
                i6 = m1748G(c13709b, i5, i, c13693b2.f35220b, i6);
                i5++;
            }
        }
    }

    /* renamed from: I */
    private static void m1746I(C9208y c9208y, C13722q c13722q, byte[] bArr) {
        c9208y.m16099P(8);
        c9208y.m16088j(bArr, 0, 16);
        if (!Arrays.equals(bArr, f35258J)) {
            return;
        }
        m1717z(c9208y, 16, c13722q);
    }

    /* renamed from: J */
    private void m1745J(long j) {
        while (!this.f35280m.isEmpty() && this.f35280m.peek().f35217b == j) {
            m1728o(this.f35280m.pop());
        }
        m1736g();
    }

    /* renamed from: K */
    private boolean m1744K(InterfaceC11747j interfaceC11747j) {
        if (this.f35286s == 0) {
            if (!interfaceC11747j.mo6968g(this.f35279l.m16094d(), 0, 8, true)) {
                return false;
            }
            this.f35286s = 8;
            this.f35279l.m16099P(0);
            this.f35285r = this.f35279l.m16109F();
            this.f35284q = this.f35279l.m16084n();
        }
        long j = this.f35285r;
        if (j == 1) {
            interfaceC11747j.readFully(this.f35279l.m16094d(), 8, 8);
            this.f35286s += 8;
            this.f35285r = this.f35279l.m16106I();
        } else if (j == 0) {
            long length = interfaceC11747j.getLength();
            if (length == -1 && !this.f35280m.isEmpty()) {
                length = this.f35280m.peek().f35217b;
            }
            if (length != -1) {
                this.f35285r = (length - interfaceC11747j.getPosition()) + this.f35286s;
            }
        }
        if (this.f35285r >= this.f35286s) {
            long position = interfaceC11747j.getPosition() - this.f35286s;
            int i = this.f35284q;
            if ((i == 1836019558 || i == 1835295092) && !this.f35267H) {
                this.f35264E.mo3739i(new InterfaceC11766y.C11768b(this.f35291x, position));
                this.f35267H = true;
            }
            if (this.f35284q == 1836019558) {
                int size = this.f35271d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C13722q c13722q = this.f35271d.valueAt(i2).f35297b;
                    c13722q.f35367b = position;
                    c13722q.f35369d = position;
                    c13722q.f35368c = position;
                }
            }
            int i3 = this.f35284q;
            if (i3 == 1835295092) {
                this.f35293z = null;
                this.f35288u = position + this.f35285r;
                this.f35283p = 2;
                return true;
            }
            if (m1740O(i3)) {
                long position2 = (interfaceC11747j.getPosition() + this.f35285r) - 8;
                this.f35280m.push(new AbstractC13691a.C13692a(this.f35284q, position2));
                if (this.f35285r == this.f35286s) {
                    m1745J(position2);
                } else {
                    m1736g();
                }
            } else if (m1739P(this.f35284q)) {
                if (this.f35286s == 8) {
                    long j2 = this.f35285r;
                    if (j2 <= 2147483647L) {
                        C9208y c9208y = new C9208y((int) j2);
                        System.arraycopy(this.f35279l.m16094d(), 0, c9208y.m16094d(), 0, 8);
                        this.f35287t = c9208y;
                        this.f35283p = 1;
                    } else {
                        throw new C7402m("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new C7402m("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f35285r <= 2147483647L) {
                this.f35287t = null;
                this.f35283p = 1;
            } else {
                throw new C7402m("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw new C7402m("Atom size less than header length (unsupported).");
    }

    /* renamed from: L */
    private void m1743L(InterfaceC11747j interfaceC11747j) {
        int i = ((int) this.f35285r) - this.f35286s;
        C9208y c9208y = this.f35287t;
        if (c9208y != null) {
            interfaceC11747j.readFully(c9208y.m16094d(), 8, i);
            m1726q(new AbstractC13691a.C13693b(this.f35284q, c9208y), interfaceC11747j.getPosition());
        } else {
            interfaceC11747j.mo6965k(i);
        }
        m1745J(interfaceC11747j.getPosition());
    }

    /* renamed from: M */
    private void m1742M(InterfaceC11747j interfaceC11747j) {
        int size = this.f35271d.size();
        C13709b c13709b = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C13722q c13722q = this.f35271d.valueAt(i).f35297b;
            if (c13722q.f35382q) {
                long j2 = c13722q.f35369d;
                if (j2 < j) {
                    c13709b = this.f35271d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (c13709b == null) {
            this.f35283p = 3;
            return;
        }
        int position = (int) (j - interfaceC11747j.getPosition());
        if (position >= 0) {
            interfaceC11747j.mo6965k(position);
            c13709b.f35297b.m1643b(interfaceC11747j);
            return;
        }
        throw new C7402m("Offset to encryption data was negative.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private boolean m1741N(InterfaceC11747j interfaceC11747j) {
        InterfaceC11732b0.C11733a c11733a;
        boolean z;
        int mo6167d;
        C13709b c13709b = this.f35293z;
        if (c13709b == null) {
            c13709b = m1733j(this.f35271d);
            if (c13709b == null) {
                int position = (int) (this.f35288u - interfaceC11747j.getPosition());
                if (position >= 0) {
                    interfaceC11747j.mo6965k(position);
                    m1736g();
                    return false;
                }
                throw new C7402m("Offset to end of mdat was negative.");
            }
            int m1713d = (int) (c13709b.m1713d() - interfaceC11747j.getPosition());
            if (m1713d < 0) {
                C9197r.m16178h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                m1713d = 0;
            }
            interfaceC11747j.mo6965k(m1713d);
            this.f35293z = c13709b;
        }
        int i = 4;
        int i2 = 1;
        if (this.f35283p == 3) {
            int m1711f = c13709b.m1711f();
            this.f35260A = m1711f;
            if (c13709b.f35301f < c13709b.f35304i) {
                interfaceC11747j.mo6965k(m1711f);
                c13709b.m1704m();
                if (!c13709b.m1709h()) {
                    this.f35293z = null;
                }
                this.f35283p = 3;
                return true;
            }
            if (c13709b.f35299d.f35385a.f35356g == 1) {
                this.f35260A = m1711f - 8;
                interfaceC11747j.mo6965k(8);
            }
            if ("audio/ac4".equals(c13709b.f35299d.f35385a.f35355f.f11197u)) {
                this.f35261B = c13709b.m1708i(this.f35260A, 7);
                C9070c.m16769a(this.f35260A, this.f35276i);
                c13709b.f35296a.mo6170a(this.f35276i, 7);
                this.f35261B += 7;
            } else {
                this.f35261B = c13709b.m1708i(this.f35260A, 0);
            }
            this.f35260A += this.f35261B;
            this.f35283p = 4;
            this.f35262C = 0;
        }
        C13720o c13720o = c13709b.f35299d.f35385a;
        InterfaceC11732b0 interfaceC11732b0 = c13709b.f35296a;
        long m1712e = c13709b.m1712e();
        C9183l0 c9183l0 = this.f35277j;
        if (c9183l0 != null) {
            m1712e = c9183l0.m16346a(m1712e);
        }
        long j = m1712e;
        if (c13720o.f35359j == 0) {
            while (true) {
                int i3 = this.f35261B;
                int i4 = this.f35260A;
                if (i3 >= i4) {
                    break;
                }
                this.f35261B += interfaceC11732b0.mo6167d(interfaceC11747j, i4 - i3, false);
            }
        } else {
            byte[] m16094d = this.f35273f.m16094d();
            m16094d[0] = 0;
            m16094d[1] = 0;
            m16094d[2] = 0;
            int i5 = c13720o.f35359j;
            int i6 = i5 + 1;
            int i7 = 4 - i5;
            while (this.f35261B < this.f35260A) {
                int i8 = this.f35262C;
                if (i8 == 0) {
                    interfaceC11747j.readFully(m16094d, i7, i6);
                    this.f35273f.m16099P(0);
                    int m16084n = this.f35273f.m16084n();
                    if (m16084n >= i2) {
                        this.f35262C = m16084n - 1;
                        this.f35272e.m16099P(0);
                        interfaceC11732b0.mo6170a(this.f35272e, i);
                        interfaceC11732b0.mo6170a(this.f35273f, i2);
                        if (this.f35266G.length > 0 && C9204w.m16138g(c13720o.f35355f.f11197u, m16094d[i])) {
                            z = i2;
                        } else {
                            z = 0;
                        }
                        this.f35263D = z;
                        this.f35261B += 5;
                        this.f35260A += i7;
                    } else {
                        throw new C7402m("Invalid NAL length");
                    }
                } else {
                    if (this.f35263D) {
                        this.f35274g.m16103L(i8);
                        interfaceC11747j.readFully(this.f35274g.m16094d(), 0, this.f35262C);
                        interfaceC11732b0.mo6170a(this.f35274g, this.f35262C);
                        mo6167d = this.f35262C;
                        int m16134k = C9204w.m16134k(this.f35274g.m16094d(), this.f35274g.m16092f());
                        this.f35274g.m16099P("video/hevc".equals(c13720o.f35355f.f11197u) ? 1 : 0);
                        this.f35274g.m16100O(m16134k);
                        C11734c.m7039a(j, this.f35274g, this.f35266G);
                    } else {
                        mo6167d = interfaceC11732b0.mo6167d(interfaceC11747j, i8, false);
                    }
                    this.f35261B += mo6167d;
                    this.f35262C -= mo6167d;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int m1714c = c13709b.m1714c();
        C13721p m1710g = c13709b.m1710g();
        if (m1710g != null) {
            c11733a = m1710g.f35363c;
        } else {
            c11733a = null;
        }
        interfaceC11732b0.mo6162f(j, m1714c, this.f35260A, 0, c11733a);
        m1723t(j);
        if (!c13709b.m1709h()) {
            this.f35293z = null;
        }
        this.f35283p = 3;
        return true;
    }

    /* renamed from: O */
    private static boolean m1740O(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* renamed from: P */
    private static boolean m1739P(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    /* renamed from: f */
    private static int m1737f(int i) {
        if (i >= 0) {
            return i;
        }
        throw new C7402m("Unexpected negative value: " + i);
    }

    /* renamed from: g */
    private void m1736g() {
        this.f35283p = 0;
        this.f35286s = 0;
    }

    /* renamed from: h */
    private C13701c m1735h(SparseArray<C13701c> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C13701c) C9149a.m16448e(sparseArray.get(i));
    }

    /* renamed from: i */
    private static C11028l m1734i(List<AbstractC13691a.C13693b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractC13691a.C13693b c13693b = list.get(i);
            if (c13693b.f35216a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] m16094d = c13693b.f35220b.m16094d();
                UUID m1662f = C13715l.m1662f(m16094d);
                if (m1662f == null) {
                    C9197r.m16178h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C11028l.C11030b(m1662f, "video/mp4", m16094d));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C11028l(arrayList);
    }

    /* renamed from: j */
    private static C13709b m1733j(SparseArray<C13709b> sparseArray) {
        int size = sparseArray.size();
        C13709b c13709b = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C13709b valueAt = sparseArray.valueAt(i);
            if ((valueAt.f35307l || valueAt.f35301f != valueAt.f35299d.f35386b) && (!valueAt.f35307l || valueAt.f35303h != valueAt.f35297b.f35370e)) {
                long m1713d = valueAt.m1713d();
                if (m1713d < j) {
                    c13709b = valueAt;
                    j = m1713d;
                }
            }
        }
        return c13709b;
    }

    /* renamed from: k */
    private static C13709b m1732k(SparseArray<C13709b> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i);
    }

    /* renamed from: l */
    private void m1731l() {
        int i;
        InterfaceC11732b0[] interfaceC11732b0Arr = new InterfaceC11732b0[2];
        this.f35265F = interfaceC11732b0Arr;
        InterfaceC11732b0 interfaceC11732b0 = this.f35282o;
        int i2 = 0;
        if (interfaceC11732b0 != null) {
            interfaceC11732b0Arr[0] = interfaceC11732b0;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f35268a & 4) != 0) {
            interfaceC11732b0Arr[i] = this.f35264E.mo3740e(100, 5);
            i3 = 101;
            i++;
        }
        InterfaceC11732b0[] interfaceC11732b0Arr2 = (InterfaceC11732b0[]) C9191p0.m16310B0(this.f35265F, i);
        this.f35265F = interfaceC11732b0Arr2;
        for (InterfaceC11732b0 interfaceC11732b02 : interfaceC11732b0Arr2) {
            interfaceC11732b02.mo6168c(f35259K);
        }
        this.f35266G = new InterfaceC11732b0[this.f35270c.size()];
        while (i2 < this.f35266G.length) {
            InterfaceC11732b0 mo3740e = this.f35264E.mo3740e(i3, 3);
            mo3740e.mo6168c(this.f35270c.get(i2));
            this.f35266G[i2] = mo3740e;
            i2++;
            i3++;
        }
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC11746i[] m1730m() {
        return new InterfaceC11746i[]{new C13707g()};
    }

    /* renamed from: o */
    private void m1728o(AbstractC13691a.C13692a c13692a) {
        int i = c13692a.f35216a;
        if (i == 1836019574) {
            m1724s(c13692a);
        } else if (i == 1836019558) {
            m1725r(c13692a);
        } else if (!this.f35280m.isEmpty()) {
            this.f35280m.peek().m1795d(c13692a);
        }
    }

    /* renamed from: p */
    private void m1727p(C9208y c9208y) {
        long m16296I0;
        long j;
        String str;
        long m16296I02;
        String str2;
        long m16109F;
        long j2;
        InterfaceC11732b0[] interfaceC11732b0Arr;
        if (this.f35265F.length == 0) {
            return;
        }
        c9208y.m16099P(8);
        int m1796c = AbstractC13691a.m1796c(c9208y.m16084n());
        if (m1796c != 0) {
            if (m1796c != 1) {
                C9197r.m16178h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + m1796c);
                return;
            }
            long m16109F2 = c9208y.m16109F();
            j2 = C9191p0.m16296I0(c9208y.m16106I(), 1000000L, m16109F2);
            long m16296I03 = C9191p0.m16296I0(c9208y.m16109F(), 1000L, m16109F2);
            long m16109F3 = c9208y.m16109F();
            str = (String) C9149a.m16448e(c9208y.m16074x());
            m16296I02 = m16296I03;
            m16109F = m16109F3;
            str2 = (String) C9149a.m16448e(c9208y.m16074x());
            m16296I0 = -9223372036854775807L;
        } else {
            String str3 = (String) C9149a.m16448e(c9208y.m16074x());
            String str4 = (String) C9149a.m16448e(c9208y.m16074x());
            long m16109F4 = c9208y.m16109F();
            m16296I0 = C9191p0.m16296I0(c9208y.m16109F(), 1000000L, m16109F4);
            long j3 = this.f35292y;
            if (j3 != -9223372036854775807L) {
                j = j3 + m16296I0;
            } else {
                j = -9223372036854775807L;
            }
            str = str3;
            m16296I02 = C9191p0.m16296I0(c9208y.m16109F(), 1000L, m16109F4);
            str2 = str4;
            m16109F = c9208y.m16109F();
            j2 = j;
        }
        byte[] bArr = new byte[c9208y.m16097a()];
        c9208y.m16088j(bArr, 0, c9208y.m16097a());
        C9208y c9208y2 = new C9208y(this.f35278k.m22994a(new C6314a(str, str2, m16296I02, m16109F, bArr)));
        int m16097a = c9208y2.m16097a();
        for (InterfaceC11732b0 interfaceC11732b0 : this.f35265F) {
            c9208y2.m16099P(0);
            interfaceC11732b0.mo6170a(c9208y2, m16097a);
        }
        if (j2 == -9223372036854775807L) {
            this.f35281n.addLast(new C13708a(m16296I0, m16097a));
            this.f35289v += m16097a;
            return;
        }
        C9183l0 c9183l0 = this.f35277j;
        if (c9183l0 != null) {
            j2 = c9183l0.m16346a(j2);
        }
        for (InterfaceC11732b0 interfaceC11732b02 : this.f35265F) {
            interfaceC11732b02.mo6162f(j2, 1, m16097a, 0, null);
        }
    }

    /* renamed from: q */
    private void m1726q(AbstractC13691a.C13693b c13693b, long j) {
        if (!this.f35280m.isEmpty()) {
            this.f35280m.peek().m1794e(c13693b);
            return;
        }
        int i = c13693b.f35216a;
        if (i == 1936286840) {
            Pair<Long, C11736d> m1753B = m1753B(c13693b.f35220b, j);
            this.f35292y = ((Long) m1753B.first).longValue();
            this.f35264E.mo3739i((InterfaceC11766y) m1753B.second);
            this.f35267H = true;
        } else if (i == 1701671783) {
            m1727p(c13693b.f35220b);
        }
    }

    /* renamed from: r */
    private void m1725r(AbstractC13691a.C13692a c13692a) {
        m1721v(c13692a, this.f35271d, this.f35268a, this.f35275h);
        C11028l m1734i = m1734i(c13692a.f35218c);
        if (m1734i != null) {
            int size = this.f35271d.size();
            for (int i = 0; i < size; i++) {
                this.f35271d.valueAt(i).m1703n(m1734i);
            }
        }
        if (this.f35290w != -9223372036854775807L) {
            int size2 = this.f35271d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f35271d.valueAt(i2).m1705l(this.f35290w);
            }
            this.f35290w = -9223372036854775807L;
        }
    }

    /* renamed from: s */
    private void m1724s(AbstractC13691a.C13692a c13692a) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i = 0;
        if (this.f35269b == null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16446g(z, "Unexpected moov box.");
        C11028l m1734i = m1734i(c13692a.f35218c);
        AbstractC13691a.C13692a c13692a2 = (AbstractC13691a.C13692a) C9149a.m16448e(c13692a.m1793f(1836475768));
        SparseArray<C13701c> sparseArray = new SparseArray<>();
        int size = c13692a2.f35218c.size();
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC13691a.C13693b c13693b = c13692a2.f35218c.get(i2);
            int i3 = c13693b.f35216a;
            if (i3 == 1953654136) {
                Pair<Integer, C13701c> m1749F = m1749F(c13693b.f35220b);
                sparseArray.put(((Integer) m1749F.first).intValue(), (C13701c) m1749F.second);
            } else if (i3 == 1835362404) {
                j = m1722u(c13693b.f35220b);
            }
        }
        C11762u c11762u = new C11762u();
        if ((this.f35268a & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<C13723r> m1763z = C13694b.m1763z(c13692a, c11762u, j, m1734i, z2, false, new InterfaceC6376f() { // from class: x6.e
            @Override // p102fb.InterfaceC6376f
            public final Object apply(Object obj) {
                return C13707g.this.m1729n((C13720o) obj);
            }
        });
        int size2 = m1763z.size();
        if (this.f35271d.size() == 0) {
            while (i < size2) {
                C13723r c13723r = m1763z.get(i);
                C13720o c13720o = c13723r.f35385a;
                this.f35271d.put(c13720o.f35350a, new C13709b(this.f35264E.mo3740e(i, c13720o.f35351b), c13723r, m1735h(sparseArray, c13720o.f35350a)));
                this.f35291x = Math.max(this.f35291x, c13720o.f35354e);
                i++;
            }
            this.f35264E.mo3738s();
            return;
        }
        if (this.f35271d.size() != size2) {
            z3 = false;
        }
        C9149a.m16447f(z3);
        while (i < size2) {
            C13723r c13723r2 = m1763z.get(i);
            C13720o c13720o2 = c13723r2.f35385a;
            this.f35271d.get(c13720o2.f35350a).m1707j(c13723r2, m1735h(sparseArray, c13720o2.f35350a));
            i++;
        }
    }

    /* renamed from: t */
    private void m1723t(long j) {
        while (!this.f35281n.isEmpty()) {
            C13708a removeFirst = this.f35281n.removeFirst();
            this.f35289v -= removeFirst.f35295b;
            long j2 = removeFirst.f35294a + j;
            C9183l0 c9183l0 = this.f35277j;
            if (c9183l0 != null) {
                j2 = c9183l0.m16346a(j2);
            }
            for (InterfaceC11732b0 interfaceC11732b0 : this.f35265F) {
                interfaceC11732b0.mo6162f(j2, 1, removeFirst.f35295b, this.f35289v, null);
            }
        }
    }

    /* renamed from: u */
    private static long m1722u(C9208y c9208y) {
        c9208y.m16099P(8);
        if (AbstractC13691a.m1796c(c9208y.m16084n()) == 0) {
            return c9208y.m16109F();
        }
        return c9208y.m16106I();
    }

    /* renamed from: v */
    private static void m1721v(AbstractC13691a.C13692a c13692a, SparseArray<C13709b> sparseArray, int i, byte[] bArr) {
        int size = c13692a.f35219d.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC13691a.C13692a c13692a2 = c13692a.f35219d.get(i2);
            if (c13692a2.f35216a == 1953653094) {
                m1750E(c13692a2, sparseArray, i, bArr);
            }
        }
    }

    /* renamed from: w */
    private static void m1720w(C9208y c9208y, C13722q c13722q) {
        long m16106I;
        c9208y.m16099P(8);
        int m16084n = c9208y.m16084n();
        if ((AbstractC13691a.m1797b(m16084n) & 1) == 1) {
            c9208y.m16098Q(8);
        }
        int m16107H = c9208y.m16107H();
        if (m16107H == 1) {
            int m1796c = AbstractC13691a.m1796c(m16084n);
            long j = c13722q.f35369d;
            if (m1796c == 0) {
                m16106I = c9208y.m16109F();
            } else {
                m16106I = c9208y.m16106I();
            }
            c13722q.f35369d = j + m16106I;
            return;
        }
        throw new C7402m("Unexpected saio entry count: " + m16107H);
    }

    /* renamed from: x */
    private static void m1719x(C13721p c13721p, C9208y c9208y, C13722q c13722q) {
        int i;
        boolean z;
        int i2 = c13721p.f35364d;
        c9208y.m16099P(8);
        boolean z2 = true;
        if ((AbstractC13691a.m1797b(c9208y.m16084n()) & 1) == 1) {
            c9208y.m16098Q(8);
        }
        int m16111D = c9208y.m16111D();
        int m16107H = c9208y.m16107H();
        if (m16107H <= c13722q.f35371f) {
            if (m16111D == 0) {
                boolean[] zArr = c13722q.f35379n;
                i = 0;
                for (int i3 = 0; i3 < m16107H; i3++) {
                    int m16111D2 = c9208y.m16111D();
                    i += m16111D2;
                    if (m16111D2 > i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zArr[i3] = z;
                }
            } else {
                if (m16111D <= i2) {
                    z2 = false;
                }
                i = (m16111D * m16107H) + 0;
                Arrays.fill(c13722q.f35379n, 0, m16107H, z2);
            }
            Arrays.fill(c13722q.f35379n, m16107H, c13722q.f35371f, false);
            if (i > 0) {
                c13722q.m1641d(i);
                return;
            }
            return;
        }
        throw new C7402m("Saiz sample count " + m16107H + " is greater than fragment sample count" + c13722q.f35371f);
    }

    /* renamed from: y */
    private static void m1718y(AbstractC13691a.C13692a c13692a, String str, C13722q c13722q) {
        boolean z;
        byte[] bArr = null;
        C9208y c9208y = null;
        C9208y c9208y2 = null;
        for (int i = 0; i < c13692a.f35218c.size(); i++) {
            AbstractC13691a.C13693b c13693b = c13692a.f35218c.get(i);
            C9208y c9208y3 = c13693b.f35220b;
            int i2 = c13693b.f35216a;
            if (i2 == 1935828848) {
                c9208y3.m16099P(12);
                if (c9208y3.m16084n() == 1936025959) {
                    c9208y = c9208y3;
                }
            } else if (i2 == 1936158820) {
                c9208y3.m16099P(12);
                if (c9208y3.m16084n() == 1936025959) {
                    c9208y2 = c9208y3;
                }
            }
        }
        if (c9208y != null && c9208y2 != null) {
            c9208y.m16099P(8);
            int m1796c = AbstractC13691a.m1796c(c9208y.m16084n());
            c9208y.m16098Q(4);
            if (m1796c == 1) {
                c9208y.m16098Q(4);
            }
            if (c9208y.m16084n() == 1) {
                c9208y2.m16099P(8);
                int m1796c2 = AbstractC13691a.m1796c(c9208y2.m16084n());
                c9208y2.m16098Q(4);
                if (m1796c2 == 1) {
                    if (c9208y2.m16109F() == 0) {
                        throw new C7402m("Variable length description in sgpd found (unsupported)");
                    }
                } else if (m1796c2 >= 2) {
                    c9208y2.m16098Q(4);
                }
                if (c9208y2.m16109F() == 1) {
                    c9208y2.m16098Q(1);
                    int m16111D = c9208y2.m16111D();
                    int i3 = (m16111D & 240) >> 4;
                    int i4 = m16111D & 15;
                    if (c9208y2.m16111D() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                    int m16111D2 = c9208y2.m16111D();
                    byte[] bArr2 = new byte[16];
                    c9208y2.m16088j(bArr2, 0, 16);
                    if (m16111D2 == 0) {
                        int m16111D3 = c9208y2.m16111D();
                        bArr = new byte[m16111D3];
                        c9208y2.m16088j(bArr, 0, m16111D3);
                    }
                    c13722q.f35378m = true;
                    c13722q.f35380o = new C13721p(z, str, m16111D2, bArr2, i3, i4, bArr);
                    return;
                }
                throw new C7402m("Entry count in sgpd != 1 (unsupported).");
            }
            throw new C7402m("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: z */
    private static void m1717z(C9208y c9208y, int i, C13722q c13722q) {
        boolean z;
        c9208y.m16099P(i + 8);
        int m1797b = AbstractC13691a.m1797b(c9208y.m16084n());
        if ((m1797b & 1) == 0) {
            if ((m1797b & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int m16107H = c9208y.m16107H();
            if (m16107H == 0) {
                Arrays.fill(c13722q.f35379n, 0, c13722q.f35371f, false);
                return;
            } else if (m16107H == c13722q.f35371f) {
                Arrays.fill(c13722q.f35379n, 0, m16107H, z);
                c13722q.m1641d(c9208y.m16097a());
                c13722q.m1644a(c9208y);
                return;
            } else {
                throw new C7402m("Senc sample count " + m16107H + " is different from fragment sample count" + c13722q.f35371f);
            }
        }
        throw new C7402m("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        int size = this.f35271d.size();
        for (int i = 0; i < size; i++) {
            this.f35271d.valueAt(i).m1706k();
        }
        this.f35281n.clear();
        this.f35289v = 0;
        this.f35290w = j2;
        this.f35280m.clear();
        m1736g();
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f35264E = interfaceC11748k;
        m1736g();
        m1731l();
        C13720o c13720o = this.f35269b;
        if (c13720o != null) {
            this.f35271d.put(0, new C13709b(interfaceC11748k.mo3740e(0, c13720o.f35351b), new C13723r(this.f35269b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C13701c(0, 0, 0, 0)));
            this.f35264E.mo3738s();
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        while (true) {
            int i = this.f35283p;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (m1741N(interfaceC11747j)) {
                            return 0;
                        }
                    } else {
                        m1742M(interfaceC11747j);
                    }
                } else {
                    m1743L(interfaceC11747j);
                }
            } else if (!m1744K(interfaceC11747j)) {
                return -1;
            }
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        return C13719n.m1649b(interfaceC11747j);
    }

    /* renamed from: n */
    public C13720o m1729n(C13720o c13720o) {
        return c13720o;
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }

    public C13707g(int i) {
        this(i, null);
    }

    public C13707g(int i, C9183l0 c9183l0) {
        this(i, c9183l0, null, Collections.emptyList());
    }

    public C13707g(int i, C9183l0 c9183l0, C13720o c13720o) {
        this(i, c9183l0, c13720o, Collections.emptyList());
    }

    public C13707g(int i, C9183l0 c9183l0, C13720o c13720o, List<Format> list) {
        this(i, c9183l0, c13720o, list, null);
    }

    public C13707g(int i, C9183l0 c9183l0, C13720o c13720o, List<Format> list, InterfaceC11732b0 interfaceC11732b0) {
        this.f35268a = i;
        this.f35277j = c9183l0;
        this.f35269b = c13720o;
        this.f35270c = Collections.unmodifiableList(list);
        this.f35282o = interfaceC11732b0;
        this.f35278k = new C6317c();
        this.f35279l = new C9208y(16);
        this.f35272e = new C9208y(C9204w.f24210a);
        this.f35273f = new C9208y(5);
        this.f35274g = new C9208y();
        byte[] bArr = new byte[16];
        this.f35275h = bArr;
        this.f35276i = new C9208y(bArr);
        this.f35280m = new ArrayDeque<>();
        this.f35281n = new ArrayDeque<>();
        this.f35271d = new SparseArray<>();
        this.f35291x = -9223372036854775807L;
        this.f35290w = -9223372036854775807L;
        this.f35292y = -9223372036854775807L;
        this.f35264E = InterfaceC11748k.f30639e;
        this.f35265F = new InterfaceC11732b0[0];
        this.f35266G = new InterfaceC11732b0[0];
    }
}