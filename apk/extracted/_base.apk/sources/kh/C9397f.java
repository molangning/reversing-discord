package kh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kh.C9407h;
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

/* renamed from: kh.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9397f extends AbstractC12188i implements InterfaceC12212r {

    /* renamed from: s */
    private static final C9397f f24662s;

    /* renamed from: t */
    public static InterfaceC12213s<C9397f> f24663t = new C9398a();

    /* renamed from: k */
    private final AbstractC12177d f24664k;

    /* renamed from: l */
    private int f24665l;

    /* renamed from: m */
    private EnumC9400c f24666m;

    /* renamed from: n */
    private List<C9407h> f24667n;

    /* renamed from: o */
    private C9407h f24668o;

    /* renamed from: p */
    private EnumC9402d f24669p;

    /* renamed from: q */
    private byte f24670q;

    /* renamed from: r */
    private int f24671r;

    /* renamed from: kh.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9398a extends AbstractC12173b<C9397f> {
        C9398a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9397f mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9397f(c12180e, c12183g);
        }
    }

    /* renamed from: kh.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9399b extends AbstractC12188i.AbstractC12190b<C9397f, C9399b> implements InterfaceC12212r {

        /* renamed from: k */
        private int f24672k;

        /* renamed from: l */
        private EnumC9400c f24673l = EnumC9400c.RETURNS_CONSTANT;

        /* renamed from: m */
        private List<C9407h> f24674m = Collections.emptyList();

        /* renamed from: n */
        private C9407h f24675n = C9407h.m15394G();

        /* renamed from: o */
        private EnumC9402d f24676o = EnumC9402d.AT_MOST_ONCE;

        private C9399b() {
            m15429x();
        }

        /* renamed from: r */
        static /* synthetic */ C9399b m15435r() {
            return m15431v();
        }

        /* renamed from: v */
        private static C9399b m15431v() {
            return new C9399b();
        }

        /* renamed from: w */
        private void m15430w() {
            if ((this.f24672k & 2) != 2) {
                this.f24674m = new ArrayList(this.f24674m);
                this.f24672k |= 2;
            }
        }

        /* renamed from: x */
        private void m15429x() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9397f.C9399b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.f> r1 = kh.C9397f.f24663t     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.f r3 = (kh.C9397f) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.f r4 = (kh.C9397f) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9397f.C9399b.mo6018k(rh.e, rh.g):kh.f$b");
        }

        /* renamed from: B */
        public C9399b m15437B(EnumC9400c enumC9400c) {
            enumC9400c.getClass();
            this.f24672k |= 1;
            this.f24673l = enumC9400c;
            return this;
        }

        /* renamed from: C */
        public C9399b m15436C(EnumC9402d enumC9402d) {
            enumC9402d.getClass();
            this.f24672k |= 8;
            this.f24676o = enumC9402d;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: s */
        public C9397f build() {
            C9397f m15433t = m15433t();
            if (m15433t.mo5761j()) {
                return m15433t;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15433t);
        }

        /* renamed from: t */
        public C9397f m15433t() {
            C9397f c9397f = new C9397f(this);
            int i = this.f24672k;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            c9397f.f24666m = this.f24673l;
            if ((this.f24672k & 2) == 2) {
                this.f24674m = Collections.unmodifiableList(this.f24674m);
                this.f24672k &= -3;
            }
            c9397f.f24667n = this.f24674m;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            c9397f.f24668o = this.f24675n;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c9397f.f24669p = this.f24676o;
            c9397f.f24665l = i2;
            return c9397f;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: u */
        public C9399b mo5832m() {
            return m15431v().mo5830p(m15433t());
        }

        /* renamed from: y */
        public C9399b m15428y(C9407h c9407h) {
            if ((this.f24672k & 4) == 4 && this.f24675n != C9407h.m15394G()) {
                this.f24675n = C9407h.m15380U(this.f24675n).mo5830p(c9407h).m15360t();
            } else {
                this.f24675n = c9407h;
            }
            this.f24672k |= 4;
            return this;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: z */
        public C9399b mo5830p(C9397f c9397f) {
            if (c9397f == C9397f.m15460A()) {
                return this;
            }
            if (c9397f.m15454G()) {
                m15437B(c9397f.m15457D());
            }
            if (!c9397f.f24667n.isEmpty()) {
                if (this.f24674m.isEmpty()) {
                    this.f24674m = c9397f.f24667n;
                    this.f24672k &= -3;
                } else {
                    m15430w();
                    this.f24674m.addAll(c9397f.f24667n);
                }
            }
            if (c9397f.m15455F()) {
                m15428y(c9397f.m15440z());
            }
            if (c9397f.m15453H()) {
                m15436C(c9397f.m15456E());
            }
            m5829q(m5831n().m6003d(c9397f.f24664k));
            return this;
        }
    }

    /* renamed from: kh.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC9400c implements C12196j.InterfaceC12197a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        

        /* renamed from: n */
        private static C12196j.InterfaceC12198b<EnumC9400c> f24680n = new C9401a();

        /* renamed from: j */
        private final int f24682j;

        /* renamed from: kh.f$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C9401a implements C12196j.InterfaceC12198b<EnumC9400c> {
            C9401a() {
            }

            @Override // p326rh.C12196j.InterfaceC12198b
            /* renamed from: b */
            public EnumC9400c mo5797a(int i) {
                return EnumC9400c.m15426a(i);
            }
        }

        EnumC9400c(int i, int i2) {
            this.f24682j = i2;
        }

        /* renamed from: a */
        public static EnumC9400c m15426a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return RETURNS_NOT_NULL;
                }
                return CALLS;
            }
            return RETURNS_CONSTANT;
        }

        @Override // p326rh.C12196j.InterfaceC12197a
        public final int getNumber() {
            return this.f24682j;
        }
    }

    /* renamed from: kh.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC9402d implements C12196j.InterfaceC12197a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        

        /* renamed from: n */
        private static C12196j.InterfaceC12198b<EnumC9402d> f24686n = new C9403a();

        /* renamed from: j */
        private final int f24688j;

        /* renamed from: kh.f$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C9403a implements C12196j.InterfaceC12198b<EnumC9402d> {
            C9403a() {
            }

            @Override // p326rh.C12196j.InterfaceC12198b
            /* renamed from: b */
            public EnumC9402d mo5797a(int i) {
                return EnumC9402d.m15424a(i);
            }
        }

        EnumC9402d(int i, int i2) {
            this.f24688j = i2;
        }

        /* renamed from: a */
        public static EnumC9402d m15424a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return AT_LEAST_ONCE;
                }
                return EXACTLY_ONCE;
            }
            return AT_MOST_ONCE;
        }

        @Override // p326rh.C12196j.InterfaceC12197a
        public final int getNumber() {
            return this.f24688j;
        }
    }

    static {
        C9397f c9397f = new C9397f(true);
        f24662s = c9397f;
        c9397f.m15452I();
    }

    /* renamed from: A */
    public static C9397f m15460A() {
        return f24662s;
    }

    /* renamed from: I */
    private void m15452I() {
        this.f24666m = EnumC9400c.RETURNS_CONSTANT;
        this.f24667n = Collections.emptyList();
        this.f24668o = C9407h.m15394G();
        this.f24669p = EnumC9402d.AT_MOST_ONCE;
    }

    /* renamed from: J */
    public static C9399b m15451J() {
        return C9399b.m15435r();
    }

    /* renamed from: K */
    public static C9399b m15450K(C9397f c9397f) {
        return m15451J().mo5830p(c9397f);
    }

    /* renamed from: B */
    public C9407h m15459B(int i) {
        return this.f24667n.get(i);
    }

    /* renamed from: C */
    public int m15458C() {
        return this.f24667n.size();
    }

    /* renamed from: D */
    public EnumC9400c m15457D() {
        return this.f24666m;
    }

    /* renamed from: E */
    public EnumC9402d m15456E() {
        return this.f24669p;
    }

    /* renamed from: F */
    public boolean m15455F() {
        return (this.f24665l & 2) == 2;
    }

    /* renamed from: G */
    public boolean m15454G() {
        return (this.f24665l & 1) == 1;
    }

    /* renamed from: H */
    public boolean m15453H() {
        return (this.f24665l & 4) == 4;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: L */
    public C9399b mo5765e() {
        return m15451J();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: M */
    public C9399b mo5768b() {
        return m15450K(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24671r;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24665l & 1) == 1) {
            i = C12181f.m5906h(1, this.f24666m.getNumber()) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.f24667n.size(); i3++) {
            i += C12181f.m5884s(2, this.f24667n.get(i3));
        }
        if ((this.f24665l & 2) == 2) {
            i += C12181f.m5884s(3, this.f24668o);
        }
        if ((this.f24665l & 4) == 4) {
            i += C12181f.m5906h(4, this.f24669p.getNumber());
        }
        int size = i + this.f24664k.size();
        this.f24671r = size;
        return size;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        if ((this.f24665l & 1) == 1) {
            c12181f.m5928S(1, this.f24666m.getNumber());
        }
        for (int i = 0; i < this.f24667n.size(); i++) {
            c12181f.m5913d0(2, this.f24667n.get(i));
        }
        if ((this.f24665l & 2) == 2) {
            c12181f.m5913d0(3, this.f24668o);
        }
        if ((this.f24665l & 4) == 4) {
            c12181f.m5928S(4, this.f24669p.getNumber());
        }
        c12181f.m5903i0(this.f24664k);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9397f> mo5764g() {
        return f24663t;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24670q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m15458C(); i++) {
            if (!m15459B(i).mo5761j()) {
                this.f24670q = (byte) 0;
                return false;
            }
        }
        if (m15455F() && !m15440z().mo5761j()) {
            this.f24670q = (byte) 0;
            return false;
        }
        this.f24670q = (byte) 1;
        return true;
    }

    /* renamed from: z */
    public C9407h m15440z() {
        return this.f24668o;
    }

    private C9397f(AbstractC12188i.AbstractC12190b abstractC12190b) {
        super(abstractC12190b);
        this.f24670q = (byte) -1;
        this.f24671r = -1;
        this.f24664k = abstractC12190b.m5831n();
    }

    private C9397f(boolean z) {
        this.f24670q = (byte) -1;
        this.f24671r = -1;
        this.f24664k = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9397f(C12180e c12180e, C12183g c12183g) {
        this.f24670q = (byte) -1;
        this.f24671r = -1;
        m15452I();
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
                                int m5959n = c12180e.m5959n();
                                EnumC9400c m15426a = EnumC9400c.m15426a(m5959n);
                                if (m15426a == null) {
                                    m5937J.m5891o0(m5982K);
                                    m5937J.m5891o0(m5959n);
                                } else {
                                    this.f24665l |= 1;
                                    this.f24666m = m15426a;
                                }
                            } else if (m5982K == 18) {
                                if (!(z2 & true)) {
                                    this.f24667n = new ArrayList();
                                    z2 |= true;
                                }
                                this.f24667n.add(c12180e.m5952u(C9407h.f24699w, c12183g));
                            } else if (m5982K == 26) {
                                C9407h.C9409b mo5768b = (this.f24665l & 2) == 2 ? this.f24668o.mo5768b() : null;
                                C9407h c9407h = (C9407h) c12180e.m5952u(C9407h.f24699w, c12183g);
                                this.f24668o = c9407h;
                                if (mo5768b != null) {
                                    mo5768b.mo5830p(c9407h);
                                    this.f24668o = mo5768b.m15360t();
                                }
                                this.f24665l |= 2;
                            } else if (m5982K != 32) {
                                if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                }
                            } else {
                                int m5959n2 = c12180e.m5959n();
                                EnumC9402d m15424a = EnumC9402d.m15424a(m5959n2);
                                if (m15424a == null) {
                                    m5937J.m5891o0(m5982K);
                                    m5937J.m5891o0(m5959n2);
                                } else {
                                    this.f24665l |= 4;
                                    this.f24669p = m15424a;
                                }
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
                    this.f24667n = Collections.unmodifiableList(this.f24667n);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24664k = m5997w.m5993j();
                    throw th3;
                }
                this.f24664k = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f24667n = Collections.unmodifiableList(this.f24667n);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24664k = m5997w.m5993j();
            throw th4;
        }
        this.f24664k = m5997w.m5993j();
        mo5823n();
    }
}
