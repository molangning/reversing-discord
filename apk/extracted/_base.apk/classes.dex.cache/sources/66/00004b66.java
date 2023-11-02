package p317r7;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import gb.AbstractC6693s;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p152i7.C7425h;
import p152i7.C7433l;
import p195k8.C9149a;
import p195k8.C9183l0;
import p195k8.C9187n0;
import p195k8.C9191p0;
import p195k8.C9208y;
import p259o6.C11028l;
import p260o7.AbstractC11069m;
import p296q6.C11743f;
import p296q6.InterfaceC11747j;
import p317r7.C12078f;
import p337s7.C12416g;

/* renamed from: r7.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12086i extends AbstractC11069m {

    /* renamed from: L */
    private static final AtomicInteger f31286L = new AtomicInteger();

    /* renamed from: A */
    private final boolean f31287A;

    /* renamed from: B */
    private final boolean f31288B;

    /* renamed from: C */
    private InterfaceC12087j f31289C;

    /* renamed from: D */
    private C12094q f31290D;

    /* renamed from: E */
    private int f31291E;

    /* renamed from: F */
    private boolean f31292F;

    /* renamed from: G */
    private volatile boolean f31293G;

    /* renamed from: H */
    private boolean f31294H;

    /* renamed from: I */
    private AbstractC6693s<Integer> f31295I;

    /* renamed from: J */
    private boolean f31296J;

    /* renamed from: K */
    private boolean f31297K;

    /* renamed from: k */
    public final int f31298k;

    /* renamed from: l */
    public final int f31299l;

    /* renamed from: m */
    public final Uri f31300m;

    /* renamed from: n */
    public final boolean f31301n;

    /* renamed from: o */
    public final int f31302o;

    /* renamed from: p */
    private final DataSource f31303p;

    /* renamed from: q */
    private final C4515a f31304q;

    /* renamed from: r */
    private final InterfaceC12087j f31305r;

    /* renamed from: s */
    private final boolean f31306s;

    /* renamed from: t */
    private final boolean f31307t;

    /* renamed from: u */
    private final C9183l0 f31308u;

    /* renamed from: v */
    private final InterfaceC12085h f31309v;

    /* renamed from: w */
    private final List<Format> f31310w;

    /* renamed from: x */
    private final C11028l f31311x;

    /* renamed from: y */
    private final C7425h f31312y;

    /* renamed from: z */
    private final C9208y f31313z;

    private C12086i(InterfaceC12085h interfaceC12085h, DataSource dataSource, C4515a c4515a, Format format, boolean z, DataSource dataSource2, C4515a c4515a2, boolean z2, Uri uri, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C9183l0 c9183l0, C11028l c11028l, InterfaceC12087j interfaceC12087j, C7425h c7425h, C9208y c9208y, boolean z6) {
        super(dataSource, c4515a, format, i, obj, j, j2, j3);
        this.f31287A = z;
        this.f31302o = i2;
        this.f31297K = z3;
        this.f31299l = i3;
        this.f31304q = c4515a2;
        this.f31303p = dataSource2;
        this.f31292F = c4515a2 != null;
        this.f31288B = z2;
        this.f31300m = uri;
        this.f31306s = z5;
        this.f31308u = c9183l0;
        this.f31307t = z4;
        this.f31309v = interfaceC12085h;
        this.f31310w = list;
        this.f31311x = c11028l;
        this.f31305r = interfaceC12087j;
        this.f31312y = c7425h;
        this.f31313z = c9208y;
        this.f31301n = z6;
        this.f31295I = AbstractC6693s.m22131x();
        this.f31298k = f31286L.getAndIncrement();
    }

    /* renamed from: i */
    private static DataSource m6274i(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            C9149a.m16448e(bArr2);
            return new C12072a(dataSource, bArr, bArr2);
        }
        return dataSource;
    }

    /* renamed from: j */
    public static C12086i m6273j(InterfaceC12085h interfaceC12085h, DataSource dataSource, Format format, long j, C12416g c12416g, C12078f.C12083e c12083e, Uri uri, List<Format> list, int i, Object obj, boolean z, C12104t c12104t, C12086i c12086i, byte[] bArr, byte[] bArr2) {
        boolean z2;
        DataSource dataSource2;
        C4515a c4515a;
        boolean z3;
        int i2;
        C7425h c7425h;
        C9208y c9208y;
        InterfaceC12087j interfaceC12087j;
        boolean z4;
        InterfaceC12087j interfaceC12087j2;
        C12416g.C12421e c12421e = c12083e.f31281a;
        C4515a m28765a = new C4515a.C4517b().m28757i(C9187n0.m16314d(c12416g.f32311a, c12421e.f32295j)).m28758h(c12421e.f32303r).m28759g(c12421e.f32304s).m28764b(c12083e.f31284d ? 8 : 0).m28765a();
        boolean z5 = bArr != null;
        DataSource m6274i = m6274i(dataSource, bArr, z5 ? m6271l((String) C9149a.m16448e(c12421e.f32302q)) : null);
        C12416g.C12420d c12420d = c12421e.f32296k;
        if (c12420d != null) {
            boolean z6 = bArr2 != null;
            byte[] m6271l = z6 ? m6271l((String) C9149a.m16448e(c12420d.f32302q)) : null;
            z2 = z5;
            c4515a = new C4515a(C9187n0.m16314d(c12416g.f32311a, c12420d.f32295j), c12420d.f32303r, c12420d.f32304s);
            dataSource2 = m6274i(dataSource, bArr2, m6271l);
            z3 = z6;
        } else {
            z2 = z5;
            dataSource2 = null;
            c4515a = null;
            z3 = false;
        }
        long j2 = j + c12421e.f32299n;
        long j3 = j2 + c12421e.f32297l;
        int i3 = c12416g.f32275h + c12421e.f32298m;
        if (c12086i != null) {
            boolean z7 = uri.equals(c12086i.f31300m) && c12086i.f31294H;
            C7425h c7425h2 = c12086i.f31312y;
            C9208y c9208y2 = c12086i.f31313z;
            boolean z8 = !(z7 || (m6267p(c12083e, c12416g) && j2 >= c12086i.f28949h));
            if (!z7 || c12086i.f31296J) {
                i2 = i3;
            } else {
                i2 = i3;
                if (c12086i.f31299l == i2) {
                    interfaceC12087j2 = c12086i.f31289C;
                    z4 = z8;
                    interfaceC12087j = interfaceC12087j2;
                    c7425h = c7425h2;
                    c9208y = c9208y2;
                }
            }
            interfaceC12087j2 = null;
            z4 = z8;
            interfaceC12087j = interfaceC12087j2;
            c7425h = c7425h2;
            c9208y = c9208y2;
        } else {
            i2 = i3;
            c7425h = new C7425h();
            c9208y = new C9208y(10);
            interfaceC12087j = null;
            z4 = false;
        }
        return new C12086i(interfaceC12085h, m6274i, m28765a, format, z2, dataSource2, c4515a, z3, uri, list, i, obj, j2, j3, c12083e.f31282b, c12083e.f31283c, !c12083e.f31284d, i2, c12421e.f32305t, z, c12104t.m6151a(i2), c12421e.f32300o, interfaceC12087j, c7425h, c9208y, z4);
    }

    @RequiresNonNull({"output"})
    /* renamed from: k */
    private void m6272k(DataSource dataSource, C4515a c4515a, boolean z) {
        C4515a m28767e;
        long position;
        long j;
        boolean z2 = false;
        if (z) {
            if (this.f31291E != 0) {
                z2 = true;
            }
            m28767e = c4515a;
        } else {
            m28767e = c4515a.m28767e(this.f31291E);
        }
        try {
            C11743f m6262u = m6262u(dataSource, m28767e);
            if (z2) {
                m6262u.mo6965k(this.f31291E);
            }
            do {
                try {
                    if (this.f31293G) {
                        break;
                    }
                } catch (EOFException e) {
                    if ((this.f28945d.f11190n & 16384) != 0) {
                        this.f31289C.mo6258c();
                        position = m6262u.getPosition();
                        j = c4515a.f12263g;
                    } else {
                        throw e;
                    }
                }
            } while (this.f31289C.mo6260a(m6262u));
            position = m6262u.getPosition();
            j = c4515a.f12263g;
            this.f31291E = (int) (position - j);
        } finally {
            C9191p0.m16235n(dataSource);
        }
    }

    /* renamed from: l */
    private static byte[] m6271l(String str) {
        int i;
        if (C9191p0.m16272U0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr, (16 - byteArray.length) + i, byteArray.length - i);
        return bArr;
    }

    /* renamed from: p */
    private static boolean m6267p(C12078f.C12083e c12083e, C12416g c12416g) {
        C12416g.C12421e c12421e = c12083e.f31281a;
        if (c12421e instanceof C12416g.C12418b) {
            if (!((C12416g.C12418b) c12421e).f32288u && (c12083e.f31283c != 0 || !c12416g.f32313c)) {
                return false;
            }
            return true;
        }
        return c12416g.f32313c;
    }

    @RequiresNonNull({"output"})
    /* renamed from: r */
    private void m6265r() {
        try {
            this.f31308u.m16339h(this.f31306s, this.f28948g);
            m6272k(this.f28950i, this.f28943b, this.f31287A);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: s */
    private void m6264s() {
        if (!this.f31292F) {
            return;
        }
        C9149a.m16448e(this.f31303p);
        C9149a.m16448e(this.f31304q);
        m6272k(this.f31303p, this.f31304q, this.f31288B);
        this.f31291E = 0;
        this.f31292F = false;
    }

    /* renamed from: t */
    private long m6263t(InterfaceC11747j interfaceC11747j) {
        interfaceC11747j.mo6969e();
        try {
            this.f31313z.m16103L(10);
            interfaceC11747j.mo6963n(this.f31313z.m16094d(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f31313z.m16108G() != 4801587) {
            return -9223372036854775807L;
        }
        this.f31313z.m16098Q(3);
        int m16112C = this.f31313z.m16112C();
        int i = m16112C + 10;
        if (i > this.f31313z.m16096b()) {
            byte[] m16094d = this.f31313z.m16094d();
            this.f31313z.m16103L(i);
            System.arraycopy(m16094d, 0, this.f31313z.m16094d(), 0, 10);
        }
        interfaceC11747j.mo6963n(this.f31313z.m16094d(), 10, m16112C);
        Metadata m20699e = this.f31312y.m20699e(this.f31313z.m16094d(), m16112C);
        if (m20699e == null) {
            return -9223372036854775807L;
        }
        int m29247e = m20699e.m29247e();
        for (int i2 = 0; i2 < m29247e; i2++) {
            Metadata.InterfaceC4429b m29248d = m20699e.m29248d(i2);
            if (m29248d instanceof C7433l) {
                C7433l c7433l = (C7433l) m29248d;
                if ("com.apple.streaming.transportStreamTimestamp".equals(c7433l.f19970k)) {
                    System.arraycopy(c7433l.f19971l, 0, this.f31313z.m16094d(), 0, 8);
                    this.f31313z.m16099P(0);
                    this.f31313z.m16100O(8);
                    return this.f31313z.m16075w() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* renamed from: u */
    private C11743f m6262u(DataSource dataSource, C4515a c4515a) {
        InterfaceC12087j mo6278a;
        long j;
        C11743f c11743f = new C11743f(dataSource, c4515a.f12263g, dataSource.mo6322b(c4515a));
        if (this.f31289C == null) {
            long m6263t = m6263t(c11743f);
            c11743f.mo6969e();
            InterfaceC12087j interfaceC12087j = this.f31305r;
            if (interfaceC12087j != null) {
                mo6278a = interfaceC12087j.mo6255f();
            } else {
                mo6278a = this.f31309v.mo6278a(c4515a.f12257a, this.f28945d, this.f31310w, this.f31308u, dataSource.mo6321d(), c11743f);
            }
            this.f31289C = mo6278a;
            if (mo6278a.mo6256e()) {
                C12094q c12094q = this.f31290D;
                if (m6263t != -9223372036854775807L) {
                    j = this.f31308u.m16345b(m6263t);
                } else {
                    j = this.f28948g;
                }
                c12094q.m6185m0(j);
            } else {
                this.f31290D.m6185m0(0L);
            }
            this.f31290D.m6205Y();
            this.f31289C.mo6259b(this.f31290D);
        }
        this.f31290D.m6188j0(this.f31311x);
        return c11743f;
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: a */
    public void mo6277a() {
        InterfaceC12087j interfaceC12087j;
        C9149a.m16448e(this.f31290D);
        if (this.f31289C == null && (interfaceC12087j = this.f31305r) != null && interfaceC12087j.mo6257d()) {
            this.f31289C = this.f31305r;
            this.f31292F = false;
        }
        m6264s();
        if (!this.f31293G) {
            if (!this.f31307t) {
                m6265r();
            }
            this.f31294H = !this.f31293G;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: c */
    public void mo6276c() {
        this.f31293G = true;
    }

    @Override // p260o7.AbstractC11069m
    /* renamed from: h */
    public boolean mo6275h() {
        return this.f31294H;
    }

    /* renamed from: m */
    public int m6270m(int i) {
        C9149a.m16447f(!this.f31301n);
        if (i >= this.f31295I.size()) {
            return 0;
        }
        return this.f31295I.get(i).intValue();
    }

    /* renamed from: n */
    public void m6269n(C12094q c12094q, AbstractC6693s<Integer> abstractC6693s) {
        this.f31290D = c12094q;
        this.f31295I = abstractC6693s;
    }

    /* renamed from: o */
    public void m6268o() {
        this.f31296J = true;
    }

    /* renamed from: q */
    public boolean m6266q() {
        return this.f31297K;
    }

    /* renamed from: v */
    public void m6261v() {
        this.f31297K = true;
    }
}