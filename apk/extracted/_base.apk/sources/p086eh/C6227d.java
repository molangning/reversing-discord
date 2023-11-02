package p086eh;

import ch.C2543d;
import ch.C2548g;
import ch.InterfaceC2553k;
import gh.C6761a0;
import gh.InterfaceC6765c0;
import gh.InterfaceC6769f;
import gh.InterfaceC6770g;
import gh.InterfaceC6772i;
import gh.InterfaceC6773j;
import gh.InterfaceC6785v;
import gh.InterfaceC6787x;
import gh.InterfaceC6788y;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9544i;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.EnumC10876i;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.C7230d1;
import p142hi.C7267h0;
import p142hi.C7279j0;
import p142hi.C7281j1;
import p142hi.C7294m1;
import p142hi.C7320s1;
import p142hi.EnumC7317r1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p183ji.C8964h;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p234mi.C10472a;
import p305qg.C11938k0;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import p468zg.C14239j0;
import pg.C11601d;
import ph.C11632b;
import ph.C11633c;

/* renamed from: eh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C6227d {

    /* renamed from: a */
    private final C2548g f17642a;

    /* renamed from: b */
    private final InterfaceC2553k f17643b;

    /* renamed from: c */
    private final C6230f f17644c;

    /* renamed from: d */
    private final C7281j1 f17645d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eh.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C6228a extends AbstractC9614s implements Function0<AbstractC7264g0> {

        /* renamed from: k */
        final /* synthetic */ InterfaceC11920f1 f17647k;

        /* renamed from: l */
        final /* synthetic */ C6224a f17648l;

        /* renamed from: m */
        final /* synthetic */ InterfaceC7265g1 f17649m;

        /* renamed from: n */
        final /* synthetic */ InterfaceC6773j f17650n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6228a(InterfaceC11920f1 interfaceC11920f1, C6224a c6224a, InterfaceC7265g1 interfaceC7265g1, InterfaceC6773j interfaceC6773j) {
            super(0);
            this.f17647k = interfaceC11920f1;
            this.f17648l = c6224a;
            this.f17649m = interfaceC7265g1;
            this.f17650n = interfaceC6773j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AbstractC7264g0 invoke() {
            AbstractC7302o0 abstractC7302o0;
            C7281j1 c7281j1 = C6227d.this.f17645d;
            InterfaceC11920f1 interfaceC11920f1 = this.f17647k;
            C6224a c6224a = this.f17648l;
            InterfaceC11927h mo2788p = this.f17649m.mo2788p();
            if (mo2788p != null) {
                abstractC7302o0 = mo2788p.mo4224p();
            } else {
                abstractC7302o0 = null;
            }
            return c7281j1.m21068c(interfaceC11920f1, c6224a.m23214k(abstractC7302o0).m23215j(this.f17650n.mo2187t()));
        }
    }

    public C6227d(C2548g c, InterfaceC2553k typeParameterResolver) {
        C9612q.m13917h(c, "c");
        C9612q.m13917h(typeParameterResolver, "typeParameterResolver");
        this.f17642a = c;
        this.f17643b = typeParameterResolver;
        C6230f c6230f = new C6230f();
        this.f17644c = c6230f;
        this.f17645d = new C7281j1(c6230f, null, 2, null);
    }

    /* renamed from: b */
    private final boolean m23207b(InterfaceC6773j interfaceC6773j, InterfaceC11914e interfaceC11914e) {
        Object m14042h0;
        Object m14042h02;
        EnumC7336w1 mo4464m;
        m14042h0 = C9553r.m14042h0(interfaceC6773j.mo2186z());
        if (!C6761a0.m21915a((InterfaceC6787x) m14042h0)) {
            return false;
        }
        List<InterfaceC11920f1> parameters = C11601d.f30130a.m7543b(interfaceC11914e).mo4173k().getParameters();
        C9612q.m13918g(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
        m14042h02 = C9553r.m14042h0(parameters);
        InterfaceC11920f1 interfaceC11920f1 = (InterfaceC11920f1) m14042h02;
        if (interfaceC11920f1 == null || (mo4464m = interfaceC11920f1.mo4464m()) == null || mo4464m == EnumC7336w1.OUT_VARIANCE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        if ((!r0.isEmpty()) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<p142hi.InterfaceC7288k1> m23206c(gh.InterfaceC6773j r12, p086eh.C6224a r13, p142hi.InterfaceC7265g1 r14) {
        /*
            r11 = this;
            boolean r0 = r12.mo2187t()
            r1 = 0
            java.lang.String r2 = "constructor.parameters"
            r3 = 1
            if (r0 != 0) goto L25
            java.util.List r0 = r12.mo2186z()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            java.util.List r0 = r14.getParameters()
            kotlin.jvm.internal.C9612q.m13918g(r0, r2)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = r1
            goto L26
        L25:
            r0 = r3
        L26:
            java.util.List r4 = r14.getParameters()
            kotlin.jvm.internal.C9612q.m13918g(r4, r2)
            if (r0 == 0) goto L34
            java.util.List r12 = r11.m23205d(r12, r4, r14, r13)
            return r12
        L34:
            int r13 = r4.size()
            java.util.List r14 = r12.mo2186z()
            int r14 = r14.size()
            r0 = 10
            if (r13 == r14) goto L82
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = kotlin.collections.C9543h.m14124t(r4, r0)
            r12.<init>(r13)
            java.util.Iterator r13 = r4.iterator()
        L51:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L7d
            java.lang.Object r14 = r13.next()
            qg.f1 r14 = (p305qg.InterfaceC11920f1) r14
            hi.m1 r0 = new hi.m1
            ji.j r2 = p183ji.EnumC8966j.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            java.lang.String[] r4 = new java.lang.String[r3]
            ph.f r14 = r14.getName()
            java.lang.String r14 = r14.m7426b()
            java.lang.String r5 = "p.name.asString()"
            kotlin.jvm.internal.C9612q.m13918g(r14, r5)
            r4[r1] = r14
            ji.h r14 = p183ji.C8967k.m16945d(r2, r4)
            r0.<init>(r14)
            r12.add(r0)
            goto L51
        L7d:
            java.util.List r12 = kotlin.collections.C9543h.m14181C0(r12)
            return r12
        L82:
            java.util.List r12 = r12.mo2186z()
            java.lang.Iterable r12 = kotlin.collections.C9543h.m14174I0(r12)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = kotlin.collections.C9543h.m14124t(r12, r0)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L97:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto Lce
            java.lang.Object r14 = r12.next()
            qf.m r14 = (p304qf.C11880m) r14
            int r0 = r14.m6782a()
            java.lang.Object r14 = r14.m6781b()
            gh.x r14 = (gh.InterfaceC6787x) r14
            r4.size()
            java.lang.Object r0 = r4.get(r0)
            qg.f1 r0 = (p305qg.InterfaceC11920f1) r0
            hi.r1 r5 = p142hi.EnumC7317r1.COMMON
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 7
            r10 = 0
            eh.a r1 = p086eh.C6225b.m23210b(r5, r6, r7, r8, r9, r10)
            java.lang.String r2 = "parameter"
            kotlin.jvm.internal.C9612q.m13918g(r0, r2)
            hi.k1 r14 = r11.m23193p(r14, r1, r0)
            r13.add(r14)
            goto L97
        Lce:
            java.util.List r12 = kotlin.collections.C9543h.m14181C0(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p086eh.C6227d.m23206c(gh.j, eh.a, hi.g1):java.util.List");
    }

    /* renamed from: d */
    private final List<InterfaceC7288k1> m23205d(InterfaceC6773j interfaceC6773j, List<? extends InterfaceC11920f1> list, InterfaceC7265g1 interfaceC7265g1, C6224a c6224a) {
        int m14093t;
        InterfaceC7288k1 mo20933a;
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11920f1 interfaceC11920f1 : list) {
            if (C10472a.m11446l(interfaceC11920f1, null, c6224a.mo20911c())) {
                mo20933a = C7320s1.m20975t(interfaceC11920f1, c6224a);
            } else {
                mo20933a = this.f17644c.mo20933a(interfaceC11920f1, c6224a.m23215j(interfaceC6773j.mo2187t()), this.f17645d, new C7279j0(this.f17642a.m33010e(), new C6228a(interfaceC11920f1, c6224a, interfaceC7265g1, interfaceC6773j)));
            }
            arrayList.add(mo20933a);
        }
        return arrayList;
    }

    /* renamed from: e */
    private final AbstractC7302o0 m23204e(InterfaceC6773j interfaceC6773j, C6224a c6224a, AbstractC7302o0 abstractC7302o0) {
        C7226c1 m21188b;
        if (abstractC7302o0 == null || (m21188b = abstractC7302o0.mo3565M0()) == null) {
            m21188b = C7230d1.m21188b(new C2543d(this.f17642a, interfaceC6773j, false, 4, null));
        }
        C7226c1 c7226c1 = m21188b;
        InterfaceC7265g1 m23203f = m23203f(interfaceC6773j, c6224a);
        InterfaceC7265g1 interfaceC7265g1 = null;
        if (m23203f == null) {
            return null;
        }
        boolean m23200i = m23200i(c6224a);
        if (abstractC7302o0 != null) {
            interfaceC7265g1 = abstractC7302o0.mo3564N0();
        }
        if (C9612q.m13922c(interfaceC7265g1, m23203f) && !interfaceC6773j.mo2187t() && m23200i) {
            return abstractC7302o0.mo3558U0(true);
        }
        return C7267h0.m21098j(c7226c1, m23203f, m23206c(interfaceC6773j, c6224a, m23203f), m23200i, null, 16, null);
    }

    /* renamed from: f */
    private final InterfaceC7265g1 m23203f(InterfaceC6773j interfaceC6773j, C6224a c6224a) {
        InterfaceC7265g1 mo4173k;
        InterfaceC6772i mo2188j = interfaceC6773j.mo2188j();
        if (mo2188j == null) {
            return m23202g(interfaceC6773j);
        }
        if (mo2188j instanceof InterfaceC6770g) {
            InterfaceC6770g interfaceC6770g = (InterfaceC6770g) mo2188j;
            C11633c mo2210e = interfaceC6770g.mo2210e();
            if (mo2210e != null) {
                InterfaceC11914e m23199j = m23199j(interfaceC6773j, c6224a, mo2210e);
                if (m23199j == null) {
                    m23199j = this.f17642a.m33014a().m33036n().mo33002a(interfaceC6770g);
                }
                if (m23199j == null || (mo4173k = m23199j.mo4173k()) == null) {
                    return m23202g(interfaceC6773j);
                }
                return mo4173k;
            }
            throw new AssertionError("Class type should have a FQ name: " + mo2188j);
        } else if (mo2188j instanceof InterfaceC6788y) {
            InterfaceC11920f1 mo32999a = this.f17643b.mo32999a((InterfaceC6788y) mo2188j);
            if (mo32999a != null) {
                return mo32999a.mo4173k();
            }
            return null;
        } else {
            throw new IllegalStateException("Unknown classifier kind: " + mo2188j);
        }
    }

    /* renamed from: g */
    private final InterfaceC7265g1 m23202g(InterfaceC6773j interfaceC6773j) {
        List<Integer> m14109d;
        C11632b m7460m = C11632b.m7460m(new C11633c(interfaceC6773j.mo2189H()));
        C9612q.m13918g(m7460m, "topLevel(FqName(javaType.classifierQualifiedName))");
        C11938k0 m24115q = this.f17642a.m33014a().m33048b().m20454d().m24115q();
        m14109d = C9544i.m14109d(0);
        InterfaceC7265g1 mo4173k = m24115q.m6700d(m7460m, m14109d).mo4173k();
        C9612q.m13918g(mo4173k, "c.components.deserialize…istOf(0)).typeConstructor");
        return mo4173k;
    }

    /* renamed from: h */
    private final boolean m23201h(EnumC7336w1 enumC7336w1, InterfaceC11920f1 interfaceC11920f1) {
        if (interfaceC11920f1.mo4464m() == EnumC7336w1.INVARIANT || enumC7336w1 == interfaceC11920f1.mo4464m()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private final boolean m23200i(C6224a c6224a) {
        if (c6224a.m23218g() == EnumC6226c.FLEXIBLE_LOWER_BOUND || c6224a.m23217h() || c6224a.mo20912b() == EnumC7317r1.SUPERTYPE) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final InterfaceC11914e m23199j(InterfaceC6773j interfaceC6773j, C6224a c6224a, C11633c c11633c) {
        C11633c c11633c2;
        if (c6224a.m23217h()) {
            c11633c2 = C6229e.f17651a;
            if (C9612q.m13922c(c11633c, c11633c2)) {
                return this.f17642a.m33014a().m33034p().m9761c();
            }
        }
        C11601d c11601d = C11601d.f30130a;
        InterfaceC11914e m7539f = C11601d.m7539f(c11601d, c11633c, this.f17642a.m33011d().mo4194n(), null, 4, null);
        if (m7539f == null) {
            return null;
        }
        if (c11601d.m7541d(m7539f) && (c6224a.m23218g() == EnumC6226c.FLEXIBLE_LOWER_BOUND || c6224a.mo20912b() == EnumC7317r1.SUPERTYPE || m23207b(interfaceC6773j, m7539f))) {
            return c11601d.m7543b(m7539f);
        }
        return m7539f;
    }

    /* renamed from: l */
    public static /* synthetic */ AbstractC7264g0 m23197l(C6227d c6227d, InterfaceC6769f interfaceC6769f, C6224a c6224a, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c6227d.m23198k(interfaceC6769f, c6224a, z);
    }

    /* renamed from: m */
    private final AbstractC7264g0 m23196m(InterfaceC6773j interfaceC6773j, C6224a c6224a) {
        boolean z;
        if (!c6224a.m23217h() && c6224a.mo20912b() != EnumC7317r1.SUPERTYPE) {
            z = true;
        } else {
            z = false;
        }
        boolean mo2187t = interfaceC6773j.mo2187t();
        if (!mo2187t && !z) {
            AbstractC7302o0 m23204e = m23204e(interfaceC6773j, c6224a, null);
            if (m23204e == null) {
                return m23195n(interfaceC6773j);
            }
            return m23204e;
        }
        AbstractC7302o0 m23204e2 = m23204e(interfaceC6773j, c6224a.m23213l(EnumC6226c.FLEXIBLE_LOWER_BOUND), null);
        if (m23204e2 == null) {
            return m23195n(interfaceC6773j);
        }
        AbstractC7302o0 m23204e3 = m23204e(interfaceC6773j, c6224a.m23213l(EnumC6226c.FLEXIBLE_UPPER_BOUND), m23204e2);
        if (m23204e3 == null) {
            return m23195n(interfaceC6773j);
        }
        if (mo2187t) {
            return new C6235h(m23204e2, m23204e3);
        }
        return C7267h0.m21104d(m23204e2, m23204e3);
    }

    /* renamed from: n */
    private static final C8964h m23195n(InterfaceC6773j interfaceC6773j) {
        return C8967k.m16945d(EnumC8966j.UNRESOLVED_JAVA_CLASS, interfaceC6773j.mo2190E());
    }

    /* renamed from: p */
    private final InterfaceC7288k1 m23193p(InterfaceC6787x interfaceC6787x, C6224a c6224a, InterfaceC11920f1 interfaceC11920f1) {
        EnumC7336w1 enumC7336w1;
        InterfaceC7288k1 m20975t;
        List<? extends InterfaceC12149c> m14037m0;
        if (interfaceC6787x instanceof InterfaceC6765c0) {
            InterfaceC6765c0 interfaceC6765c0 = (InterfaceC6765c0) interfaceC6787x;
            InterfaceC6787x mo2247w = interfaceC6765c0.mo2247w();
            if (interfaceC6765c0.mo2250L()) {
                enumC7336w1 = EnumC7336w1.OUT_VARIANCE;
            } else {
                enumC7336w1 = EnumC7336w1.IN_VARIANCE;
            }
            if (mo2247w != null && !m23201h(enumC7336w1, interfaceC11920f1)) {
                InterfaceC12149c m340a = C14239j0.m340a(this.f17642a, interfaceC6765c0);
                AbstractC7264g0 m23194o = m23194o(mo2247w, C6225b.m23210b(EnumC7317r1.COMMON, false, false, null, 7, null));
                if (m340a != null) {
                    InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
                    m14037m0 = C9553r.m14037m0(m23194o.getAnnotations(), m340a);
                    m23194o = C10472a.m11436v(m23194o, c12156a.m6038a(m14037m0));
                }
                m20975t = C10472a.m11452f(m23194o, enumC7336w1, interfaceC11920f1);
            } else {
                m20975t = C7320s1.m20975t(interfaceC11920f1, c6224a);
            }
            C9612q.m13918g(m20975t, "{\n                val bo…          }\n            }");
            return m20975t;
        }
        return new C7294m1(EnumC7336w1.INVARIANT, m23194o(interfaceC6787x, c6224a));
    }

    /* renamed from: k */
    public final AbstractC7264g0 m23198k(InterfaceC6769f arrayType, C6224a attr, boolean z) {
        InterfaceC6785v interfaceC6785v;
        EnumC7336w1 enumC7336w1;
        List<? extends InterfaceC12149c> m14038l0;
        C9612q.m13917h(arrayType, "arrayType");
        C9612q.m13917h(attr, "attr");
        InterfaceC6787x componentType = arrayType.getComponentType();
        EnumC10876i enumC10876i = null;
        if (componentType instanceof InterfaceC6785v) {
            interfaceC6785v = (InterfaceC6785v) componentType;
        } else {
            interfaceC6785v = null;
        }
        if (interfaceC6785v != null) {
            enumC10876i = interfaceC6785v.getType();
        }
        C2543d c2543d = new C2543d(this.f17642a, arrayType, true);
        if (enumC10876i != null) {
            AbstractC7302o0 m9837O = this.f17642a.m33011d().mo4194n().m9837O(enumC10876i);
            C9612q.m13918g(m9837O, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
            m14038l0 = C9553r.m14038l0(c2543d, m9837O.getAnnotations());
            C10472a.m11436v(m9837O, c12156a.m6038a(m14038l0));
            if (!attr.m23217h()) {
                return C7267h0.m21104d(m9837O, m9837O.mo3558U0(true));
            }
            return m9837O;
        }
        AbstractC7264g0 m23194o = m23194o(componentType, C6225b.m23210b(EnumC7317r1.COMMON, attr.m23217h(), false, null, 6, null));
        if (attr.m23217h()) {
            if (z) {
                enumC7336w1 = EnumC7336w1.OUT_VARIANCE;
            } else {
                enumC7336w1 = EnumC7336w1.INVARIANT;
            }
            AbstractC7302o0 m9802m = this.f17642a.m33011d().mo4194n().m9802m(enumC7336w1, m23194o, c2543d);
            C9612q.m13918g(m9802m, "c.module.builtIns.getArr…mponentType, annotations)");
            return m9802m;
        }
        AbstractC7302o0 m9802m2 = this.f17642a.m33011d().mo4194n().m9802m(EnumC7336w1.INVARIANT, m23194o, c2543d);
        C9612q.m13918g(m9802m2, "c.module.builtIns.getArr…mponentType, annotations)");
        return C7267h0.m21104d(m9802m2, this.f17642a.m33011d().mo4194n().m9802m(EnumC7336w1.OUT_VARIANCE, m23194o, c2543d).mo3558U0(true));
    }

    /* renamed from: o */
    public final AbstractC7264g0 m23194o(InterfaceC6787x interfaceC6787x, C6224a attr) {
        AbstractC7264g0 m23194o;
        AbstractC7302o0 m9826Z;
        C9612q.m13917h(attr, "attr");
        if (interfaceC6787x instanceof InterfaceC6785v) {
            EnumC10876i type = ((InterfaceC6785v) interfaceC6787x).getType();
            if (type != null) {
                m9826Z = this.f17642a.m33011d().mo4194n().m9834R(type);
            } else {
                m9826Z = this.f17642a.m33011d().mo4194n().m9826Z();
            }
            C9612q.m13918g(m9826Z, "{\n                val pr…ns.unitType\n            }");
            return m9826Z;
        } else if (interfaceC6787x instanceof InterfaceC6773j) {
            return m23196m((InterfaceC6773j) interfaceC6787x, attr);
        } else {
            if (interfaceC6787x instanceof InterfaceC6769f) {
                return m23197l(this, (InterfaceC6769f) interfaceC6787x, attr, false, 4, null);
            }
            if (interfaceC6787x instanceof InterfaceC6765c0) {
                InterfaceC6787x mo2247w = ((InterfaceC6765c0) interfaceC6787x).mo2247w();
                if (mo2247w == null || (m23194o = m23194o(mo2247w, attr)) == null) {
                    AbstractC7302o0 m9779y = this.f17642a.m33011d().mo4194n().m9779y();
                    C9612q.m13918g(m9779y, "c.module.builtIns.defaultBound");
                    return m9779y;
                }
                return m23194o;
            } else if (interfaceC6787x == null) {
                AbstractC7302o0 m9779y2 = this.f17642a.m33011d().mo4194n().m9779y();
                C9612q.m13918g(m9779y2, "c.module.builtIns.defaultBound");
                return m9779y2;
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + interfaceC6787x);
            }
        }
    }
}
