package p141hh;

import ch.InterfaceC2541c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.C7226c1;
import p142hi.C7229d0;
import p142hi.C7230d1;
import p142hi.C7267h0;
import p142hi.C7319s0;
import p142hi.C7320s1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p234mi.C10472a;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p325rg.InterfaceC12155g;

/* renamed from: hh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7161d {

    /* renamed from: a */
    private final InterfaceC2541c f19524a;

    /* renamed from: hh.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7162a {

        /* renamed from: a */
        private final AbstractC7264g0 f19525a;

        /* renamed from: b */
        private final int f19526b;

        public C7162a(AbstractC7264g0 abstractC7264g0, int i) {
            this.f19525a = abstractC7264g0;
            this.f19526b = i;
        }

        /* renamed from: a */
        public final int m21339a() {
            return this.f19526b;
        }

        /* renamed from: b */
        public final AbstractC7264g0 m21338b() {
            return this.f19525a;
        }
    }

    /* renamed from: hh.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7163b {

        /* renamed from: a */
        private final AbstractC7302o0 f19527a;

        /* renamed from: b */
        private final int f19528b;

        /* renamed from: c */
        private final boolean f19529c;

        public C7163b(AbstractC7302o0 abstractC7302o0, int i, boolean z) {
            this.f19527a = abstractC7302o0;
            this.f19528b = i;
            this.f19529c = z;
        }

        /* renamed from: a */
        public final boolean m21337a() {
            return this.f19529c;
        }

        /* renamed from: b */
        public final int m21336b() {
            return this.f19528b;
        }

        /* renamed from: c */
        public final AbstractC7302o0 m21335c() {
            return this.f19527a;
        }
    }

    public C7161d(InterfaceC2541c javaResolverSettings) {
        C9612q.m13917h(javaResolverSettings, "javaResolverSettings");
        this.f19524a = javaResolverSettings;
    }

    /* renamed from: b */
    private final C7163b m21343b(AbstractC7302o0 abstractC7302o0, Function1<? super Integer, C7164e> function1, int i, EnumC7210o enumC7210o, boolean z, boolean z2) {
        boolean z3;
        InterfaceC11927h m21232f;
        Boolean m21230h;
        InterfaceC7265g1 mo3564N0;
        int m14093t;
        int m14093t2;
        C7160c c7160c;
        boolean z4;
        boolean z5;
        InterfaceC12155g interfaceC12155g;
        List m14099n;
        InterfaceC12155g m21233e;
        int m14093t3;
        int m14093t4;
        boolean mo3563O0;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C7162a c7162a;
        InterfaceC7288k1 interfaceC7288k1;
        Function1<? super Integer, C7164e> function12 = function1;
        boolean m21239a = C7211p.m21239a(enumC7210o);
        if (z2 && z) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC7264g0 abstractC7264g0 = null;
        if (!m21239a && abstractC7302o0.mo3566L0().isEmpty()) {
            return new C7163b(null, 1, false);
        }
        InterfaceC11927h mo2788p = abstractC7302o0.mo3564N0().mo2788p();
        if (mo2788p == null) {
            return new C7163b(null, 1, false);
        }
        C7164e invoke = function12.invoke(Integer.valueOf(i));
        m21232f = C7213r.m21232f(mo2788p, invoke, enumC7210o);
        m21230h = C7213r.m21230h(invoke, enumC7210o);
        if (m21232f == null || (mo3564N0 = m21232f.mo4173k()) == null) {
            mo3564N0 = abstractC7302o0.mo3564N0();
        }
        InterfaceC7265g1 interfaceC7265g1 = mo3564N0;
        C9612q.m13918g(interfaceC7265g1, "enhancedClassifier?.typeConstructor ?: constructor");
        int i2 = i + 1;
        List<InterfaceC7288k1> mo3566L0 = abstractC7302o0.mo3566L0();
        List<InterfaceC11920f1> parameters = interfaceC7265g1.getParameters();
        C9612q.m13918g(parameters, "typeConstructor.parameters");
        Iterator<T> it = mo3566L0.iterator();
        Iterator<T> it2 = parameters.iterator();
        m14093t = C9546k.m14093t(mo3566L0, 10);
        m14093t2 = C9546k.m14093t(parameters, 10);
        ArrayList<InterfaceC7288k1> arrayList = new ArrayList(Math.min(m14093t, m14093t2));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            InterfaceC11920f1 interfaceC11920f1 = (InterfaceC11920f1) it2.next();
            InterfaceC7288k1 interfaceC7288k12 = (InterfaceC7288k1) next;
            if (!z3) {
                z9 = z3;
                c7162a = new C7162a(abstractC7264g0, 0);
            } else {
                z9 = z3;
                if (!interfaceC7288k12.mo20955a()) {
                    c7162a = m21341d(interfaceC7288k12.getType().mo20916Q0(), function12, i2, z2);
                } else if (function12.invoke(Integer.valueOf(i2)).m21331d() == EnumC7168h.FORCE_FLEXIBILITY) {
                    AbstractC7333v1 mo20916Q0 = interfaceC7288k12.getType().mo20916Q0();
                    c7162a = new C7162a(C7267h0.m21104d(C7229d0.m21191c(mo20916Q0).mo3558U0(false), C7229d0.m21190d(mo20916Q0).mo3558U0(true)), 1);
                } else {
                    c7162a = new C7162a(null, 1);
                }
            }
            i2 += c7162a.m21339a();
            if (c7162a.m21338b() != null) {
                AbstractC7264g0 m21338b = c7162a.m21338b();
                EnumC7336w1 mo20954b = interfaceC7288k12.mo20954b();
                C9612q.m13918g(mo20954b, "arg.projectionKind");
                interfaceC7288k1 = C10472a.m11452f(m21338b, mo20954b, interfaceC11920f1);
            } else if (m21232f != null && !interfaceC7288k12.mo20955a()) {
                AbstractC7264g0 type = interfaceC7288k12.getType();
                C9612q.m13918g(type, "arg.type");
                EnumC7336w1 mo20954b2 = interfaceC7288k12.mo20954b();
                C9612q.m13918g(mo20954b2, "arg.projectionKind");
                interfaceC7288k1 = C10472a.m11452f(type, mo20954b2, interfaceC11920f1);
            } else if (m21232f != null) {
                interfaceC7288k1 = C7320s1.m20976s(interfaceC11920f1);
            } else {
                interfaceC7288k1 = null;
            }
            arrayList.add(interfaceC7288k1);
            function12 = function1;
            z3 = z9;
            abstractC7264g0 = null;
        }
        int i3 = i2 - i;
        if (m21232f == null && m21230h == null) {
            if (!arrayList.isEmpty()) {
                for (InterfaceC7288k1 interfaceC7288k13 : arrayList) {
                    if (interfaceC7288k13 == null) {
                        z7 = true;
                        continue;
                    } else {
                        z7 = false;
                        continue;
                    }
                    if (!z7) {
                        z8 = false;
                        break;
                    }
                }
            }
            z8 = true;
            if (z8) {
                return new C7163b(null, i3, false);
            }
        }
        InterfaceC12155g[] interfaceC12155gArr = new InterfaceC12155g[3];
        interfaceC12155gArr[0] = abstractC7302o0.getAnnotations();
        c7160c = C7213r.f19610b;
        if (m21232f != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            c7160c = null;
        }
        interfaceC12155gArr[1] = c7160c;
        InterfaceC12155g m21231g = C7213r.m21231g();
        if (m21230h != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            interfaceC12155g = m21231g;
        } else {
            interfaceC12155g = null;
        }
        interfaceC12155gArr[2] = interfaceC12155g;
        m14099n = C9545j.m14099n(interfaceC12155gArr);
        m21233e = C7213r.m21233e(m14099n);
        C7226c1 m21188b = C7230d1.m21188b(m21233e);
        List<InterfaceC7288k1> mo3566L02 = abstractC7302o0.mo3566L0();
        Iterator it3 = arrayList.iterator();
        Iterator<T> it4 = mo3566L02.iterator();
        m14093t3 = C9546k.m14093t(arrayList, 10);
        m14093t4 = C9546k.m14093t(mo3566L02, 10);
        ArrayList arrayList2 = new ArrayList(Math.min(m14093t3, m14093t4));
        while (it3.hasNext() && it4.hasNext()) {
            Object next2 = it3.next();
            InterfaceC7288k1 interfaceC7288k14 = (InterfaceC7288k1) it4.next();
            InterfaceC7288k1 interfaceC7288k15 = (InterfaceC7288k1) next2;
            if (interfaceC7288k15 != null) {
                interfaceC7288k14 = interfaceC7288k15;
            }
            arrayList2.add(interfaceC7288k14);
        }
        if (m21230h != null) {
            mo3563O0 = m21230h.booleanValue();
        } else {
            mo3563O0 = abstractC7302o0.mo3563O0();
        }
        AbstractC7302o0 m21098j = C7267h0.m21098j(m21188b, interfaceC7265g1, arrayList2, mo3563O0, null, 16, null);
        if (invoke.m21333b()) {
            m21098j = m21340e(m21098j);
        }
        if (m21230h != null && invoke.m21330e()) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new C7163b(m21098j, i3, z6);
    }

    /* renamed from: c */
    static /* synthetic */ C7163b m21342c(C7161d c7161d, AbstractC7302o0 abstractC7302o0, Function1 function1, int i, EnumC7210o enumC7210o, boolean z, boolean z2, int i2, Object obj) {
        return c7161d.m21343b(abstractC7302o0, function1, i, enumC7210o, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0096, code lost:
        if (r13 == null) goto L41;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p141hh.C7161d.C7162a m21341d(p142hi.AbstractC7333v1 r12, kotlin.jvm.functions.Function1<? super java.lang.Integer, p141hh.C7164e> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = p142hi.C7276i0.m21083a(r12)
            r1 = 0
            if (r0 == 0) goto Le
            hh.d$a r12 = new hh.d$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        Le:
            boolean r0 = r12 instanceof p142hi.AbstractC7217a0
            if (r0 == 0) goto Lad
            boolean r0 = r12 instanceof p142hi.InterfaceC7296n0
            r9 = r12
            hi.a0 r9 = (p142hi.AbstractC7217a0) r9
            hi.o0 r3 = r9.m21218V0()
            hh.o r6 = p141hh.EnumC7210o.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            hh.d$b r10 = r2.m21343b(r3, r4, r5, r6, r7, r8)
            hi.o0 r3 = r9.m21217W0()
            hh.o r6 = p141hh.EnumC7210o.FLEXIBLE_UPPER
            hh.d$b r13 = r2.m21343b(r3, r4, r5, r6, r7, r8)
            r10.m21336b()
            r13.m21336b()
            hi.o0 r14 = r10.m21335c()
            if (r14 != 0) goto L43
            hi.o0 r14 = r13.m21335c()
            if (r14 != 0) goto L43
            goto La3
        L43:
            boolean r14 = r10.m21337a()
            if (r14 != 0) goto L85
            boolean r14 = r13.m21337a()
            if (r14 == 0) goto L50
            goto L85
        L50:
            if (r0 == 0) goto L6c
            eh.h r1 = new eh.h
            hi.o0 r12 = r10.m21335c()
            if (r12 != 0) goto L5e
            hi.o0 r12 = r9.m21218V0()
        L5e:
            hi.o0 r13 = r13.m21335c()
            if (r13 != 0) goto L68
            hi.o0 r13 = r9.m21217W0()
        L68:
            r1.<init>(r12, r13)
            goto La3
        L6c:
            hi.o0 r12 = r10.m21335c()
            if (r12 != 0) goto L76
            hi.o0 r12 = r9.m21218V0()
        L76:
            hi.o0 r13 = r13.m21335c()
            if (r13 != 0) goto L80
            hi.o0 r13 = r9.m21217W0()
        L80:
            hi.v1 r1 = p142hi.C7267h0.m21104d(r12, r13)
            goto La3
        L85:
            hi.o0 r13 = r13.m21335c()
            if (r13 == 0) goto L98
            hi.o0 r14 = r10.m21335c()
            if (r14 != 0) goto L92
            r14 = r13
        L92:
            hi.v1 r13 = p142hi.C7267h0.m21104d(r14, r13)
            if (r13 != 0) goto L9f
        L98:
            hi.o0 r13 = r10.m21335c()
            kotlin.jvm.internal.C9612q.m13920e(r13)
        L9f:
            hi.v1 r1 = p142hi.C7329u1.m20946d(r12, r13)
        La3:
            hh.d$a r12 = new hh.d$a
            int r13 = r10.m21336b()
            r12.<init>(r1, r13)
            goto Ldf
        Lad:
            boolean r0 = r12 instanceof p142hi.AbstractC7302o0
            if (r0 == 0) goto Le0
            r2 = r12
            hi.o0 r2 = (p142hi.AbstractC7302o0) r2
            hh.o r5 = p141hh.EnumC7210o.INFLEXIBLE
            r6 = 0
            r8 = 8
            r9 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            hh.d$b r13 = m21342c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            hh.d$a r14 = new hh.d$a
            boolean r15 = r13.m21337a()
            if (r15 == 0) goto Ld3
            hi.o0 r15 = r13.m21335c()
            hi.v1 r12 = p142hi.C7329u1.m20946d(r12, r15)
            goto Ld7
        Ld3:
            hi.o0 r12 = r13.m21335c()
        Ld7:
            int r13 = r13.m21336b()
            r14.<init>(r12, r13)
            r12 = r14
        Ldf:
            return r12
        Le0:
            pf.q r12 = new pf.q
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p141hh.C7161d.m21341d(hi.v1, kotlin.jvm.functions.Function1, int, boolean):hh.d$a");
    }

    /* renamed from: e */
    private final AbstractC7302o0 m21340e(AbstractC7302o0 abstractC7302o0) {
        if (this.f19524a.mo33025a()) {
            return C7319s0.m20998h(abstractC7302o0, true);
        }
        return new C7167g(abstractC7302o0);
    }

    /* renamed from: a */
    public final AbstractC7264g0 m21344a(AbstractC7264g0 abstractC7264g0, Function1<? super Integer, C7164e> qualifiers, boolean z) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        C9612q.m13917h(qualifiers, "qualifiers");
        return m21341d(abstractC7264g0.mo20916Q0(), qualifiers, 0, z).m21338b();
    }
}