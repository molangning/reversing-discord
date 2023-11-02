package kh;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import p326rh.AbstractC12170a;
import p326rh.AbstractC12173b;
import p326rh.AbstractC12177d;
import p326rh.AbstractC12188i;
import p326rh.C12180e;
import p326rh.C12181f;
import p326rh.C12183g;
import p326rh.C12199k;
import p326rh.InterfaceC12213s;

/* renamed from: kh.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9404g extends AbstractC12188i.AbstractC12192d<C9404g> {

    /* renamed from: q */
    private static final C9404g f24689q;

    /* renamed from: r */
    public static InterfaceC12213s<C9404g> f24690r = new C9405a();

    /* renamed from: l */
    private final AbstractC12177d f24691l;

    /* renamed from: m */
    private int f24692m;

    /* renamed from: n */
    private int f24693n;

    /* renamed from: o */
    private byte f24694o;

    /* renamed from: p */
    private int f24695p;

    /* renamed from: kh.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9405a extends AbstractC12173b<C9404g> {
        C9405a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9404g mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9404g(c12180e, c12183g);
        }
    }

    /* renamed from: kh.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9406b extends AbstractC12188i.AbstractC12191c<C9404g, C9406b> {

        /* renamed from: m */
        private int f24696m;

        /* renamed from: n */
        private int f24697n;

        private C9406b() {
            m15409A();
        }

        /* renamed from: A */
        private void m15409A() {
        }

        /* renamed from: v */
        static /* synthetic */ C9406b m15405v() {
            return m15401z();
        }

        /* renamed from: z */
        private static C9406b m15401z() {
            return new C9406b();
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: B */
        public C9406b mo5830p(C9404g c9404g) {
            if (c9404g == C9404g.m15419E()) {
                return this;
            }
            if (c9404g.m15416H()) {
                m15406D(c9404g.m15417G());
            }
            m5825u(c9404g);
            m5829q(m5831n().m6003d(c9404g.f24691l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9404g.C9406b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.g> r1 = kh.C9404g.f24690r     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.g r3 = (kh.C9404g) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.g r4 = (kh.C9404g) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9404g.C9406b.mo6018k(rh.e, rh.g):kh.g$b");
        }

        /* renamed from: D */
        public C9406b m15406D(int i) {
            this.f24696m |= 1;
            this.f24697n = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9404g build() {
            C9404g m15403x = m15403x();
            if (m15403x.mo5761j()) {
                return m15403x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15403x);
        }

        /* renamed from: x */
        public C9404g m15403x() {
            C9404g c9404g = new C9404g(this);
            int i = 1;
            if ((this.f24696m & 1) != 1) {
                i = 0;
            }
            c9404g.f24693n = this.f24697n;
            c9404g.f24692m = i;
            return c9404g;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9406b mo5832m() {
            return m15401z().mo5830p(m15403x());
        }
    }

    static {
        C9404g c9404g = new C9404g(true);
        f24689q = c9404g;
        c9404g.m15415I();
    }

    /* renamed from: E */
    public static C9404g m15419E() {
        return f24689q;
    }

    /* renamed from: I */
    private void m15415I() {
        this.f24693n = 0;
    }

    /* renamed from: J */
    public static C9406b m15414J() {
        return C9406b.m15405v();
    }

    /* renamed from: K */
    public static C9406b m15413K(C9404g c9404g) {
        return m15414J().mo5830p(c9404g);
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: F */
    public C9404g mo5762f() {
        return f24689q;
    }

    /* renamed from: G */
    public int m15417G() {
        return this.f24693n;
    }

    /* renamed from: H */
    public boolean m15416H() {
        return (this.f24692m & 1) == 1;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: L */
    public C9406b mo5765e() {
        return m15414J();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: M */
    public C9406b mo5768b() {
        return m15413K(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i = this.f24695p;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f24692m & 1) == 1) {
            i2 = 0 + C12181f.m5892o(1, this.f24693n);
        }
        int m5819u = i2 + m5819u() + this.f24691l.size();
        this.f24695p = m5819u;
        return m5819u;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        if ((this.f24692m & 1) == 1) {
            c12181f.m5919a0(1, this.f24693n);
        }
        m5814z.m5813a(ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, c12181f);
        c12181f.m5903i0(this.f24691l);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9404g> mo5764g() {
        return f24690r;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24694o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m5820t()) {
            this.f24694o = (byte) 0;
            return false;
        }
        this.f24694o = (byte) 1;
        return true;
    }

    private C9404g(AbstractC12188i.AbstractC12191c<C9404g, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f24694o = (byte) -1;
        this.f24695p = -1;
        this.f24691l = abstractC12191c.m5831n();
    }

    private C9404g(boolean z) {
        this.f24694o = (byte) -1;
        this.f24695p = -1;
        this.f24691l = AbstractC12177d.f31693j;
    }

    private C9404g(C12180e c12180e, C12183g c12183g) {
        this.f24694o = (byte) -1;
        this.f24695p = -1;
        m15415I();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int m5982K = c12180e.m5982K();
                    if (m5982K != 0) {
                        if (m5982K != 8) {
                            if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                            }
                        } else {
                            this.f24692m |= 1;
                            this.f24693n = c12180e.m5954s();
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
                    this.f24691l = m5997w.m5993j();
                    throw th3;
                }
                this.f24691l = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24691l = m5997w.m5993j();
            throw th4;
        }
        this.f24691l = m5997w.m5993j();
        mo5823n();
    }
}
