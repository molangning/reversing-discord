package p070di;

import fi.C6426a;
import fi.C6477m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.C9439q;
import kh.C9450s;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import mh.C10458b;
import mh.C10467f;
import ng.AbstractC10870h;
import ng.C10869g;
import p142hi.AbstractC7218a1;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.C7267h0;
import p142hi.C7276i0;
import p142hi.C7294m1;
import p142hi.C7304p;
import p142hi.C7319s0;
import p142hi.C7323t0;
import p142hi.C7327u0;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7222b1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p234mi.C10472a;
import p304qf.C11889v;
import p305qg.C11994x;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import ph.C11632b;
import si.C12545m;
import si.C12552o;

/* renamed from: di.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5919d0 {

    /* renamed from: a */
    private final C5942m f16880a;

    /* renamed from: b */
    private final C5919d0 f16881b;

    /* renamed from: c */
    private final String f16882c;

    /* renamed from: d */
    private final String f16883d;

    /* renamed from: e */
    private final Function1<Integer, InterfaceC11927h> f16884e;

    /* renamed from: f */
    private final Function1<Integer, InterfaceC11927h> f16885f;

    /* renamed from: g */
    private final Map<Integer, InterfaceC11920f1> f16886g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: di.d0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5920a extends AbstractC9614s implements Function1<Integer, InterfaceC11927h> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5920a() {
            super(1);
            C5919d0.this = r1;
        }

        /* renamed from: a */
        public final InterfaceC11927h m24159a(int i) {
            return C5919d0.this.m24176d(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC11927h invoke(Integer num) {
            return m24159a(num.intValue());
        }
    }

    /* renamed from: di.d0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5921b extends AbstractC9614s implements Function0<List<? extends InterfaceC12149c>> {

        /* renamed from: k */
        final /* synthetic */ C9439q f16889k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5921b(C9439q c9439q) {
            super(0);
            C5919d0.this = r1;
            this.f16889k = c9439q;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC12149c> invoke() {
            return C5919d0.this.f16880a.m24101c().m24128d().mo20517a(this.f16889k, C5919d0.this.f16880a.m24097g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: di.d0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5922c extends AbstractC9614s implements Function1<Integer, InterfaceC11927h> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5922c() {
            super(1);
            C5919d0.this = r1;
        }

        /* renamed from: a */
        public final InterfaceC11927h m24158a(int i) {
            return C5919d0.this.m24174f(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC11927h invoke(Integer num) {
            return m24158a(num.intValue());
        }
    }

    /* renamed from: di.d0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C5923d extends C9605m implements Function1<C11632b, C11632b> {

        /* renamed from: j */
        public static final C5923d f16891j = new C5923d();

        C5923d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final C11632b invoke(C11632b p0) {
            C9612q.m13917h(p0, "p0");
            return p0.m7466g();
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C11632b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    /* renamed from: di.d0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5924e extends AbstractC9614s implements Function1<C9439q, C9439q> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5924e() {
            super(1);
            C5919d0.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C9439q invoke(C9439q it) {
            C9612q.m13917h(it, "it");
            return C10467f.m11474j(it, C5919d0.this.f16880a.m24094j());
        }
    }

    /* renamed from: di.d0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5925f extends AbstractC9614s implements Function1<C9439q, Integer> {

        /* renamed from: j */
        public static final C5925f f16893j = new C5925f();

        C5925f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(C9439q it) {
            C9612q.m13917h(it, "it");
            return Integer.valueOf(it.m15011V());
        }
    }

    public C5919d0(C5942m c, C5919d0 c5919d0, List<C9450s> typeParameterProtos, String debugName, String containerPresentableName) {
        Map<Integer, InterfaceC11920f1> linkedHashMap;
        C9612q.m13917h(c, "c");
        C9612q.m13917h(typeParameterProtos, "typeParameterProtos");
        C9612q.m13917h(debugName, "debugName");
        C9612q.m13917h(containerPresentableName, "containerPresentableName");
        this.f16880a = c;
        this.f16881b = c5919d0;
        this.f16882c = debugName;
        this.f16883d = containerPresentableName;
        this.f16884e = c.m24096h().mo21863g(new C5920a());
        this.f16885f = c.m24096h().mo21863g(new C5922c());
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = C11889v.m6754h();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (C9450s c9450s : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(c9450s.m14855N()), new C6477m(this.f16880a, c9450s, i));
                i++;
            }
        }
        this.f16886g = linkedHashMap;
    }

    /* renamed from: d */
    public final InterfaceC11927h m24176d(int i) {
        C11632b m24062a = C5967x.m24062a(this.f16880a.m24097g(), i);
        if (m24062a.m7462k()) {
            return this.f16880a.m24101c().m24130b(m24062a);
        }
        return C11994x.m6651b(this.f16880a.m24101c().m24116p(), m24062a);
    }

    /* renamed from: e */
    private final AbstractC7302o0 m24175e(int i) {
        if (C5967x.m24062a(this.f16880a.m24097g(), i).m7462k()) {
            return this.f16880a.m24101c().m24118n().mo24082a();
        }
        return null;
    }

    /* renamed from: f */
    public final InterfaceC11927h m24174f(int i) {
        C11632b m24062a = C5967x.m24062a(this.f16880a.m24097g(), i);
        if (m24062a.m7462k()) {
            return null;
        }
        return C11994x.m6649d(this.f16880a.m24101c().m24116p(), m24062a);
    }

    /* renamed from: g */
    private final AbstractC7302o0 m24173g(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02) {
        List<InterfaceC7288k1> m14061O;
        int m14093t;
        AbstractC10870h m11449i = C10472a.m11449i(abstractC7264g0);
        InterfaceC12155g annotations = abstractC7264g0.getAnnotations();
        AbstractC7264g0 m9865j = C10869g.m9865j(abstractC7264g0);
        List<AbstractC7264g0> m9870e = C10869g.m9870e(abstractC7264g0);
        m14061O = C9553r.m14061O(C10869g.m9863l(abstractC7264g0), 1);
        m14093t = C9546k.m14093t(m14061O, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC7288k1 interfaceC7288k1 : m14061O) {
            arrayList.add(interfaceC7288k1.getType());
        }
        return C10869g.m9873b(m11449i, annotations, m9865j, m9870e, arrayList, null, abstractC7264g02, true).mo3558U0(abstractC7264g0.mo3563O0());
    }

    /* renamed from: h */
    private final AbstractC7302o0 m24172h(C7226c1 c7226c1, InterfaceC7265g1 interfaceC7265g1, List<? extends InterfaceC7288k1> list, boolean z) {
        AbstractC7302o0 m24171i;
        int size;
        int size2 = interfaceC7265g1.getParameters().size() - list.size();
        if (size2 != 0) {
            m24171i = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                InterfaceC7265g1 mo4173k = interfaceC7265g1.mo2790n().m9828X(size).mo4173k();
                C9612q.m13918g(mo4173k, "functionTypeConstructor.…on(arity).typeConstructor");
                m24171i = C7267h0.m21098j(c7226c1, mo4173k, list, z, null, 16, null);
            }
        } else {
            m24171i = m24171i(c7226c1, interfaceC7265g1, list, z);
        }
        if (m24171i == null) {
            return C8967k.f23554a.m16943f(EnumC8966j.INCONSISTENT_SUSPEND_FUNCTION, list, interfaceC7265g1, new String[0]);
        }
        return m24171i;
    }

    /* renamed from: i */
    private final AbstractC7302o0 m24171i(C7226c1 c7226c1, InterfaceC7265g1 interfaceC7265g1, List<? extends InterfaceC7288k1> list, boolean z) {
        AbstractC7302o0 m21098j = C7267h0.m21098j(c7226c1, interfaceC7265g1, list, z, null, 16, null);
        if (!C10869g.m9859p(m21098j)) {
            return null;
        }
        return m24164p(m21098j);
    }

    /* renamed from: k */
    private final InterfaceC11920f1 m24169k(int i) {
        InterfaceC11920f1 interfaceC11920f1 = this.f16886g.get(Integer.valueOf(i));
        if (interfaceC11920f1 == null) {
            C5919d0 c5919d0 = this.f16881b;
            if (c5919d0 != null) {
                return c5919d0.m24169k(i);
            }
            return null;
        }
        return interfaceC11920f1;
    }

    /* renamed from: m */
    private static final List<C9439q.C9441b> m24167m(C9439q c9439q, C5919d0 c5919d0) {
        List<C9439q.C9441b> m14036n0;
        List<C9439q.C9441b> argumentList = c9439q.m15010W();
        C9612q.m13918g(argumentList, "argumentList");
        C9439q m11474j = C10467f.m11474j(c9439q, c5919d0.f16880a.m24094j());
        List<C9439q.C9441b> m24167m = m11474j != null ? m24167m(m11474j, c5919d0) : null;
        if (m24167m == null) {
            m24167m = C9545j.m14104i();
        }
        m14036n0 = C9553r.m14036n0(argumentList, m24167m);
        return m14036n0;
    }

    /* renamed from: n */
    public static /* synthetic */ AbstractC7302o0 m24166n(C5919d0 c5919d0, C9439q c9439q, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c5919d0.m24168l(c9439q, z);
    }

    /* renamed from: o */
    private final C7226c1 m24165o(List<? extends InterfaceC7222b1> list, InterfaceC12155g interfaceC12155g, InterfaceC7265g1 interfaceC7265g1, InterfaceC11947m interfaceC11947m) {
        int m14093t;
        List<? extends AbstractC7218a1<?>> m14091v;
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC7222b1 interfaceC7222b1 : list) {
            arrayList.add(interfaceC7222b1.mo21048a(interfaceC12155g, interfaceC7265g1, interfaceC11947m));
        }
        m14091v = C9546k.m14091v(arrayList);
        return C7226c1.f19622k.m21198g(m14091v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x003f, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r2, r3) == false) goto L27;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p142hi.AbstractC7302o0 m24164p(p142hi.AbstractC7264g0 r6) {
        /*
            r5 = this;
            java.util.List r0 = ng.C10869g.m9863l(r6)
            java.lang.Object r0 = kotlin.collections.C9543h.m14146h0(r0)
            hi.k1 r0 = (p142hi.InterfaceC7288k1) r0
            r1 = 0
            if (r0 == 0) goto L7d
            hi.g0 r0 = r0.getType()
            if (r0 != 0) goto L14
            goto L7d
        L14:
            hi.g1 r2 = r0.mo3564N0()
            qg.h r2 = r2.mo2788p()
            if (r2 == 0) goto L23
            ph.c r2 = p429xh.C13801c.m1503l(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.util.List r3 = r0.mo3566L0()
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L7a
            ph.c r3 = ng.C10884k.f28423p
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r2, r3)
            if (r3 != 0) goto L42
            ph.c r3 = p070di.C5928e0.m24147a()
            boolean r2 = kotlin.jvm.internal.C9612q.m13922c(r2, r3)
            if (r2 != 0) goto L42
            goto L7a
        L42:
            java.util.List r0 = r0.mo3566L0()
            java.lang.Object r0 = kotlin.collections.C9543h.m14129q0(r0)
            hi.k1 r0 = (p142hi.InterfaceC7288k1) r0
            hi.g0 r0 = r0.getType()
            java.lang.String r2 = "continuationArgumentType.arguments.single().type"
            kotlin.jvm.internal.C9612q.m13918g(r0, r2)
            di.m r2 = r5.f16880a
            qg.m r2 = r2.m24099e()
            boolean r3 = r2 instanceof p305qg.InterfaceC11897a
            if (r3 != 0) goto L60
            r2 = r1
        L60:
            qg.a r2 = (p305qg.InterfaceC11897a) r2
            if (r2 == 0) goto L68
            ph.c r1 = p429xh.C13801c.m1507h(r2)
        L68:
            ph.c r2 = p070di.C5916c0.f16875a
            boolean r1 = kotlin.jvm.internal.C9612q.m13922c(r1, r2)
            if (r1 == 0) goto L75
            hi.o0 r6 = r5.m24173g(r6, r0)
            return r6
        L75:
            hi.o0 r6 = r5.m24173g(r6, r0)
            return r6
        L7a:
            hi.o0 r6 = (p142hi.AbstractC7302o0) r6
            return r6
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p070di.C5919d0.m24164p(hi.g0):hi.o0");
    }

    /* renamed from: r */
    private final InterfaceC7288k1 m24162r(InterfaceC11920f1 interfaceC11920f1, C9439q.C9441b c9441b) {
        if (c9441b.m14964y() == C9439q.C9441b.EnumC9444c.STAR) {
            if (interfaceC11920f1 == null) {
                return new C7323t0(this.f16880a.m24101c().m24116p().mo4194n());
            }
            return new C7327u0(interfaceC11920f1);
        }
        C5910a0 c5910a0 = C5910a0.f16858a;
        C9439q.C9441b.EnumC9444c m14964y = c9441b.m14964y();
        C9612q.m13918g(m14964y, "typeArgumentProto.projection");
        EnumC7336w1 m24185c = c5910a0.m24185c(m14964y);
        C9439q m11468p = C10467f.m11468p(c9441b, this.f16880a.m24094j());
        if (m11468p == null) {
            return new C7294m1(C8967k.m16945d(EnumC8966j.NO_RECORDED_TYPE, c9441b.toString()));
        }
        return new C7294m1(m24185c, m24163q(m11468p));
    }

    /* renamed from: s */
    private final InterfaceC7265g1 m24161s(C9439q c9439q) {
        InterfaceC11927h invoke;
        Object obj;
        if (c9439q.m14994m0()) {
            invoke = this.f16884e.invoke(Integer.valueOf(c9439q.m15009X()));
            if (invoke == null) {
                invoke = m24160t(this, c9439q, c9439q.m15009X());
            }
        } else if (c9439q.m14985v0()) {
            invoke = m24169k(c9439q.m14998i0());
            if (invoke == null) {
                return C8967k.f23554a.m16944e(EnumC8966j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(c9439q.m14998i0()), this.f16883d);
            }
        } else if (c9439q.m14984w0()) {
            String string = this.f16880a.m24097g().getString(c9439q.m14997j0());
            Iterator<T> it = m24170j().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C9612q.m13922c(((InterfaceC11920f1) obj).getName().m7426b(), string)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            invoke = (InterfaceC11920f1) obj;
            if (invoke == null) {
                return C8967k.f23554a.m16944e(EnumC8966j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f16880a.m24099e().toString());
            }
        } else if (c9439q.m14986u0()) {
            invoke = this.f16885f.invoke(Integer.valueOf(c9439q.m14999h0()));
            if (invoke == null) {
                invoke = m24160t(this, c9439q, c9439q.m14999h0());
            }
        } else {
            return C8967k.f23554a.m16944e(EnumC8966j.UNKNOWN_TYPE, new String[0]);
        }
        InterfaceC7265g1 mo4173k = invoke.mo4173k();
        C9612q.m13918g(mo4173k, "classifier.typeConstructor");
        return mo4173k;
    }

    /* renamed from: t */
    private static final InterfaceC11914e m24160t(C5919d0 c5919d0, C9439q c9439q, int i) {
        Sequence m4876h;
        Sequence m4851y;
        List<Integer> m4866F;
        Sequence m4876h2;
        int m4862n;
        C11632b m24062a = C5967x.m24062a(c5919d0.f16880a.m24097g(), i);
        m4876h = C12545m.m4876h(c9439q, new C5924e());
        m4851y = C12552o.m4851y(m4876h, C5925f.f16893j);
        m4866F = C12552o.m4866F(m4851y);
        m4876h2 = C12545m.m4876h(m24062a, C5923d.f16891j);
        m4862n = C12552o.m4862n(m4876h2);
        while (m4866F.size() < m4862n) {
            m4866F.add(0);
        }
        return c5919d0.f16880a.m24101c().m24115q().m6700d(m24062a, m4866F);
    }

    /* renamed from: j */
    public final List<InterfaceC11920f1> m24170j() {
        List<InterfaceC11920f1> m14075C0;
        m14075C0 = C9553r.m14075C0(this.f16886g.values());
        return m14075C0;
    }

    /* renamed from: l */
    public final AbstractC7302o0 m24168l(C9439q proto, boolean z) {
        AbstractC7302o0 abstractC7302o0;
        int m14093t;
        List<? extends InterfaceC7288k1> m14075C0;
        AbstractC7302o0 m21098j;
        AbstractC7302o0 m20996j;
        List<? extends InterfaceC12149c> m14038l0;
        Object m14053W;
        C9612q.m13917h(proto, "proto");
        if (proto.m14994m0()) {
            abstractC7302o0 = m24175e(proto.m15009X());
        } else if (proto.m14986u0()) {
            abstractC7302o0 = m24175e(proto.m14999h0());
        } else {
            abstractC7302o0 = null;
        }
        if (abstractC7302o0 != null) {
            return abstractC7302o0;
        }
        InterfaceC7265g1 m24161s = m24161s(proto);
        boolean z2 = true;
        if (C8967k.m16936m(m24161s.mo2788p())) {
            return C8967k.f23554a.m16946c(EnumC8966j.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, m24161s, m24161s.toString());
        }
        C6426a c6426a = new C6426a(this.f16880a.m24096h(), new C5921b(proto));
        C7226c1 m24165o = m24165o(this.f16880a.m24101c().m24110v(), c6426a, m24161s, this.f16880a.m24099e());
        List<C9439q.C9441b> m24167m = m24167m(proto, this);
        m14093t = C9546k.m14093t(m24167m, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        int i = 0;
        for (Object obj : m24167m) {
            int i2 = i + 1;
            if (i < 0) {
                C9545j.m14094s();
            }
            List<InterfaceC11920f1> parameters = m24161s.getParameters();
            C9612q.m13918g(parameters, "constructor.parameters");
            m14053W = C9553r.m14053W(parameters, i);
            arrayList.add(m24162r((InterfaceC11920f1) m14053W, (C9439q.C9441b) obj));
            i = i2;
        }
        m14075C0 = C9553r.m14075C0(arrayList);
        InterfaceC11927h mo2788p = m24161s.mo2788p();
        if (z && (mo2788p instanceof InterfaceC11917e1)) {
            C7267h0 c7267h0 = C7267h0.f19686a;
            AbstractC7302o0 m21106b = C7267h0.m21106b((InterfaceC11917e1) mo2788p, m14075C0);
            List<InterfaceC7222b1> m24110v = this.f16880a.m24101c().m24110v();
            InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
            m14038l0 = C9553r.m14038l0(c6426a, m21106b.getAnnotations());
            C7226c1 m24165o2 = m24165o(m24110v, c12156a.m6038a(m14038l0), m24161s, this.f16880a.m24099e());
            if (!C7276i0.m21082b(m21106b) && !proto.m15002e0()) {
                z2 = false;
            }
            m21098j = m21106b.mo3558U0(z2).mo3557V0(m24165o2);
        } else {
            Boolean mo11488d = C10458b.f27317a.mo11488d(proto.m15006a0());
            C9612q.m13918g(mo11488d, "SUSPEND_TYPE.get(proto.flags)");
            if (mo11488d.booleanValue()) {
                m21098j = m24172h(m24165o, m24161s, m14075C0, proto.m15002e0());
            } else {
                m21098j = C7267h0.m21098j(m24165o, m24161s, m14075C0, proto.m15002e0(), null, 16, null);
                Boolean mo11488d2 = C10458b.f27318b.mo11488d(proto.m15006a0());
                C9612q.m13918g(mo11488d2, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (mo11488d2.booleanValue()) {
                    C7304p m21036b = C7304p.f19733m.m21036b(m21098j, true);
                    if (m21036b != null) {
                        m21098j = m21036b;
                    } else {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + m21098j + '\'').toString());
                    }
                }
            }
        }
        C9439q m11483a = C10467f.m11483a(proto, this.f16880a.m24094j());
        if (m11483a != null && (m20996j = C7319s0.m20996j(m21098j, m24168l(m11483a, false))) != null) {
            m21098j = m20996j;
        }
        if (proto.m14994m0()) {
            return this.f16880a.m24101c().m24112t().mo5195a(C5967x.m24062a(this.f16880a.m24097g(), proto.m15009X()), m21098j);
        }
        return m21098j;
    }

    /* renamed from: q */
    public final AbstractC7264g0 m24163q(C9439q proto) {
        C9612q.m13917h(proto, "proto");
        if (proto.m14992o0()) {
            String string = this.f16880a.m24097g().getString(proto.m15005b0());
            AbstractC7302o0 m24166n = m24166n(this, proto, false, 2, null);
            C9439q m11478f = C10467f.m11478f(proto, this.f16880a.m24094j());
            C9612q.m13920e(m11478f);
            return this.f16880a.m24101c().m24120l().mo20441a(proto, string, m24166n, m24166n(this, m11478f, false, 2, null));
        }
        return m24168l(proto, true);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16882c);
        if (this.f16881b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f16881b.f16882c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
