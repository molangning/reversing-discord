package p142hi;

import ai.InterfaceC0194h;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p142hi.InterfaceC7345z0;
import p161ii.AbstractC7592g;
import p183ji.C8967k;
import p183ji.EnumC8963g;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p389vh.C13312n;
import p429xh.C13801c;
import tg.C12741u;

/* renamed from: hi.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7267h0 {

    /* renamed from: a */
    public static final C7267h0 f19686a = new C7267h0();

    /* renamed from: b */
    private static final Function1<AbstractC7592g, AbstractC7302o0> f19687b = C7268a.f19688j;

    /* renamed from: hi.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C7268a extends AbstractC9614s implements Function1 {

        /* renamed from: j */
        public static final C7268a f19688j = new C7268a();

        C7268a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Void invoke(AbstractC7592g abstractC7592g) {
            C9612q.m13917h(abstractC7592g, "<anonymous parameter 0>");
            return null;
        }
    }

    /* renamed from: hi.h0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7269b {

        /* renamed from: a */
        private final AbstractC7302o0 f19689a;

        /* renamed from: b */
        private final InterfaceC7265g1 f19690b;

        public C7269b(AbstractC7302o0 abstractC7302o0, InterfaceC7265g1 interfaceC7265g1) {
            this.f19689a = abstractC7302o0;
            this.f19690b = interfaceC7265g1;
        }

        /* renamed from: a */
        public final AbstractC7302o0 m21094a() {
            return this.f19689a;
        }

        /* renamed from: b */
        public final InterfaceC7265g1 m21093b() {
            return this.f19690b;
        }
    }

    /* renamed from: hi.h0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7270c extends AbstractC9614s implements Function1<AbstractC7592g, AbstractC7302o0> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC7265g1 f19691j;

        /* renamed from: k */
        final /* synthetic */ List<InterfaceC7288k1> f19692k;

        /* renamed from: l */
        final /* synthetic */ C7226c1 f19693l;

        /* renamed from: m */
        final /* synthetic */ boolean f19694m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7270c(InterfaceC7265g1 interfaceC7265g1, List<? extends InterfaceC7288k1> list, C7226c1 c7226c1, boolean z) {
            super(1);
            this.f19691j = interfaceC7265g1;
            this.f19692k = list;
            this.f19693l = c7226c1;
            this.f19694m = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7302o0 invoke(AbstractC7592g refiner) {
            C9612q.m13917h(refiner, "refiner");
            C7269b m21102f = C7267h0.f19686a.m21102f(this.f19691j, refiner, this.f19692k);
            if (m21102f == null) {
                return null;
            }
            AbstractC7302o0 m21094a = m21102f.m21094a();
            if (m21094a != null) {
                return m21094a;
            }
            C7226c1 c7226c1 = this.f19693l;
            InterfaceC7265g1 m21093b = m21102f.m21093b();
            C9612q.m13920e(m21093b);
            return C7267h0.m21099i(c7226c1, m21093b, this.f19692k, this.f19694m, refiner);
        }
    }

    /* renamed from: hi.h0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7271d extends AbstractC9614s implements Function1<AbstractC7592g, AbstractC7302o0> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC7265g1 f19695j;

        /* renamed from: k */
        final /* synthetic */ List<InterfaceC7288k1> f19696k;

        /* renamed from: l */
        final /* synthetic */ C7226c1 f19697l;

        /* renamed from: m */
        final /* synthetic */ boolean f19698m;

        /* renamed from: n */
        final /* synthetic */ InterfaceC0194h f19699n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7271d(InterfaceC7265g1 interfaceC7265g1, List<? extends InterfaceC7288k1> list, C7226c1 c7226c1, boolean z, InterfaceC0194h interfaceC0194h) {
            super(1);
            this.f19695j = interfaceC7265g1;
            this.f19696k = list;
            this.f19697l = c7226c1;
            this.f19698m = z;
            this.f19699n = interfaceC0194h;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7302o0 invoke(AbstractC7592g kotlinTypeRefiner) {
            C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
            C7269b m21102f = C7267h0.f19686a.m21102f(this.f19695j, kotlinTypeRefiner, this.f19696k);
            if (m21102f == null) {
                return null;
            }
            AbstractC7302o0 m21094a = m21102f.m21094a();
            if (m21094a != null) {
                return m21094a;
            }
            C7226c1 c7226c1 = this.f19697l;
            InterfaceC7265g1 m21093b = m21102f.m21093b();
            C9612q.m13920e(m21093b);
            return C7267h0.m21097k(c7226c1, m21093b, this.f19696k, this.f19698m, this.f19699n);
        }
    }

    private C7267h0() {
    }

    /* renamed from: b */
    public static final AbstractC7302o0 m21106b(InterfaceC11917e1 interfaceC11917e1, List<? extends InterfaceC7288k1> arguments) {
        C9612q.m13917h(interfaceC11917e1, "<this>");
        C9612q.m13917h(arguments, "arguments");
        return new C7338x0(InterfaceC7345z0.C7346a.f19792a, false).m20923i(C7342y0.f19787e.m20905a(null, interfaceC11917e1, arguments), C7226c1.f19622k.m21197h());
    }

    /* renamed from: c */
    private final InterfaceC0194h m21105c(InterfaceC7265g1 interfaceC7265g1, List<? extends InterfaceC7288k1> list, AbstractC7592g abstractC7592g) {
        InterfaceC11927h mo2788p = interfaceC7265g1.mo2788p();
        if (mo2788p instanceof InterfaceC11920f1) {
            return ((InterfaceC11920f1) mo2788p).mo4224p().mo3553o();
        }
        if (mo2788p instanceof InterfaceC11914e) {
            if (abstractC7592g == null) {
                abstractC7592g = C13801c.m1500o(C13801c.m1499p(mo2788p));
            }
            if (list.isEmpty()) {
                return C12741u.m4216b((InterfaceC11914e) mo2788p, abstractC7592g);
            }
            return C12741u.m4217a((InterfaceC11914e) mo2788p, AbstractC7272h1.f19700c.m21087b(interfaceC7265g1, list), abstractC7592g);
        } else if (mo2788p instanceof InterfaceC11917e1) {
            EnumC8963g enumC8963g = EnumC8963g.SCOPE_FOR_ABBREVIATION_TYPE;
            String c11638f = ((InterfaceC11917e1) mo2788p).getName().toString();
            C9612q.m13918g(c11638f, "descriptor.name.toString()");
            return C8967k.m16948a(enumC8963g, true, c11638f);
        } else if (interfaceC7265g1 instanceof C7239f0) {
            return ((C7239f0) interfaceC7265g1).m21157c();
        } else {
            throw new IllegalStateException("Unsupported classifier: " + mo2788p + " for constructor: " + interfaceC7265g1);
        }
    }

    /* renamed from: d */
    public static final AbstractC7333v1 m21104d(AbstractC7302o0 lowerBound, AbstractC7302o0 upperBound) {
        C9612q.m13917h(lowerBound, "lowerBound");
        C9612q.m13917h(upperBound, "upperBound");
        if (C9612q.m13922c(lowerBound, upperBound)) {
            return lowerBound;
        }
        return new C7220b0(lowerBound, upperBound);
    }

    /* renamed from: e */
    public static final AbstractC7302o0 m21103e(C7226c1 attributes, C13312n constructor, boolean z) {
        List m14104i;
        C9612q.m13917h(attributes, "attributes");
        C9612q.m13917h(constructor, "constructor");
        m14104i = C9545j.m14104i();
        return m21097k(attributes, constructor, m14104i, z, C8967k.m16948a(EnumC8963g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* renamed from: f */
    public final C7269b m21102f(InterfaceC7265g1 interfaceC7265g1, AbstractC7592g abstractC7592g, List<? extends InterfaceC7288k1> list) {
        InterfaceC11927h mo20278f;
        InterfaceC11927h mo2788p = interfaceC7265g1.mo2788p();
        if (mo2788p == null || (mo20278f = abstractC7592g.mo20278f(mo2788p)) == null) {
            return null;
        }
        if (mo20278f instanceof InterfaceC11917e1) {
            return new C7269b(m21106b((InterfaceC11917e1) mo20278f, list), null);
        }
        InterfaceC7265g1 mo2789o = mo20278f.mo4173k().mo2789o(abstractC7592g);
        C9612q.m13918g(mo2789o, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new C7269b(null, mo2789o);
    }

    /* renamed from: g */
    public static final AbstractC7302o0 m21101g(C7226c1 attributes, InterfaceC11914e descriptor, List<? extends InterfaceC7288k1> arguments) {
        C9612q.m13917h(attributes, "attributes");
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(arguments, "arguments");
        InterfaceC7265g1 mo4173k = descriptor.mo4173k();
        C9612q.m13918g(mo4173k, "descriptor.typeConstructor");
        return m21098j(attributes, mo4173k, arguments, false, null, 16, null);
    }

    /* renamed from: h */
    public static final AbstractC7302o0 m21100h(C7226c1 attributes, InterfaceC7265g1 constructor, List<? extends InterfaceC7288k1> arguments, boolean z) {
        C9612q.m13917h(attributes, "attributes");
        C9612q.m13917h(constructor, "constructor");
        C9612q.m13917h(arguments, "arguments");
        return m21098j(attributes, constructor, arguments, z, null, 16, null);
    }

    /* renamed from: i */
    public static final AbstractC7302o0 m21099i(C7226c1 attributes, InterfaceC7265g1 constructor, List<? extends InterfaceC7288k1> arguments, boolean z, AbstractC7592g abstractC7592g) {
        C9612q.m13917h(attributes, "attributes");
        C9612q.m13917h(constructor, "constructor");
        C9612q.m13917h(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z && constructor.mo2788p() != null) {
            InterfaceC11927h mo2788p = constructor.mo2788p();
            C9612q.m13920e(mo2788p);
            AbstractC7302o0 mo4224p = mo2788p.mo4224p();
            C9612q.m13918g(mo4224p, "constructor.declarationDescriptor!!.defaultType");
            return mo4224p;
        }
        return m21096l(attributes, constructor, arguments, z, f19686a.m21105c(constructor, arguments, abstractC7592g), new C7270c(constructor, arguments, attributes, z));
    }

    /* renamed from: j */
    public static /* synthetic */ AbstractC7302o0 m21098j(C7226c1 c7226c1, InterfaceC7265g1 interfaceC7265g1, List list, boolean z, AbstractC7592g abstractC7592g, int i, Object obj) {
        if ((i & 16) != 0) {
            abstractC7592g = null;
        }
        return m21099i(c7226c1, interfaceC7265g1, list, z, abstractC7592g);
    }

    /* renamed from: k */
    public static final AbstractC7302o0 m21097k(C7226c1 attributes, InterfaceC7265g1 constructor, List<? extends InterfaceC7288k1> arguments, boolean z, InterfaceC0194h memberScope) {
        C9612q.m13917h(attributes, "attributes");
        C9612q.m13917h(constructor, "constructor");
        C9612q.m13917h(arguments, "arguments");
        C9612q.m13917h(memberScope, "memberScope");
        C7306p0 c7306p0 = new C7306p0(constructor, arguments, z, memberScope, new C7271d(constructor, arguments, attributes, z, memberScope));
        if (!attributes.isEmpty()) {
            return new C7313q0(c7306p0, attributes);
        }
        return c7306p0;
    }

    /* renamed from: l */
    public static final AbstractC7302o0 m21096l(C7226c1 attributes, InterfaceC7265g1 constructor, List<? extends InterfaceC7288k1> arguments, boolean z, InterfaceC0194h memberScope, Function1<? super AbstractC7592g, ? extends AbstractC7302o0> refinedTypeFactory) {
        C9612q.m13917h(attributes, "attributes");
        C9612q.m13917h(constructor, "constructor");
        C9612q.m13917h(arguments, "arguments");
        C9612q.m13917h(memberScope, "memberScope");
        C9612q.m13917h(refinedTypeFactory, "refinedTypeFactory");
        C7306p0 c7306p0 = new C7306p0(constructor, arguments, z, memberScope, refinedTypeFactory);
        if (!attributes.isEmpty()) {
            return new C7313q0(c7306p0, attributes);
        }
        return c7306p0;
    }
}