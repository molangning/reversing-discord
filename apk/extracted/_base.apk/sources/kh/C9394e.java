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

/* renamed from: kh.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9394e extends AbstractC12188i implements InterfaceC12212r {

    /* renamed from: o */
    private static final C9394e f24654o;

    /* renamed from: p */
    public static InterfaceC12213s<C9394e> f24655p = new C9395a();

    /* renamed from: k */
    private final AbstractC12177d f24656k;

    /* renamed from: l */
    private List<C9397f> f24657l;

    /* renamed from: m */
    private byte f24658m;

    /* renamed from: n */
    private int f24659n;

    /* renamed from: kh.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9395a extends AbstractC12173b<C9394e> {
        C9395a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9394e mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9394e(c12180e, c12183g);
        }
    }

    /* renamed from: kh.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9396b extends AbstractC12188i.AbstractC12190b<C9394e, C9396b> implements InterfaceC12212r {

        /* renamed from: k */
        private int f24660k;

        /* renamed from: l */
        private List<C9397f> f24661l = Collections.emptyList();

        private C9396b() {
            m15463x();
        }

        /* renamed from: r */
        static /* synthetic */ C9396b m15469r() {
            return m15465v();
        }

        /* renamed from: v */
        private static C9396b m15465v() {
            return new C9396b();
        }

        /* renamed from: w */
        private void m15464w() {
            if ((this.f24660k & 1) != 1) {
                this.f24661l = new ArrayList(this.f24661l);
                this.f24660k |= 1;
            }
        }

        /* renamed from: x */
        private void m15463x() {
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: s */
        public C9394e build() {
            C9394e m15467t = m15467t();
            if (m15467t.mo5761j()) {
                return m15467t;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15467t);
        }

        /* renamed from: t */
        public C9394e m15467t() {
            C9394e c9394e = new C9394e(this);
            if ((this.f24660k & 1) == 1) {
                this.f24661l = Collections.unmodifiableList(this.f24661l);
                this.f24660k &= -2;
            }
            c9394e.f24657l = this.f24661l;
            return c9394e;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: u */
        public C9396b mo5832m() {
            return m15465v().mo5830p(m15467t());
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9396b mo5830p(C9394e c9394e) {
            if (c9394e == C9394e.m15475v()) {
                return this;
            }
            if (!c9394e.f24657l.isEmpty()) {
                if (this.f24661l.isEmpty()) {
                    this.f24661l = c9394e.f24657l;
                    this.f24660k &= -2;
                } else {
                    m15464w();
                    this.f24661l.addAll(c9394e.f24657l);
                }
            }
            m5829q(m5831n().m6003d(c9394e.f24656k));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9394e.C9396b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.e> r1 = kh.C9394e.f24655p     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.e r3 = (kh.C9394e) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.e r4 = (kh.C9394e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9394e.C9396b.mo6018k(rh.e, rh.g):kh.e$b");
        }
    }

    static {
        C9394e c9394e = new C9394e(true);
        f24654o = c9394e;
        c9394e.m15472y();
    }

    /* renamed from: A */
    public static C9396b m15481A(C9394e c9394e) {
        return m15471z().mo5830p(c9394e);
    }

    /* renamed from: v */
    public static C9394e m15475v() {
        return f24654o;
    }

    /* renamed from: y */
    private void m15472y() {
        this.f24657l = Collections.emptyList();
    }

    /* renamed from: z */
    public static C9396b m15471z() {
        return C9396b.m15469r();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: B */
    public C9396b mo5765e() {
        return m15471z();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: C */
    public C9396b mo5768b() {
        return m15481A(this);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i = this.f24659n;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f24657l.size(); i3++) {
            i2 += C12181f.m5884s(1, this.f24657l.get(i3));
        }
        int size = i2 + this.f24656k.size();
        this.f24659n = size;
        return size;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        for (int i = 0; i < this.f24657l.size(); i++) {
            c12181f.m5913d0(1, this.f24657l.get(i));
        }
        c12181f.m5903i0(this.f24656k);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9394e> mo5764g() {
        return f24655p;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24658m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m15473x(); i++) {
            if (!m15474w(i).mo5761j()) {
                this.f24658m = (byte) 0;
                return false;
            }
        }
        this.f24658m = (byte) 1;
        return true;
    }

    /* renamed from: w */
    public C9397f m15474w(int i) {
        return this.f24657l.get(i);
    }

    /* renamed from: x */
    public int m15473x() {
        return this.f24657l.size();
    }

    private C9394e(AbstractC12188i.AbstractC12190b abstractC12190b) {
        super(abstractC12190b);
        this.f24658m = (byte) -1;
        this.f24659n = -1;
        this.f24656k = abstractC12190b.m5831n();
    }

    private C9394e(boolean z) {
        this.f24658m = (byte) -1;
        this.f24659n = -1;
        this.f24656k = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9394e(C12180e c12180e, C12183g c12183g) {
        this.f24658m = (byte) -1;
        this.f24659n = -1;
        m15472y();
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
                                this.f24657l = new ArrayList();
                                z2 |= true;
                            }
                            this.f24657l.add(c12180e.m5952u(C9397f.f24663t, c12183g));
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
                    this.f24657l = Collections.unmodifiableList(this.f24657l);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24656k = m5997w.m5993j();
                    throw th3;
                }
                this.f24656k = m5997w.m5993j();
                mo5823n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f24657l = Collections.unmodifiableList(this.f24657l);
        }
        try {
            m5937J.m5938I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24656k = m5997w.m5993j();
            throw th4;
        }
        this.f24656k = m5997w.m5993j();
        mo5823n();
    }
}
