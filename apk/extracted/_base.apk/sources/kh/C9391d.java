package kh;

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
import p326rh.C12199k;
import p326rh.InterfaceC12213s;

/* renamed from: kh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9391d extends AbstractC12188i.AbstractC12192d<C9391d> {

    /* renamed from: s */
    private static final C9391d f24641s;

    /* renamed from: t */
    public static InterfaceC12213s<C9391d> f24642t = new C9392a();

    /* renamed from: l */
    private final AbstractC12177d f24643l;

    /* renamed from: m */
    private int f24644m;

    /* renamed from: n */
    private int f24645n;

    /* renamed from: o */
    private List<C9458u> f24646o;

    /* renamed from: p */
    private List<Integer> f24647p;

    /* renamed from: q */
    private byte f24648q;

    /* renamed from: r */
    private int f24649r;

    /* renamed from: kh.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9392a extends AbstractC12173b<C9391d> {
        C9392a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9391d mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9391d(c12180e, c12183g);
        }
    }

    /* renamed from: kh.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9393b extends AbstractC12188i.AbstractC12191c<C9391d, C9393b> {

        /* renamed from: m */
        private int f24650m;

        /* renamed from: n */
        private int f24651n = 6;

        /* renamed from: o */
        private List<C9458u> f24652o = Collections.emptyList();

        /* renamed from: p */
        private List<Integer> f24653p = Collections.emptyList();

        private C9393b() {
            m15490C();
        }

        /* renamed from: A */
        private void m15492A() {
            if ((this.f24650m & 2) != 2) {
                this.f24652o = new ArrayList(this.f24652o);
                this.f24650m |= 2;
            }
        }

        /* renamed from: B */
        private void m15491B() {
            if ((this.f24650m & 4) != 4) {
                this.f24653p = new ArrayList(this.f24653p);
                this.f24650m |= 4;
            }
        }

        /* renamed from: C */
        private void m15490C() {
        }

        /* renamed from: v */
        static /* synthetic */ C9393b m15486v() {
            return m15482z();
        }

        /* renamed from: z */
        private static C9393b m15482z() {
            return new C9393b();
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: D */
        public C9393b mo5830p(C9391d c9391d) {
            if (c9391d == C9391d.m15506I()) {
                return this;
            }
            if (c9391d.m15499P()) {
                m15487F(c9391d.m15504K());
            }
            if (!c9391d.f24646o.isEmpty()) {
                if (this.f24652o.isEmpty()) {
                    this.f24652o = c9391d.f24646o;
                    this.f24650m &= -3;
                } else {
                    m15492A();
                    this.f24652o.addAll(c9391d.f24646o);
                }
            }
            if (!c9391d.f24647p.isEmpty()) {
                if (this.f24653p.isEmpty()) {
                    this.f24653p = c9391d.f24647p;
                    this.f24650m &= -5;
                } else {
                    m15491B();
                    this.f24653p.addAll(c9391d.f24647p);
                }
            }
            m5825u(c9391d);
            m5829q(m5831n().m6003d(c9391d.f24643l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9391d.C9393b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.d> r1 = kh.C9391d.f24642t     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.d r3 = (kh.C9391d) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.d r4 = (kh.C9391d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9391d.C9393b.mo6018k(rh.e, rh.g):kh.d$b");
        }

        /* renamed from: F */
        public C9393b m15487F(int i) {
            this.f24650m |= 1;
            this.f24651n = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9391d build() {
            C9391d m15484x = m15484x();
            if (m15484x.mo5761j()) {
                return m15484x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15484x);
        }

        /* renamed from: x */
        public C9391d m15484x() {
            C9391d c9391d = new C9391d(this);
            int i = 1;
            if ((this.f24650m & 1) != 1) {
                i = 0;
            }
            c9391d.f24645n = this.f24651n;
            if ((this.f24650m & 2) == 2) {
                this.f24652o = Collections.unmodifiableList(this.f24652o);
                this.f24650m &= -3;
            }
            c9391d.f24646o = this.f24652o;
            if ((this.f24650m & 4) == 4) {
                this.f24653p = Collections.unmodifiableList(this.f24653p);
                this.f24650m &= -5;
            }
            c9391d.f24647p = this.f24653p;
            c9391d.f24644m = i;
            return c9391d;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9393b mo5832m() {
            return m15482z().mo5830p(m15484x());
        }
    }

    static {
        C9391d c9391d = new C9391d(true);
        f24641s = c9391d;
        c9391d.m15498Q();
    }

    /* renamed from: I */
    public static C9391d m15506I() {
        return f24641s;
    }

    /* renamed from: Q */
    private void m15498Q() {
        this.f24645n = 6;
        this.f24646o = Collections.emptyList();
        this.f24647p = Collections.emptyList();
    }

    /* renamed from: R */
    public static C9393b m15497R() {
        return C9393b.m15486v();
    }

    /* renamed from: S */
    public static C9393b m15496S(C9391d c9391d) {
        return m15497R().mo5830p(c9391d);
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: J */
    public C9391d mo5762f() {
        return f24641s;
    }

    /* renamed from: K */
    public int m15504K() {
        return this.f24645n;
    }

    /* renamed from: L */
    public C9458u m15503L(int i) {
        return this.f24646o.get(i);
    }

    /* renamed from: M */
    public int m15502M() {
        return this.f24646o.size();
    }

    /* renamed from: N */
    public List<C9458u> m15501N() {
        return this.f24646o;
    }

    /* renamed from: O */
    public List<Integer> m15500O() {
        return this.f24647p;
    }

    /* renamed from: P */
    public boolean m15499P() {
        return (this.f24644m & 1) == 1;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: T */
    public C9393b mo5765e() {
        return m15497R();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: U */
    public C9393b mo5768b() {
        return m15496S(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24649r;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24644m & 1) == 1) {
            i = C12181f.m5892o(1, this.f24645n) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.f24646o.size(); i3++) {
            i += C12181f.m5884s(2, this.f24646o.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f24647p.size(); i5++) {
            i4 += C12181f.m5890p(this.f24647p.get(i5).intValue());
        }
        int size = i + i4 + (m15500O().size() * 2) + m5819u() + this.f24643l.size();
        this.f24649r = size;
        return size;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        if ((this.f24644m & 1) == 1) {
            c12181f.m5919a0(1, this.f24645n);
        }
        for (int i = 0; i < this.f24646o.size(); i++) {
            c12181f.m5913d0(2, this.f24646o.get(i));
        }
        for (int i2 = 0; i2 < this.f24647p.size(); i2++) {
            c12181f.m5919a0(31, this.f24647p.get(i2).intValue());
        }
        m5814z.m5813a(19000, c12181f);
        c12181f.m5903i0(this.f24643l);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9391d> mo5764g() {
        return f24642t;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24648q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m15502M(); i++) {
            if (!m15503L(i).mo5761j()) {
                this.f24648q = (byte) 0;
                return false;
            }
        }
        if (!m5820t()) {
            this.f24648q = (byte) 0;
            return false;
        }
        this.f24648q = (byte) 1;
        return true;
    }

    private C9391d(AbstractC12188i.AbstractC12191c<C9391d, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f24648q = (byte) -1;
        this.f24649r = -1;
        this.f24643l = abstractC12191c.m5831n();
    }

    private C9391d(boolean z) {
        this.f24648q = (byte) -1;
        this.f24649r = -1;
        this.f24643l = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9391d(C12180e c12180e, C12183g c12183g) {
        this.f24648q = (byte) -1;
        this.f24649r = -1;
        m15498Q();
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
                            if (m5982K == 8) {
                                this.f24644m |= 1;
                                this.f24645n = c12180e.m5954s();
                            } else if (m5982K == 18) {
                                if (!(z2 & true)) {
                                    this.f24646o = new ArrayList();
                                    z2 |= true;
                                }
                                this.f24646o.add(c12180e.m5952u(C9458u.f24996w, c12183g));
                            } else if (m5982K == 248) {
                                if (!(z2 & true)) {
                                    this.f24647p = new ArrayList();
                                    z2 |= true;
                                }
                                this.f24647p.add(Integer.valueOf(c12180e.m5954s()));
                            } else if (m5982K != 250) {
                                if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                }
                            } else {
                                int m5963j = c12180e.m5963j(c12180e.m5992A());
                                if (!(z2 & true) && c12180e.m5968e() > 0) {
                                    this.f24647p = new ArrayList();
                                    z2 |= true;
                                }
                                while (c12180e.m5968e() > 0) {
                                    this.f24647p.add(Integer.valueOf(c12180e.m5954s()));
                                }
                                c12180e.m5964i(m5963j);
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
                if (z2 & true) {
                    this.f24646o = Collections.unmodifiableList(this.f24646o);
                }
                if (z2 & true) {
                    this.f24647p = Collections.unmodifiableList(this.f24647p);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24643l = m5997w.m5993j();
                    throw th3;
                }
                this.f24643l = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f24646o = Collections.unmodifiableList(this.f24646o);
        }
        if (z2 & true) {
            this.f24647p = Collections.unmodifiableList(this.f24647p);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24643l = m5997w.m5993j();
            throw th4;
        }
        this.f24643l = m5997w.m5993j();
        mo5823n();
    }
}
