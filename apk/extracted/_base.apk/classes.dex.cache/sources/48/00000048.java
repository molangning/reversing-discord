package p008a7;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p195k8.C9149a;
import p195k8.C9157d;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9204w;
import p195k8.C9208y;
import p195k8.C9209z;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0072q implements InterfaceC0062m {

    /* renamed from: a */
    private final C0039d0 f307a;

    /* renamed from: b */
    private String f308b;

    /* renamed from: c */
    private InterfaceC11732b0 f309c;

    /* renamed from: d */
    private C0073a f310d;

    /* renamed from: e */
    private boolean f311e;

    /* renamed from: l */
    private long f318l;

    /* renamed from: m */
    private long f319m;

    /* renamed from: f */
    private final boolean[] f312f = new boolean[3];

    /* renamed from: g */
    private final C0077u f313g = new C0077u(32, 128);

    /* renamed from: h */
    private final C0077u f314h = new C0077u(33, 128);

    /* renamed from: i */
    private final C0077u f315i = new C0077u(34, 128);

    /* renamed from: j */
    private final C0077u f316j = new C0077u(39, 128);

    /* renamed from: k */
    private final C0077u f317k = new C0077u(40, 128);

    /* renamed from: n */
    private final C9208y f320n = new C9208y();

    /* renamed from: a7.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C0073a {

        /* renamed from: a */
        private final InterfaceC11732b0 f321a;

        /* renamed from: b */
        private long f322b;

        /* renamed from: c */
        private boolean f323c;

        /* renamed from: d */
        private int f324d;

        /* renamed from: e */
        private long f325e;

        /* renamed from: f */
        private boolean f326f;

        /* renamed from: g */
        private boolean f327g;

        /* renamed from: h */
        private boolean f328h;

        /* renamed from: i */
        private boolean f329i;

        /* renamed from: j */
        private boolean f330j;

        /* renamed from: k */
        private long f331k;

        /* renamed from: l */
        private long f332l;

        /* renamed from: m */
        private boolean f333m;

        public C0073a(InterfaceC11732b0 interfaceC11732b0) {
            this.f321a = interfaceC11732b0;
        }

        /* renamed from: b */
        private static boolean m41232b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        /* renamed from: c */
        private static boolean m41231c(int i) {
            return i < 32 || i == 40;
        }

        /* renamed from: d */
        private void m41230d(int i) {
            boolean z = this.f333m;
            this.f321a.mo6162f(this.f332l, z ? 1 : 0, (int) (this.f322b - this.f331k), i, null);
        }

        /* renamed from: a */
        public void m41233a(long j, int i, boolean z) {
            if (this.f330j && this.f327g) {
                this.f333m = this.f323c;
                this.f330j = false;
            } else if (this.f328h || this.f327g) {
                if (z && this.f329i) {
                    m41230d(i + ((int) (j - this.f322b)));
                }
                this.f331k = this.f322b;
                this.f332l = this.f325e;
                this.f333m = this.f323c;
                this.f329i = true;
            }
        }

        /* renamed from: e */
        public void m41229e(byte[] bArr, int i, int i2) {
            boolean z;
            if (this.f326f) {
                int i3 = this.f324d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    if ((bArr[i4] & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f327g = z;
                    this.f326f = false;
                    return;
                }
                this.f324d = i3 + (i2 - i);
            }
        }

        /* renamed from: f */
        public void m41228f() {
            this.f326f = false;
            this.f327g = false;
            this.f328h = false;
            this.f329i = false;
            this.f330j = false;
        }

        /* renamed from: g */
        public void m41227g(long j, int i, int i2, long j2, boolean z) {
            boolean z2;
            boolean z3 = false;
            this.f327g = false;
            this.f328h = false;
            this.f325e = j2;
            this.f324d = 0;
            this.f322b = j;
            if (!m41231c(i2)) {
                if (this.f329i && !this.f330j) {
                    if (z) {
                        m41230d(i);
                    }
                    this.f329i = false;
                }
                if (m41232b(i2)) {
                    this.f328h = !this.f330j;
                    this.f330j = true;
                }
            }
            if (i2 >= 16 && i2 <= 21) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f323c = z2;
            if (z2 || i2 <= 9) {
                z3 = true;
            }
            this.f326f = z3;
        }
    }

    public C0072q(C0039d0 c0039d0) {
        this.f307a = c0039d0;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* renamed from: b */
    private void m41240b() {
        C9149a.m16445h(this.f309c);
        C9191p0.m16243j(this.f310d);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* renamed from: g */
    private void m41239g(long j, int i, int i2, long j2) {
        this.f310d.m41233a(j, i, this.f311e);
        if (!this.f311e) {
            this.f313g.m41209b(i2);
            this.f314h.m41209b(i2);
            this.f315i.m41209b(i2);
            if (this.f313g.m41208c() && this.f314h.m41208c() && this.f315i.m41208c()) {
                this.f309c.mo6168c(m41237i(this.f308b, this.f313g, this.f314h, this.f315i));
                this.f311e = true;
            }
        }
        if (this.f316j.m41209b(i2)) {
            C0077u c0077u = this.f316j;
            this.f320n.m16101N(this.f316j.f376d, C9204w.m16134k(c0077u.f376d, c0077u.f377e));
            this.f320n.m16098Q(5);
            this.f307a.m41354a(j2, this.f320n);
        }
        if (this.f317k.m41209b(i2)) {
            C0077u c0077u2 = this.f317k;
            this.f320n.m16101N(this.f317k.f376d, C9204w.m16134k(c0077u2.f376d, c0077u2.f377e));
            this.f320n.m16098Q(5);
            this.f307a.m41354a(j2, this.f320n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: h */
    private void m41238h(byte[] bArr, int i, int i2) {
        this.f310d.m41229e(bArr, i, i2);
        if (!this.f311e) {
            this.f313g.m41210a(bArr, i, i2);
            this.f314h.m41210a(bArr, i, i2);
            this.f315i.m41210a(bArr, i, i2);
        }
        this.f316j.m41210a(bArr, i, i2);
        this.f317k.m41210a(bArr, i, i2);
    }

    /* renamed from: i */
    private static Format m41237i(String str, C0077u c0077u, C0077u c0077u2, C0077u c0077u3) {
        int i;
        int i2;
        int i3;
        int i4 = c0077u.f377e;
        byte[] bArr = new byte[c0077u2.f377e + i4 + c0077u3.f377e];
        System.arraycopy(c0077u.f376d, 0, bArr, 0, i4);
        System.arraycopy(c0077u2.f376d, 0, bArr, c0077u.f377e, c0077u2.f377e);
        System.arraycopy(c0077u3.f376d, 0, bArr, c0077u.f377e + c0077u2.f377e, c0077u3.f377e);
        C9209z c9209z = new C9209z(c0077u2.f376d, 0, c0077u2.f377e);
        c9209z.m16060l(44);
        int m16067e = c9209z.m16067e(3);
        c9209z.m16061k();
        c9209z.m16060l(88);
        c9209z.m16060l(8);
        int i5 = 0;
        for (int i6 = 0; i6 < m16067e; i6++) {
            if (c9209z.m16068d()) {
                i5 += 89;
            }
            if (c9209z.m16068d()) {
                i5 += 8;
            }
        }
        c9209z.m16060l(i5);
        if (m16067e > 0) {
            c9209z.m16060l((8 - m16067e) * 2);
        }
        c9209z.m16064h();
        int m16064h = c9209z.m16064h();
        if (m16064h == 3) {
            c9209z.m16061k();
        }
        int m16064h2 = c9209z.m16064h();
        int m16064h3 = c9209z.m16064h();
        if (c9209z.m16068d()) {
            int m16064h4 = c9209z.m16064h();
            int m16064h5 = c9209z.m16064h();
            int m16064h6 = c9209z.m16064h();
            int m16064h7 = c9209z.m16064h();
            if (m16064h != 1 && m16064h != 2) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            if (m16064h == 1) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            m16064h2 -= i2 * (m16064h4 + m16064h5);
            m16064h3 -= i3 * (m16064h6 + m16064h7);
        }
        c9209z.m16064h();
        c9209z.m16064h();
        int m16064h8 = c9209z.m16064h();
        if (c9209z.m16068d()) {
            i = 0;
        } else {
            i = m16067e;
        }
        while (i <= m16067e) {
            c9209z.m16064h();
            c9209z.m16064h();
            c9209z.m16064h();
            i++;
        }
        c9209z.m16064h();
        c9209z.m16064h();
        c9209z.m16064h();
        c9209z.m16064h();
        c9209z.m16064h();
        c9209z.m16064h();
        if (c9209z.m16068d() && c9209z.m16068d()) {
            m41236j(c9209z);
        }
        c9209z.m16060l(2);
        if (c9209z.m16068d()) {
            c9209z.m16060l(8);
            c9209z.m16064h();
            c9209z.m16064h();
            c9209z.m16061k();
        }
        m41235k(c9209z);
        if (c9209z.m16068d()) {
            for (int i7 = 0; i7 < c9209z.m16064h(); i7++) {
                c9209z.m16060l(m16064h8 + 4 + 1);
            }
        }
        c9209z.m16060l(2);
        float f = 1.0f;
        if (c9209z.m16068d()) {
            if (c9209z.m16068d()) {
                int m16067e2 = c9209z.m16067e(8);
                if (m16067e2 == 255) {
                    int m16067e3 = c9209z.m16067e(16);
                    int m16067e4 = c9209z.m16067e(16);
                    if (m16067e3 != 0 && m16067e4 != 0) {
                        f = m16067e3 / m16067e4;
                    }
                } else {
                    float[] fArr = C9204w.f24211b;
                    if (m16067e2 < fArr.length) {
                        f = fArr[m16067e2];
                    } else {
                        C9197r.m16178h("H265Reader", "Unexpected aspect_ratio_idc value: " + m16067e2);
                    }
                }
            }
            if (c9209z.m16068d()) {
                c9209z.m16061k();
            }
            if (c9209z.m16068d()) {
                c9209z.m16060l(4);
                if (c9209z.m16068d()) {
                    c9209z.m16060l(24);
                }
            }
            if (c9209z.m16068d()) {
                c9209z.m16064h();
                c9209z.m16064h();
            }
            c9209z.m16061k();
            if (c9209z.m16068d()) {
                m16064h3 *= 2;
            }
        }
        c9209z.m16063i(c0077u2.f376d, 0, c0077u2.f377e);
        c9209z.m16060l(24);
        return new Format.C4362b().m29900S(str).m29883e0("video/hevc").m29910I(C9157d.m16429c(c9209z)).m29873j0(m16064h2).m29902Q(m16064h3).m29891a0(f).m29899T(Collections.singletonList(bArr)).m29914E();
    }

    /* renamed from: j */
    private static void m41236j(C9209z c9209z) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!c9209z.m16068d()) {
                    c9209z.m16064h();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        c9209z.m16065g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        c9209z.m16065g();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: k */
    private static void m41235k(C9209z c9209z) {
        int m16064h = c9209z.m16064h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < m16064h; i2++) {
            if (i2 != 0) {
                z = c9209z.m16068d();
            }
            if (z) {
                c9209z.m16061k();
                c9209z.m16064h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (c9209z.m16068d()) {
                        c9209z.m16061k();
                    }
                }
            } else {
                int m16064h2 = c9209z.m16064h();
                int m16064h3 = c9209z.m16064h();
                int i4 = m16064h2 + m16064h3;
                for (int i5 = 0; i5 < m16064h2; i5++) {
                    c9209z.m16064h();
                    c9209z.m16061k();
                }
                for (int i6 = 0; i6 < m16064h3; i6++) {
                    c9209z.m16064h();
                    c9209z.m16061k();
                }
                i = i4;
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: l */
    private void m41234l(long j, int i, int i2, long j2) {
        this.f310d.m41227g(j, i, i2, j2, this.f311e);
        if (!this.f311e) {
            this.f313g.m41206e(i2);
            this.f314h.m41206e(i2);
            this.f315i.m41206e(i2);
        }
        this.f316j.m41206e(i2);
        this.f317k.m41206e(i2);
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        int i;
        m41240b();
        while (c9208y.m16097a() > 0) {
            int m16093e = c9208y.m16093e();
            int m16092f = c9208y.m16092f();
            byte[] m16094d = c9208y.m16094d();
            this.f318l += c9208y.m16097a();
            this.f309c.mo6170a(c9208y, c9208y.m16097a());
            while (m16093e < m16092f) {
                int m16142c = C9204w.m16142c(m16094d, m16093e, m16092f, this.f312f);
                if (m16142c == m16092f) {
                    m41238h(m16094d, m16093e, m16092f);
                    return;
                }
                int m16140e = C9204w.m16140e(m16094d, m16142c);
                int i2 = m16142c - m16093e;
                if (i2 > 0) {
                    m41238h(m16094d, m16093e, m16142c);
                }
                int i3 = m16092f - m16142c;
                long j = this.f318l - i3;
                if (i2 < 0) {
                    i = -i2;
                } else {
                    i = 0;
                }
                m41239g(j, i3, i, this.f319m);
                m41234l(j, i3, m16140e, this.f319m);
                m16093e = m16142c + 3;
            }
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        this.f318l = 0L;
        C9204w.m16144a(this.f312f);
        this.f313g.m41207d();
        this.f314h.m41207d();
        this.f315i.m41207d();
        this.f316j.m41207d();
        this.f317k.m41207d();
        C0073a c0073a = this.f310d;
        if (c0073a != null) {
            c0073a.m41228f();
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        this.f308b = c0056d.m41288b();
        InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(c0056d.m41287c(), 2);
        this.f309c = mo3740e;
        this.f310d = new C0073a(mo3740e);
        this.f307a.m41353b(interfaceC11748k, c0056d);
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        this.f319m = j;
    }
}