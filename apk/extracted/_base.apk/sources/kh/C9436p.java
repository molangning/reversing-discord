package kh;

import java.io.IOException;
import p326rh.AbstractC12170a;
import p326rh.AbstractC12173b;
import p326rh.AbstractC12177d;
import p326rh.AbstractC12188i;
import p326rh.C12180e;
import p326rh.C12181f;
import p326rh.C12183g;
import p326rh.C12199k;
import p326rh.C12205n;
import p326rh.InterfaceC12206o;
import p326rh.InterfaceC12212r;
import p326rh.InterfaceC12213s;
import p326rh.InterfaceC12214t;

/* renamed from: kh.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9436p extends AbstractC12188i implements InterfaceC12212r {

    /* renamed from: o */
    private static final C9436p f24870o;

    /* renamed from: p */
    public static InterfaceC12213s<C9436p> f24871p = new C9437a();

    /* renamed from: k */
    private final AbstractC12177d f24872k;

    /* renamed from: l */
    private InterfaceC12206o f24873l;

    /* renamed from: m */
    private byte f24874m;

    /* renamed from: n */
    private int f24875n;

    /* renamed from: kh.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9437a extends AbstractC12173b<C9436p> {
        C9437a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9436p mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9436p(c12180e, c12183g);
        }
    }

    /* renamed from: kh.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9438b extends AbstractC12188i.AbstractC12190b<C9436p, C9438b> implements InterfaceC12212r {

        /* renamed from: k */
        private int f24876k;

        /* renamed from: l */
        private InterfaceC12206o f24877l = C12205n.f31758k;

        private C9438b() {
            m15036x();
        }

        /* renamed from: r */
        static /* synthetic */ C9438b m15042r() {
            return m15038v();
        }

        /* renamed from: v */
        private static C9438b m15038v() {
            return new C9438b();
        }

        /* renamed from: w */
        private void m15037w() {
            if ((this.f24876k & 1) != 1) {
                this.f24877l = new C12205n(this.f24877l);
                this.f24876k |= 1;
            }
        }

        /* renamed from: x */
        private void m15036x() {
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: s */
        public C9436p build() {
            C9436p m15040t = m15040t();
            if (m15040t.mo5761j()) {
                return m15040t;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15040t);
        }

        /* renamed from: t */
        public C9436p m15040t() {
            C9436p c9436p = new C9436p(this);
            if ((this.f24876k & 1) == 1) {
                this.f24877l = this.f24877l.mo5696n();
                this.f24876k &= -2;
            }
            c9436p.f24873l = this.f24877l;
            return c9436p;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: u */
        public C9438b mo5832m() {
            return m15038v().mo5830p(m15040t());
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9438b mo5830p(C9436p c9436p) {
            if (c9436p == C9436p.m15048v()) {
                return this;
            }
            if (!c9436p.f24873l.isEmpty()) {
                if (this.f24877l.isEmpty()) {
                    this.f24877l = c9436p.f24873l;
                    this.f24876k &= -2;
                } else {
                    m15037w();
                    this.f24877l.addAll(c9436p.f24873l);
                }
            }
            m5829q(m5831n().m6003d(c9436p.f24872k));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9436p.C9438b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.p> r1 = kh.C9436p.f24871p     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.p r3 = (kh.C9436p) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.p r4 = (kh.C9436p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9436p.C9438b.mo6018k(rh.e, rh.g):kh.p$b");
        }
    }

    static {
        C9436p c9436p = new C9436p(true);
        f24870o = c9436p;
        c9436p.m15045y();
    }

    /* renamed from: A */
    public static C9438b m15054A(C9436p c9436p) {
        return m15044z().mo5830p(c9436p);
    }

    /* renamed from: v */
    public static C9436p m15048v() {
        return f24870o;
    }

    /* renamed from: y */
    private void m15045y() {
        this.f24873l = C12205n.f31758k;
    }

    /* renamed from: z */
    public static C9438b m15044z() {
        return C9438b.m15042r();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: B */
    public C9438b mo5765e() {
        return m15044z();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: C */
    public C9438b mo5768b() {
        return m15054A(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i = this.f24875n;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f24873l.size(); i3++) {
            i2 += C12181f.m5912e(this.f24873l.mo5697j(i3));
        }
        int size = 0 + i2 + (m15046x().size() * 1) + this.f24872k.size();
        this.f24875n = size;
        return size;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        for (int i = 0; i < this.f24873l.size(); i++) {
            c12181f.m5932O(1, this.f24873l.mo5697j(i));
        }
        c12181f.m5903i0(this.f24872k);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9436p> mo5764g() {
        return f24871p;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24874m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f24874m = (byte) 1;
        return true;
    }

    /* renamed from: w */
    public String m15047w(int i) {
        return this.f24873l.get(i);
    }

    /* renamed from: x */
    public InterfaceC12214t m15046x() {
        return this.f24873l;
    }

    private C9436p(AbstractC12188i.AbstractC12190b abstractC12190b) {
        super(abstractC12190b);
        this.f24874m = (byte) -1;
        this.f24875n = -1;
        this.f24872k = abstractC12190b.m5831n();
    }

    private C9436p(boolean z) {
        this.f24874m = (byte) -1;
        this.f24875n = -1;
        this.f24872k = AbstractC12177d.f31693j;
    }

    private C9436p(C12180e c12180e, C12183g c12183g) {
        this.f24874m = (byte) -1;
        this.f24875n = -1;
        m15045y();
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
                            if (m5982K != 10) {
                                if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                }
                            } else {
                                AbstractC12177d m5961l = c12180e.m5961l();
                                if (!(z2 & true)) {
                                    this.f24873l = new C12205n();
                                    z2 |= true;
                                }
                                this.f24873l.mo5698g(m5961l);
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
                    this.f24873l = this.f24873l.mo5696n();
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24872k = m5997w.m5993j();
                    throw th3;
                }
                this.f24872k = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f24873l = this.f24873l.mo5696n();
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24872k = m5997w.m5993j();
            throw th4;
        }
        this.f24872k = m5997w.m5993j();
        mo5823n();
    }
}
