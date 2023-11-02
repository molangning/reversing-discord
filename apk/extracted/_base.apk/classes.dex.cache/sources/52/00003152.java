package p070di;

import fi.C6426a;
import fi.C6428c;
import fi.C6429d;
import fi.C6474j;
import fi.C6475k;
import fi.C6476l;
import fi.C6479n;
import gi.InterfaceC6816j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kh.C9375b;
import kh.C9391d;
import kh.C9412i;
import kh.C9425n;
import kh.C9439q;
import kh.C9447r;
import kh.C9450s;
import kh.C9458u;
import kh.EnumC9417k;
import kh.EnumC9471x;
import kotlin.Pair;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import mh.C10458b;
import mh.C10467f;
import mh.C10469h;
import p070di.AbstractC5969z;
import p142hi.AbstractC7264g0;
import p304qf.C11889v;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC12005z0;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import p326rh.InterfaceC12210q;
import p389vh.AbstractC13301g;
import p429xh.C13801c;
import ph.C11638f;
import tg.C12691d0;
import tg.C12697e0;
import tg.C12726o;
import th.C12756d;

/* renamed from: di.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5958w {

    /* renamed from: a */
    private final C5942m f16962a;

    /* renamed from: b */
    private final C5926e f16963b;

    /* renamed from: di.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5959a extends AbstractC9614s implements Function0<List<? extends InterfaceC12149c>> {

        /* renamed from: k */
        final /* synthetic */ InterfaceC12210q f16965k;

        /* renamed from: l */
        final /* synthetic */ EnumC5912b f16966l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5959a(InterfaceC12210q interfaceC12210q, EnumC5912b enumC5912b) {
            super(0);
            C5958w.this = r1;
            this.f16965k = interfaceC12210q;
            this.f16966l = enumC5912b;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC12149c> invoke() {
            List<? extends InterfaceC12149c> list;
            List<? extends InterfaceC12149c> m14104i;
            C5958w c5958w = C5958w.this;
            AbstractC5969z m24079c = c5958w.m24079c(c5958w.f16962a.m24099e());
            if (m24079c != null) {
                C5958w c5958w2 = C5958w.this;
                list = C9553r.m14075C0(c5958w2.f16962a.m24101c().m24128d().mo20511i(m24079c, this.f16965k, this.f16966l));
            } else {
                list = null;
            }
            if (list == null) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            return list;
        }
    }

    /* renamed from: di.w$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5960b extends AbstractC9614s implements Function0<List<? extends InterfaceC12149c>> {

        /* renamed from: k */
        final /* synthetic */ boolean f16968k;

        /* renamed from: l */
        final /* synthetic */ C9425n f16969l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5960b(boolean z, C9425n c9425n) {
            super(0);
            C5958w.this = r1;
            this.f16968k = z;
            this.f16969l = c9425n;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC12149c> invoke() {
            List<? extends InterfaceC12149c> list;
            List<? extends InterfaceC12149c> m14104i;
            C5958w c5958w = C5958w.this;
            AbstractC5969z m24079c = c5958w.m24079c(c5958w.f16962a.m24099e());
            if (m24079c != null) {
                boolean z = this.f16968k;
                C5958w c5958w2 = C5958w.this;
                C9425n c9425n = this.f16969l;
                if (z) {
                    list = C9553r.m14075C0(c5958w2.f16962a.m24101c().m24128d().mo20515d(m24079c, c9425n));
                } else {
                    list = C9553r.m14075C0(c5958w2.f16962a.m24101c().m24128d().mo20510j(m24079c, c9425n));
                }
            } else {
                list = null;
            }
            if (list == null) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            return list;
        }
    }

    /* renamed from: di.w$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5961c extends AbstractC9614s implements Function0<List<? extends InterfaceC12149c>> {

        /* renamed from: k */
        final /* synthetic */ InterfaceC12210q f16971k;

        /* renamed from: l */
        final /* synthetic */ EnumC5912b f16972l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5961c(InterfaceC12210q interfaceC12210q, EnumC5912b enumC5912b) {
            super(0);
            C5958w.this = r1;
            this.f16971k = interfaceC12210q;
            this.f16972l = enumC5912b;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC12149c> invoke() {
            List<InterfaceC12149c> list;
            List<? extends InterfaceC12149c> m14104i;
            C5958w c5958w = C5958w.this;
            AbstractC5969z m24079c = c5958w.m24079c(c5958w.f16962a.m24099e());
            if (m24079c != null) {
                C5958w c5958w2 = C5958w.this;
                list = c5958w2.f16962a.m24101c().m24128d().mo20513f(m24079c, this.f16971k, this.f16972l);
            } else {
                list = null;
            }
            if (list == null) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            return list;
        }
    }

    /* renamed from: di.w$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5962d extends AbstractC9614s implements Function0<InterfaceC6816j<? extends AbstractC13301g<?>>> {

        /* renamed from: k */
        final /* synthetic */ C9425n f16974k;

        /* renamed from: l */
        final /* synthetic */ C6474j f16975l;

        /* renamed from: di.w$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C5963a extends AbstractC9614s implements Function0<AbstractC13301g<?>> {

            /* renamed from: j */
            final /* synthetic */ C5958w f16976j;

            /* renamed from: k */
            final /* synthetic */ C9425n f16977k;

            /* renamed from: l */
            final /* synthetic */ C6474j f16978l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5963a(C5958w c5958w, C9425n c9425n, C6474j c6474j) {
                super(0);
                this.f16976j = c5958w;
                this.f16977k = c9425n;
                this.f16978l = c6474j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final AbstractC13301g<?> invoke() {
                C5958w c5958w = this.f16976j;
                AbstractC5969z m24079c = c5958w.m24079c(c5958w.f16962a.m24099e());
                C9612q.m13920e(m24079c);
                InterfaceC5915c<InterfaceC12149c, AbstractC13301g<?>> m24128d = this.f16976j.f16962a.m24101c().m24128d();
                C9425n c9425n = this.f16977k;
                AbstractC7264g0 returnType = this.f16978l.getReturnType();
                C9612q.m13918g(returnType, "property.returnType");
                return m24128d.mo20526c(m24079c, c9425n, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5962d(C9425n c9425n, C6474j c6474j) {
            super(0);
            C5958w.this = r1;
            this.f16974k = c9425n;
            this.f16975l = c6474j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC6816j<AbstractC13301g<?>> invoke() {
            return C5958w.this.f16962a.m24096h().mo21865e(new C5963a(C5958w.this, this.f16974k, this.f16975l));
        }
    }

    /* renamed from: di.w$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5964e extends AbstractC9614s implements Function0<InterfaceC6816j<? extends AbstractC13301g<?>>> {

        /* renamed from: k */
        final /* synthetic */ C9425n f16980k;

        /* renamed from: l */
        final /* synthetic */ C6474j f16981l;

        /* renamed from: di.w$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C5965a extends AbstractC9614s implements Function0<AbstractC13301g<?>> {

            /* renamed from: j */
            final /* synthetic */ C5958w f16982j;

            /* renamed from: k */
            final /* synthetic */ C9425n f16983k;

            /* renamed from: l */
            final /* synthetic */ C6474j f16984l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5965a(C5958w c5958w, C9425n c9425n, C6474j c6474j) {
                super(0);
                this.f16982j = c5958w;
                this.f16983k = c9425n;
                this.f16984l = c6474j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final AbstractC13301g<?> invoke() {
                C5958w c5958w = this.f16982j;
                AbstractC5969z m24079c = c5958w.m24079c(c5958w.f16962a.m24099e());
                C9612q.m13920e(m24079c);
                InterfaceC5915c<InterfaceC12149c, AbstractC13301g<?>> m24128d = this.f16982j.f16962a.m24101c().m24128d();
                C9425n c9425n = this.f16983k;
                AbstractC7264g0 returnType = this.f16984l.getReturnType();
                C9612q.m13918g(returnType, "property.returnType");
                return m24128d.mo20525g(m24079c, c9425n, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5964e(C9425n c9425n, C6474j c6474j) {
            super(0);
            C5958w.this = r1;
            this.f16980k = c9425n;
            this.f16981l = c6474j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC6816j<AbstractC13301g<?>> invoke() {
            return C5958w.this.f16962a.m24096h().mo21865e(new C5965a(C5958w.this, this.f16980k, this.f16981l));
        }
    }

    /* renamed from: di.w$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5966f extends AbstractC9614s implements Function0<List<? extends InterfaceC12149c>> {

        /* renamed from: k */
        final /* synthetic */ AbstractC5969z f16986k;

        /* renamed from: l */
        final /* synthetic */ InterfaceC12210q f16987l;

        /* renamed from: m */
        final /* synthetic */ EnumC5912b f16988m;

        /* renamed from: n */
        final /* synthetic */ int f16989n;

        /* renamed from: o */
        final /* synthetic */ C9458u f16990o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5966f(AbstractC5969z abstractC5969z, InterfaceC12210q interfaceC12210q, EnumC5912b enumC5912b, int i, C9458u c9458u) {
            super(0);
            C5958w.this = r1;
            this.f16986k = abstractC5969z;
            this.f16987l = interfaceC12210q;
            this.f16988m = enumC5912b;
            this.f16989n = i;
            this.f16990o = c9458u;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC12149c> invoke() {
            List<? extends InterfaceC12149c> m14075C0;
            m14075C0 = C9553r.m14075C0(C5958w.this.f16962a.m24101c().m24128d().mo20516b(this.f16986k, this.f16987l, this.f16988m, this.f16989n, this.f16990o));
            return m14075C0;
        }
    }

    public C5958w(C5942m c) {
        C9612q.m13917h(c, "c");
        this.f16962a = c;
        this.f16963b = new C5926e(c.m24101c().m24116p(), c.m24101c().m24115q());
    }

    /* renamed from: c */
    public final AbstractC5969z m24079c(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m instanceof InterfaceC11945l0) {
            return new AbstractC5969z.C5971b(((InterfaceC11945l0) interfaceC11947m).mo4161e(), this.f16962a.m24097g(), this.f16962a.m24094j(), this.f16962a.m24100d());
        }
        if (interfaceC11947m instanceof C6429d) {
            return ((C6429d) interfaceC11947m).m22755f1();
        }
        return null;
    }

    /* renamed from: d */
    private final InterfaceC12155g m24078d(InterfaceC12210q interfaceC12210q, int i, EnumC5912b enumC5912b) {
        if (!C10458b.f27319c.mo11488d(i).booleanValue()) {
            return InterfaceC12155g.f31603f.m6037b();
        }
        return new C6479n(this.f16962a.m24096h(), new C5959a(interfaceC12210q, enumC5912b));
    }

    /* renamed from: e */
    private final InterfaceC11997x0 m24077e() {
        InterfaceC11947m m24099e = this.f16962a.m24099e();
        InterfaceC11914e interfaceC11914e = m24099e instanceof InterfaceC11914e ? (InterfaceC11914e) m24099e : null;
        if (interfaceC11914e != null) {
            return interfaceC11914e.mo4233J0();
        }
        return null;
    }

    /* renamed from: f */
    private final InterfaceC12155g m24076f(C9425n c9425n, boolean z) {
        if (!C10458b.f27319c.mo11488d(c9425n.m15154b0()).booleanValue()) {
            return InterfaceC12155g.f31603f.m6037b();
        }
        return new C6479n(this.f16962a.m24096h(), new C5960b(z, c9425n));
    }

    /* renamed from: g */
    private final InterfaceC12155g m24075g(InterfaceC12210q interfaceC12210q, EnumC5912b enumC5912b) {
        return new C6426a(this.f16962a.m24096h(), new C5961c(interfaceC12210q, enumC5912b));
    }

    /* renamed from: h */
    private final void m24074h(C6475k c6475k, InterfaceC11997x0 interfaceC11997x0, InterfaceC11997x0 interfaceC11997x02, List<? extends InterfaceC11997x0> list, List<? extends InterfaceC11920f1> list2, List<? extends InterfaceC11936j1> list3, AbstractC7264g0 abstractC7264g0, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, Map<? extends InterfaceC11897a.InterfaceC11898a<?>, ?> map) {
        c6475k.mo4431o1(interfaceC11997x0, interfaceC11997x02, list, list2, list3, abstractC7264g0, enumC11915e0, abstractC11988u, map);
    }

    /* renamed from: k */
    private final int m24071k(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    /* renamed from: n */
    private final InterfaceC11997x0 m24068n(C9439q c9439q, C5942m c5942m, InterfaceC11897a interfaceC11897a) {
        return C12756d.m4141b(interfaceC11897a, c5942m.m24095i().m24163q(c9439q), null, InterfaceC12155g.f31603f.m6037b());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<p305qg.InterfaceC11936j1> m24067o(java.util.List<kh.C9458u> r26, p326rh.InterfaceC12210q r27, p070di.EnumC5912b r28) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p070di.C5958w.m24067o(java.util.List, rh.q, di.b):java.util.List");
    }

    /* renamed from: i */
    public final InterfaceC11910d m24073i(C9391d proto, boolean z) {
        List m14104i;
        C9612q.m13917h(proto, "proto");
        InterfaceC11947m m24099e = this.f16962a.m24099e();
        C9612q.m13919f(m24099e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC11914e interfaceC11914e = (InterfaceC11914e) m24099e;
        int m15504K = proto.m15504K();
        EnumC5912b enumC5912b = EnumC5912b.FUNCTION;
        C6428c c6428c = new C6428c(interfaceC11914e, null, m24078d(proto, m15504K, enumC5912b), z, InterfaceC11902b.EnumC11903a.DECLARATION, proto, this.f16962a.m24097g(), this.f16962a.m24094j(), this.f16962a.m24093k(), this.f16962a.m24100d(), null, 1024, null);
        C5942m c5942m = this.f16962a;
        m14104i = C9545j.m14104i();
        C5958w m24098f = C5942m.m24102b(c5942m, c6428c, m14104i, null, null, null, null, 60, null).m24098f();
        List<C9458u> m15501N = proto.m15501N();
        C9612q.m13918g(m15501N, "proto.valueParameterList");
        c6428c.m4440q1(m24098f.m24067o(m15501N, proto, enumC5912b), C5913b0.m24183a(C5910a0.f16858a, C10458b.f27320d.mo11488d(proto.m15504K())));
        c6428c.m4303g1(interfaceC11914e.mo4224p());
        c6428c.m4318W0(interfaceC11914e.mo4172k0());
        c6428c.mo4315Y0(!C10458b.f27330n.mo11488d(proto.m15504K()).booleanValue());
        return c6428c;
    }

    /* renamed from: j */
    public final InterfaceC12005z0 m24072j(C9412i proto) {
        int m24071k;
        InterfaceC12155g m6037b;
        C10469h m24093k;
        InterfaceC11997x0 interfaceC11997x0;
        Map<? extends InterfaceC11897a.InterfaceC11898a<?>, ?> m6754h;
        AbstractC7264g0 m24163q;
        C9612q.m13917h(proto, "proto");
        if (proto.m15300t0()) {
            m24071k = proto.m15316d0();
        } else {
            m24071k = m24071k(proto.m15314f0());
        }
        int i = m24071k;
        EnumC5912b enumC5912b = EnumC5912b.FUNCTION;
        InterfaceC12155g m24078d = m24078d(proto, i, enumC5912b);
        if (C10467f.m11477g(proto)) {
            m6037b = m24075g(proto, enumC5912b);
        } else {
            m6037b = InterfaceC12155g.f31603f.m6037b();
        }
        if (C9612q.m13922c(C13801c.m1503l(this.f16962a.m24099e()).m7457c(C5967x.m24061b(this.f16962a.m24097g(), proto.m15315e0())), C5916c0.f16875a)) {
            m24093k = C10469h.f27350b.m11460b();
        } else {
            m24093k = this.f16962a.m24093k();
        }
        C6475k c6475k = new C6475k(this.f16962a.m24099e(), null, m24078d, C5967x.m24061b(this.f16962a.m24097g(), proto.m15315e0()), C5913b0.m24182b(C5910a0.f16858a, C10458b.f27331o.mo11488d(i)), proto, this.f16962a.m24097g(), this.f16962a.m24094j(), m24093k, this.f16962a.m24100d(), null, 1024, null);
        C5942m c5942m = this.f16962a;
        List<C9450s> m15307m0 = proto.m15307m0();
        C9612q.m13918g(m15307m0, "proto.typeParameterList");
        C5942m m24102b = C5942m.m24102b(c5942m, c6475k, m15307m0, null, null, null, null, 60, null);
        C9439q m11473k = C10467f.m11473k(proto, this.f16962a.m24094j());
        if (m11473k != null && (m24163q = m24102b.m24095i().m24163q(m11473k)) != null) {
            interfaceC11997x0 = C12756d.m4134i(c6475k, m24163q, m6037b);
        } else {
            interfaceC11997x0 = null;
        }
        InterfaceC11997x0 interfaceC11997x02 = interfaceC11997x0;
        InterfaceC11997x0 m24077e = m24077e();
        List<C9439q> m11481c = C10467f.m11481c(proto, this.f16962a.m24094j());
        List<? extends InterfaceC11997x0> arrayList = new ArrayList<>();
        for (C9439q c9439q : m11481c) {
            InterfaceC11997x0 m24068n = m24068n(c9439q, m24102b, c6475k);
            if (m24068n != null) {
                arrayList.add(m24068n);
            }
        }
        List<InterfaceC11920f1> m24170j = m24102b.m24095i().m24170j();
        C5958w m24098f = m24102b.m24098f();
        List<C9458u> m15303q0 = proto.m15303q0();
        C9612q.m13918g(m15303q0, "proto.valueParameterList");
        List<InterfaceC11936j1> m24067o = m24098f.m24067o(m15303q0, proto, EnumC5912b.FUNCTION);
        AbstractC7264g0 m24163q2 = m24102b.m24095i().m24163q(C10467f.m11471m(proto, this.f16962a.m24094j()));
        C5910a0 c5910a0 = C5910a0.f16858a;
        EnumC11915e0 m24186b = c5910a0.m24186b(C10458b.f27321e.mo11488d(i));
        AbstractC11988u m24183a = C5913b0.m24183a(c5910a0, C10458b.f27320d.mo11488d(i));
        m6754h = C11889v.m6754h();
        m24074h(c6475k, interfaceC11997x02, m24077e, arrayList, m24170j, m24067o, m24163q2, m24186b, m24183a, m6754h);
        Boolean mo11488d = C10458b.f27332p.mo11488d(i);
        C9612q.m13918g(mo11488d, "IS_OPERATOR.get(flags)");
        c6475k.m4306f1(mo11488d.booleanValue());
        Boolean mo11488d2 = C10458b.f27333q.mo11488d(i);
        C9612q.m13918g(mo11488d2, "IS_INFIX.get(flags)");
        c6475k.m4311c1(mo11488d2.booleanValue());
        Boolean mo11488d3 = C10458b.f27336t.mo11488d(i);
        C9612q.m13918g(mo11488d3, "IS_EXTERNAL_FUNCTION.get(flags)");
        c6475k.m4316X0(mo11488d3.booleanValue());
        Boolean mo11488d4 = C10458b.f27334r.mo11488d(i);
        C9612q.m13918g(mo11488d4, "IS_INLINE.get(flags)");
        c6475k.m4308e1(mo11488d4.booleanValue());
        Boolean mo11488d5 = C10458b.f27335s.mo11488d(i);
        C9612q.m13918g(mo11488d5, "IS_TAILREC.get(flags)");
        c6475k.m4299i1(mo11488d5.booleanValue());
        Boolean mo11488d6 = C10458b.f27337u.mo11488d(i);
        C9612q.m13918g(mo11488d6, "IS_SUSPEND.get(flags)");
        c6475k.m4302h1(mo11488d6.booleanValue());
        Boolean mo11488d7 = C10458b.f27338v.mo11488d(i);
        C9612q.m13918g(mo11488d7, "IS_EXPECT_FUNCTION.get(flags)");
        c6475k.m4318W0(mo11488d7.booleanValue());
        c6475k.mo4315Y0(!C10458b.f27339w.mo11488d(i).booleanValue());
        Pair<InterfaceC11897a.InterfaceC11898a<?>, Object> mo24132a = this.f16962a.m24101c().m24124h().mo24132a(proto, c6475k, this.f16962a.m24094j(), m24102b.m24095i());
        if (mo24132a != null) {
            c6475k.m4320U0(mo24132a.m14349c(), mo24132a.m14348d());
        }
        return c6475k;
    }

    /* renamed from: l */
    public final InterfaceC11989u0 m24070l(C9425n proto) {
        C9425n c9425n;
        InterfaceC12155g m6037b;
        C6474j c6474j;
        InterfaceC11997x0 interfaceC11997x0;
        int m14093t;
        C10458b.AbstractC10462d<EnumC9471x> abstractC10462d;
        C5942m c5942m;
        C10458b.AbstractC10462d<EnumC9417k> abstractC10462d2;
        C12691d0 c12691d0;
        C12691d0 c12691d02;
        C6474j c6474j2;
        C9425n c9425n2;
        int i;
        boolean z;
        C12697e0 c12697e0;
        List m14104i;
        List<C9458u> m14109d;
        Object m14033q0;
        C12691d0 m4139d;
        AbstractC7264g0 m24163q;
        C9612q.m13917h(proto, "proto");
        int m15154b0 = proto.m15140p0() ? proto.m15154b0() : m24071k(proto.m15151e0());
        InterfaceC11947m m24099e = this.f16962a.m24099e();
        InterfaceC12155g m24078d = m24078d(proto, m15154b0, EnumC5912b.PROPERTY);
        C5910a0 c5910a0 = C5910a0.f16858a;
        EnumC11915e0 m24186b = c5910a0.m24186b(C10458b.f27321e.mo11488d(m15154b0));
        AbstractC11988u m24183a = C5913b0.m24183a(c5910a0, C10458b.f27320d.mo11488d(m15154b0));
        Boolean mo11488d = C10458b.f27340x.mo11488d(m15154b0);
        C9612q.m13918g(mo11488d, "IS_VAR.get(flags)");
        boolean booleanValue = mo11488d.booleanValue();
        C11638f m24061b = C5967x.m24061b(this.f16962a.m24097g(), proto.m15152d0());
        InterfaceC11902b.EnumC11903a m24182b = C5913b0.m24182b(c5910a0, C10458b.f27331o.mo11488d(m15154b0));
        Boolean mo11488d2 = C10458b.f27303B.mo11488d(m15154b0);
        C9612q.m13918g(mo11488d2, "IS_LATEINIT.get(flags)");
        boolean booleanValue2 = mo11488d2.booleanValue();
        Boolean mo11488d3 = C10458b.f27302A.mo11488d(m15154b0);
        C9612q.m13918g(mo11488d3, "IS_CONST.get(flags)");
        boolean booleanValue3 = mo11488d3.booleanValue();
        Boolean mo11488d4 = C10458b.f27305D.mo11488d(m15154b0);
        C9612q.m13918g(mo11488d4, "IS_EXTERNAL_PROPERTY.get(flags)");
        boolean booleanValue4 = mo11488d4.booleanValue();
        Boolean mo11488d5 = C10458b.f27306E.mo11488d(m15154b0);
        C9612q.m13918g(mo11488d5, "IS_DELEGATED.get(flags)");
        boolean booleanValue5 = mo11488d5.booleanValue();
        Boolean mo11488d6 = C10458b.f27307F.mo11488d(m15154b0);
        C9612q.m13918g(mo11488d6, "IS_EXPECT_PROPERTY.get(flags)");
        C6474j c6474j3 = new C6474j(m24099e, null, m24078d, m24186b, m24183a, booleanValue, m24061b, m24182b, booleanValue2, booleanValue3, booleanValue4, booleanValue5, mo11488d6.booleanValue(), proto, this.f16962a.m24097g(), this.f16962a.m24094j(), this.f16962a.m24093k(), this.f16962a.m24100d());
        C5942m c5942m2 = this.f16962a;
        List<C9450s> m15142n0 = proto.m15142n0();
        C9612q.m13918g(m15142n0, "proto.typeParameterList");
        C5942m m24102b = C5942m.m24102b(c5942m2, c6474j3, m15142n0, null, null, null, null, 60, null);
        Boolean mo11488d7 = C10458b.f27341y.mo11488d(m15154b0);
        C9612q.m13918g(mo11488d7, "HAS_GETTER.get(flags)");
        boolean booleanValue6 = mo11488d7.booleanValue();
        if (booleanValue6 && C10467f.m11476h(proto)) {
            c9425n = proto;
            m6037b = m24075g(c9425n, EnumC5912b.PROPERTY_GETTER);
        } else {
            c9425n = proto;
            m6037b = InterfaceC12155g.f31603f.m6037b();
        }
        AbstractC7264g0 m24163q2 = m24102b.m24095i().m24163q(C10467f.m11470n(c9425n, this.f16962a.m24094j()));
        List<InterfaceC11920f1> m24170j = m24102b.m24095i().m24170j();
        InterfaceC11997x0 m24077e = m24077e();
        C9439q m11472l = C10467f.m11472l(c9425n, this.f16962a.m24094j());
        if (m11472l == null || (m24163q = m24102b.m24095i().m24163q(m11472l)) == null) {
            c6474j = c6474j3;
            interfaceC11997x0 = null;
        } else {
            c6474j = c6474j3;
            interfaceC11997x0 = C12756d.m4134i(c6474j, m24163q, m6037b);
        }
        List<C9439q> m11480d = C10467f.m11480d(c9425n, this.f16962a.m24094j());
        m14093t = C9546k.m14093t(m11480d, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9439q c9439q : m11480d) {
            arrayList.add(m24068n(c9439q, m24102b, c6474j));
        }
        c6474j.m4513b1(m24163q2, m24170j, m24077e, interfaceC11997x0, arrayList);
        Boolean mo11488d8 = C10458b.f27319c.mo11488d(m15154b0);
        C9612q.m13918g(mo11488d8, "HAS_ANNOTATIONS.get(flags)");
        boolean booleanValue7 = mo11488d8.booleanValue();
        C10458b.AbstractC10462d<EnumC9471x> abstractC10462d3 = C10458b.f27320d;
        C10458b.AbstractC10462d<EnumC9417k> abstractC10462d4 = C10458b.f27321e;
        int m11499b = C10458b.m11499b(booleanValue7, abstractC10462d3.mo11488d(m15154b0), abstractC10462d4.mo11488d(m15154b0), false, false, false);
        if (booleanValue6) {
            int m15153c0 = proto.m15139q0() ? proto.m15153c0() : m11499b;
            Boolean mo11488d9 = C10458b.f27311J.mo11488d(m15153c0);
            C9612q.m13918g(mo11488d9, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean booleanValue8 = mo11488d9.booleanValue();
            Boolean mo11488d10 = C10458b.f27312K.mo11488d(m15153c0);
            C9612q.m13918g(mo11488d10, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean booleanValue9 = mo11488d10.booleanValue();
            Boolean mo11488d11 = C10458b.f27313L.mo11488d(m15153c0);
            C9612q.m13918g(mo11488d11, "IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean booleanValue10 = mo11488d11.booleanValue();
            InterfaceC12155g m24078d2 = m24078d(c9425n, m15153c0, EnumC5912b.PROPERTY_GETTER);
            if (booleanValue8) {
                C5910a0 c5910a02 = C5910a0.f16858a;
                c5942m = m24102b;
                abstractC10462d2 = abstractC10462d4;
                abstractC10462d = abstractC10462d3;
                m4139d = new C12691d0(c6474j, m24078d2, c5910a02.m24186b(abstractC10462d4.mo11488d(m15153c0)), C5913b0.m24183a(c5910a02, abstractC10462d3.mo11488d(m15153c0)), !booleanValue8, booleanValue9, booleanValue10, c6474j.mo4305g(), null, InterfaceC11900a1.f30901a);
            } else {
                abstractC10462d = abstractC10462d3;
                c5942m = m24102b;
                abstractC10462d2 = abstractC10462d4;
                m4139d = C12756d.m4139d(c6474j, m24078d2);
                C9612q.m13918g(m4139d, "{\n                Descri…nnotations)\n            }");
            }
            m4139d.m4470Q0(c6474j.getReturnType());
            c12691d0 = m4139d;
        } else {
            abstractC10462d = abstractC10462d3;
            c5942m = m24102b;
            abstractC10462d2 = abstractC10462d4;
            c12691d0 = null;
        }
        Boolean mo11488d12 = C10458b.f27342z.mo11488d(m15154b0);
        C9612q.m13918g(mo11488d12, "HAS_SETTER.get(flags)");
        if (mo11488d12.booleanValue()) {
            if (proto.m15132x0()) {
                m11499b = proto.m15146j0();
            }
            int i2 = m11499b;
            Boolean mo11488d13 = C10458b.f27311J.mo11488d(i2);
            C9612q.m13918g(mo11488d13, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean booleanValue11 = mo11488d13.booleanValue();
            Boolean mo11488d14 = C10458b.f27312K.mo11488d(i2);
            C9612q.m13918g(mo11488d14, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean booleanValue12 = mo11488d14.booleanValue();
            Boolean mo11488d15 = C10458b.f27313L.mo11488d(i2);
            C9612q.m13918g(mo11488d15, "IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean booleanValue13 = mo11488d15.booleanValue();
            EnumC5912b enumC5912b = EnumC5912b.PROPERTY_SETTER;
            InterfaceC12155g m24078d3 = m24078d(c9425n, i2, enumC5912b);
            if (booleanValue11) {
                C5910a0 c5910a03 = C5910a0.f16858a;
                c12691d02 = c12691d0;
                C12697e0 c12697e02 = new C12697e0(c6474j, m24078d3, c5910a03.m24186b(abstractC10462d2.mo11488d(i2)), C5913b0.m24183a(c5910a03, abstractC10462d.mo11488d(i2)), !booleanValue11, booleanValue12, booleanValue13, c6474j.mo4305g(), null, InterfaceC11900a1.f30901a);
                m14104i = C9545j.m14104i();
                z = true;
                c6474j2 = c6474j;
                c9425n2 = c9425n;
                i = m15154b0;
                C5958w m24098f = C5942m.m24102b(c5942m, c12697e02, m14104i, null, null, null, null, 60, null).m24098f();
                m14109d = C9544i.m14109d(proto.m15145k0());
                m14033q0 = C9553r.m14033q0(m24098f.m24067o(m14109d, c9425n2, enumC5912b));
                c12697e02.m4449R0((InterfaceC11936j1) m14033q0);
                c12697e0 = c12697e02;
            } else {
                c12691d02 = c12691d0;
                c6474j2 = c6474j;
                c9425n2 = c9425n;
                i = m15154b0;
                z = true;
                c12697e0 = C12756d.m4138e(c6474j2, m24078d3, InterfaceC12155g.f31603f.m6037b());
                C9612q.m13918g(c12697e0, "{\n                Descri…          )\n            }");
            }
        } else {
            c12691d02 = c12691d0;
            c6474j2 = c6474j;
            c9425n2 = c9425n;
            i = m15154b0;
            z = true;
            c12697e0 = null;
        }
        Boolean mo11488d16 = C10458b.f27304C.mo11488d(i);
        C9612q.m13918g(mo11488d16, "HAS_CONSTANT.get(flags)");
        if (mo11488d16.booleanValue()) {
            c6474j2.m4341L0(new C5962d(c9425n2, c6474j2));
        }
        InterfaceC11947m m24099e2 = this.f16962a.m24099e();
        InterfaceC11914e interfaceC11914e = m24099e2 instanceof InterfaceC11914e ? (InterfaceC11914e) m24099e2 : null;
        if ((interfaceC11914e != null ? interfaceC11914e.mo4175g() : null) == EnumC11918f.ANNOTATION_CLASS) {
            c6474j2.m4341L0(new C5964e(c9425n2, c6474j2));
        }
        c6474j2.m4520V0(c12691d02, c12697e0, new C12726o(m24076f(c9425n2, false), c6474j2), new C12726o(m24076f(c9425n2, z), c6474j2));
        return c6474j2;
    }

    /* renamed from: m */
    public final InterfaceC11917e1 m24069m(C9447r proto) {
        int m14093t;
        C9612q.m13917h(proto, "proto");
        InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
        List<C9375b> m14910R = proto.m14910R();
        C9612q.m13918g(m14910R, "proto.annotationList");
        m14093t = C9546k.m14093t(m14910R, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9375b it : m14910R) {
            C5926e c5926e = this.f16963b;
            C9612q.m13918g(it, "it");
            arrayList.add(c5926e.m24154a(it, this.f16962a.m24097g()));
        }
        C6476l c6476l = new C6476l(this.f16962a.m24096h(), this.f16962a.m24099e(), c12156a.m6038a(arrayList), C5967x.m24061b(this.f16962a.m24097g(), proto.m14904X()), C5913b0.m24183a(C5910a0.f16858a, C10458b.f27320d.mo11488d(proto.m14905W())), proto, this.f16962a.m24097g(), this.f16962a.m24094j(), this.f16962a.m24093k(), this.f16962a.m24100d());
        C5942m c5942m = this.f16962a;
        List<C9450s> m14901a0 = proto.m14901a0();
        C9612q.m13918g(m14901a0, "proto.typeParameterList");
        C5942m m24102b = C5942m.m24102b(c5942m, c6476l, m14901a0, null, null, null, null, 60, null);
        c6476l.m22645Q0(m24102b.m24095i().m24170j(), m24102b.m24095i().m24168l(C10467f.m11466r(proto, this.f16962a.m24094j()), false), m24102b.m24095i().m24168l(C10467f.m11479e(proto, this.f16962a.m24094j()), false));
        return c6476l;
    }
}