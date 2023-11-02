package kh;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kh.C9439q;
import kh.C9455t;
import kh.C9468w;
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

/* renamed from: kh.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9386c extends AbstractC12188i.AbstractC12192d<C9386c> {

    /* renamed from: T */
    private static final C9386c f24570T;

    /* renamed from: U */
    public static InterfaceC12213s<C9386c> f24571U = new C9387a();

    /* renamed from: A */
    private List<C9412i> f24572A;

    /* renamed from: B */
    private List<C9425n> f24573B;

    /* renamed from: C */
    private List<C9447r> f24574C;

    /* renamed from: D */
    private List<C9404g> f24575D;

    /* renamed from: E */
    private List<Integer> f24576E;

    /* renamed from: F */
    private int f24577F;

    /* renamed from: G */
    private int f24578G;

    /* renamed from: H */
    private C9439q f24579H;

    /* renamed from: I */
    private int f24580I;

    /* renamed from: J */
    private List<Integer> f24581J;

    /* renamed from: K */
    private int f24582K;

    /* renamed from: L */
    private List<C9439q> f24583L;

    /* renamed from: M */
    private List<Integer> f24584M;

    /* renamed from: N */
    private int f24585N;

    /* renamed from: O */
    private C9455t f24586O;

    /* renamed from: P */
    private List<Integer> f24587P;

    /* renamed from: Q */
    private C9468w f24588Q;

    /* renamed from: R */
    private byte f24589R;

    /* renamed from: S */
    private int f24590S;

    /* renamed from: l */
    private final AbstractC12177d f24591l;

    /* renamed from: m */
    private int f24592m;

    /* renamed from: n */
    private int f24593n;

    /* renamed from: o */
    private int f24594o;

    /* renamed from: p */
    private int f24595p;

    /* renamed from: q */
    private List<C9450s> f24596q;

    /* renamed from: r */
    private List<C9439q> f24597r;

    /* renamed from: s */
    private List<Integer> f24598s;

    /* renamed from: t */
    private int f24599t;

    /* renamed from: u */
    private List<Integer> f24600u;

    /* renamed from: v */
    private int f24601v;

    /* renamed from: w */
    private List<C9439q> f24602w;

    /* renamed from: x */
    private List<Integer> f24603x;

    /* renamed from: y */
    private int f24604y;

    /* renamed from: z */
    private List<C9391d> f24605z;

    /* renamed from: kh.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C9387a extends AbstractC12173b<C9386c> {
        C9387a() {
        }

        @Override // p326rh.InterfaceC12213s
        /* renamed from: m */
        public C9386c mo5759b(C12180e c12180e, C12183g c12183g) {
            return new C9386c(c12180e, c12183g);
        }
    }

    /* renamed from: kh.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9388b extends AbstractC12188i.AbstractC12191c<C9386c, C9388b> {

        /* renamed from: C */
        private int f24608C;

        /* renamed from: E */
        private int f24610E;

        /* renamed from: m */
        private int f24617m;

        /* renamed from: o */
        private int f24619o;

        /* renamed from: p */
        private int f24620p;

        /* renamed from: n */
        private int f24618n = 6;

        /* renamed from: q */
        private List<C9450s> f24621q = Collections.emptyList();

        /* renamed from: r */
        private List<C9439q> f24622r = Collections.emptyList();

        /* renamed from: s */
        private List<Integer> f24623s = Collections.emptyList();

        /* renamed from: t */
        private List<Integer> f24624t = Collections.emptyList();

        /* renamed from: u */
        private List<C9439q> f24625u = Collections.emptyList();

        /* renamed from: v */
        private List<Integer> f24626v = Collections.emptyList();

        /* renamed from: w */
        private List<C9391d> f24627w = Collections.emptyList();

        /* renamed from: x */
        private List<C9412i> f24628x = Collections.emptyList();

        /* renamed from: y */
        private List<C9425n> f24629y = Collections.emptyList();

        /* renamed from: z */
        private List<C9447r> f24630z = Collections.emptyList();

        /* renamed from: A */
        private List<C9404g> f24606A = Collections.emptyList();

        /* renamed from: B */
        private List<Integer> f24607B = Collections.emptyList();

        /* renamed from: D */
        private C9439q f24609D = C9439q.m15008Y();

        /* renamed from: F */
        private List<Integer> f24611F = Collections.emptyList();

        /* renamed from: G */
        private List<C9439q> f24612G = Collections.emptyList();

        /* renamed from: H */
        private List<Integer> f24613H = Collections.emptyList();

        /* renamed from: I */
        private C9455t f24614I = C9455t.m14808x();

        /* renamed from: J */
        private List<Integer> f24615J = Collections.emptyList();

        /* renamed from: K */
        private C9468w f24616K = C9468w.m14701v();

        private C9388b() {
            m15531Q();
        }

        /* renamed from: A */
        private void m15547A() {
            if ((this.f24617m & 512) != 512) {
                this.f24627w = new ArrayList(this.f24627w);
                this.f24617m |= 512;
            }
        }

        /* renamed from: B */
        private void m15546B() {
            if ((this.f24617m & 256) != 256) {
                this.f24626v = new ArrayList(this.f24626v);
                this.f24617m |= 256;
            }
        }

        /* renamed from: C */
        private void m15545C() {
            if ((this.f24617m & 128) != 128) {
                this.f24625u = new ArrayList(this.f24625u);
                this.f24617m |= 128;
            }
        }

        /* renamed from: D */
        private void m15544D() {
            if ((this.f24617m & 8192) != 8192) {
                this.f24606A = new ArrayList(this.f24606A);
                this.f24617m |= 8192;
            }
        }

        /* renamed from: E */
        private void m15543E() {
            if ((this.f24617m & 1024) != 1024) {
                this.f24628x = new ArrayList(this.f24628x);
                this.f24617m |= 1024;
            }
        }

        /* renamed from: F */
        private void m15542F() {
            if ((this.f24617m & 262144) != 262144) {
                this.f24611F = new ArrayList(this.f24611F);
                this.f24617m |= 262144;
            }
        }

        /* renamed from: G */
        private void m15541G() {
            if ((this.f24617m & 1048576) != 1048576) {
                this.f24613H = new ArrayList(this.f24613H);
                this.f24617m |= 1048576;
            }
        }

        /* renamed from: H */
        private void m15540H() {
            if ((this.f24617m & 524288) != 524288) {
                this.f24612G = new ArrayList(this.f24612G);
                this.f24617m |= 524288;
            }
        }

        /* renamed from: I */
        private void m15539I() {
            if ((this.f24617m & 64) != 64) {
                this.f24624t = new ArrayList(this.f24624t);
                this.f24617m |= 64;
            }
        }

        /* renamed from: J */
        private void m15538J() {
            if ((this.f24617m & RecyclerView.ItemAnimator.FLAG_MOVED) != 2048) {
                this.f24629y = new ArrayList(this.f24629y);
                this.f24617m |= RecyclerView.ItemAnimator.FLAG_MOVED;
            }
        }

        /* renamed from: K */
        private void m15537K() {
            if ((this.f24617m & 16384) != 16384) {
                this.f24607B = new ArrayList(this.f24607B);
                this.f24617m |= 16384;
            }
        }

        /* renamed from: L */
        private void m15536L() {
            if ((this.f24617m & 32) != 32) {
                this.f24623s = new ArrayList(this.f24623s);
                this.f24617m |= 32;
            }
        }

        /* renamed from: M */
        private void m15535M() {
            if ((this.f24617m & 16) != 16) {
                this.f24622r = new ArrayList(this.f24622r);
                this.f24617m |= 16;
            }
        }

        /* renamed from: N */
        private void m15534N() {
            if ((this.f24617m & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                this.f24630z = new ArrayList(this.f24630z);
                this.f24617m |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }

        /* renamed from: O */
        private void m15533O() {
            if ((this.f24617m & 8) != 8) {
                this.f24621q = new ArrayList(this.f24621q);
                this.f24617m |= 8;
            }
        }

        /* renamed from: P */
        private void m15532P() {
            if ((this.f24617m & 4194304) != 4194304) {
                this.f24615J = new ArrayList(this.f24615J);
                this.f24617m |= 4194304;
            }
        }

        /* renamed from: Q */
        private void m15531Q() {
        }

        /* renamed from: v */
        static /* synthetic */ C9388b m15520v() {
            return m15516z();
        }

        /* renamed from: z */
        private static C9388b m15516z() {
            return new C9388b();
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: R */
        public C9388b mo5830p(C9386c c9386c) {
            if (c9386c == C9386c.m15549z0()) {
                return this;
            }
            if (c9386c.m15574m1()) {
                m15524X(c9386c.m15642E0());
            }
            if (c9386c.m15572n1()) {
                m15523Y(c9386c.m15640F0());
            }
            if (c9386c.m15576l1()) {
                m15525W(c9386c.m15565r0());
            }
            if (!c9386c.f24596q.isEmpty()) {
                if (this.f24621q.isEmpty()) {
                    this.f24621q = c9386c.f24596q;
                    this.f24617m &= -9;
                } else {
                    m15533O();
                    this.f24621q.addAll(c9386c.f24596q);
                }
            }
            if (!c9386c.f24597r.isEmpty()) {
                if (this.f24622r.isEmpty()) {
                    this.f24622r = c9386c.f24597r;
                    this.f24617m &= -17;
                } else {
                    m15535M();
                    this.f24622r.addAll(c9386c.f24597r);
                }
            }
            if (!c9386c.f24598s.isEmpty()) {
                if (this.f24623s.isEmpty()) {
                    this.f24623s = c9386c.f24598s;
                    this.f24617m &= -33;
                } else {
                    m15536L();
                    this.f24623s.addAll(c9386c.f24598s);
                }
            }
            if (!c9386c.f24600u.isEmpty()) {
                if (this.f24624t.isEmpty()) {
                    this.f24624t = c9386c.f24600u;
                    this.f24617m &= -65;
                } else {
                    m15539I();
                    this.f24624t.addAll(c9386c.f24600u);
                }
            }
            if (!c9386c.f24602w.isEmpty()) {
                if (this.f24625u.isEmpty()) {
                    this.f24625u = c9386c.f24602w;
                    this.f24617m &= -129;
                } else {
                    m15545C();
                    this.f24625u.addAll(c9386c.f24602w);
                }
            }
            if (!c9386c.f24603x.isEmpty()) {
                if (this.f24626v.isEmpty()) {
                    this.f24626v = c9386c.f24603x;
                    this.f24617m &= -257;
                } else {
                    m15546B();
                    this.f24626v.addAll(c9386c.f24603x);
                }
            }
            if (!c9386c.f24605z.isEmpty()) {
                if (this.f24627w.isEmpty()) {
                    this.f24627w = c9386c.f24605z;
                    this.f24617m &= -513;
                } else {
                    m15547A();
                    this.f24627w.addAll(c9386c.f24605z);
                }
            }
            if (!c9386c.f24572A.isEmpty()) {
                if (this.f24628x.isEmpty()) {
                    this.f24628x = c9386c.f24572A;
                    this.f24617m &= -1025;
                } else {
                    m15543E();
                    this.f24628x.addAll(c9386c.f24572A);
                }
            }
            if (!c9386c.f24573B.isEmpty()) {
                if (this.f24629y.isEmpty()) {
                    this.f24629y = c9386c.f24573B;
                    this.f24617m &= -2049;
                } else {
                    m15538J();
                    this.f24629y.addAll(c9386c.f24573B);
                }
            }
            if (!c9386c.f24574C.isEmpty()) {
                if (this.f24630z.isEmpty()) {
                    this.f24630z = c9386c.f24574C;
                    this.f24617m &= -4097;
                } else {
                    m15534N();
                    this.f24630z.addAll(c9386c.f24574C);
                }
            }
            if (!c9386c.f24575D.isEmpty()) {
                if (this.f24606A.isEmpty()) {
                    this.f24606A = c9386c.f24575D;
                    this.f24617m &= -8193;
                } else {
                    m15544D();
                    this.f24606A.addAll(c9386c.f24575D);
                }
            }
            if (!c9386c.f24576E.isEmpty()) {
                if (this.f24607B.isEmpty()) {
                    this.f24607B = c9386c.f24576E;
                    this.f24617m &= -16385;
                } else {
                    m15537K();
                    this.f24607B.addAll(c9386c.f24576E);
                }
            }
            if (c9386c.m15570o1()) {
                m15522Z(c9386c.m15632J0());
            }
            if (c9386c.m15568p1()) {
                m15528T(c9386c.m15630K0());
            }
            if (c9386c.m15566q1()) {
                m15521a0(c9386c.m15628L0());
            }
            if (!c9386c.f24581J.isEmpty()) {
                if (this.f24611F.isEmpty()) {
                    this.f24611F = c9386c.f24581J;
                    this.f24617m &= -262145;
                } else {
                    m15542F();
                    this.f24611F.addAll(c9386c.f24581J);
                }
            }
            if (!c9386c.f24583L.isEmpty()) {
                if (this.f24612G.isEmpty()) {
                    this.f24612G = c9386c.f24583L;
                    this.f24617m &= -524289;
                } else {
                    m15540H();
                    this.f24612G.addAll(c9386c.f24583L);
                }
            }
            if (!c9386c.f24584M.isEmpty()) {
                if (this.f24613H.isEmpty()) {
                    this.f24613H = c9386c.f24584M;
                    this.f24617m &= -1048577;
                } else {
                    m15541G();
                    this.f24613H.addAll(c9386c.f24584M);
                }
            }
            if (c9386c.m15564r1()) {
                m15527U(c9386c.m15582i1());
            }
            if (!c9386c.f24587P.isEmpty()) {
                if (this.f24615J.isEmpty()) {
                    this.f24615J = c9386c.f24587P;
                    this.f24617m &= -4194305;
                } else {
                    m15532P();
                    this.f24615J.addAll(c9386c.f24587P);
                }
            }
            if (c9386c.m15562s1()) {
                m15526V(c9386c.m15578k1());
            }
            m5825u(c9386c);
            m5829q(m5831n().m6003d(c9386c.f24591l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // p326rh.AbstractC12170a.AbstractC12171a
        /* renamed from: S */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kh.C9386c.C9388b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
            /*
                r2 = this;
                r0 = 0
                rh.s<kh.c> r1 = kh.C9386c.f24571U     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                kh.c r3 = (kh.C9386c) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                kh.c r4 = (kh.C9386c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kh.C9386c.C9388b.mo6018k(rh.e, rh.g):kh.c$b");
        }

        /* renamed from: T */
        public C9388b m15528T(C9439q c9439q) {
            if ((this.f24617m & 65536) == 65536 && this.f24609D != C9439q.m15008Y()) {
                this.f24609D = C9439q.m14981z0(this.f24609D).mo5830p(c9439q).m14929x();
            } else {
                this.f24609D = c9439q;
            }
            this.f24617m |= 65536;
            return this;
        }

        /* renamed from: U */
        public C9388b m15527U(C9455t c9455t) {
            if ((this.f24617m & 2097152) == 2097152 && this.f24614I != C9455t.m14808x()) {
                this.f24614I = C9455t.m14816F(this.f24614I).mo5830p(c9455t).m14801t();
            } else {
                this.f24614I = c9455t;
            }
            this.f24617m |= 2097152;
            return this;
        }

        /* renamed from: V */
        public C9388b m15526V(C9468w c9468w) {
            if ((this.f24617m & 8388608) == 8388608 && this.f24616K != C9468w.m14701v()) {
                this.f24616K = C9468w.m14707A(this.f24616K).mo5830p(c9468w).m14693t();
            } else {
                this.f24616K = c9468w;
            }
            this.f24617m |= 8388608;
            return this;
        }

        /* renamed from: W */
        public C9388b m15525W(int i) {
            this.f24617m |= 4;
            this.f24620p = i;
            return this;
        }

        /* renamed from: X */
        public C9388b m15524X(int i) {
            this.f24617m |= 1;
            this.f24618n = i;
            return this;
        }

        /* renamed from: Y */
        public C9388b m15523Y(int i) {
            this.f24617m |= 2;
            this.f24619o = i;
            return this;
        }

        /* renamed from: Z */
        public C9388b m15522Z(int i) {
            this.f24617m |= 32768;
            this.f24608C = i;
            return this;
        }

        /* renamed from: a0 */
        public C9388b m15521a0(int i) {
            this.f24617m |= 131072;
            this.f24610E = i;
            return this;
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: w */
        public C9386c build() {
            C9386c m15518x = m15518x();
            if (m15518x.mo5761j()) {
                return m15518x;
            }
            throw AbstractC12170a.AbstractC12171a.m6017l(m15518x);
        }

        /* renamed from: x */
        public C9386c m15518x() {
            C9386c c9386c = new C9386c(this);
            int i = this.f24617m;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            c9386c.f24593n = this.f24618n;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c9386c.f24594o = this.f24619o;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c9386c.f24595p = this.f24620p;
            if ((this.f24617m & 8) == 8) {
                this.f24621q = Collections.unmodifiableList(this.f24621q);
                this.f24617m &= -9;
            }
            c9386c.f24596q = this.f24621q;
            if ((this.f24617m & 16) == 16) {
                this.f24622r = Collections.unmodifiableList(this.f24622r);
                this.f24617m &= -17;
            }
            c9386c.f24597r = this.f24622r;
            if ((this.f24617m & 32) == 32) {
                this.f24623s = Collections.unmodifiableList(this.f24623s);
                this.f24617m &= -33;
            }
            c9386c.f24598s = this.f24623s;
            if ((this.f24617m & 64) == 64) {
                this.f24624t = Collections.unmodifiableList(this.f24624t);
                this.f24617m &= -65;
            }
            c9386c.f24600u = this.f24624t;
            if ((this.f24617m & 128) == 128) {
                this.f24625u = Collections.unmodifiableList(this.f24625u);
                this.f24617m &= -129;
            }
            c9386c.f24602w = this.f24625u;
            if ((this.f24617m & 256) == 256) {
                this.f24626v = Collections.unmodifiableList(this.f24626v);
                this.f24617m &= -257;
            }
            c9386c.f24603x = this.f24626v;
            if ((this.f24617m & 512) == 512) {
                this.f24627w = Collections.unmodifiableList(this.f24627w);
                this.f24617m &= -513;
            }
            c9386c.f24605z = this.f24627w;
            if ((this.f24617m & 1024) == 1024) {
                this.f24628x = Collections.unmodifiableList(this.f24628x);
                this.f24617m &= -1025;
            }
            c9386c.f24572A = this.f24628x;
            if ((this.f24617m & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
                this.f24629y = Collections.unmodifiableList(this.f24629y);
                this.f24617m &= -2049;
            }
            c9386c.f24573B = this.f24629y;
            if ((this.f24617m & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                this.f24630z = Collections.unmodifiableList(this.f24630z);
                this.f24617m &= -4097;
            }
            c9386c.f24574C = this.f24630z;
            if ((this.f24617m & 8192) == 8192) {
                this.f24606A = Collections.unmodifiableList(this.f24606A);
                this.f24617m &= -8193;
            }
            c9386c.f24575D = this.f24606A;
            if ((this.f24617m & 16384) == 16384) {
                this.f24607B = Collections.unmodifiableList(this.f24607B);
                this.f24617m &= -16385;
            }
            c9386c.f24576E = this.f24607B;
            if ((i & 32768) == 32768) {
                i2 |= 8;
            }
            c9386c.f24578G = this.f24608C;
            if ((i & 65536) == 65536) {
                i2 |= 16;
            }
            c9386c.f24579H = this.f24609D;
            if ((i & 131072) == 131072) {
                i2 |= 32;
            }
            c9386c.f24580I = this.f24610E;
            if ((this.f24617m & 262144) == 262144) {
                this.f24611F = Collections.unmodifiableList(this.f24611F);
                this.f24617m &= -262145;
            }
            c9386c.f24581J = this.f24611F;
            if ((this.f24617m & 524288) == 524288) {
                this.f24612G = Collections.unmodifiableList(this.f24612G);
                this.f24617m &= -524289;
            }
            c9386c.f24583L = this.f24612G;
            if ((this.f24617m & 1048576) == 1048576) {
                this.f24613H = Collections.unmodifiableList(this.f24613H);
                this.f24617m &= -1048577;
            }
            c9386c.f24584M = this.f24613H;
            if ((i & 2097152) == 2097152) {
                i2 |= 64;
            }
            c9386c.f24586O = this.f24614I;
            if ((this.f24617m & 4194304) == 4194304) {
                this.f24615J = Collections.unmodifiableList(this.f24615J);
                this.f24617m &= -4194305;
            }
            c9386c.f24587P = this.f24615J;
            if ((i & 8388608) == 8388608) {
                i2 |= 128;
            }
            c9386c.f24588Q = this.f24616K;
            c9386c.f24592m = i2;
            return c9386c;
        }

        @Override // p326rh.AbstractC12188i.AbstractC12190b
        /* renamed from: y */
        public C9388b mo5832m() {
            return m15516z().mo5830p(m15518x());
        }
    }

    /* renamed from: kh.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC9389c implements C12196j.InterfaceC12197a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        

        /* renamed from: r */
        private static C12196j.InterfaceC12198b<EnumC9389c> f24638r = new C9390a();

        /* renamed from: j */
        private final int f24640j;

        /* renamed from: kh.c$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C9390a implements C12196j.InterfaceC12198b<EnumC9389c> {
            C9390a() {
            }

            @Override // p326rh.C12196j.InterfaceC12198b
            /* renamed from: b */
            public EnumC9389c mo5797a(int i) {
                return EnumC9389c.m15515a(i);
            }
        }

        EnumC9389c(int i, int i2) {
            this.f24640j = i2;
        }

        /* renamed from: a */
        public static EnumC9389c m15515a(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // p326rh.C12196j.InterfaceC12197a
        public final int getNumber() {
            return this.f24640j;
        }
    }

    static {
        C9386c c9386c = new C9386c(true);
        f24570T = c9386c;
        c9386c.m15560t1();
    }

    /* renamed from: t1 */
    private void m15560t1() {
        this.f24593n = 6;
        this.f24594o = 0;
        this.f24595p = 0;
        this.f24596q = Collections.emptyList();
        this.f24597r = Collections.emptyList();
        this.f24598s = Collections.emptyList();
        this.f24600u = Collections.emptyList();
        this.f24602w = Collections.emptyList();
        this.f24603x = Collections.emptyList();
        this.f24605z = Collections.emptyList();
        this.f24572A = Collections.emptyList();
        this.f24573B = Collections.emptyList();
        this.f24574C = Collections.emptyList();
        this.f24575D = Collections.emptyList();
        this.f24576E = Collections.emptyList();
        this.f24578G = 0;
        this.f24579H = C9439q.m15008Y();
        this.f24580I = 0;
        this.f24581J = Collections.emptyList();
        this.f24583L = Collections.emptyList();
        this.f24584M = Collections.emptyList();
        this.f24586O = C9455t.m14808x();
        this.f24587P = Collections.emptyList();
        this.f24588Q = C9468w.m14701v();
    }

    /* renamed from: u1 */
    public static C9388b m15558u1() {
        return C9388b.m15520v();
    }

    /* renamed from: v1 */
    public static C9388b m15556v1(C9386c c9386c) {
        return m15558u1().mo5830p(c9386c);
    }

    /* renamed from: x1 */
    public static C9386c m15552x1(InputStream inputStream, C12183g c12183g) {
        return f24571U.mo5758c(inputStream, c12183g);
    }

    /* renamed from: z0 */
    public static C9386c m15549z0() {
        return f24570T;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: A0 */
    public C9386c mo5762f() {
        return f24570T;
    }

    /* renamed from: B0 */
    public C9404g m15648B0(int i) {
        return this.f24575D.get(i);
    }

    /* renamed from: C0 */
    public int m15646C0() {
        return this.f24575D.size();
    }

    /* renamed from: D0 */
    public List<C9404g> m15644D0() {
        return this.f24575D;
    }

    /* renamed from: E0 */
    public int m15642E0() {
        return this.f24593n;
    }

    /* renamed from: F0 */
    public int m15640F0() {
        return this.f24594o;
    }

    /* renamed from: G0 */
    public C9412i m15638G0(int i) {
        return this.f24572A.get(i);
    }

    /* renamed from: H0 */
    public int m15636H0() {
        return this.f24572A.size();
    }

    /* renamed from: I0 */
    public List<C9412i> m15634I0() {
        return this.f24572A;
    }

    /* renamed from: J0 */
    public int m15632J0() {
        return this.f24578G;
    }

    /* renamed from: K0 */
    public C9439q m15630K0() {
        return this.f24579H;
    }

    /* renamed from: L0 */
    public int m15628L0() {
        return this.f24580I;
    }

    /* renamed from: M0 */
    public int m15626M0() {
        return this.f24581J.size();
    }

    /* renamed from: N0 */
    public List<Integer> m15624N0() {
        return this.f24581J;
    }

    /* renamed from: O0 */
    public C9439q m15622O0(int i) {
        return this.f24583L.get(i);
    }

    /* renamed from: P0 */
    public int m15620P0() {
        return this.f24583L.size();
    }

    /* renamed from: Q0 */
    public int m15618Q0() {
        return this.f24584M.size();
    }

    /* renamed from: R0 */
    public List<Integer> m15616R0() {
        return this.f24584M;
    }

    /* renamed from: S0 */
    public List<C9439q> m15614S0() {
        return this.f24583L;
    }

    /* renamed from: T0 */
    public List<Integer> m15612T0() {
        return this.f24600u;
    }

    /* renamed from: U0 */
    public C9425n m15610U0(int i) {
        return this.f24573B.get(i);
    }

    /* renamed from: V0 */
    public int m15608V0() {
        return this.f24573B.size();
    }

    /* renamed from: W0 */
    public List<C9425n> m15606W0() {
        return this.f24573B;
    }

    /* renamed from: X0 */
    public List<Integer> m15604X0() {
        return this.f24576E;
    }

    /* renamed from: Y0 */
    public C9439q m15602Y0(int i) {
        return this.f24597r.get(i);
    }

    /* renamed from: Z0 */
    public int m15600Z0() {
        return this.f24597r.size();
    }

    /* renamed from: a1 */
    public List<Integer> m15598a1() {
        return this.f24598s;
    }

    /* renamed from: b1 */
    public List<C9439q> m15596b1() {
        return this.f24597r;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: c */
    public int mo5767c() {
        int i;
        int i2 = this.f24590S;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f24592m & 1) == 1) {
            i = C12181f.m5892o(1, this.f24593n) + 0;
        } else {
            i = 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f24598s.size(); i4++) {
            i3 += C12181f.m5890p(this.f24598s.get(i4).intValue());
        }
        int i5 = i + i3;
        if (!m15598a1().isEmpty()) {
            i5 = i5 + 1 + C12181f.m5890p(i3);
        }
        this.f24599t = i3;
        if ((this.f24592m & 2) == 2) {
            i5 += C12181f.m5892o(3, this.f24594o);
        }
        if ((this.f24592m & 4) == 4) {
            i5 += C12181f.m5892o(4, this.f24595p);
        }
        for (int i6 = 0; i6 < this.f24596q.size(); i6++) {
            i5 += C12181f.m5884s(5, this.f24596q.get(i6));
        }
        for (int i7 = 0; i7 < this.f24597r.size(); i7++) {
            i5 += C12181f.m5884s(6, this.f24597r.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f24600u.size(); i9++) {
            i8 += C12181f.m5890p(this.f24600u.get(i9).intValue());
        }
        int i10 = i5 + i8;
        if (!m15612T0().isEmpty()) {
            i10 = i10 + 1 + C12181f.m5890p(i8);
        }
        this.f24601v = i8;
        for (int i11 = 0; i11 < this.f24605z.size(); i11++) {
            i10 += C12181f.m5884s(8, this.f24605z.get(i11));
        }
        for (int i12 = 0; i12 < this.f24572A.size(); i12++) {
            i10 += C12181f.m5884s(9, this.f24572A.get(i12));
        }
        for (int i13 = 0; i13 < this.f24573B.size(); i13++) {
            i10 += C12181f.m5884s(10, this.f24573B.get(i13));
        }
        for (int i14 = 0; i14 < this.f24574C.size(); i14++) {
            i10 += C12181f.m5884s(11, this.f24574C.get(i14));
        }
        for (int i15 = 0; i15 < this.f24575D.size(); i15++) {
            i10 += C12181f.m5884s(13, this.f24575D.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f24576E.size(); i17++) {
            i16 += C12181f.m5890p(this.f24576E.get(i17).intValue());
        }
        int i18 = i10 + i16;
        if (!m15604X0().isEmpty()) {
            i18 = i18 + 2 + C12181f.m5890p(i16);
        }
        this.f24577F = i16;
        if ((this.f24592m & 8) == 8) {
            i18 += C12181f.m5892o(17, this.f24578G);
        }
        if ((this.f24592m & 16) == 16) {
            i18 += C12181f.m5884s(18, this.f24579H);
        }
        if ((this.f24592m & 32) == 32) {
            i18 += C12181f.m5892o(19, this.f24580I);
        }
        for (int i19 = 0; i19 < this.f24602w.size(); i19++) {
            i18 += C12181f.m5884s(20, this.f24602w.get(i19));
        }
        int i20 = 0;
        for (int i21 = 0; i21 < this.f24603x.size(); i21++) {
            i20 += C12181f.m5890p(this.f24603x.get(i21).intValue());
        }
        int i22 = i18 + i20;
        if (!m15553x0().isEmpty()) {
            i22 = i22 + 2 + C12181f.m5890p(i20);
        }
        this.f24604y = i20;
        int i23 = 0;
        for (int i24 = 0; i24 < this.f24581J.size(); i24++) {
            i23 += C12181f.m5890p(this.f24581J.get(i24).intValue());
        }
        int i25 = i22 + i23;
        if (!m15624N0().isEmpty()) {
            i25 = i25 + 2 + C12181f.m5890p(i23);
        }
        this.f24582K = i23;
        for (int i26 = 0; i26 < this.f24583L.size(); i26++) {
            i25 += C12181f.m5884s(23, this.f24583L.get(i26));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f24584M.size(); i28++) {
            i27 += C12181f.m5890p(this.f24584M.get(i28).intValue());
        }
        int i29 = i25 + i27;
        if (!m15616R0().isEmpty()) {
            i29 = i29 + 2 + C12181f.m5890p(i27);
        }
        this.f24585N = i27;
        if ((this.f24592m & 64) == 64) {
            i29 += C12181f.m5884s(30, this.f24586O);
        }
        int i30 = 0;
        for (int i31 = 0; i31 < this.f24587P.size(); i31++) {
            i30 += C12181f.m5890p(this.f24587P.get(i31).intValue());
        }
        int size = i29 + i30 + (m15580j1().size() * 2);
        if ((this.f24592m & 128) == 128) {
            size += C12181f.m5884s(32, this.f24588Q);
        }
        int m5819u = size + m5819u() + this.f24591l.size();
        this.f24590S = m5819u;
        return m5819u;
    }

    /* renamed from: c1 */
    public C9447r m15594c1(int i) {
        return this.f24574C.get(i);
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: d */
    public void mo5766d(C12181f c12181f) {
        mo5767c();
        AbstractC12188i.AbstractC12192d<MessageType>.C12193a m5814z = m5814z();
        if ((this.f24592m & 1) == 1) {
            c12181f.m5919a0(1, this.f24593n);
        }
        if (m15598a1().size() > 0) {
            c12181f.m5891o0(18);
            c12181f.m5891o0(this.f24599t);
        }
        for (int i = 0; i < this.f24598s.size(); i++) {
            c12181f.m5917b0(this.f24598s.get(i).intValue());
        }
        if ((this.f24592m & 2) == 2) {
            c12181f.m5919a0(3, this.f24594o);
        }
        if ((this.f24592m & 4) == 4) {
            c12181f.m5919a0(4, this.f24595p);
        }
        for (int i2 = 0; i2 < this.f24596q.size(); i2++) {
            c12181f.m5913d0(5, this.f24596q.get(i2));
        }
        for (int i3 = 0; i3 < this.f24597r.size(); i3++) {
            c12181f.m5913d0(6, this.f24597r.get(i3));
        }
        if (m15612T0().size() > 0) {
            c12181f.m5891o0(58);
            c12181f.m5891o0(this.f24601v);
        }
        for (int i4 = 0; i4 < this.f24600u.size(); i4++) {
            c12181f.m5917b0(this.f24600u.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.f24605z.size(); i5++) {
            c12181f.m5913d0(8, this.f24605z.get(i5));
        }
        for (int i6 = 0; i6 < this.f24572A.size(); i6++) {
            c12181f.m5913d0(9, this.f24572A.get(i6));
        }
        for (int i7 = 0; i7 < this.f24573B.size(); i7++) {
            c12181f.m5913d0(10, this.f24573B.get(i7));
        }
        for (int i8 = 0; i8 < this.f24574C.size(); i8++) {
            c12181f.m5913d0(11, this.f24574C.get(i8));
        }
        for (int i9 = 0; i9 < this.f24575D.size(); i9++) {
            c12181f.m5913d0(13, this.f24575D.get(i9));
        }
        if (m15604X0().size() > 0) {
            c12181f.m5891o0(130);
            c12181f.m5891o0(this.f24577F);
        }
        for (int i10 = 0; i10 < this.f24576E.size(); i10++) {
            c12181f.m5917b0(this.f24576E.get(i10).intValue());
        }
        if ((this.f24592m & 8) == 8) {
            c12181f.m5919a0(17, this.f24578G);
        }
        if ((this.f24592m & 16) == 16) {
            c12181f.m5913d0(18, this.f24579H);
        }
        if ((this.f24592m & 32) == 32) {
            c12181f.m5919a0(19, this.f24580I);
        }
        for (int i11 = 0; i11 < this.f24602w.size(); i11++) {
            c12181f.m5913d0(20, this.f24602w.get(i11));
        }
        if (m15553x0().size() > 0) {
            c12181f.m5891o0(170);
            c12181f.m5891o0(this.f24604y);
        }
        for (int i12 = 0; i12 < this.f24603x.size(); i12++) {
            c12181f.m5917b0(this.f24603x.get(i12).intValue());
        }
        if (m15624N0().size() > 0) {
            c12181f.m5891o0(178);
            c12181f.m5891o0(this.f24582K);
        }
        for (int i13 = 0; i13 < this.f24581J.size(); i13++) {
            c12181f.m5917b0(this.f24581J.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.f24583L.size(); i14++) {
            c12181f.m5913d0(23, this.f24583L.get(i14));
        }
        if (m15616R0().size() > 0) {
            c12181f.m5891o0(194);
            c12181f.m5891o0(this.f24585N);
        }
        for (int i15 = 0; i15 < this.f24584M.size(); i15++) {
            c12181f.m5917b0(this.f24584M.get(i15).intValue());
        }
        if ((this.f24592m & 64) == 64) {
            c12181f.m5913d0(30, this.f24586O);
        }
        for (int i16 = 0; i16 < this.f24587P.size(); i16++) {
            c12181f.m5919a0(31, this.f24587P.get(i16).intValue());
        }
        if ((this.f24592m & 128) == 128) {
            c12181f.m5913d0(32, this.f24588Q);
        }
        m5814z.m5813a(19000, c12181f);
        c12181f.m5903i0(this.f24591l);
    }

    /* renamed from: d1 */
    public int m15592d1() {
        return this.f24574C.size();
    }

    /* renamed from: e1 */
    public List<C9447r> m15590e1() {
        return this.f24574C;
    }

    /* renamed from: f1 */
    public C9450s m15588f1(int i) {
        return this.f24596q.get(i);
    }

    @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<C9386c> mo5764g() {
        return f24571U;
    }

    /* renamed from: g1 */
    public int m15586g1() {
        return this.f24596q.size();
    }

    /* renamed from: h1 */
    public List<C9450s> m15584h1() {
        return this.f24596q;
    }

    /* renamed from: i1 */
    public C9455t m15582i1() {
        return this.f24586O;
    }

    @Override // p326rh.InterfaceC12212r
    /* renamed from: j */
    public final boolean mo5761j() {
        byte b = this.f24589R;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m15572n1()) {
            this.f24589R = (byte) 0;
            return false;
        }
        for (int i = 0; i < m15586g1(); i++) {
            if (!m15588f1(i).mo5761j()) {
                this.f24589R = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < m15600Z0(); i2++) {
            if (!m15602Y0(i2).mo5761j()) {
                this.f24589R = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m15555w0(); i3++) {
            if (!m15557v0(i3).mo5761j()) {
                this.f24589R = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m15561t0(); i4++) {
            if (!m15563s0(i4).mo5761j()) {
                this.f24589R = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < m15636H0(); i5++) {
            if (!m15638G0(i5).mo5761j()) {
                this.f24589R = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < m15608V0(); i6++) {
            if (!m15610U0(i6).mo5761j()) {
                this.f24589R = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < m15592d1(); i7++) {
            if (!m15594c1(i7).mo5761j()) {
                this.f24589R = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < m15646C0(); i8++) {
            if (!m15648B0(i8).mo5761j()) {
                this.f24589R = (byte) 0;
                return false;
            }
        }
        if (m15568p1() && !m15630K0().mo5761j()) {
            this.f24589R = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < m15620P0(); i9++) {
            if (!m15622O0(i9).mo5761j()) {
                this.f24589R = (byte) 0;
                return false;
            }
        }
        if (m15564r1() && !m15582i1().mo5761j()) {
            this.f24589R = (byte) 0;
            return false;
        } else if (!m5820t()) {
            this.f24589R = (byte) 0;
            return false;
        } else {
            this.f24589R = (byte) 1;
            return true;
        }
    }

    /* renamed from: j1 */
    public List<Integer> m15580j1() {
        return this.f24587P;
    }

    /* renamed from: k1 */
    public C9468w m15578k1() {
        return this.f24588Q;
    }

    /* renamed from: l1 */
    public boolean m15576l1() {
        return (this.f24592m & 4) == 4;
    }

    /* renamed from: m1 */
    public boolean m15574m1() {
        return (this.f24592m & 1) == 1;
    }

    /* renamed from: n1 */
    public boolean m15572n1() {
        return (this.f24592m & 2) == 2;
    }

    /* renamed from: o1 */
    public boolean m15570o1() {
        return (this.f24592m & 8) == 8;
    }

    /* renamed from: p1 */
    public boolean m15568p1() {
        return (this.f24592m & 16) == 16;
    }

    /* renamed from: q1 */
    public boolean m15566q1() {
        return (this.f24592m & 32) == 32;
    }

    /* renamed from: r0 */
    public int m15565r0() {
        return this.f24595p;
    }

    /* renamed from: r1 */
    public boolean m15564r1() {
        return (this.f24592m & 64) == 64;
    }

    /* renamed from: s0 */
    public C9391d m15563s0(int i) {
        return this.f24605z.get(i);
    }

    /* renamed from: s1 */
    public boolean m15562s1() {
        return (this.f24592m & 128) == 128;
    }

    /* renamed from: t0 */
    public int m15561t0() {
        return this.f24605z.size();
    }

    /* renamed from: u0 */
    public List<C9391d> m15559u0() {
        return this.f24605z;
    }

    /* renamed from: v0 */
    public C9439q m15557v0(int i) {
        return this.f24602w.get(i);
    }

    /* renamed from: w0 */
    public int m15555w0() {
        return this.f24602w.size();
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: w1 */
    public C9388b mo5765e() {
        return m15558u1();
    }

    /* renamed from: x0 */
    public List<Integer> m15553x0() {
        return this.f24603x;
    }

    /* renamed from: y0 */
    public List<C9439q> m15551y0() {
        return this.f24602w;
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: y1 */
    public C9388b mo5768b() {
        return m15556v1(this);
    }

    private C9386c(AbstractC12188i.AbstractC12191c<C9386c, ?> abstractC12191c) {
        super(abstractC12191c);
        this.f24599t = -1;
        this.f24601v = -1;
        this.f24604y = -1;
        this.f24577F = -1;
        this.f24582K = -1;
        this.f24585N = -1;
        this.f24589R = (byte) -1;
        this.f24590S = -1;
        this.f24591l = abstractC12191c.m5831n();
    }

    private C9386c(boolean z) {
        this.f24599t = -1;
        this.f24601v = -1;
        this.f24604y = -1;
        this.f24577F = -1;
        this.f24582K = -1;
        this.f24585N = -1;
        this.f24589R = (byte) -1;
        this.f24590S = -1;
        this.f24591l = AbstractC12177d.f31693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    private C9386c(C12180e c12180e, C12183g c12183g) {
        boolean z;
        this.f24599t = -1;
        this.f24601v = -1;
        this.f24604y = -1;
        this.f24577F = -1;
        this.f24582K = -1;
        this.f24585N = -1;
        this.f24589R = (byte) -1;
        this.f24590S = -1;
        m15560t1();
        AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
        C12181f m5937J = C12181f.m5937J(m5997w, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            ?? r5 = 4194304;
            if (!z2) {
                try {
                    try {
                        int m5982K = c12180e.m5982K();
                        switch (m5982K) {
                            case 0:
                                z = true;
                                z2 = z;
                                break;
                            case 8:
                                z = true;
                                this.f24592m |= 1;
                                this.f24593n = c12180e.m5954s();
                                break;
                            case 16:
                                boolean z4 = (z3 ? 1 : 0) & true;
                                boolean z5 = z3;
                                if (!z4) {
                                    this.f24598s = new ArrayList();
                                    z5 = (z3 ? 1 : 0) | true;
                                }
                                this.f24598s.add(Integer.valueOf(c12180e.m5954s()));
                                z3 = z5;
                                z = true;
                                break;
                            case 18:
                                int m5963j = c12180e.m5963j(c12180e.m5992A());
                                boolean z6 = (z3 ? 1 : 0) & true;
                                boolean z7 = z3;
                                if (!z6) {
                                    z7 = z3;
                                    if (c12180e.m5968e() > 0) {
                                        this.f24598s = new ArrayList();
                                        z7 = (z3 ? 1 : 0) | true;
                                    }
                                }
                                while (c12180e.m5968e() > 0) {
                                    this.f24598s.add(Integer.valueOf(c12180e.m5954s()));
                                }
                                c12180e.m5964i(m5963j);
                                z3 = z7;
                                z = true;
                                break;
                            case 24:
                                this.f24592m |= 2;
                                this.f24594o = c12180e.m5954s();
                                z3 = z3;
                                z = true;
                                break;
                            case 32:
                                this.f24592m |= 4;
                                this.f24595p = c12180e.m5954s();
                                z3 = z3;
                                z = true;
                                break;
                            case 42:
                                boolean z8 = (z3 ? 1 : 0) & true;
                                boolean z9 = z3;
                                if (!z8) {
                                    this.f24596q = new ArrayList();
                                    z9 = (z3 ? 1 : 0) | true;
                                }
                                this.f24596q.add(c12180e.m5952u(C9450s.f24959x, c12183g));
                                z3 = z9;
                                z = true;
                                break;
                            case 50:
                                boolean z10 = (z3 ? 1 : 0) & true;
                                boolean z11 = z3;
                                if (!z10) {
                                    this.f24597r = new ArrayList();
                                    z11 = (z3 ? 1 : 0) | true;
                                }
                                this.f24597r.add(c12180e.m5952u(C9439q.f24879E, c12183g));
                                z3 = z11;
                                z = true;
                                break;
                            case 56:
                                boolean z12 = (z3 ? 1 : 0) & true;
                                boolean z13 = z3;
                                if (!z12) {
                                    this.f24600u = new ArrayList();
                                    z13 = (z3 ? 1 : 0) | true;
                                }
                                this.f24600u.add(Integer.valueOf(c12180e.m5954s()));
                                z3 = z13;
                                z = true;
                                break;
                            case 58:
                                int m5963j2 = c12180e.m5963j(c12180e.m5992A());
                                boolean z14 = (z3 ? 1 : 0) & true;
                                boolean z15 = z3;
                                if (!z14) {
                                    z15 = z3;
                                    if (c12180e.m5968e() > 0) {
                                        this.f24600u = new ArrayList();
                                        z15 = (z3 ? 1 : 0) | true;
                                    }
                                }
                                while (c12180e.m5968e() > 0) {
                                    this.f24600u.add(Integer.valueOf(c12180e.m5954s()));
                                }
                                c12180e.m5964i(m5963j2);
                                z3 = z15;
                                z = true;
                                break;
                            case 66:
                                boolean z16 = (z3 ? 1 : 0) & true;
                                boolean z17 = z3;
                                if (!z16) {
                                    this.f24605z = new ArrayList();
                                    z17 = (z3 ? 1 : 0) | true;
                                }
                                this.f24605z.add(c12180e.m5952u(C9391d.f24642t, c12183g));
                                z3 = z17;
                                z = true;
                                break;
                            case 74:
                                boolean z18 = (z3 ? 1 : 0) & true;
                                boolean z19 = z3;
                                if (!z18) {
                                    this.f24572A = new ArrayList();
                                    z19 = (z3 ? 1 : 0) | true;
                                }
                                this.f24572A.add(c12180e.m5952u(C9412i.f24726F, c12183g));
                                z3 = z19;
                                z = true;
                                break;
                            case 82:
                                boolean z20 = (z3 ? 1 : 0) & true;
                                boolean z21 = z3;
                                if (!z20) {
                                    this.f24573B = new ArrayList();
                                    z21 = (z3 ? 1 : 0) | true;
                                }
                                this.f24573B.add(c12180e.m5952u(C9425n.f24808F, c12183g));
                                z3 = z21;
                                z = true;
                                break;
                            case 90:
                                boolean z22 = (z3 ? 1 : 0) & true;
                                boolean z23 = z3;
                                if (!z22) {
                                    this.f24574C = new ArrayList();
                                    z23 = (z3 ? 1 : 0) | true;
                                }
                                this.f24574C.add(c12180e.m5952u(C9447r.f24934z, c12183g));
                                z3 = z23;
                                z = true;
                                break;
                            case 106:
                                boolean z24 = (z3 ? 1 : 0) & true;
                                boolean z25 = z3;
                                if (!z24) {
                                    this.f24575D = new ArrayList();
                                    z25 = (z3 ? 1 : 0) | true;
                                }
                                this.f24575D.add(c12180e.m5952u(C9404g.f24690r, c12183g));
                                z3 = z25;
                                z = true;
                                break;
                            case 128:
                                boolean z26 = (z3 ? 1 : 0) & true;
                                boolean z27 = z3;
                                if (!z26) {
                                    this.f24576E = new ArrayList();
                                    z27 = (z3 ? 1 : 0) | true;
                                }
                                this.f24576E.add(Integer.valueOf(c12180e.m5954s()));
                                z3 = z27;
                                z = true;
                                break;
                            case 130:
                                int m5963j3 = c12180e.m5963j(c12180e.m5992A());
                                boolean z28 = (z3 ? 1 : 0) & true;
                                boolean z29 = z3;
                                if (!z28) {
                                    z29 = z3;
                                    if (c12180e.m5968e() > 0) {
                                        this.f24576E = new ArrayList();
                                        z29 = (z3 ? 1 : 0) | true;
                                    }
                                }
                                while (c12180e.m5968e() > 0) {
                                    this.f24576E.add(Integer.valueOf(c12180e.m5954s()));
                                }
                                c12180e.m5964i(m5963j3);
                                z3 = z29;
                                z = true;
                                break;
                            case 136:
                                this.f24592m |= 8;
                                this.f24578G = c12180e.m5954s();
                                z3 = z3;
                                z = true;
                                break;
                            case 146:
                                C9439q.C9446c mo5768b = (this.f24592m & 16) == 16 ? this.f24579H.mo5768b() : null;
                                C9439q c9439q = (C9439q) c12180e.m5952u(C9439q.f24879E, c12183g);
                                this.f24579H = c9439q;
                                if (mo5768b != null) {
                                    mo5768b.mo5830p(c9439q);
                                    this.f24579H = mo5768b.m14929x();
                                }
                                this.f24592m |= 16;
                                z3 = z3;
                                z = true;
                                break;
                            case 152:
                                this.f24592m |= 32;
                                this.f24580I = c12180e.m5954s();
                                z3 = z3;
                                z = true;
                                break;
                            case 162:
                                boolean z30 = (z3 ? 1 : 0) & true;
                                boolean z31 = z3;
                                if (!z30) {
                                    this.f24602w = new ArrayList();
                                    z31 = (z3 ? 1 : 0) | true;
                                }
                                this.f24602w.add(c12180e.m5952u(C9439q.f24879E, c12183g));
                                z3 = z31;
                                z = true;
                                break;
                            case 168:
                                boolean z32 = (z3 ? 1 : 0) & true;
                                boolean z33 = z3;
                                if (!z32) {
                                    this.f24603x = new ArrayList();
                                    z33 = (z3 ? 1 : 0) | true;
                                }
                                this.f24603x.add(Integer.valueOf(c12180e.m5954s()));
                                z3 = z33;
                                z = true;
                                break;
                            case 170:
                                int m5963j4 = c12180e.m5963j(c12180e.m5992A());
                                boolean z34 = (z3 ? 1 : 0) & true;
                                boolean z35 = z3;
                                if (!z34) {
                                    z35 = z3;
                                    if (c12180e.m5968e() > 0) {
                                        this.f24603x = new ArrayList();
                                        z35 = (z3 ? 1 : 0) | true;
                                    }
                                }
                                while (c12180e.m5968e() > 0) {
                                    this.f24603x.add(Integer.valueOf(c12180e.m5954s()));
                                }
                                c12180e.m5964i(m5963j4);
                                z3 = z35;
                                z = true;
                                break;
                            case 176:
                                boolean z36 = (z3 ? 1 : 0) & true;
                                boolean z37 = z3;
                                if (!z36) {
                                    this.f24581J = new ArrayList();
                                    z37 = (z3 ? 1 : 0) | true;
                                }
                                this.f24581J.add(Integer.valueOf(c12180e.m5954s()));
                                z3 = z37;
                                z = true;
                                break;
                            case 178:
                                int m5963j5 = c12180e.m5963j(c12180e.m5992A());
                                boolean z38 = (z3 ? 1 : 0) & true;
                                boolean z39 = z3;
                                if (!z38) {
                                    z39 = z3;
                                    if (c12180e.m5968e() > 0) {
                                        this.f24581J = new ArrayList();
                                        z39 = (z3 ? 1 : 0) | true;
                                    }
                                }
                                while (c12180e.m5968e() > 0) {
                                    this.f24581J.add(Integer.valueOf(c12180e.m5954s()));
                                }
                                c12180e.m5964i(m5963j5);
                                z3 = z39;
                                z = true;
                                break;
                            case 186:
                                boolean z40 = (z3 ? 1 : 0) & true;
                                boolean z41 = z3;
                                if (!z40) {
                                    this.f24583L = new ArrayList();
                                    z41 = (z3 ? 1 : 0) | true;
                                }
                                this.f24583L.add(c12180e.m5952u(C9439q.f24879E, c12183g));
                                z3 = z41;
                                z = true;
                                break;
                            case 192:
                                boolean z42 = (z3 ? 1 : 0) & true;
                                boolean z43 = z3;
                                if (!z42) {
                                    this.f24584M = new ArrayList();
                                    z43 = (z3 ? 1 : 0) | true;
                                }
                                this.f24584M.add(Integer.valueOf(c12180e.m5954s()));
                                z3 = z43;
                                z = true;
                                break;
                            case 194:
                                int m5963j6 = c12180e.m5963j(c12180e.m5992A());
                                boolean z44 = (z3 ? 1 : 0) & true;
                                boolean z45 = z3;
                                if (!z44) {
                                    z45 = z3;
                                    if (c12180e.m5968e() > 0) {
                                        this.f24584M = new ArrayList();
                                        z45 = (z3 ? 1 : 0) | true;
                                    }
                                }
                                while (c12180e.m5968e() > 0) {
                                    this.f24584M.add(Integer.valueOf(c12180e.m5954s()));
                                }
                                c12180e.m5964i(m5963j6);
                                z3 = z45;
                                z = true;
                                break;
                            case 242:
                                C9455t.C9457b mo5768b2 = (this.f24592m & 64) == 64 ? this.f24586O.mo5768b() : null;
                                C9455t c9455t = (C9455t) c12180e.m5952u(C9455t.f24985r, c12183g);
                                this.f24586O = c9455t;
                                if (mo5768b2 != null) {
                                    mo5768b2.mo5830p(c9455t);
                                    this.f24586O = mo5768b2.m14801t();
                                }
                                this.f24592m |= 64;
                                z3 = z3;
                                z = true;
                                break;
                            case 248:
                                boolean z46 = (z3 ? 1 : 0) & true;
                                boolean z47 = z3;
                                if (!z46) {
                                    this.f24587P = new ArrayList();
                                    z47 = (z3 ? 1 : 0) | true;
                                }
                                this.f24587P.add(Integer.valueOf(c12180e.m5954s()));
                                z3 = z47;
                                z = true;
                                break;
                            case ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                int m5963j7 = c12180e.m5963j(c12180e.m5992A());
                                boolean z48 = (z3 ? 1 : 0) & true;
                                boolean z49 = z3;
                                if (!z48) {
                                    z49 = z3;
                                    if (c12180e.m5968e() > 0) {
                                        this.f24587P = new ArrayList();
                                        z49 = (z3 ? 1 : 0) | true;
                                    }
                                }
                                while (c12180e.m5968e() > 0) {
                                    this.f24587P.add(Integer.valueOf(c12180e.m5954s()));
                                }
                                c12180e.m5964i(m5963j7);
                                z3 = z49;
                                z = true;
                                break;
                            case 258:
                                C9468w.C9470b mo5768b3 = (this.f24592m & 128) == 128 ? this.f24588Q.mo5768b() : null;
                                C9468w c9468w = (C9468w) c12180e.m5952u(C9468w.f25046p, c12183g);
                                this.f24588Q = c9468w;
                                if (mo5768b3 != null) {
                                    mo5768b3.mo5830p(c9468w);
                                    this.f24588Q = mo5768b3.m14693t();
                                }
                                this.f24592m |= 128;
                                z3 = z3;
                                z = true;
                                break;
                            default:
                                z = true;
                                r5 = mo5822q(c12180e, m5937J, c12183g, m5982K);
                                if (r5 != 0) {
                                    break;
                                }
                                z2 = z;
                                break;
                        }
                        z3 = z3;
                    } catch (C12199k e) {
                        throw e.m5788i(this);
                    } catch (IOException e2) {
                        throw new C12199k(e2.getMessage()).m5788i(this);
                    }
                } catch (Throwable th2) {
                    if ((z3 ? 1 : 0) & true) {
                        this.f24598s = Collections.unmodifiableList(this.f24598s);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24596q = Collections.unmodifiableList(this.f24596q);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24597r = Collections.unmodifiableList(this.f24597r);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24600u = Collections.unmodifiableList(this.f24600u);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24605z = Collections.unmodifiableList(this.f24605z);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24572A = Collections.unmodifiableList(this.f24572A);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24573B = Collections.unmodifiableList(this.f24573B);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24574C = Collections.unmodifiableList(this.f24574C);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24575D = Collections.unmodifiableList(this.f24575D);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24576E = Collections.unmodifiableList(this.f24576E);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24602w = Collections.unmodifiableList(this.f24602w);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24603x = Collections.unmodifiableList(this.f24603x);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24581J = Collections.unmodifiableList(this.f24581J);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24583L = Collections.unmodifiableList(this.f24583L);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.f24584M = Collections.unmodifiableList(this.f24584M);
                    }
                    if (((z3 ? 1 : 0) & r5) == r5) {
                        this.f24587P = Collections.unmodifiableList(this.f24587P);
                    }
                    try {
                        m5937J.m5938I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f24591l = m5997w.m5993j();
                        throw th3;
                    }
                    this.f24591l = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            } else {
                if ((z3 ? 1 : 0) & true) {
                    this.f24598s = Collections.unmodifiableList(this.f24598s);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24596q = Collections.unmodifiableList(this.f24596q);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24597r = Collections.unmodifiableList(this.f24597r);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24600u = Collections.unmodifiableList(this.f24600u);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24605z = Collections.unmodifiableList(this.f24605z);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24572A = Collections.unmodifiableList(this.f24572A);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24573B = Collections.unmodifiableList(this.f24573B);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24574C = Collections.unmodifiableList(this.f24574C);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24575D = Collections.unmodifiableList(this.f24575D);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24576E = Collections.unmodifiableList(this.f24576E);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24602w = Collections.unmodifiableList(this.f24602w);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24603x = Collections.unmodifiableList(this.f24603x);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24581J = Collections.unmodifiableList(this.f24581J);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24583L = Collections.unmodifiableList(this.f24583L);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24584M = Collections.unmodifiableList(this.f24584M);
                }
                if ((z3 ? 1 : 0) & true) {
                    this.f24587P = Collections.unmodifiableList(this.f24587P);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f24591l = m5997w.m5993j();
                    throw th4;
                }
                this.f24591l = m5997w.m5993j();
                mo5823n();
                return;
            }
        }
    }
}
