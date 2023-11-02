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
import p326rh.InterfaceC12212r;
import p326rh.InterfaceC12213s;

/* renamed from: kh.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9455t extends AbstractC12188i implements InterfaceC12212r {

    /* renamed from: q */
    private static final C9455t f24984q;

    /* renamed from: r */
    public static InterfaceC12213s<C9455t> f24985r = new C9456a();

    /* renamed from: k */
    private final AbstractC12177d f24986k;

    /* renamed from: l */
    private int f24987l;

    /* renamed from: m */
    private List<C9439q> f24988m;

    /* renamed from: n */
    private int f24989n;

    /* renamed from: o */
    private byte f24990o;

    /* renamed from: p */
    private int f24991p;

    /* renamed from: kh.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9456a extends AbstractC12173b<C9455t> {
        C9456a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9455t mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9455t(c12180e, c12183g);
        }
    }

    /* renamed from: kh.t$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9457b extends AbstractC12188i.AbstractC12190b<C9455t, C9457b> implements InterfaceC12212r {

        /* renamed from: k */
        private int f24992k;

        /* renamed from: l */
        private List<C9439q> f24993l = Collections.emptyList();

        /* renamed from: m */
        private int f24994m = -1;

        private C9457b() {
            m14797x();
        }

        /* renamed from: r */
        static /* synthetic */ C9457b m14803r() {
            return m14799v();
        }

        /* renamed from: v */
        private static C9457b m14799v() {
            return new C9457b();
        }

        /* renamed from: w */
        private void m14798w() {
            if ((this.f24992k & 1) != 1) {
                this.f24993l = new ArrayList(this.f24993l);
                this.f24992k |= 1;
            }
        }

        /* renamed from: x */
        private void m14797x() {
        }

        /* renamed from: A */
        public C9457b m14804A(int i) {
            this.f24992k |= 2;
            this.f24994m = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: s */
        public C9455t build() {
            C9455t m14801t = m14801t();
            if (m14801t.mo5761j()) {
                return m14801t;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m14801t);
        }

        /* renamed from: t */
        public C9455t m14801t() {
            C9455t c9455t = new C9455t(this);
            int i = this.f24992k;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f24993l = Collections.unmodifiableList(this.f24993l);
                this.f24992k &= -2;
            }
            c9455t.f24988m = this.f24993l;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            c9455t.f24989n = this.f24994m;
            c9455t.f24987l = i2;
            return c9455t;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: u */
        public C9457b mo5832m() {
            return m14799v().mo5830p(m14801t());
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9457b mo5830p(C9455t c9455t) {
            if (c9455t == C9455t.m14808x()) {
                return this;
            }
            if (!c9455t.f24988m.isEmpty()) {
                if (this.f24993l.isEmpty()) {
                    this.f24993l = c9455t.f24988m;
                    this.f24992k &= -2;
                } else {
                    m14798w();
                    this.f24993l.addAll(c9455t.f24988m);
                }
            }
            if (c9455t.m14819C()) {
                m14804A(c9455t.m14807y());
            }
            m5829q(m5831n().m6003d(c9455t.f24986k));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9455t.C9457b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.t> r1 = kh.C9455t.f24985r     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.t r3 = (kh.C9455t) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.t r4 = (kh.C9455t) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9455t.C9457b.mo6018k(rh.e, rh.g):kh.t$b");
        }
    }

    static {
        C9455t c9455t = new C9455t(true);
        f24984q = c9455t;
        c9455t.m14818D();
    }

    /* renamed from: D */
    private void m14818D() {
        this.f24988m = Collections.emptyList();
        this.f24989n = -1;
    }

    /* renamed from: E */
    public static C9457b m14817E() {
        return C9457b.m14803r();
    }

    /* renamed from: F */
    public static C9457b m14816F(C9455t c9455t) {
        return m14817E().mo5830p(c9455t);
    }

    /* renamed from: x */
    public static C9455t m14808x() {
        return f24984q;
    }

    /* renamed from: A */
    public int m14821A() {
        return this.f24988m.size();
    }

    /* renamed from: B */
    public List<C9439q> m14820B() {
        return this.f24988m;
    }

    /* renamed from: C */
    public boolean m14819C() {
        return (this.f24987l & 1) == 1;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: G */
    public C9457b mo5765e() {
        return m14817E();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: H */
    public C9457b mo5768b() {
        return m14816F(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i = this.f24991p;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f24988m.size(); i3++) {
            i2 += C12181f.m5884s(1, this.f24988m.get(i3));
        }
        if ((this.f24987l & 1) == 1) {
            i2 += C12181f.m5892o(2, this.f24989n);
        }
        int size = i2 + this.f24986k.size();
        this.f24991p = size;
        return size;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        for (int i = 0; i < this.f24988m.size(); i++) {
            c12181f.m5913d0(1, this.f24988m.get(i));
        }
        if ((this.f24987l & 1) == 1) {
            c12181f.m5919a0(2, this.f24989n);
        }
        c12181f.m5903i0(this.f24986k);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9455t> mo5764g() {
        return f24985r;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24990o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m14821A(); i++) {
            if (!m14806z(i).mo5761j()) {
                this.f24990o = (byte) 0;
                return false;
            }
        }
        this.f24990o = (byte) 1;
        return true;
    }

    /* renamed from: y */
    public int m14807y() {
        return this.f24989n;
    }

    /* renamed from: z */
    public C9439q m14806z(int i) {
        return this.f24988m.get(i);
    }

    private C9455t(AbstractC12188i.AbstractC12190b abstractC12190b) {
        super(abstractC12190b);
        this.f24990o = (byte) -1;
        this.f24991p = -1;
        this.f24986k = abstractC12190b.m5831n();
    }

    private C9455t(boolean z) {
        this.f24990o = (byte) -1;
        this.f24991p = -1;
        this.f24986k = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9455t(C12180e c12180e, C12183g c12183g) {
        this.f24990o = (byte) -1;
        this.f24991p = -1;
        m14818D();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int m5982K = c12180e.m5982K();
                    if (m5982K != 0) {
                        if (m5982K == 10) {
                            if (!(z2 & true)) {
                                this.f24988m = new ArrayList();
                                z2 |= true;
                            }
                            this.f24988m.add(c12180e.m5952u(C9439q.f24879E, c12183g));
                        } else if (m5982K != 16) {
                            if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                            }
                        } else {
                            this.f24987l |= 1;
                            this.f24989n = c12180e.m5954s();
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
                    this.f24988m = Collections.unmodifiableList(this.f24988m);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24986k = m5997w.m5993j();
                    throw th3;
                }
                this.f24986k = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f24988m = Collections.unmodifiableList(this.f24988m);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24986k = m5997w.m5993j();
            throw th4;
        }
        this.f24986k = m5997w.m5993j();
        mo5823n();
    }
}