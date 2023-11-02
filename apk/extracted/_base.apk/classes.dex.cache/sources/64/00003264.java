package p086eh;

import ai.InterfaceC0194h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9544i;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7297n1;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.C7229d0;
import p142hi.C7267h0;
import p142hi.C7276i0;
import p142hi.C7281j1;
import p142hi.C7294m1;
import p142hi.C7337x;
import p142hi.EnumC7317r1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p161ii.AbstractC7592g;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p429xh.C13801c;
import pf.C11591x;
import ph.C11632b;

/* renamed from: eh.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C6232g extends AbstractC7297n1 {

    /* renamed from: e */
    public static final C6233a f17653e = new C6233a(null);

    /* renamed from: f */
    private static final C6224a f17654f;

    /* renamed from: g */
    private static final C6224a f17655g;

    /* renamed from: c */
    private final C6230f f17656c;

    /* renamed from: d */
    private final C7281j1 f17657d;

    /* renamed from: eh.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C6233a {
        private C6233a() {
        }

        public /* synthetic */ C6233a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: eh.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C6234b extends AbstractC9614s implements Function1<AbstractC7592g, AbstractC7302o0> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC11914e f17658j;

        /* renamed from: k */
        final /* synthetic */ C6232g f17659k;

        /* renamed from: l */
        final /* synthetic */ AbstractC7302o0 f17660l;

        /* renamed from: m */
        final /* synthetic */ C6224a f17661m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6234b(InterfaceC11914e interfaceC11914e, C6232g c6232g, AbstractC7302o0 abstractC7302o0, C6224a c6224a) {
            super(1);
            this.f17658j = interfaceC11914e;
            this.f17659k = c6232g;
            this.f17660l = abstractC7302o0;
            this.f17661m = c6224a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7302o0 invoke(AbstractC7592g kotlinTypeRefiner) {
            C11632b m1504k;
            InterfaceC11914e mo20282b;
            C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
            InterfaceC11914e interfaceC11914e = this.f17658j;
            if (!(interfaceC11914e instanceof InterfaceC11914e)) {
                interfaceC11914e = null;
            }
            if (interfaceC11914e == null || (m1504k = C13801c.m1504k(interfaceC11914e)) == null || (mo20282b = kotlinTypeRefiner.mo20282b(m1504k)) == null || C9612q.m13922c(mo20282b, this.f17658j)) {
                return null;
            }
            return (AbstractC7302o0) this.f17659k.m23189j(this.f17660l, mo20282b, this.f17661m).m14349c();
        }
    }

    static {
        EnumC7317r1 enumC7317r1 = EnumC7317r1.COMMON;
        f17654f = C6225b.m23210b(enumC7317r1, false, true, null, 5, null).m23213l(EnumC6226c.FLEXIBLE_LOWER_BOUND);
        f17655g = C6225b.m23210b(enumC7317r1, false, true, null, 5, null).m23213l(EnumC6226c.FLEXIBLE_UPPER_BOUND);
    }

    public C6232g(C7281j1 c7281j1) {
        C6230f c6230f = new C6230f();
        this.f17656c = c6230f;
        this.f17657d = c7281j1 == null ? new C7281j1(c6230f, null, 2, null) : c7281j1;
    }

    /* renamed from: j */
    public final Pair<AbstractC7302o0, Boolean> m23189j(AbstractC7302o0 abstractC7302o0, InterfaceC11914e interfaceC11914e, C6224a c6224a) {
        int m14093t;
        List m14109d;
        if (abstractC7302o0.mo3564N0().getParameters().isEmpty()) {
            return C11591x.m7577a(abstractC7302o0, Boolean.FALSE);
        }
        if (AbstractC10870h.m9820c0(abstractC7302o0)) {
            InterfaceC7288k1 interfaceC7288k1 = abstractC7302o0.mo3566L0().get(0);
            EnumC7336w1 mo20954b = interfaceC7288k1.mo20954b();
            AbstractC7264g0 type = interfaceC7288k1.getType();
            C9612q.m13918g(type, "componentTypeProjection.type");
            m14109d = C9544i.m14109d(new C7294m1(mo20954b, m23188k(type, c6224a)));
            return C11591x.m7577a(C7267h0.m21098j(abstractC7302o0.mo3565M0(), abstractC7302o0.mo3564N0(), m14109d, abstractC7302o0.mo3563O0(), null, 16, null), Boolean.FALSE);
        } else if (C7276i0.m21083a(abstractC7302o0)) {
            return C11591x.m7577a(C8967k.m16945d(EnumC8966j.ERROR_RAW_TYPE, abstractC7302o0.mo3564N0().toString()), Boolean.FALSE);
        } else {
            InterfaceC0194h mo4232K = interfaceC11914e.mo4232K(this);
            C9612q.m13918g(mo4232K, "declaration.getMemberScope(this)");
            C7226c1 mo3565M0 = abstractC7302o0.mo3565M0();
            InterfaceC7265g1 mo4173k = interfaceC11914e.mo4173k();
            C9612q.m13918g(mo4173k, "declaration.typeConstructor");
            List<InterfaceC11920f1> parameters = interfaceC11914e.mo4173k().getParameters();
            C9612q.m13918g(parameters, "declaration.typeConstructor.parameters");
            m14093t = C9546k.m14093t(parameters, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (InterfaceC11920f1 parameter : parameters) {
                C6230f c6230f = this.f17656c;
                C9612q.m13918g(parameter, "parameter");
                arrayList.add(C7337x.m20932b(c6230f, parameter, c6224a, this.f17657d, null, 8, null));
            }
            return C11591x.m7577a(C7267h0.m21096l(mo3565M0, mo4173k, arrayList, abstractC7302o0.mo3563O0(), mo4232K, new C6234b(interfaceC11914e, this, abstractC7302o0, c6224a)), Boolean.TRUE);
        }
    }

    /* renamed from: k */
    private final AbstractC7264g0 m23188k(AbstractC7264g0 abstractC7264g0, C6224a c6224a) {
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p instanceof InterfaceC11920f1) {
            return m23188k(this.f17657d.m21068c((InterfaceC11920f1) mo2788p, c6224a.m23215j(true)), c6224a);
        }
        if (mo2788p instanceof InterfaceC11914e) {
            InterfaceC11927h mo2788p2 = C7229d0.m21190d(abstractC7264g0).mo3564N0().mo2788p();
            if (mo2788p2 instanceof InterfaceC11914e) {
                Pair<AbstractC7302o0, Boolean> m23189j = m23189j(C7229d0.m21191c(abstractC7264g0), (InterfaceC11914e) mo2788p, f17654f);
                AbstractC7302o0 m14351a = m23189j.m14351a();
                boolean booleanValue = m23189j.m14350b().booleanValue();
                Pair<AbstractC7302o0, Boolean> m23189j2 = m23189j(C7229d0.m21190d(abstractC7264g0), (InterfaceC11914e) mo2788p2, f17655g);
                AbstractC7302o0 m14351a2 = m23189j2.m14351a();
                boolean booleanValue2 = m23189j2.m14350b().booleanValue();
                if (!booleanValue && !booleanValue2) {
                    return C7267h0.m21104d(m14351a, m14351a2);
                }
                return new C6235h(m14351a, m14351a2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + mo2788p2 + "\" while for lower it's \"" + mo2788p + '\"').toString());
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + mo2788p).toString());
    }

    /* renamed from: l */
    static /* synthetic */ AbstractC7264g0 m23187l(C6232g c6232g, AbstractC7264g0 abstractC7264g0, C6224a c6224a, int i, Object obj) {
        if ((i & 2) != 0) {
            c6224a = new C6224a(EnumC7317r1.COMMON, null, false, false, null, null, 62, null);
        }
        return c6232g.m23188k(abstractC7264g0, c6224a);
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: f */
    public boolean mo20959f() {
        return false;
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: m */
    public C7294m1 mo3539e(AbstractC7264g0 key) {
        C9612q.m13917h(key, "key");
        return new C7294m1(m23187l(this, key, null, 2, null));
    }

    public /* synthetic */ C6232g(C7281j1 c7281j1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c7281j1);
    }
}