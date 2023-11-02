package kh;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kh.C9419l;
import kh.C9428o;
import kh.C9436p;
import p326rh.AbstractC12170a;
import p326rh.AbstractC12173b;
import p326rh.AbstractC12177d;
import p326rh.AbstractC12188i;
import p326rh.C12180e;
import p326rh.C12181f;
import p326rh.C12183g;
import p326rh.C12199k;
import p326rh.InterfaceC12213s;

/* renamed from: kh.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9422m extends AbstractC12188i.AbstractC12192d<C9422m> {

    /* renamed from: t */
    private static final C9422m f24792t;

    /* renamed from: u */
    public static InterfaceC12213s<C9422m> f24793u = new C9423a();

    /* renamed from: l */
    private final AbstractC12177d f24794l;

    /* renamed from: m */
    private int f24795m;

    /* renamed from: n */
    private C9436p f24796n;

    /* renamed from: o */
    private C9428o f24797o;

    /* renamed from: p */
    private C9419l f24798p;

    /* renamed from: q */
    private List<C9386c> f24799q;

    /* renamed from: r */
    private byte f24800r;

    /* renamed from: s */
    private int f24801s;

    /* renamed from: kh.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9423a extends AbstractC12173b<C9422m> {
        C9423a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9422m mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9422m(c12180e, c12183g);
        }
    }

    /* renamed from: kh.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9424b extends AbstractC12188i.AbstractC12191c<C9422m, C9424b> {

        /* renamed from: m */
        private int f24802m;

        /* renamed from: n */
        private C9436p f24803n = C9436p.m15048v();

        /* renamed from: o */
        private C9428o f24804o = C9428o.m15100v();

        /* renamed from: p */
        private C9419l f24805p = C9419l.m15256L();

        /* renamed from: q */
        private List<C9386c> f24806q = Collections.emptyList();

        private C9424b() {
            m15195B();
        }

        /* renamed from: A */
        private void m15196A() {
            if ((this.f24802m & 8) != 8) {
                this.f24806q = new ArrayList(this.f24806q);
                this.f24802m |= 8;
            }
        }

        /* renamed from: B */
        private void m15195B() {
        }

        /* renamed from: v */
        static /* synthetic */ C9424b m15189v() {
            return m15185z();
        }

        /* renamed from: z */
        private static C9424b m15185z() {
            return new C9424b();
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: C */
        public C9424b mo5830p(C9422m c9422m) {
            if (c9422m == C9422m.m15211L()) {
                return this;
            }
            if (c9422m.m15204S()) {
                m15190G(c9422m.m15207P());
            }
            if (c9422m.m15205R()) {
                m15191F(c9422m.m15208O());
            }
            if (c9422m.m15206Q()) {
                m15192E(c9422m.m15209N());
            }
            if (!c9422m.f24799q.isEmpty()) {
                if (this.f24806q.isEmpty()) {
                    this.f24806q = c9422m.f24799q;
                    this.f24802m &= -9;
                } else {
                    m15196A();
                    this.f24806q.addAll(c9422m.f24799q);
                }
            }
            m5825u(c9422m);
            m5829q(m5831n().m6003d(c9422m.f24794l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9422m.C9424b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.m> r1 = kh.C9422m.f24793u     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.m r3 = (kh.C9422m) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.m r4 = (kh.C9422m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9422m.C9424b.mo6018k(rh.e, rh.g):kh.m$b");
        }

        /* renamed from: E */
        public C9424b m15192E(C9419l c9419l) {
            if ((this.f24802m & 4) == 4 && this.f24805p != C9419l.m15256L()) {
                this.f24805p = C9419l.m15239c0(this.f24805p).mo5830p(c9419l).m15224x();
            } else {
                this.f24805p = c9419l;
            }
            this.f24802m |= 4;
            return this;
        }

        /* renamed from: F */
        public C9424b m15191F(C9428o c9428o) {
            if ((this.f24802m & 2) == 2 && this.f24804o != C9428o.m15100v()) {
                this.f24804o = C9428o.m15106A(this.f24804o).mo5830p(c9428o).m15092t();
            } else {
                this.f24804o = c9428o;
            }
            this.f24802m |= 2;
            return this;
        }

        /* renamed from: G */
        public C9424b m15190G(C9436p c9436p) {
            if ((this.f24802m & 1) == 1 && this.f24803n != C9436p.m15048v()) {
                this.f24803n = C9436p.m15054A(this.f24803n).mo5830p(c9436p).m15040t();
            } else {
                this.f24803n = c9436p;
            }
            this.f24802m |= 1;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9422m build() {
            C9422m m15187x = m15187x();
            if (m15187x.mo5761j()) {
                return m15187x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15187x);
        }

        /* renamed from: x */
        public C9422m m15187x() {
            C9422m c9422m = new C9422m(this);
            int i = this.f24802m;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            c9422m.f24796n = this.f24803n;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c9422m.f24797o = this.f24804o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c9422m.f24798p = this.f24805p;
            if ((this.f24802m & 8) == 8) {
                this.f24806q = Collections.unmodifiableList(this.f24806q);
                this.f24802m &= -9;
            }
            c9422m.f24799q = this.f24806q;
            c9422m.f24795m = i2;
            return c9422m;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9424b mo5832m() {
            return m15185z().mo5830p(m15187x());
        }
    }

    static {
        C9422m c9422m = new C9422m(true);
        f24792t = c9422m;
        c9422m.m15203T();
    }

    /* renamed from: L */
    public static C9422m m15211L() {
        return f24792t;
    }

    /* renamed from: T */
    private void m15203T() {
        this.f24796n = C9436p.m15048v();
        this.f24797o = C9428o.m15100v();
        this.f24798p = C9419l.m15256L();
        this.f24799q = Collections.emptyList();
    }

    /* renamed from: U */
    public static C9424b m15202U() {
        return C9424b.m15189v();
    }

    /* renamed from: V */
    public static C9424b m15201V(C9422m c9422m) {
        return m15202U().mo5830p(c9422m);
    }

    /* renamed from: X */
    public static C9422m m15199X(InputStream inputStream, C12183g c12183g) {
        return f24793u.mo5758c(inputStream, c12183g);
    }

    /* renamed from: I */
    public C9386c m15214I(int i) {
        return this.f24799q.get(i);
    }

    /* renamed from: J */
    public int m15213J() {
        return this.f24799q.size();
    }

    /* renamed from: K */
    public List<C9386c> m15212K() {
        return this.f24799q;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: M */
    public C9422m mo5762f() {
        return f24792t;
    }

    /* renamed from: N */
    public C9419l m15209N() {
        return this.f24798p;
    }

    /* renamed from: O */
    public C9428o m15208O() {
        return this.f24797o;
    }

    /* renamed from: P */
    public C9436p m15207P() {
        return this.f24796n;
    }

    /* renamed from: Q */
    public boolean m15206Q() {
        return (this.f24795m & 4) == 4;
    }

    /* renamed from: R */
    public boolean m15205R() {
        return (this.f24795m & 2) == 2;
    }

    /* renamed from: S */
    public boolean m15204S() {
        return (this.f24795m & 1) == 1;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: W */
    public C9424b mo5765e() {
        return m15202U();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: Y */
    public C9424b mo5768b() {
        return m15201V(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24801s;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24795m & 1) == 1) {
            i = C12181f.m5884s(1, this.f24796n) + 0;
        } else {
            i = 0;
        }
        if ((this.f24795m & 2) == 2) {
            i += C12181f.m5884s(2, this.f24797o);
        }
        if ((this.f24795m & 4) == 4) {
            i += C12181f.m5884s(3, this.f24798p);
        }
        for (int i3 = 0; i3 < this.f24799q.size(); i3++) {
            i += C12181f.m5884s(4, this.f24799q.get(i3));
        }
        int m5819u = i + m5819u() + this.f24794l.size();
        this.f24801s = m5819u;
        return m5819u;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        if ((this.f24795m & 1) == 1) {
            c12181f.m5913d0(1, this.f24796n);
        }
        if ((this.f24795m & 2) == 2) {
            c12181f.m5913d0(2, this.f24797o);
        }
        if ((this.f24795m & 4) == 4) {
            c12181f.m5913d0(3, this.f24798p);
        }
        for (int i = 0; i < this.f24799q.size(); i++) {
            c12181f.m5913d0(4, this.f24799q.get(i));
        }
        m5814z.m5813a(ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, c12181f);
        c12181f.m5903i0(this.f24794l);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9422m> mo5764g() {
        return f24793u;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24800r;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m15205R() && !m15208O().mo5761j()) {
            this.f24800r = (byte) 0;
            return false;
        } else if (m15206Q() && !m15209N().mo5761j()) {
            this.f24800r = (byte) 0;
            return false;
        } else {
            for (int i = 0; i < m15213J(); i++) {
                if (!m15214I(i).mo5761j()) {
                    this.f24800r = (byte) 0;
                    return false;
                }
            }
            if (!m5820t()) {
                this.f24800r = (byte) 0;
                return false;
            }
            this.f24800r = (byte) 1;
            return true;
        }
    }

    private C9422m(AbstractC12188i.AbstractC12191c<C9422m, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f24800r = (byte) -1;
        this.f24801s = -1;
        this.f24794l = abstractC12191c.m5831n();
    }

    private C9422m(boolean z) {
        this.f24800r = (byte) -1;
        this.f24801s = -1;
        this.f24794l = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9422m(C12180e c12180e, C12183g c12183g) {
        this.f24800r = (byte) -1;
        this.f24801s = -1;
        m15203T();
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
                            if (m5982K == 10) {
                                C9436p.C9438b mo5768b = (this.f24795m & 1) == 1 ? this.f24796n.mo5768b() : null;
                                C9436p c9436p = (C9436p) c12180e.m5952u(C9436p.f24871p, c12183g);
                                this.f24796n = c9436p;
                                if (mo5768b != null) {
                                    mo5768b.mo5830p(c9436p);
                                    this.f24796n = mo5768b.m15040t();
                                }
                                this.f24795m |= 1;
                            } else if (m5982K == 18) {
                                C9428o.C9430b mo5768b2 = (this.f24795m & 2) == 2 ? this.f24797o.mo5768b() : null;
                                C9428o c9428o = (C9428o) c12180e.m5952u(C9428o.f24844p, c12183g);
                                this.f24797o = c9428o;
                                if (mo5768b2 != null) {
                                    mo5768b2.mo5830p(c9428o);
                                    this.f24797o = mo5768b2.m15092t();
                                }
                                this.f24795m |= 2;
                            } else if (m5982K == 26) {
                                C9419l.C9421b mo5768b3 = (this.f24795m & 4) == 4 ? this.f24798p.mo5768b() : null;
                                C9419l c9419l = (C9419l) c12180e.m5952u(C9419l.f24776v, c12183g);
                                this.f24798p = c9419l;
                                if (mo5768b3 != null) {
                                    mo5768b3.mo5830p(c9419l);
                                    this.f24798p = mo5768b3.m15224x();
                                }
                                this.f24795m |= 4;
                            } else if (m5982K != 34) {
                                if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                }
                            } else {
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.f24799q = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.f24799q.add(c12180e.m5952u(C9386c.f24571U, c12183g));
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
                if ((z2 ? 1 : 0) & true) {
                    this.f24799q = Collections.unmodifiableList(this.f24799q);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24794l = m5997w.m5993j();
                    throw th3;
                }
                this.f24794l = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if ((z2 ? 1 : 0) & true) {
            this.f24799q = Collections.unmodifiableList(this.f24799q);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24794l = m5997w.m5993j();
            throw th4;
        }
        this.f24794l = m5997w.m5993j();
        mo5823n();
    }
}