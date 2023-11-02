package p429xh;

import ai.InterfaceC0194h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p161ii.AbstractC7592g;
import p161ii.AbstractC7623x;
import p161ii.C7594h;
import p161ii.C7607p;
import p305qg.AbstractC11930h1;
import p305qg.C12004z;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11931i;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11987t0;
import p305qg.InterfaceC11989u0;
import p325rg.InterfaceC12149c;
import p327ri.C12243b;
import p448yg.InterfaceC14020b;
import ph.C11632b;
import ph.C11633c;
import ph.C11634d;
import ph.C11638f;
import si.C12545m;
import si.C12552o;
import th.C12758e;

/* renamed from: xh.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13801c {

    /* renamed from: a */
    private static final C11638f f35570a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C13802a extends C9605m implements Function1<InterfaceC11936j1, Boolean> {

        /* renamed from: j */
        public static final C13802a f35571j = new C13802a();

        C13802a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final Boolean invoke(InterfaceC11936j1 p0) {
            C9612q.m13917h(p0, "p0");
            return Boolean.valueOf(p0.mo4379A0());
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(InterfaceC11936j1.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }
    }

    /* renamed from: xh.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13803b extends C12243b.AbstractC12245b<InterfaceC11902b, InterfaceC11902b> {

        /* renamed from: a */
        final /* synthetic */ Ref$ObjectRef<InterfaceC11902b> f35572a;

        /* renamed from: b */
        final /* synthetic */ Function1<InterfaceC11902b, Boolean> f35573b;

        /* JADX WARN: Multi-variable type inference failed */
        C13803b(Ref$ObjectRef<InterfaceC11902b> ref$ObjectRef, Function1<? super InterfaceC11902b, Boolean> function1) {
            this.f35572a = ref$ObjectRef;
            this.f35573b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p327ri.C12243b.AbstractC12245b, p327ri.C12243b.InterfaceC12247d
        /* renamed from: d */
        public void mo1490b(InterfaceC11902b current) {
            C9612q.m13917h(current, "current");
            if (this.f35572a.f25329j == null && this.f35573b.invoke(current).booleanValue()) {
                this.f35572a.f25329j = current;
            }
        }

        @Override // p327ri.C12243b.InterfaceC12247d
        /* renamed from: e */
        public boolean mo1489c(InterfaceC11902b current) {
            C9612q.m13917h(current, "current");
            if (this.f35572a.f25329j == null) {
                return true;
            }
            return false;
        }

        @Override // p327ri.C12243b.InterfaceC12247d
        /* renamed from: f */
        public InterfaceC11902b mo1491a() {
            return this.f35572a.f25329j;
        }
    }

    /* renamed from: xh.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13804c extends AbstractC9614s implements Function1<InterfaceC11947m, InterfaceC11947m> {

        /* renamed from: j */
        public static final C13804c f35574j = new C13804c();

        C13804c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11947m invoke(InterfaceC11947m it) {
            C9612q.m13917h(it, "it");
            return it.mo4163b();
        }
    }

    static {
        C11638f m7422f = C11638f.m7422f("value");
        C9612q.m13918g(m7422f, "identifier(\"value\")");
        f35570a = m7422f;
    }

    /* renamed from: c */
    public static final boolean m1512c(InterfaceC11936j1 interfaceC11936j1) {
        List m14109d;
        C9612q.m13917h(interfaceC11936j1, "<this>");
        m14109d = C9544i.m14109d(interfaceC11936j1);
        Boolean m5664e = C12243b.m5664e(m14109d, C13799a.f35568a, C13802a.f35571j);
        C9612q.m13918g(m5664e, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return m5664e.booleanValue();
    }

    /* renamed from: d */
    public static final Iterable m1511d(InterfaceC11936j1 interfaceC11936j1) {
        int m14093t;
        Collection<InterfaceC11936j1> mo4310d = interfaceC11936j1.mo4310d();
        m14093t = C9546k.m14093t(mo4310d, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11936j1 interfaceC11936j12 : mo4310d) {
            arrayList.add(interfaceC11936j12.mo4221a());
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final InterfaceC11902b m1510e(InterfaceC11902b interfaceC11902b, boolean z, Function1<? super InterfaceC11902b, Boolean> predicate) {
        List m14109d;
        C9612q.m13917h(interfaceC11902b, "<this>");
        C9612q.m13917h(predicate, "predicate");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        m14109d = C9544i.m14109d(interfaceC11902b);
        return (InterfaceC11902b) C12243b.m5667b(m14109d, new C13800b(z), new C13803b(ref$ObjectRef, predicate));
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC11902b m1509f(InterfaceC11902b interfaceC11902b, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m1510e(interfaceC11902b, z, function1);
    }

    /* renamed from: g */
    public static final Iterable m1508g(boolean z, InterfaceC11902b interfaceC11902b) {
        List m14104i;
        Collection<? extends InterfaceC11902b> collection = null;
        if (z) {
            if (interfaceC11902b != null) {
                interfaceC11902b = interfaceC11902b.mo4221a();
            } else {
                interfaceC11902b = null;
            }
        }
        if (interfaceC11902b != null) {
            collection = interfaceC11902b.mo4310d();
        }
        if (collection == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return collection;
    }

    /* renamed from: h */
    public static final C11633c m1507h(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        C11634d m1502m = m1502m(interfaceC11947m);
        if (!m1502m.m7443f()) {
            m1502m = null;
        }
        if (m1502m == null) {
            return null;
        }
        return m1502m.m7437l();
    }

    /* renamed from: i */
    public static final InterfaceC11914e m1506i(InterfaceC12149c interfaceC12149c) {
        C9612q.m13917h(interfaceC12149c, "<this>");
        InterfaceC11927h mo2788p = interfaceC12149c.getType().mo3564N0().mo2788p();
        if (mo2788p instanceof InterfaceC11914e) {
            return (InterfaceC11914e) mo2788p;
        }
        return null;
    }

    /* renamed from: j */
    public static final AbstractC10870h m1505j(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        return m1499p(interfaceC11947m).mo4194n();
    }

    /* renamed from: k */
    public static final C11632b m1504k(InterfaceC11927h interfaceC11927h) {
        InterfaceC11947m mo4163b;
        C11632b m1504k;
        if (interfaceC11927h == null || (mo4163b = interfaceC11927h.mo4163b()) == null) {
            return null;
        }
        if (mo4163b instanceof InterfaceC11945l0) {
            return new C11632b(((InterfaceC11945l0) mo4163b).mo4161e(), interfaceC11927h.getName());
        }
        if (!(mo4163b instanceof InterfaceC11931i) || (m1504k = m1504k((InterfaceC11927h) mo4163b)) == null) {
            return null;
        }
        return m1504k.m7469d(interfaceC11927h.getName());
    }

    /* renamed from: l */
    public static final C11633c m1503l(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        C11633c m4098n = C12758e.m4098n(interfaceC11947m);
        C9612q.m13918g(m4098n, "getFqNameSafe(this)");
        return m4098n;
    }

    /* renamed from: m */
    public static final C11634d m1502m(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        C11634d m4099m = C12758e.m4099m(interfaceC11947m);
        C9612q.m13918g(m4099m, "getFqName(this)");
        return m4099m;
    }

    /* renamed from: n */
    public static final C12004z<AbstractC7302o0> m1501n(InterfaceC11914e interfaceC11914e) {
        AbstractC11930h1<AbstractC7302o0> mo4179R = interfaceC11914e != null ? interfaceC11914e.mo4179R() : null;
        if (mo4179R instanceof C12004z) {
            return (C12004z) mo4179R;
        }
        return null;
    }

    /* renamed from: o */
    public static final AbstractC7592g m1500o(InterfaceC11928h0 interfaceC11928h0) {
        AbstractC7623x abstractC7623x;
        C9612q.m13917h(interfaceC11928h0, "<this>");
        C7607p c7607p = (C7607p) interfaceC11928h0.mo4191w(C7594h.m20274a());
        if (c7607p != null) {
            abstractC7623x = (AbstractC7623x) c7607p.m20248a();
        } else {
            abstractC7623x = null;
        }
        if (abstractC7623x instanceof AbstractC7623x.C7624a) {
            return ((AbstractC7623x.C7624a) abstractC7623x).m20226b();
        }
        return AbstractC7592g.C7593a.f20882a;
    }

    /* renamed from: p */
    public static final InterfaceC11928h0 m1499p(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        InterfaceC11928h0 m4105g = C12758e.m4105g(interfaceC11947m);
        C9612q.m13918g(m4105g, "getContainingModule(this)");
        return m4105g;
    }

    /* renamed from: q */
    public static final Sequence<InterfaceC11947m> m1498q(InterfaceC11947m interfaceC11947m) {
        Sequence<InterfaceC11947m> m4861o;
        C9612q.m13917h(interfaceC11947m, "<this>");
        m4861o = C12552o.m4861o(m1497r(interfaceC11947m), 1);
        return m4861o;
    }

    /* renamed from: r */
    public static final Sequence<InterfaceC11947m> m1497r(InterfaceC11947m interfaceC11947m) {
        Sequence<InterfaceC11947m> m4876h;
        C9612q.m13917h(interfaceC11947m, "<this>");
        m4876h = C12545m.m4876h(interfaceC11947m, C13804c.f35574j);
        return m4876h;
    }

    /* renamed from: s */
    public static final InterfaceC11902b m1496s(InterfaceC11902b interfaceC11902b) {
        C9612q.m13917h(interfaceC11902b, "<this>");
        if (interfaceC11902b instanceof InterfaceC11987t0) {
            InterfaceC11989u0 correspondingProperty = ((InterfaceC11987t0) interfaceC11902b).mo4535S();
            C9612q.m13918g(correspondingProperty, "correspondingProperty");
            return correspondingProperty;
        }
        return interfaceC11902b;
    }

    /* renamed from: t */
    public static final InterfaceC11914e m1495t(InterfaceC11914e interfaceC11914e) {
        C9612q.m13917h(interfaceC11914e, "<this>");
        for (AbstractC7264g0 abstractC7264g0 : interfaceC11914e.mo4224p().mo3564N0().mo2791m()) {
            if (!AbstractC10870h.m9822b0(abstractC7264g0)) {
                InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
                if (C12758e.m4089w(mo2788p)) {
                    C9612q.m13919f(mo2788p, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (InterfaceC11914e) mo2788p;
                }
            }
        }
        return null;
    }

    /* renamed from: u */
    public static final boolean m1494u(InterfaceC11928h0 interfaceC11928h0) {
        AbstractC7623x abstractC7623x;
        C9612q.m13917h(interfaceC11928h0, "<this>");
        C7607p c7607p = (C7607p) interfaceC11928h0.mo4191w(C7594h.m20274a());
        if (c7607p == null || (abstractC7623x = (AbstractC7623x) c7607p.m20248a()) == null || !abstractC7623x.m20227a()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static final InterfaceC11914e m1493v(InterfaceC11928h0 interfaceC11928h0, C11633c topLevelClassFqName, InterfaceC14020b location) {
        C9612q.m13917h(interfaceC11928h0, "<this>");
        C9612q.m13917h(topLevelClassFqName, "topLevelClassFqName");
        C9612q.m13917h(location, "location");
        topLevelClassFqName.m7456d();
        C11633c m7455e = topLevelClassFqName.m7455e();
        C9612q.m13918g(m7455e, "topLevelClassFqName.parent()");
        InterfaceC0194h mo4237o = interfaceC11928h0.mo4210H0(m7455e).mo4237o();
        C11638f m7453g = topLevelClassFqName.m7453g();
        C9612q.m13918g(m7453g, "topLevelClassFqName.shortName()");
        InterfaceC11927h mo16932g = mo4237o.mo16932g(m7453g, location);
        if (mo16932g instanceof InterfaceC11914e) {
            return (InterfaceC11914e) mo16932g;
        }
        return null;
    }
}