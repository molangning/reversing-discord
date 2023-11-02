package p142hi;

import ai.InterfaceC0194h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.InterfaceC7345z0;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p234mi.C10472a;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;

/* renamed from: hi.x0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7338x0 {

    /* renamed from: c */
    public static final C7339a f19780c = new C7339a(null);

    /* renamed from: d */
    private static final C7338x0 f19781d = new C7338x0(InterfaceC7345z0.C7346a.f19792a, false);

    /* renamed from: a */
    private final InterfaceC7345z0 f19782a;

    /* renamed from: b */
    private final boolean f19783b;

    /* renamed from: hi.x0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7339a {
        private C7339a() {
        }

        public /* synthetic */ C7339a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m20917b(int i, InterfaceC11917e1 interfaceC11917e1) {
            if (i <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + interfaceC11917e1.getName());
        }
    }

    public C7338x0(InterfaceC7345z0 reportStrategy, boolean z) {
        C9612q.m13917h(reportStrategy, "reportStrategy");
        this.f19782a = reportStrategy;
        this.f19783b = z;
    }

    /* renamed from: a */
    private final void m20931a(InterfaceC12155g interfaceC12155g, InterfaceC12155g interfaceC12155g2) {
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC12149c> it = interfaceC12155g.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().mo6030e());
        }
        for (InterfaceC12149c interfaceC12149c : interfaceC12155g2) {
            if (hashSet.contains(interfaceC12149c.mo6030e())) {
                this.f19782a.mo20902a(interfaceC12149c);
            }
        }
    }

    /* renamed from: b */
    private final void m20930b(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02) {
        C7307p1 m21028f = C7307p1.m21028f(abstractC7264g02);
        C9612q.m13918g(m21028f, "create(substitutedType)");
        int i = 0;
        for (Object obj : abstractC7264g02.mo3566L0()) {
            int i2 = i + 1;
            if (i < 0) {
                C9545j.m14094s();
            }
            InterfaceC7288k1 interfaceC7288k1 = (InterfaceC7288k1) obj;
            if (!interfaceC7288k1.mo20955a()) {
                AbstractC7264g0 type = interfaceC7288k1.getType();
                C9612q.m13918g(type, "substitutedArgument.type");
                if (!C10472a.m11454d(type)) {
                    InterfaceC7288k1 interfaceC7288k12 = abstractC7264g0.mo3566L0().get(i);
                    InterfaceC11920f1 typeParameter = abstractC7264g0.mo3564N0().getParameters().get(i);
                    if (this.f19783b) {
                        InterfaceC7345z0 interfaceC7345z0 = this.f19782a;
                        AbstractC7264g0 type2 = interfaceC7288k12.getType();
                        C9612q.m13918g(type2, "unsubstitutedArgument.type");
                        AbstractC7264g0 type3 = interfaceC7288k1.getType();
                        C9612q.m13918g(type3, "substitutedArgument.type");
                        C9612q.m13918g(typeParameter, "typeParameter");
                        interfaceC7345z0.mo20900c(m21028f, type2, type3, typeParameter);
                    }
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    private final C7330v m20929c(C7330v c7330v, C7226c1 c7226c1) {
        return c7330v.mo3559T0(m20924h(c7330v, c7226c1));
    }

    /* renamed from: d */
    private final AbstractC7302o0 m20928d(AbstractC7302o0 abstractC7302o0, C7226c1 c7226c1) {
        return C7276i0.m21083a(abstractC7302o0) ? abstractC7302o0 : C7303o1.m21042f(abstractC7302o0, null, m20924h(abstractC7302o0, c7226c1), 1, null);
    }

    /* renamed from: e */
    private final AbstractC7302o0 m20927e(AbstractC7302o0 abstractC7302o0, AbstractC7264g0 abstractC7264g0) {
        AbstractC7302o0 m20977r = C7320s1.m20977r(abstractC7302o0, abstractC7264g0.mo3563O0());
        C9612q.m13918g(m20977r, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return m20977r;
    }

    /* renamed from: f */
    private final AbstractC7302o0 m20926f(AbstractC7302o0 abstractC7302o0, AbstractC7264g0 abstractC7264g0) {
        return m20928d(m20927e(abstractC7302o0, abstractC7264g0), abstractC7264g0.mo3565M0());
    }

    /* renamed from: g */
    private final AbstractC7302o0 m20925g(C7342y0 c7342y0, C7226c1 c7226c1, boolean z) {
        InterfaceC7265g1 mo4173k = c7342y0.m20908b().mo4173k();
        C9612q.m13918g(mo4173k, "descriptor.typeConstructor");
        return C7267h0.m21097k(c7226c1, mo4173k, c7342y0.m20909a(), z, InterfaceC0194h.C0197b.f649b);
    }

    /* renamed from: h */
    private final C7226c1 m20924h(AbstractC7264g0 abstractC7264g0, C7226c1 c7226c1) {
        if (C7276i0.m21083a(abstractC7264g0)) {
            return abstractC7264g0.mo3565M0();
        }
        return c7226c1.m21204k(abstractC7264g0.mo3565M0());
    }

    /* renamed from: j */
    private final InterfaceC7288k1 m20922j(InterfaceC7288k1 interfaceC7288k1, C7342y0 c7342y0, int i) {
        int m14093t;
        AbstractC7333v1 mo20916Q0 = interfaceC7288k1.getType().mo20916Q0();
        if (C7334w.m20938a(mo20916Q0)) {
            return interfaceC7288k1;
        }
        AbstractC7302o0 m21047a = C7303o1.m21047a(mo20916Q0);
        if (!C7276i0.m21083a(m21047a) && C10472a.m11434x(m21047a)) {
            InterfaceC7265g1 mo3564N0 = m21047a.mo3564N0();
            InterfaceC11927h mo2788p = mo3564N0.mo2788p();
            mo3564N0.getParameters().size();
            m21047a.mo3566L0().size();
            if (!(mo2788p instanceof InterfaceC11920f1)) {
                if (mo2788p instanceof InterfaceC11917e1) {
                    InterfaceC11917e1 interfaceC11917e1 = (InterfaceC11917e1) mo2788p;
                    int i2 = 0;
                    if (c7342y0.m20906d(interfaceC11917e1)) {
                        this.f19782a.mo20901b(interfaceC11917e1);
                        EnumC7336w1 enumC7336w1 = EnumC7336w1.INVARIANT;
                        EnumC8966j enumC8966j = EnumC8966j.RECURSIVE_TYPE_ALIAS;
                        String c11638f = interfaceC11917e1.getName().toString();
                        C9612q.m13918g(c11638f, "typeDescriptor.name.toString()");
                        return new C7294m1(enumC7336w1, C8967k.m16945d(enumC8966j, c11638f));
                    }
                    List<InterfaceC7288k1> mo3566L0 = m21047a.mo3566L0();
                    m14093t = C9546k.m14093t(mo3566L0, 10);
                    ArrayList arrayList = new ArrayList(m14093t);
                    for (Object obj : mo3566L0) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            C9545j.m14094s();
                        }
                        arrayList.add(m20920l((InterfaceC7288k1) obj, c7342y0, mo3564N0.getParameters().get(i2), i + 1));
                        i2 = i3;
                    }
                    AbstractC7302o0 m20921k = m20921k(C7342y0.f19787e.m20905a(c7342y0, interfaceC11917e1, arrayList), m21047a.mo3565M0(), m21047a.mo3563O0(), i + 1, false);
                    AbstractC7302o0 m20919m = m20919m(m21047a, c7342y0, i);
                    if (!C7334w.m20938a(m20921k)) {
                        m20921k = C7319s0.m20996j(m20921k, m20919m);
                    }
                    return new C7294m1(interfaceC7288k1.mo20954b(), m20921k);
                }
                AbstractC7302o0 m20919m2 = m20919m(m21047a, c7342y0, i);
                m20930b(m21047a, m20919m2);
                return new C7294m1(interfaceC7288k1.mo20954b(), m20919m2);
            }
            return interfaceC7288k1;
        }
        return interfaceC7288k1;
    }

    /* renamed from: k */
    private final AbstractC7302o0 m20921k(C7342y0 c7342y0, C7226c1 c7226c1, boolean z, int i, boolean z2) {
        InterfaceC7288k1 m20920l = m20920l(new C7294m1(EnumC7336w1.INVARIANT, c7342y0.m20908b().mo6719t0()), c7342y0, null, i);
        AbstractC7264g0 type = m20920l.getType();
        C9612q.m13918g(type, "expandedProjection.type");
        AbstractC7302o0 m21047a = C7303o1.m21047a(type);
        if (C7276i0.m21083a(m21047a)) {
            return m21047a;
        }
        m20920l.mo20954b();
        m20931a(m21047a.getAnnotations(), C7286k.m21059a(c7226c1));
        AbstractC7302o0 m20977r = C7320s1.m20977r(m20928d(m21047a, c7226c1), z);
        C9612q.m13918g(m20977r, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        if (z2) {
            return C7319s0.m20996j(m20977r, m20925g(c7342y0, c7226c1, z));
        }
        return m20977r;
    }

    /* renamed from: l */
    private final InterfaceC7288k1 m20920l(InterfaceC7288k1 interfaceC7288k1, C7342y0 c7342y0, InterfaceC11920f1 interfaceC11920f1, int i) {
        EnumC7336w1 enumC7336w1;
        AbstractC7264g0 m20926f;
        EnumC7336w1 enumC7336w12;
        EnumC7336w1 enumC7336w13;
        f19780c.m20917b(i, c7342y0.m20908b());
        if (interfaceC7288k1.mo20955a()) {
            C9612q.m13920e(interfaceC11920f1);
            InterfaceC7288k1 m20976s = C7320s1.m20976s(interfaceC11920f1);
            C9612q.m13918g(m20976s, "makeStarProjection(typeParameterDescriptor!!)");
            return m20976s;
        }
        AbstractC7264g0 type = interfaceC7288k1.getType();
        C9612q.m13918g(type, "underlyingProjection.type");
        InterfaceC7288k1 m20907c = c7342y0.m20907c(type.mo3564N0());
        if (m20907c == null) {
            return m20922j(interfaceC7288k1, c7342y0, i);
        }
        if (m20907c.mo20955a()) {
            C9612q.m13920e(interfaceC11920f1);
            InterfaceC7288k1 m20976s2 = C7320s1.m20976s(interfaceC11920f1);
            C9612q.m13918g(m20976s2, "makeStarProjection(typeParameterDescriptor!!)");
            return m20976s2;
        }
        AbstractC7333v1 mo20916Q0 = m20907c.getType().mo20916Q0();
        EnumC7336w1 mo20954b = m20907c.mo20954b();
        C9612q.m13918g(mo20954b, "argument.projectionKind");
        EnumC7336w1 mo20954b2 = interfaceC7288k1.mo20954b();
        C9612q.m13918g(mo20954b2, "underlyingProjection.projectionKind");
        if (mo20954b2 != mo20954b && mo20954b2 != (enumC7336w13 = EnumC7336w1.INVARIANT)) {
            if (mo20954b == enumC7336w13) {
                mo20954b = mo20954b2;
            } else {
                this.f19782a.mo20899d(c7342y0.m20908b(), interfaceC11920f1, mo20916Q0);
            }
        }
        if (interfaceC11920f1 == null || (enumC7336w1 = interfaceC11920f1.mo4464m()) == null) {
            enumC7336w1 = EnumC7336w1.INVARIANT;
        }
        C9612q.m13918g(enumC7336w1, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if (enumC7336w1 != mo20954b && enumC7336w1 != (enumC7336w12 = EnumC7336w1.INVARIANT)) {
            if (mo20954b == enumC7336w12) {
                mo20954b = enumC7336w12;
            } else {
                this.f19782a.mo20899d(c7342y0.m20908b(), interfaceC11920f1, mo20916Q0);
            }
        }
        m20931a(type.getAnnotations(), mo20916Q0.getAnnotations());
        if (mo20916Q0 instanceof C7330v) {
            m20926f = m20929c((C7330v) mo20916Q0, type.mo3565M0());
        } else {
            m20926f = m20926f(C7303o1.m21047a(mo20916Q0), type);
        }
        return new C7294m1(mo20954b, m20926f);
    }

    /* renamed from: m */
    private final AbstractC7302o0 m20919m(AbstractC7302o0 abstractC7302o0, C7342y0 c7342y0, int i) {
        int m14093t;
        InterfaceC7265g1 mo3564N0 = abstractC7302o0.mo3564N0();
        List<InterfaceC7288k1> mo3566L0 = abstractC7302o0.mo3566L0();
        m14093t = C9546k.m14093t(mo3566L0, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        int i2 = 0;
        for (Object obj : mo3566L0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9545j.m14094s();
            }
            InterfaceC7288k1 interfaceC7288k1 = (InterfaceC7288k1) obj;
            InterfaceC7288k1 m20920l = m20920l(interfaceC7288k1, c7342y0, mo3564N0.getParameters().get(i2), i + 1);
            if (!m20920l.mo20955a()) {
                m20920l = new C7294m1(m20920l.mo20954b(), C7320s1.m20978q(m20920l.getType(), interfaceC7288k1.getType().mo3563O0()));
            }
            arrayList.add(m20920l);
            i2 = i3;
        }
        return C7303o1.m21042f(abstractC7302o0, arrayList, null, 2, null);
    }

    /* renamed from: i */
    public final AbstractC7302o0 m20923i(C7342y0 typeAliasExpansion, C7226c1 attributes) {
        C9612q.m13917h(typeAliasExpansion, "typeAliasExpansion");
        C9612q.m13917h(attributes, "attributes");
        return m20921k(typeAliasExpansion, attributes, false, 0, true);
    }
}
