package kh;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kh.C9455t;
import kh.C9468w;
import p326rh.AbstractC12170a;
import p326rh.AbstractC12173b;
import p326rh.AbstractC12177d;
import p326rh.AbstractC12188i;
import p326rh.C12180e;
import p326rh.C12181f;
import p326rh.C12183g;
import p326rh.C12199k;
import p326rh.InterfaceC12213s;

/* renamed from: kh.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9419l extends AbstractC12188i.AbstractC12192d<C9419l> {

    /* renamed from: u */
    private static final C9419l f24775u;

    /* renamed from: v */
    public static InterfaceC12213s<C9419l> f24776v = new C9420a();

    /* renamed from: l */
    private final AbstractC12177d f24777l;

    /* renamed from: m */
    private int f24778m;

    /* renamed from: n */
    private List<C9412i> f24779n;

    /* renamed from: o */
    private List<C9425n> f24780o;

    /* renamed from: p */
    private List<C9447r> f24781p;

    /* renamed from: q */
    private C9455t f24782q;

    /* renamed from: r */
    private C9468w f24783r;

    /* renamed from: s */
    private byte f24784s;

    /* renamed from: t */
    private int f24785t;

    /* renamed from: kh.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9420a extends AbstractC12173b<C9419l> {
        C9420a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9419l mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9419l(c12180e, c12183g);
        }
    }

    /* renamed from: kh.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9421b extends AbstractC12188i.AbstractC12191c<C9419l, C9421b> {

        /* renamed from: m */
        private int f24786m;

        /* renamed from: n */
        private List<C9412i> f24787n = Collections.emptyList();

        /* renamed from: o */
        private List<C9425n> f24788o = Collections.emptyList();

        /* renamed from: p */
        private List<C9447r> f24789p = Collections.emptyList();

        /* renamed from: q */
        private C9455t f24790q = C9455t.m14808x();

        /* renamed from: r */
        private C9468w f24791r = C9468w.m14701v();

        private C9421b() {
            m15231D();
        }

        /* renamed from: A */
        private void m15234A() {
            if ((this.f24786m & 1) != 1) {
                this.f24787n = new ArrayList(this.f24787n);
                this.f24786m |= 1;
            }
        }

        /* renamed from: B */
        private void m15233B() {
            if ((this.f24786m & 2) != 2) {
                this.f24788o = new ArrayList(this.f24788o);
                this.f24786m |= 2;
            }
        }

        /* renamed from: C */
        private void m15232C() {
            if ((this.f24786m & 4) != 4) {
                this.f24789p = new ArrayList(this.f24789p);
                this.f24786m |= 4;
            }
        }

        /* renamed from: D */
        private void m15231D() {
        }

        /* renamed from: v */
        static /* synthetic */ C9421b m15226v() {
            return m15222z();
        }

        /* renamed from: z */
        private static C9421b m15222z() {
            return new C9421b();
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: E */
        public C9421b mo5830p(C9419l c9419l) {
            if (c9419l == C9419l.m15256L()) {
                return this;
            }
            if (!c9419l.f24779n.isEmpty()) {
                if (this.f24787n.isEmpty()) {
                    this.f24787n = c9419l.f24779n;
                    this.f24786m &= -2;
                } else {
                    m15234A();
                    this.f24787n.addAll(c9419l.f24779n);
                }
            }
            if (!c9419l.f24780o.isEmpty()) {
                if (this.f24788o.isEmpty()) {
                    this.f24788o = c9419l.f24780o;
                    this.f24786m &= -3;
                } else {
                    m15233B();
                    this.f24788o.addAll(c9419l.f24780o);
                }
            }
            if (!c9419l.f24781p.isEmpty()) {
                if (this.f24789p.isEmpty()) {
                    this.f24789p = c9419l.f24781p;
                    this.f24786m &= -5;
                } else {
                    m15232C();
                    this.f24789p.addAll(c9419l.f24781p);
                }
            }
            if (c9419l.m15243Y()) {
                m15228G(c9419l.m15245W());
            }
            if (c9419l.m15242Z()) {
                m15227H(c9419l.m15244X());
            }
            m5825u(c9419l);
            m5829q(m5831n().m6003d(c9419l.f24777l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9419l.C9421b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.l> r1 = kh.C9419l.f24776v     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.l r3 = (kh.C9419l) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.l r4 = (kh.C9419l) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9419l.C9421b.mo6018k(rh.e, rh.g):kh.l$b");
        }

        /* renamed from: G */
        public C9421b m15228G(C9455t c9455t) {
            if ((this.f24786m & 8) == 8 && this.f24790q != C9455t.m14808x()) {
                this.f24790q = C9455t.m14816F(this.f24790q).mo5830p(c9455t).m14801t();
            } else {
                this.f24790q = c9455t;
            }
            this.f24786m |= 8;
            return this;
        }

        /* renamed from: H */
        public C9421b m15227H(C9468w c9468w) {
            if ((this.f24786m & 16) == 16 && this.f24791r != C9468w.m14701v()) {
                this.f24791r = C9468w.m14707A(this.f24791r).mo5830p(c9468w).m14693t();
            } else {
                this.f24791r = c9468w;
            }
            this.f24786m |= 16;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9419l build() {
            C9419l m15224x = m15224x();
            if (m15224x.mo5761j()) {
                return m15224x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15224x);
        }

        /* renamed from: x */
        public C9419l m15224x() {
            C9419l c9419l = new C9419l(this);
            int i = this.f24786m;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f24787n = Collections.unmodifiableList(this.f24787n);
                this.f24786m &= -2;
            }
            c9419l.f24779n = this.f24787n;
            if ((this.f24786m & 2) == 2) {
                this.f24788o = Collections.unmodifiableList(this.f24788o);
                this.f24786m &= -3;
            }
            c9419l.f24780o = this.f24788o;
            if ((this.f24786m & 4) == 4) {
                this.f24789p = Collections.unmodifiableList(this.f24789p);
                this.f24786m &= -5;
            }
            c9419l.f24781p = this.f24789p;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            c9419l.f24782q = this.f24790q;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            c9419l.f24783r = this.f24791r;
            c9419l.f24778m = i2;
            return c9419l;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9421b mo5832m() {
            return m15222z().mo5830p(m15224x());
        }
    }

    static {
        C9419l c9419l = new C9419l(true);
        f24775u = c9419l;
        c9419l.m15241a0();
    }

    /* renamed from: L */
    public static C9419l m15256L() {
        return f24775u;
    }

    /* renamed from: a0 */
    private void m15241a0() {
        this.f24779n = Collections.emptyList();
        this.f24780o = Collections.emptyList();
        this.f24781p = Collections.emptyList();
        this.f24782q = C9455t.m14808x();
        this.f24783r = C9468w.m14701v();
    }

    /* renamed from: b0 */
    public static C9421b m15240b0() {
        return C9421b.m15226v();
    }

    /* renamed from: c0 */
    public static C9421b m15239c0(C9419l c9419l) {
        return m15240b0().mo5830p(c9419l);
    }

    /* renamed from: e0 */
    public static C9419l m15237e0(InputStream inputStream, C12183g c12183g) {
        return f24776v.mo5758c(inputStream, c12183g);
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: M */
    public C9419l mo5762f() {
        return f24775u;
    }

    /* renamed from: N */
    public C9412i m15254N(int i) {
        return this.f24779n.get(i);
    }

    /* renamed from: O */
    public int m15253O() {
        return this.f24779n.size();
    }

    /* renamed from: P */
    public List<C9412i> m15252P() {
        return this.f24779n;
    }

    /* renamed from: Q */
    public C9425n m15251Q(int i) {
        return this.f24780o.get(i);
    }

    /* renamed from: R */
    public int m15250R() {
        return this.f24780o.size();
    }

    /* renamed from: S */
    public List<C9425n> m15249S() {
        return this.f24780o;
    }

    /* renamed from: T */
    public C9447r m15248T(int i) {
        return this.f24781p.get(i);
    }

    /* renamed from: U */
    public int m15247U() {
        return this.f24781p.size();
    }

    /* renamed from: V */
    public List<C9447r> m15246V() {
        return this.f24781p;
    }

    /* renamed from: W */
    public C9455t m15245W() {
        return this.f24782q;
    }

    /* renamed from: X */
    public C9468w m15244X() {
        return this.f24783r;
    }

    /* renamed from: Y */
    public boolean m15243Y() {
        return (this.f24778m & 1) == 1;
    }

    /* renamed from: Z */
    public boolean m15242Z() {
        return (this.f24778m & 2) == 2;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i = this.f24785t;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f24779n.size(); i3++) {
            i2 += C12181f.m5884s(3, this.f24779n.get(i3));
        }
        for (int i4 = 0; i4 < this.f24780o.size(); i4++) {
            i2 += C12181f.m5884s(4, this.f24780o.get(i4));
        }
        for (int i5 = 0; i5 < this.f24781p.size(); i5++) {
            i2 += C12181f.m5884s(5, this.f24781p.get(i5));
        }
        if ((this.f24778m & 1) == 1) {
            i2 += C12181f.m5884s(30, this.f24782q);
        }
        if ((this.f24778m & 2) == 2) {
            i2 += C12181f.m5884s(32, this.f24783r);
        }
        int m5819u = i2 + m5819u() + this.f24777l.size();
        this.f24785t = m5819u;
        return m5819u;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        for (int i = 0; i < this.f24779n.size(); i++) {
            c12181f.m5913d0(3, this.f24779n.get(i));
        }
        for (int i2 = 0; i2 < this.f24780o.size(); i2++) {
            c12181f.m5913d0(4, this.f24780o.get(i2));
        }
        for (int i3 = 0; i3 < this.f24781p.size(); i3++) {
            c12181f.m5913d0(5, this.f24781p.get(i3));
        }
        if ((this.f24778m & 1) == 1) {
            c12181f.m5913d0(30, this.f24782q);
        }
        if ((this.f24778m & 2) == 2) {
            c12181f.m5913d0(32, this.f24783r);
        }
        m5814z.m5813a(ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, c12181f);
        c12181f.m5903i0(this.f24777l);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d0 */
    public C9421b mo5765e() {
        return m15240b0();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: f0 */
    public C9421b mo5768b() {
        return m15239c0(this);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9419l> mo5764g() {
        return f24776v;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24784s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m15253O(); i++) {
            if (!m15254N(i).mo5761j()) {
                this.f24784s = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < m15250R(); i2++) {
            if (!m15251Q(i2).mo5761j()) {
                this.f24784s = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m15247U(); i3++) {
            if (!m15248T(i3).mo5761j()) {
                this.f24784s = (byte) 0;
                return false;
            }
        }
        if (m15243Y() && !m15245W().mo5761j()) {
            this.f24784s = (byte) 0;
            return false;
        } else if (!m5820t()) {
            this.f24784s = (byte) 0;
            return false;
        } else {
            this.f24784s = (byte) 1;
            return true;
        }
    }

    private C9419l(AbstractC12188i.AbstractC12191c<C9419l, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f24784s = (byte) -1;
        this.f24785t = -1;
        this.f24777l = abstractC12191c.m5831n();
    }

    private C9419l(boolean z) {
        this.f24784s = (byte) -1;
        this.f24785t = -1;
        this.f24777l = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9419l(C12180e c12180e, C12183g c12183g) {
        this.f24784s = (byte) -1;
        this.f24785t = -1;
        m15241a0();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int m5982K = c12180e.m5982K();
                        if (m5982K != 0) {
                            if (m5982K == 26) {
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.f24779n = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.f24779n.add(c12180e.m5952u(C9412i.f24726F, c12183g));
                            } else if (m5982K == 34) {
                                boolean z4 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z4) {
                                    this.f24780o = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.f24780o.add(c12180e.m5952u(C9425n.f24808F, c12183g));
                            } else if (m5982K != 42) {
                                if (m5982K == 242) {
                                    C9455t.C9457b mo5768b = (this.f24778m & 1) == 1 ? this.f24782q.mo5768b() : null;
                                    C9455t c9455t = (C9455t) c12180e.m5952u(C9455t.f24985r, c12183g);
                                    this.f24782q = c9455t;
                                    if (mo5768b != null) {
                                        mo5768b.mo5830p(c9455t);
                                        this.f24782q = mo5768b.m14801t();
                                    }
                                    this.f24778m |= 1;
                                } else if (m5982K != 258) {
                                    if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                    }
                                } else {
                                    C9468w.C9470b mo5768b2 = (this.f24778m & 2) == 2 ? this.f24783r.mo5768b() : null;
                                    C9468w c9468w = (C9468w) c12180e.m5952u(C9468w.f25046p, c12183g);
                                    this.f24783r = c9468w;
                                    if (mo5768b2 != null) {
                                        mo5768b2.mo5830p(c9468w);
                                        this.f24783r = mo5768b2.m14693t();
                                    }
                                    this.f24778m |= 2;
                                }
                            } else {
                                boolean z5 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z5) {
                                    this.f24781p = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.f24781p.add(c12180e.m5952u(C9447r.f24934z, c12183g));
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
                    this.f24779n = Collections.unmodifiableList(this.f24779n);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.f24780o = Collections.unmodifiableList(this.f24780o);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.f24781p = Collections.unmodifiableList(this.f24781p);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24777l = m5997w.m5993j();
                    throw th3;
                }
                this.f24777l = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if ((z2 ? 1 : 0) & true) {
            this.f24779n = Collections.unmodifiableList(this.f24779n);
        }
        if ((z2 ? 1 : 0) & true) {
            this.f24780o = Collections.unmodifiableList(this.f24780o);
        }
        if ((z2 ? 1 : 0) & true) {
            this.f24781p = Collections.unmodifiableList(this.f24781p);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24777l = m5997w.m5993j();
            throw th4;
        }
        this.f24777l = m5997w.m5993j();
        mo5823n();
    }
}
