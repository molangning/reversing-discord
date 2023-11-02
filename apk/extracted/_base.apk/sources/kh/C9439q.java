package kh;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p326rh.AbstractC12170a;
import p326rh.AbstractC12173b;
import p326rh.AbstractC12177d;
import p326rh.AbstractC12188i;
import p326rh.C12180e;
import p326rh.C12181f;
import p326rh.C12183g;
import p326rh.C12196j;
import p326rh.C12199k;
import p326rh.InterfaceC12212r;
import p326rh.InterfaceC12213s;

/* renamed from: kh.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9439q extends AbstractC12188i.AbstractC12192d<C9439q> {

    /* renamed from: D */
    private static final C9439q f24878D;

    /* renamed from: E */
    public static InterfaceC12213s<C9439q> f24879E = new C9440a();

    /* renamed from: A */
    private int f24880A;

    /* renamed from: B */
    private byte f24881B;

    /* renamed from: C */
    private int f24882C;

    /* renamed from: l */
    private final AbstractC12177d f24883l;

    /* renamed from: m */
    private int f24884m;

    /* renamed from: n */
    private List<C9441b> f24885n;

    /* renamed from: o */
    private boolean f24886o;

    /* renamed from: p */
    private int f24887p;

    /* renamed from: q */
    private C9439q f24888q;

    /* renamed from: r */
    private int f24889r;

    /* renamed from: s */
    private int f24890s;

    /* renamed from: t */
    private int f24891t;

    /* renamed from: u */
    private int f24892u;

    /* renamed from: v */
    private int f24893v;

    /* renamed from: w */
    private C9439q f24894w;

    /* renamed from: x */
    private int f24895x;

    /* renamed from: y */
    private C9439q f24896y;

    /* renamed from: z */
    private int f24897z;

    /* renamed from: kh.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9440a extends AbstractC12173b<C9439q> {
        C9440a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9439q mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9439q(c12180e, c12183g);
        }
    }

    /* renamed from: kh.q$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9446c extends AbstractC12188i.AbstractC12191c<C9439q, C9446c> {

        /* renamed from: A */
        private int f24918A;

        /* renamed from: m */
        private int f24919m;

        /* renamed from: o */
        private boolean f24921o;

        /* renamed from: p */
        private int f24922p;

        /* renamed from: r */
        private int f24924r;

        /* renamed from: s */
        private int f24925s;

        /* renamed from: t */
        private int f24926t;

        /* renamed from: u */
        private int f24927u;

        /* renamed from: v */
        private int f24928v;

        /* renamed from: x */
        private int f24930x;

        /* renamed from: z */
        private int f24932z;

        /* renamed from: n */
        private List<C9441b> f24920n = Collections.emptyList();

        /* renamed from: q */
        private C9439q f24923q = C9439q.m15008Y();

        /* renamed from: w */
        private C9439q f24929w = C9439q.m15008Y();

        /* renamed from: y */
        private C9439q f24931y = C9439q.m15008Y();

        private C9446c() {
            m14947B();
        }

        /* renamed from: A */
        private void m14948A() {
            if ((this.f24919m & 1) != 1) {
                this.f24920n = new ArrayList(this.f24920n);
                this.f24919m |= 1;
            }
        }

        /* renamed from: B */
        private void m14947B() {
        }

        /* renamed from: v */
        static /* synthetic */ C9446c m14931v() {
            return m14927z();
        }

        /* renamed from: z */
        private static C9446c m14927z() {
            return new C9446c();
        }

        /* renamed from: C */
        public C9446c m14946C(C9439q c9439q) {
            if ((this.f24919m & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048 && this.f24931y != C9439q.m15008Y()) {
                this.f24931y = C9439q.m14981z0(this.f24931y).mo5830p(c9439q).m14929x();
            } else {
                this.f24931y = c9439q;
            }
            this.f24919m |= RecyclerView.ItemAnimator.FLAG_MOVED;
            return this;
        }

        /* renamed from: D */
        public C9446c m14945D(C9439q c9439q) {
            if ((this.f24919m & 8) == 8 && this.f24923q != C9439q.m15008Y()) {
                this.f24923q = C9439q.m14981z0(this.f24923q).mo5830p(c9439q).m14929x();
            } else {
                this.f24923q = c9439q;
            }
            this.f24919m |= 8;
            return this;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: E */
        public C9446c mo5830p(C9439q c9439q) {
            if (c9439q == C9439q.m15008Y()) {
                return this;
            }
            if (!c9439q.f24885n.isEmpty()) {
                if (this.f24920n.isEmpty()) {
                    this.f24920n = c9439q.f24885n;
                    this.f24919m &= -2;
                } else {
                    m14948A();
                    this.f24920n.addAll(c9439q.f24885n);
                }
            }
            if (c9439q.m14989r0()) {
                m14936M(c9439q.m15002e0());
            }
            if (c9439q.m14992o0()) {
                m14938K(c9439q.m15005b0());
            }
            if (c9439q.m14991p0()) {
                m14945D(c9439q.m15004c0());
            }
            if (c9439q.m14990q0()) {
                m14937L(c9439q.m15003d0());
            }
            if (c9439q.m14994m0()) {
                m14940I(c9439q.m15009X());
            }
            if (c9439q.m14985v0()) {
                m14933P(c9439q.m14998i0());
            }
            if (c9439q.m14984w0()) {
                m14932Q(c9439q.m14997j0());
            }
            if (c9439q.m14986u0()) {
                m14934O(c9439q.m14999h0());
            }
            if (c9439q.m14988s0()) {
                m14942G(c9439q.m15001f0());
            }
            if (c9439q.m14987t0()) {
                m14935N(c9439q.m15000g0());
            }
            if (c9439q.m14996k0()) {
                m14946C(c9439q.m15014S());
            }
            if (c9439q.m14995l0()) {
                m14941H(c9439q.m15013T());
            }
            if (c9439q.m14993n0()) {
                m14939J(c9439q.m15006a0());
            }
            m5825u(c9439q);
            m5829q(m5831n().m6003d(c9439q.f24883l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9439q.C9446c mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.q> r1 = kh.C9439q.f24879E     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.q r3 = (kh.C9439q) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.q r4 = (kh.C9439q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9439q.C9446c.mo6018k(rh.e, rh.g):kh.q$c");
        }

        /* renamed from: G */
        public C9446c m14942G(C9439q c9439q) {
            if ((this.f24919m & 512) == 512 && this.f24929w != C9439q.m15008Y()) {
                this.f24929w = C9439q.m14981z0(this.f24929w).mo5830p(c9439q).m14929x();
            } else {
                this.f24929w = c9439q;
            }
            this.f24919m |= 512;
            return this;
        }

        /* renamed from: H */
        public C9446c m14941H(int i) {
            this.f24919m |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f24932z = i;
            return this;
        }

        /* renamed from: I */
        public C9446c m14940I(int i) {
            this.f24919m |= 32;
            this.f24925s = i;
            return this;
        }

        /* renamed from: J */
        public C9446c m14939J(int i) {
            this.f24919m |= 8192;
            this.f24918A = i;
            return this;
        }

        /* renamed from: K */
        public C9446c m14938K(int i) {
            this.f24919m |= 4;
            this.f24922p = i;
            return this;
        }

        /* renamed from: L */
        public C9446c m14937L(int i) {
            this.f24919m |= 16;
            this.f24924r = i;
            return this;
        }

        /* renamed from: M */
        public C9446c m14936M(boolean z) {
            this.f24919m |= 2;
            this.f24921o = z;
            return this;
        }

        /* renamed from: N */
        public C9446c m14935N(int i) {
            this.f24919m |= 1024;
            this.f24930x = i;
            return this;
        }

        /* renamed from: O */
        public C9446c m14934O(int i) {
            this.f24919m |= 256;
            this.f24928v = i;
            return this;
        }

        /* renamed from: P */
        public C9446c m14933P(int i) {
            this.f24919m |= 64;
            this.f24926t = i;
            return this;
        }

        /* renamed from: Q */
        public C9446c m14932Q(int i) {
            this.f24919m |= 128;
            this.f24927u = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9439q build() {
            C9439q m14929x = m14929x();
            if (m14929x.mo5761j()) {
                return m14929x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m14929x);
        }

        /* renamed from: x */
        public C9439q m14929x() {
            C9439q c9439q = new C9439q(this);
            int i = this.f24919m;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f24920n = Collections.unmodifiableList(this.f24920n);
                this.f24919m &= -2;
            }
            c9439q.f24885n = this.f24920n;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            c9439q.f24886o = this.f24921o;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            c9439q.f24887p = this.f24922p;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c9439q.f24888q = this.f24923q;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            c9439q.f24889r = this.f24924r;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            c9439q.f24890s = this.f24925s;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c9439q.f24891t = this.f24926t;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            c9439q.f24892u = this.f24927u;
            if ((i & 256) == 256) {
                i2 |= 128;
            }
            c9439q.f24893v = this.f24928v;
            if ((i & 512) == 512) {
                i2 |= 256;
            }
            c9439q.f24894w = this.f24929w;
            if ((i & 1024) == 1024) {
                i2 |= 512;
            }
            c9439q.f24895x = this.f24930x;
            if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
                i2 |= 1024;
            }
            c9439q.f24896y = this.f24931y;
            if ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                i2 |= RecyclerView.ItemAnimator.FLAG_MOVED;
            }
            c9439q.f24897z = this.f24932z;
            if ((i & 8192) == 8192) {
                i2 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            c9439q.f24880A = this.f24918A;
            c9439q.f24884m = i2;
            return c9439q;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9446c mo5832m() {
            return m14927z().mo5830p(m14929x());
        }
    }

    static {
        C9439q c9439q = new C9439q(true);
        f24878D = c9439q;
        c9439q.m14983x0();
    }

    /* renamed from: Y */
    public static C9439q m15008Y() {
        return f24878D;
    }

    /* renamed from: x0 */
    private void m14983x0() {
        this.f24885n = Collections.emptyList();
        this.f24886o = false;
        this.f24887p = 0;
        this.f24888q = m15008Y();
        this.f24889r = 0;
        this.f24890s = 0;
        this.f24891t = 0;
        this.f24892u = 0;
        this.f24893v = 0;
        this.f24894w = m15008Y();
        this.f24895x = 0;
        this.f24896y = m15008Y();
        this.f24897z = 0;
        this.f24880A = 0;
    }

    /* renamed from: y0 */
    public static C9446c m14982y0() {
        return C9446c.m14931v();
    }

    /* renamed from: z0 */
    public static C9446c m14981z0(C9439q c9439q) {
        return m14982y0().mo5830p(c9439q);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: A0 */
    public C9446c mo5765e() {
        return m14982y0();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: B0 */
    public C9446c mo5768b() {
        return m14981z0(this);
    }

    /* renamed from: S */
    public C9439q m15014S() {
        return this.f24896y;
    }

    /* renamed from: T */
    public int m15013T() {
        return this.f24897z;
    }

    /* renamed from: U */
    public C9441b m15012U(int i) {
        return this.f24885n.get(i);
    }

    /* renamed from: V */
    public int m15011V() {
        return this.f24885n.size();
    }

    /* renamed from: W */
    public List<C9441b> m15010W() {
        return this.f24885n;
    }

    /* renamed from: X */
    public int m15009X() {
        return this.f24890s;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: Z */
    public C9439q mo5762f() {
        return f24878D;
    }

    /* renamed from: a0 */
    public int m15006a0() {
        return this.f24880A;
    }

    /* renamed from: b0 */
    public int m15005b0() {
        return this.f24887p;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24882C;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24884m & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            i = C12181f.m5892o(1, this.f24880A) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.f24885n.size(); i3++) {
            i += C12181f.m5884s(2, this.f24885n.get(i3));
        }
        if ((this.f24884m & 1) == 1) {
            i += C12181f.m5920a(3, this.f24886o);
        }
        if ((this.f24884m & 2) == 2) {
            i += C12181f.m5892o(4, this.f24887p);
        }
        if ((this.f24884m & 4) == 4) {
            i += C12181f.m5884s(5, this.f24888q);
        }
        if ((this.f24884m & 16) == 16) {
            i += C12181f.m5892o(6, this.f24890s);
        }
        if ((this.f24884m & 32) == 32) {
            i += C12181f.m5892o(7, this.f24891t);
        }
        if ((this.f24884m & 8) == 8) {
            i += C12181f.m5892o(8, this.f24889r);
        }
        if ((this.f24884m & 64) == 64) {
            i += C12181f.m5892o(9, this.f24892u);
        }
        if ((this.f24884m & 256) == 256) {
            i += C12181f.m5884s(10, this.f24894w);
        }
        if ((this.f24884m & 512) == 512) {
            i += C12181f.m5892o(11, this.f24895x);
        }
        if ((this.f24884m & 128) == 128) {
            i += C12181f.m5892o(12, this.f24893v);
        }
        if ((this.f24884m & 1024) == 1024) {
            i += C12181f.m5884s(13, this.f24896y);
        }
        if ((this.f24884m & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            i += C12181f.m5892o(14, this.f24897z);
        }
        int m5819u = i + m5819u() + this.f24883l.size();
        this.f24882C = m5819u;
        return m5819u;
    }

    /* renamed from: c0 */
    public C9439q m15004c0() {
        return this.f24888q;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        if ((this.f24884m & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            c12181f.m5919a0(1, this.f24880A);
        }
        for (int i = 0; i < this.f24885n.size(); i++) {
            c12181f.m5913d0(2, this.f24885n.get(i));
        }
        if ((this.f24884m & 1) == 1) {
            c12181f.m5935L(3, this.f24886o);
        }
        if ((this.f24884m & 2) == 2) {
            c12181f.m5919a0(4, this.f24887p);
        }
        if ((this.f24884m & 4) == 4) {
            c12181f.m5913d0(5, this.f24888q);
        }
        if ((this.f24884m & 16) == 16) {
            c12181f.m5919a0(6, this.f24890s);
        }
        if ((this.f24884m & 32) == 32) {
            c12181f.m5919a0(7, this.f24891t);
        }
        if ((this.f24884m & 8) == 8) {
            c12181f.m5919a0(8, this.f24889r);
        }
        if ((this.f24884m & 64) == 64) {
            c12181f.m5919a0(9, this.f24892u);
        }
        if ((this.f24884m & 256) == 256) {
            c12181f.m5913d0(10, this.f24894w);
        }
        if ((this.f24884m & 512) == 512) {
            c12181f.m5919a0(11, this.f24895x);
        }
        if ((this.f24884m & 128) == 128) {
            c12181f.m5919a0(12, this.f24893v);
        }
        if ((this.f24884m & 1024) == 1024) {
            c12181f.m5913d0(13, this.f24896y);
        }
        if ((this.f24884m & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            c12181f.m5919a0(14, this.f24897z);
        }
        m5814z.m5813a(ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, c12181f);
        c12181f.m5903i0(this.f24883l);
    }

    /* renamed from: d0 */
    public int m15003d0() {
        return this.f24889r;
    }

    /* renamed from: e0 */
    public boolean m15002e0() {
        return this.f24886o;
    }

    /* renamed from: f0 */
    public C9439q m15001f0() {
        return this.f24894w;
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9439q> mo5764g() {
        return f24879E;
    }

    /* renamed from: g0 */
    public int m15000g0() {
        return this.f24895x;
    }

    /* renamed from: h0 */
    public int m14999h0() {
        return this.f24893v;
    }

    /* renamed from: i0 */
    public int m14998i0() {
        return this.f24891t;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24881B;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m15011V(); i++) {
            if (!m15012U(i).mo5761j()) {
                this.f24881B = (byte) 0;
                return false;
            }
        }
        if (m14991p0() && !m15004c0().mo5761j()) {
            this.f24881B = (byte) 0;
            return false;
        } else if (m14988s0() && !m15001f0().mo5761j()) {
            this.f24881B = (byte) 0;
            return false;
        } else if (m14996k0() && !m15014S().mo5761j()) {
            this.f24881B = (byte) 0;
            return false;
        } else if (!m5820t()) {
            this.f24881B = (byte) 0;
            return false;
        } else {
            this.f24881B = (byte) 1;
            return true;
        }
    }

    /* renamed from: j0 */
    public int m14997j0() {
        return this.f24892u;
    }

    /* renamed from: k0 */
    public boolean m14996k0() {
        return (this.f24884m & 1024) == 1024;
    }

    /* renamed from: l0 */
    public boolean m14995l0() {
        return (this.f24884m & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048;
    }

    /* renamed from: m0 */
    public boolean m14994m0() {
        return (this.f24884m & 16) == 16;
    }

    /* renamed from: n0 */
    public boolean m14993n0() {
        return (this.f24884m & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096;
    }

    /* renamed from: o0 */
    public boolean m14992o0() {
        return (this.f24884m & 2) == 2;
    }

    /* renamed from: p0 */
    public boolean m14991p0() {
        return (this.f24884m & 4) == 4;
    }

    /* renamed from: q0 */
    public boolean m14990q0() {
        return (this.f24884m & 8) == 8;
    }

    /* renamed from: r0 */
    public boolean m14989r0() {
        return (this.f24884m & 1) == 1;
    }

    /* renamed from: s0 */
    public boolean m14988s0() {
        return (this.f24884m & 256) == 256;
    }

    /* renamed from: t0 */
    public boolean m14987t0() {
        return (this.f24884m & 512) == 512;
    }

    /* renamed from: u0 */
    public boolean m14986u0() {
        return (this.f24884m & 128) == 128;
    }

    /* renamed from: v0 */
    public boolean m14985v0() {
        return (this.f24884m & 32) == 32;
    }

    /* renamed from: w0 */
    public boolean m14984w0() {
        return (this.f24884m & 64) == 64;
    }

    /* renamed from: kh.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9441b extends AbstractC12188i implements InterfaceC12212r {

        /* renamed from: r */
        private static final C9441b f24898r;

        /* renamed from: s */
        public static InterfaceC12213s<C9441b> f24899s = new C9442a();

        /* renamed from: k */
        private final AbstractC12177d f24900k;

        /* renamed from: l */
        private int f24901l;

        /* renamed from: m */
        private EnumC9444c f24902m;

        /* renamed from: n */
        private C9439q f24903n;

        /* renamed from: o */
        private int f24904o;

        /* renamed from: p */
        private byte f24905p;

        /* renamed from: q */
        private int f24906q;

        /* renamed from: kh.q$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C9442a extends AbstractC12173b<C9441b> {
            C9442a() {
            }

            @Override // p326rh.InterfaceC12213s
            /* renamed from: m */
            public C9441b mo5759b(C12180e c12180e, C12183g c12183g) {
                return new C9441b(c12180e, c12183g);
            }
        }

        /* renamed from: kh.q$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9443b extends AbstractC12188i.AbstractC12190b<C9441b, C9443b> implements InterfaceC12212r {

            /* renamed from: k */
            private int f24907k;

            /* renamed from: l */
            private EnumC9444c f24908l = EnumC9444c.INV;

            /* renamed from: m */
            private C9439q f24909m = C9439q.m15008Y();

            /* renamed from: n */
            private int f24910n;

            private C9443b() {
                m14954w();
            }

            /* renamed from: r */
            static /* synthetic */ C9443b m14959r() {
                return m14955v();
            }

            /* renamed from: v */
            private static C9443b m14955v() {
                return new C9443b();
            }

            /* renamed from: w */
            private void m14954w() {
            }

            /* renamed from: A */
            public C9443b m14961A(EnumC9444c enumC9444c) {
                enumC9444c.getClass();
                this.f24907k |= 1;
                this.f24908l = enumC9444c;
                return this;
            }

            /* renamed from: B */
            public C9443b m14960B(int i) {
                this.f24907k |= 4;
                this.f24910n = i;
                return this;
            }

            @Override // p326rh.InterfaceC12210q.InterfaceC12211a
            /* renamed from: s */
            public C9441b build() {
                C9441b m14957t = m14957t();
                if (m14957t.mo5761j()) {
                    return m14957t;
                }
                throw AbstractC12170a.AbstractC12171a.m6017l(m14957t);
            }

            /* renamed from: t */
            public C9441b m14957t() {
                C9441b c9441b = new C9441b(this);
                int i = this.f24907k;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                c9441b.f24902m = this.f24908l;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                c9441b.f24903n = this.f24909m;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                c9441b.f24904o = this.f24910n;
                c9441b.f24901l = i2;
                return c9441b;
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: u */
            public C9443b mo5832m() {
                return m14955v().mo5830p(m14957t());
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: x */
            public C9443b mo5830p(C9441b c9441b) {
                if (c9441b == C9441b.m14965x()) {
                    return this;
                }
                if (c9441b.m14978B()) {
                    m14961A(c9441b.m14964y());
                }
                if (c9441b.m14977C()) {
                    m14951z(c9441b.m14963z());
                }
                if (c9441b.m14976D()) {
                    m14960B(c9441b.m14979A());
                }
                m5829q(m5831n().m6003d(c9441b.f24900k));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // p326rh.AbstractC12170a.AbstractC12171a
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kh.C9439q.C9441b.C9443b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    rh.s<kh.q$b> r1 = kh.C9439q.C9441b.f24899s     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    kh.q$b r3 = (kh.C9439q.C9441b) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                    kh.q$b r4 = (kh.C9439q.C9441b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kh.C9439q.C9441b.C9443b.mo6018k(rh.e, rh.g):kh.q$b$b");
            }

            /* renamed from: z */
            public C9443b m14951z(C9439q c9439q) {
                if ((this.f24907k & 2) == 2 && this.f24909m != C9439q.m15008Y()) {
                    this.f24909m = C9439q.m14981z0(this.f24909m).mo5830p(c9439q).m14929x();
                } else {
                    this.f24909m = c9439q;
                }
                this.f24907k |= 2;
                return this;
            }
        }

        /* renamed from: kh.q$b$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public enum EnumC9444c implements C12196j.InterfaceC12197a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            

            /* renamed from: o */
            private static C12196j.InterfaceC12198b<EnumC9444c> f24915o = new C9445a();

            /* renamed from: j */
            private final int f24917j;

            /* renamed from: kh.q$b$c$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
            static class C9445a implements C12196j.InterfaceC12198b<EnumC9444c> {
                C9445a() {
                }

                @Override // p326rh.C12196j.InterfaceC12198b
                /* renamed from: b */
                public EnumC9444c mo5797a(int i) {
                    return EnumC9444c.m14950a(i);
                }
            }

            EnumC9444c(int i, int i2) {
                this.f24917j = i2;
            }

            /* renamed from: a */
            public static EnumC9444c m14950a(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return STAR;
                        }
                        return INV;
                    }
                    return OUT;
                }
                return IN;
            }

            @Override // p326rh.C12196j.InterfaceC12197a
            public final int getNumber() {
                return this.f24917j;
            }
        }

        static {
            C9441b c9441b = new C9441b(true);
            f24898r = c9441b;
            c9441b.m14975E();
        }

        /* renamed from: E */
        private void m14975E() {
            this.f24902m = EnumC9444c.INV;
            this.f24903n = C9439q.m15008Y();
            this.f24904o = 0;
        }

        /* renamed from: F */
        public static C9443b m14974F() {
            return C9443b.m14959r();
        }

        /* renamed from: G */
        public static C9443b m14973G(C9441b c9441b) {
            return m14974F().mo5830p(c9441b);
        }

        /* renamed from: x */
        public static C9441b m14965x() {
            return f24898r;
        }

        /* renamed from: A */
        public int m14979A() {
            return this.f24904o;
        }

        /* renamed from: B */
        public boolean m14978B() {
            return (this.f24901l & 1) == 1;
        }

        /* renamed from: C */
        public boolean m14977C() {
            return (this.f24901l & 2) == 2;
        }

        /* renamed from: D */
        public boolean m14976D() {
            return (this.f24901l & 4) == 4;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: H */
        public C9443b mo5765e() {
            return m14974F();
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: I */
        public C9443b mo5768b() {
            return m14973G(this);
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: c */
        public int mo5767c() {
            int i = this.f24906q;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f24901l & 1) == 1) {
                i2 = 0 + C12181f.m5906h(1, this.f24902m.getNumber());
            }
            if ((this.f24901l & 2) == 2) {
                i2 += C12181f.m5884s(2, this.f24903n);
            }
            if ((this.f24901l & 4) == 4) {
                i2 += C12181f.m5892o(3, this.f24904o);
            }
            int size = i2 + this.f24900k.size();
            this.f24906q = size;
            return size;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: d */
        public void mo5766d(C12181f c12181f) {
            mo5767c();
            if ((this.f24901l & 1) == 1) {
                c12181f.m5928S(1, this.f24902m.getNumber());
            }
            if ((this.f24901l & 2) == 2) {
                c12181f.m5913d0(2, this.f24903n);
            }
            if ((this.f24901l & 4) == 4) {
                c12181f.m5919a0(3, this.f24904o);
            }
            c12181f.m5903i0(this.f24900k);
        }

        @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
        /* renamed from: g */
        public InterfaceC12213s<C9441b> mo5764g() {
            return f24899s;
        }

        @Override // p326rh.InterfaceC12212r
        /* renamed from: j */
        public final boolean mo5761j() {
            byte b = this.f24905p;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (m14977C() && !m14963z().mo5761j()) {
                this.f24905p = (byte) 0;
                return false;
            }
            this.f24905p = (byte) 1;
            return true;
        }

        /* renamed from: y */
        public EnumC9444c m14964y() {
            return this.f24902m;
        }

        /* renamed from: z */
        public C9439q m14963z() {
            return this.f24903n;
        }

        private C9441b(AbstractC12188i.AbstractC12190b abstractC12190b) {
            super(abstractC12190b);
            this.f24905p = (byte) -1;
            this.f24906q = -1;
            this.f24900k = abstractC12190b.m5831n();
        }

        private C9441b(boolean z) {
            this.f24905p = (byte) -1;
            this.f24906q = -1;
            this.f24900k = AbstractC12177d.f31693j;
        }

        private C9441b(C12180e c12180e, C12183g c12183g) {
            this.f24905p = (byte) -1;
            this.f24906q = -1;
            m14975E();
            AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
            C12181f m5937J = C12181f.m5937J(m5997w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int m5982K = c12180e.m5982K();
                            if (m5982K != 0) {
                                if (m5982K == 8) {
                                    int m5959n = c12180e.m5959n();
                                    EnumC9444c m14950a = EnumC9444c.m14950a(m5959n);
                                    if (m14950a == null) {
                                        m5937J.m5891o0(m5982K);
                                        m5937J.m5891o0(m5959n);
                                    } else {
                                        this.f24901l |= 1;
                                        this.f24902m = m14950a;
                                    }
                                } else if (m5982K == 18) {
                                    C9446c mo5768b = (this.f24901l & 2) == 2 ? this.f24903n.mo5768b() : null;
                                    C9439q c9439q = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                                    this.f24903n = c9439q;
                                    if (mo5768b != null) {
                                        mo5768b.mo5830p(c9439q);
                                        this.f24903n = mo5768b.m14929x();
                                    }
                                    this.f24901l |= 2;
                                } else if (m5982K != 24) {
                                    if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                    }
                                } else {
                                    this.f24901l |= 4;
                                    this.f24904o = c12180e.m5954s();
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
                    try {
                        m5937J.m5938I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f24900k = m5997w.m5993j();
                        throw th3;
                    }
                    this.f24900k = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            }
            try {
                m5937J.m5938I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f24900k = m5997w.m5993j();
                throw th4;
            }
            this.f24900k = m5997w.m5993j();
            mo5823n();
        }
    }

    private C9439q(AbstractC12188i.AbstractC12191c<C9439q, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f24881B = (byte) -1;
        this.f24882C = -1;
        this.f24883l = abstractC12191c.m5831n();
    }

    private C9439q(boolean z) {
        this.f24881B = (byte) -1;
        this.f24882C = -1;
        this.f24883l = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9439q(C12180e c12180e, C12183g c12183g) {
        C9446c mo5768b;
        this.f24881B = (byte) -1;
        this.f24882C = -1;
        m14983x0();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int m5982K = c12180e.m5982K();
                    switch (m5982K) {
                        case 0:
                            break;
                        case 8:
                            this.f24884m |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                            this.f24880A = c12180e.m5954s();
                            continue;
                        case 18:
                            if (!(z2 & true)) {
                                this.f24885n = new ArrayList();
                                z2 |= true;
                            }
                            this.f24885n.add(c12180e.m5952u(C9441b.f24899s, c12183g));
                            continue;
                        case 24:
                            this.f24884m |= 1;
                            this.f24886o = c12180e.m5962k();
                            continue;
                        case 32:
                            this.f24884m |= 2;
                            this.f24887p = c12180e.m5954s();
                            continue;
                        case 42:
                            mo5768b = (this.f24884m & 4) == 4 ? this.f24888q.mo5768b() : null;
                            C9439q c9439q = (C9439q) c12180e.m5952u(f24879E, c12183g);
                            this.f24888q = c9439q;
                            if (mo5768b != null) {
                                mo5768b.mo5830p(c9439q);
                                this.f24888q = mo5768b.m14929x();
                            }
                            this.f24884m |= 4;
                            continue;
                        case 48:
                            this.f24884m |= 16;
                            this.f24890s = c12180e.m5954s();
                            continue;
                        case 56:
                            this.f24884m |= 32;
                            this.f24891t = c12180e.m5954s();
                            continue;
                        case 64:
                            this.f24884m |= 8;
                            this.f24889r = c12180e.m5954s();
                            continue;
                        case 72:
                            this.f24884m |= 64;
                            this.f24892u = c12180e.m5954s();
                            continue;
                        case 82:
                            mo5768b = (this.f24884m & 256) == 256 ? this.f24894w.mo5768b() : null;
                            C9439q c9439q2 = (C9439q) c12180e.m5952u(f24879E, c12183g);
                            this.f24894w = c9439q2;
                            if (mo5768b != null) {
                                mo5768b.mo5830p(c9439q2);
                                this.f24894w = mo5768b.m14929x();
                            }
                            this.f24884m |= 256;
                            continue;
                        case 88:
                            this.f24884m |= 512;
                            this.f24895x = c12180e.m5954s();
                            continue;
                        case 96:
                            this.f24884m |= 128;
                            this.f24893v = c12180e.m5954s();
                            continue;
                        case 106:
                            mo5768b = (this.f24884m & 1024) == 1024 ? this.f24896y.mo5768b() : null;
                            C9439q c9439q3 = (C9439q) c12180e.m5952u(f24879E, c12183g);
                            this.f24896y = c9439q3;
                            if (mo5768b != null) {
                                mo5768b.mo5830p(c9439q3);
                                this.f24896y = mo5768b.m14929x();
                            }
                            this.f24884m |= 1024;
                            continue;
                        case 112:
                            this.f24884m |= RecyclerView.ItemAnimator.FLAG_MOVED;
                            this.f24897z = c12180e.m5954s();
                            continue;
                        default:
                            if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                break;
                            } else {
                                continue;
                            }
                    }
                    z = true;
                } catch (C12199k e) {
                    throw e.m5788i(this);
                } catch (IOException e2) {
                    throw new C12199k(e2.getMessage()).m5788i(this);
                }
            } catch (Throwable th2) {
                if (z2 & true) {
                    this.f24885n = Collections.unmodifiableList(this.f24885n);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24883l = m5997w.m5993j();
                    throw th3;
                }
                this.f24883l = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f24885n = Collections.unmodifiableList(this.f24885n);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24883l = m5997w.m5993j();
            throw th4;
        }
        this.f24883l = m5997w.m5993j();
        mo5823n();
    }
}
