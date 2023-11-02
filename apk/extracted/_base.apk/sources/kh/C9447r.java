package kh;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kh.C9439q;
import p326rh.AbstractC12170a;
import p326rh.AbstractC12173b;
import p326rh.AbstractC12177d;
import p326rh.AbstractC12188i;
import p326rh.C12180e;
import p326rh.C12181f;
import p326rh.C12183g;
import p326rh.C12199k;
import p326rh.InterfaceC12213s;

/* renamed from: kh.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9447r extends AbstractC12188i.AbstractC12192d<C9447r> {

    /* renamed from: y */
    private static final C9447r f24933y;

    /* renamed from: z */
    public static InterfaceC12213s<C9447r> f24934z = new C9448a();

    /* renamed from: l */
    private final AbstractC12177d f24935l;

    /* renamed from: m */
    private int f24936m;

    /* renamed from: n */
    private int f24937n;

    /* renamed from: o */
    private int f24938o;

    /* renamed from: p */
    private List<C9450s> f24939p;

    /* renamed from: q */
    private C9439q f24940q;

    /* renamed from: r */
    private int f24941r;

    /* renamed from: s */
    private C9439q f24942s;

    /* renamed from: t */
    private int f24943t;

    /* renamed from: u */
    private List<C9375b> f24944u;

    /* renamed from: v */
    private List<Integer> f24945v;

    /* renamed from: w */
    private byte f24946w;

    /* renamed from: x */
    private int f24947x;

    /* renamed from: kh.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9448a extends AbstractC12173b<C9447r> {
        C9448a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9447r mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9447r(c12180e, c12183g);
        }
    }

    /* renamed from: kh.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9449b extends AbstractC12188i.AbstractC12191c<C9447r, C9449b> {

        /* renamed from: m */
        private int f24948m;

        /* renamed from: o */
        private int f24950o;

        /* renamed from: r */
        private int f24953r;

        /* renamed from: t */
        private int f24955t;

        /* renamed from: n */
        private int f24949n = 6;

        /* renamed from: p */
        private List<C9450s> f24951p = Collections.emptyList();

        /* renamed from: q */
        private C9439q f24952q = C9439q.m15008Y();

        /* renamed from: s */
        private C9439q f24954s = C9439q.m15008Y();

        /* renamed from: u */
        private List<C9375b> f24956u = Collections.emptyList();

        /* renamed from: v */
        private List<Integer> f24957v = Collections.emptyList();

        private C9449b() {
            m14881D();
        }

        /* renamed from: A */
        private void m14884A() {
            if ((this.f24948m & 128) != 128) {
                this.f24956u = new ArrayList(this.f24956u);
                this.f24948m |= 128;
            }
        }

        /* renamed from: B */
        private void m14883B() {
            if ((this.f24948m & 4) != 4) {
                this.f24951p = new ArrayList(this.f24951p);
                this.f24948m |= 4;
            }
        }

        /* renamed from: C */
        private void m14882C() {
            if ((this.f24948m & 256) != 256) {
                this.f24957v = new ArrayList(this.f24957v);
                this.f24948m |= 256;
            }
        }

        /* renamed from: D */
        private void m14881D() {
        }

        /* renamed from: v */
        static /* synthetic */ C9449b m14872v() {
            return m14868z();
        }

        /* renamed from: z */
        private static C9449b m14868z() {
            return new C9449b();
        }

        /* renamed from: E */
        public C9449b m14880E(C9439q c9439q) {
            if ((this.f24948m & 32) == 32 && this.f24954s != C9439q.m15008Y()) {
                this.f24954s = C9439q.m14981z0(this.f24954s).mo5830p(c9439q).m14929x();
            } else {
                this.f24954s = c9439q;
            }
            this.f24948m |= 32;
            return this;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: F */
        public C9449b mo5830p(C9447r c9447r) {
            if (c9447r == C9447r.m14909S()) {
                return this;
            }
            if (c9447r.m14895g0()) {
                m14875J(c9447r.m14905W());
            }
            if (c9447r.m14894h0()) {
                m14874K(c9447r.m14904X());
            }
            if (!c9447r.f24939p.isEmpty()) {
                if (this.f24951p.isEmpty()) {
                    this.f24951p = c9447r.f24939p;
                    this.f24948m &= -5;
                } else {
                    m14883B();
                    this.f24951p.addAll(c9447r.f24939p);
                }
            }
            if (c9447r.m14893i0()) {
                m14877H(c9447r.m14900b0());
            }
            if (c9447r.m14892j0()) {
                m14873L(c9447r.m14899c0());
            }
            if (c9447r.m14897e0()) {
                m14880E(c9447r.m14907U());
            }
            if (c9447r.m14896f0()) {
                m14876I(c9447r.m14906V());
            }
            if (!c9447r.f24944u.isEmpty()) {
                if (this.f24956u.isEmpty()) {
                    this.f24956u = c9447r.f24944u;
                    this.f24948m &= -129;
                } else {
                    m14884A();
                    this.f24956u.addAll(c9447r.f24944u);
                }
            }
            if (!c9447r.f24945v.isEmpty()) {
                if (this.f24957v.isEmpty()) {
                    this.f24957v = c9447r.f24945v;
                    this.f24948m &= -257;
                } else {
                    m14882C();
                    this.f24957v.addAll(c9447r.f24945v);
                }
            }
            m5825u(c9447r);
            m5829q(m5831n().m6003d(c9447r.f24935l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: G */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9447r.C9449b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.r> r1 = kh.C9447r.f24934z     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.r r3 = (kh.C9447r) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                if (r3 == 0) goto Le
                r2.mo5830p(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rh.q r4 = r3.m5796a()     // Catch: java.lang.Throwable -> Lf
                kh.r r4 = (kh.C9447r) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.mo5830p(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kh.C9447r.C9449b.mo6018k(rh.e, rh.g):kh.r$b");
        }

        /* renamed from: H */
        public C9449b m14877H(C9439q c9439q) {
            if ((this.f24948m & 8) == 8 && this.f24952q != C9439q.m15008Y()) {
                this.f24952q = C9439q.m14981z0(this.f24952q).mo5830p(c9439q).m14929x();
            } else {
                this.f24952q = c9439q;
            }
            this.f24948m |= 8;
            return this;
        }

        /* renamed from: I */
        public C9449b m14876I(int i) {
            this.f24948m |= 64;
            this.f24955t = i;
            return this;
        }

        /* renamed from: J */
        public C9449b m14875J(int i) {
            this.f24948m |= 1;
            this.f24949n = i;
            return this;
        }

        /* renamed from: K */
        public C9449b m14874K(int i) {
            this.f24948m |= 2;
            this.f24950o = i;
            return this;
        }

        /* renamed from: L */
        public C9449b m14873L(int i) {
            this.f24948m |= 16;
            this.f24953r = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9447r build() {
            C9447r m14870x = m14870x();
            if (m14870x.mo5761j()) {
                return m14870x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m14870x);
        }

        /* renamed from: x */
        public C9447r m14870x() {
            C9447r c9447r = new C9447r(this);
            int i = this.f24948m;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            c9447r.f24937n = this.f24949n;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c9447r.f24938o = this.f24950o;
            if ((this.f24948m & 4) == 4) {
                this.f24951p = Collections.unmodifiableList(this.f24951p);
                this.f24948m &= -5;
            }
            c9447r.f24939p = this.f24951p;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c9447r.f24940q = this.f24952q;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            c9447r.f24941r = this.f24953r;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            c9447r.f24942s = this.f24954s;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c9447r.f24943t = this.f24955t;
            if ((this.f24948m & 128) == 128) {
                this.f24956u = Collections.unmodifiableList(this.f24956u);
                this.f24948m &= -129;
            }
            c9447r.f24944u = this.f24956u;
            if ((this.f24948m & 256) == 256) {
                this.f24957v = Collections.unmodifiableList(this.f24957v);
                this.f24948m &= -257;
            }
            c9447r.f24945v = this.f24957v;
            c9447r.f24936m = i2;
            return c9447r;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9449b mo5832m() {
            return m14868z().mo5830p(m14870x());
        }
    }

    static {
        C9447r c9447r = new C9447r(true);
        f24933y = c9447r;
        c9447r.m14891k0();
    }

    /* renamed from: S */
    public static C9447r m14909S() {
        return f24933y;
    }

    /* renamed from: k0 */
    private void m14891k0() {
        this.f24937n = 6;
        this.f24938o = 0;
        this.f24939p = Collections.emptyList();
        this.f24940q = C9439q.m15008Y();
        this.f24941r = 0;
        this.f24942s = C9439q.m15008Y();
        this.f24943t = 0;
        this.f24944u = Collections.emptyList();
        this.f24945v = Collections.emptyList();
    }

    /* renamed from: l0 */
    public static C9449b m14890l0() {
        return C9449b.m14872v();
    }

    /* renamed from: m0 */
    public static C9449b m14889m0(C9447r c9447r) {
        return m14890l0().mo5830p(c9447r);
    }

    /* renamed from: o0 */
    public static C9447r m14887o0(InputStream inputStream, C12183g c12183g) {
        return f24934z.mo5760a(inputStream, c12183g);
    }

    /* renamed from: P */
    public C9375b m14912P(int i) {
        return this.f24944u.get(i);
    }

    /* renamed from: Q */
    public int m14911Q() {
        return this.f24944u.size();
    }

    /* renamed from: R */
    public List<C9375b> m14910R() {
        return this.f24944u;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: T */
    public C9447r mo5762f() {
        return f24933y;
    }

    /* renamed from: U */
    public C9439q m14907U() {
        return this.f24942s;
    }

    /* renamed from: V */
    public int m14906V() {
        return this.f24943t;
    }

    /* renamed from: W */
    public int m14905W() {
        return this.f24937n;
    }

    /* renamed from: X */
    public int m14904X() {
        return this.f24938o;
    }

    /* renamed from: Y */
    public C9450s m14903Y(int i) {
        return this.f24939p.get(i);
    }

    /* renamed from: Z */
    public int m14902Z() {
        return this.f24939p.size();
    }

    /* renamed from: a0 */
    public List<C9450s> m14901a0() {
        return this.f24939p;
    }

    /* renamed from: b0 */
    public C9439q m14900b0() {
        return this.f24940q;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24947x;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24936m & 1) == 1) {
            i = C12181f.m5892o(1, this.f24937n) + 0;
        } else {
            i = 0;
        }
        if ((this.f24936m & 2) == 2) {
            i += C12181f.m5892o(2, this.f24938o);
        }
        for (int i3 = 0; i3 < this.f24939p.size(); i3++) {
            i += C12181f.m5884s(3, this.f24939p.get(i3));
        }
        if ((this.f24936m & 4) == 4) {
            i += C12181f.m5884s(4, this.f24940q);
        }
        if ((this.f24936m & 8) == 8) {
            i += C12181f.m5892o(5, this.f24941r);
        }
        if ((this.f24936m & 16) == 16) {
            i += C12181f.m5884s(6, this.f24942s);
        }
        if ((this.f24936m & 32) == 32) {
            i += C12181f.m5892o(7, this.f24943t);
        }
        for (int i4 = 0; i4 < this.f24944u.size(); i4++) {
            i += C12181f.m5884s(8, this.f24944u.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f24945v.size(); i6++) {
            i5 += C12181f.m5890p(this.f24945v.get(i6).intValue());
        }
        int size = i + i5 + (m14898d0().size() * 2) + m5819u() + this.f24935l.size();
        this.f24947x = size;
        return size;
    }

    /* renamed from: c0 */
    public int m14899c0() {
        return this.f24941r;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        if ((this.f24936m & 1) == 1) {
            c12181f.m5919a0(1, this.f24937n);
        }
        if ((this.f24936m & 2) == 2) {
            c12181f.m5919a0(2, this.f24938o);
        }
        for (int i = 0; i < this.f24939p.size(); i++) {
            c12181f.m5913d0(3, this.f24939p.get(i));
        }
        if ((this.f24936m & 4) == 4) {
            c12181f.m5913d0(4, this.f24940q);
        }
        if ((this.f24936m & 8) == 8) {
            c12181f.m5919a0(5, this.f24941r);
        }
        if ((this.f24936m & 16) == 16) {
            c12181f.m5913d0(6, this.f24942s);
        }
        if ((this.f24936m & 32) == 32) {
            c12181f.m5919a0(7, this.f24943t);
        }
        for (int i2 = 0; i2 < this.f24944u.size(); i2++) {
            c12181f.m5913d0(8, this.f24944u.get(i2));
        }
        for (int i3 = 0; i3 < this.f24945v.size(); i3++) {
            c12181f.m5919a0(31, this.f24945v.get(i3).intValue());
        }
        m5814z.m5813a(ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, c12181f);
        c12181f.m5903i0(this.f24935l);
    }

    /* renamed from: d0 */
    public List<Integer> m14898d0() {
        return this.f24945v;
    }

    /* renamed from: e0 */
    public boolean m14897e0() {
        return (this.f24936m & 16) == 16;
    }

    /* renamed from: f0 */
    public boolean m14896f0() {
        return (this.f24936m & 32) == 32;
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9447r> mo5764g() {
        return f24934z;
    }

    /* renamed from: g0 */
    public boolean m14895g0() {
        return (this.f24936m & 1) == 1;
    }

    /* renamed from: h0 */
    public boolean m14894h0() {
        return (this.f24936m & 2) == 2;
    }

    /* renamed from: i0 */
    public boolean m14893i0() {
        return (this.f24936m & 4) == 4;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24946w;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m14894h0()) {
            this.f24946w = (byte) 0;
            return false;
        }
        for (int i = 0; i < m14902Z(); i++) {
            if (!m14903Y(i).mo5761j()) {
                this.f24946w = (byte) 0;
                return false;
            }
        }
        if (m14893i0() && !m14900b0().mo5761j()) {
            this.f24946w = (byte) 0;
            return false;
        } else if (m14897e0() && !m14907U().mo5761j()) {
            this.f24946w = (byte) 0;
            return false;
        } else {
            for (int i2 = 0; i2 < m14911Q(); i2++) {
                if (!m14912P(i2).mo5761j()) {
                    this.f24946w = (byte) 0;
                    return false;
                }
            }
            if (!m5820t()) {
                this.f24946w = (byte) 0;
                return false;
            }
            this.f24946w = (byte) 1;
            return true;
        }
    }

    /* renamed from: j0 */
    public boolean m14892j0() {
        return (this.f24936m & 8) == 8;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: n0 */
    public C9449b mo5765e() {
        return m14890l0();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: p0 */
    public C9449b mo5768b() {
        return m14889m0(this);
    }

    private C9447r(AbstractC12188i.AbstractC12191c<C9447r, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f24946w = (byte) -1;
        this.f24947x = -1;
        this.f24935l = abstractC12191c.m5831n();
    }

    private C9447r(boolean z) {
        this.f24946w = (byte) -1;
        this.f24947x = -1;
        this.f24935l = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C9447r(C12180e c12180e, C12183g c12183g) {
        C9439q.C9446c mo5768b;
        this.f24946w = (byte) -1;
        this.f24947x = -1;
        m14891k0();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            ?? r5 = 128;
            if (!z) {
                try {
                    try {
                        try {
                            int m5982K = c12180e.m5982K();
                            switch (m5982K) {
                                case 0:
                                    break;
                                case 8:
                                    this.f24936m |= 1;
                                    this.f24937n = c12180e.m5954s();
                                    continue;
                                case 16:
                                    this.f24936m |= 2;
                                    this.f24938o = c12180e.m5954s();
                                    continue;
                                case 26:
                                    if (!(z2 & true)) {
                                        this.f24939p = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f24939p.add(c12180e.m5952u(C9450s.f24959x, c12183g));
                                    continue;
                                case 34:
                                    mo5768b = (this.f24936m & 4) == 4 ? this.f24940q.mo5768b() : null;
                                    C9439q c9439q = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                                    this.f24940q = c9439q;
                                    if (mo5768b != null) {
                                        mo5768b.mo5830p(c9439q);
                                        this.f24940q = mo5768b.m14929x();
                                    }
                                    this.f24936m |= 4;
                                    continue;
                                case 40:
                                    this.f24936m |= 8;
                                    this.f24941r = c12180e.m5954s();
                                    continue;
                                case 50:
                                    mo5768b = (this.f24936m & 16) == 16 ? this.f24942s.mo5768b() : null;
                                    C9439q c9439q2 = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                                    this.f24942s = c9439q2;
                                    if (mo5768b != null) {
                                        mo5768b.mo5830p(c9439q2);
                                        this.f24942s = mo5768b.m14929x();
                                    }
                                    this.f24936m |= 16;
                                    continue;
                                case 56:
                                    this.f24936m |= 32;
                                    this.f24943t = c12180e.m5954s();
                                    continue;
                                case 66:
                                    if (!(z2 & true)) {
                                        this.f24944u = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f24944u.add(c12180e.m5952u(C9375b.f24504r, c12183g));
                                    continue;
                                case 248:
                                    if (!(z2 & true)) {
                                        this.f24945v = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f24945v.add(Integer.valueOf(c12180e.m5954s()));
                                    continue;
                                case ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                    int m5963j = c12180e.m5963j(c12180e.m5992A());
                                    if (!(z2 & true) && c12180e.m5968e() > 0) {
                                        this.f24945v = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (c12180e.m5968e() > 0) {
                                        this.f24945v.add(Integer.valueOf(c12180e.m5954s()));
                                    }
                                    c12180e.m5964i(m5963j);
                                    continue;
                                    break;
                                default:
                                    r5 = mo5822q(c12180e, m5937J, c12183g, m5982K);
                                    if (r5 == 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            z = true;
                        } catch (C12199k e) {
                            throw e.m5788i(this);
                        }
                    } catch (IOException e2) {
                        throw new C12199k(e2.getMessage()).m5788i(this);
                    }
                } catch (Throwable th2) {
                    if (z2 & true) {
                        this.f24939p = Collections.unmodifiableList(this.f24939p);
                    }
                    if ((z2 & true) == r5) {
                        this.f24944u = Collections.unmodifiableList(this.f24944u);
                    }
                    if (z2 & true) {
                        this.f24945v = Collections.unmodifiableList(this.f24945v);
                    }
                    try {
                        m5937J.m5938I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f24935l = m5997w.m5993j();
                        throw th3;
                    }
                    this.f24935l = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            } else {
                if (z2 & true) {
                    this.f24939p = Collections.unmodifiableList(this.f24939p);
                }
                if (z2 & true) {
                    this.f24944u = Collections.unmodifiableList(this.f24944u);
                }
                if (z2 & true) {
                    this.f24945v = Collections.unmodifiableList(this.f24945v);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f24935l = m5997w.m5993j();
                    throw th4;
                }
                this.f24935l = m5997w.m5993j();
                mo5823n();
                return;
            }
        }
    }
}
