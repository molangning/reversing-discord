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

/* renamed from: kh.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9468w extends AbstractC12188i implements InterfaceC12212r {

    /* renamed from: o */
    private static final C9468w f25045o;

    /* renamed from: p */
    public static InterfaceC12213s<C9468w> f25046p = new C9469a();

    /* renamed from: k */
    private final AbstractC12177d f25047k;

    /* renamed from: l */
    private List<C9461v> f25048l;

    /* renamed from: m */
    private byte f25049m;

    /* renamed from: n */
    private int f25050n;

    /* renamed from: kh.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9469a extends AbstractC12173b<C9468w> {
        C9469a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9468w mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9468w(c12180e, c12183g);
        }
    }

    /* renamed from: kh.w$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9470b extends AbstractC12188i.AbstractC12190b<C9468w, C9470b> implements InterfaceC12212r {

        /* renamed from: k */
        private int f25051k;

        /* renamed from: l */
        private List<C9461v> f25052l = Collections.emptyList();

        private C9470b() {
            m14689x();
        }

        /* renamed from: r */
        static /* synthetic */ C9470b m14695r() {
            return m14691v();
        }

        /* renamed from: v */
        private static C9470b m14691v() {
            return new C9470b();
        }

        /* renamed from: w */
        private void m14690w() {
            if ((this.f25051k & 1) != 1) {
                this.f25052l = new ArrayList(this.f25052l);
                this.f25051k |= 1;
            }
        }

        /* renamed from: x */
        private void m14689x() {
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: s */
        public C9468w build() {
            C9468w m14693t = m14693t();
            if (m14693t.mo5761j()) {
                return m14693t;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m14693t);
        }

        /* renamed from: t */
        public C9468w m14693t() {
            C9468w c9468w = new C9468w(this);
            if ((this.f25051k & 1) == 1) {
                this.f25052l = Collections.unmodifiableList(this.f25052l);
                this.f25051k &= -2;
            }
            c9468w.f25048l = this.f25052l;
            return c9468w;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: u */
        public C9470b mo5832m() {
            return m14691v().mo5830p(m14693t());
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9470b mo5830p(C9468w c9468w) {
            if (c9468w == C9468w.m14701v()) {
                return this;
            }
            if (!c9468w.f25048l.isEmpty()) {
                if (this.f25052l.isEmpty()) {
                    this.f25052l = c9468w.f25048l;
                    this.f25051k &= -2;
                } else {
                    m14690w();
                    this.f25052l.addAll(c9468w.f25048l);
                }
            }
            m5829q(m5831n().m6003d(c9468w.f25047k));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9468w.C9470b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.w> r1 = kh.C9468w.f25046p     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.w r3 = (kh.C9468w) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.w r4 = (kh.C9468w) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9468w.C9470b.mo6018k(rh.e, rh.g):kh.w$b");
        }
    }

    static {
        C9468w c9468w = new C9468w(true);
        f25045o = c9468w;
        c9468w.m14698y();
    }

    /* renamed from: A */
    public static C9470b m14707A(C9468w c9468w) {
        return m14697z().mo5830p(c9468w);
    }

    /* renamed from: v */
    public static C9468w m14701v() {
        return f25045o;
    }

    /* renamed from: y */
    private void m14698y() {
        this.f25048l = Collections.emptyList();
    }

    /* renamed from: z */
    public static C9470b m14697z() {
        return C9470b.m14695r();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: B */
    public C9470b mo5765e() {
        return m14697z();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: C */
    public C9470b mo5768b() {
        return m14707A(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i = this.f25050n;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f25048l.size(); i3++) {
            i2 += C12181f.m5884s(1, this.f25048l.get(i3));
        }
        int size = i2 + this.f25047k.size();
        this.f25050n = size;
        return size;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        for (int i = 0; i < this.f25048l.size(); i++) {
            c12181f.m5913d0(1, this.f25048l.get(i));
        }
        c12181f.m5903i0(this.f25047k);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9468w> mo5764g() {
        return f25046p;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f25049m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f25049m = (byte) 1;
        return true;
    }

    /* renamed from: w */
    public int m14700w() {
        return this.f25048l.size();
    }

    /* renamed from: x */
    public List<C9461v> m14699x() {
        return this.f25048l;
    }

    private C9468w(AbstractC12188i.AbstractC12190b abstractC12190b) {
        super(abstractC12190b);
        this.f25049m = (byte) -1;
        this.f25050n = -1;
        this.f25047k = abstractC12190b.m5831n();
    }

    private C9468w(boolean z) {
        this.f25049m = (byte) -1;
        this.f25050n = -1;
        this.f25047k = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9468w(C12180e c12180e, C12183g c12183g) {
        this.f25049m = (byte) -1;
        this.f25050n = -1;
        m14698y();
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
                                this.f25048l = new ArrayList();
                                z2 |= true;
                            }
                            this.f25048l.add(c12180e.m5952u(C9461v.f25015v, c12183g));
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
                    this.f25048l = Collections.unmodifiableList(this.f25048l);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f25047k = m5997w.m5993j();
                    throw th3;
                }
                this.f25047k = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f25048l = Collections.unmodifiableList(this.f25048l);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f25047k = m5997w.m5993j();
            throw th4;
        }
        this.f25047k = m5997w.m5993j();
        mo5823n();
    }
}
