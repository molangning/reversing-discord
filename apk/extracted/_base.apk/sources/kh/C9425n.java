package kh;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kh.C9439q;
import kh.C9458u;
import p326rh.AbstractC12170a;
import p326rh.AbstractC12173b;
import p326rh.AbstractC12177d;
import p326rh.AbstractC12188i;
import p326rh.C12180e;
import p326rh.C12181f;
import p326rh.C12183g;
import p326rh.C12199k;
import p326rh.InterfaceC12213s;

/* renamed from: kh.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9425n extends AbstractC12188i.AbstractC12192d<C9425n> {

    /* renamed from: E */
    private static final C9425n f24807E;

    /* renamed from: F */
    public static InterfaceC12213s<C9425n> f24808F = new C9426a();

    /* renamed from: A */
    private int f24809A;

    /* renamed from: B */
    private List<Integer> f24810B;

    /* renamed from: C */
    private byte f24811C;

    /* renamed from: D */
    private int f24812D;

    /* renamed from: l */
    private final AbstractC12177d f24813l;

    /* renamed from: m */
    private int f24814m;

    /* renamed from: n */
    private int f24815n;

    /* renamed from: o */
    private int f24816o;

    /* renamed from: p */
    private int f24817p;

    /* renamed from: q */
    private C9439q f24818q;

    /* renamed from: r */
    private int f24819r;

    /* renamed from: s */
    private List<C9450s> f24820s;

    /* renamed from: t */
    private C9439q f24821t;

    /* renamed from: u */
    private int f24822u;

    /* renamed from: v */
    private List<C9439q> f24823v;

    /* renamed from: w */
    private List<Integer> f24824w;

    /* renamed from: x */
    private int f24825x;

    /* renamed from: y */
    private C9458u f24826y;

    /* renamed from: z */
    private int f24827z;

    /* renamed from: kh.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9426a extends AbstractC12173b<C9425n> {
        C9426a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9425n mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9425n(c12180e, c12183g);
        }
    }

    /* renamed from: kh.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9427b extends AbstractC12188i.AbstractC12191c<C9425n, C9427b> {

        /* renamed from: m */
        private int f24829m;

        /* renamed from: p */
        private int f24832p;

        /* renamed from: r */
        private int f24834r;

        /* renamed from: u */
        private int f24837u;

        /* renamed from: y */
        private int f24841y;

        /* renamed from: z */
        private int f24842z;

        /* renamed from: n */
        private int f24830n = 518;

        /* renamed from: o */
        private int f24831o = 2054;

        /* renamed from: q */
        private C9439q f24833q = C9439q.m15008Y();

        /* renamed from: s */
        private List<C9450s> f24835s = Collections.emptyList();

        /* renamed from: t */
        private C9439q f24836t = C9439q.m15008Y();

        /* renamed from: v */
        private List<C9439q> f24838v = Collections.emptyList();

        /* renamed from: w */
        private List<Integer> f24839w = Collections.emptyList();

        /* renamed from: x */
        private C9458u f24840x = C9458u.m14786J();

        /* renamed from: A */
        private List<Integer> f24828A = Collections.emptyList();

        private C9427b() {
            m15124E();
        }

        /* renamed from: A */
        private void m15128A() {
            if ((this.f24829m & 512) != 512) {
                this.f24839w = new ArrayList(this.f24839w);
                this.f24829m |= 512;
            }
        }

        /* renamed from: B */
        private void m15127B() {
            if ((this.f24829m & 256) != 256) {
                this.f24838v = new ArrayList(this.f24838v);
                this.f24829m |= 256;
            }
        }

        /* renamed from: C */
        private void m15126C() {
            if ((this.f24829m & 32) != 32) {
                this.f24835s = new ArrayList(this.f24835s);
                this.f24829m |= 32;
            }
        }

        /* renamed from: D */
        private void m15125D() {
            if ((this.f24829m & 8192) != 8192) {
                this.f24828A = new ArrayList(this.f24828A);
                this.f24829m |= 8192;
            }
        }

        /* renamed from: E */
        private void m15124E() {
        }

        /* renamed from: v */
        static /* synthetic */ C9427b m15111v() {
            return m15107z();
        }

        /* renamed from: z */
        private static C9427b m15107z() {
            return new C9427b();
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: F */
        public C9427b mo5830p(C9425n c9425n) {
            if (c9425n == C9425n.m15156Z()) {
                return this;
            }
            if (c9425n.m15140p0()) {
                m15118K(c9425n.m15154b0());
            }
            if (c9425n.m15137s0()) {
                m15115N(c9425n.m15151e0());
            }
            if (c9425n.m15138r0()) {
                m15116M(c9425n.m15152d0());
            }
            if (c9425n.m15134v0()) {
                m15120I(c9425n.m15148h0());
            }
            if (c9425n.m15133w0()) {
                m15113P(c9425n.m15147i0());
            }
            if (!c9425n.f24820s.isEmpty()) {
                if (this.f24835s.isEmpty()) {
                    this.f24835s = c9425n.f24820s;
                    this.f24829m &= -33;
                } else {
                    m15126C();
                    this.f24835s.addAll(c9425n.f24820s);
                }
            }
            if (c9425n.m15136t0()) {
                m15121H(c9425n.m15150f0());
            }
            if (c9425n.m15135u0()) {
                m15114O(c9425n.m15149g0());
            }
            if (!c9425n.f24823v.isEmpty()) {
                if (this.f24838v.isEmpty()) {
                    this.f24838v = c9425n.f24823v;
                    this.f24829m &= -257;
                } else {
                    m15127B();
                    this.f24838v.addAll(c9425n.f24823v);
                }
            }
            if (!c9425n.f24824w.isEmpty()) {
                if (this.f24839w.isEmpty()) {
                    this.f24839w = c9425n.f24824w;
                    this.f24829m &= -513;
                } else {
                    m15128A();
                    this.f24839w.addAll(c9425n.f24824w);
                }
            }
            if (c9425n.m15131y0()) {
                m15119J(c9425n.m15145k0());
            }
            if (c9425n.m15139q0()) {
                m15117L(c9425n.m15153c0());
            }
            if (c9425n.m15132x0()) {
                m15112Q(c9425n.m15146j0());
            }
            if (!c9425n.f24810B.isEmpty()) {
                if (this.f24828A.isEmpty()) {
                    this.f24828A = c9425n.f24810B;
                    this.f24829m &= -8193;
                } else {
                    m15125D();
                    this.f24828A.addAll(c9425n.f24810B);
                }
            }
            m5825u(c9425n);
            m5829q(m5831n().m6003d(c9425n.f24813l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: G */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9425n.C9427b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.n> r1 = kh.C9425n.f24808F     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.n r3 = (kh.C9425n) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.n r4 = (kh.C9425n) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9425n.C9427b.mo6018k(rh.e, rh.g):kh.n$b");
        }

        /* renamed from: H */
        public C9427b m15121H(C9439q c9439q) {
            if ((this.f24829m & 64) == 64 && this.f24836t != C9439q.m15008Y()) {
                this.f24836t = C9439q.m14981z0(this.f24836t).mo5830p(c9439q).m14929x();
            } else {
                this.f24836t = c9439q;
            }
            this.f24829m |= 64;
            return this;
        }

        /* renamed from: I */
        public C9427b m15120I(C9439q c9439q) {
            if ((this.f24829m & 8) == 8 && this.f24833q != C9439q.m15008Y()) {
                this.f24833q = C9439q.m14981z0(this.f24833q).mo5830p(c9439q).m14929x();
            } else {
                this.f24833q = c9439q;
            }
            this.f24829m |= 8;
            return this;
        }

        /* renamed from: J */
        public C9427b m15119J(C9458u c9458u) {
            if ((this.f24829m & 1024) == 1024 && this.f24840x != C9458u.m14786J()) {
                this.f24840x = C9458u.m14770Z(this.f24840x).mo5830p(c9458u).m14755x();
            } else {
                this.f24840x = c9458u;
            }
            this.f24829m |= 1024;
            return this;
        }

        /* renamed from: K */
        public C9427b m15118K(int i) {
            this.f24829m |= 1;
            this.f24830n = i;
            return this;
        }

        /* renamed from: L */
        public C9427b m15117L(int i) {
            this.f24829m |= RecyclerView.ItemAnimator.FLAG_MOVED;
            this.f24841y = i;
            return this;
        }

        /* renamed from: M */
        public C9427b m15116M(int i) {
            this.f24829m |= 4;
            this.f24832p = i;
            return this;
        }

        /* renamed from: N */
        public C9427b m15115N(int i) {
            this.f24829m |= 2;
            this.f24831o = i;
            return this;
        }

        /* renamed from: O */
        public C9427b m15114O(int i) {
            this.f24829m |= 128;
            this.f24837u = i;
            return this;
        }

        /* renamed from: P */
        public C9427b m15113P(int i) {
            this.f24829m |= 16;
            this.f24834r = i;
            return this;
        }

        /* renamed from: Q */
        public C9427b m15112Q(int i) {
            this.f24829m |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f24842z = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9425n build() {
            C9425n m15109x = m15109x();
            if (m15109x.mo5761j()) {
                return m15109x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15109x);
        }

        /* renamed from: x */
        public C9425n m15109x() {
            C9425n c9425n = new C9425n(this);
            int i = this.f24829m;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            c9425n.f24815n = this.f24830n;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c9425n.f24816o = this.f24831o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c9425n.f24817p = this.f24832p;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c9425n.f24818q = this.f24833q;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c9425n.f24819r = this.f24834r;
            if ((this.f24829m & 32) == 32) {
                this.f24835s = Collections.unmodifiableList(this.f24835s);
                this.f24829m &= -33;
            }
            c9425n.f24820s = this.f24835s;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c9425n.f24821t = this.f24836t;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            c9425n.f24822u = this.f24837u;
            if ((this.f24829m & 256) == 256) {
                this.f24838v = Collections.unmodifiableList(this.f24838v);
                this.f24829m &= -257;
            }
            c9425n.f24823v = this.f24838v;
            if ((this.f24829m & 512) == 512) {
                this.f24839w = Collections.unmodifiableList(this.f24839w);
                this.f24829m &= -513;
            }
            c9425n.f24824w = this.f24839w;
            if ((i & 1024) == 1024) {
                i2 |= 128;
            }
            c9425n.f24826y = this.f24840x;
            if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
                i2 |= 256;
            }
            c9425n.f24827z = this.f24841y;
            if ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                i2 |= 512;
            }
            c9425n.f24809A = this.f24842z;
            if ((this.f24829m & 8192) == 8192) {
                this.f24828A = Collections.unmodifiableList(this.f24828A);
                this.f24829m &= -8193;
            }
            c9425n.f24810B = this.f24828A;
            c9425n.f24814m = i2;
            return c9425n;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9427b mo5832m() {
            return m15107z().mo5830p(m15109x());
        }
    }

    static {
        C9425n c9425n = new C9425n(true);
        f24807E = c9425n;
        c9425n.m15130z0();
    }

    /* renamed from: A0 */
    public static C9427b m15184A0() {
        return C9427b.m15111v();
    }

    /* renamed from: B0 */
    public static C9427b m15182B0(C9425n c9425n) {
        return m15184A0().mo5830p(c9425n);
    }

    /* renamed from: Z */
    public static C9425n m15156Z() {
        return f24807E;
    }

    /* renamed from: z0 */
    private void m15130z0() {
        this.f24815n = 518;
        this.f24816o = 2054;
        this.f24817p = 0;
        this.f24818q = C9439q.m15008Y();
        this.f24819r = 0;
        this.f24820s = Collections.emptyList();
        this.f24821t = C9439q.m15008Y();
        this.f24822u = 0;
        this.f24823v = Collections.emptyList();
        this.f24824w = Collections.emptyList();
        this.f24826y = C9458u.m14786J();
        this.f24827z = 0;
        this.f24809A = 0;
        this.f24810B = Collections.emptyList();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: C0 */
    public C9427b mo5765e() {
        return m15184A0();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: D0 */
    public C9427b mo5768b() {
        return m15182B0(this);
    }

    /* renamed from: V */
    public C9439q m15160V(int i) {
        return this.f24823v.get(i);
    }

    /* renamed from: W */
    public int m15159W() {
        return this.f24823v.size();
    }

    /* renamed from: X */
    public List<Integer> m15158X() {
        return this.f24824w;
    }

    /* renamed from: Y */
    public List<C9439q> m15157Y() {
        return this.f24823v;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: a0 */
    public C9425n mo5762f() {
        return f24807E;
    }

    /* renamed from: b0 */
    public int m15154b0() {
        return this.f24815n;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24812D;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24814m & 2) == 2) {
            i = C12181f.m5892o(1, this.f24816o) + 0;
        } else {
            i = 0;
        }
        if ((this.f24814m & 4) == 4) {
            i += C12181f.m5892o(2, this.f24817p);
        }
        if ((this.f24814m & 8) == 8) {
            i += C12181f.m5884s(3, this.f24818q);
        }
        for (int i3 = 0; i3 < this.f24820s.size(); i3++) {
            i += C12181f.m5884s(4, this.f24820s.get(i3));
        }
        if ((this.f24814m & 32) == 32) {
            i += C12181f.m5884s(5, this.f24821t);
        }
        if ((this.f24814m & 128) == 128) {
            i += C12181f.m5884s(6, this.f24826y);
        }
        if ((this.f24814m & 256) == 256) {
            i += C12181f.m5892o(7, this.f24827z);
        }
        if ((this.f24814m & 512) == 512) {
            i += C12181f.m5892o(8, this.f24809A);
        }
        if ((this.f24814m & 16) == 16) {
            i += C12181f.m5892o(9, this.f24819r);
        }
        if ((this.f24814m & 64) == 64) {
            i += C12181f.m5892o(10, this.f24822u);
        }
        if ((this.f24814m & 1) == 1) {
            i += C12181f.m5892o(11, this.f24815n);
        }
        for (int i4 = 0; i4 < this.f24823v.size(); i4++) {
            i += C12181f.m5884s(12, this.f24823v.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f24824w.size(); i6++) {
            i5 += C12181f.m5890p(this.f24824w.get(i6).intValue());
        }
        int i7 = i + i5;
        if (!m15158X().isEmpty()) {
            i7 = i7 + 1 + C12181f.m5890p(i5);
        }
        this.f24825x = i5;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f24810B.size(); i9++) {
            i8 += C12181f.m5890p(this.f24810B.get(i9).intValue());
        }
        int size = i7 + i8 + (m15141o0().size() * 2) + m5819u() + this.f24813l.size();
        this.f24812D = size;
        return size;
    }

    /* renamed from: c0 */
    public int m15153c0() {
        return this.f24827z;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        if ((this.f24814m & 2) == 2) {
            c12181f.m5919a0(1, this.f24816o);
        }
        if ((this.f24814m & 4) == 4) {
            c12181f.m5919a0(2, this.f24817p);
        }
        if ((this.f24814m & 8) == 8) {
            c12181f.m5913d0(3, this.f24818q);
        }
        for (int i = 0; i < this.f24820s.size(); i++) {
            c12181f.m5913d0(4, this.f24820s.get(i));
        }
        if ((this.f24814m & 32) == 32) {
            c12181f.m5913d0(5, this.f24821t);
        }
        if ((this.f24814m & 128) == 128) {
            c12181f.m5913d0(6, this.f24826y);
        }
        if ((this.f24814m & 256) == 256) {
            c12181f.m5919a0(7, this.f24827z);
        }
        if ((this.f24814m & 512) == 512) {
            c12181f.m5919a0(8, this.f24809A);
        }
        if ((this.f24814m & 16) == 16) {
            c12181f.m5919a0(9, this.f24819r);
        }
        if ((this.f24814m & 64) == 64) {
            c12181f.m5919a0(10, this.f24822u);
        }
        if ((this.f24814m & 1) == 1) {
            c12181f.m5919a0(11, this.f24815n);
        }
        for (int i2 = 0; i2 < this.f24823v.size(); i2++) {
            c12181f.m5913d0(12, this.f24823v.get(i2));
        }
        if (m15158X().size() > 0) {
            c12181f.m5891o0(106);
            c12181f.m5891o0(this.f24825x);
        }
        for (int i3 = 0; i3 < this.f24824w.size(); i3++) {
            c12181f.m5917b0(this.f24824w.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.f24810B.size(); i4++) {
            c12181f.m5919a0(31, this.f24810B.get(i4).intValue());
        }
        m5814z.m5813a(19000, c12181f);
        c12181f.m5903i0(this.f24813l);
    }

    /* renamed from: d0 */
    public int m15152d0() {
        return this.f24817p;
    }

    /* renamed from: e0 */
    public int m15151e0() {
        return this.f24816o;
    }

    /* renamed from: f0 */
    public C9439q m15150f0() {
        return this.f24821t;
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9425n> mo5764g() {
        return f24808F;
    }

    /* renamed from: g0 */
    public int m15149g0() {
        return this.f24822u;
    }

    /* renamed from: h0 */
    public C9439q m15148h0() {
        return this.f24818q;
    }

    /* renamed from: i0 */
    public int m15147i0() {
        return this.f24819r;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24811C;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m15138r0()) {
            this.f24811C = (byte) 0;
            return false;
        } else if (m15134v0() && !m15148h0().mo5761j()) {
            this.f24811C = (byte) 0;
            return false;
        } else {
            for (int i = 0; i < m15143m0(); i++) {
                if (!m15144l0(i).mo5761j()) {
                    this.f24811C = (byte) 0;
                    return false;
                }
            }
            if (m15136t0() && !m15150f0().mo5761j()) {
                this.f24811C = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < m15159W(); i2++) {
                if (!m15160V(i2).mo5761j()) {
                    this.f24811C = (byte) 0;
                    return false;
                }
            }
            if (m15131y0() && !m15145k0().mo5761j()) {
                this.f24811C = (byte) 0;
                return false;
            } else if (!m5820t()) {
                this.f24811C = (byte) 0;
                return false;
            } else {
                this.f24811C = (byte) 1;
                return true;
            }
        }
    }

    /* renamed from: j0 */
    public int m15146j0() {
        return this.f24809A;
    }

    /* renamed from: k0 */
    public C9458u m15145k0() {
        return this.f24826y;
    }

    /* renamed from: l0 */
    public C9450s m15144l0(int i) {
        return this.f24820s.get(i);
    }

    /* renamed from: m0 */
    public int m15143m0() {
        return this.f24820s.size();
    }

    /* renamed from: n0 */
    public List<C9450s> m15142n0() {
        return this.f24820s;
    }

    /* renamed from: o0 */
    public List<Integer> m15141o0() {
        return this.f24810B;
    }

    /* renamed from: p0 */
    public boolean m15140p0() {
        return (this.f24814m & 1) == 1;
    }

    /* renamed from: q0 */
    public boolean m15139q0() {
        return (this.f24814m & 256) == 256;
    }

    /* renamed from: r0 */
    public boolean m15138r0() {
        return (this.f24814m & 4) == 4;
    }

    /* renamed from: s0 */
    public boolean m15137s0() {
        return (this.f24814m & 2) == 2;
    }

    /* renamed from: t0 */
    public boolean m15136t0() {
        return (this.f24814m & 32) == 32;
    }

    /* renamed from: u0 */
    public boolean m15135u0() {
        return (this.f24814m & 64) == 64;
    }

    /* renamed from: v0 */
    public boolean m15134v0() {
        return (this.f24814m & 8) == 8;
    }

    /* renamed from: w0 */
    public boolean m15133w0() {
        return (this.f24814m & 16) == 16;
    }

    /* renamed from: x0 */
    public boolean m15132x0() {
        return (this.f24814m & 512) == 512;
    }

    /* renamed from: y0 */
    public boolean m15131y0() {
        return (this.f24814m & 128) == 128;
    }

    private C9425n(AbstractC12188i.AbstractC12191c<C9425n, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f24825x = -1;
        this.f24811C = (byte) -1;
        this.f24812D = -1;
        this.f24813l = abstractC12191c.m5831n();
    }

    private C9425n(boolean z) {
        this.f24825x = -1;
        this.f24811C = (byte) -1;
        this.f24812D = -1;
        this.f24813l = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C9425n(C12180e c12180e, C12183g c12183g) {
        this.f24825x = -1;
        this.f24811C = (byte) -1;
        this.f24812D = -1;
        m15130z0();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            ?? r5 = 256;
            if (!z) {
                try {
                    try {
                        try {
                            int m5982K = c12180e.m5982K();
                            switch (m5982K) {
                                case 0:
                                    break;
                                case 8:
                                    this.f24814m |= 2;
                                    this.f24816o = c12180e.m5954s();
                                    continue;
                                case 16:
                                    this.f24814m |= 4;
                                    this.f24817p = c12180e.m5954s();
                                    continue;
                                case 26:
                                    C9439q.C9446c mo5768b = (this.f24814m & 8) == 8 ? this.f24818q.mo5768b() : null;
                                    C9439q c9439q = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                                    this.f24818q = c9439q;
                                    if (mo5768b != null) {
                                        mo5768b.mo5830p(c9439q);
                                        this.f24818q = mo5768b.m14929x();
                                    }
                                    this.f24814m |= 8;
                                    continue;
                                case 34:
                                    boolean z3 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z3) {
                                        this.f24820s = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.f24820s.add(c12180e.m5952u(C9450s.f24959x, c12183g));
                                    continue;
                                case 42:
                                    C9439q.C9446c mo5768b2 = (this.f24814m & 32) == 32 ? this.f24821t.mo5768b() : null;
                                    C9439q c9439q2 = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                                    this.f24821t = c9439q2;
                                    if (mo5768b2 != null) {
                                        mo5768b2.mo5830p(c9439q2);
                                        this.f24821t = mo5768b2.m14929x();
                                    }
                                    this.f24814m |= 32;
                                    continue;
                                case 50:
                                    C9458u.C9460b mo5768b3 = (this.f24814m & 128) == 128 ? this.f24826y.mo5768b() : null;
                                    C9458u c9458u = (C9458u) c12180e.m5952u(C9458u.f24996w, c12183g);
                                    this.f24826y = c9458u;
                                    if (mo5768b3 != null) {
                                        mo5768b3.mo5830p(c9458u);
                                        this.f24826y = mo5768b3.m14755x();
                                    }
                                    this.f24814m |= 128;
                                    continue;
                                case 56:
                                    this.f24814m |= 256;
                                    this.f24827z = c12180e.m5954s();
                                    continue;
                                case 64:
                                    this.f24814m |= 512;
                                    this.f24809A = c12180e.m5954s();
                                    continue;
                                case 72:
                                    this.f24814m |= 16;
                                    this.f24819r = c12180e.m5954s();
                                    continue;
                                case 80:
                                    this.f24814m |= 64;
                                    this.f24822u = c12180e.m5954s();
                                    continue;
                                case 88:
                                    this.f24814m |= 1;
                                    this.f24815n = c12180e.m5954s();
                                    continue;
                                case 98:
                                    boolean z4 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z4) {
                                        this.f24823v = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.f24823v.add(c12180e.m5952u(C9439q.f24879E, c12183g));
                                    continue;
                                case 104:
                                    boolean z5 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z5) {
                                        this.f24824w = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.f24824w.add(Integer.valueOf(c12180e.m5954s()));
                                    continue;
                                case 106:
                                    int m5963j = c12180e.m5963j(c12180e.m5992A());
                                    boolean z6 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z6) {
                                        z2 = z2;
                                        if (c12180e.m5968e() > 0) {
                                            this.f24824w = new ArrayList();
                                            z2 = (z2 ? 1 : 0) | true;
                                        }
                                    }
                                    while (c12180e.m5968e() > 0) {
                                        this.f24824w.add(Integer.valueOf(c12180e.m5954s()));
                                    }
                                    c12180e.m5964i(m5963j);
                                    continue;
                                case 248:
                                    boolean z7 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z7) {
                                        this.f24810B = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.f24810B.add(Integer.valueOf(c12180e.m5954s()));
                                    continue;
                                case ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                    int m5963j2 = c12180e.m5963j(c12180e.m5992A());
                                    boolean z8 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z8) {
                                        z2 = z2;
                                        if (c12180e.m5968e() > 0) {
                                            this.f24810B = new ArrayList();
                                            z2 = (z2 ? 1 : 0) | true;
                                        }
                                    }
                                    while (c12180e.m5968e() > 0) {
                                        this.f24810B.add(Integer.valueOf(c12180e.m5954s()));
                                    }
                                    c12180e.m5964i(m5963j2);
                                    continue;
                                default:
                                    r5 = mo5822q(c12180e, m5937J, c12183g, m5982K);
                                    if (r5 == 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new C12199k(e.getMessage()).m5788i(this);
                        }
                    } catch (C12199k e2) {
                        throw e2.m5788i(this);
                    }
                } catch (Throwable th2) {
                    if ((z2 ? 1 : 0) & true) {
                        this.f24820s = Collections.unmodifiableList(this.f24820s);
                    }
                    if (((z2 ? 1 : 0) & true) == r5) {
                        this.f24823v = Collections.unmodifiableList(this.f24823v);
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.f24824w = Collections.unmodifiableList(this.f24824w);
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.f24810B = Collections.unmodifiableList(this.f24810B);
                    }
                    try {
                        m5937J.m5938I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f24813l = m5997w.m5993j();
                        throw th3;
                    }
                    this.f24813l = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            } else {
                if ((z2 ? 1 : 0) & true) {
                    this.f24820s = Collections.unmodifiableList(this.f24820s);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.f24823v = Collections.unmodifiableList(this.f24823v);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.f24824w = Collections.unmodifiableList(this.f24824w);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.f24810B = Collections.unmodifiableList(this.f24810B);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f24813l = m5997w.m5993j();
                    throw th4;
                }
                this.f24813l = m5997w.m5993j();
                mo5823n();
                return;
            }
        }
    }
}
