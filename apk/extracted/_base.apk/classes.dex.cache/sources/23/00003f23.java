package kh;

import java.io.IOException;
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
import p326rh.C12196j;
import p326rh.C12199k;
import p326rh.InterfaceC12212r;
import p326rh.InterfaceC12213s;

/* renamed from: kh.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9407h extends AbstractC12188i implements InterfaceC12212r {

    /* renamed from: v */
    private static final C9407h f24698v;

    /* renamed from: w */
    public static InterfaceC12213s<C9407h> f24699w = new C9408a();

    /* renamed from: k */
    private final AbstractC12177d f24700k;

    /* renamed from: l */
    private int f24701l;

    /* renamed from: m */
    private int f24702m;

    /* renamed from: n */
    private int f24703n;

    /* renamed from: o */
    private EnumC9410c f24704o;

    /* renamed from: p */
    private C9439q f24705p;

    /* renamed from: q */
    private int f24706q;

    /* renamed from: r */
    private List<C9407h> f24707r;

    /* renamed from: s */
    private List<C9407h> f24708s;

    /* renamed from: t */
    private byte f24709t;

    /* renamed from: u */
    private int f24710u;

    /* renamed from: kh.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9408a extends AbstractC12173b<C9407h> {
        C9408a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9407h mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9407h(c12180e, c12183g);
        }
    }

    /* renamed from: kh.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9409b extends AbstractC12188i.AbstractC12190b<C9407h, C9409b> implements InterfaceC12212r {

        /* renamed from: k */
        private int f24711k;

        /* renamed from: l */
        private int f24712l;

        /* renamed from: m */
        private int f24713m;

        /* renamed from: p */
        private int f24716p;

        /* renamed from: n */
        private EnumC9410c f24714n = EnumC9410c.TRUE;

        /* renamed from: o */
        private C9439q f24715o = C9439q.m15008Y();

        /* renamed from: q */
        private List<C9407h> f24717q = Collections.emptyList();

        /* renamed from: r */
        private List<C9407h> f24718r = Collections.emptyList();

        private C9409b() {
            m15355y();
        }

        /* renamed from: r */
        static /* synthetic */ C9409b m15362r() {
            return m15358v();
        }

        /* renamed from: v */
        private static C9409b m15358v() {
            return new C9409b();
        }

        /* renamed from: w */
        private void m15357w() {
            if ((this.f24711k & 32) != 32) {
                this.f24717q = new ArrayList(this.f24717q);
                this.f24711k |= 32;
            }
        }

        /* renamed from: x */
        private void m15356x() {
            if ((this.f24711k & 64) != 64) {
                this.f24718r = new ArrayList(this.f24718r);
                this.f24711k |= 64;
            }
        }

        /* renamed from: y */
        private void m15355y() {
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9407h.C9409b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.h> r1 = kh.C9407h.f24699w     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.h r3 = (kh.C9407h) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.h r4 = (kh.C9407h) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9407h.C9409b.mo6018k(rh.e, rh.g):kh.h$b");
        }

        /* renamed from: B */
        public C9409b m15367B(C9439q c9439q) {
            if ((this.f24711k & 8) == 8 && this.f24715o != C9439q.m15008Y()) {
                this.f24715o = C9439q.m14981z0(this.f24715o).mo5830p(c9439q).m14929x();
            } else {
                this.f24715o = c9439q;
            }
            this.f24711k |= 8;
            return this;
        }

        /* renamed from: C */
        public C9409b m15366C(EnumC9410c enumC9410c) {
            enumC9410c.getClass();
            this.f24711k |= 4;
            this.f24714n = enumC9410c;
            return this;
        }

        /* renamed from: D */
        public C9409b m15365D(int i) {
            this.f24711k |= 1;
            this.f24712l = i;
            return this;
        }

        /* renamed from: E */
        public C9409b m15364E(int i) {
            this.f24711k |= 16;
            this.f24716p = i;
            return this;
        }

        /* renamed from: F */
        public C9409b m15363F(int i) {
            this.f24711k |= 2;
            this.f24713m = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: s */
        public C9407h build() {
            C9407h m15360t = m15360t();
            if (m15360t.mo5761j()) {
                return m15360t;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15360t);
        }

        /* renamed from: t */
        public C9407h m15360t() {
            C9407h c9407h = new C9407h(this);
            int i = this.f24711k;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            c9407h.f24702m = this.f24712l;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c9407h.f24703n = this.f24713m;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c9407h.f24704o = this.f24714n;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c9407h.f24705p = this.f24715o;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c9407h.f24706q = this.f24716p;
            if ((this.f24711k & 32) == 32) {
                this.f24717q = Collections.unmodifiableList(this.f24717q);
                this.f24711k &= -33;
            }
            c9407h.f24707r = this.f24717q;
            if ((this.f24711k & 64) == 64) {
                this.f24718r = Collections.unmodifiableList(this.f24718r);
                this.f24711k &= -65;
            }
            c9407h.f24708s = this.f24718r;
            c9407h.f24701l = i2;
            return c9407h;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: u */
        public C9409b mo5832m() {
            return m15358v().mo5830p(m15360t());
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: z */
        public C9409b mo5830p(C9407h c9407h) {
            if (c9407h == C9407h.m15394G()) {
                return this;
            }
            if (c9407h.m15386O()) {
                m15365D(c9407h.m15393H());
            }
            if (c9407h.m15383R()) {
                m15363F(c9407h.m15388M());
            }
            if (c9407h.m15387N()) {
                m15366C(c9407h.m15395F());
            }
            if (c9407h.m15385P()) {
                m15367B(c9407h.m15392I());
            }
            if (c9407h.m15384Q()) {
                m15364E(c9407h.m15391J());
            }
            if (!c9407h.f24707r.isEmpty()) {
                if (this.f24717q.isEmpty()) {
                    this.f24717q = c9407h.f24707r;
                    this.f24711k &= -33;
                } else {
                    m15357w();
                    this.f24717q.addAll(c9407h.f24707r);
                }
            }
            if (!c9407h.f24708s.isEmpty()) {
                if (this.f24718r.isEmpty()) {
                    this.f24718r = c9407h.f24708s;
                    this.f24711k &= -65;
                } else {
                    m15356x();
                    this.f24718r.addAll(c9407h.f24708s);
                }
            }
            m5829q(m5831n().m6003d(c9407h.f24700k));
            return this;
        }
    }

    /* renamed from: kh.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC9410c implements C12196j.InterfaceC12197a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        

        /* renamed from: n */
        private static C12196j.InterfaceC12198b<EnumC9410c> f24722n = new C9411a();

        /* renamed from: j */
        private final int f24724j;

        /* renamed from: kh.h$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C9411a implements C12196j.InterfaceC12198b<EnumC9410c> {
            C9411a() {
            }

            @Override // p326rh.C12196j.InterfaceC12198b
            /* renamed from: b */
            public EnumC9410c mo5797a(int i) {
                return EnumC9410c.m15353a(i);
            }
        }

        EnumC9410c(int i, int i2) {
            this.f24724j = i2;
        }

        /* renamed from: a */
        public static EnumC9410c m15353a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return NULL;
                }
                return FALSE;
            }
            return TRUE;
        }

        @Override // p326rh.C12196j.InterfaceC12197a
        public final int getNumber() {
            return this.f24724j;
        }
    }

    static {
        C9407h c9407h = new C9407h(true);
        f24698v = c9407h;
        c9407h.m15382S();
    }

    /* renamed from: G */
    public static C9407h m15394G() {
        return f24698v;
    }

    /* renamed from: S */
    private void m15382S() {
        this.f24702m = 0;
        this.f24703n = 0;
        this.f24704o = EnumC9410c.TRUE;
        this.f24705p = C9439q.m15008Y();
        this.f24706q = 0;
        this.f24707r = Collections.emptyList();
        this.f24708s = Collections.emptyList();
    }

    /* renamed from: T */
    public static C9409b m15381T() {
        return C9409b.m15362r();
    }

    /* renamed from: U */
    public static C9409b m15380U(C9407h c9407h) {
        return m15381T().mo5830p(c9407h);
    }

    /* renamed from: D */
    public C9407h m15397D(int i) {
        return this.f24707r.get(i);
    }

    /* renamed from: E */
    public int m15396E() {
        return this.f24707r.size();
    }

    /* renamed from: F */
    public EnumC9410c m15395F() {
        return this.f24704o;
    }

    /* renamed from: H */
    public int m15393H() {
        return this.f24702m;
    }

    /* renamed from: I */
    public C9439q m15392I() {
        return this.f24705p;
    }

    /* renamed from: J */
    public int m15391J() {
        return this.f24706q;
    }

    /* renamed from: K */
    public C9407h m15390K(int i) {
        return this.f24708s.get(i);
    }

    /* renamed from: L */
    public int m15389L() {
        return this.f24708s.size();
    }

    /* renamed from: M */
    public int m15388M() {
        return this.f24703n;
    }

    /* renamed from: N */
    public boolean m15387N() {
        return (this.f24701l & 4) == 4;
    }

    /* renamed from: O */
    public boolean m15386O() {
        return (this.f24701l & 1) == 1;
    }

    /* renamed from: P */
    public boolean m15385P() {
        return (this.f24701l & 8) == 8;
    }

    /* renamed from: Q */
    public boolean m15384Q() {
        return (this.f24701l & 16) == 16;
    }

    /* renamed from: R */
    public boolean m15383R() {
        return (this.f24701l & 2) == 2;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: V */
    public C9409b mo5765e() {
        return m15381T();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: W */
    public C9409b mo5768b() {
        return m15380U(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24710u;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24701l & 1) == 1) {
            i = C12181f.m5892o(1, this.f24702m) + 0;
        } else {
            i = 0;
        }
        if ((this.f24701l & 2) == 2) {
            i += C12181f.m5892o(2, this.f24703n);
        }
        if ((this.f24701l & 4) == 4) {
            i += C12181f.m5906h(3, this.f24704o.getNumber());
        }
        if ((this.f24701l & 8) == 8) {
            i += C12181f.m5884s(4, this.f24705p);
        }
        if ((this.f24701l & 16) == 16) {
            i += C12181f.m5892o(5, this.f24706q);
        }
        for (int i3 = 0; i3 < this.f24707r.size(); i3++) {
            i += C12181f.m5884s(6, this.f24707r.get(i3));
        }
        for (int i4 = 0; i4 < this.f24708s.size(); i4++) {
            i += C12181f.m5884s(7, this.f24708s.get(i4));
        }
        int size = i + this.f24700k.size();
        this.f24710u = size;
        return size;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        if ((this.f24701l & 1) == 1) {
            c12181f.m5919a0(1, this.f24702m);
        }
        if ((this.f24701l & 2) == 2) {
            c12181f.m5919a0(2, this.f24703n);
        }
        if ((this.f24701l & 4) == 4) {
            c12181f.m5928S(3, this.f24704o.getNumber());
        }
        if ((this.f24701l & 8) == 8) {
            c12181f.m5913d0(4, this.f24705p);
        }
        if ((this.f24701l & 16) == 16) {
            c12181f.m5919a0(5, this.f24706q);
        }
        for (int i = 0; i < this.f24707r.size(); i++) {
            c12181f.m5913d0(6, this.f24707r.get(i));
        }
        for (int i2 = 0; i2 < this.f24708s.size(); i2++) {
            c12181f.m5913d0(7, this.f24708s.get(i2));
        }
        c12181f.m5903i0(this.f24700k);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9407h> mo5764g() {
        return f24699w;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24709t;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m15385P() && !m15392I().mo5761j()) {
            this.f24709t = (byte) 0;
            return false;
        }
        for (int i = 0; i < m15396E(); i++) {
            if (!m15397D(i).mo5761j()) {
                this.f24709t = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < m15389L(); i2++) {
            if (!m15390K(i2).mo5761j()) {
                this.f24709t = (byte) 0;
                return false;
            }
        }
        this.f24709t = (byte) 1;
        return true;
    }

    private C9407h(AbstractC12188i.AbstractC12190b abstractC12190b) {
        super(abstractC12190b);
        this.f24709t = (byte) -1;
        this.f24710u = -1;
        this.f24700k = abstractC12190b.m5831n();
    }

    private C9407h(boolean z) {
        this.f24709t = (byte) -1;
        this.f24710u = -1;
        this.f24700k = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9407h(C12180e c12180e, C12183g c12183g) {
        this.f24709t = (byte) -1;
        this.f24710u = -1;
        m15382S();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int m5982K = c12180e.m5982K();
                    if (m5982K != 0) {
                        if (m5982K == 8) {
                            this.f24701l |= 1;
                            this.f24702m = c12180e.m5954s();
                        } else if (m5982K == 16) {
                            this.f24701l |= 2;
                            this.f24703n = c12180e.m5954s();
                        } else if (m5982K == 24) {
                            int m5959n = c12180e.m5959n();
                            EnumC9410c m15353a = EnumC9410c.m15353a(m5959n);
                            if (m15353a == null) {
                                m5937J.m5891o0(m5982K);
                                m5937J.m5891o0(m5959n);
                            } else {
                                this.f24701l |= 4;
                                this.f24704o = m15353a;
                            }
                        } else if (m5982K == 34) {
                            C9439q.C9446c mo5768b = (this.f24701l & 8) == 8 ? this.f24705p.mo5768b() : null;
                            C9439q c9439q = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                            this.f24705p = c9439q;
                            if (mo5768b != null) {
                                mo5768b.mo5830p(c9439q);
                                this.f24705p = mo5768b.m14929x();
                            }
                            this.f24701l |= 8;
                        } else if (m5982K == 40) {
                            this.f24701l |= 16;
                            this.f24706q = c12180e.m5954s();
                        } else if (m5982K == 50) {
                            if (!(z2 & true)) {
                                this.f24707r = new ArrayList();
                                z2 |= true;
                            }
                            this.f24707r.add(c12180e.m5952u(f24699w, c12183g));
                        } else if (m5982K != 58) {
                            if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.f24708s = new ArrayList();
                                z2 |= true;
                            }
                            this.f24708s.add(c12180e.m5952u(f24699w, c12183g));
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
                    this.f24707r = Collections.unmodifiableList(this.f24707r);
                }
                if (z2 & true) {
                    this.f24708s = Collections.unmodifiableList(this.f24708s);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24700k = m5997w.m5993j();
                    throw th3;
                }
                this.f24700k = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f24707r = Collections.unmodifiableList(this.f24707r);
        }
        if (z2 & true) {
            this.f24708s = Collections.unmodifiableList(this.f24708s);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24700k = m5997w.m5993j();
            throw th4;
        }
        this.f24700k = m5997w.m5993j();
        mo5823n();
    }
}