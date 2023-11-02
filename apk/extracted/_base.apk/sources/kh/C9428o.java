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
import p326rh.C12196j;
import p326rh.C12199k;
import p326rh.InterfaceC12212r;
import p326rh.InterfaceC12213s;

/* renamed from: kh.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9428o extends AbstractC12188i implements InterfaceC12212r {

    /* renamed from: o */
    private static final C9428o f24843o;

    /* renamed from: p */
    public static InterfaceC12213s<C9428o> f24844p = new C9429a();

    /* renamed from: k */
    private final AbstractC12177d f24845k;

    /* renamed from: l */
    private List<C9431c> f24846l;

    /* renamed from: m */
    private byte f24847m;

    /* renamed from: n */
    private int f24848n;

    /* renamed from: kh.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9429a extends AbstractC12173b<C9428o> {
        C9429a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9428o mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9428o(c12180e, c12183g);
        }
    }

    /* renamed from: kh.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9430b extends AbstractC12188i.AbstractC12190b<C9428o, C9430b> implements InterfaceC12212r {

        /* renamed from: k */
        private int f24849k;

        /* renamed from: l */
        private List<C9431c> f24850l = Collections.emptyList();

        private C9430b() {
            m15088x();
        }

        /* renamed from: r */
        static /* synthetic */ C9430b m15094r() {
            return m15090v();
        }

        /* renamed from: v */
        private static C9430b m15090v() {
            return new C9430b();
        }

        /* renamed from: w */
        private void m15089w() {
            if ((this.f24849k & 1) != 1) {
                this.f24850l = new ArrayList(this.f24850l);
                this.f24849k |= 1;
            }
        }

        /* renamed from: x */
        private void m15088x() {
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: s */
        public C9428o build() {
            C9428o m15092t = m15092t();
            if (m15092t.mo5761j()) {
                return m15092t;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15092t);
        }

        /* renamed from: t */
        public C9428o m15092t() {
            C9428o c9428o = new C9428o(this);
            if ((this.f24849k & 1) == 1) {
                this.f24850l = Collections.unmodifiableList(this.f24850l);
                this.f24849k &= -2;
            }
            c9428o.f24846l = this.f24850l;
            return c9428o;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: u */
        public C9430b mo5832m() {
            return m15090v().mo5830p(m15092t());
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9430b mo5830p(C9428o c9428o) {
            if (c9428o == C9428o.m15100v()) {
                return this;
            }
            if (!c9428o.f24846l.isEmpty()) {
                if (this.f24850l.isEmpty()) {
                    this.f24850l = c9428o.f24846l;
                    this.f24849k &= -2;
                } else {
                    m15089w();
                    this.f24850l.addAll(c9428o.f24846l);
                }
            }
            m5829q(m5831n().m6003d(c9428o.f24845k));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9428o.C9430b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.o> r1 = kh.C9428o.f24844p     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.o r3 = (kh.C9428o) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.o r4 = (kh.C9428o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9428o.C9430b.mo6018k(rh.e, rh.g):kh.o$b");
        }
    }

    static {
        C9428o c9428o = new C9428o(true);
        f24843o = c9428o;
        c9428o.m15097y();
    }

    /* renamed from: A */
    public static C9430b m15106A(C9428o c9428o) {
        return m15096z().mo5830p(c9428o);
    }

    /* renamed from: v */
    public static C9428o m15100v() {
        return f24843o;
    }

    /* renamed from: y */
    private void m15097y() {
        this.f24846l = Collections.emptyList();
    }

    /* renamed from: z */
    public static C9430b m15096z() {
        return C9430b.m15094r();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: B */
    public C9430b mo5765e() {
        return m15096z();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: C */
    public C9430b mo5768b() {
        return m15106A(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i = this.f24848n;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f24846l.size(); i3++) {
            i2 += C12181f.m5884s(1, this.f24846l.get(i3));
        }
        int size = i2 + this.f24845k.size();
        this.f24848n = size;
        return size;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        for (int i = 0; i < this.f24846l.size(); i++) {
            c12181f.m5913d0(1, this.f24846l.get(i));
        }
        c12181f.m5903i0(this.f24845k);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9428o> mo5764g() {
        return f24844p;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24847m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m15098x(); i++) {
            if (!m15099w(i).mo5761j()) {
                this.f24847m = (byte) 0;
                return false;
            }
        }
        this.f24847m = (byte) 1;
        return true;
    }

    /* renamed from: w */
    public C9431c m15099w(int i) {
        return this.f24846l.get(i);
    }

    /* renamed from: x */
    public int m15098x() {
        return this.f24846l.size();
    }

    /* renamed from: kh.o$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9431c extends AbstractC12188i implements InterfaceC12212r {

        /* renamed from: r */
        private static final C9431c f24851r;

        /* renamed from: s */
        public static InterfaceC12213s<C9431c> f24852s = new C9432a();

        /* renamed from: k */
        private final AbstractC12177d f24853k;

        /* renamed from: l */
        private int f24854l;

        /* renamed from: m */
        private int f24855m;

        /* renamed from: n */
        private int f24856n;

        /* renamed from: o */
        private EnumC9434c f24857o;

        /* renamed from: p */
        private byte f24858p;

        /* renamed from: q */
        private int f24859q;

        /* renamed from: kh.o$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C9432a extends AbstractC12173b<C9431c> {
            C9432a() {
            }

            @Override // p326rh.InterfaceC12213s
            /* renamed from: m */
            public C9431c mo5759b(C12180e c12180e, C12183g c12183g) {
                return new C9431c(c12180e, c12183g);
            }
        }

        /* renamed from: kh.o$c$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9433b extends AbstractC12188i.AbstractC12190b<C9431c, C9433b> implements InterfaceC12212r {

            /* renamed from: k */
            private int f24860k;

            /* renamed from: m */
            private int f24862m;

            /* renamed from: l */
            private int f24861l = -1;

            /* renamed from: n */
            private EnumC9434c f24863n = EnumC9434c.PACKAGE;

            private C9433b() {
                m15060w();
            }

            /* renamed from: r */
            static /* synthetic */ C9433b m15065r() {
                return m15061v();
            }

            /* renamed from: v */
            private static C9433b m15061v() {
                return new C9433b();
            }

            /* renamed from: w */
            private void m15060w() {
            }

            /* renamed from: A */
            public C9433b m15067A(int i) {
                this.f24860k |= 1;
                this.f24861l = i;
                return this;
            }

            /* renamed from: B */
            public C9433b m15066B(int i) {
                this.f24860k |= 2;
                this.f24862m = i;
                return this;
            }

            @Override // p326rh.InterfaceC12210q.InterfaceC12211a
            /* renamed from: s */
            public C9431c build() {
                C9431c m15063t = m15063t();
                if (m15063t.mo5761j()) {
                    return m15063t;
                }
                throw AbstractC12170a.AbstractC12171a.m6017l(m15063t);
            }

            /* renamed from: t */
            public C9431c m15063t() {
                C9431c c9431c = new C9431c(this);
                int i = this.f24860k;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                c9431c.f24855m = this.f24861l;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                c9431c.f24856n = this.f24862m;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                c9431c.f24857o = this.f24863n;
                c9431c.f24854l = i2;
                return c9431c;
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: u */
            public C9433b mo5832m() {
                return m15061v().mo5830p(m15063t());
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: x */
            public C9433b mo5830p(C9431c c9431c) {
                if (c9431c == C9431c.m15071x()) {
                    return this;
                }
                if (c9431c.m15083C()) {
                    m15067A(c9431c.m15069z());
                }
                if (c9431c.m15082D()) {
                    m15066B(c9431c.m15085A());
                }
                if (c9431c.m15084B()) {
                    m15057z(c9431c.m15070y());
                }
                m5829q(m5831n().m6003d(c9431c.f24853k));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // p326rh.AbstractC12170a.AbstractC12171a
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kh.C9428o.C9431c.C9433b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    rh.s<kh.o$c> r1 = kh.C9428o.C9431c.f24852s     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    kh.o$c r3 = (kh.C9428o.C9431c) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                    kh.o$c r4 = (kh.C9428o.C9431c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kh.C9428o.C9431c.C9433b.mo6018k(rh.e, rh.g):kh.o$c$b");
            }

            /* renamed from: z */
            public C9433b m15057z(EnumC9434c enumC9434c) {
                enumC9434c.getClass();
                this.f24860k |= 4;
                this.f24863n = enumC9434c;
                return this;
            }
        }

        /* renamed from: kh.o$c$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public enum EnumC9434c implements C12196j.InterfaceC12197a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            

            /* renamed from: n */
            private static C12196j.InterfaceC12198b<EnumC9434c> f24867n = new C9435a();

            /* renamed from: j */
            private final int f24869j;

            /* renamed from: kh.o$c$c$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
            static class C9435a implements C12196j.InterfaceC12198b<EnumC9434c> {
                C9435a() {
                }

                @Override // p326rh.C12196j.InterfaceC12198b
                /* renamed from: b */
                public EnumC9434c mo5797a(int i) {
                    return EnumC9434c.m15056a(i);
                }
            }

            EnumC9434c(int i, int i2) {
                this.f24869j = i2;
            }

            /* renamed from: a */
            public static EnumC9434c m15056a(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return LOCAL;
                    }
                    return PACKAGE;
                }
                return CLASS;
            }

            @Override // p326rh.C12196j.InterfaceC12197a
            public final int getNumber() {
                return this.f24869j;
            }
        }

        static {
            C9431c c9431c = new C9431c(true);
            f24851r = c9431c;
            c9431c.m15081E();
        }

        /* renamed from: E */
        private void m15081E() {
            this.f24855m = -1;
            this.f24856n = 0;
            this.f24857o = EnumC9434c.PACKAGE;
        }

        /* renamed from: F */
        public static C9433b m15080F() {
            return C9433b.m15065r();
        }

        /* renamed from: G */
        public static C9433b m15079G(C9431c c9431c) {
            return m15080F().mo5830p(c9431c);
        }

        /* renamed from: x */
        public static C9431c m15071x() {
            return f24851r;
        }

        /* renamed from: A */
        public int m15085A() {
            return this.f24856n;
        }

        /* renamed from: B */
        public boolean m15084B() {
            return (this.f24854l & 4) == 4;
        }

        /* renamed from: C */
        public boolean m15083C() {
            return (this.f24854l & 1) == 1;
        }

        /* renamed from: D */
        public boolean m15082D() {
            return (this.f24854l & 2) == 2;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: H */
        public C9433b mo5765e() {
            return m15080F();
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: I */
        public C9433b mo5768b() {
            return m15079G(this);
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: c */
        public int mo5767c() {
            int i = this.f24859q;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f24854l & 1) == 1) {
                i2 = 0 + C12181f.m5892o(1, this.f24855m);
            }
            if ((this.f24854l & 2) == 2) {
                i2 += C12181f.m5892o(2, this.f24856n);
            }
            if ((this.f24854l & 4) == 4) {
                i2 += C12181f.m5906h(3, this.f24857o.getNumber());
            }
            int size = i2 + this.f24853k.size();
            this.f24859q = size;
            return size;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: d */
        public void mo5766d(C12181f c12181f) {
            mo5767c();
            if ((this.f24854l & 1) == 1) {
                c12181f.m5919a0(1, this.f24855m);
            }
            if ((this.f24854l & 2) == 2) {
                c12181f.m5919a0(2, this.f24856n);
            }
            if ((this.f24854l & 4) == 4) {
                c12181f.m5928S(3, this.f24857o.getNumber());
            }
            c12181f.m5903i0(this.f24853k);
        }

        @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
        /* renamed from: g */
        public InterfaceC12213s<C9431c> mo5764g() {
            return f24852s;
        }

        @Override // p326rh.InterfaceC12212r
        /* renamed from: j */
        public final boolean mo5761j() {
            byte b = this.f24858p;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!m15082D()) {
                this.f24858p = (byte) 0;
                return false;
            }
            this.f24858p = (byte) 1;
            return true;
        }

        /* renamed from: y */
        public EnumC9434c m15070y() {
            return this.f24857o;
        }

        /* renamed from: z */
        public int m15069z() {
            return this.f24855m;
        }

        private C9431c(AbstractC12188i.AbstractC12190b abstractC12190b) {
            super(abstractC12190b);
            this.f24858p = (byte) -1;
            this.f24859q = -1;
            this.f24853k = abstractC12190b.m5831n();
        }

        private C9431c(boolean z) {
            this.f24858p = (byte) -1;
            this.f24859q = -1;
            this.f24853k = AbstractC12177d.f31693j;
        }

        private C9431c(C12180e c12180e, C12183g c12183g) {
            this.f24858p = (byte) -1;
            this.f24859q = -1;
            m15081E();
            AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
            C12181f m5937J = C12181f.m5937J(m5997w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int m5982K = c12180e.m5982K();
                        if (m5982K != 0) {
                            if (m5982K == 8) {
                                this.f24854l |= 1;
                                this.f24855m = c12180e.m5954s();
                            } else if (m5982K == 16) {
                                this.f24854l |= 2;
                                this.f24856n = c12180e.m5954s();
                            } else if (m5982K != 24) {
                                if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                }
                            } else {
                                int m5959n = c12180e.m5959n();
                                EnumC9434c m15056a = EnumC9434c.m15056a(m5959n);
                                if (m15056a == null) {
                                    m5937J.m5891o0(m5982K);
                                    m5937J.m5891o0(m5959n);
                                } else {
                                    this.f24854l |= 4;
                                    this.f24857o = m15056a;
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
                        this.f24853k = m5997w.m5993j();
                        throw th3;
                    }
                    this.f24853k = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            }
            try {
                m5937J.m5938I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f24853k = m5997w.m5993j();
                throw th4;
            }
            this.f24853k = m5997w.m5993j();
            mo5823n();
        }
    }

    private C9428o(AbstractC12188i.AbstractC12190b abstractC12190b) {
        super(abstractC12190b);
        this.f24847m = (byte) -1;
        this.f24848n = -1;
        this.f24845k = abstractC12190b.m5831n();
    }

    private C9428o(boolean z) {
        this.f24847m = (byte) -1;
        this.f24848n = -1;
        this.f24845k = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9428o(C12180e c12180e, C12183g c12183g) {
        this.f24847m = (byte) -1;
        this.f24848n = -1;
        m15097y();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int m5982K = c12180e.m5982K();
                    if (m5982K != 0) {
                        if (m5982K != 10) {
                            if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.f24846l = new ArrayList();
                                z2 |= true;
                            }
                            this.f24846l.add(c12180e.m5952u(C9431c.f24852s, c12183g));
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
                    this.f24846l = Collections.unmodifiableList(this.f24846l);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24845k = m5997w.m5993j();
                    throw th3;
                }
                this.f24845k = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f24846l = Collections.unmodifiableList(this.f24846l);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24845k = m5997w.m5993j();
            throw th4;
        }
        this.f24845k = m5997w.m5993j();
        mo5823n();
    }
}
