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

/* renamed from: kh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9375b extends AbstractC12188i implements InterfaceC12212r {

    /* renamed from: q */
    private static final C9375b f24503q;

    /* renamed from: r */
    public static InterfaceC12213s<C9375b> f24504r = new C9376a();

    /* renamed from: k */
    private final AbstractC12177d f24505k;

    /* renamed from: l */
    private int f24506l;

    /* renamed from: m */
    private int f24507m;

    /* renamed from: n */
    private List<C9377b> f24508n;

    /* renamed from: o */
    private byte f24509o;

    /* renamed from: p */
    private int f24510p;

    /* renamed from: kh.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9376a extends AbstractC12173b<C9375b> {
        C9376a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9375b mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9375b(c12180e, c12183g);
        }
    }

    /* renamed from: kh.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9377b extends AbstractC12188i implements InterfaceC12212r {

        /* renamed from: q */
        private static final C9377b f24511q;

        /* renamed from: r */
        public static InterfaceC12213s<C9377b> f24512r = new C9378a();

        /* renamed from: k */
        private final AbstractC12177d f24513k;

        /* renamed from: l */
        private int f24514l;

        /* renamed from: m */
        private int f24515m;

        /* renamed from: n */
        private C9380c f24516n;

        /* renamed from: o */
        private byte f24517o;

        /* renamed from: p */
        private int f24518p;

        /* renamed from: kh.b$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C9378a extends AbstractC12173b<C9377b> {
            C9378a() {
            }

            @Override // p326rh.InterfaceC12213s
            /* renamed from: m */
            public C9377b mo5759b(C12180e c12180e, C12183g c12183g) {
                return new C9377b(c12180e, c12183g);
            }
        }

        /* renamed from: kh.b$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9379b extends AbstractC12188i.AbstractC12190b<C9377b, C9379b> implements InterfaceC12212r {

            /* renamed from: k */
            private int f24519k;

            /* renamed from: l */
            private int f24520l;

            /* renamed from: m */
            private C9380c f24521m = C9380c.m15713M();

            private C9379b() {
                m15729w();
            }

            /* renamed from: r */
            static /* synthetic */ C9379b m15734r() {
                return m15730v();
            }

            /* renamed from: v */
            private static C9379b m15730v() {
                return new C9379b();
            }

            /* renamed from: w */
            private void m15729w() {
            }

            /* renamed from: A */
            public C9379b m15735A(int i) {
                this.f24519k |= 1;
                this.f24520l = i;
                return this;
            }

            @Override // p326rh.InterfaceC12210q.InterfaceC12211a
            /* renamed from: s */
            public C9377b build() {
                C9377b m15732t = m15732t();
                if (m15732t.mo5761j()) {
                    return m15732t;
                }
                throw AbstractC12170a.AbstractC12171a.m6017l(m15732t);
            }

            /* renamed from: t */
            public C9377b m15732t() {
                C9377b c9377b = new C9377b(this);
                int i = this.f24519k;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                c9377b.f24515m = this.f24520l;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                c9377b.f24516n = this.f24521m;
                c9377b.f24514l = i2;
                return c9377b;
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: u */
            public C9379b mo5832m() {
                return m15730v().mo5830p(m15732t());
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: x */
            public C9379b mo5830p(C9377b c9377b) {
                if (c9377b == C9377b.m15740w()) {
                    return this;
                }
                if (c9377b.m15737z()) {
                    m15735A(c9377b.m15739x());
                }
                if (c9377b.m15750A()) {
                    m15726z(c9377b.m15738y());
                }
                m5829q(m5831n().m6003d(c9377b.f24513k));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // p326rh.AbstractC12170a.AbstractC12171a
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kh.C9375b.C9377b.C9379b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    rh.s<kh.b$b> r1 = kh.C9375b.C9377b.f24512r     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    kh.b$b r3 = (kh.C9375b.C9377b) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                    kh.b$b r4 = (kh.C9375b.C9377b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kh.C9375b.C9377b.C9379b.mo6018k(rh.e, rh.g):kh.b$b$b");
            }

            /* renamed from: z */
            public C9379b m15726z(C9380c c9380c) {
                if ((this.f24519k & 2) == 2 && this.f24521m != C9380c.m15713M()) {
                    this.f24521m = C9380c.m15693g0(this.f24521m).mo5830p(c9380c).m15669t();
                } else {
                    this.f24521m = c9380c;
                }
                this.f24519k |= 2;
                return this;
            }
        }

        static {
            C9377b c9377b = new C9377b(true);
            f24511q = c9377b;
            c9377b.m15749B();
        }

        /* renamed from: B */
        private void m15749B() {
            this.f24515m = 0;
            this.f24516n = C9380c.m15713M();
        }

        /* renamed from: C */
        public static C9379b m15748C() {
            return C9379b.m15734r();
        }

        /* renamed from: D */
        public static C9379b m15747D(C9377b c9377b) {
            return m15748C().mo5830p(c9377b);
        }

        /* renamed from: w */
        public static C9377b m15740w() {
            return f24511q;
        }

        /* renamed from: A */
        public boolean m15750A() {
            return (this.f24514l & 2) == 2;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: E */
        public C9379b mo5765e() {
            return m15748C();
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: F */
        public C9379b mo5768b() {
            return m15747D(this);
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: c */
        public int mo5767c() {
            int i = this.f24518p;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f24514l & 1) == 1) {
                i2 = 0 + C12181f.m5892o(1, this.f24515m);
            }
            if ((this.f24514l & 2) == 2) {
                i2 += C12181f.m5884s(2, this.f24516n);
            }
            int size = i2 + this.f24513k.size();
            this.f24518p = size;
            return size;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: d */
        public void mo5766d(C12181f c12181f) {
            mo5767c();
            if ((this.f24514l & 1) == 1) {
                c12181f.m5919a0(1, this.f24515m);
            }
            if ((this.f24514l & 2) == 2) {
                c12181f.m5913d0(2, this.f24516n);
            }
            c12181f.m5903i0(this.f24513k);
        }

        @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
        /* renamed from: g */
        public InterfaceC12213s<C9377b> mo5764g() {
            return f24512r;
        }

        @Override // p326rh.InterfaceC12212r
        /* renamed from: j */
        public final boolean mo5761j() {
            byte b = this.f24517o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!m15737z()) {
                this.f24517o = (byte) 0;
                return false;
            } else if (!m15750A()) {
                this.f24517o = (byte) 0;
                return false;
            } else if (!m15738y().mo5761j()) {
                this.f24517o = (byte) 0;
                return false;
            } else {
                this.f24517o = (byte) 1;
                return true;
            }
        }

        /* renamed from: x */
        public int m15739x() {
            return this.f24515m;
        }

        /* renamed from: y */
        public C9380c m15738y() {
            return this.f24516n;
        }

        /* renamed from: z */
        public boolean m15737z() {
            return (this.f24514l & 1) == 1;
        }

        /* renamed from: kh.b$b$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9380c extends AbstractC12188i implements InterfaceC12212r {

            /* renamed from: A */
            public static InterfaceC12213s<C9380c> f24522A = new C9381a();

            /* renamed from: z */
            private static final C9380c f24523z;

            /* renamed from: k */
            private final AbstractC12177d f24524k;

            /* renamed from: l */
            private int f24525l;

            /* renamed from: m */
            private EnumC9383c f24526m;

            /* renamed from: n */
            private long f24527n;

            /* renamed from: o */
            private float f24528o;

            /* renamed from: p */
            private double f24529p;

            /* renamed from: q */
            private int f24530q;

            /* renamed from: r */
            private int f24531r;

            /* renamed from: s */
            private int f24532s;

            /* renamed from: t */
            private C9375b f24533t;

            /* renamed from: u */
            private List<C9380c> f24534u;

            /* renamed from: v */
            private int f24535v;

            /* renamed from: w */
            private int f24536w;

            /* renamed from: x */
            private byte f24537x;

            /* renamed from: y */
            private int f24538y;

            /* renamed from: kh.b$b$c$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
            static class C9381a extends AbstractC12173b<C9380c> {
                C9381a() {
                }

                @Override // p326rh.InterfaceC12213s
                /* renamed from: m */
                public C9380c mo5759b(C12180e c12180e, C12183g c12183g) {
                    return new C9380c(c12180e, c12183g);
                }
            }

            /* renamed from: kh.b$b$c$b */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
            public static final class C9382b extends AbstractC12188i.AbstractC12190b<C9380c, C9382b> implements InterfaceC12212r {

                /* renamed from: k */
                private int f24539k;

                /* renamed from: m */
                private long f24541m;

                /* renamed from: n */
                private float f24542n;

                /* renamed from: o */
                private double f24543o;

                /* renamed from: p */
                private int f24544p;

                /* renamed from: q */
                private int f24545q;

                /* renamed from: r */
                private int f24546r;

                /* renamed from: u */
                private int f24549u;

                /* renamed from: v */
                private int f24550v;

                /* renamed from: l */
                private EnumC9383c f24540l = EnumC9383c.BYTE;

                /* renamed from: s */
                private C9375b f24547s = C9375b.m15767A();

                /* renamed from: t */
                private List<C9380c> f24548t = Collections.emptyList();

                private C9382b() {
                    m15665x();
                }

                /* renamed from: r */
                static /* synthetic */ C9382b m15671r() {
                    return m15667v();
                }

                /* renamed from: v */
                private static C9382b m15667v() {
                    return new C9382b();
                }

                /* renamed from: w */
                private void m15666w() {
                    if ((this.f24539k & 256) != 256) {
                        this.f24548t = new ArrayList(this.f24548t);
                        this.f24539k |= 256;
                    }
                }

                /* renamed from: x */
                private void m15665x() {
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
                @Override // p326rh.AbstractC12170a.AbstractC12171a
                /* renamed from: A */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public kh.C9375b.C9377b.C9380c.C9382b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        rh.s<kh.b$b$c> r1 = kh.C9375b.C9377b.C9380c.f24522A     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                        java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                        kh.b$b$c r3 = (kh.C9375b.C9377b.C9380c) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                        kh.b$b$c r4 = (kh.C9375b.C9377b.C9380c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kh.C9375b.C9377b.C9380c.C9382b.mo6018k(rh.e, rh.g):kh.b$b$c$b");
                }

                /* renamed from: B */
                public C9382b m15680B(int i) {
                    this.f24539k |= 512;
                    this.f24549u = i;
                    return this;
                }

                /* renamed from: C */
                public C9382b m15679C(int i) {
                    this.f24539k |= 32;
                    this.f24545q = i;
                    return this;
                }

                /* renamed from: D */
                public C9382b m15678D(double d) {
                    this.f24539k |= 8;
                    this.f24543o = d;
                    return this;
                }

                /* renamed from: E */
                public C9382b m15677E(int i) {
                    this.f24539k |= 64;
                    this.f24546r = i;
                    return this;
                }

                /* renamed from: F */
                public C9382b m15676F(int i) {
                    this.f24539k |= 1024;
                    this.f24550v = i;
                    return this;
                }

                /* renamed from: G */
                public C9382b m15675G(float f) {
                    this.f24539k |= 4;
                    this.f24542n = f;
                    return this;
                }

                /* renamed from: H */
                public C9382b m15674H(long j) {
                    this.f24539k |= 2;
                    this.f24541m = j;
                    return this;
                }

                /* renamed from: I */
                public C9382b m15673I(int i) {
                    this.f24539k |= 16;
                    this.f24544p = i;
                    return this;
                }

                /* renamed from: J */
                public C9382b m15672J(EnumC9383c enumC9383c) {
                    enumC9383c.getClass();
                    this.f24539k |= 1;
                    this.f24540l = enumC9383c;
                    return this;
                }

                @Override // p326rh.InterfaceC12210q.InterfaceC12211a
                /* renamed from: s */
                public C9380c build() {
                    C9380c m15669t = m15669t();
                    if (m15669t.mo5761j()) {
                        return m15669t;
                    }
                    throw AbstractC12170a.AbstractC12171a.m6017l(m15669t);
                }

                /* renamed from: t */
                public C9380c m15669t() {
                    C9380c c9380c = new C9380c(this);
                    int i = this.f24539k;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    c9380c.f24526m = this.f24540l;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    c9380c.f24527n = this.f24541m;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    c9380c.f24528o = this.f24542n;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    c9380c.f24529p = this.f24543o;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    c9380c.f24530q = this.f24544p;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    c9380c.f24531r = this.f24545q;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    c9380c.f24532s = this.f24546r;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    c9380c.f24533t = this.f24547s;
                    if ((this.f24539k & 256) == 256) {
                        this.f24548t = Collections.unmodifiableList(this.f24548t);
                        this.f24539k &= -257;
                    }
                    c9380c.f24534u = this.f24548t;
                    if ((i & 512) == 512) {
                        i2 |= 256;
                    }
                    c9380c.f24535v = this.f24549u;
                    if ((i & 1024) == 1024) {
                        i2 |= 512;
                    }
                    c9380c.f24536w = this.f24550v;
                    c9380c.f24525l = i2;
                    return c9380c;
                }

                @Override // p326rh.AbstractC12188i.AbstractC12190b
                /* renamed from: u */
                public C9382b mo5832m() {
                    return m15667v().mo5830p(m15669t());
                }

                /* renamed from: y */
                public C9382b m15664y(C9375b c9375b) {
                    if ((this.f24539k & 128) == 128 && this.f24547s != C9375b.m15767A()) {
                        this.f24547s = C9375b.m15762F(this.f24547s).mo5830p(c9375b).m15657t();
                    } else {
                        this.f24547s = c9375b;
                    }
                    this.f24539k |= 128;
                    return this;
                }

                @Override // p326rh.AbstractC12188i.AbstractC12190b
                /* renamed from: z */
                public C9382b mo5830p(C9380c c9380c) {
                    if (c9380c == C9380c.m15713M()) {
                        return this;
                    }
                    if (c9380c.m15696d0()) {
                        m15672J(c9380c.m15706T());
                    }
                    if (c9380c.m15698b0()) {
                        m15674H(c9380c.m15708R());
                    }
                    if (c9380c.m15699a0()) {
                        m15675G(c9380c.m15709Q());
                    }
                    if (c9380c.m15702X()) {
                        m15678D(c9380c.m15712N());
                    }
                    if (c9380c.m15697c0()) {
                        m15673I(c9380c.m15707S());
                    }
                    if (c9380c.m15703W()) {
                        m15679C(c9380c.m15714L());
                    }
                    if (c9380c.m15701Y()) {
                        m15677E(c9380c.m15711O());
                    }
                    if (c9380c.m15705U()) {
                        m15664y(c9380c.m15719G());
                    }
                    if (!c9380c.f24534u.isEmpty()) {
                        if (this.f24548t.isEmpty()) {
                            this.f24548t = c9380c.f24534u;
                            this.f24539k &= -257;
                        } else {
                            m15666w();
                            this.f24548t.addAll(c9380c.f24534u);
                        }
                    }
                    if (c9380c.m15704V()) {
                        m15680B(c9380c.m15718H());
                    }
                    if (c9380c.m15700Z()) {
                        m15676F(c9380c.m15710P());
                    }
                    m5829q(m5831n().m6003d(c9380c.f24524k));
                    return this;
                }
            }

            /* renamed from: kh.b$b$c$c */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
            public enum EnumC9383c implements C12196j.InterfaceC12197a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                

                /* renamed from: x */
                private static C12196j.InterfaceC12198b<EnumC9383c> f24564x = new C9384a();

                /* renamed from: j */
                private final int f24566j;

                /* renamed from: kh.b$b$c$c$a */
                /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
                static class C9384a implements C12196j.InterfaceC12198b<EnumC9383c> {
                    C9384a() {
                    }

                    @Override // p326rh.C12196j.InterfaceC12198b
                    /* renamed from: b */
                    public EnumC9383c mo5797a(int i) {
                        return EnumC9383c.m15662a(i);
                    }
                }

                EnumC9383c(int i, int i2) {
                    this.f24566j = i2;
                }

                /* renamed from: a */
                public static EnumC9383c m15662a(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // p326rh.C12196j.InterfaceC12197a
                public final int getNumber() {
                    return this.f24566j;
                }
            }

            static {
                C9380c c9380c = new C9380c(true);
                f24523z = c9380c;
                c9380c.m15695e0();
            }

            /* renamed from: M */
            public static C9380c m15713M() {
                return f24523z;
            }

            /* renamed from: e0 */
            private void m15695e0() {
                this.f24526m = EnumC9383c.BYTE;
                this.f24527n = 0L;
                this.f24528o = 0.0f;
                this.f24529p = 0.0d;
                this.f24530q = 0;
                this.f24531r = 0;
                this.f24532s = 0;
                this.f24533t = C9375b.m15767A();
                this.f24534u = Collections.emptyList();
                this.f24535v = 0;
                this.f24536w = 0;
            }

            /* renamed from: f0 */
            public static C9382b m15694f0() {
                return C9382b.m15671r();
            }

            /* renamed from: g0 */
            public static C9382b m15693g0(C9380c c9380c) {
                return m15694f0().mo5830p(c9380c);
            }

            /* renamed from: G */
            public C9375b m15719G() {
                return this.f24533t;
            }

            /* renamed from: H */
            public int m15718H() {
                return this.f24535v;
            }

            /* renamed from: I */
            public C9380c m15717I(int i) {
                return this.f24534u.get(i);
            }

            /* renamed from: J */
            public int m15716J() {
                return this.f24534u.size();
            }

            /* renamed from: K */
            public List<C9380c> m15715K() {
                return this.f24534u;
            }

            /* renamed from: L */
            public int m15714L() {
                return this.f24531r;
            }

            /* renamed from: N */
            public double m15712N() {
                return this.f24529p;
            }

            /* renamed from: O */
            public int m15711O() {
                return this.f24532s;
            }

            /* renamed from: P */
            public int m15710P() {
                return this.f24536w;
            }

            /* renamed from: Q */
            public float m15709Q() {
                return this.f24528o;
            }

            /* renamed from: R */
            public long m15708R() {
                return this.f24527n;
            }

            /* renamed from: S */
            public int m15707S() {
                return this.f24530q;
            }

            /* renamed from: T */
            public EnumC9383c m15706T() {
                return this.f24526m;
            }

            /* renamed from: U */
            public boolean m15705U() {
                return (this.f24525l & 128) == 128;
            }

            /* renamed from: V */
            public boolean m15704V() {
                return (this.f24525l & 256) == 256;
            }

            /* renamed from: W */
            public boolean m15703W() {
                return (this.f24525l & 32) == 32;
            }

            /* renamed from: X */
            public boolean m15702X() {
                return (this.f24525l & 8) == 8;
            }

            /* renamed from: Y */
            public boolean m15701Y() {
                return (this.f24525l & 64) == 64;
            }

            /* renamed from: Z */
            public boolean m15700Z() {
                return (this.f24525l & 512) == 512;
            }

            /* renamed from: a0 */
            public boolean m15699a0() {
                return (this.f24525l & 4) == 4;
            }

            /* renamed from: b0 */
            public boolean m15698b0() {
                return (this.f24525l & 2) == 2;
            }

            @Override // p326rh.InterfaceC12210q
            /* renamed from: c */
            public int mo5767c() {
                int i;
                int i2 = this.f24538y;
                if (i2 != -1) {
                    return i2;
                }
                if ((this.f24525l & 1) == 1) {
                    i = C12181f.m5906h(1, this.f24526m.getNumber()) + 0;
                } else {
                    i = 0;
                }
                if ((this.f24525l & 2) == 2) {
                    i += C12181f.m5946A(2, this.f24527n);
                }
                if ((this.f24525l & 4) == 4) {
                    i += C12181f.m5898l(3, this.f24528o);
                }
                if ((this.f24525l & 8) == 8) {
                    i += C12181f.m5910f(4, this.f24529p);
                }
                if ((this.f24525l & 16) == 16) {
                    i += C12181f.m5892o(5, this.f24530q);
                }
                if ((this.f24525l & 32) == 32) {
                    i += C12181f.m5892o(6, this.f24531r);
                }
                if ((this.f24525l & 64) == 64) {
                    i += C12181f.m5892o(7, this.f24532s);
                }
                if ((this.f24525l & 128) == 128) {
                    i += C12181f.m5884s(8, this.f24533t);
                }
                for (int i3 = 0; i3 < this.f24534u.size(); i3++) {
                    i += C12181f.m5884s(9, this.f24534u.get(i3));
                }
                if ((this.f24525l & 512) == 512) {
                    i += C12181f.m5892o(10, this.f24536w);
                }
                if ((this.f24525l & 256) == 256) {
                    i += C12181f.m5892o(11, this.f24535v);
                }
                int size = i + this.f24524k.size();
                this.f24538y = size;
                return size;
            }

            /* renamed from: c0 */
            public boolean m15697c0() {
                return (this.f24525l & 16) == 16;
            }

            @Override // p326rh.InterfaceC12210q
            /* renamed from: d */
            public void mo5766d(C12181f c12181f) {
                mo5767c();
                if ((this.f24525l & 1) == 1) {
                    c12181f.m5928S(1, this.f24526m.getNumber());
                }
                if ((this.f24525l & 2) == 2) {
                    c12181f.m5881t0(2, this.f24527n);
                }
                if ((this.f24525l & 4) == 4) {
                    c12181f.m5924W(3, this.f24528o);
                }
                if ((this.f24525l & 8) == 8) {
                    c12181f.m5930Q(4, this.f24529p);
                }
                if ((this.f24525l & 16) == 16) {
                    c12181f.m5919a0(5, this.f24530q);
                }
                if ((this.f24525l & 32) == 32) {
                    c12181f.m5919a0(6, this.f24531r);
                }
                if ((this.f24525l & 64) == 64) {
                    c12181f.m5919a0(7, this.f24532s);
                }
                if ((this.f24525l & 128) == 128) {
                    c12181f.m5913d0(8, this.f24533t);
                }
                for (int i = 0; i < this.f24534u.size(); i++) {
                    c12181f.m5913d0(9, this.f24534u.get(i));
                }
                if ((this.f24525l & 512) == 512) {
                    c12181f.m5919a0(10, this.f24536w);
                }
                if ((this.f24525l & 256) == 256) {
                    c12181f.m5919a0(11, this.f24535v);
                }
                c12181f.m5903i0(this.f24524k);
            }

            /* renamed from: d0 */
            public boolean m15696d0() {
                return (this.f24525l & 1) == 1;
            }

            @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
            /* renamed from: g */
            public InterfaceC12213s<C9380c> mo5764g() {
                return f24522A;
            }

            @Override // p326rh.InterfaceC12210q
            /* renamed from: h0 */
            public C9382b mo5765e() {
                return m15694f0();
            }

            @Override // p326rh.InterfaceC12210q
            /* renamed from: i0 */
            public C9382b mo5768b() {
                return m15693g0(this);
            }

            @Override // p326rh.InterfaceC12212r
            /* renamed from: j */
            public final boolean mo5761j() {
                byte b = this.f24537x;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (m15705U() && !m15719G().mo5761j()) {
                    this.f24537x = (byte) 0;
                    return false;
                }
                for (int i = 0; i < m15716J(); i++) {
                    if (!m15717I(i).mo5761j()) {
                        this.f24537x = (byte) 0;
                        return false;
                    }
                }
                this.f24537x = (byte) 1;
                return true;
            }

            private C9380c(AbstractC12188i.AbstractC12190b abstractC12190b) {
                super(abstractC12190b);
                this.f24537x = (byte) -1;
                this.f24538y = -1;
                this.f24524k = abstractC12190b.m5831n();
            }

            private C9380c(boolean z) {
                this.f24537x = (byte) -1;
                this.f24538y = -1;
                this.f24524k = AbstractC12177d.f31693j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private C9380c(C12180e c12180e, C12183g c12183g) {
                this.f24537x = (byte) -1;
                this.f24538y = -1;
                m15695e0();
                AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
                C12181f m5937J = C12181f.m5937J(m5997w, 1);
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    ?? r5 = 256;
                    if (!z) {
                        try {
                            try {
                                int m5982K = c12180e.m5982K();
                                switch (m5982K) {
                                    case 0:
                                        break;
                                    case 8:
                                        int m5959n = c12180e.m5959n();
                                        EnumC9383c m15662a = EnumC9383c.m15662a(m5959n);
                                        if (m15662a == null) {
                                            m5937J.m5891o0(m5982K);
                                            m5937J.m5891o0(m5959n);
                                        } else {
                                            this.f24525l |= 1;
                                            this.f24526m = m15662a;
                                            continue;
                                        }
                                    case 16:
                                        this.f24525l |= 2;
                                        this.f24527n = c12180e.m5985H();
                                        continue;
                                    case 29:
                                        this.f24525l |= 4;
                                        this.f24528o = c12180e.m5956q();
                                        continue;
                                    case 33:
                                        this.f24525l |= 8;
                                        this.f24529p = c12180e.m5960m();
                                        continue;
                                    case 40:
                                        this.f24525l |= 16;
                                        this.f24530q = c12180e.m5954s();
                                        continue;
                                    case 48:
                                        this.f24525l |= 32;
                                        this.f24531r = c12180e.m5954s();
                                        continue;
                                    case 56:
                                        this.f24525l |= 64;
                                        this.f24532s = c12180e.m5954s();
                                        continue;
                                    case 66:
                                        C9385c mo5768b = (this.f24525l & 128) == 128 ? this.f24533t.mo5768b() : null;
                                        C9375b c9375b = (C9375b) c12180e.m5952u(C9375b.f24504r, c12183g);
                                        this.f24533t = c9375b;
                                        if (mo5768b != null) {
                                            mo5768b.mo5830p(c9375b);
                                            this.f24533t = mo5768b.m15657t();
                                        }
                                        this.f24525l |= 128;
                                        continue;
                                    case 74:
                                        if (!(z2 & true)) {
                                            this.f24534u = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.f24534u.add(c12180e.m5952u(f24522A, c12183g));
                                        continue;
                                    case 80:
                                        this.f24525l |= 512;
                                        this.f24536w = c12180e.m5954s();
                                        continue;
                                    case 88:
                                        this.f24525l |= 256;
                                        this.f24535v = c12180e.m5954s();
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
                            } catch (C12199k e) {
                                throw e.m5788i(this);
                            } catch (IOException e2) {
                                throw new C12199k(e2.getMessage()).m5788i(this);
                            }
                        } catch (Throwable th2) {
                            if ((z2 & true) == r5) {
                                this.f24534u = Collections.unmodifiableList(this.f24534u);
                            }
                            try {
                                m5937J.m5938I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f24524k = m5997w.m5993j();
                                throw th3;
                            }
                            this.f24524k = m5997w.m5993j();
                            mo5823n();
                            throw th2;
                        }
                    } else {
                        if (z2 & true) {
                            this.f24534u = Collections.unmodifiableList(this.f24534u);
                        }
                        try {
                            m5937J.m5938I();
                        } catch (IOException unused2) {
                        } catch (Throwable th4) {
                            this.f24524k = m5997w.m5993j();
                            throw th4;
                        }
                        this.f24524k = m5997w.m5993j();
                        mo5823n();
                        return;
                    }
                }
            }
        }

        private C9377b(AbstractC12188i.AbstractC12190b abstractC12190b) {
            super(abstractC12190b);
            this.f24517o = (byte) -1;
            this.f24518p = -1;
            this.f24513k = abstractC12190b.m5831n();
        }

        private C9377b(boolean z) {
            this.f24517o = (byte) -1;
            this.f24518p = -1;
            this.f24513k = AbstractC12177d.f31693j;
        }

        private C9377b(C12180e c12180e, C12183g c12183g) {
            this.f24517o = (byte) -1;
            this.f24518p = -1;
            m15749B();
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
                                    this.f24514l |= 1;
                                    this.f24515m = c12180e.m5954s();
                                } else if (m5982K != 18) {
                                    if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                    }
                                } else {
                                    C9380c.C9382b mo5768b = (this.f24514l & 2) == 2 ? this.f24516n.mo5768b() : null;
                                    C9380c c9380c = (C9380c) c12180e.m5952u(C9380c.f24522A, c12183g);
                                    this.f24516n = c9380c;
                                    if (mo5768b != null) {
                                        mo5768b.mo5830p(c9380c);
                                        this.f24516n = mo5768b.m15669t();
                                    }
                                    this.f24514l |= 2;
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
                        this.f24513k = m5997w.m5993j();
                        throw th3;
                    }
                    this.f24513k = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            }
            try {
                m5937J.m5938I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f24513k = m5997w.m5993j();
                throw th4;
            }
            this.f24513k = m5997w.m5993j();
            mo5823n();
        }
    }

    /* renamed from: kh.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9385c extends AbstractC12188i.AbstractC12190b<C9375b, C9385c> implements InterfaceC12212r {

        /* renamed from: k */
        private int f24567k;

        /* renamed from: l */
        private int f24568l;

        /* renamed from: m */
        private List<C9377b> f24569m = Collections.emptyList();

        private C9385c() {
            m15653x();
        }

        /* renamed from: r */
        static /* synthetic */ C9385c m15659r() {
            return m15655v();
        }

        /* renamed from: v */
        private static C9385c m15655v() {
            return new C9385c();
        }

        /* renamed from: w */
        private void m15654w() {
            if ((this.f24567k & 2) != 2) {
                this.f24569m = new ArrayList(this.f24569m);
                this.f24567k |= 2;
            }
        }

        /* renamed from: x */
        private void m15653x() {
        }

        /* renamed from: A */
        public C9385c m15660A(int i) {
            this.f24567k |= 1;
            this.f24568l = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: s */
        public C9375b build() {
            C9375b m15657t = m15657t();
            if (m15657t.mo5761j()) {
                return m15657t;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15657t);
        }

        /* renamed from: t */
        public C9375b m15657t() {
            C9375b c9375b = new C9375b(this);
            int i = 1;
            if ((this.f24567k & 1) != 1) {
                i = 0;
            }
            c9375b.f24507m = this.f24568l;
            if ((this.f24567k & 2) == 2) {
                this.f24569m = Collections.unmodifiableList(this.f24569m);
                this.f24567k &= -3;
            }
            c9375b.f24508n = this.f24569m;
            c9375b.f24506l = i;
            return c9375b;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: u */
        public C9385c mo5832m() {
            return m15655v().mo5830p(m15657t());
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9385c mo5830p(C9375b c9375b) {
            if (c9375b == C9375b.m15767A()) {
                return this;
            }
            if (c9375b.m15765C()) {
                m15660A(c9375b.m15766B());
            }
            if (!c9375b.f24508n.isEmpty()) {
                if (this.f24569m.isEmpty()) {
                    this.f24569m = c9375b.f24508n;
                    this.f24567k &= -3;
                } else {
                    m15654w();
                    this.f24569m.addAll(c9375b.f24508n);
                }
            }
            m5829q(m5831n().m6003d(c9375b.f24505k));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9375b.C9385c mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.b> r1 = kh.C9375b.f24504r     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.b r3 = (kh.C9375b) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.b r4 = (kh.C9375b) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9375b.C9385c.mo6018k(rh.e, rh.g):kh.b$c");
        }
    }

    static {
        C9375b c9375b = new C9375b(true);
        f24503q = c9375b;
        c9375b.m15764D();
    }

    /* renamed from: A */
    public static C9375b m15767A() {
        return f24503q;
    }

    /* renamed from: D */
    private void m15764D() {
        this.f24507m = 0;
        this.f24508n = Collections.emptyList();
    }

    /* renamed from: E */
    public static C9385c m15763E() {
        return C9385c.m15659r();
    }

    /* renamed from: F */
    public static C9385c m15762F(C9375b c9375b) {
        return m15763E().mo5830p(c9375b);
    }

    /* renamed from: B */
    public int m15766B() {
        return this.f24507m;
    }

    /* renamed from: C */
    public boolean m15765C() {
        return (this.f24506l & 1) == 1;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: G */
    public C9385c mo5765e() {
        return m15763E();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: H */
    public C9385c mo5768b() {
        return m15762F(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24510p;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24506l & 1) == 1) {
            i = C12181f.m5892o(1, this.f24507m) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.f24508n.size(); i3++) {
            i += C12181f.m5884s(2, this.f24508n.get(i3));
        }
        int size = i + this.f24505k.size();
        this.f24510p = size;
        return size;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        if ((this.f24506l & 1) == 1) {
            c12181f.m5919a0(1, this.f24507m);
        }
        for (int i = 0; i < this.f24508n.size(); i++) {
            c12181f.m5913d0(2, this.f24508n.get(i));
        }
        c12181f.m5903i0(this.f24505k);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9375b> mo5764g() {
        return f24504r;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24509o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m15765C()) {
            this.f24509o = (byte) 0;
            return false;
        }
        for (int i = 0; i < m15753y(); i++) {
            if (!m15754x(i).mo5761j()) {
                this.f24509o = (byte) 0;
                return false;
            }
        }
        this.f24509o = (byte) 1;
        return true;
    }

    /* renamed from: x */
    public C9377b m15754x(int i) {
        return this.f24508n.get(i);
    }

    /* renamed from: y */
    public int m15753y() {
        return this.f24508n.size();
    }

    /* renamed from: z */
    public List<C9377b> m15752z() {
        return this.f24508n;
    }

    private C9375b(AbstractC12188i.AbstractC12190b abstractC12190b) {
        super(abstractC12190b);
        this.f24509o = (byte) -1;
        this.f24510p = -1;
        this.f24505k = abstractC12190b.m5831n();
    }

    private C9375b(boolean z) {
        this.f24509o = (byte) -1;
        this.f24510p = -1;
        this.f24505k = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9375b(C12180e c12180e, C12183g c12183g) {
        this.f24509o = (byte) -1;
        this.f24510p = -1;
        m15764D();
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
                            this.f24506l |= 1;
                            this.f24507m = c12180e.m5954s();
                        } else if (m5982K != 18) {
                            if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.f24508n = new ArrayList();
                                z2 |= true;
                            }
                            this.f24508n.add(c12180e.m5952u(C9377b.f24512r, c12183g));
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
                    this.f24508n = Collections.unmodifiableList(this.f24508n);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24505k = m5997w.m5993j();
                    throw th3;
                }
                this.f24505k = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f24508n = Collections.unmodifiableList(this.f24508n);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24505k = m5997w.m5993j();
            throw th4;
        }
        this.f24505k = m5997w.m5993j();
        mo5823n();
    }
}