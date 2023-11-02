package ng;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7230d1;
import p142hi.C7267h0;
import p142hi.InterfaceC7288k1;
import p234mi.C10472a;
import p269og.EnumC11102c;
import p304qf.C11888u;
import p304qf.C11889v;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p325rg.C12161j;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import p327ri.C12242a;
import p389vh.AbstractC13301g;
import p389vh.C13311m;
import p389vh.C13329v;
import p429xh.C13801c;
import pf.C11591x;
import ph.C11633c;
import ph.C11634d;
import ph.C11638f;

/* renamed from: ng.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10869g {
    /* renamed from: a */
    public static final int m9874a(AbstractC7264g0 abstractC7264g0) {
        Object m6753i;
        C9612q.m13917h(abstractC7264g0, "<this>");
        InterfaceC12149c mo6024b = abstractC7264g0.getAnnotations().mo6024b(C10884k.C10885a.f28440D);
        if (mo6024b == null) {
            return 0;
        }
        m6753i = C11889v.m6753i(mo6024b.mo6032a(), C10884k.f28418k);
        AbstractC13301g abstractC13301g = (AbstractC13301g) m6753i;
        C9612q.m13919f(abstractC13301g, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((C13311m) abstractC13301g).mo2813b().intValue();
    }

    /* renamed from: b */
    public static final AbstractC7302o0 m9873b(AbstractC10870h builtIns, InterfaceC12155g annotations, AbstractC7264g0 abstractC7264g0, List<? extends AbstractC7264g0> contextReceiverTypes, List<? extends AbstractC7264g0> parameterTypes, List<C11638f> list, AbstractC7264g0 returnType, boolean z) {
        int i;
        C9612q.m13917h(builtIns, "builtIns");
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(contextReceiverTypes, "contextReceiverTypes");
        C9612q.m13917h(parameterTypes, "parameterTypes");
        C9612q.m13917h(returnType, "returnType");
        List<InterfaceC7288k1> m9868g = m9868g(abstractC7264g0, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        int size = parameterTypes.size() + contextReceiverTypes.size();
        if (abstractC7264g0 == null) {
            i = 0;
        } else {
            i = 1;
        }
        InterfaceC11914e m9869f = m9869f(builtIns, size + i, z);
        if (abstractC7264g0 != null) {
            annotations = m9855t(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = m9856s(annotations, builtIns, contextReceiverTypes.size());
        }
        return C7267h0.m21101g(C7230d1.m21188b(annotations), m9869f, m9868g);
    }

    /* renamed from: d */
    public static final C11638f m9871d(AbstractC7264g0 abstractC7264g0) {
        Object m14032r0;
        C13329v c13329v;
        String mo2813b;
        C9612q.m13917h(abstractC7264g0, "<this>");
        InterfaceC12149c mo6024b = abstractC7264g0.getAnnotations().mo6024b(C10884k.C10885a.f28442E);
        if (mo6024b == null) {
            return null;
        }
        m14032r0 = C9553r.m14032r0(mo6024b.mo6032a().values());
        if (m14032r0 instanceof C13329v) {
            c13329v = (C13329v) m14032r0;
        } else {
            c13329v = null;
        }
        if (c13329v != null && (mo2813b = c13329v.mo2813b()) != null) {
            if (!C11638f.m7420h(mo2813b)) {
                mo2813b = null;
            }
            if (mo2813b != null) {
                return C11638f.m7422f(mo2813b);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final List<AbstractC7264g0> m9870e(AbstractC7264g0 abstractC7264g0) {
        int m14093t;
        List<AbstractC7264g0> m14104i;
        C9612q.m13917h(abstractC7264g0, "<this>");
        m9860o(abstractC7264g0);
        int m9874a = m9874a(abstractC7264g0);
        if (m9874a == 0) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        List<InterfaceC7288k1> subList = abstractC7264g0.mo3566L0().subList(0, m9874a);
        m14093t = C9546k.m14093t(subList, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC7288k1 interfaceC7288k1 : subList) {
            AbstractC7264g0 type = interfaceC7288k1.getType();
            C9612q.m13918g(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final InterfaceC11914e m9869f(AbstractC10870h builtIns, int i, boolean z) {
        InterfaceC11914e m9850C;
        C9612q.m13917h(builtIns, "builtIns");
        if (z) {
            m9850C = builtIns.m9828X(i);
        } else {
            m9850C = builtIns.m9850C(i);
        }
        C9612q.m13918g(m9850C, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return m9850C;
    }

    /* renamed from: g */
    public static final List<InterfaceC7288k1> m9868g(AbstractC7264g0 abstractC7264g0, List<? extends AbstractC7264g0> contextReceiverTypes, List<? extends AbstractC7264g0> parameterTypes, List<C11638f> list, AbstractC7264g0 returnType, AbstractC10870h builtIns) {
        int i;
        int m14093t;
        InterfaceC7288k1 interfaceC7288k1;
        Map m6757e;
        List<? extends InterfaceC12149c> m14037m0;
        C9612q.m13917h(contextReceiverTypes, "contextReceiverTypes");
        C9612q.m13917h(parameterTypes, "parameterTypes");
        C9612q.m13917h(returnType, "returnType");
        C9612q.m13917h(builtIns, "builtIns");
        int size = parameterTypes.size() + contextReceiverTypes.size();
        int i2 = 0;
        if (abstractC7264g0 != null) {
            i = 1;
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(size + i + 1);
        m14093t = C9546k.m14093t(contextReceiverTypes, 10);
        ArrayList arrayList2 = new ArrayList(m14093t);
        for (AbstractC7264g0 abstractC7264g02 : contextReceiverTypes) {
            arrayList2.add(C10472a.m11457a(abstractC7264g02));
        }
        arrayList.addAll(arrayList2);
        if (abstractC7264g0 != null) {
            interfaceC7288k1 = C10472a.m11457a(abstractC7264g0);
        } else {
            interfaceC7288k1 = null;
        }
        C12242a.m5675a(arrayList, interfaceC7288k1);
        for (Object obj : parameterTypes) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9545j.m14094s();
            }
            AbstractC7264g0 abstractC7264g03 = (AbstractC7264g0) obj;
            C11638f c11638f = (list == null || (c11638f = list.get(i2)) == null || c11638f.m7421g()) ? null : null;
            if (c11638f != null) {
                C11633c c11633c = C10884k.C10885a.f28442E;
                C11638f m7422f = C11638f.m7422f(ZeroconfModule.KEY_SERVICE_NAME);
                String m7426b = c11638f.m7426b();
                C9612q.m13918g(m7426b, "name.asString()");
                m6757e = C11888u.m6757e(C11591x.m7577a(m7422f, new C13329v(m7426b)));
                C12161j c12161j = new C12161j(builtIns, c11633c, m6757e);
                InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
                m14037m0 = C9553r.m14037m0(abstractC7264g03.getAnnotations(), c12161j);
                abstractC7264g03 = C10472a.m11436v(abstractC7264g03, c12156a.m6038a(m14037m0));
            }
            arrayList.add(C10472a.m11457a(abstractC7264g03));
            i2 = i3;
        }
        arrayList.add(C10472a.m11457a(returnType));
        return arrayList;
    }

    /* renamed from: h */
    private static final EnumC11102c m9867h(C11634d c11634d) {
        if (c11634d.m7443f() && !c11634d.m7444e()) {
            EnumC11102c.C11103a c11103a = EnumC11102c.f29060n;
            String m7426b = c11634d.m7440i().m7426b();
            C9612q.m13918g(m7426b, "shortName().asString()");
            C11633c m7455e = c11634d.m7437l().m7455e();
            C9612q.m13918g(m7455e, "toSafe().parent()");
            return c11103a.m9160b(m7426b, m7455e);
        }
        return null;
    }

    /* renamed from: i */
    public static final EnumC11102c m9866i(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        if (!(interfaceC11947m instanceof InterfaceC11914e) || !AbstractC10870h.m9853A0(interfaceC11947m)) {
            return null;
        }
        return m9867h(C13801c.m1502m(interfaceC11947m));
    }

    /* renamed from: j */
    public static final AbstractC7264g0 m9865j(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        m9860o(abstractC7264g0);
        if (!m9857r(abstractC7264g0)) {
            return null;
        }
        return abstractC7264g0.mo3566L0().get(m9874a(abstractC7264g0)).getType();
    }

    /* renamed from: k */
    public static final AbstractC7264g0 m9864k(AbstractC7264g0 abstractC7264g0) {
        Object m14044f0;
        C9612q.m13917h(abstractC7264g0, "<this>");
        m9860o(abstractC7264g0);
        m14044f0 = C9553r.m14044f0(abstractC7264g0.mo3566L0());
        AbstractC7264g0 type = ((InterfaceC7288k1) m14044f0).getType();
        C9612q.m13918g(type, "arguments.last().type");
        return type;
    }

    /* renamed from: l */
    public static final List<InterfaceC7288k1> m9863l(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        m9860o(abstractC7264g0);
        List<InterfaceC7288k1> mo3566L0 = abstractC7264g0.mo3566L0();
        return mo3566L0.subList(m9874a(abstractC7264g0) + (m9862m(abstractC7264g0) ? 1 : 0), mo3566L0.size() - 1);
    }

    /* renamed from: m */
    public static final boolean m9862m(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        if (m9860o(abstractC7264g0) && m9857r(abstractC7264g0)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final boolean m9861n(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        EnumC11102c m9866i = m9866i(interfaceC11947m);
        if (m9866i != EnumC11102c.f29061o && m9866i != EnumC11102c.f29062p) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static final boolean m9860o(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p == null || !m9861n(mo2788p)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static final boolean m9859p(AbstractC7264g0 abstractC7264g0) {
        EnumC11102c enumC11102c;
        C9612q.m13917h(abstractC7264g0, "<this>");
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p != null) {
            enumC11102c = m9866i(mo2788p);
        } else {
            enumC11102c = null;
        }
        if (enumC11102c == EnumC11102c.f29061o) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static final boolean m9858q(AbstractC7264g0 abstractC7264g0) {
        EnumC11102c enumC11102c;
        C9612q.m13917h(abstractC7264g0, "<this>");
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p != null) {
            enumC11102c = m9866i(mo2788p);
        } else {
            enumC11102c = null;
        }
        if (enumC11102c == EnumC11102c.f29062p) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private static final boolean m9857r(AbstractC7264g0 abstractC7264g0) {
        return abstractC7264g0.getAnnotations().mo6024b(C10884k.C10885a.f28438C) != null;
    }

    /* renamed from: s */
    public static final InterfaceC12155g m9856s(InterfaceC12155g interfaceC12155g, AbstractC10870h builtIns, int i) {
        Map m6757e;
        List<? extends InterfaceC12149c> m14037m0;
        C9612q.m13917h(interfaceC12155g, "<this>");
        C9612q.m13917h(builtIns, "builtIns");
        C11633c c11633c = C10884k.C10885a.f28440D;
        if (!interfaceC12155g.mo6023q(c11633c)) {
            InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
            m6757e = C11888u.m6757e(C11591x.m7577a(C10884k.f28418k, new C13311m(i)));
            m14037m0 = C9553r.m14037m0(interfaceC12155g, new C12161j(builtIns, c11633c, m6757e));
            return c12156a.m6038a(m14037m0);
        }
        return interfaceC12155g;
    }

    /* renamed from: t */
    public static final InterfaceC12155g m9855t(InterfaceC12155g interfaceC12155g, AbstractC10870h builtIns) {
        Map m6754h;
        List<? extends InterfaceC12149c> m14037m0;
        C9612q.m13917h(interfaceC12155g, "<this>");
        C9612q.m13917h(builtIns, "builtIns");
        C11633c c11633c = C10884k.C10885a.f28438C;
        if (!interfaceC12155g.mo6023q(c11633c)) {
            InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
            m6754h = C11889v.m6754h();
            m14037m0 = C9553r.m14037m0(interfaceC12155g, new C12161j(builtIns, c11633c, m6754h));
            return c12156a.m6038a(m14037m0);
        }
        return interfaceC12155g;
    }
}
