package kh;

import com.reactnativecommunity.webview.RNCWebViewManager;
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
import p326rh.InterfaceC12213s;

/* renamed from: kh.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9450s extends AbstractC12188i.AbstractC12192d<C9450s> {

    /* renamed from: w */
    private static final C9450s f24958w;

    /* renamed from: x */
    public static InterfaceC12213s<C9450s> f24959x = new C9451a();

    /* renamed from: l */
    private final AbstractC12177d f24960l;

    /* renamed from: m */
    private int f24961m;

    /* renamed from: n */
    private int f24962n;

    /* renamed from: o */
    private int f24963o;

    /* renamed from: p */
    private boolean f24964p;

    /* renamed from: q */
    private EnumC9453c f24965q;

    /* renamed from: r */
    private List<C9439q> f24966r;

    /* renamed from: s */
    private List<Integer> f24967s;

    /* renamed from: t */
    private int f24968t;

    /* renamed from: u */
    private byte f24969u;

    /* renamed from: v */
    private int f24970v;

    /* renamed from: kh.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9451a extends AbstractC12173b<C9450s> {
        C9451a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9450s mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9450s(c12180e, c12183g);
        }
    }

    /* renamed from: kh.s$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9452b extends AbstractC12188i.AbstractC12191c<C9450s, C9452b> {

        /* renamed from: m */
        private int f24971m;

        /* renamed from: n */
        private int f24972n;

        /* renamed from: o */
        private int f24973o;

        /* renamed from: p */
        private boolean f24974p;

        /* renamed from: q */
        private EnumC9453c f24975q = EnumC9453c.INV;

        /* renamed from: r */
        private List<C9439q> f24976r = Collections.emptyList();

        /* renamed from: s */
        private List<Integer> f24977s = Collections.emptyList();

        private C9452b() {
            m14835C();
        }

        /* renamed from: A */
        private void m14837A() {
            if ((this.f24971m & 32) != 32) {
                this.f24977s = new ArrayList(this.f24977s);
                this.f24971m |= 32;
            }
        }

        /* renamed from: B */
        private void m14836B() {
            if ((this.f24971m & 16) != 16) {
                this.f24976r = new ArrayList(this.f24976r);
                this.f24971m |= 16;
            }
        }

        /* renamed from: C */
        private void m14835C() {
        }

        /* renamed from: v */
        static /* synthetic */ C9452b m14828v() {
            return m14824z();
        }

        /* renamed from: z */
        private static C9452b m14824z() {
            return new C9452b();
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: D */
        public C9452b mo5830p(C9450s c9450s) {
            if (c9450s == C9450s.m14857L()) {
                return this;
            }
            if (c9450s.m14847V()) {
                m14832F(c9450s.m14855N());
            }
            if (c9450s.m14846W()) {
                m14831G(c9450s.m14854O());
            }
            if (c9450s.m14845X()) {
                m14830H(c9450s.m14853P());
            }
            if (c9450s.m14844Y()) {
                m14829I(c9450s.m14848U());
            }
            if (!c9450s.f24966r.isEmpty()) {
                if (this.f24976r.isEmpty()) {
                    this.f24976r = c9450s.f24966r;
                    this.f24971m &= -17;
                } else {
                    m14836B();
                    this.f24976r.addAll(c9450s.f24966r);
                }
            }
            if (!c9450s.f24967s.isEmpty()) {
                if (this.f24977s.isEmpty()) {
                    this.f24977s = c9450s.f24967s;
                    this.f24971m &= -33;
                } else {
                    m14837A();
                    this.f24977s.addAll(c9450s.f24967s);
                }
            }
            m5825u(c9450s);
            m5829q(m5831n().m6003d(c9450s.f24960l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9450s.C9452b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.s> r1 = kh.C9450s.f24959x     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.s r3 = (kh.C9450s) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.s r4 = (kh.C9450s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9450s.C9452b.mo6018k(rh.e, rh.g):kh.s$b");
        }

        /* renamed from: F */
        public C9452b m14832F(int i) {
            this.f24971m |= 1;
            this.f24972n = i;
            return this;
        }

        /* renamed from: G */
        public C9452b m14831G(int i) {
            this.f24971m |= 2;
            this.f24973o = i;
            return this;
        }

        /* renamed from: H */
        public C9452b m14830H(boolean z) {
            this.f24971m |= 4;
            this.f24974p = z;
            return this;
        }

        /* renamed from: I */
        public C9452b m14829I(EnumC9453c enumC9453c) {
            enumC9453c.getClass();
            this.f24971m |= 8;
            this.f24975q = enumC9453c;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9450s build() {
            C9450s m14826x = m14826x();
            if (m14826x.mo5761j()) {
                return m14826x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m14826x);
        }

        /* renamed from: x */
        public C9450s m14826x() {
            C9450s c9450s = new C9450s(this);
            int i = this.f24971m;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            c9450s.f24962n = this.f24972n;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c9450s.f24963o = this.f24973o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c9450s.f24964p = this.f24974p;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c9450s.f24965q = this.f24975q;
            if ((this.f24971m & 16) == 16) {
                this.f24976r = Collections.unmodifiableList(this.f24976r);
                this.f24971m &= -17;
            }
            c9450s.f24966r = this.f24976r;
            if ((this.f24971m & 32) == 32) {
                this.f24977s = Collections.unmodifiableList(this.f24977s);
                this.f24971m &= -33;
            }
            c9450s.f24967s = this.f24977s;
            c9450s.f24961m = i2;
            return c9450s;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9452b mo5832m() {
            return m14824z().mo5830p(m14826x());
        }
    }

    /* renamed from: kh.s$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC9453c implements C12196j.InterfaceC12197a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        

        /* renamed from: n */
        private static C12196j.InterfaceC12198b<EnumC9453c> f24981n = new C9454a();

        /* renamed from: j */
        private final int f24983j;

        /* renamed from: kh.s$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C9454a implements C12196j.InterfaceC12198b<EnumC9453c> {
            C9454a() {
            }

            @Override // p326rh.C12196j.InterfaceC12198b
            /* renamed from: b */
            public EnumC9453c mo5797a(int i) {
                return EnumC9453c.m14823a(i);
            }
        }

        EnumC9453c(int i, int i2) {
            this.f24983j = i2;
        }

        /* renamed from: a */
        public static EnumC9453c m14823a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return INV;
                }
                return OUT;
            }
            return IN;
        }

        @Override // p326rh.C12196j.InterfaceC12197a
        public final int getNumber() {
            return this.f24983j;
        }
    }

    static {
        C9450s c9450s = new C9450s(true);
        f24958w = c9450s;
        c9450s.m14843Z();
    }

    /* renamed from: L */
    public static C9450s m14857L() {
        return f24958w;
    }

    /* renamed from: Z */
    private void m14843Z() {
        this.f24962n = 0;
        this.f24963o = 0;
        this.f24964p = false;
        this.f24965q = EnumC9453c.INV;
        this.f24966r = Collections.emptyList();
        this.f24967s = Collections.emptyList();
    }

    /* renamed from: a0 */
    public static C9452b m14842a0() {
        return C9452b.m14828v();
    }

    /* renamed from: b0 */
    public static C9452b m14841b0(C9450s c9450s) {
        return m14842a0().mo5830p(c9450s);
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: M */
    public C9450s mo5762f() {
        return f24958w;
    }

    /* renamed from: N */
    public int m14855N() {
        return this.f24962n;
    }

    /* renamed from: O */
    public int m14854O() {
        return this.f24963o;
    }

    /* renamed from: P */
    public boolean m14853P() {
        return this.f24964p;
    }

    /* renamed from: Q */
    public C9439q m14852Q(int i) {
        return this.f24966r.get(i);
    }

    /* renamed from: R */
    public int m14851R() {
        return this.f24966r.size();
    }

    /* renamed from: S */
    public List<Integer> m14850S() {
        return this.f24967s;
    }

    /* renamed from: T */
    public List<C9439q> m14849T() {
        return this.f24966r;
    }

    /* renamed from: U */
    public EnumC9453c m14848U() {
        return this.f24965q;
    }

    /* renamed from: V */
    public boolean m14847V() {
        return (this.f24961m & 1) == 1;
    }

    /* renamed from: W */
    public boolean m14846W() {
        return (this.f24961m & 2) == 2;
    }

    /* renamed from: X */
    public boolean m14845X() {
        return (this.f24961m & 4) == 4;
    }

    /* renamed from: Y */
    public boolean m14844Y() {
        return (this.f24961m & 8) == 8;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24970v;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24961m & 1) == 1) {
            i = C12181f.m5892o(1, this.f24962n) + 0;
        } else {
            i = 0;
        }
        if ((this.f24961m & 2) == 2) {
            i += C12181f.m5892o(2, this.f24963o);
        }
        if ((this.f24961m & 4) == 4) {
            i += C12181f.m5920a(3, this.f24964p);
        }
        if ((this.f24961m & 8) == 8) {
            i += C12181f.m5906h(4, this.f24965q.getNumber());
        }
        for (int i3 = 0; i3 < this.f24966r.size(); i3++) {
            i += C12181f.m5884s(5, this.f24966r.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f24967s.size(); i5++) {
            i4 += C12181f.m5890p(this.f24967s.get(i5).intValue());
        }
        int i6 = i + i4;
        if (!m14850S().isEmpty()) {
            i6 = i6 + 1 + C12181f.m5890p(i4);
        }
        this.f24968t = i4;
        int m5819u = i6 + m5819u() + this.f24960l.size();
        this.f24970v = m5819u;
        return m5819u;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c0 */
    public C9452b mo5765e() {
        return m14842a0();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        if ((this.f24961m & 1) == 1) {
            c12181f.m5919a0(1, this.f24962n);
        }
        if ((this.f24961m & 2) == 2) {
            c12181f.m5919a0(2, this.f24963o);
        }
        if ((this.f24961m & 4) == 4) {
            c12181f.m5935L(3, this.f24964p);
        }
        if ((this.f24961m & 8) == 8) {
            c12181f.m5928S(4, this.f24965q.getNumber());
        }
        for (int i = 0; i < this.f24966r.size(); i++) {
            c12181f.m5913d0(5, this.f24966r.get(i));
        }
        if (m14850S().size() > 0) {
            c12181f.m5891o0(50);
            c12181f.m5891o0(this.f24968t);
        }
        for (int i2 = 0; i2 < this.f24967s.size(); i2++) {
            c12181f.m5917b0(this.f24967s.get(i2).intValue());
        }
        m5814z.m5813a(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, c12181f);
        c12181f.m5903i0(this.f24960l);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d0 */
    public C9452b mo5768b() {
        return m14841b0(this);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9450s> mo5764g() {
        return f24959x;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24969u;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m14847V()) {
            this.f24969u = (byte) 0;
            return false;
        } else if (!m14846W()) {
            this.f24969u = (byte) 0;
            return false;
        } else {
            for (int i = 0; i < m14851R(); i++) {
                if (!m14852Q(i).mo5761j()) {
                    this.f24969u = (byte) 0;
                    return false;
                }
            }
            if (!m5820t()) {
                this.f24969u = (byte) 0;
                return false;
            }
            this.f24969u = (byte) 1;
            return true;
        }
    }

    private C9450s(AbstractC12188i.AbstractC12191c<C9450s, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f24968t = -1;
        this.f24969u = (byte) -1;
        this.f24970v = -1;
        this.f24960l = abstractC12191c.m5831n();
    }

    private C9450s(boolean z) {
        this.f24968t = -1;
        this.f24969u = (byte) -1;
        this.f24970v = -1;
        this.f24960l = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9450s(C12180e c12180e, C12183g c12183g) {
        this.f24968t = -1;
        this.f24969u = (byte) -1;
        this.f24970v = -1;
        m14843Z();
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
                                this.f24961m |= 1;
                                this.f24962n = c12180e.m5954s();
                            } else if (m5982K == 16) {
                                this.f24961m |= 2;
                                this.f24963o = c12180e.m5954s();
                            } else if (m5982K == 24) {
                                this.f24961m |= 4;
                                this.f24964p = c12180e.m5962k();
                            } else if (m5982K == 32) {
                                int m5959n = c12180e.m5959n();
                                EnumC9453c m14823a = EnumC9453c.m14823a(m5959n);
                                if (m14823a == null) {
                                    m5937J.m5891o0(m5982K);
                                    m5937J.m5891o0(m5959n);
                                } else {
                                    this.f24961m |= 8;
                                    this.f24965q = m14823a;
                                }
                            } else if (m5982K == 42) {
                                if (!(z2 & true)) {
                                    this.f24966r = new ArrayList();
                                    z2 |= true;
                                }
                                this.f24966r.add(c12180e.m5952u(C9439q.f24879E, c12183g));
                            } else if (m5982K == 48) {
                                if (!(z2 & true)) {
                                    this.f24967s = new ArrayList();
                                    z2 |= true;
                                }
                                this.f24967s.add(Integer.valueOf(c12180e.m5954s()));
                            } else if (m5982K != 50) {
                                if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                }
                            } else {
                                int m5963j = c12180e.m5963j(c12180e.m5992A());
                                if (!(z2 & true) && c12180e.m5968e() > 0) {
                                    this.f24967s = new ArrayList();
                                    z2 |= true;
                                }
                                while (c12180e.m5968e() > 0) {
                                    this.f24967s.add(Integer.valueOf(c12180e.m5954s()));
                                }
                                c12180e.m5964i(m5963j);
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
                if (z2 & true) {
                    this.f24966r = Collections.unmodifiableList(this.f24966r);
                }
                if (z2 & true) {
                    this.f24967s = Collections.unmodifiableList(this.f24967s);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24960l = m5997w.m5993j();
                    throw th3;
                }
                this.f24960l = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f24966r = Collections.unmodifiableList(this.f24966r);
        }
        if (z2 & true) {
            this.f24967s = Collections.unmodifiableList(this.f24967s);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24960l = m5997w.m5993j();
            throw th4;
        }
        this.f24960l = m5997w.m5993j();
        mo5823n();
    }
}