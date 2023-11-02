package kh;

import java.io.IOException;
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

/* renamed from: kh.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9461v extends AbstractC12188i implements InterfaceC12212r {

    /* renamed from: u */
    private static final C9461v f25014u;

    /* renamed from: v */
    public static InterfaceC12213s<C9461v> f25015v = new C9462a();

    /* renamed from: k */
    private final AbstractC12177d f25016k;

    /* renamed from: l */
    private int f25017l;

    /* renamed from: m */
    private int f25018m;

    /* renamed from: n */
    private int f25019n;

    /* renamed from: o */
    private EnumC9464c f25020o;

    /* renamed from: p */
    private int f25021p;

    /* renamed from: q */
    private int f25022q;

    /* renamed from: r */
    private EnumC9466d f25023r;

    /* renamed from: s */
    private byte f25024s;

    /* renamed from: t */
    private int f25025t;

    /* renamed from: kh.v$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9462a extends AbstractC12173b<C9461v> {
        C9462a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9461v mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9461v(c12180e, c12183g);
        }
    }

    /* renamed from: kh.v$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9463b extends AbstractC12188i.AbstractC12190b<C9461v, C9463b> implements InterfaceC12212r {

        /* renamed from: k */
        private int f25026k;

        /* renamed from: l */
        private int f25027l;

        /* renamed from: m */
        private int f25028m;

        /* renamed from: o */
        private int f25030o;

        /* renamed from: p */
        private int f25031p;

        /* renamed from: n */
        private EnumC9464c f25029n = EnumC9464c.ERROR;

        /* renamed from: q */
        private EnumC9466d f25032q = EnumC9466d.LANGUAGE_VERSION;

        private C9463b() {
            m14715w();
        }

        /* renamed from: r */
        static /* synthetic */ C9463b m14720r() {
            return m14716v();
        }

        /* renamed from: v */
        private static C9463b m14716v() {
            return new C9463b();
        }

        /* renamed from: w */
        private void m14715w() {
        }

        /* renamed from: A */
        public C9463b m14725A(EnumC9464c enumC9464c) {
            enumC9464c.getClass();
            this.f25026k |= 4;
            this.f25029n = enumC9464c;
            return this;
        }

        /* renamed from: B */
        public C9463b m14724B(int i) {
            this.f25026k |= 16;
            this.f25031p = i;
            return this;
        }

        /* renamed from: C */
        public C9463b m14723C(int i) {
            this.f25026k |= 1;
            this.f25027l = i;
            return this;
        }

        /* renamed from: D */
        public C9463b m14722D(int i) {
            this.f25026k |= 2;
            this.f25028m = i;
            return this;
        }

        /* renamed from: E */
        public C9463b m14721E(EnumC9466d enumC9466d) {
            enumC9466d.getClass();
            this.f25026k |= 32;
            this.f25032q = enumC9466d;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: s */
        public C9461v build() {
            C9461v m14718t = m14718t();
            if (m14718t.mo5761j()) {
                return m14718t;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m14718t);
        }

        /* renamed from: t */
        public C9461v m14718t() {
            C9461v c9461v = new C9461v(this);
            int i = this.f25026k;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            c9461v.f25018m = this.f25027l;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c9461v.f25019n = this.f25028m;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c9461v.f25020o = this.f25029n;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c9461v.f25021p = this.f25030o;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c9461v.f25022q = this.f25031p;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            c9461v.f25023r = this.f25032q;
            c9461v.f25017l = i2;
            return c9461v;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: u */
        public C9463b mo5832m() {
            return m14716v().mo5830p(m14718t());
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: x */
        public C9463b mo5830p(C9461v c9461v) {
            if (c9461v == C9461v.m14752A()) {
                return this;
            }
            if (c9461v.m14742K()) {
                m14723C(c9461v.m14748E());
            }
            if (c9461v.m14741L()) {
                m14722D(c9461v.m14747F());
            }
            if (c9461v.m14744I()) {
                m14725A(c9461v.m14750C());
            }
            if (c9461v.m14745H()) {
                m14712z(c9461v.m14751B());
            }
            if (c9461v.m14743J()) {
                m14724B(c9461v.m14749D());
            }
            if (c9461v.m14740M()) {
                m14721E(c9461v.m14746G());
            }
            m5829q(m5831n().m6003d(c9461v.f25016k));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: y */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9461v.C9463b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.v> r1 = kh.C9461v.f25015v     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.v r3 = (kh.C9461v) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.v r4 = (kh.C9461v) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9461v.C9463b.mo6018k(rh.e, rh.g):kh.v$b");
        }

        /* renamed from: z */
        public C9463b m14712z(int i) {
            this.f25026k |= 8;
            this.f25030o = i;
            return this;
        }
    }

    /* renamed from: kh.v$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC9464c implements C12196j.InterfaceC12197a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        

        /* renamed from: n */
        private static C12196j.InterfaceC12198b<EnumC9464c> f25036n = new C9465a();

        /* renamed from: j */
        private final int f25038j;

        /* renamed from: kh.v$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C9465a implements C12196j.InterfaceC12198b<EnumC9464c> {
            C9465a() {
            }

            @Override // p326rh.C12196j.InterfaceC12198b
            /* renamed from: b */
            public EnumC9464c mo5797a(int i) {
                return EnumC9464c.m14711a(i);
            }
        }

        EnumC9464c(int i, int i2) {
            this.f25038j = i2;
        }

        /* renamed from: a */
        public static EnumC9464c m14711a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return HIDDEN;
                }
                return ERROR;
            }
            return WARNING;
        }

        @Override // p326rh.C12196j.InterfaceC12197a
        public final int getNumber() {
            return this.f25038j;
        }
    }

    /* renamed from: kh.v$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC9466d implements C12196j.InterfaceC12197a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        

        /* renamed from: n */
        private static C12196j.InterfaceC12198b<EnumC9466d> f25042n = new C9467a();

        /* renamed from: j */
        private final int f25044j;

        /* renamed from: kh.v$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C9467a implements C12196j.InterfaceC12198b<EnumC9466d> {
            C9467a() {
            }

            @Override // p326rh.C12196j.InterfaceC12198b
            /* renamed from: b */
            public EnumC9466d mo5797a(int i) {
                return EnumC9466d.m14709a(i);
            }
        }

        EnumC9466d(int i, int i2) {
            this.f25044j = i2;
        }

        /* renamed from: a */
        public static EnumC9466d m14709a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return API_VERSION;
                }
                return COMPILER_VERSION;
            }
            return LANGUAGE_VERSION;
        }

        @Override // p326rh.C12196j.InterfaceC12197a
        public final int getNumber() {
            return this.f25044j;
        }
    }

    static {
        C9461v c9461v = new C9461v(true);
        f25014u = c9461v;
        c9461v.m14739N();
    }

    /* renamed from: A */
    public static C9461v m14752A() {
        return f25014u;
    }

    /* renamed from: N */
    private void m14739N() {
        this.f25018m = 0;
        this.f25019n = 0;
        this.f25020o = EnumC9464c.ERROR;
        this.f25021p = 0;
        this.f25022q = 0;
        this.f25023r = EnumC9466d.LANGUAGE_VERSION;
    }

    /* renamed from: O */
    public static C9463b m14738O() {
        return C9463b.m14720r();
    }

    /* renamed from: P */
    public static C9463b m14737P(C9461v c9461v) {
        return m14738O().mo5830p(c9461v);
    }

    /* renamed from: B */
    public int m14751B() {
        return this.f25021p;
    }

    /* renamed from: C */
    public EnumC9464c m14750C() {
        return this.f25020o;
    }

    /* renamed from: D */
    public int m14749D() {
        return this.f25022q;
    }

    /* renamed from: E */
    public int m14748E() {
        return this.f25018m;
    }

    /* renamed from: F */
    public int m14747F() {
        return this.f25019n;
    }

    /* renamed from: G */
    public EnumC9466d m14746G() {
        return this.f25023r;
    }

    /* renamed from: H */
    public boolean m14745H() {
        return (this.f25017l & 8) == 8;
    }

    /* renamed from: I */
    public boolean m14744I() {
        return (this.f25017l & 4) == 4;
    }

    /* renamed from: J */
    public boolean m14743J() {
        return (this.f25017l & 16) == 16;
    }

    /* renamed from: K */
    public boolean m14742K() {
        return (this.f25017l & 1) == 1;
    }

    /* renamed from: L */
    public boolean m14741L() {
        return (this.f25017l & 2) == 2;
    }

    /* renamed from: M */
    public boolean m14740M() {
        return (this.f25017l & 32) == 32;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: Q */
    public C9463b mo5765e() {
        return m14738O();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: R */
    public C9463b mo5768b() {
        return m14737P(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i = this.f25025t;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f25017l & 1) == 1) {
            i2 = 0 + C12181f.m5892o(1, this.f25018m);
        }
        if ((this.f25017l & 2) == 2) {
            i2 += C12181f.m5892o(2, this.f25019n);
        }
        if ((this.f25017l & 4) == 4) {
            i2 += C12181f.m5906h(3, this.f25020o.getNumber());
        }
        if ((this.f25017l & 8) == 8) {
            i2 += C12181f.m5892o(4, this.f25021p);
        }
        if ((this.f25017l & 16) == 16) {
            i2 += C12181f.m5892o(5, this.f25022q);
        }
        if ((this.f25017l & 32) == 32) {
            i2 += C12181f.m5906h(6, this.f25023r.getNumber());
        }
        int size = i2 + this.f25016k.size();
        this.f25025t = size;
        return size;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        if ((this.f25017l & 1) == 1) {
            c12181f.m5919a0(1, this.f25018m);
        }
        if ((this.f25017l & 2) == 2) {
            c12181f.m5919a0(2, this.f25019n);
        }
        if ((this.f25017l & 4) == 4) {
            c12181f.m5928S(3, this.f25020o.getNumber());
        }
        if ((this.f25017l & 8) == 8) {
            c12181f.m5919a0(4, this.f25021p);
        }
        if ((this.f25017l & 16) == 16) {
            c12181f.m5919a0(5, this.f25022q);
        }
        if ((this.f25017l & 32) == 32) {
            c12181f.m5928S(6, this.f25023r.getNumber());
        }
        c12181f.m5903i0(this.f25016k);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9461v> mo5764g() {
        return f25015v;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f25024s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f25024s = (byte) 1;
        return true;
    }

    private C9461v(AbstractC12188i.AbstractC12190b abstractC12190b) {
        super(abstractC12190b);
        this.f25024s = (byte) -1;
        this.f25025t = -1;
        this.f25016k = abstractC12190b.m5831n();
    }

    private C9461v(boolean z) {
        this.f25024s = (byte) -1;
        this.f25025t = -1;
        this.f25016k = AbstractC12177d.f31693j;
    }

    private C9461v(C12180e c12180e, C12183g c12183g) {
        this.f25024s = (byte) -1;
        this.f25025t = -1;
        m14739N();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int m5982K = c12180e.m5982K();
                    if (m5982K != 0) {
                        if (m5982K == 8) {
                            this.f25017l |= 1;
                            this.f25018m = c12180e.m5954s();
                        } else if (m5982K == 16) {
                            this.f25017l |= 2;
                            this.f25019n = c12180e.m5954s();
                        } else if (m5982K == 24) {
                            int m5959n = c12180e.m5959n();
                            EnumC9464c m14711a = EnumC9464c.m14711a(m5959n);
                            if (m14711a == null) {
                                m5937J.m5891o0(m5982K);
                                m5937J.m5891o0(m5959n);
                            } else {
                                this.f25017l |= 4;
                                this.f25020o = m14711a;
                            }
                        } else if (m5982K == 32) {
                            this.f25017l |= 8;
                            this.f25021p = c12180e.m5954s();
                        } else if (m5982K == 40) {
                            this.f25017l |= 16;
                            this.f25022q = c12180e.m5954s();
                        } else if (m5982K != 48) {
                            if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                            }
                        } else {
                            int m5959n2 = c12180e.m5959n();
                            EnumC9466d m14709a = EnumC9466d.m14709a(m5959n2);
                            if (m14709a == null) {
                                m5937J.m5891o0(m5982K);
                                m5937J.m5891o0(m5959n2);
                            } else {
                                this.f25017l |= 32;
                                this.f25023r = m14709a;
                            }
                        }
                    }
                    z = true;
                } catch (C12199k e) {
                    throw e.m5788i(this);
                } catch (IOException e2) {
                    throw new C12199k(e2.getMessage()).m5788i(this);
                }
            } catch (Throwable th2) {
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f25016k = m5997w.m5993j();
                    throw th3;
                }
                this.f25016k = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f25016k = m5997w.m5993j();
            throw th4;
        }
        this.f25016k = m5997w.m5993j();
        mo5823n();
    }
}
