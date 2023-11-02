package pg;

import ai.InterfaceC0194h;
import fi.C6429d;
import gi.C6820m;
import gi.InterfaceC6790a;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import ng.AbstractC10870h;
import p013ah.InterfaceC0170g;
import p069dh.C5850f;
import p069dh.C5858g;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7279j0;
import p142hi.C7307p1;
import p160ih.C7574v;
import p160ih.C7575w;
import p160ih.C7578y;
import p305qg.C11938k0;
import p305qg.C11972s;
import p305qg.C11974t;
import p305qg.C11994x;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11998y;
import p305qg.InterfaceC12005z0;
import p325rg.C12153f;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import p327ri.C12243b;
import p327ri.C12263f;
import p429xh.C13801c;
import p448yg.EnumC14023d;
import pg.C11606f;
import ph.C11632b;
import ph.C11633c;
import ph.C11634d;
import ph.C11638f;
import sg.C12477d;
import sg.InterfaceC12471a;
import sg.InterfaceC12474c;
import tg.AbstractC12748z;
import tg.C12702h;
import th.C12766k;

/* renamed from: pg.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11615i implements InterfaceC12471a, InterfaceC12474c {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f30160h = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C11615i.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C11615i.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C11615i.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a */
    private final InterfaceC11928h0 f30161a;

    /* renamed from: b */
    private final C11601d f30162b;

    /* renamed from: c */
    private final InterfaceC6815i f30163c;

    /* renamed from: d */
    private final AbstractC7264g0 f30164d;

    /* renamed from: e */
    private final InterfaceC6815i f30165e;

    /* renamed from: f */
    private final InterfaceC6790a<C11633c, InterfaceC11914e> f30166f;

    /* renamed from: g */
    private final InterfaceC6815i f30167g;

    /* renamed from: pg.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EnumC11616a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* renamed from: pg.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C11617b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30173a;

        static {
            int[] iArr = new int[EnumC11616a.values().length];
            try {
                iArr[EnumC11616a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11616a.NOT_CONSIDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11616a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC11616a.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f30173a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pg.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11618c extends AbstractC9614s implements Function0<AbstractC7302o0> {

        /* renamed from: k */
        final /* synthetic */ InterfaceC6821n f30175k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11618c(InterfaceC6821n interfaceC6821n) {
            super(0);
            C11615i.this = r1;
            this.f30175k = interfaceC6821n;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AbstractC7302o0 invoke() {
            return C11994x.m6650c(C11615i.this.m7498u().m7518a(), C11602e.f30131d.m7530a(), new C11938k0(this.f30175k, C11615i.this.m7498u().m7518a())).mo4224p();
        }
    }

    /* renamed from: pg.i$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11619d extends AbstractC12748z {
        C11619d(InterfaceC11928h0 interfaceC11928h0, C11633c c11633c) {
            super(interfaceC11928h0, c11633c);
        }

        @Override // p305qg.InterfaceC11945l0
        /* renamed from: G0 */
        public InterfaceC0194h.C0197b mo4368o() {
            return InterfaceC0194h.C0197b.f649b;
        }
    }

    /* renamed from: pg.i$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11620e extends AbstractC9614s implements Function0<AbstractC7264g0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11620e() {
            super(0);
            C11615i.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AbstractC7264g0 invoke() {
            AbstractC7302o0 m9810i = C11615i.this.f30161a.mo4194n().m9810i();
            C9612q.m13918g(m9810i, "moduleDescriptor.builtIns.anyType");
            return m9810i;
        }
    }

    /* renamed from: pg.i$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11621f extends AbstractC9614s implements Function0<InterfaceC11914e> {

        /* renamed from: j */
        final /* synthetic */ C5850f f30177j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC11914e f30178k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11621f(C5850f c5850f, InterfaceC11914e interfaceC11914e) {
            super(0);
            this.f30177j = c5850f;
            this.f30178k = interfaceC11914e;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC11914e invoke() {
            C5850f c5850f = this.f30177j;
            InterfaceC0170g EMPTY = InterfaceC0170g.f588a;
            C9612q.m13918g(EMPTY, "EMPTY");
            return c5850f.m24350N0(EMPTY, this.f30178k);
        }
    }

    /* renamed from: pg.i$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C11622g extends AbstractC9614s implements Function1<InterfaceC0194h, Collection<? extends InterfaceC12005z0>> {

        /* renamed from: j */
        final /* synthetic */ C11638f f30179j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11622g(C11638f c11638f) {
            super(1);
            this.f30179j = c11638f;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Collection<InterfaceC12005z0> invoke(InterfaceC0194h it) {
            C9612q.m13917h(it, "it");
            return it.mo4362a(this.f30179j, EnumC14023d.FROM_BUILTINS);
        }
    }

    /* renamed from: pg.i$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11623h extends C12243b.AbstractC12245b<InterfaceC11914e, EnumC11616a> {

        /* renamed from: a */
        final /* synthetic */ String f30180a;

        /* renamed from: b */
        final /* synthetic */ Ref$ObjectRef<EnumC11616a> f30181b;

        C11623h(String str, Ref$ObjectRef<EnumC11616a> ref$ObjectRef) {
            this.f30180a = str;
            this.f30181b = ref$ObjectRef;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, pg.i$a] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, pg.i$a] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, pg.i$a] */
        @Override // p327ri.C12243b.InterfaceC12247d
        /* renamed from: d */
        public boolean mo1489c(InterfaceC11914e javaClassDescriptor) {
            C9612q.m13917h(javaClassDescriptor, "javaClassDescriptor");
            String m20388a = C7574v.m20388a(C7578y.f20876a, javaClassDescriptor, this.f30180a);
            C11628k c11628k = C11628k.f30185a;
            if (c11628k.m7479e().contains(m20388a)) {
                this.f30181b.f25329j = EnumC11616a.HIDDEN;
            } else if (c11628k.m7476h().contains(m20388a)) {
                this.f30181b.f25329j = EnumC11616a.VISIBLE;
            } else if (c11628k.m7481c().contains(m20388a)) {
                this.f30181b.f25329j = EnumC11616a.DROP;
            }
            if (this.f30181b.f25329j == null) {
                return true;
            }
            return false;
        }

        @Override // p327ri.C12243b.InterfaceC12247d
        /* renamed from: e */
        public EnumC11616a mo1491a() {
            EnumC11616a enumC11616a = this.f30181b.f25329j;
            return enumC11616a == null ? EnumC11616a.NOT_CONSIDERED : enumC11616a;
        }
    }

    /* renamed from: pg.i$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11624i extends AbstractC9614s implements Function1<InterfaceC11902b, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11624i() {
            super(1);
            C11615i.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11902b interfaceC11902b) {
            boolean z;
            if (interfaceC11902b.mo4305g() == InterfaceC11902b.EnumC11903a.DECLARATION) {
                C11601d c11601d = C11615i.this.f30162b;
                InterfaceC11947m mo4163b = interfaceC11902b.mo4163b();
                C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (c11601d.m7542c((InterfaceC11914e) mo4163b)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pg.i$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11625j extends AbstractC9614s implements Function0<InterfaceC12155g> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11625j() {
            super(0);
            C11615i.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC12155g invoke() {
            List<? extends InterfaceC12149c> m14109d;
            InterfaceC12149c m6040b = C12153f.m6040b(C11615i.this.f30161a.mo4194n(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null);
            InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
            m14109d = C9544i.m14109d(m6040b);
            return c12156a.m6038a(m14109d);
        }
    }

    public C11615i(InterfaceC11928h0 moduleDescriptor, InterfaceC6821n storageManager, Function0<C11606f.C11608b> settingsComputation) {
        C9612q.m13917h(moduleDescriptor, "moduleDescriptor");
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(settingsComputation, "settingsComputation");
        this.f30161a = moduleDescriptor;
        this.f30162b = C11601d.f30130a;
        this.f30163c = storageManager.mo21867c(settingsComputation);
        this.f30164d = m7507l(storageManager);
        this.f30165e = storageManager.mo21867c(new C11618c(storageManager));
        this.f30166f = storageManager.mo21869a();
        this.f30167g = storageManager.mo21867c(new C11625j());
    }

    /* renamed from: k */
    private final InterfaceC12005z0 m7508k(C6429d c6429d, InterfaceC12005z0 interfaceC12005z0) {
        InterfaceC11998y.InterfaceC11999a<? extends InterfaceC12005z0> mo4296u = interfaceC12005z0.mo4296u();
        mo4296u.mo4266e(c6429d);
        mo4296u.mo4264g(C11974t.f30970e);
        mo4296u.mo4259l(c6429d.mo4224p());
        mo4296u.mo4262i(c6429d.mo4233J0());
        InterfaceC12005z0 build = mo4296u.build();
        C9612q.m13920e(build);
        return build;
    }

    /* renamed from: l */
    private final AbstractC7264g0 m7507l(InterfaceC6821n interfaceC6821n) {
        List m14109d;
        Set<InterfaceC11910d> m14007d;
        C11619d c11619d = new C11619d(this.f30161a, new C11633c("java.io"));
        m14109d = C9544i.m14109d(new C7279j0(interfaceC6821n, new C11620e()));
        C12702h c12702h = new C12702h(c11619d, C11638f.m7422f("Serializable"), EnumC11915e0.ABSTRACT, EnumC11918f.INTERFACE, m14109d, InterfaceC11900a1.f30901a, false, interfaceC6821n);
        InterfaceC0194h.C0197b c0197b = InterfaceC0194h.C0197b.f649b;
        m14007d = C9560w.m14007d();
        c12702h.m4429K0(c0197b, m14007d, null);
        AbstractC7302o0 mo4224p = c12702h.mo4224p();
        C9612q.m13918g(mo4224p, "mockSerializableClass.defaultType");
        return mo4224p;
    }

    /* renamed from: m */
    private final Collection<InterfaceC12005z0> m7506m(InterfaceC11914e interfaceC11914e, Function1<? super InterfaceC0194h, ? extends Collection<? extends InterfaceC12005z0>> function1) {
        Object m14043g0;
        int m14093t;
        boolean z;
        List m14104i;
        List m14104i2;
        C5850f m7502q = m7502q(interfaceC11914e);
        if (m7502q == null) {
            m14104i2 = C9545j.m14104i();
            return m14104i2;
        }
        Collection<InterfaceC11914e> m7538g = this.f30162b.m7538g(C13801c.m1503l(m7502q), C11597b.f30108h.m7565a());
        m14043g0 = C9553r.m14043g0(m7538g);
        InterfaceC11914e interfaceC11914e2 = (InterfaceC11914e) m14043g0;
        if (interfaceC11914e2 == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        C12263f.C12265b c12265b = C12263f.f31865l;
        m14093t = C9546k.m14093t(m7538g, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11914e interfaceC11914e3 : m7538g) {
            arrayList.add(C13801c.m1503l(interfaceC11914e3));
        }
        C12263f m5639b = c12265b.m5639b(arrayList);
        boolean m7542c = this.f30162b.m7542c(interfaceC11914e);
        InterfaceC0194h mo4227T = this.f30166f.mo21897a(C13801c.m1503l(m7502q), new C11621f(m7502q, interfaceC11914e2)).mo4227T();
        C9612q.m13918g(mo4227T, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : function1.invoke(mo4227T)) {
            InterfaceC12005z0 interfaceC12005z0 = (InterfaceC12005z0) obj;
            boolean z2 = false;
            if (interfaceC12005z0.mo4305g() == InterfaceC11902b.EnumC11903a.DECLARATION && interfaceC12005z0.getVisibility().m6654d() && !AbstractC10870h.m9807j0(interfaceC12005z0)) {
                Collection<? extends InterfaceC11998y> mo4310d = interfaceC12005z0.mo4310d();
                C9612q.m13918g(mo4310d, "analogueMember.overriddenDescriptors");
                if (!(mo4310d instanceof Collection) || !mo4310d.isEmpty()) {
                    for (InterfaceC11998y interfaceC11998y : mo4310d) {
                        InterfaceC11947m mo4163b = interfaceC11998y.mo4163b();
                        C9612q.m13918g(mo4163b, "it.containingDeclaration");
                        if (m5639b.contains(C13801c.m1503l(mo4163b))) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z && !m7497v(interfaceC12005z0, m7542c)) {
                    z2 = true;
                }
            }
            if (z2) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* renamed from: n */
    private final AbstractC7302o0 m7505n() {
        return (AbstractC7302o0) C6820m.m21871a(this.f30165e, this, f30160h[1]);
    }

    /* renamed from: o */
    private static final boolean m7504o(InterfaceC11944l interfaceC11944l, C7307p1 c7307p1, InterfaceC11944l interfaceC11944l2) {
        if (C12766k.m4037x(interfaceC11944l, interfaceC11944l2.mo4225c(c7307p1)) == C12766k.C12775i.EnumC12776a.OVERRIDABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private final C5850f m7502q(InterfaceC11914e interfaceC11914e) {
        C11632b m7551n;
        C11633c m7471b;
        if (AbstractC10870h.m9824a0(interfaceC11914e) || !AbstractC10870h.m9853A0(interfaceC11914e)) {
            return null;
        }
        C11634d m1502m = C13801c.m1502m(interfaceC11914e);
        if (!m1502m.m7443f() || (m7551n = C11599c.f30110a.m7551n(m1502m)) == null || (m7471b = m7551n.m7471b()) == null) {
            return null;
        }
        InterfaceC11914e m6682c = C11972s.m6682c(m7498u().m7518a(), m7471b, EnumC14023d.FROM_BUILTINS);
        if (!(m6682c instanceof C5850f)) {
            return null;
        }
        return (C5850f) m6682c;
    }

    /* renamed from: r */
    private final EnumC11616a m7501r(InterfaceC11998y interfaceC11998y) {
        List m14109d;
        InterfaceC11947m mo4163b = interfaceC11998y.mo4163b();
        C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String m20385c = C7575w.m20385c(interfaceC11998y, false, false, 3, null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        m14109d = C9544i.m14109d((InterfaceC11914e) mo4163b);
        Object m5667b = C12243b.m5667b(m14109d, new C11614h(this), new C11623h(m20385c, ref$ObjectRef));
        C9612q.m13918g(m5667b, "jvmDescriptor = computeJ…CONSIDERED\n            })");
        return (EnumC11616a) m5667b;
    }

    /* renamed from: s */
    public static final Iterable m7500s(C11615i this$0, InterfaceC11914e interfaceC11914e) {
        InterfaceC11927h interfaceC11927h;
        InterfaceC11914e interfaceC11914e2;
        C9612q.m13917h(this$0, "this$0");
        Collection<AbstractC7264g0> mo2791m = interfaceC11914e.mo4173k().mo2791m();
        C9612q.m13918g(mo2791m, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        for (AbstractC7264g0 abstractC7264g0 : mo2791m) {
            InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
            C5850f c5850f = null;
            if (mo2788p != null) {
                interfaceC11927h = mo2788p.mo4221a();
            } else {
                interfaceC11927h = null;
            }
            if (interfaceC11927h instanceof InterfaceC11914e) {
                interfaceC11914e2 = (InterfaceC11914e) interfaceC11927h;
            } else {
                interfaceC11914e2 = null;
            }
            if (interfaceC11914e2 != null) {
                c5850f = this$0.m7502q(interfaceC11914e2);
            }
            if (c5850f != null) {
                arrayList.add(c5850f);
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    private final InterfaceC12155g m7499t() {
        return (InterfaceC12155g) C6820m.m21871a(this.f30167g, this, f30160h[2]);
    }

    /* renamed from: u */
    public final C11606f.C11608b m7498u() {
        return (C11606f.C11608b) C6820m.m21871a(this.f30163c, this, f30160h[0]);
    }

    /* renamed from: v */
    private final boolean m7497v(InterfaceC12005z0 interfaceC12005z0, boolean z) {
        List m14109d;
        InterfaceC11947m mo4163b = interfaceC12005z0.mo4163b();
        C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String m20385c = C7575w.m20385c(interfaceC12005z0, false, false, 3, null);
        if (z ^ C11628k.f30185a.m7478f().contains(C7574v.m20388a(C7578y.f20876a, (InterfaceC11914e) mo4163b, m20385c))) {
            return true;
        }
        m14109d = C9544i.m14109d(interfaceC12005z0);
        Boolean m5664e = C12243b.m5664e(m14109d, C11613g.f30158a, new C11624i());
        C9612q.m13918g(m5664e, "private fun SimpleFuncti…scriptor)\n        }\n    }");
        return m5664e.booleanValue();
    }

    /* renamed from: w */
    public static final Iterable m7496w(InterfaceC11902b interfaceC11902b) {
        return interfaceC11902b.mo4221a().mo4310d();
    }

    /* renamed from: x */
    private final boolean m7495x(InterfaceC11944l interfaceC11944l, InterfaceC11914e interfaceC11914e) {
        Object m14033q0;
        C11634d c11634d;
        if (interfaceC11944l.mo4301i().size() == 1) {
            List<InterfaceC11936j1> valueParameters = interfaceC11944l.mo4301i();
            C9612q.m13918g(valueParameters, "valueParameters");
            m14033q0 = C9553r.m14033q0(valueParameters);
            InterfaceC11927h mo2788p = ((InterfaceC11936j1) m14033q0).getType().mo3564N0().mo2788p();
            if (mo2788p != null) {
                c11634d = C13801c.m1502m(mo2788p);
            } else {
                c11634d = null;
            }
            if (C9612q.m13922c(c11634d, C13801c.m1502m(interfaceC11914e))) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.InterfaceC12471a
    /* renamed from: a */
    public Collection<InterfaceC11910d> mo5204a(InterfaceC11914e classDescriptor) {
        List m14104i;
        int m14093t;
        boolean z;
        List m14104i2;
        List m14104i3;
        C9612q.m13917h(classDescriptor, "classDescriptor");
        if (classDescriptor.mo4175g() == EnumC11918f.CLASS && m7498u().m7517b()) {
            C5850f m7502q = m7502q(classDescriptor);
            if (m7502q == null) {
                m14104i3 = C9545j.m14104i();
                return m14104i3;
            }
            InterfaceC11914e m7539f = C11601d.m7539f(this.f30162b, C13801c.m1503l(m7502q), C11597b.f30108h.m7565a(), null, 4, null);
            if (m7539f == null) {
                m14104i2 = C9545j.m14104i();
                return m14104i2;
            }
            C7307p1 m21051c = C11629l.m7473a(m7539f, m7502q).m21051c();
            List<InterfaceC11910d> mo4171l = m7502q.mo4171l();
            ArrayList<InterfaceC11910d> arrayList = new ArrayList();
            Iterator<T> it = mo4171l.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                InterfaceC11910d interfaceC11910d = (InterfaceC11910d) next;
                if (interfaceC11910d.getVisibility().m6654d()) {
                    Collection<InterfaceC11910d> mo4171l2 = m7539f.mo4171l();
                    C9612q.m13918g(mo4171l2, "defaultKotlinVersion.constructors");
                    if (!(mo4171l2 instanceof Collection) || !mo4171l2.isEmpty()) {
                        for (InterfaceC11910d it2 : mo4171l2) {
                            C9612q.m13918g(it2, "it");
                            if (m7504o(it2, m21051c, interfaceC11910d)) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z && !m7495x(interfaceC11910d, classDescriptor) && !AbstractC10870h.m9807j0(interfaceC11910d) && !C11628k.f30185a.m7480d().contains(C7574v.m20388a(C7578y.f20876a, m7502q, C7575w.m20385c(interfaceC11910d, false, false, 3, null)))) {
                        z2 = true;
                    }
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            m14093t = C9546k.m14093t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m14093t);
            for (InterfaceC11910d interfaceC11910d2 : arrayList) {
                InterfaceC11998y.InterfaceC11999a<? extends InterfaceC11998y> mo4296u = interfaceC11910d2.mo4296u();
                mo4296u.mo4266e(classDescriptor);
                mo4296u.mo4259l(classDescriptor.mo4224p());
                mo4296u.mo4261j();
                mo4296u.mo4257n(m21051c.m21024j());
                if (!C11628k.f30185a.m7477g().contains(C7574v.m20388a(C7578y.f20876a, m7502q, C7575w.m20385c(interfaceC11910d2, false, false, 3, null)))) {
                    mo4296u.mo4255p(m7499t());
                }
                InterfaceC11998y build = mo4296u.build();
                C9612q.m13919f(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((InterfaceC11910d) build);
            }
            return arrayList2;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // sg.InterfaceC12471a
    /* renamed from: b */
    public Collection<AbstractC7264g0> mo5203b(InterfaceC11914e classDescriptor) {
        List m14104i;
        List m14109d;
        List m14101l;
        C9612q.m13917h(classDescriptor, "classDescriptor");
        C11634d m1502m = C13801c.m1502m(classDescriptor);
        C11628k c11628k = C11628k.f30185a;
        if (c11628k.m7475i(m1502m)) {
            AbstractC7302o0 cloneableType = m7505n();
            C9612q.m13918g(cloneableType, "cloneableType");
            m14101l = C9545j.m14101l(cloneableType, this.f30164d);
            return m14101l;
        } else if (c11628k.m7474j(m1502m)) {
            m14109d = C9544i.m14109d(this.f30164d);
            return m14109d;
        } else {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fc, code lost:
        if (r2 != 3) goto L44;
     */
    @Override // sg.InterfaceC12471a
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection<p305qg.InterfaceC12005z0> mo5201d(ph.C11638f r7, p305qg.InterfaceC11914e r8) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.C11615i.mo5201d(ph.f, qg.e):java.util.Collection");
    }

    @Override // sg.InterfaceC12474c
    /* renamed from: e */
    public boolean mo5197e(InterfaceC11914e classDescriptor, InterfaceC12005z0 functionDescriptor) {
        C9612q.m13917h(classDescriptor, "classDescriptor");
        C9612q.m13917h(functionDescriptor, "functionDescriptor");
        C5850f m7502q = m7502q(classDescriptor);
        if (m7502q == null || !functionDescriptor.getAnnotations().mo6023q(C12477d.m5196a())) {
            return true;
        }
        if (!m7498u().m7517b()) {
            return false;
        }
        String m20385c = C7575w.m20385c(functionDescriptor, false, false, 3, null);
        C5858g mo4227T = m7502q.mo4227T();
        C11638f name = functionDescriptor.getName();
        C9612q.m13918g(name, "functionDescriptor.name");
        Collection<InterfaceC12005z0> mo4362a = mo4227T.mo4362a(name, EnumC14023d.FROM_BUILTINS);
        if (!(mo4362a instanceof Collection) || !mo4362a.isEmpty()) {
            for (InterfaceC12005z0 interfaceC12005z0 : mo4362a) {
                if (C9612q.m13922c(C7575w.m20385c(interfaceC12005z0, false, false, 3, null), m20385c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // sg.InterfaceC12471a
    /* renamed from: p */
    public Set<C11638f> mo5202c(InterfaceC11914e classDescriptor) {
        Set<C11638f> m14007d;
        C5858g mo4227T;
        Set<C11638f> mo4361b;
        Set<C11638f> m14007d2;
        C9612q.m13917h(classDescriptor, "classDescriptor");
        if (!m7498u().m7517b()) {
            m14007d2 = C9560w.m14007d();
            return m14007d2;
        }
        C5850f m7502q = m7502q(classDescriptor);
        if (m7502q == null || (mo4227T = m7502q.mo4227T()) == null || (mo4361b = mo4227T.mo4361b()) == null) {
            m14007d = C9560w.m14007d();
            return m14007d;
        }
        return mo4361b;
    }
}