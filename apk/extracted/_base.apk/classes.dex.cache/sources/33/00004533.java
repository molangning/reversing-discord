package p250nh;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kh.C9375b;
import kh.C9386c;
import kh.C9391d;
import kh.C9412i;
import kh.C9419l;
import kh.C9425n;
import kh.C9439q;
import kh.C9450s;
import p326rh.AbstractC12170a;
import p326rh.AbstractC12173b;
import p326rh.AbstractC12177d;
import p326rh.AbstractC12188i;
import p326rh.C12180e;
import p326rh.C12181f;
import p326rh.C12183g;
import p326rh.C12196j;
import p326rh.C12199k;
import p326rh.C12234z;
import p326rh.InterfaceC12212r;
import p326rh.InterfaceC12213s;

/* renamed from: nh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10890a {

    /* renamed from: a */
    public static final AbstractC12188i.C12195f<C9391d, C10895c> f28545a;

    /* renamed from: b */
    public static final AbstractC12188i.C12195f<C9412i, C10895c> f28546b;

    /* renamed from: c */
    public static final AbstractC12188i.C12195f<C9412i, Integer> f28547c;

    /* renamed from: d */
    public static final AbstractC12188i.C12195f<C9425n, C10898d> f28548d;

    /* renamed from: e */
    public static final AbstractC12188i.C12195f<C9425n, Integer> f28549e;

    /* renamed from: f */
    public static final AbstractC12188i.C12195f<C9439q, List<C9375b>> f28550f;

    /* renamed from: g */
    public static final AbstractC12188i.C12195f<C9439q, Boolean> f28551g;

    /* renamed from: h */
    public static final AbstractC12188i.C12195f<C9450s, List<C9375b>> f28552h;

    /* renamed from: i */
    public static final AbstractC12188i.C12195f<C9386c, Integer> f28553i;

    /* renamed from: j */
    public static final AbstractC12188i.C12195f<C9386c, List<C9425n>> f28554j;

    /* renamed from: k */
    public static final AbstractC12188i.C12195f<C9386c, Integer> f28555k;

    /* renamed from: l */
    public static final AbstractC12188i.C12195f<C9386c, Integer> f28556l;

    /* renamed from: m */
    public static final AbstractC12188i.C12195f<C9419l, Integer> f28557m;

    /* renamed from: n */
    public static final AbstractC12188i.C12195f<C9419l, List<C9425n>> f28558n;

    /* renamed from: nh.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10901e extends AbstractC12188i implements InterfaceC12212r {

        /* renamed from: q */
        private static final C10901e f28598q;

        /* renamed from: r */
        public static InterfaceC12213s<C10901e> f28599r = new C10902a();

        /* renamed from: k */
        private final AbstractC12177d f28600k;

        /* renamed from: l */
        private List<C10904c> f28601l;

        /* renamed from: m */
        private List<Integer> f28602m;

        /* renamed from: n */
        private int f28603n;

        /* renamed from: o */
        private byte f28604o;

        /* renamed from: p */
        private int f28605p;

        /* renamed from: nh.a$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C10902a extends AbstractC12173b<C10901e> {
            C10902a() {
            }

            @Override // p326rh.InterfaceC12213s
            /* renamed from: m */
            public C10901e mo5759b(C12180e c12180e, C12183g c12183g) {
                return new C10901e(c12180e, c12183g);
            }
        }

        /* renamed from: nh.a$e$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C10903b extends AbstractC12188i.AbstractC12190b<C10901e, C10903b> implements InterfaceC12212r {

            /* renamed from: k */
            private int f28606k;

            /* renamed from: l */
            private List<C10904c> f28607l = Collections.emptyList();

            /* renamed from: m */
            private List<Integer> f28608m = Collections.emptyList();

            private C10903b() {
                m9623y();
            }

            /* renamed from: r */
            static /* synthetic */ C10903b m9630r() {
                return m9626v();
            }

            /* renamed from: v */
            private static C10903b m9626v() {
                return new C10903b();
            }

            /* renamed from: w */
            private void m9625w() {
                if ((this.f28606k & 2) != 2) {
                    this.f28608m = new ArrayList(this.f28608m);
                    this.f28606k |= 2;
                }
            }

            /* renamed from: x */
            private void m9624x() {
                if ((this.f28606k & 1) != 1) {
                    this.f28607l = new ArrayList(this.f28607l);
                    this.f28606k |= 1;
                }
            }

            /* renamed from: y */
            private void m9623y() {
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // p326rh.AbstractC12170a.AbstractC12171a
            /* renamed from: A */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p250nh.C10890a.C10901e.C10903b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    rh.s<nh.a$e> r1 = p250nh.C10890a.C10901e.f28599r     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    nh.a$e r3 = (p250nh.C10890a.C10901e) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                    nh.a$e r4 = (p250nh.C10890a.C10901e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: p250nh.C10890a.C10901e.C10903b.mo6018k(rh.e, rh.g):nh.a$e$b");
            }

            @Override // p326rh.InterfaceC12210q.InterfaceC12211a
            /* renamed from: s */
            public C10901e build() {
                C10901e m9628t = m9628t();
                if (m9628t.mo5761j()) {
                    return m9628t;
                }
                throw AbstractC12170a.AbstractC12171a.m6017l(m9628t);
            }

            /* renamed from: t */
            public C10901e m9628t() {
                C10901e c10901e = new C10901e(this);
                if ((this.f28606k & 1) == 1) {
                    this.f28607l = Collections.unmodifiableList(this.f28607l);
                    this.f28606k &= -2;
                }
                c10901e.f28601l = this.f28607l;
                if ((this.f28606k & 2) == 2) {
                    this.f28608m = Collections.unmodifiableList(this.f28608m);
                    this.f28606k &= -3;
                }
                c10901e.f28602m = this.f28608m;
                return c10901e;
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: u */
            public C10903b mo5832m() {
                return m9626v().mo5830p(m9628t());
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: z */
            public C10903b mo5830p(C10901e c10901e) {
                if (c10901e == C10901e.m9635x()) {
                    return this;
                }
                if (!c10901e.f28601l.isEmpty()) {
                    if (this.f28607l.isEmpty()) {
                        this.f28607l = c10901e.f28601l;
                        this.f28606k &= -2;
                    } else {
                        m9624x();
                        this.f28607l.addAll(c10901e.f28601l);
                    }
                }
                if (!c10901e.f28602m.isEmpty()) {
                    if (this.f28608m.isEmpty()) {
                        this.f28608m = c10901e.f28602m;
                        this.f28606k &= -3;
                    } else {
                        m9625w();
                        this.f28608m.addAll(c10901e.f28602m);
                    }
                }
                m5829q(m5831n().m6003d(c10901e.f28600k));
                return this;
            }
        }

        static {
            C10901e c10901e = new C10901e(true);
            f28598q = c10901e;
            c10901e.m9646A();
        }

        /* renamed from: A */
        private void m9646A() {
            this.f28601l = Collections.emptyList();
            this.f28602m = Collections.emptyList();
        }

        /* renamed from: B */
        public static C10903b m9645B() {
            return C10903b.m9630r();
        }

        /* renamed from: C */
        public static C10903b m9644C(C10901e c10901e) {
            return m9645B().mo5830p(c10901e);
        }

        /* renamed from: E */
        public static C10901e m9642E(InputStream inputStream, C12183g c12183g) {
            return f28599r.mo5760a(inputStream, c12183g);
        }

        /* renamed from: x */
        public static C10901e m9635x() {
            return f28598q;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: D */
        public C10903b mo5765e() {
            return m9645B();
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: F */
        public C10903b mo5768b() {
            return m9644C(this);
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: c */
        public int mo5767c() {
            int i = this.f28605p;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f28601l.size(); i3++) {
                i2 += C12181f.m5884s(1, this.f28601l.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f28602m.size(); i5++) {
                i4 += C12181f.m5890p(this.f28602m.get(i5).intValue());
            }
            int i6 = i2 + i4;
            if (!m9634y().isEmpty()) {
                i6 = i6 + 1 + C12181f.m5890p(i4);
            }
            this.f28603n = i4;
            int size = i6 + this.f28600k.size();
            this.f28605p = size;
            return size;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: d */
        public void mo5766d(C12181f c12181f) {
            mo5767c();
            for (int i = 0; i < this.f28601l.size(); i++) {
                c12181f.m5913d0(1, this.f28601l.get(i));
            }
            if (m9634y().size() > 0) {
                c12181f.m5891o0(42);
                c12181f.m5891o0(this.f28603n);
            }
            for (int i2 = 0; i2 < this.f28602m.size(); i2++) {
                c12181f.m5917b0(this.f28602m.get(i2).intValue());
            }
            c12181f.m5903i0(this.f28600k);
        }

        @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
        /* renamed from: g */
        public InterfaceC12213s<C10901e> mo5764g() {
            return f28599r;
        }

        @Override // p326rh.InterfaceC12212r
        /* renamed from: j */
        public final boolean mo5761j() {
            byte b = this.f28604o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f28604o = (byte) 1;
            return true;
        }

        /* renamed from: y */
        public List<Integer> m9634y() {
            return this.f28602m;
        }

        /* renamed from: z */
        public List<C10904c> m9633z() {
            return this.f28601l;
        }

        /* renamed from: nh.a$e$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C10904c extends AbstractC12188i implements InterfaceC12212r {

            /* renamed from: w */
            private static final C10904c f28609w;

            /* renamed from: x */
            public static InterfaceC12213s<C10904c> f28610x = new C10905a();

            /* renamed from: k */
            private final AbstractC12177d f28611k;

            /* renamed from: l */
            private int f28612l;

            /* renamed from: m */
            private int f28613m;

            /* renamed from: n */
            private int f28614n;

            /* renamed from: o */
            private Object f28615o;

            /* renamed from: p */
            private EnumC10907c f28616p;

            /* renamed from: q */
            private List<Integer> f28617q;

            /* renamed from: r */
            private int f28618r;

            /* renamed from: s */
            private List<Integer> f28619s;

            /* renamed from: t */
            private int f28620t;

            /* renamed from: u */
            private byte f28621u;

            /* renamed from: v */
            private int f28622v;

            /* renamed from: nh.a$e$c$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
            static class C10905a extends AbstractC12173b<C10904c> {
                C10905a() {
                }

                @Override // p326rh.InterfaceC12213s
                /* renamed from: m */
                public C10904c mo5759b(C12180e c12180e, C12183g c12183g) {
                    return new C10904c(c12180e, c12183g);
                }
            }

            /* renamed from: nh.a$e$c$b */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
            public static final class C10906b extends AbstractC12188i.AbstractC12190b<C10904c, C10906b> implements InterfaceC12212r {

                /* renamed from: k */
                private int f28623k;

                /* renamed from: m */
                private int f28625m;

                /* renamed from: l */
                private int f28624l = 1;

                /* renamed from: n */
                private Object f28626n = "";

                /* renamed from: o */
                private EnumC10907c f28627o = EnumC10907c.NONE;

                /* renamed from: p */
                private List<Integer> f28628p = Collections.emptyList();

                /* renamed from: q */
                private List<Integer> f28629q = Collections.emptyList();

                private C10906b() {
                    m9579y();
                }

                /* renamed from: r */
                static /* synthetic */ C10906b m9586r() {
                    return m9582v();
                }

                /* renamed from: v */
                private static C10906b m9582v() {
                    return new C10906b();
                }

                /* renamed from: w */
                private void m9581w() {
                    if ((this.f28623k & 32) != 32) {
                        this.f28629q = new ArrayList(this.f28629q);
                        this.f28623k |= 32;
                    }
                }

                /* renamed from: x */
                private void m9580x() {
                    if ((this.f28623k & 16) != 16) {
                        this.f28628p = new ArrayList(this.f28628p);
                        this.f28623k |= 16;
                    }
                }

                /* renamed from: y */
                private void m9579y() {
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
                @Override // p326rh.AbstractC12170a.AbstractC12171a
                /* renamed from: A */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public p250nh.C10890a.C10901e.C10904c.C10906b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        rh.s<nh.a$e$c> r1 = p250nh.C10890a.C10901e.C10904c.f28610x     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                        java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                        nh.a$e$c r3 = (p250nh.C10890a.C10901e.C10904c) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                        nh.a$e$c r4 = (p250nh.C10890a.C10901e.C10904c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: p250nh.C10890a.C10901e.C10904c.C10906b.mo6018k(rh.e, rh.g):nh.a$e$c$b");
                }

                /* renamed from: B */
                public C10906b m9589B(EnumC10907c enumC10907c) {
                    enumC10907c.getClass();
                    this.f28623k |= 8;
                    this.f28627o = enumC10907c;
                    return this;
                }

                /* renamed from: C */
                public C10906b m9588C(int i) {
                    this.f28623k |= 2;
                    this.f28625m = i;
                    return this;
                }

                /* renamed from: D */
                public C10906b m9587D(int i) {
                    this.f28623k |= 1;
                    this.f28624l = i;
                    return this;
                }

                @Override // p326rh.InterfaceC12210q.InterfaceC12211a
                /* renamed from: s */
                public C10904c build() {
                    C10904c m9584t = m9584t();
                    if (m9584t.mo5761j()) {
                        return m9584t;
                    }
                    throw AbstractC12170a.AbstractC12171a.m6017l(m9584t);
                }

                /* renamed from: t */
                public C10904c m9584t() {
                    C10904c c10904c = new C10904c(this);
                    int i = this.f28623k;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    c10904c.f28613m = this.f28624l;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    c10904c.f28614n = this.f28625m;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    c10904c.f28615o = this.f28626n;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    c10904c.f28616p = this.f28627o;
                    if ((this.f28623k & 16) == 16) {
                        this.f28628p = Collections.unmodifiableList(this.f28628p);
                        this.f28623k &= -17;
                    }
                    c10904c.f28617q = this.f28628p;
                    if ((this.f28623k & 32) == 32) {
                        this.f28629q = Collections.unmodifiableList(this.f28629q);
                        this.f28623k &= -33;
                    }
                    c10904c.f28619s = this.f28629q;
                    c10904c.f28612l = i2;
                    return c10904c;
                }

                @Override // p326rh.AbstractC12188i.AbstractC12190b
                /* renamed from: u */
                public C10906b mo5832m() {
                    return m9582v().mo5830p(m9584t());
                }

                @Override // p326rh.AbstractC12188i.AbstractC12190b
                /* renamed from: z */
                public C10906b mo5830p(C10904c c10904c) {
                    if (c10904c == C10904c.m9618D()) {
                        return this;
                    }
                    if (c10904c.m9606P()) {
                        m9587D(c10904c.m9615G());
                    }
                    if (c10904c.m9607O()) {
                        m9588C(c10904c.m9616F());
                    }
                    if (c10904c.m9605Q()) {
                        this.f28623k |= 4;
                        this.f28626n = c10904c.f28615o;
                    }
                    if (c10904c.m9608N()) {
                        m9589B(c10904c.m9617E());
                    }
                    if (!c10904c.f28617q.isEmpty()) {
                        if (this.f28628p.isEmpty()) {
                            this.f28628p = c10904c.f28617q;
                            this.f28623k &= -17;
                        } else {
                            m9580x();
                            this.f28628p.addAll(c10904c.f28617q);
                        }
                    }
                    if (!c10904c.f28619s.isEmpty()) {
                        if (this.f28629q.isEmpty()) {
                            this.f28629q = c10904c.f28619s;
                            this.f28623k &= -33;
                        } else {
                            m9581w();
                            this.f28629q.addAll(c10904c.f28619s);
                        }
                    }
                    m5829q(m5831n().m6003d(c10904c.f28611k));
                    return this;
                }
            }

            /* renamed from: nh.a$e$c$c */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
            public enum EnumC10907c implements C12196j.InterfaceC12197a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                

                /* renamed from: n */
                private static C12196j.InterfaceC12198b<EnumC10907c> f28633n = new C10908a();

                /* renamed from: j */
                private final int f28635j;

                /* renamed from: nh.a$e$c$c$a */
                /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
                static class C10908a implements C12196j.InterfaceC12198b<EnumC10907c> {
                    C10908a() {
                    }

                    @Override // p326rh.C12196j.InterfaceC12198b
                    /* renamed from: b */
                    public EnumC10907c mo5797a(int i) {
                        return EnumC10907c.m9577a(i);
                    }
                }

                EnumC10907c(int i, int i2) {
                    this.f28635j = i2;
                }

                /* renamed from: a */
                public static EnumC10907c m9577a(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                return null;
                            }
                            return DESC_TO_CLASS_ID;
                        }
                        return INTERNAL_TO_CLASS_ID;
                    }
                    return NONE;
                }

                @Override // p326rh.C12196j.InterfaceC12197a
                public final int getNumber() {
                    return this.f28635j;
                }
            }

            static {
                C10904c c10904c = new C10904c(true);
                f28609w = c10904c;
                c10904c.m9604R();
            }

            /* renamed from: D */
            public static C10904c m9618D() {
                return f28609w;
            }

            /* renamed from: R */
            private void m9604R() {
                this.f28613m = 1;
                this.f28614n = 0;
                this.f28615o = "";
                this.f28616p = EnumC10907c.NONE;
                this.f28617q = Collections.emptyList();
                this.f28619s = Collections.emptyList();
            }

            /* renamed from: S */
            public static C10906b m9603S() {
                return C10906b.m9586r();
            }

            /* renamed from: T */
            public static C10906b m9602T(C10904c c10904c) {
                return m9603S().mo5830p(c10904c);
            }

            /* renamed from: E */
            public EnumC10907c m9617E() {
                return this.f28616p;
            }

            /* renamed from: F */
            public int m9616F() {
                return this.f28614n;
            }

            /* renamed from: G */
            public int m9615G() {
                return this.f28613m;
            }

            /* renamed from: H */
            public int m9614H() {
                return this.f28619s.size();
            }

            /* renamed from: I */
            public List<Integer> m9613I() {
                return this.f28619s;
            }

            /* renamed from: J */
            public String m9612J() {
                Object obj = this.f28615o;
                if (obj instanceof String) {
                    return (String) obj;
                }
                AbstractC12177d abstractC12177d = (AbstractC12177d) obj;
                String m6006C = abstractC12177d.m6006C();
                if (abstractC12177d.mo5745t()) {
                    this.f28615o = m6006C;
                }
                return m6006C;
            }

            /* renamed from: K */
            public AbstractC12177d m9611K() {
                Object obj = this.f28615o;
                if (obj instanceof String) {
                    AbstractC12177d m5999k = AbstractC12177d.m5999k((String) obj);
                    this.f28615o = m5999k;
                    return m5999k;
                }
                return (AbstractC12177d) obj;
            }

            /* renamed from: L */
            public int m9610L() {
                return this.f28617q.size();
            }

            /* renamed from: M */
            public List<Integer> m9609M() {
                return this.f28617q;
            }

            /* renamed from: N */
            public boolean m9608N() {
                return (this.f28612l & 8) == 8;
            }

            /* renamed from: O */
            public boolean m9607O() {
                return (this.f28612l & 2) == 2;
            }

            /* renamed from: P */
            public boolean m9606P() {
                return (this.f28612l & 1) == 1;
            }

            /* renamed from: Q */
            public boolean m9605Q() {
                return (this.f28612l & 4) == 4;
            }

            @Override // p326rh.InterfaceC12210q
            /* renamed from: U */
            public C10906b mo5765e() {
                return m9603S();
            }

            @Override // p326rh.InterfaceC12210q
            /* renamed from: V */
            public C10906b mo5768b() {
                return m9602T(this);
            }

            @Override // p326rh.InterfaceC12210q
            /* renamed from: c */
            public int mo5767c() {
                int i;
                int i2 = this.f28622v;
                if (i2 != -1) {
                    return i2;
                }
                if ((this.f28612l & 1) == 1) {
                    i = C12181f.m5892o(1, this.f28613m) + 0;
                } else {
                    i = 0;
                }
                if ((this.f28612l & 2) == 2) {
                    i += C12181f.m5892o(2, this.f28614n);
                }
                if ((this.f28612l & 8) == 8) {
                    i += C12181f.m5906h(3, this.f28616p.getNumber());
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.f28617q.size(); i4++) {
                    i3 += C12181f.m5890p(this.f28617q.get(i4).intValue());
                }
                int i5 = i + i3;
                if (!m9609M().isEmpty()) {
                    i5 = i5 + 1 + C12181f.m5890p(i3);
                }
                this.f28618r = i3;
                int i6 = 0;
                for (int i7 = 0; i7 < this.f28619s.size(); i7++) {
                    i6 += C12181f.m5890p(this.f28619s.get(i7).intValue());
                }
                int i8 = i5 + i6;
                if (!m9613I().isEmpty()) {
                    i8 = i8 + 1 + C12181f.m5890p(i6);
                }
                this.f28620t = i6;
                if ((this.f28612l & 4) == 4) {
                    i8 += C12181f.m5914d(6, m9611K());
                }
                int size = i8 + this.f28611k.size();
                this.f28622v = size;
                return size;
            }

            @Override // p326rh.InterfaceC12210q
            /* renamed from: d */
            public void mo5766d(C12181f c12181f) {
                mo5767c();
                if ((this.f28612l & 1) == 1) {
                    c12181f.m5919a0(1, this.f28613m);
                }
                if ((this.f28612l & 2) == 2) {
                    c12181f.m5919a0(2, this.f28614n);
                }
                if ((this.f28612l & 8) == 8) {
                    c12181f.m5928S(3, this.f28616p.getNumber());
                }
                if (m9609M().size() > 0) {
                    c12181f.m5891o0(34);
                    c12181f.m5891o0(this.f28618r);
                }
                for (int i = 0; i < this.f28617q.size(); i++) {
                    c12181f.m5917b0(this.f28617q.get(i).intValue());
                }
                if (m9613I().size() > 0) {
                    c12181f.m5891o0(42);
                    c12181f.m5891o0(this.f28620t);
                }
                for (int i2 = 0; i2 < this.f28619s.size(); i2++) {
                    c12181f.m5917b0(this.f28619s.get(i2).intValue());
                }
                if ((this.f28612l & 4) == 4) {
                    c12181f.m5932O(6, m9611K());
                }
                c12181f.m5903i0(this.f28611k);
            }

            @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
            /* renamed from: g */
            public InterfaceC12213s<C10904c> mo5764g() {
                return f28610x;
            }

            @Override // p326rh.InterfaceC12212r
            /* renamed from: j */
            public final boolean mo5761j() {
                byte b = this.f28621u;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f28621u = (byte) 1;
                return true;
            }

            private C10904c(AbstractC12188i.AbstractC12190b abstractC12190b) {
                super(abstractC12190b);
                this.f28618r = -1;
                this.f28620t = -1;
                this.f28621u = (byte) -1;
                this.f28622v = -1;
                this.f28611k = abstractC12190b.m5831n();
            }

            private C10904c(boolean z) {
                this.f28618r = -1;
                this.f28620t = -1;
                this.f28621u = (byte) -1;
                this.f28622v = -1;
                this.f28611k = AbstractC12177d.f31693j;
            }

            private C10904c(C12180e c12180e, C12183g c12183g) {
                this.f28618r = -1;
                this.f28620t = -1;
                this.f28621u = (byte) -1;
                this.f28622v = -1;
                m9604R();
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
                                    this.f28612l |= 1;
                                    this.f28613m = c12180e.m5954s();
                                } else if (m5982K == 16) {
                                    this.f28612l |= 2;
                                    this.f28614n = c12180e.m5954s();
                                } else if (m5982K == 24) {
                                    int m5959n = c12180e.m5959n();
                                    EnumC10907c m9577a = EnumC10907c.m9577a(m5959n);
                                    if (m9577a == null) {
                                        m5937J.m5891o0(m5982K);
                                        m5937J.m5891o0(m5959n);
                                    } else {
                                        this.f28612l |= 8;
                                        this.f28616p = m9577a;
                                    }
                                } else if (m5982K == 32) {
                                    if (!(z2 & true)) {
                                        this.f28617q = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f28617q.add(Integer.valueOf(c12180e.m5954s()));
                                } else if (m5982K == 34) {
                                    int m5963j = c12180e.m5963j(c12180e.m5992A());
                                    if (!(z2 & true) && c12180e.m5968e() > 0) {
                                        this.f28617q = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (c12180e.m5968e() > 0) {
                                        this.f28617q.add(Integer.valueOf(c12180e.m5954s()));
                                    }
                                    c12180e.m5964i(m5963j);
                                } else if (m5982K == 40) {
                                    if (!(z2 & true)) {
                                        this.f28619s = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f28619s.add(Integer.valueOf(c12180e.m5954s()));
                                } else if (m5982K == 42) {
                                    int m5963j2 = c12180e.m5963j(c12180e.m5992A());
                                    if (!(z2 & true) && c12180e.m5968e() > 0) {
                                        this.f28619s = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (c12180e.m5968e() > 0) {
                                        this.f28619s.add(Integer.valueOf(c12180e.m5954s()));
                                    }
                                    c12180e.m5964i(m5963j2);
                                } else if (m5982K != 50) {
                                    if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                    }
                                } else {
                                    AbstractC12177d m5961l = c12180e.m5961l();
                                    this.f28612l |= 4;
                                    this.f28615o = m5961l;
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
                            this.f28617q = Collections.unmodifiableList(this.f28617q);
                        }
                        if (z2 & true) {
                            this.f28619s = Collections.unmodifiableList(this.f28619s);
                        }
                        try {
                            m5937J.m5938I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f28611k = m5997w.m5993j();
                            throw th3;
                        }
                        this.f28611k = m5997w.m5993j();
                        mo5823n();
                        throw th2;
                    }
                }
                if (z2 & true) {
                    this.f28617q = Collections.unmodifiableList(this.f28617q);
                }
                if (z2 & true) {
                    this.f28619s = Collections.unmodifiableList(this.f28619s);
                }
                try {
                    m5937J.m5938I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f28611k = m5997w.m5993j();
                    throw th4;
                }
                this.f28611k = m5997w.m5993j();
                mo5823n();
            }
        }

        private C10901e(AbstractC12188i.AbstractC12190b abstractC12190b) {
            super(abstractC12190b);
            this.f28603n = -1;
            this.f28604o = (byte) -1;
            this.f28605p = -1;
            this.f28600k = abstractC12190b.m5831n();
        }

        private C10901e(boolean z) {
            this.f28603n = -1;
            this.f28604o = (byte) -1;
            this.f28605p = -1;
            this.f28600k = AbstractC12177d.f31693j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C10901e(C12180e c12180e, C12183g c12183g) {
            this.f28603n = -1;
            this.f28604o = (byte) -1;
            this.f28605p = -1;
            m9646A();
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
                                    this.f28601l = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28601l.add(c12180e.m5952u(C10904c.f28610x, c12183g));
                            } else if (m5982K == 40) {
                                if (!(z2 & true)) {
                                    this.f28602m = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28602m.add(Integer.valueOf(c12180e.m5954s()));
                            } else if (m5982K != 42) {
                                if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                }
                            } else {
                                int m5963j = c12180e.m5963j(c12180e.m5992A());
                                if (!(z2 & true) && c12180e.m5968e() > 0) {
                                    this.f28602m = new ArrayList();
                                    z2 |= true;
                                }
                                while (c12180e.m5968e() > 0) {
                                    this.f28602m.add(Integer.valueOf(c12180e.m5954s()));
                                }
                                c12180e.m5964i(m5963j);
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
                        this.f28601l = Collections.unmodifiableList(this.f28601l);
                    }
                    if (z2 & true) {
                        this.f28602m = Collections.unmodifiableList(this.f28602m);
                    }
                    try {
                        m5937J.m5938I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f28600k = m5997w.m5993j();
                        throw th3;
                    }
                    this.f28600k = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            }
            if (z2 & true) {
                this.f28601l = Collections.unmodifiableList(this.f28601l);
            }
            if (z2 & true) {
                this.f28602m = Collections.unmodifiableList(this.f28602m);
            }
            try {
                m5937J.m5938I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f28600k = m5997w.m5993j();
                throw th4;
            }
            this.f28600k = m5997w.m5993j();
            mo5823n();
        }
    }

    static {
        C9391d m15506I = C9391d.m15506I();
        C10895c m9698w = C10895c.m9698w();
        C10895c m9698w2 = C10895c.m9698w();
        C12234z.EnumC12236b enumC12236b = C12234z.EnumC12236b.f31826v;
        f28545a = AbstractC12188i.m5834p(m15506I, m9698w, m9698w2, null, 100, enumC12236b, C10895c.class);
        f28546b = AbstractC12188i.m5834p(C9412i.m15318b0(), C10895c.m9698w(), C10895c.m9698w(), null, 100, enumC12236b, C10895c.class);
        C9412i m15318b0 = C9412i.m15318b0();
        C12234z.EnumC12236b enumC12236b2 = C12234z.EnumC12236b.f31820p;
        f28547c = AbstractC12188i.m5834p(m15318b0, 0, null, null, 101, enumC12236b2, Integer.class);
        f28548d = AbstractC12188i.m5834p(C9425n.m15156Z(), C10898d.m9661z(), C10898d.m9661z(), null, 100, enumC12236b, C10898d.class);
        f28549e = AbstractC12188i.m5834p(C9425n.m15156Z(), 0, null, null, 101, enumC12236b2, Integer.class);
        f28550f = AbstractC12188i.m5835o(C9439q.m15008Y(), C9375b.m15767A(), null, 100, enumC12236b, false, C9375b.class);
        f28551g = AbstractC12188i.m5834p(C9439q.m15008Y(), Boolean.FALSE, null, null, 101, C12234z.EnumC12236b.f31823s, Boolean.class);
        f28552h = AbstractC12188i.m5835o(C9450s.m14857L(), C9375b.m15767A(), null, 100, enumC12236b, false, C9375b.class);
        f28553i = AbstractC12188i.m5834p(C9386c.m15549z0(), 0, null, null, 101, enumC12236b2, Integer.class);
        f28554j = AbstractC12188i.m5835o(C9386c.m15549z0(), C9425n.m15156Z(), null, 102, enumC12236b, false, C9425n.class);
        f28555k = AbstractC12188i.m5834p(C9386c.m15549z0(), 0, null, null, 103, enumC12236b2, Integer.class);
        f28556l = AbstractC12188i.m5834p(C9386c.m15549z0(), 0, null, null, 104, enumC12236b2, Integer.class);
        f28557m = AbstractC12188i.m5834p(C9419l.m15256L(), 0, null, null, 101, enumC12236b2, Integer.class);
        f28558n = AbstractC12188i.m5835o(C9419l.m15256L(), C9425n.m15156Z(), null, 102, enumC12236b, false, C9425n.class);
    }

    /* renamed from: a */
    public static void m9734a(C12183g c12183g) {
        c12183g.m5868a(f28545a);
        c12183g.m5868a(f28546b);
        c12183g.m5868a(f28547c);
        c12183g.m5868a(f28548d);
        c12183g.m5868a(f28549e);
        c12183g.m5868a(f28550f);
        c12183g.m5868a(f28551g);
        c12183g.m5868a(f28552h);
        c12183g.m5868a(f28553i);
        c12183g.m5868a(f28554j);
        c12183g.m5868a(f28555k);
        c12183g.m5868a(f28556l);
        c12183g.m5868a(f28557m);
        c12183g.m5868a(f28558n);
    }

    /* renamed from: nh.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10892b extends AbstractC12188i implements InterfaceC12212r {

        /* renamed from: q */
        private static final C10892b f28559q;

        /* renamed from: r */
        public static InterfaceC12213s<C10892b> f28560r = new C10893a();

        /* renamed from: k */
        private final AbstractC12177d f28561k;

        /* renamed from: l */
        private int f28562l;

        /* renamed from: m */
        private int f28563m;

        /* renamed from: n */
        private int f28564n;

        /* renamed from: o */
        private byte f28565o;

        /* renamed from: p */
        private int f28566p;

        /* renamed from: nh.a$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C10893a extends AbstractC12173b<C10892b> {
            C10893a() {
            }

            @Override // p326rh.InterfaceC12213s
            /* renamed from: m */
            public C10892b mo5759b(C12180e c12180e, C12183g c12183g) {
                return new C10892b(c12180e, c12183g);
            }
        }

        /* renamed from: nh.a$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C10894b extends AbstractC12188i.AbstractC12190b<C10892b, C10894b> implements InterfaceC12212r {

            /* renamed from: k */
            private int f28567k;

            /* renamed from: l */
            private int f28568l;

            /* renamed from: m */
            private int f28569m;

            private C10894b() {
                m9712w();
            }

            /* renamed from: r */
            static /* synthetic */ C10894b m9717r() {
                return m9713v();
            }

            /* renamed from: v */
            private static C10894b m9713v() {
                return new C10894b();
            }

            /* renamed from: w */
            private void m9712w() {
            }

            /* renamed from: A */
            public C10894b m9718A(int i) {
                this.f28567k |= 1;
                this.f28568l = i;
                return this;
            }

            @Override // p326rh.InterfaceC12210q.InterfaceC12211a
            /* renamed from: s */
            public C10892b build() {
                C10892b m9715t = m9715t();
                if (m9715t.mo5761j()) {
                    return m9715t;
                }
                throw AbstractC12170a.AbstractC12171a.m6017l(m9715t);
            }

            /* renamed from: t */
            public C10892b m9715t() {
                C10892b c10892b = new C10892b(this);
                int i = this.f28567k;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                c10892b.f28563m = this.f28568l;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                c10892b.f28564n = this.f28569m;
                c10892b.f28562l = i2;
                return c10892b;
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: u */
            public C10894b mo5832m() {
                return m9713v().mo5830p(m9715t());
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: x */
            public C10894b mo5830p(C10892b c10892b) {
                if (c10892b == C10892b.m9723w()) {
                    return this;
                }
                if (c10892b.m9733A()) {
                    m9718A(c10892b.m9721y());
                }
                if (c10892b.m9720z()) {
                    m9709z(c10892b.m9722x());
                }
                m5829q(m5831n().m6003d(c10892b.f28561k));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // p326rh.AbstractC12170a.AbstractC12171a
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p250nh.C10890a.C10892b.C10894b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    rh.s<nh.a$b> r1 = p250nh.C10890a.C10892b.f28560r     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    nh.a$b r3 = (p250nh.C10890a.C10892b) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                    nh.a$b r4 = (p250nh.C10890a.C10892b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: p250nh.C10890a.C10892b.C10894b.mo6018k(rh.e, rh.g):nh.a$b$b");
            }

            /* renamed from: z */
            public C10894b m9709z(int i) {
                this.f28567k |= 2;
                this.f28569m = i;
                return this;
            }
        }

        static {
            C10892b c10892b = new C10892b(true);
            f28559q = c10892b;
            c10892b.m9732B();
        }

        /* renamed from: B */
        private void m9732B() {
            this.f28563m = 0;
            this.f28564n = 0;
        }

        /* renamed from: C */
        public static C10894b m9731C() {
            return C10894b.m9717r();
        }

        /* renamed from: D */
        public static C10894b m9730D(C10892b c10892b) {
            return m9731C().mo5830p(c10892b);
        }

        /* renamed from: w */
        public static C10892b m9723w() {
            return f28559q;
        }

        /* renamed from: A */
        public boolean m9733A() {
            return (this.f28562l & 1) == 1;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: E */
        public C10894b mo5765e() {
            return m9731C();
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: F */
        public C10894b mo5768b() {
            return m9730D(this);
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: c */
        public int mo5767c() {
            int i = this.f28566p;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f28562l & 1) == 1) {
                i2 = 0 + C12181f.m5892o(1, this.f28563m);
            }
            if ((this.f28562l & 2) == 2) {
                i2 += C12181f.m5892o(2, this.f28564n);
            }
            int size = i2 + this.f28561k.size();
            this.f28566p = size;
            return size;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: d */
        public void mo5766d(C12181f c12181f) {
            mo5767c();
            if ((this.f28562l & 1) == 1) {
                c12181f.m5919a0(1, this.f28563m);
            }
            if ((this.f28562l & 2) == 2) {
                c12181f.m5919a0(2, this.f28564n);
            }
            c12181f.m5903i0(this.f28561k);
        }

        @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
        /* renamed from: g */
        public InterfaceC12213s<C10892b> mo5764g() {
            return f28560r;
        }

        @Override // p326rh.InterfaceC12212r
        /* renamed from: j */
        public final boolean mo5761j() {
            byte b = this.f28565o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f28565o = (byte) 1;
            return true;
        }

        /* renamed from: x */
        public int m9722x() {
            return this.f28564n;
        }

        /* renamed from: y */
        public int m9721y() {
            return this.f28563m;
        }

        /* renamed from: z */
        public boolean m9720z() {
            return (this.f28562l & 2) == 2;
        }

        private C10892b(AbstractC12188i.AbstractC12190b abstractC12190b) {
            super(abstractC12190b);
            this.f28565o = (byte) -1;
            this.f28566p = -1;
            this.f28561k = abstractC12190b.m5831n();
        }

        private C10892b(boolean z) {
            this.f28565o = (byte) -1;
            this.f28566p = -1;
            this.f28561k = AbstractC12177d.f31693j;
        }

        private C10892b(C12180e c12180e, C12183g c12183g) {
            this.f28565o = (byte) -1;
            this.f28566p = -1;
            m9732B();
            AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
            C12181f m5937J = C12181f.m5937J(m5997w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int m5982K = c12180e.m5982K();
                        if (m5982K != 0) {
                            if (m5982K == 8) {
                                this.f28562l |= 1;
                                this.f28563m = c12180e.m5954s();
                            } else if (m5982K != 16) {
                                if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                }
                            } else {
                                this.f28562l |= 2;
                                this.f28564n = c12180e.m5954s();
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
                        this.f28561k = m5997w.m5993j();
                        throw th3;
                    }
                    this.f28561k = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            }
            try {
                m5937J.m5938I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f28561k = m5997w.m5993j();
                throw th4;
            }
            this.f28561k = m5997w.m5993j();
            mo5823n();
        }
    }

    /* renamed from: nh.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10895c extends AbstractC12188i implements InterfaceC12212r {

        /* renamed from: q */
        private static final C10895c f28570q;

        /* renamed from: r */
        public static InterfaceC12213s<C10895c> f28571r = new C10896a();

        /* renamed from: k */
        private final AbstractC12177d f28572k;

        /* renamed from: l */
        private int f28573l;

        /* renamed from: m */
        private int f28574m;

        /* renamed from: n */
        private int f28575n;

        /* renamed from: o */
        private byte f28576o;

        /* renamed from: p */
        private int f28577p;

        /* renamed from: nh.a$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C10896a extends AbstractC12173b<C10895c> {
            C10896a() {
            }

            @Override // p326rh.InterfaceC12213s
            /* renamed from: m */
            public C10895c mo5759b(C12180e c12180e, C12183g c12183g) {
                return new C10895c(c12180e, c12183g);
            }
        }

        /* renamed from: nh.a$c$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C10897b extends AbstractC12188i.AbstractC12190b<C10895c, C10897b> implements InterfaceC12212r {

            /* renamed from: k */
            private int f28578k;

            /* renamed from: l */
            private int f28579l;

            /* renamed from: m */
            private int f28580m;

            private C10897b() {
                m9687w();
            }

            /* renamed from: r */
            static /* synthetic */ C10897b m9692r() {
                return m9688v();
            }

            /* renamed from: v */
            private static C10897b m9688v() {
                return new C10897b();
            }

            /* renamed from: w */
            private void m9687w() {
            }

            /* renamed from: A */
            public C10897b m9693A(int i) {
                this.f28578k |= 1;
                this.f28579l = i;
                return this;
            }

            @Override // p326rh.InterfaceC12210q.InterfaceC12211a
            /* renamed from: s */
            public C10895c build() {
                C10895c m9690t = m9690t();
                if (m9690t.mo5761j()) {
                    return m9690t;
                }
                throw AbstractC12170a.AbstractC12171a.m6017l(m9690t);
            }

            /* renamed from: t */
            public C10895c m9690t() {
                C10895c c10895c = new C10895c(this);
                int i = this.f28578k;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                c10895c.f28574m = this.f28579l;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                c10895c.f28575n = this.f28580m;
                c10895c.f28573l = i2;
                return c10895c;
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: u */
            public C10897b mo5832m() {
                return m9688v().mo5830p(m9690t());
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: x */
            public C10897b mo5830p(C10895c c10895c) {
                if (c10895c == C10895c.m9698w()) {
                    return this;
                }
                if (c10895c.m9708A()) {
                    m9693A(c10895c.m9696y());
                }
                if (c10895c.m9695z()) {
                    m9684z(c10895c.m9697x());
                }
                m5829q(m5831n().m6003d(c10895c.f28572k));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // p326rh.AbstractC12170a.AbstractC12171a
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p250nh.C10890a.C10895c.C10897b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    rh.s<nh.a$c> r1 = p250nh.C10890a.C10895c.f28571r     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    nh.a$c r3 = (p250nh.C10890a.C10895c) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                    nh.a$c r4 = (p250nh.C10890a.C10895c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: p250nh.C10890a.C10895c.C10897b.mo6018k(rh.e, rh.g):nh.a$c$b");
            }

            /* renamed from: z */
            public C10897b m9684z(int i) {
                this.f28578k |= 2;
                this.f28580m = i;
                return this;
            }
        }

        static {
            C10895c c10895c = new C10895c(true);
            f28570q = c10895c;
            c10895c.m9707B();
        }

        /* renamed from: B */
        private void m9707B() {
            this.f28574m = 0;
            this.f28575n = 0;
        }

        /* renamed from: C */
        public static C10897b m9706C() {
            return C10897b.m9692r();
        }

        /* renamed from: D */
        public static C10897b m9705D(C10895c c10895c) {
            return m9706C().mo5830p(c10895c);
        }

        /* renamed from: w */
        public static C10895c m9698w() {
            return f28570q;
        }

        /* renamed from: A */
        public boolean m9708A() {
            return (this.f28573l & 1) == 1;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: E */
        public C10897b mo5765e() {
            return m9706C();
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: F */
        public C10897b mo5768b() {
            return m9705D(this);
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: c */
        public int mo5767c() {
            int i = this.f28577p;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f28573l & 1) == 1) {
                i2 = 0 + C12181f.m5892o(1, this.f28574m);
            }
            if ((this.f28573l & 2) == 2) {
                i2 += C12181f.m5892o(2, this.f28575n);
            }
            int size = i2 + this.f28572k.size();
            this.f28577p = size;
            return size;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: d */
        public void mo5766d(C12181f c12181f) {
            mo5767c();
            if ((this.f28573l & 1) == 1) {
                c12181f.m5919a0(1, this.f28574m);
            }
            if ((this.f28573l & 2) == 2) {
                c12181f.m5919a0(2, this.f28575n);
            }
            c12181f.m5903i0(this.f28572k);
        }

        @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
        /* renamed from: g */
        public InterfaceC12213s<C10895c> mo5764g() {
            return f28571r;
        }

        @Override // p326rh.InterfaceC12212r
        /* renamed from: j */
        public final boolean mo5761j() {
            byte b = this.f28576o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f28576o = (byte) 1;
            return true;
        }

        /* renamed from: x */
        public int m9697x() {
            return this.f28575n;
        }

        /* renamed from: y */
        public int m9696y() {
            return this.f28574m;
        }

        /* renamed from: z */
        public boolean m9695z() {
            return (this.f28573l & 2) == 2;
        }

        private C10895c(AbstractC12188i.AbstractC12190b abstractC12190b) {
            super(abstractC12190b);
            this.f28576o = (byte) -1;
            this.f28577p = -1;
            this.f28572k = abstractC12190b.m5831n();
        }

        private C10895c(boolean z) {
            this.f28576o = (byte) -1;
            this.f28577p = -1;
            this.f28572k = AbstractC12177d.f31693j;
        }

        private C10895c(C12180e c12180e, C12183g c12183g) {
            this.f28576o = (byte) -1;
            this.f28577p = -1;
            m9707B();
            AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
            C12181f m5937J = C12181f.m5937J(m5997w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int m5982K = c12180e.m5982K();
                        if (m5982K != 0) {
                            if (m5982K == 8) {
                                this.f28573l |= 1;
                                this.f28574m = c12180e.m5954s();
                            } else if (m5982K != 16) {
                                if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                }
                            } else {
                                this.f28573l |= 2;
                                this.f28575n = c12180e.m5954s();
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
                        this.f28572k = m5997w.m5993j();
                        throw th3;
                    }
                    this.f28572k = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            }
            try {
                m5937J.m5938I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f28572k = m5997w.m5993j();
                throw th4;
            }
            this.f28572k = m5997w.m5993j();
            mo5823n();
        }
    }

    /* renamed from: nh.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10898d extends AbstractC12188i implements InterfaceC12212r {

        /* renamed from: t */
        private static final C10898d f28581t;

        /* renamed from: u */
        public static InterfaceC12213s<C10898d> f28582u = new C10899a();

        /* renamed from: k */
        private final AbstractC12177d f28583k;

        /* renamed from: l */
        private int f28584l;

        /* renamed from: m */
        private C10892b f28585m;

        /* renamed from: n */
        private C10895c f28586n;

        /* renamed from: o */
        private C10895c f28587o;

        /* renamed from: p */
        private C10895c f28588p;

        /* renamed from: q */
        private C10895c f28589q;

        /* renamed from: r */
        private byte f28590r;

        /* renamed from: s */
        private int f28591s;

        /* renamed from: nh.a$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C10899a extends AbstractC12173b<C10898d> {
            C10899a() {
            }

            @Override // p326rh.InterfaceC12213s
            /* renamed from: m */
            public C10898d mo5759b(C12180e c12180e, C12183g c12183g) {
                return new C10898d(c12180e, c12183g);
            }
        }

        /* renamed from: nh.a$d$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C10900b extends AbstractC12188i.AbstractC12190b<C10898d, C10900b> implements InterfaceC12212r {

            /* renamed from: k */
            private int f28592k;

            /* renamed from: l */
            private C10892b f28593l = C10892b.m9723w();

            /* renamed from: m */
            private C10895c f28594m = C10895c.m9698w();

            /* renamed from: n */
            private C10895c f28595n = C10895c.m9698w();

            /* renamed from: o */
            private C10895c f28596o = C10895c.m9698w();

            /* renamed from: p */
            private C10895c f28597p = C10895c.m9698w();

            private C10900b() {
                m9650w();
            }

            /* renamed from: r */
            static /* synthetic */ C10900b m9655r() {
                return m9651v();
            }

            /* renamed from: v */
            private static C10900b m9651v() {
                return new C10900b();
            }

            /* renamed from: w */
            private void m9650w() {
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // p326rh.AbstractC12170a.AbstractC12171a
            /* renamed from: A */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p250nh.C10890a.C10898d.C10900b mo6018k(p326rh.C12180e r3, p326rh.C12183g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    rh.s<nh.a$d> r1 = p250nh.C10890a.C10898d.f28582u     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    java.lang.Object r3 = r1.mo5759b(r3, r4)     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
                    nh.a$d r3 = (p250nh.C10890a.C10898d) r3     // Catch: java.lang.Throwable -> Lf p326rh.C12199k -> L11
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
                    nh.a$d r4 = (p250nh.C10890a.C10898d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: p250nh.C10890a.C10898d.C10900b.mo6018k(rh.e, rh.g):nh.a$d$b");
            }

            /* renamed from: B */
            public C10900b m9658B(C10895c c10895c) {
                if ((this.f28592k & 4) == 4 && this.f28595n != C10895c.m9698w()) {
                    this.f28595n = C10895c.m9705D(this.f28595n).mo5830p(c10895c).m9690t();
                } else {
                    this.f28595n = c10895c;
                }
                this.f28592k |= 4;
                return this;
            }

            /* renamed from: C */
            public C10900b m9657C(C10895c c10895c) {
                if ((this.f28592k & 8) == 8 && this.f28596o != C10895c.m9698w()) {
                    this.f28596o = C10895c.m9705D(this.f28596o).mo5830p(c10895c).m9690t();
                } else {
                    this.f28596o = c10895c;
                }
                this.f28592k |= 8;
                return this;
            }

            /* renamed from: D */
            public C10900b m9656D(C10895c c10895c) {
                if ((this.f28592k & 2) == 2 && this.f28594m != C10895c.m9698w()) {
                    this.f28594m = C10895c.m9705D(this.f28594m).mo5830p(c10895c).m9690t();
                } else {
                    this.f28594m = c10895c;
                }
                this.f28592k |= 2;
                return this;
            }

            @Override // p326rh.InterfaceC12210q.InterfaceC12211a
            /* renamed from: s */
            public C10898d build() {
                C10898d m9653t = m9653t();
                if (m9653t.mo5761j()) {
                    return m9653t;
                }
                throw AbstractC12170a.AbstractC12171a.m6017l(m9653t);
            }

            /* renamed from: t */
            public C10898d m9653t() {
                C10898d c10898d = new C10898d(this);
                int i = this.f28592k;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                c10898d.f28585m = this.f28593l;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                c10898d.f28586n = this.f28594m;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                c10898d.f28587o = this.f28595n;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                c10898d.f28588p = this.f28596o;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                c10898d.f28589q = this.f28597p;
                c10898d.f28584l = i2;
                return c10898d;
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: u */
            public C10900b mo5832m() {
                return m9651v().mo5830p(m9653t());
            }

            /* renamed from: x */
            public C10900b m9649x(C10895c c10895c) {
                if ((this.f28592k & 16) == 16 && this.f28597p != C10895c.m9698w()) {
                    this.f28597p = C10895c.m9705D(this.f28597p).mo5830p(c10895c).m9690t();
                } else {
                    this.f28597p = c10895c;
                }
                this.f28592k |= 16;
                return this;
            }

            /* renamed from: y */
            public C10900b m9648y(C10892b c10892b) {
                if ((this.f28592k & 1) == 1 && this.f28593l != C10892b.m9723w()) {
                    this.f28593l = C10892b.m9730D(this.f28593l).mo5830p(c10892b).m9715t();
                } else {
                    this.f28593l = c10892b;
                }
                this.f28592k |= 1;
                return this;
            }

            @Override // p326rh.AbstractC12188i.AbstractC12190b
            /* renamed from: z */
            public C10900b mo5830p(C10898d c10898d) {
                if (c10898d == C10898d.m9661z()) {
                    return this;
                }
                if (c10898d.m9677G()) {
                    m9648y(c10898d.m9682B());
                }
                if (c10898d.m9674J()) {
                    m9656D(c10898d.m9679E());
                }
                if (c10898d.m9676H()) {
                    m9658B(c10898d.m9681C());
                }
                if (c10898d.m9675I()) {
                    m9657C(c10898d.m9680D());
                }
                if (c10898d.m9678F()) {
                    m9649x(c10898d.m9683A());
                }
                m5829q(m5831n().m6003d(c10898d.f28583k));
                return this;
            }
        }

        static {
            C10898d c10898d = new C10898d(true);
            f28581t = c10898d;
            c10898d.m9673K();
        }

        /* renamed from: K */
        private void m9673K() {
            this.f28585m = C10892b.m9723w();
            this.f28586n = C10895c.m9698w();
            this.f28587o = C10895c.m9698w();
            this.f28588p = C10895c.m9698w();
            this.f28589q = C10895c.m9698w();
        }

        /* renamed from: L */
        public static C10900b m9672L() {
            return C10900b.m9655r();
        }

        /* renamed from: M */
        public static C10900b m9671M(C10898d c10898d) {
            return m9672L().mo5830p(c10898d);
        }

        /* renamed from: z */
        public static C10898d m9661z() {
            return f28581t;
        }

        /* renamed from: A */
        public C10895c m9683A() {
            return this.f28589q;
        }

        /* renamed from: B */
        public C10892b m9682B() {
            return this.f28585m;
        }

        /* renamed from: C */
        public C10895c m9681C() {
            return this.f28587o;
        }

        /* renamed from: D */
        public C10895c m9680D() {
            return this.f28588p;
        }

        /* renamed from: E */
        public C10895c m9679E() {
            return this.f28586n;
        }

        /* renamed from: F */
        public boolean m9678F() {
            return (this.f28584l & 16) == 16;
        }

        /* renamed from: G */
        public boolean m9677G() {
            return (this.f28584l & 1) == 1;
        }

        /* renamed from: H */
        public boolean m9676H() {
            return (this.f28584l & 4) == 4;
        }

        /* renamed from: I */
        public boolean m9675I() {
            return (this.f28584l & 8) == 8;
        }

        /* renamed from: J */
        public boolean m9674J() {
            return (this.f28584l & 2) == 2;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: N */
        public C10900b mo5765e() {
            return m9672L();
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: O */
        public C10900b mo5768b() {
            return m9671M(this);
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: c */
        public int mo5767c() {
            int i = this.f28591s;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f28584l & 1) == 1) {
                i2 = 0 + C12181f.m5884s(1, this.f28585m);
            }
            if ((this.f28584l & 2) == 2) {
                i2 += C12181f.m5884s(2, this.f28586n);
            }
            if ((this.f28584l & 4) == 4) {
                i2 += C12181f.m5884s(3, this.f28587o);
            }
            if ((this.f28584l & 8) == 8) {
                i2 += C12181f.m5884s(4, this.f28588p);
            }
            if ((this.f28584l & 16) == 16) {
                i2 += C12181f.m5884s(5, this.f28589q);
            }
            int size = i2 + this.f28583k.size();
            this.f28591s = size;
            return size;
        }

        @Override // p326rh.InterfaceC12210q
        /* renamed from: d */
        public void mo5766d(C12181f c12181f) {
            mo5767c();
            if ((this.f28584l & 1) == 1) {
                c12181f.m5913d0(1, this.f28585m);
            }
            if ((this.f28584l & 2) == 2) {
                c12181f.m5913d0(2, this.f28586n);
            }
            if ((this.f28584l & 4) == 4) {
                c12181f.m5913d0(3, this.f28587o);
            }
            if ((this.f28584l & 8) == 8) {
                c12181f.m5913d0(4, this.f28588p);
            }
            if ((this.f28584l & 16) == 16) {
                c12181f.m5913d0(5, this.f28589q);
            }
            c12181f.m5903i0(this.f28583k);
        }

        @Override // p326rh.AbstractC12188i, p326rh.InterfaceC12210q
        /* renamed from: g */
        public InterfaceC12213s<C10898d> mo5764g() {
            return f28582u;
        }

        @Override // p326rh.InterfaceC12212r
        /* renamed from: j */
        public final boolean mo5761j() {
            byte b = this.f28590r;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f28590r = (byte) 1;
            return true;
        }

        private C10898d(AbstractC12188i.AbstractC12190b abstractC12190b) {
            super(abstractC12190b);
            this.f28590r = (byte) -1;
            this.f28591s = -1;
            this.f28583k = abstractC12190b.m5831n();
        }

        private C10898d(boolean z) {
            this.f28590r = (byte) -1;
            this.f28591s = -1;
            this.f28583k = AbstractC12177d.f31693j;
        }

        private C10898d(C12180e c12180e, C12183g c12183g) {
            this.f28590r = (byte) -1;
            this.f28591s = -1;
            m9673K();
            AbstractC12177d.C12179b m5997w = AbstractC12177d.m5997w();
            C12181f m5937J = C12181f.m5937J(m5997w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int m5982K = c12180e.m5982K();
                        if (m5982K != 0) {
                            if (m5982K == 10) {
                                C10892b.C10894b mo5768b = (this.f28584l & 1) == 1 ? this.f28585m.mo5768b() : null;
                                C10892b c10892b = (C10892b) c12180e.m5952u(C10892b.f28560r, c12183g);
                                this.f28585m = c10892b;
                                if (mo5768b != null) {
                                    mo5768b.mo5830p(c10892b);
                                    this.f28585m = mo5768b.m9715t();
                                }
                                this.f28584l |= 1;
                            } else if (m5982K == 18) {
                                C10895c.C10897b mo5768b2 = (this.f28584l & 2) == 2 ? this.f28586n.mo5768b() : null;
                                C10895c c10895c = (C10895c) c12180e.m5952u(C10895c.f28571r, c12183g);
                                this.f28586n = c10895c;
                                if (mo5768b2 != null) {
                                    mo5768b2.mo5830p(c10895c);
                                    this.f28586n = mo5768b2.m9690t();
                                }
                                this.f28584l |= 2;
                            } else if (m5982K == 26) {
                                C10895c.C10897b mo5768b3 = (this.f28584l & 4) == 4 ? this.f28587o.mo5768b() : null;
                                C10895c c10895c2 = (C10895c) c12180e.m5952u(C10895c.f28571r, c12183g);
                                this.f28587o = c10895c2;
                                if (mo5768b3 != null) {
                                    mo5768b3.mo5830p(c10895c2);
                                    this.f28587o = mo5768b3.m9690t();
                                }
                                this.f28584l |= 4;
                            } else if (m5982K == 34) {
                                C10895c.C10897b mo5768b4 = (this.f28584l & 8) == 8 ? this.f28588p.mo5768b() : null;
                                C10895c c10895c3 = (C10895c) c12180e.m5952u(C10895c.f28571r, c12183g);
                                this.f28588p = c10895c3;
                                if (mo5768b4 != null) {
                                    mo5768b4.mo5830p(c10895c3);
                                    this.f28588p = mo5768b4.m9690t();
                                }
                                this.f28584l |= 8;
                            } else if (m5982K != 42) {
                                if (!mo5822q(c12180e, m5937J, c12183g, m5982K)) {
                                }
                            } else {
                                C10895c.C10897b mo5768b5 = (this.f28584l & 16) == 16 ? this.f28589q.mo5768b() : null;
                                C10895c c10895c4 = (C10895c) c12180e.m5952u(C10895c.f28571r, c12183g);
                                this.f28589q = c10895c4;
                                if (mo5768b5 != null) {
                                    mo5768b5.mo5830p(c10895c4);
                                    this.f28589q = mo5768b5.m9690t();
                                }
                                this.f28584l |= 16;
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
                        this.f28583k = m5997w.m5993j();
                        throw th3;
                    }
                    this.f28583k = m5997w.m5993j();
                    mo5823n();
                    throw th2;
                }
            }
            try {
                m5937J.m5938I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f28583k = m5997w.m5993j();
                throw th4;
            }
            this.f28583k = m5997w.m5993j();
            mo5823n();
        }
    }
}