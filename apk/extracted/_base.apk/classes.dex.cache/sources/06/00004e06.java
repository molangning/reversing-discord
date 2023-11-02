package th;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import ng.AbstractC10870h;
import ng.C10889o;
import p142hi.AbstractC7264g0;
import p142hi.C7276i0;
import p142hi.C7320s1;
import p142hi.InterfaceC7265g1;
import p161ii.InterfaceC7587e;
import p183ji.C8967k;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11905b1;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11943k1;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11966p;
import p305qg.InterfaceC11968q;
import p305qg.InterfaceC11969q0;
import p305qg.InterfaceC11993w0;
import p305qg.InterfaceC11997x0;
import p429xh.C13801c;
import ph.C11633c;
import ph.C11634d;
import ph.C11640h;

/* renamed from: th.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12758e {

    /* renamed from: a */
    public static final C11633c f33099a = new C11633c("kotlin.jvm.JvmName");

    /* renamed from: A */
    public static boolean m4124A(InterfaceC11947m interfaceC11947m) {
        return m4121D(interfaceC11947m, EnumC11918f.ENUM_CLASS);
    }

    /* renamed from: B */
    public static boolean m4123B(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(36);
        }
        return m4121D(interfaceC11947m, EnumC11918f.ENUM_ENTRY);
    }

    /* renamed from: C */
    public static boolean m4122C(InterfaceC11947m interfaceC11947m) {
        return m4121D(interfaceC11947m, EnumC11918f.INTERFACE);
    }

    /* renamed from: D */
    private static boolean m4121D(InterfaceC11947m interfaceC11947m, EnumC11918f enumC11918f) {
        if (enumC11918f == null) {
            m4111a(37);
        }
        if ((interfaceC11947m instanceof InterfaceC11914e) && ((InterfaceC11914e) interfaceC11947m).mo4175g() == enumC11918f) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m4120E(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(1);
        }
        while (interfaceC11947m != null) {
            if (m4091u(interfaceC11947m) || m4087y(interfaceC11947m)) {
                return true;
            }
            interfaceC11947m = interfaceC11947m.mo4163b();
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m4119F(AbstractC7264g0 abstractC7264g0, InterfaceC11947m interfaceC11947m) {
        if (abstractC7264g0 == null) {
            m4111a(30);
        }
        if (interfaceC11947m == null) {
            m4111a(31);
        }
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p != null) {
            InterfaceC11947m mo4221a = mo2788p.mo4221a();
            if ((mo4221a instanceof InterfaceC11927h) && (interfaceC11947m instanceof InterfaceC11927h) && ((InterfaceC11927h) interfaceC11947m).mo4173k().equals(((InterfaceC11927h) mo4221a).mo4173k())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m4118G(InterfaceC11947m interfaceC11947m) {
        return (m4121D(interfaceC11947m, EnumC11918f.CLASS) || m4121D(interfaceC11947m, EnumC11918f.INTERFACE)) && ((InterfaceC11914e) interfaceC11947m).mo4167r() == EnumC11915e0.SEALED;
    }

    /* renamed from: H */
    public static boolean m4117H(InterfaceC11914e interfaceC11914e, InterfaceC11914e interfaceC11914e2) {
        if (interfaceC11914e == null) {
            m4111a(28);
        }
        if (interfaceC11914e2 == null) {
            m4111a(29);
        }
        return m4116I(interfaceC11914e.mo4224p(), interfaceC11914e2.mo4221a());
    }

    /* renamed from: I */
    public static boolean m4116I(AbstractC7264g0 abstractC7264g0, InterfaceC11947m interfaceC11947m) {
        if (abstractC7264g0 == null) {
            m4111a(32);
        }
        if (interfaceC11947m == null) {
            m4111a(33);
        }
        if (m4119F(abstractC7264g0, interfaceC11947m)) {
            return true;
        }
        for (AbstractC7264g0 abstractC7264g02 : abstractC7264g0.mo3564N0().mo2791m()) {
            if (m4116I(abstractC7264g02, interfaceC11947m)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m4115J(InterfaceC11947m interfaceC11947m) {
        return interfaceC11947m != null && (interfaceC11947m.mo4163b() instanceof InterfaceC11945l0);
    }

    /* renamed from: K */
    public static boolean m4114K(InterfaceC11943k1 interfaceC11943k1, AbstractC7264g0 abstractC7264g0) {
        if (interfaceC11943k1 == null) {
            m4111a(63);
        }
        if (abstractC7264g0 == null) {
            m4111a(64);
        }
        if (interfaceC11943k1.mo4342L() || C7276i0.m21083a(abstractC7264g0)) {
            return false;
        }
        if (C7320s1.m20993b(abstractC7264g0)) {
            return true;
        }
        AbstractC10870h m1505j = C13801c.m1505j(interfaceC11943k1);
        if (!AbstractC10870h.m9791r0(abstractC7264g0)) {
            InterfaceC7587e interfaceC7587e = InterfaceC7587e.f20880a;
            if (!interfaceC7587e.mo20255c(m1505j.m9829W(), abstractC7264g0) && !interfaceC7587e.mo20255c(m1505j.m9840K().mo4224p(), abstractC7264g0) && !interfaceC7587e.mo20255c(m1505j.m9810i(), abstractC7264g0) && !C10889o.m9735d(abstractC7264g0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public static <D extends InterfaceC11902b> D m4113L(D d) {
        if (d == null) {
            m4111a(59);
        }
        while (d.mo4305g() == InterfaceC11902b.EnumC11903a.FAKE_OVERRIDE) {
            Collection<? extends InterfaceC11902b> mo4310d = d.mo4310d();
            if (!mo4310d.isEmpty()) {
                d = (D) mo4310d.iterator().next();
            } else {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
            }
        }
        return d;
    }

    /* renamed from: M */
    public static <D extends InterfaceC11968q> D m4112M(D d) {
        if (d == null) {
            m4111a(61);
        }
        if (d instanceof InterfaceC11902b) {
            return m4113L((InterfaceC11902b) d);
        }
        if (d == null) {
            m4111a(62);
        }
        return d;
    }

    /* renamed from: a */
    private static /* synthetic */ void m4111a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: b */
    public static boolean m4110b(InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2) {
        if (interfaceC11947m == null) {
            m4111a(16);
        }
        if (interfaceC11947m2 == null) {
            m4111a(17);
        }
        return m4105g(interfaceC11947m).equals(m4105g(interfaceC11947m2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private static <D extends InterfaceC11897a> void m4109c(D d, Set<D> set) {
        if (d == null) {
            m4111a(70);
        }
        if (set == 0) {
            m4111a(71);
        }
        if (set.contains(d)) {
            return;
        }
        for (InterfaceC11897a interfaceC11897a : d.mo4221a().mo4310d()) {
            InterfaceC11897a mo4221a = interfaceC11897a.mo4221a();
            m4109c(mo4221a, set);
            set.add(mo4221a);
        }
    }

    /* renamed from: d */
    public static <D extends InterfaceC11897a> Set<D> m4108d(D d) {
        if (d == null) {
            m4111a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m4109c(d.mo4221a(), linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: e */
    public static InterfaceC11914e m4107e(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m4111a(45);
        }
        return m4106f(abstractC7264g0.mo3564N0());
    }

    /* renamed from: f */
    public static InterfaceC11914e m4106f(InterfaceC7265g1 interfaceC7265g1) {
        if (interfaceC7265g1 == null) {
            m4111a(46);
        }
        InterfaceC11914e interfaceC11914e = (InterfaceC11914e) interfaceC7265g1.mo2788p();
        if (interfaceC11914e == null) {
            m4111a(47);
        }
        return interfaceC11914e;
    }

    /* renamed from: g */
    public static InterfaceC11928h0 m4105g(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(21);
        }
        InterfaceC11928h0 m4103i = m4103i(interfaceC11947m);
        if (m4103i == null) {
            m4111a(22);
        }
        return m4103i;
    }

    /* renamed from: h */
    public static InterfaceC11928h0 m4104h(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m4111a(20);
        }
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p == null) {
            return null;
        }
        return m4103i(mo2788p);
    }

    /* renamed from: i */
    public static InterfaceC11928h0 m4103i(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(23);
        }
        while (interfaceC11947m != null) {
            if (interfaceC11947m instanceof InterfaceC11928h0) {
                return (InterfaceC11928h0) interfaceC11947m;
            }
            if (interfaceC11947m instanceof InterfaceC11969q0) {
                return ((InterfaceC11969q0) interfaceC11947m).mo4243B0();
            }
            interfaceC11947m = interfaceC11947m.mo4163b();
        }
        return null;
    }

    /* renamed from: j */
    public static InterfaceC11905b1 m4102j(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(79);
        }
        if (interfaceC11947m instanceof InterfaceC11993w0) {
            interfaceC11947m = ((InterfaceC11993w0) interfaceC11947m).mo4535S();
        }
        if (interfaceC11947m instanceof InterfaceC11966p) {
            InterfaceC11905b1 mo2835b = ((InterfaceC11966p) interfaceC11947m).mo4160j().mo2835b();
            if (mo2835b == null) {
                m4111a(80);
            }
            return mo2835b;
        }
        InterfaceC11905b1 interfaceC11905b1 = InterfaceC11905b1.f30908a;
        if (interfaceC11905b1 == null) {
            m4111a(81);
        }
        return interfaceC11905b1;
    }

    /* renamed from: k */
    public static AbstractC11988u m4101k(InterfaceC11914e interfaceC11914e, boolean z) {
        if (interfaceC11914e == null) {
            m4111a(48);
        }
        EnumC11918f mo4175g = interfaceC11914e.mo4175g();
        if (mo4175g != EnumC11918f.ENUM_CLASS && !mo4175g.m6717b()) {
            if (m4118G(interfaceC11914e)) {
                if (z) {
                    AbstractC11988u abstractC11988u = C11974t.f30968c;
                    if (abstractC11988u == null) {
                        m4111a(50);
                    }
                    return abstractC11988u;
                }
                AbstractC11988u abstractC11988u2 = C11974t.f30966a;
                if (abstractC11988u2 == null) {
                    m4111a(51);
                }
                return abstractC11988u2;
            } else if (m4091u(interfaceC11914e)) {
                AbstractC11988u abstractC11988u3 = C11974t.f30977l;
                if (abstractC11988u3 == null) {
                    m4111a(52);
                }
                return abstractC11988u3;
            } else {
                AbstractC11988u abstractC11988u4 = C11974t.f30970e;
                if (abstractC11988u4 == null) {
                    m4111a(53);
                }
                return abstractC11988u4;
            }
        }
        AbstractC11988u abstractC11988u5 = C11974t.f30966a;
        if (abstractC11988u5 == null) {
            m4111a(49);
        }
        return abstractC11988u5;
    }

    /* renamed from: l */
    public static InterfaceC11997x0 m4100l(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(0);
        }
        if (interfaceC11947m instanceof InterfaceC11914e) {
            return ((InterfaceC11914e) interfaceC11947m).mo4233J0();
        }
        return null;
    }

    /* renamed from: m */
    public static C11634d m4099m(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(2);
        }
        C11633c m4097o = m4097o(interfaceC11947m);
        if (m4097o != null) {
            return m4097o.m7450j();
        }
        return m4096p(interfaceC11947m);
    }

    /* renamed from: n */
    public static C11633c m4098n(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(3);
        }
        C11633c m4097o = m4097o(interfaceC11947m);
        if (m4097o == null) {
            m4097o = m4096p(interfaceC11947m).m7437l();
        }
        if (m4097o == null) {
            m4111a(4);
        }
        return m4097o;
    }

    /* renamed from: o */
    private static C11633c m4097o(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(5);
        }
        if (!(interfaceC11947m instanceof InterfaceC11928h0) && !C8967k.m16936m(interfaceC11947m)) {
            if (interfaceC11947m instanceof InterfaceC11969q0) {
                return ((InterfaceC11969q0) interfaceC11947m).mo4239e();
            }
            if (interfaceC11947m instanceof InterfaceC11945l0) {
                return ((InterfaceC11945l0) interfaceC11947m).mo4161e();
            }
            return null;
        }
        return C11633c.f30202c;
    }

    /* renamed from: p */
    private static C11634d m4096p(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(6);
        }
        C11634d m7446c = m4099m(interfaceC11947m.mo4163b()).m7446c(interfaceC11947m.getName());
        if (m7446c == null) {
            m4111a(7);
        }
        return m7446c;
    }

    /* renamed from: q */
    public static <D extends InterfaceC11947m> D m4095q(InterfaceC11947m interfaceC11947m, Class<D> cls) {
        if (cls == null) {
            m4111a(18);
        }
        return (D) m4094r(interfaceC11947m, cls, true);
    }

    /* renamed from: r */
    public static <D extends InterfaceC11947m> D m4094r(InterfaceC11947m interfaceC11947m, Class<D> cls, boolean z) {
        if (cls == null) {
            m4111a(19);
        }
        if (interfaceC11947m == null) {
            return null;
        }
        if (z) {
            interfaceC11947m = (D) interfaceC11947m.mo4163b();
        }
        while (interfaceC11947m != null) {
            if (cls.isInstance(interfaceC11947m)) {
                return (D) interfaceC11947m;
            }
            interfaceC11947m = (D) interfaceC11947m.mo4163b();
        }
        return null;
    }

    /* renamed from: s */
    public static InterfaceC11914e m4093s(InterfaceC11914e interfaceC11914e) {
        if (interfaceC11914e == null) {
            m4111a(44);
        }
        for (AbstractC7264g0 abstractC7264g0 : interfaceC11914e.mo4173k().mo2791m()) {
            InterfaceC11914e m4107e = m4107e(abstractC7264g0);
            if (m4107e.mo4175g() != EnumC11918f.INTERFACE) {
                return m4107e;
            }
        }
        return null;
    }

    /* renamed from: t */
    public static boolean m4092t(InterfaceC11947m interfaceC11947m) {
        return m4121D(interfaceC11947m, EnumC11918f.ANNOTATION_CLASS);
    }

    /* renamed from: u */
    public static boolean m4091u(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m4111a(34);
        }
        if (m4090v(interfaceC11947m) && interfaceC11947m.getName().equals(C11640h.f30218b)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static boolean m4090v(InterfaceC11947m interfaceC11947m) {
        return m4121D(interfaceC11947m, EnumC11918f.CLASS);
    }

    /* renamed from: w */
    public static boolean m4089w(InterfaceC11947m interfaceC11947m) {
        return m4090v(interfaceC11947m) || m4124A(interfaceC11947m);
    }

    /* renamed from: x */
    public static boolean m4088x(InterfaceC11947m interfaceC11947m) {
        return m4121D(interfaceC11947m, EnumC11918f.OBJECT) && ((InterfaceC11914e) interfaceC11947m).mo4177Y();
    }

    /* renamed from: y */
    public static boolean m4087y(InterfaceC11947m interfaceC11947m) {
        if ((interfaceC11947m instanceof InterfaceC11968q) && ((InterfaceC11968q) interfaceC11947m).getVisibility() == C11974t.f30971f) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m4086z(InterfaceC11914e interfaceC11914e, InterfaceC11914e interfaceC11914e2) {
        if (interfaceC11914e == null) {
            m4111a(26);
        }
        if (interfaceC11914e2 == null) {
            m4111a(27);
        }
        for (AbstractC7264g0 abstractC7264g0 : interfaceC11914e.mo4173k().mo2791m()) {
            if (m4119F(abstractC7264g0, interfaceC11914e2.mo4221a())) {
                return true;
            }
        }
        return false;
    }
}