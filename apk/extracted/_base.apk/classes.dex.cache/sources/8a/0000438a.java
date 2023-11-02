package p234mi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p142hi.AbstractC7217a0;
import p142hi.AbstractC7231e;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.C7230d1;
import p142hi.C7267h0;
import p142hi.C7294m1;
import p142hi.C7303o1;
import p142hi.C7304p;
import p142hi.C7320s1;
import p142hi.C7327u0;
import p142hi.C7329u1;
import p142hi.C7335w0;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p161ii.InterfaceC7587e;
import p183ji.C8964h;
import p304qf.C11880m;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11931i;
import p325rg.InterfaceC12155g;
import pf.C11581q;

/* renamed from: mi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10472a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mi.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10473a extends AbstractC9614s implements Function1<AbstractC7333v1, Boolean> {

        /* renamed from: j */
        public static final C10473a f27353j = new C10473a();

        C10473a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC7333v1 it) {
            boolean z;
            C9612q.m13917h(it, "it");
            InterfaceC11927h mo2788p = it.mo3564N0().mo2788p();
            if (mo2788p != null) {
                z = C10472a.m11441q(mo2788p);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mi.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10474b extends AbstractC9614s implements Function1<AbstractC7333v1, Boolean> {

        /* renamed from: j */
        public static final C10474b f27354j = new C10474b();

        C10474b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC7333v1 abstractC7333v1) {
            return Boolean.valueOf(C7320s1.m20982m(abstractC7333v1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mi.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10475c extends AbstractC9614s implements Function1<AbstractC7333v1, Boolean> {

        /* renamed from: j */
        public static final C10475c f27355j = new C10475c();

        C10475c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC7333v1 it) {
            C9612q.m13917h(it, "it");
            InterfaceC11927h mo2788p = it.mo3564N0().mo2788p();
            boolean z = false;
            if (mo2788p != null && ((mo2788p instanceof InterfaceC11917e1) || (mo2788p instanceof InterfaceC11920f1))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final InterfaceC7288k1 m11457a(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        return new C7294m1(abstractC7264g0);
    }

    /* renamed from: b */
    public static final boolean m11456b(AbstractC7264g0 abstractC7264g0, Function1<? super AbstractC7333v1, Boolean> predicate) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        C9612q.m13917h(predicate, "predicate");
        return C7320s1.m20992c(abstractC7264g0, predicate);
    }

    /* renamed from: c */
    private static final boolean m11455c(AbstractC7264g0 abstractC7264g0, InterfaceC7265g1 interfaceC7265g1, Set<? extends InterfaceC11920f1> set) {
        InterfaceC11931i interfaceC11931i;
        List<InterfaceC11920f1> list;
        Iterable<C11880m> m14069I0;
        InterfaceC11920f1 interfaceC11920f1;
        boolean z;
        boolean z2;
        Object m14053W;
        if (C9612q.m13922c(abstractC7264g0.mo3564N0(), interfaceC7265g1)) {
            return true;
        }
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p instanceof InterfaceC11931i) {
            interfaceC11931i = (InterfaceC11931i) mo2788p;
        } else {
            interfaceC11931i = null;
        }
        if (interfaceC11931i != null) {
            list = interfaceC11931i.mo4168q();
        } else {
            list = null;
        }
        m14069I0 = C9553r.m14069I0(abstractC7264g0.mo3566L0());
        if (!(m14069I0 instanceof Collection) || !((Collection) m14069I0).isEmpty()) {
            for (C11880m c11880m : m14069I0) {
                int m6782a = c11880m.m6782a();
                InterfaceC7288k1 interfaceC7288k1 = (InterfaceC7288k1) c11880m.m6781b();
                if (list != null) {
                    m14053W = C9553r.m14053W(list, m6782a);
                    interfaceC11920f1 = (InterfaceC11920f1) m14053W;
                } else {
                    interfaceC11920f1 = null;
                }
                if (interfaceC11920f1 != null && set != null && set.contains(interfaceC11920f1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !interfaceC7288k1.mo20955a()) {
                    AbstractC7264g0 type = interfaceC7288k1.getType();
                    C9612q.m13918g(type, "argument.type");
                    z2 = m11455c(type, interfaceC7265g1, set);
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m11454d(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        return m11456b(abstractC7264g0, C10473a.f27353j);
    }

    /* renamed from: e */
    public static final boolean m11453e(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        return C7320s1.m20992c(abstractC7264g0, C10474b.f27354j);
    }

    /* renamed from: f */
    public static final InterfaceC7288k1 m11452f(AbstractC7264g0 type, EnumC7336w1 projectionKind, InterfaceC11920f1 interfaceC11920f1) {
        EnumC7336w1 enumC7336w1;
        C9612q.m13917h(type, "type");
        C9612q.m13917h(projectionKind, "projectionKind");
        if (interfaceC11920f1 != null) {
            enumC7336w1 = interfaceC11920f1.mo4464m();
        } else {
            enumC7336w1 = null;
        }
        if (enumC7336w1 == projectionKind) {
            projectionKind = EnumC7336w1.INVARIANT;
        }
        return new C7294m1(projectionKind, type);
    }

    /* renamed from: g */
    public static final Set<InterfaceC11920f1> m11451g(AbstractC7264g0 abstractC7264g0, Set<? extends InterfaceC11920f1> set) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m11450h(abstractC7264g0, abstractC7264g0, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private static final void m11450h(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02, Set<InterfaceC11920f1> set, Set<? extends InterfaceC11920f1> set2) {
        InterfaceC11931i interfaceC11931i;
        List<InterfaceC11920f1> list;
        InterfaceC11920f1 interfaceC11920f1;
        boolean z;
        boolean m14064L;
        Object m14053W;
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p instanceof InterfaceC11920f1) {
            if (!C9612q.m13922c(abstractC7264g0.mo3564N0(), abstractC7264g02.mo3564N0())) {
                set.add(mo2788p);
                return;
            }
            for (AbstractC7264g0 upperBound : ((InterfaceC11920f1) mo2788p).getUpperBounds()) {
                C9612q.m13918g(upperBound, "upperBound");
                m11450h(upperBound, abstractC7264g02, set, set2);
            }
            return;
        }
        InterfaceC11927h mo2788p2 = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p2 instanceof InterfaceC11931i) {
            interfaceC11931i = (InterfaceC11931i) mo2788p2;
        } else {
            interfaceC11931i = null;
        }
        if (interfaceC11931i != null) {
            list = interfaceC11931i.mo4168q();
        } else {
            list = null;
        }
        int i = 0;
        for (InterfaceC7288k1 interfaceC7288k1 : abstractC7264g0.mo3566L0()) {
            int i2 = i + 1;
            if (list != null) {
                m14053W = C9553r.m14053W(list, i);
                interfaceC11920f1 = (InterfaceC11920f1) m14053W;
            } else {
                interfaceC11920f1 = null;
            }
            if (interfaceC11920f1 != null && set2 != null && set2.contains(interfaceC11920f1)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !interfaceC7288k1.mo20955a()) {
                m14064L = C9553r.m14064L(set, interfaceC7288k1.getType().mo3564N0().mo2788p());
                if (!m14064L && !C9612q.m13922c(interfaceC7288k1.getType().mo3564N0(), abstractC7264g02.mo3564N0())) {
                    AbstractC7264g0 type = interfaceC7288k1.getType();
                    C9612q.m13918g(type, "argument.type");
                    m11450h(type, abstractC7264g02, set, set2);
                }
            }
            i = i2;
        }
    }

    /* renamed from: i */
    public static final AbstractC10870h m11449i(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        AbstractC10870h mo2790n = abstractC7264g0.mo3564N0().mo2790n();
        C9612q.m13918g(mo2790n, "constructor.builtIns");
        return mo2790n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0050, code lost:
        r3 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0051 A[EDGE_INSN: B:51:0x0051->B:47:0x0051 ?: BREAK  , SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p142hi.AbstractC7264g0 m11448j(p305qg.InterfaceC11920f1 r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r7, r0)
            java.util.List r0 = r7.getUpperBounds()
            java.lang.String r1 = "upperBounds"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            r0.isEmpty()
            java.util.List r0 = r7.getUpperBounds()
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            r4 = r2
            hi.g0 r4 = (p142hi.AbstractC7264g0) r4
            hi.g1 r4 = r4.mo3564N0()
            qg.h r4 = r4.mo2788p()
            boolean r5 = r4 instanceof p305qg.InterfaceC11914e
            if (r5 == 0) goto L39
            r3 = r4
            qg.e r3 = (p305qg.InterfaceC11914e) r3
        L39:
            r4 = 0
            if (r3 != 0) goto L3d
            goto L4e
        L3d:
            qg.f r5 = r3.mo4175g()
            qg.f r6 = p305qg.EnumC11918f.INTERFACE
            if (r5 == r6) goto L4e
            qg.f r3 = r3.mo4175g()
            qg.f r5 = p305qg.EnumC11918f.ANNOTATION_CLASS
            if (r3 == r5) goto L4e
            r4 = 1
        L4e:
            if (r4 == 0) goto L1c
            r3 = r2
        L51:
            hi.g0 r3 = (p142hi.AbstractC7264g0) r3
            if (r3 != 0) goto L68
            java.util.List r7 = r7.getUpperBounds()
            kotlin.jvm.internal.C9612q.m13918g(r7, r1)
            java.lang.Object r7 = kotlin.collections.C9543h.m14162T(r7)
            java.lang.String r0 = "upperBounds.first()"
            kotlin.jvm.internal.C9612q.m13918g(r7, r0)
            r3 = r7
            hi.g0 r3 = (p142hi.AbstractC7264g0) r3
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p234mi.C10472a.m11448j(qg.f1):hi.g0");
    }

    /* renamed from: k */
    public static final boolean m11447k(InterfaceC11920f1 typeParameter) {
        C9612q.m13917h(typeParameter, "typeParameter");
        return m11445m(typeParameter, null, null, 6, null);
    }

    /* renamed from: l */
    public static final boolean m11446l(InterfaceC11920f1 typeParameter, InterfaceC7265g1 interfaceC7265g1, Set<? extends InterfaceC11920f1> set) {
        boolean z;
        C9612q.m13917h(typeParameter, "typeParameter");
        List<AbstractC7264g0> upperBounds = typeParameter.getUpperBounds();
        C9612q.m13918g(upperBounds, "typeParameter.upperBounds");
        if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
            return false;
        }
        for (AbstractC7264g0 upperBound : upperBounds) {
            C9612q.m13918g(upperBound, "upperBound");
            if (m11455c(upperBound, typeParameter.mo4224p().mo3564N0(), set) && (interfaceC7265g1 == null || C9612q.m13922c(upperBound.mo3564N0(), interfaceC7265g1))) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m11445m(InterfaceC11920f1 interfaceC11920f1, InterfaceC7265g1 interfaceC7265g1, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC7265g1 = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return m11446l(interfaceC11920f1, interfaceC7265g1, set);
    }

    /* renamed from: n */
    public static final boolean m11444n(AbstractC7264g0 abstractC7264g0) {
        boolean z;
        C9612q.m13917h(abstractC7264g0, "<this>");
        if (abstractC7264g0 instanceof AbstractC7231e) {
            return true;
        }
        if ((abstractC7264g0 instanceof C7304p) && (((C7304p) abstractC7264g0).m21040Z0() instanceof AbstractC7231e)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final boolean m11443o(AbstractC7264g0 abstractC7264g0) {
        boolean z;
        C9612q.m13917h(abstractC7264g0, "<this>");
        if (abstractC7264g0 instanceof C7335w0) {
            return true;
        }
        if ((abstractC7264g0 instanceof C7304p) && (((C7304p) abstractC7264g0).m21040Z0() instanceof C7335w0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static final boolean m11442p(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 superType) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        C9612q.m13917h(superType, "superType");
        return InterfaceC7587e.f20880a.mo20256b(abstractC7264g0, superType);
    }

    /* renamed from: q */
    public static final boolean m11441q(InterfaceC11927h interfaceC11927h) {
        C9612q.m13917h(interfaceC11927h, "<this>");
        if ((interfaceC11927h instanceof InterfaceC11920f1) && (((InterfaceC11920f1) interfaceC11927h).mo4163b() instanceof InterfaceC11917e1)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static final boolean m11440r(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        return C7320s1.m20982m(abstractC7264g0);
    }

    /* renamed from: s */
    public static final boolean m11439s(AbstractC7264g0 type) {
        C9612q.m13917h(type, "type");
        if ((type instanceof C8964h) && ((C8964h) type).m16955X0().m16949c()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static final AbstractC7264g0 m11438t(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        AbstractC7264g0 m20981n = C7320s1.m20981n(abstractC7264g0);
        C9612q.m13918g(m20981n, "makeNotNullable(this)");
        return m20981n;
    }

    /* renamed from: u */
    public static final AbstractC7264g0 m11437u(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        AbstractC7264g0 m20980o = C7320s1.m20980o(abstractC7264g0);
        C9612q.m13918g(m20980o, "makeNullable(this)");
        return m20980o;
    }

    /* renamed from: v */
    public static final AbstractC7264g0 m11436v(AbstractC7264g0 abstractC7264g0, InterfaceC12155g newAnnotations) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        C9612q.m13917h(newAnnotations, "newAnnotations");
        if (abstractC7264g0.getAnnotations().isEmpty() && newAnnotations.isEmpty()) {
            return abstractC7264g0;
        }
        return abstractC7264g0.mo20916Q0().mo3559T0(C7230d1.m21189a(abstractC7264g0.mo3565M0(), newAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [hi.v1] */
    /* renamed from: w */
    public static final AbstractC7264g0 m11435w(AbstractC7264g0 abstractC7264g0) {
        int m14093t;
        AbstractC7302o0 abstractC7302o0;
        int m14093t2;
        int m14093t3;
        C9612q.m13917h(abstractC7264g0, "<this>");
        AbstractC7333v1 mo20916Q0 = abstractC7264g0.mo20916Q0();
        if (mo20916Q0 instanceof AbstractC7217a0) {
            AbstractC7217a0 abstractC7217a0 = (AbstractC7217a0) mo20916Q0;
            AbstractC7302o0 m21218V0 = abstractC7217a0.m21218V0();
            if (!m21218V0.mo3564N0().getParameters().isEmpty() && m21218V0.mo3564N0().mo2788p() != null) {
                List<InterfaceC11920f1> parameters = m21218V0.mo3564N0().getParameters();
                C9612q.m13918g(parameters, "constructor.parameters");
                m14093t3 = C9546k.m14093t(parameters, 10);
                ArrayList arrayList = new ArrayList(m14093t3);
                for (InterfaceC11920f1 interfaceC11920f1 : parameters) {
                    arrayList.add(new C7327u0(interfaceC11920f1));
                }
                m21218V0 = C7303o1.m21042f(m21218V0, arrayList, null, 2, null);
            }
            AbstractC7302o0 m21217W0 = abstractC7217a0.m21217W0();
            if (!m21217W0.mo3564N0().getParameters().isEmpty() && m21217W0.mo3564N0().mo2788p() != null) {
                List<InterfaceC11920f1> parameters2 = m21217W0.mo3564N0().getParameters();
                C9612q.m13918g(parameters2, "constructor.parameters");
                m14093t2 = C9546k.m14093t(parameters2, 10);
                ArrayList arrayList2 = new ArrayList(m14093t2);
                for (InterfaceC11920f1 interfaceC11920f12 : parameters2) {
                    arrayList2.add(new C7327u0(interfaceC11920f12));
                }
                m21217W0 = C7303o1.m21042f(m21217W0, arrayList2, null, 2, null);
            }
            abstractC7302o0 = C7267h0.m21104d(m21218V0, m21217W0);
        } else if (mo20916Q0 instanceof AbstractC7302o0) {
            AbstractC7302o0 abstractC7302o02 = (AbstractC7302o0) mo20916Q0;
            boolean isEmpty = abstractC7302o02.mo3564N0().getParameters().isEmpty();
            abstractC7302o0 = abstractC7302o02;
            if (!isEmpty) {
                InterfaceC11927h mo2788p = abstractC7302o02.mo3564N0().mo2788p();
                abstractC7302o0 = abstractC7302o02;
                if (mo2788p != null) {
                    List<InterfaceC11920f1> parameters3 = abstractC7302o02.mo3564N0().getParameters();
                    C9612q.m13918g(parameters3, "constructor.parameters");
                    m14093t = C9546k.m14093t(parameters3, 10);
                    ArrayList arrayList3 = new ArrayList(m14093t);
                    for (InterfaceC11920f1 interfaceC11920f13 : parameters3) {
                        arrayList3.add(new C7327u0(interfaceC11920f13));
                    }
                    abstractC7302o0 = C7303o1.m21042f(abstractC7302o02, arrayList3, null, 2, null);
                }
            }
        } else {
            throw new C11581q();
        }
        return C7329u1.m20948b(abstractC7302o0, mo20916Q0);
    }

    /* renamed from: x */
    public static final boolean m11434x(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        return m11456b(abstractC7264g0, C10475c.f27355j);
    }
}