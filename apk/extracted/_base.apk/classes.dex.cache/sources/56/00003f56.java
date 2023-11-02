package kh;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
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

/* renamed from: kh.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9458u extends AbstractC12188i.AbstractC12192d<C9458u> {

    /* renamed from: v */
    private static final C9458u f24995v;

    /* renamed from: w */
    public static InterfaceC12213s<C9458u> f24996w = new C9459a();

    /* renamed from: l */
    private final AbstractC12177d f24997l;

    /* renamed from: m */
    private int f24998m;

    /* renamed from: n */
    private int f24999n;

    /* renamed from: o */
    private int f25000o;

    /* renamed from: p */
    private C9439q f25001p;

    /* renamed from: q */
    private int f25002q;

    /* renamed from: r */
    private C9439q f25003r;

    /* renamed from: s */
    private int f25004s;

    /* renamed from: t */
    private byte f25005t;

    /* renamed from: u */
    private int f25006u;

    /* renamed from: kh.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9459a extends AbstractC12173b<C9458u> {
        C9459a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9458u mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9458u(c12180e, c12183g);
        }
    }

    /* renamed from: kh.u$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9460b extends AbstractC12188i.AbstractC12191c<C9458u, C9460b> {

        /* renamed from: m */
        private int f25007m;

        /* renamed from: n */
        private int f25008n;

        /* renamed from: o */
        private int f25009o;

        /* renamed from: q */
        private int f25011q;

        /* renamed from: s */
        private int f25013s;

        /* renamed from: p */
        private C9439q f25010p = C9439q.m15008Y();

        /* renamed from: r */
        private C9439q f25012r = C9439q.m15008Y();

        private C9460b() {
            m14766A();
        }

        /* renamed from: A */
        private void m14766A() {
        }

        /* renamed from: v */
        static /* synthetic */ C9460b m14757v() {
            return m14753z();
        }

        /* renamed from: z */
        private static C9460b m14753z() {
            return new C9460b();
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: B */
        public C9460b mo5830p(C9458u c9458u) {
            if (c9458u == C9458u.m14786J()) {
                return this;
            }
            if (c9458u.m14778R()) {
                m14761F(c9458u.m14784L());
            }
            if (c9458u.m14777S()) {
                m14760G(c9458u.m14783M());
            }
            if (c9458u.m14776T()) {
                m14763D(c9458u.m14782N());
            }
            if (c9458u.m14775U()) {
                m14759H(c9458u.m14781O());
            }
            if (c9458u.m14774V()) {
                m14762E(c9458u.m14780P());
            }
            if (c9458u.m14773W()) {
                m14758I(c9458u.m14779Q());
            }
            m5825u(c9458u);
            m5829q(m5831n().m6003d(c9458u.f24997l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9458u.C9460b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.u> r1 = kh.C9458u.f24996w     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.u r3 = (kh.C9458u) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.u r4 = (kh.C9458u) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9458u.C9460b.mo6018k(rh.e, rh.g):kh.u$b");
        }

        /* renamed from: D */
        public C9460b m14763D(C9439q c9439q) {
            if ((this.f25007m & 4) == 4 && this.f25010p != C9439q.m15008Y()) {
                this.f25010p = C9439q.m14981z0(this.f25010p).mo5830p(c9439q).m14929x();
            } else {
                this.f25010p = c9439q;
            }
            this.f25007m |= 4;
            return this;
        }

        /* renamed from: E */
        public C9460b m14762E(C9439q c9439q) {
            if ((this.f25007m & 16) == 16 && this.f25012r != C9439q.m15008Y()) {
                this.f25012r = C9439q.m14981z0(this.f25012r).mo5830p(c9439q).m14929x();
            } else {
                this.f25012r = c9439q;
            }
            this.f25007m |= 16;
            return this;
        }

        /* renamed from: F */
        public C9460b m14761F(int i) {
            this.f25007m |= 1;
            this.f25008n = i;
            return this;
        }

        /* renamed from: G */
        public C9460b m14760G(int i) {
            this.f25007m |= 2;
            this.f25009o = i;
            return this;
        }

        /* renamed from: H */
        public C9460b m14759H(int i) {
            this.f25007m |= 8;
            this.f25011q = i;
            return this;
        }

        /* renamed from: I */
        public C9460b m14758I(int i) {
            this.f25007m |= 32;
            this.f25013s = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9458u build() {
            C9458u m14755x = m14755x();
            if (m14755x.mo5761j()) {
                return m14755x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m14755x);
        }

        /* renamed from: x */
        public C9458u m14755x() {
            C9458u c9458u = new C9458u(this);
            int i = this.f25007m;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            c9458u.f24999n = this.f25008n;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c9458u.f25000o = this.f25009o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c9458u.f25001p = this.f25010p;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c9458u.f25002q = this.f25011q;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c9458u.f25003r = this.f25012r;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            c9458u.f25004s = this.f25013s;
            c9458u.f24998m = i2;
            return c9458u;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9460b mo5832m() {
            return m14753z().mo5830p(m14755x());
        }
    }

    static {
        C9458u c9458u = new C9458u(true);
        f24995v = c9458u;
        c9458u.m14772X();
    }

    /* renamed from: J */
    public static C9458u m14786J() {
        return f24995v;
    }

    /* renamed from: X */
    private void m14772X() {
        this.f24999n = 0;
        this.f25000o = 0;
        this.f25001p = C9439q.m15008Y();
        this.f25002q = 0;
        this.f25003r = C9439q.m15008Y();
        this.f25004s = 0;
    }

    /* renamed from: Y */
    public static C9460b m14771Y() {
        return C9460b.m14757v();
    }

    /* renamed from: Z */
    public static C9460b m14770Z(C9458u c9458u) {
        return m14771Y().mo5830p(c9458u);
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: K */
    public C9458u mo5762f() {
        return f24995v;
    }

    /* renamed from: L */
    public int m14784L() {
        return this.f24999n;
    }

    /* renamed from: M */
    public int m14783M() {
        return this.f25000o;
    }

    /* renamed from: N */
    public C9439q m14782N() {
        return this.f25001p;
    }

    /* renamed from: O */
    public int m14781O() {
        return this.f25002q;
    }

    /* renamed from: P */
    public C9439q m14780P() {
        return this.f25003r;
    }

    /* renamed from: Q */
    public int m14779Q() {
        return this.f25004s;
    }

    /* renamed from: R */
    public boolean m14778R() {
        return (this.f24998m & 1) == 1;
    }

    /* renamed from: S */
    public boolean m14777S() {
        return (this.f24998m & 2) == 2;
    }

    /* renamed from: T */
    public boolean m14776T() {
        return (this.f24998m & 4) == 4;
    }

    /* renamed from: U */
    public boolean m14775U() {
        return (this.f24998m & 8) == 8;
    }

    /* renamed from: V */
    public boolean m14774V() {
        return (this.f24998m & 16) == 16;
    }

    /* renamed from: W */
    public boolean m14773W() {
        return (this.f24998m & 32) == 32;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: a0 */
    public C9460b mo5765e() {
        return m14771Y();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: b0 */
    public C9460b mo5768b() {
        return m14770Z(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i = this.f25006u;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f24998m & 1) == 1) {
            i2 = 0 + C12181f.m5892o(1, this.f24999n);
        }
        if ((this.f24998m & 2) == 2) {
            i2 += C12181f.m5892o(2, this.f25000o);
        }
        if ((this.f24998m & 4) == 4) {
            i2 += C12181f.m5884s(3, this.f25001p);
        }
        if ((this.f24998m & 16) == 16) {
            i2 += C12181f.m5884s(4, this.f25003r);
        }
        if ((this.f24998m & 8) == 8) {
            i2 += C12181f.m5892o(5, this.f25002q);
        }
        if ((this.f24998m & 32) == 32) {
            i2 += C12181f.m5892o(6, this.f25004s);
        }
        int m5819u = i2 + m5819u() + this.f24997l.size();
        this.f25006u = m5819u;
        return m5819u;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        if ((this.f24998m & 1) == 1) {
            c12181f.m5919a0(1, this.f24999n);
        }
        if ((this.f24998m & 2) == 2) {
            c12181f.m5919a0(2, this.f25000o);
        }
        if ((this.f24998m & 4) == 4) {
            c12181f.m5913d0(3, this.f25001p);
        }
        if ((this.f24998m & 16) == 16) {
            c12181f.m5913d0(4, this.f25003r);
        }
        if ((this.f24998m & 8) == 8) {
            c12181f.m5919a0(5, this.f25002q);
        }
        if ((this.f24998m & 32) == 32) {
            c12181f.m5919a0(6, this.f25004s);
        }
        m5814z.m5813a(ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, c12181f);
        c12181f.m5903i0(this.f24997l);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9458u> mo5764g() {
        return f24996w;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f25005t;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m14777S()) {
            this.f25005t = (byte) 0;
            return false;
        } else if (m14776T() && !m14782N().mo5761j()) {
            this.f25005t = (byte) 0;
            return false;
        } else if (m14774V() && !m14780P().mo5761j()) {
            this.f25005t = (byte) 0;
            return false;
        } else if (!m5820t()) {
            this.f25005t = (byte) 0;
            return false;
        } else {
            this.f25005t = (byte) 1;
            return true;
        }
    }

    private C9458u(AbstractC12188i.AbstractC12191c<C9458u, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f25005t = (byte) -1;
        this.f25006u = -1;
        this.f24997l = abstractC12191c.m5831n();
    }

    private C9458u(boolean z) {
        this.f25005t = (byte) -1;
        this.f25006u = -1;
        this.f24997l = AbstractC12177d.f31693j;
    }

    private C9458u(C12180e c12180e, C12183g c12183g) {
        C9439q.C9446c mo5768b;
        this.f25005t = (byte) -1;
        this.f25006u = -1;
        m14772X();
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
                                this.f24998m |= 1;
                                this.f24999n = c12180e.m5954s();
                            } else if (m5982K != 16) {
                                if (m5982K == 26) {
                                    mo5768b = (this.f24998m & 4) == 4 ? this.f25001p.mo5768b() : null;
                                    C9439q c9439q = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                                    this.f25001p = c9439q;
                                    if (mo5768b != null) {
                                        mo5768b.mo5830p(c9439q);
                                        this.f25001p = mo5768b.m14929x();
                                    }
                                    this.f24998m |= 4;
                                } else if (m5982K == 34) {
                                    mo5768b = (this.f24998m & 16) == 16 ? this.f25003r.mo5768b() : null;
                                    C9439q c9439q2 = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                                    this.f25003r = c9439q2;
                                    if (mo5768b != null) {
                                        mo5768b.mo5830p(c9439q2);
                                        this.f25003r = mo5768b.m14929x();
                                    }
                                    this.f24998m |= 16;
                                } else if (m5982K == 40) {
                                    this.f24998m |= 8;
                                    this.f25002q = c12180e.m5954s();
                                } else if (m5982K != 48) {
                                    if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                    }
                                } else {
                                    this.f24998m |= 32;
                                    this.f25004s = c12180e.m5954s();
                                }
                            } else {
                                this.f24998m |= 2;
                                this.f25000o = c12180e.m5954s();
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
                    this.f24997l = m5997w.m5993j();
                    throw th3;
                }
                this.f24997l = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24997l = m5997w.m5993j();
            throw th4;
        }
        this.f24997l = m5997w.m5993j();
        mo5823n();
    }
}