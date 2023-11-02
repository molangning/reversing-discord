package th;

import bi.C2310b;
import bi.C2311c;
import bi.C2312d;
import java.util.Collections;
import ng.C10884k;
import p142hi.AbstractC7264g0;
import p142hi.C7226c1;
import p142hi.C7267h0;
import p142hi.C7294m1;
import p142hi.EnumC7336w1;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.C11994x;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p305qg.InterfaceC12005z0;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import ph.C11638f;
import ph.C11641i;
import tg.C12685c0;
import tg.C12691d0;
import tg.C12697e0;
import tg.C12698f;
import tg.C12699f0;
import tg.C12701g0;
import tg.C12713l0;

/* renamed from: th.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12756d {

    /* renamed from: th.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C12757a extends C12698f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12757a(InterfaceC11914e interfaceC11914e, InterfaceC11900a1 interfaceC11900a1, boolean z) {
            super(interfaceC11914e, null, InterfaceC12155g.f31603f.m6037b(), true, InterfaceC11902b.EnumC11903a.DECLARATION, interfaceC11900a1);
            if (interfaceC11914e == null) {
                m4125g0(0);
            }
            if (interfaceC11900a1 == null) {
                m4125g0(1);
            }
            m4440q1(Collections.emptyList(), C12758e.m4101k(interfaceC11914e, z));
        }

        /* renamed from: g0 */
        private static /* synthetic */ void m4125g0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m4142a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: b */
    public static InterfaceC11997x0 m4141b(InterfaceC11897a interfaceC11897a, AbstractC7264g0 abstractC7264g0, C11638f c11638f, InterfaceC12155g interfaceC12155g) {
        if (interfaceC11897a == null) {
            m4142a(32);
        }
        if (interfaceC12155g == null) {
            m4142a(33);
        }
        if (abstractC7264g0 == null) {
            return null;
        }
        return new C12699f0(interfaceC11897a, new C2311c(interfaceC11897a, abstractC7264g0, c11638f, null), interfaceC12155g);
    }

    /* renamed from: c */
    public static InterfaceC11997x0 m4140c(InterfaceC11914e interfaceC11914e, AbstractC7264g0 abstractC7264g0, C11638f c11638f, InterfaceC12155g interfaceC12155g) {
        if (interfaceC11914e == null) {
            m4142a(34);
        }
        if (interfaceC12155g == null) {
            m4142a(35);
        }
        if (abstractC7264g0 == null) {
            return null;
        }
        return new C12699f0(interfaceC11914e, new C2310b(interfaceC11914e, abstractC7264g0, c11638f, null), interfaceC12155g);
    }

    /* renamed from: d */
    public static C12691d0 m4139d(InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g interfaceC12155g) {
        if (interfaceC11989u0 == null) {
            m4142a(13);
        }
        if (interfaceC12155g == null) {
            m4142a(14);
        }
        return m4133j(interfaceC11989u0, interfaceC12155g, true, false, false);
    }

    /* renamed from: e */
    public static C12697e0 m4138e(InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g interfaceC12155g, InterfaceC12155g interfaceC12155g2) {
        if (interfaceC11989u0 == null) {
            m4142a(0);
        }
        if (interfaceC12155g == null) {
            m4142a(1);
        }
        if (interfaceC12155g2 == null) {
            m4142a(2);
        }
        return m4129n(interfaceC11989u0, interfaceC12155g, interfaceC12155g2, true, false, false, interfaceC11989u0.mo4160j());
    }

    /* renamed from: f */
    public static InterfaceC11989u0 m4137f(InterfaceC11914e interfaceC11914e) {
        if (interfaceC11914e == null) {
            m4142a(26);
        }
        InterfaceC11914e m6652a = C11994x.m6652a(C12758e.m4105g(interfaceC11914e), C11641i.f30262a.m7407i());
        if (m6652a == null) {
            return null;
        }
        InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
        InterfaceC12155g m6037b = c12156a.m6037b();
        EnumC11915e0 enumC11915e0 = EnumC11915e0.FINAL;
        AbstractC11988u abstractC11988u = C11974t.f30970e;
        C11638f c11638f = C10884k.f28412e;
        InterfaceC11902b.EnumC11903a enumC11903a = InterfaceC11902b.EnumC11903a.SYNTHESIZED;
        C12685c0 m4527O0 = C12685c0.m4527O0(interfaceC11914e, m6037b, enumC11915e0, abstractC11988u, false, c11638f, enumC11903a, interfaceC11914e.mo4160j(), false, false, false, false, false, false);
        C12691d0 c12691d0 = new C12691d0(m4527O0, c12156a.m6037b(), enumC11915e0, abstractC11988u, false, false, false, enumC11903a, null, interfaceC11914e.mo4160j());
        m4527O0.m4521U0(c12691d0, null);
        m4527O0.m4513b1(C7267h0.m21100h(C7226c1.f19622k.m21197h(), m6652a.mo4173k(), Collections.singletonList(new C7294m1(interfaceC11914e.mo4224p())), false), Collections.emptyList(), null, null, Collections.emptyList());
        c12691d0.m4470Q0(m4527O0.getReturnType());
        return m4527O0;
    }

    /* renamed from: g */
    public static InterfaceC12005z0 m4136g(InterfaceC11914e interfaceC11914e) {
        if (interfaceC11914e == null) {
            m4142a(24);
        }
        InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
        C12701g0 m4434l1 = C12701g0.m4434l1(interfaceC11914e, c12156a.m6037b(), C10884k.f28413f, InterfaceC11902b.EnumC11903a.SYNTHESIZED, interfaceC11914e.mo4160j());
        C12701g0 mo4323R0 = m4434l1.mo4323R0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new C12713l0(m4434l1, null, 0, c12156a.m6037b(), C11638f.m7422f("value"), C13801c.m1505j(interfaceC11914e).m9829W(), false, false, false, null, interfaceC11914e.mo4160j())), interfaceC11914e.mo4224p(), EnumC11915e0.FINAL, C11974t.f30970e);
        if (mo4323R0 == null) {
            m4142a(25);
        }
        return mo4323R0;
    }

    /* renamed from: h */
    public static InterfaceC12005z0 m4135h(InterfaceC11914e interfaceC11914e) {
        if (interfaceC11914e == null) {
            m4142a(22);
        }
        C12701g0 mo4323R0 = C12701g0.m4434l1(interfaceC11914e, InterfaceC12155g.f31603f.m6037b(), C10884k.f28411d, InterfaceC11902b.EnumC11903a.SYNTHESIZED, interfaceC11914e.mo4160j()).mo4323R0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), C13801c.m1505j(interfaceC11914e).m9804l(EnumC7336w1.INVARIANT, interfaceC11914e.mo4224p()), EnumC11915e0.FINAL, C11974t.f30970e);
        if (mo4323R0 == null) {
            m4142a(23);
        }
        return mo4323R0;
    }

    /* renamed from: i */
    public static InterfaceC11997x0 m4134i(InterfaceC11897a interfaceC11897a, AbstractC7264g0 abstractC7264g0, InterfaceC12155g interfaceC12155g) {
        if (interfaceC11897a == null) {
            m4142a(30);
        }
        if (interfaceC12155g == null) {
            m4142a(31);
        }
        if (abstractC7264g0 == null) {
            return null;
        }
        return new C12699f0(interfaceC11897a, new C2312d(interfaceC11897a, abstractC7264g0, null), interfaceC12155g);
    }

    /* renamed from: j */
    public static C12691d0 m4133j(InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g interfaceC12155g, boolean z, boolean z2, boolean z3) {
        if (interfaceC11989u0 == null) {
            m4142a(15);
        }
        if (interfaceC12155g == null) {
            m4142a(16);
        }
        return m4132k(interfaceC11989u0, interfaceC12155g, z, z2, z3, interfaceC11989u0.mo4160j());
    }

    /* renamed from: k */
    public static C12691d0 m4132k(InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g interfaceC12155g, boolean z, boolean z2, boolean z3, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11989u0 == null) {
            m4142a(17);
        }
        if (interfaceC12155g == null) {
            m4142a(18);
        }
        if (interfaceC11900a1 == null) {
            m4142a(19);
        }
        return new C12691d0(interfaceC11989u0, interfaceC12155g, interfaceC11989u0.mo4167r(), interfaceC11989u0.getVisibility(), z, z2, z3, InterfaceC11902b.EnumC11903a.DECLARATION, null, interfaceC11900a1);
    }

    /* renamed from: l */
    public static C12698f m4131l(InterfaceC11914e interfaceC11914e, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11914e == null) {
            m4142a(20);
        }
        if (interfaceC11900a1 == null) {
            m4142a(21);
        }
        return new C12757a(interfaceC11914e, interfaceC11900a1, false);
    }

    /* renamed from: m */
    public static C12697e0 m4130m(InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g interfaceC12155g, InterfaceC12155g interfaceC12155g2, boolean z, boolean z2, boolean z3, AbstractC11988u abstractC11988u, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11989u0 == null) {
            m4142a(7);
        }
        if (interfaceC12155g == null) {
            m4142a(8);
        }
        if (interfaceC12155g2 == null) {
            m4142a(9);
        }
        if (abstractC11988u == null) {
            m4142a(10);
        }
        if (interfaceC11900a1 == null) {
            m4142a(11);
        }
        C12697e0 c12697e0 = new C12697e0(interfaceC11989u0, interfaceC12155g, interfaceC11989u0.mo4167r(), abstractC11988u, z, z2, z3, InterfaceC11902b.EnumC11903a.DECLARATION, null, interfaceC11900a1);
        c12697e0.m4449R0(C12697e0.m4451P0(c12697e0, interfaceC11989u0.getType(), interfaceC12155g2));
        return c12697e0;
    }

    /* renamed from: n */
    public static C12697e0 m4129n(InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g interfaceC12155g, InterfaceC12155g interfaceC12155g2, boolean z, boolean z2, boolean z3, InterfaceC11900a1 interfaceC11900a1) {
        if (interfaceC11989u0 == null) {
            m4142a(3);
        }
        if (interfaceC12155g == null) {
            m4142a(4);
        }
        if (interfaceC12155g2 == null) {
            m4142a(5);
        }
        if (interfaceC11900a1 == null) {
            m4142a(6);
        }
        return m4130m(interfaceC11989u0, interfaceC12155g, interfaceC12155g2, z, z2, z3, interfaceC11989u0.getVisibility(), interfaceC11900a1);
    }

    /* renamed from: o */
    private static boolean m4128o(InterfaceC11998y interfaceC11998y) {
        if (interfaceC11998y == null) {
            m4142a(29);
        }
        if (interfaceC11998y.mo4305g() == InterfaceC11902b.EnumC11903a.SYNTHESIZED && C12758e.m4124A(interfaceC11998y.mo4163b())) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m4127p(InterfaceC11998y interfaceC11998y) {
        if (interfaceC11998y == null) {
            m4142a(28);
        }
        if (interfaceC11998y.getName().equals(C10884k.f28413f) && m4128o(interfaceC11998y)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m4126q(InterfaceC11998y interfaceC11998y) {
        if (interfaceC11998y == null) {
            m4142a(27);
        }
        if (interfaceC11998y.getName().equals(C10884k.f28411d) && m4128o(interfaceC11998y)) {
            return true;
        }
        return false;
    }
}
