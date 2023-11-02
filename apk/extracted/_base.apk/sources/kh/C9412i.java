package kh;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kh.C9394e;
import kh.C9439q;
import kh.C9455t;
import p326rh.AbstractC12170a;
import p326rh.AbstractC12173b;
import p326rh.AbstractC12177d;
import p326rh.AbstractC12188i;
import p326rh.C12180e;
import p326rh.C12181f;
import p326rh.C12183g;
import p326rh.C12199k;
import p326rh.InterfaceC12213s;

/* renamed from: kh.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9412i extends AbstractC12188i.AbstractC12192d<C9412i> {

    /* renamed from: E */
    private static final C9412i f24725E;

    /* renamed from: F */
    public static InterfaceC12213s<C9412i> f24726F = new C9413a();

    /* renamed from: A */
    private List<Integer> f24727A;

    /* renamed from: B */
    private C9394e f24728B;

    /* renamed from: C */
    private byte f24729C;

    /* renamed from: D */
    private int f24730D;

    /* renamed from: l */
    private final AbstractC12177d f24731l;

    /* renamed from: m */
    private int f24732m;

    /* renamed from: n */
    private int f24733n;

    /* renamed from: o */
    private int f24734o;

    /* renamed from: p */
    private int f24735p;

    /* renamed from: q */
    private C9439q f24736q;

    /* renamed from: r */
    private int f24737r;

    /* renamed from: s */
    private List<C9450s> f24738s;

    /* renamed from: t */
    private C9439q f24739t;

    /* renamed from: u */
    private int f24740u;

    /* renamed from: v */
    private List<C9439q> f24741v;

    /* renamed from: w */
    private List<Integer> f24742w;

    /* renamed from: x */
    private int f24743x;

    /* renamed from: y */
    private List<C9458u> f24744y;

    /* renamed from: z */
    private C9455t f24745z;

    /* renamed from: kh.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9413a extends AbstractC12173b<C9412i> {
        C9413a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9412i mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9412i(c12180e, c12183g);
        }
    }

    /* renamed from: kh.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9414b extends AbstractC12188i.AbstractC12191c<C9412i, C9414b> {

        /* renamed from: m */
        private int f24747m;

        /* renamed from: p */
        private int f24750p;

        /* renamed from: r */
        private int f24752r;

        /* renamed from: u */
        private int f24755u;

        /* renamed from: n */
        private int f24748n = 6;

        /* renamed from: o */
        private int f24749o = 6;

        /* renamed from: q */
        private C9439q f24751q = C9439q.m15008Y();

        /* renamed from: s */
        private List<C9450s> f24753s = Collections.emptyList();

        /* renamed from: t */
        private C9439q f24754t = C9439q.m15008Y();

        /* renamed from: v */
        private List<C9439q> f24756v = Collections.emptyList();

        /* renamed from: w */
        private List<Integer> f24757w = Collections.emptyList();

        /* renamed from: x */
        private List<C9458u> f24758x = Collections.emptyList();

        /* renamed from: y */
        private C9455t f24759y = C9455t.m14808x();

        /* renamed from: z */
        private List<Integer> f24760z = Collections.emptyList();

        /* renamed from: A */
        private C9394e f24746A = C9394e.m15475v();

        private C9414b() {
            m15287F();
        }

        /* renamed from: A */
        private void m15292A() {
            if ((this.f24747m & 512) != 512) {
                this.f24757w = new ArrayList(this.f24757w);
                this.f24747m |= 512;
            }
        }

        /* renamed from: B */
        private void m15291B() {
            if ((this.f24747m & 256) != 256) {
                this.f24756v = new ArrayList(this.f24756v);
                this.f24747m |= 256;
            }
        }

        /* renamed from: C */
        private void m15290C() {
            if ((this.f24747m & 32) != 32) {
                this.f24753s = new ArrayList(this.f24753s);
                this.f24747m |= 32;
            }
        }

        /* renamed from: D */
        private void m15289D() {
            if ((this.f24747m & 1024) != 1024) {
                this.f24758x = new ArrayList(this.f24758x);
                this.f24747m |= 1024;
            }
        }

        /* renamed from: E */
        private void m15288E() {
            if ((this.f24747m & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                this.f24760z = new ArrayList(this.f24760z);
                this.f24747m |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }

        /* renamed from: F */
        private void m15287F() {
        }

        /* renamed from: v */
        static /* synthetic */ C9414b m15275v() {
            return m15271z();
        }

        /* renamed from: z */
        private static C9414b m15271z() {
            return new C9414b();
        }

        /* renamed from: G */
        public C9414b m15286G(C9394e c9394e) {
            if ((this.f24747m & 8192) == 8192 && this.f24746A != C9394e.m15475v()) {
                this.f24746A = C9394e.m15481A(this.f24746A).mo5830p(c9394e).m15467t();
            } else {
                this.f24746A = c9394e;
            }
            this.f24747m |= 8192;
            return this;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: H */
        public C9414b mo5830p(C9412i c9412i) {
            if (c9412i == C9412i.m15318b0()) {
                return this;
            }
            if (c9412i.m15300t0()) {
                m15280M(c9412i.m15316d0());
            }
            if (c9412i.m15298v0()) {
                m15278O(c9412i.m15314f0());
            }
            if (c9412i.m15299u0()) {
                m15279N(c9412i.m15315e0());
            }
            if (c9412i.m15295y0()) {
                m15282K(c9412i.m15311i0());
            }
            if (c9412i.m15294z0()) {
                m15276Q(c9412i.m15310j0());
            }
            if (!c9412i.f24738s.isEmpty()) {
                if (this.f24753s.isEmpty()) {
                    this.f24753s = c9412i.f24738s;
                    this.f24747m &= -33;
                } else {
                    m15290C();
                    this.f24753s.addAll(c9412i.f24738s);
                }
            }
            if (c9412i.m15297w0()) {
                m15283J(c9412i.m15313g0());
            }
            if (c9412i.m15296x0()) {
                m15277P(c9412i.m15312h0());
            }
            if (!c9412i.f24741v.isEmpty()) {
                if (this.f24756v.isEmpty()) {
                    this.f24756v = c9412i.f24741v;
                    this.f24747m &= -257;
                } else {
                    m15291B();
                    this.f24756v.addAll(c9412i.f24741v);
                }
            }
            if (!c9412i.f24742w.isEmpty()) {
                if (this.f24757w.isEmpty()) {
                    this.f24757w = c9412i.f24742w;
                    this.f24747m &= -513;
                } else {
                    m15292A();
                    this.f24757w.addAll(c9412i.f24742w);
                }
            }
            if (!c9412i.f24744y.isEmpty()) {
                if (this.f24758x.isEmpty()) {
                    this.f24758x = c9412i.f24744y;
                    this.f24747m &= -1025;
                } else {
                    m15289D();
                    this.f24758x.addAll(c9412i.f24744y);
                }
            }
            if (c9412i.m15351A0()) {
                m15281L(c9412i.m15306n0());
            }
            if (!c9412i.f24727A.isEmpty()) {
                if (this.f24760z.isEmpty()) {
                    this.f24760z = c9412i.f24727A;
                    this.f24747m &= -4097;
                } else {
                    m15288E();
                    this.f24760z.addAll(c9412i.f24727A);
                }
            }
            if (c9412i.m15301s0()) {
                m15286G(c9412i.m15319a0());
            }
            m5825u(c9412i);
            m5829q(m5831n().m6003d(c9412i.f24731l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9412i.C9414b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.i> r1 = kh.C9412i.f24726F     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.i r3 = (kh.C9412i) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.i r4 = (kh.C9412i) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9412i.C9414b.mo6018k(rh.e, rh.g):kh.i$b");
        }

        /* renamed from: J */
        public C9414b m15283J(C9439q c9439q) {
            if ((this.f24747m & 64) == 64 && this.f24754t != C9439q.m15008Y()) {
                this.f24754t = C9439q.m14981z0(this.f24754t).mo5830p(c9439q).m14929x();
            } else {
                this.f24754t = c9439q;
            }
            this.f24747m |= 64;
            return this;
        }

        /* renamed from: K */
        public C9414b m15282K(C9439q c9439q) {
            if ((this.f24747m & 8) == 8 && this.f24751q != C9439q.m15008Y()) {
                this.f24751q = C9439q.m14981z0(this.f24751q).mo5830p(c9439q).m14929x();
            } else {
                this.f24751q = c9439q;
            }
            this.f24747m |= 8;
            return this;
        }

        /* renamed from: L */
        public C9414b m15281L(C9455t c9455t) {
            if ((this.f24747m & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048 && this.f24759y != C9455t.m14808x()) {
                this.f24759y = C9455t.m14816F(this.f24759y).mo5830p(c9455t).m14801t();
            } else {
                this.f24759y = c9455t;
            }
            this.f24747m |= RecyclerView.ItemAnimator.FLAG_MOVED;
            return this;
        }

        /* renamed from: M */
        public C9414b m15280M(int i) {
            this.f24747m |= 1;
            this.f24748n = i;
            return this;
        }

        /* renamed from: N */
        public C9414b m15279N(int i) {
            this.f24747m |= 4;
            this.f24750p = i;
            return this;
        }

        /* renamed from: O */
        public C9414b m15278O(int i) {
            this.f24747m |= 2;
            this.f24749o = i;
            return this;
        }

        /* renamed from: P */
        public C9414b m15277P(int i) {
            this.f24747m |= 128;
            this.f24755u = i;
            return this;
        }

        /* renamed from: Q */
        public C9414b m15276Q(int i) {
            this.f24747m |= 16;
            this.f24752r = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9412i build() {
            C9412i m15273x = m15273x();
            if (m15273x.mo5761j()) {
                return m15273x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15273x);
        }

        /* renamed from: x */
        public C9412i m15273x() {
            C9412i c9412i = new C9412i(this);
            int i = this.f24747m;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            c9412i.f24733n = this.f24748n;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c9412i.f24734o = this.f24749o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c9412i.f24735p = this.f24750p;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c9412i.f24736q = this.f24751q;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c9412i.f24737r = this.f24752r;
            if ((this.f24747m & 32) == 32) {
                this.f24753s = Collections.unmodifiableList(this.f24753s);
                this.f24747m &= -33;
            }
            c9412i.f24738s = this.f24753s;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c9412i.f24739t = this.f24754t;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            c9412i.f24740u = this.f24755u;
            if ((this.f24747m & 256) == 256) {
                this.f24756v = Collections.unmodifiableList(this.f24756v);
                this.f24747m &= -257;
            }
            c9412i.f24741v = this.f24756v;
            if ((this.f24747m & 512) == 512) {
                this.f24757w = Collections.unmodifiableList(this.f24757w);
                this.f24747m &= -513;
            }
            c9412i.f24742w = this.f24757w;
            if ((this.f24747m & 1024) == 1024) {
                this.f24758x = Collections.unmodifiableList(this.f24758x);
                this.f24747m &= -1025;
            }
            c9412i.f24744y = this.f24758x;
            if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
                i2 |= 128;
            }
            c9412i.f24745z = this.f24759y;
            if ((this.f24747m & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                this.f24760z = Collections.unmodifiableList(this.f24760z);
                this.f24747m &= -4097;
            }
            c9412i.f24727A = this.f24760z;
            if ((i & 8192) == 8192) {
                i2 |= 256;
            }
            c9412i.f24728B = this.f24746A;
            c9412i.f24732m = i2;
            return c9412i;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9414b mo5832m() {
            return m15271z().mo5830p(m15273x());
        }
    }

    static {
        C9412i c9412i = new C9412i(true);
        f24725E = c9412i;
        c9412i.m15349B0();
    }

    /* renamed from: B0 */
    private void m15349B0() {
        this.f24733n = 6;
        this.f24734o = 6;
        this.f24735p = 0;
        this.f24736q = C9439q.m15008Y();
        this.f24737r = 0;
        this.f24738s = Collections.emptyList();
        this.f24739t = C9439q.m15008Y();
        this.f24740u = 0;
        this.f24741v = Collections.emptyList();
        this.f24742w = Collections.emptyList();
        this.f24744y = Collections.emptyList();
        this.f24745z = C9455t.m14808x();
        this.f24727A = Collections.emptyList();
        this.f24728B = C9394e.m15475v();
    }

    /* renamed from: C0 */
    public static C9414b m15347C0() {
        return C9414b.m15275v();
    }

    /* renamed from: D0 */
    public static C9414b m15345D0(C9412i c9412i) {
        return m15347C0().mo5830p(c9412i);
    }

    /* renamed from: F0 */
    public static C9412i m15341F0(InputStream inputStream, C12183g c12183g) {
        return f24726F.mo5758c(inputStream, c12183g);
    }

    /* renamed from: b0 */
    public static C9412i m15318b0() {
        return f24725E;
    }

    /* renamed from: A0 */
    public boolean m15351A0() {
        return (this.f24732m & 128) == 128;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: E0 */
    public C9414b mo5765e() {
        return m15347C0();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: G0 */
    public C9414b mo5768b() {
        return m15345D0(this);
    }

    /* renamed from: W */
    public C9439q m15323W(int i) {
        return this.f24741v.get(i);
    }

    /* renamed from: X */
    public int m15322X() {
        return this.f24741v.size();
    }

    /* renamed from: Y */
    public List<Integer> m15321Y() {
        return this.f24742w;
    }

    /* renamed from: Z */
    public List<C9439q> m15320Z() {
        return this.f24741v;
    }

    /* renamed from: a0 */
    public C9394e m15319a0() {
        return this.f24728B;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24730D;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24732m & 2) == 2) {
            i = C12181f.m5892o(1, this.f24734o) + 0;
        } else {
            i = 0;
        }
        if ((this.f24732m & 4) == 4) {
            i += C12181f.m5892o(2, this.f24735p);
        }
        if ((this.f24732m & 8) == 8) {
            i += C12181f.m5884s(3, this.f24736q);
        }
        for (int i3 = 0; i3 < this.f24738s.size(); i3++) {
            i += C12181f.m5884s(4, this.f24738s.get(i3));
        }
        if ((this.f24732m & 32) == 32) {
            i += C12181f.m5884s(5, this.f24739t);
        }
        for (int i4 = 0; i4 < this.f24744y.size(); i4++) {
            i += C12181f.m5884s(6, this.f24744y.get(i4));
        }
        if ((this.f24732m & 16) == 16) {
            i += C12181f.m5892o(7, this.f24737r);
        }
        if ((this.f24732m & 64) == 64) {
            i += C12181f.m5892o(8, this.f24740u);
        }
        if ((this.f24732m & 1) == 1) {
            i += C12181f.m5892o(9, this.f24733n);
        }
        for (int i5 = 0; i5 < this.f24741v.size(); i5++) {
            i += C12181f.m5884s(10, this.f24741v.get(i5));
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f24742w.size(); i7++) {
            i6 += C12181f.m5890p(this.f24742w.get(i7).intValue());
        }
        int i8 = i + i6;
        if (!m15321Y().isEmpty()) {
            i8 = i8 + 1 + C12181f.m5890p(i6);
        }
        this.f24743x = i6;
        if ((this.f24732m & 128) == 128) {
            i8 += C12181f.m5884s(30, this.f24745z);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f24727A.size(); i10++) {
            i9 += C12181f.m5890p(this.f24727A.get(i10).intValue());
        }
        int size = i8 + i9 + (m15302r0().size() * 2);
        if ((this.f24732m & 256) == 256) {
            size += C12181f.m5884s(32, this.f24728B);
        }
        int m5819u = size + m5819u() + this.f24731l.size();
        this.f24730D = m5819u;
        return m5819u;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: c0 */
    public C9412i mo5762f() {
        return f24725E;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        if ((this.f24732m & 2) == 2) {
            c12181f.m5919a0(1, this.f24734o);
        }
        if ((this.f24732m & 4) == 4) {
            c12181f.m5919a0(2, this.f24735p);
        }
        if ((this.f24732m & 8) == 8) {
            c12181f.m5913d0(3, this.f24736q);
        }
        for (int i = 0; i < this.f24738s.size(); i++) {
            c12181f.m5913d0(4, this.f24738s.get(i));
        }
        if ((this.f24732m & 32) == 32) {
            c12181f.m5913d0(5, this.f24739t);
        }
        for (int i2 = 0; i2 < this.f24744y.size(); i2++) {
            c12181f.m5913d0(6, this.f24744y.get(i2));
        }
        if ((this.f24732m & 16) == 16) {
            c12181f.m5919a0(7, this.f24737r);
        }
        if ((this.f24732m & 64) == 64) {
            c12181f.m5919a0(8, this.f24740u);
        }
        if ((this.f24732m & 1) == 1) {
            c12181f.m5919a0(9, this.f24733n);
        }
        for (int i3 = 0; i3 < this.f24741v.size(); i3++) {
            c12181f.m5913d0(10, this.f24741v.get(i3));
        }
        if (m15321Y().size() > 0) {
            c12181f.m5891o0(90);
            c12181f.m5891o0(this.f24743x);
        }
        for (int i4 = 0; i4 < this.f24742w.size(); i4++) {
            c12181f.m5917b0(this.f24742w.get(i4).intValue());
        }
        if ((this.f24732m & 128) == 128) {
            c12181f.m5913d0(30, this.f24745z);
        }
        for (int i5 = 0; i5 < this.f24727A.size(); i5++) {
            c12181f.m5919a0(31, this.f24727A.get(i5).intValue());
        }
        if ((this.f24732m & 256) == 256) {
            c12181f.m5913d0(32, this.f24728B);
        }
        m5814z.m5813a(19000, c12181f);
        c12181f.m5903i0(this.f24731l);
    }

    /* renamed from: d0 */
    public int m15316d0() {
        return this.f24733n;
    }

    /* renamed from: e0 */
    public int m15315e0() {
        return this.f24735p;
    }

    /* renamed from: f0 */
    public int m15314f0() {
        return this.f24734o;
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9412i> mo5764g() {
        return f24726F;
    }

    /* renamed from: g0 */
    public C9439q m15313g0() {
        return this.f24739t;
    }

    /* renamed from: h0 */
    public int m15312h0() {
        return this.f24740u;
    }

    /* renamed from: i0 */
    public C9439q m15311i0() {
        return this.f24736q;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24729C;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m15299u0()) {
            this.f24729C = (byte) 0;
            return false;
        } else if (m15295y0() && !m15311i0().mo5761j()) {
            this.f24729C = (byte) 0;
            return false;
        } else {
            for (int i = 0; i < m15308l0(); i++) {
                if (!m15309k0(i).mo5761j()) {
                    this.f24729C = (byte) 0;
                    return false;
                }
            }
            if (m15297w0() && !m15313g0().mo5761j()) {
                this.f24729C = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < m15322X(); i2++) {
                if (!m15323W(i2).mo5761j()) {
                    this.f24729C = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < m15304p0(); i3++) {
                if (!m15305o0(i3).mo5761j()) {
                    this.f24729C = (byte) 0;
                    return false;
                }
            }
            if (m15351A0() && !m15306n0().mo5761j()) {
                this.f24729C = (byte) 0;
                return false;
            } else if (m15301s0() && !m15319a0().mo5761j()) {
                this.f24729C = (byte) 0;
                return false;
            } else if (!m5820t()) {
                this.f24729C = (byte) 0;
                return false;
            } else {
                this.f24729C = (byte) 1;
                return true;
            }
        }
    }

    /* renamed from: j0 */
    public int m15310j0() {
        return this.f24737r;
    }

    /* renamed from: k0 */
    public C9450s m15309k0(int i) {
        return this.f24738s.get(i);
    }

    /* renamed from: l0 */
    public int m15308l0() {
        return this.f24738s.size();
    }

    /* renamed from: m0 */
    public List<C9450s> m15307m0() {
        return this.f24738s;
    }

    /* renamed from: n0 */
    public C9455t m15306n0() {
        return this.f24745z;
    }

    /* renamed from: o0 */
    public C9458u m15305o0(int i) {
        return this.f24744y.get(i);
    }

    /* renamed from: p0 */
    public int m15304p0() {
        return this.f24744y.size();
    }

    /* renamed from: q0 */
    public List<C9458u> m15303q0() {
        return this.f24744y;
    }

    /* renamed from: r0 */
    public List<Integer> m15302r0() {
        return this.f24727A;
    }

    /* renamed from: s0 */
    public boolean m15301s0() {
        return (this.f24732m & 256) == 256;
    }

    /* renamed from: t0 */
    public boolean m15300t0() {
        return (this.f24732m & 1) == 1;
    }

    /* renamed from: u0 */
    public boolean m15299u0() {
        return (this.f24732m & 4) == 4;
    }

    /* renamed from: v0 */
    public boolean m15298v0() {
        return (this.f24732m & 2) == 2;
    }

    /* renamed from: w0 */
    public boolean m15297w0() {
        return (this.f24732m & 32) == 32;
    }

    /* renamed from: x0 */
    public boolean m15296x0() {
        return (this.f24732m & 64) == 64;
    }

    /* renamed from: y0 */
    public boolean m15295y0() {
        return (this.f24732m & 8) == 8;
    }

    /* renamed from: z0 */
    public boolean m15294z0() {
        return (this.f24732m & 16) == 16;
    }

    private C9412i(AbstractC12188i.AbstractC12191c<C9412i, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f24743x = -1;
        this.f24729C = (byte) -1;
        this.f24730D = -1;
        this.f24731l = abstractC12191c.m5831n();
    }

    private C9412i(boolean z) {
        this.f24743x = -1;
        this.f24729C = (byte) -1;
        this.f24730D = -1;
        this.f24731l = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C9412i(C12180e c12180e, C12183g c12183g) {
        this.f24743x = -1;
        this.f24729C = (byte) -1;
        this.f24730D = -1;
        m15349B0();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            ?? r5 = 1024;
            if (!z) {
                try {
                    try {
                        try {
                            int m5982K = c12180e.m5982K();
                            switch (m5982K) {
                                case 0:
                                    break;
                                case 8:
                                    this.f24732m |= 2;
                                    this.f24734o = c12180e.m5954s();
                                    continue;
                                case 16:
                                    this.f24732m |= 4;
                                    this.f24735p = c12180e.m5954s();
                                    continue;
                                case 26:
                                    C9439q.C9446c mo5768b = (this.f24732m & 8) == 8 ? this.f24736q.mo5768b() : null;
                                    C9439q c9439q = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                                    this.f24736q = c9439q;
                                    if (mo5768b != null) {
                                        mo5768b.mo5830p(c9439q);
                                        this.f24736q = mo5768b.m14929x();
                                    }
                                    this.f24732m |= 8;
                                    continue;
                                case 34:
                                    boolean z3 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z3) {
                                        this.f24738s = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.f24738s.add(c12180e.m5952u(C9450s.f24959x, c12183g));
                                    continue;
                                case 42:
                                    C9439q.C9446c mo5768b2 = (this.f24732m & 32) == 32 ? this.f24739t.mo5768b() : null;
                                    C9439q c9439q2 = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                                    this.f24739t = c9439q2;
                                    if (mo5768b2 != null) {
                                        mo5768b2.mo5830p(c9439q2);
                                        this.f24739t = mo5768b2.m14929x();
                                    }
                                    this.f24732m |= 32;
                                    continue;
                                case 50:
                                    boolean z4 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z4) {
                                        this.f24744y = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.f24744y.add(c12180e.m5952u(C9458u.f24996w, c12183g));
                                    continue;
                                case 56:
                                    this.f24732m |= 16;
                                    this.f24737r = c12180e.m5954s();
                                    continue;
                                case 64:
                                    this.f24732m |= 64;
                                    this.f24740u = c12180e.m5954s();
                                    continue;
                                case 72:
                                    this.f24732m |= 1;
                                    this.f24733n = c12180e.m5954s();
                                    continue;
                                case 82:
                                    boolean z5 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z5) {
                                        this.f24741v = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.f24741v.add(c12180e.m5952u(C9439q.f24879E, c12183g));
                                    continue;
                                case 88:
                                    boolean z6 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z6) {
                                        this.f24742w = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.f24742w.add(Integer.valueOf(c12180e.m5954s()));
                                    continue;
                                case 90:
                                    int m5963j = c12180e.m5963j(c12180e.m5992A());
                                    boolean z7 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z7) {
                                        z2 = z2;
                                        if (c12180e.m5968e() > 0) {
                                            this.f24742w = new ArrayList();
                                            z2 = (z2 ? 1 : 0) | true;
                                        }
                                    }
                                    while (c12180e.m5968e() > 0) {
                                        this.f24742w.add(Integer.valueOf(c12180e.m5954s()));
                                    }
                                    c12180e.m5964i(m5963j);
                                    continue;
                                case 242:
                                    C9455t.C9457b mo5768b3 = (this.f24732m & 128) == 128 ? this.f24745z.mo5768b() : null;
                                    C9455t c9455t = (C9455t) c12180e.m5952u(C9455t.f24985r, c12183g);
                                    this.f24745z = c9455t;
                                    if (mo5768b3 != null) {
                                        mo5768b3.mo5830p(c9455t);
                                        this.f24745z = mo5768b3.m14801t();
                                    }
                                    this.f24732m |= 128;
                                    continue;
                                case 248:
                                    boolean z8 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z8) {
                                        this.f24727A = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.f24727A.add(Integer.valueOf(c12180e.m5954s()));
                                    continue;
                                case ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                    int m5963j2 = c12180e.m5963j(c12180e.m5992A());
                                    boolean z9 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z9) {
                                        z2 = z2;
                                        if (c12180e.m5968e() > 0) {
                                            this.f24727A = new ArrayList();
                                            z2 = (z2 ? 1 : 0) | true;
                                        }
                                    }
                                    while (c12180e.m5968e() > 0) {
                                        this.f24727A.add(Integer.valueOf(c12180e.m5954s()));
                                    }
                                    c12180e.m5964i(m5963j2);
                                    continue;
                                case 258:
                                    C9394e.C9396b mo5768b4 = (this.f24732m & 256) == 256 ? this.f24728B.mo5768b() : null;
                                    C9394e c9394e = (C9394e) c12180e.m5952u(C9394e.f24655p, c12183g);
                                    this.f24728B = c9394e;
                                    if (mo5768b4 != null) {
                                        mo5768b4.mo5830p(c9394e);
                                        this.f24728B = mo5768b4.m15467t();
                                    }
                                    this.f24732m |= 256;
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
                        }
                    } catch (IOException e2) {
                        throw new C12199k(e2.getMessage()).m5788i(this);
                    }
                } catch (Throwable th2) {
                    if ((z2 ? 1 : 0) & true) {
                        this.f24738s = Collections.unmodifiableList(this.f24738s);
                    }
                    if (((z2 ? 1 : 0) & true) == r5) {
                        this.f24744y = Collections.unmodifiableList(this.f24744y);
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.f24741v = Collections.unmodifiableList(this.f24741v);
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.f24742w = Collections.unmodifiableList(this.f24742w);
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.f24727A = Collections.unmodifiableList(this.f24727A);
                    }
                    try {
                        m5937J.m5938I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f24731l = m5997w.m5993j();
                        throw th3;
                    }
                    this.f24731l = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            } else {
                if ((z2 ? 1 : 0) & true) {
                    this.f24738s = Collections.unmodifiableList(this.f24738s);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.f24744y = Collections.unmodifiableList(this.f24744y);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.f24741v = Collections.unmodifiableList(this.f24741v);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.f24742w = Collections.unmodifiableList(this.f24742w);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.f24727A = Collections.unmodifiableList(this.f24727A);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f24731l = m5997w.m5993j();
                    throw th4;
                }
                this.f24731l = m5997w.m5993j();
                mo5823n();
                return;
            }
        }
    }
}
