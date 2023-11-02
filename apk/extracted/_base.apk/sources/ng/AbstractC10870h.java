package ng;

import ai.InterfaceC0194h;
import gi.InterfaceC6813g;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ng.C10884k;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7230d1;
import p142hi.C7267h0;
import p142hi.C7294m1;
import p142hi.C7320s1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p269og.C11097a;
import p305qg.C11972s;
import p305qg.C11994x;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11969q0;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11991v0;
import p305qg.InterfaceC11993w0;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import p448yg.EnumC14023d;
import ph.C11632b;
import ph.C11633c;
import ph.C11634d;
import ph.C11638f;
import sg.InterfaceC12471a;
import sg.InterfaceC12473b;
import sg.InterfaceC12474c;
import tg.C12744x;
import th.C12758e;

/* renamed from: ng.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC10870h {

    /* renamed from: g */
    public static final C11638f f28361g = C11638f.m7419i("<built-ins module>");

    /* renamed from: a */
    private C12744x f28362a;

    /* renamed from: b */
    private InterfaceC6815i<C12744x> f28363b;

    /* renamed from: c */
    private final InterfaceC6815i<C10875e> f28364c;

    /* renamed from: d */
    private final InterfaceC6815i<Collection<InterfaceC11969q0>> f28365d;

    /* renamed from: e */
    private final InterfaceC6813g<C11638f, InterfaceC11914e> f28366e;

    /* renamed from: f */
    private final InterfaceC6821n f28367f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ng.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C10871a implements Function0<Collection<InterfaceC11969q0>> {
        C10871a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public Collection<InterfaceC11969q0> invoke() {
            return Arrays.asList(AbstractC10870h.this.m9792r().mo4210H0(C10884k.f28428u), AbstractC10870h.this.m9792r().mo4210H0(C10884k.f28430w), AbstractC10870h.this.m9792r().mo4210H0(C10884k.f28431x), AbstractC10870h.this.m9792r().mo4210H0(C10884k.f28429v));
        }
    }

    /* renamed from: ng.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    class C10872b implements Function0<C10875e> {
        C10872b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public C10875e invoke() {
            EnumC10876i[] values;
            EnumMap enumMap = new EnumMap(EnumC10876i.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (EnumC10876i enumC10876i : EnumC10876i.values()) {
                AbstractC7302o0 m9794q = AbstractC10870h.this.m9794q(enumC10876i.m9766e().m7426b());
                AbstractC7302o0 m9794q2 = AbstractC10870h.this.m9794q(enumC10876i.m9768c().m7426b());
                enumMap.put((EnumMap) enumC10876i, (EnumC10876i) m9794q2);
                hashMap.put(m9794q, m9794q2);
                hashMap2.put(m9794q2, m9794q);
            }
            return new C10875e(enumMap, hashMap, hashMap2, null);
        }
    }

    /* renamed from: ng.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    class C10873c implements Function1<C11638f, InterfaceC11914e> {
        C10873c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public InterfaceC11914e invoke(C11638f c11638f) {
            InterfaceC11927h mo16932g = AbstractC10870h.this.m9790s().mo16932g(c11638f, EnumC14023d.FROM_BUILTINS);
            if (mo16932g != null) {
                if (mo16932g instanceof InterfaceC11914e) {
                    return (InterfaceC11914e) mo16932g;
                }
                throw new AssertionError("Must be a class descriptor " + c11638f + ", but was " + mo16932g);
            }
            throw new AssertionError("Built-in class " + C10884k.f28428u.m7457c(c11638f) + " is not found");
        }
    }

    /* renamed from: ng.h$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    class C10874d implements Function0<Void> {

        /* renamed from: j */
        final /* synthetic */ C12744x f28371j;

        C10874d(C12744x c12744x) {
            this.f28371j = c12744x;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public Void invoke() {
            if (AbstractC10870h.this.f28362a == null) {
                AbstractC10870h.this.f28362a = this.f28371j;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + AbstractC10870h.this.f28362a + " (attempting to reset to " + this.f28371j + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ng.h$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static class C10875e {

        /* renamed from: a */
        public final Map<EnumC10876i, AbstractC7302o0> f28373a;

        /* renamed from: b */
        public final Map<AbstractC7264g0, AbstractC7302o0> f28374b;

        /* renamed from: c */
        public final Map<AbstractC7302o0, AbstractC7302o0> f28375c;

        /* synthetic */ C10875e(Map map, Map map2, Map map3, C10871a c10871a) {
            this(map, map2, map3);
        }

        /* renamed from: a */
        private static /* synthetic */ void m9771a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private C10875e(Map<EnumC10876i, AbstractC7302o0> map, Map<AbstractC7264g0, AbstractC7302o0> map2, Map<AbstractC7302o0, AbstractC7302o0> map3) {
            if (map == null) {
                m9771a(0);
            }
            if (map2 == null) {
                m9771a(1);
            }
            if (map3 == null) {
                m9771a(2);
            }
            this.f28373a = map;
            this.f28374b = map2;
            this.f28375c = map3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10870h(InterfaceC6821n interfaceC6821n) {
        if (interfaceC6821n == null) {
            m9825a(0);
        }
        this.f28367f = interfaceC6821n;
        this.f28365d = interfaceC6821n.mo21867c(new C10871a());
        this.f28364c = interfaceC6821n.mo21867c(new C10872b());
        this.f28366e = interfaceC6821n.mo21861i(new C10873c());
    }

    /* renamed from: A */
    private static AbstractC7264g0 m9854A(AbstractC7264g0 abstractC7264g0, InterfaceC11928h0 interfaceC11928h0) {
        C11632b m1504k;
        C11632b m9738a;
        InterfaceC11914e m6652a;
        if (abstractC7264g0 == null) {
            m9825a(71);
        }
        if (interfaceC11928h0 == null) {
            m9825a(72);
        }
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p == null) {
            return null;
        }
        C10889o c10889o = C10889o.f28538a;
        if (!c10889o.m9737b(mo2788p.getName()) || (m1504k = C13801c.m1504k(mo2788p)) == null || (m9738a = c10889o.m9738a(m1504k)) == null || (m6652a = C11994x.m6652a(interfaceC11928h0, m9738a)) == null) {
            return null;
        }
        return m6652a.mo4224p();
    }

    /* renamed from: A0 */
    public static boolean m9853A0(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m9825a(10);
        }
        while (interfaceC11947m != null) {
            if (interfaceC11947m instanceof InterfaceC11945l0) {
                return ((InterfaceC11945l0) interfaceC11947m).mo4161e().m7451i(C10884k.f28427t);
            }
            interfaceC11947m = interfaceC11947m.mo4163b();
        }
        return false;
    }

    /* renamed from: B0 */
    public static boolean m9851B0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(142);
        }
        return m9803l0(abstractC7264g0, C10884k.C10885a.f28480f);
    }

    /* renamed from: C0 */
    public static boolean m9849C0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(132);
        }
        if (!m9782w0(abstractC7264g0) && !m9776z0(abstractC7264g0) && !m9780x0(abstractC7264g0) && !m9778y0(abstractC7264g0)) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public static EnumC10876i m9838N(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(92);
        }
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p == null) {
            return null;
        }
        return m9836P(mo2788p);
    }

    /* renamed from: P */
    public static EnumC10876i m9836P(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m9825a(77);
        }
        if (C10884k.C10885a.f28449H0.contains(interfaceC11947m.getName())) {
            return C10884k.C10885a.f28453J0.get(C12758e.m4099m(interfaceC11947m));
        }
        return null;
    }

    /* renamed from: Q */
    private InterfaceC11914e m9835Q(EnumC10876i enumC10876i) {
        if (enumC10876i == null) {
            m9825a(16);
        }
        return m9796p(enumC10876i.m9766e().m7426b());
    }

    /* renamed from: S */
    public static EnumC10876i m9833S(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m9825a(76);
        }
        if (C10884k.C10885a.f28447G0.contains(interfaceC11947m.getName())) {
            return C10884k.C10885a.f28451I0.get(C12758e.m4099m(interfaceC11947m));
        }
        return null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m9825a(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i2 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: a0 */
    public static boolean m9824a0(InterfaceC11914e interfaceC11914e) {
        if (interfaceC11914e == null) {
            m9825a(108);
        }
        return m9817e(interfaceC11914e, C10884k.C10885a.f28472b);
    }

    /* renamed from: b0 */
    public static boolean m9822b0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(139);
        }
        return m9813g0(abstractC7264g0, C10884k.C10885a.f28472b);
    }

    /* renamed from: c0 */
    public static boolean m9820c0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(88);
        }
        return m9813g0(abstractC7264g0, C10884k.C10885a.f28486i);
    }

    /* renamed from: d0 */
    public static boolean m9818d0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(90);
        }
        if (!m9820c0(abstractC7264g0) && !m9795p0(abstractC7264g0)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m9817e(InterfaceC11927h interfaceC11927h, C11634d c11634d) {
        if (interfaceC11927h == null) {
            m9825a(103);
        }
        if (c11634d == null) {
            m9825a(104);
        }
        if (interfaceC11927h.getName().equals(c11634d.m7440i()) && c11634d.equals(C12758e.m4099m(interfaceC11927h))) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public static boolean m9816e0(InterfaceC11914e interfaceC11914e) {
        if (interfaceC11914e == null) {
            m9825a(89);
        }
        if (!m9817e(interfaceC11914e, C10884k.C10885a.f28486i) && m9836P(interfaceC11914e) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public static boolean m9814f0(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m9825a(9);
        }
        if (C12758e.m4094r(interfaceC11947m, InterfaceC10863b.class, false) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g0 */
    private static boolean m9813g0(AbstractC7264g0 abstractC7264g0, C11634d c11634d) {
        if (abstractC7264g0 == null) {
            m9825a(97);
        }
        if (c11634d == null) {
            m9825a(98);
        }
        return m9784v0(abstractC7264g0.mo3564N0(), c11634d);
    }

    /* renamed from: h0 */
    private static boolean m9811h0(AbstractC7264g0 abstractC7264g0, C11634d c11634d) {
        if (abstractC7264g0 == null) {
            m9825a(134);
        }
        if (c11634d == null) {
            m9825a(135);
        }
        if (m9813g0(abstractC7264g0, c11634d) && !abstractC7264g0.mo3563O0()) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public static boolean m9809i0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(141);
        }
        return m9797o0(abstractC7264g0);
    }

    /* renamed from: j0 */
    public static boolean m9807j0(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m9825a(161);
        }
        if (interfaceC11947m.mo4221a().getAnnotations().mo6023q(C10884k.C10885a.f28518y)) {
            return true;
        }
        if (!(interfaceC11947m instanceof InterfaceC11989u0)) {
            return false;
        }
        InterfaceC11989u0 interfaceC11989u0 = (InterfaceC11989u0) interfaceC11947m;
        boolean mo4342L = interfaceC11989u0.mo4342L();
        InterfaceC11991v0 mo4509f = interfaceC11989u0.mo4509f();
        InterfaceC11993w0 mo4507h = interfaceC11989u0.mo4507h();
        if (mo4509f != null && m9807j0(mo4509f)) {
            if (!mo4342L) {
                return true;
            }
            if (mo4507h != null && m9807j0(mo4507h)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    public static boolean m9805k0(InterfaceC11914e interfaceC11914e) {
        if (interfaceC11914e == null) {
            m9825a(158);
        }
        return m9817e(interfaceC11914e, C10884k.C10885a.f28487i0);
    }

    /* renamed from: l0 */
    private static boolean m9803l0(AbstractC7264g0 abstractC7264g0, C11634d c11634d) {
        if (abstractC7264g0 == null) {
            m9825a(105);
        }
        if (c11634d == null) {
            m9825a(106);
        }
        if (!abstractC7264g0.mo3563O0() && m9813g0(abstractC7264g0, c11634d)) {
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    public static boolean m9801m0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(136);
        }
        if (m9799n0(abstractC7264g0) && !C7320s1.m20983l(abstractC7264g0)) {
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    public static boolean m9799n0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(138);
        }
        return m9813g0(abstractC7264g0, C10884k.C10885a.f28474c);
    }

    /* renamed from: o0 */
    public static boolean m9797o0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(140);
        }
        if (m9822b0(abstractC7264g0) && abstractC7264g0.mo3563O0()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private InterfaceC11914e m9796p(String str) {
        if (str == null) {
            m9825a(14);
        }
        InterfaceC11914e invoke = this.f28366e.invoke(C11638f.m7422f(str));
        if (invoke == null) {
            m9825a(15);
        }
        return invoke;
    }

    /* renamed from: p0 */
    public static boolean m9795p0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(91);
        }
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p != null && m9836P(mo2788p) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public AbstractC7302o0 m9794q(String str) {
        if (str == null) {
            m9825a(46);
        }
        AbstractC7302o0 mo4224p = m9796p(str).mo4224p();
        if (mo4224p == null) {
            m9825a(47);
        }
        return mo4224p;
    }

    /* renamed from: q0 */
    public static boolean m9793q0(InterfaceC11914e interfaceC11914e) {
        if (interfaceC11914e == null) {
            m9825a(96);
        }
        if (m9833S(interfaceC11914e) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public static boolean m9791r0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(94);
        }
        if (!abstractC7264g0.mo3563O0() && m9789s0(abstractC7264g0)) {
            return true;
        }
        return false;
    }

    /* renamed from: s0 */
    public static boolean m9789s0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(95);
        }
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if ((mo2788p instanceof InterfaceC11914e) && m9793q0((InterfaceC11914e) mo2788p)) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public static boolean m9787t0(InterfaceC11914e interfaceC11914e) {
        if (interfaceC11914e == null) {
            m9825a(107);
        }
        if (!m9817e(interfaceC11914e, C10884k.C10885a.f28472b) && !m9817e(interfaceC11914e, C10884k.C10885a.f28474c)) {
            return false;
        }
        return true;
    }

    /* renamed from: u0 */
    public static boolean m9785u0(AbstractC7264g0 abstractC7264g0) {
        return abstractC7264g0 != null && m9803l0(abstractC7264g0, C10884k.C10885a.f28484h);
    }

    /* renamed from: v0 */
    public static boolean m9784v0(InterfaceC7265g1 interfaceC7265g1, C11634d c11634d) {
        if (interfaceC7265g1 == null) {
            m9825a(101);
        }
        if (c11634d == null) {
            m9825a(102);
        }
        InterfaceC11927h mo2788p = interfaceC7265g1.mo2788p();
        if ((mo2788p instanceof InterfaceC11914e) && m9817e(mo2788p, c11634d)) {
            return true;
        }
        return false;
    }

    /* renamed from: w0 */
    public static boolean m9782w0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(128);
        }
        return m9811h0(abstractC7264g0, C10884k.C10885a.f28439C0.m7450j());
    }

    /* renamed from: x0 */
    public static boolean m9780x0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(130);
        }
        return m9811h0(abstractC7264g0, C10884k.C10885a.f28443E0.m7450j());
    }

    /* renamed from: y0 */
    public static boolean m9778y0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(131);
        }
        return m9811h0(abstractC7264g0, C10884k.C10885a.f28445F0.m7450j());
    }

    /* renamed from: z0 */
    public static boolean m9776z0(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m9825a(129);
        }
        return m9811h0(abstractC7264g0, C10884k.C10885a.f28441D0.m7450j());
    }

    /* renamed from: B */
    public AbstractC7302o0 m9852B() {
        AbstractC7302o0 m9834R = m9834R(EnumC10876i.FLOAT);
        if (m9834R == null) {
            m9825a(60);
        }
        return m9834R;
    }

    /* renamed from: C */
    public InterfaceC11914e m9850C(int i) {
        return m9796p(C10884k.m9755b(i));
    }

    /* renamed from: D */
    public AbstractC7302o0 m9848D() {
        AbstractC7302o0 m9834R = m9834R(EnumC10876i.INT);
        if (m9834R == null) {
            m9825a(58);
        }
        return m9834R;
    }

    /* renamed from: D0 */
    public void m9847D0(C12744x c12744x) {
        if (c12744x == null) {
            m9825a(1);
        }
        this.f28367f.mo21866d(new C10874d(c12744x));
    }

    /* renamed from: E */
    public InterfaceC11914e m9846E() {
        InterfaceC11914e m9798o = m9798o(C10884k.C10885a.f28487i0.m7437l());
        if (m9798o == null) {
            m9825a(21);
        }
        return m9798o;
    }

    /* renamed from: F */
    public AbstractC7302o0 m9845F() {
        AbstractC7302o0 m9834R = m9834R(EnumC10876i.LONG);
        if (m9834R == null) {
            m9825a(59);
        }
        return m9834R;
    }

    /* renamed from: G */
    public InterfaceC11914e m9844G() {
        return m9796p("Nothing");
    }

    /* renamed from: H */
    public AbstractC7302o0 m9843H() {
        AbstractC7302o0 mo4224p = m9844G().mo4224p();
        if (mo4224p == null) {
            m9825a(48);
        }
        return mo4224p;
    }

    /* renamed from: I */
    public AbstractC7302o0 m9842I() {
        AbstractC7302o0 mo3558U0 = m9810i().mo3558U0(true);
        if (mo3558U0 == null) {
            m9825a(51);
        }
        return mo3558U0;
    }

    /* renamed from: J */
    public AbstractC7302o0 m9841J() {
        AbstractC7302o0 mo3558U0 = m9843H().mo3558U0(true);
        if (mo3558U0 == null) {
            m9825a(49);
        }
        return mo3558U0;
    }

    /* renamed from: K */
    public InterfaceC11914e m9840K() {
        return m9796p("Number");
    }

    /* renamed from: L */
    public AbstractC7302o0 m9839L() {
        AbstractC7302o0 mo4224p = m9840K().mo4224p();
        if (mo4224p == null) {
            m9825a(55);
        }
        return mo4224p;
    }

    /* renamed from: M */
    protected InterfaceC12474c mo7522M() {
        InterfaceC12474c.C12476b c12476b = InterfaceC12474c.C12476b.f32423a;
        if (c12476b == null) {
            m9825a(4);
        }
        return c12476b;
    }

    /* renamed from: O */
    public AbstractC7302o0 m9837O(EnumC10876i enumC10876i) {
        if (enumC10876i == null) {
            m9825a(73);
        }
        AbstractC7302o0 abstractC7302o0 = this.f28364c.invoke().f28373a.get(enumC10876i);
        if (abstractC7302o0 == null) {
            m9825a(74);
        }
        return abstractC7302o0;
    }

    /* renamed from: R */
    public AbstractC7302o0 m9834R(EnumC10876i enumC10876i) {
        if (enumC10876i == null) {
            m9825a(53);
        }
        AbstractC7302o0 mo4224p = m9835Q(enumC10876i).mo4224p();
        if (mo4224p == null) {
            m9825a(54);
        }
        return mo4224p;
    }

    /* renamed from: T */
    public AbstractC7302o0 m9832T() {
        AbstractC7302o0 m9834R = m9834R(EnumC10876i.SHORT);
        if (m9834R == null) {
            m9825a(57);
        }
        return m9834R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public InterfaceC6821n m9831U() {
        InterfaceC6821n interfaceC6821n = this.f28367f;
        if (interfaceC6821n == null) {
            m9825a(6);
        }
        return interfaceC6821n;
    }

    /* renamed from: V */
    public InterfaceC11914e m9830V() {
        return m9796p("String");
    }

    /* renamed from: W */
    public AbstractC7302o0 m9829W() {
        AbstractC7302o0 mo4224p = m9830V().mo4224p();
        if (mo4224p == null) {
            m9825a(65);
        }
        return mo4224p;
    }

    /* renamed from: X */
    public InterfaceC11914e m9828X(int i) {
        InterfaceC11914e m9798o = m9798o(C10884k.f28420m.m7457c(C11638f.m7422f(C10884k.m9753d(i))));
        if (m9798o == null) {
            m9825a(18);
        }
        return m9798o;
    }

    /* renamed from: Y */
    public InterfaceC11914e m9827Y() {
        return m9796p("Unit");
    }

    /* renamed from: Z */
    public AbstractC7302o0 m9826Z() {
        AbstractC7302o0 mo4224p = m9827Y().mo4224p();
        if (mo4224p == null) {
            m9825a(64);
        }
        return mo4224p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m9815f(boolean z) {
        C12744x c12744x = new C12744x(f28361g, this.f28367f, this, null);
        this.f28362a = c12744x;
        c12744x.m4201S0(InterfaceC10860a.f28353a.m9881a().mo9882a(this.f28367f, this.f28362a, mo7520v(), mo7522M(), mo7521g(), z));
        C12744x c12744x2 = this.f28362a;
        c12744x2.m4195Y0(c12744x2);
    }

    /* renamed from: g */
    protected InterfaceC12471a mo7521g() {
        InterfaceC12471a.C12472a c12472a = InterfaceC12471a.C12472a.f32421a;
        if (c12472a == null) {
            m9825a(3);
        }
        return c12472a;
    }

    /* renamed from: h */
    public InterfaceC11914e m9812h() {
        return m9796p("Any");
    }

    /* renamed from: i */
    public AbstractC7302o0 m9810i() {
        AbstractC7302o0 mo4224p = m9812h().mo4224p();
        if (mo4224p == null) {
            m9825a(50);
        }
        return mo4224p;
    }

    /* renamed from: j */
    public InterfaceC11914e m9808j() {
        return m9796p("Array");
    }

    /* renamed from: k */
    public AbstractC7264g0 m9806k(AbstractC7264g0 abstractC7264g0) {
        AbstractC7264g0 m9854A;
        if (abstractC7264g0 == null) {
            m9825a(67);
        }
        if (m9820c0(abstractC7264g0)) {
            if (abstractC7264g0.mo3566L0().size() == 1) {
                AbstractC7264g0 type = abstractC7264g0.mo3566L0().get(0).getType();
                if (type == null) {
                    m9825a(68);
                }
                return type;
            }
            throw new IllegalStateException();
        }
        AbstractC7264g0 m20981n = C7320s1.m20981n(abstractC7264g0);
        AbstractC7302o0 abstractC7302o0 = this.f28364c.invoke().f28375c.get(m20981n);
        if (abstractC7302o0 != null) {
            return abstractC7302o0;
        }
        InterfaceC11928h0 m4104h = C12758e.m4104h(m20981n);
        if (m4104h != null && (m9854A = m9854A(m20981n, m4104h)) != null) {
            return m9854A;
        }
        throw new IllegalStateException("not array: " + abstractC7264g0);
    }

    /* renamed from: l */
    public AbstractC7302o0 m9804l(EnumC7336w1 enumC7336w1, AbstractC7264g0 abstractC7264g0) {
        if (enumC7336w1 == null) {
            m9825a(82);
        }
        if (abstractC7264g0 == null) {
            m9825a(83);
        }
        AbstractC7302o0 m9802m = m9802m(enumC7336w1, abstractC7264g0, InterfaceC12155g.f31603f.m6037b());
        if (m9802m == null) {
            m9825a(84);
        }
        return m9802m;
    }

    /* renamed from: m */
    public AbstractC7302o0 m9802m(EnumC7336w1 enumC7336w1, AbstractC7264g0 abstractC7264g0, InterfaceC12155g interfaceC12155g) {
        if (enumC7336w1 == null) {
            m9825a(78);
        }
        if (abstractC7264g0 == null) {
            m9825a(79);
        }
        if (interfaceC12155g == null) {
            m9825a(80);
        }
        AbstractC7302o0 m21101g = C7267h0.m21101g(C7230d1.m21188b(interfaceC12155g), m9808j(), Collections.singletonList(new C7294m1(enumC7336w1, abstractC7264g0)));
        if (m21101g == null) {
            m9825a(81);
        }
        return m21101g;
    }

    /* renamed from: n */
    public AbstractC7302o0 m9800n() {
        AbstractC7302o0 m9834R = m9834R(EnumC10876i.BOOLEAN);
        if (m9834R == null) {
            m9825a(63);
        }
        return m9834R;
    }

    /* renamed from: o */
    public InterfaceC11914e m9798o(C11633c c11633c) {
        if (c11633c == null) {
            m9825a(12);
        }
        InterfaceC11914e m6682c = C11972s.m6682c(m9792r(), c11633c, EnumC14023d.FROM_BUILTINS);
        if (m6682c == null) {
            m9825a(13);
        }
        return m6682c;
    }

    /* renamed from: r */
    public C12744x m9792r() {
        if (this.f28362a == null) {
            this.f28362a = this.f28363b.invoke();
        }
        C12744x c12744x = this.f28362a;
        if (c12744x == null) {
            m9825a(7);
        }
        return c12744x;
    }

    /* renamed from: s */
    public InterfaceC0194h m9790s() {
        InterfaceC0194h mo4237o = m9792r().mo4210H0(C10884k.f28428u).mo4237o();
        if (mo4237o == null) {
            m9825a(11);
        }
        return mo4237o;
    }

    /* renamed from: t */
    public AbstractC7302o0 m9788t() {
        AbstractC7302o0 m9834R = m9834R(EnumC10876i.BYTE);
        if (m9834R == null) {
            m9825a(56);
        }
        return m9834R;
    }

    /* renamed from: u */
    public AbstractC7302o0 m9786u() {
        AbstractC7302o0 m9834R = m9834R(EnumC10876i.CHAR);
        if (m9834R == null) {
            m9825a(62);
        }
        return m9834R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public Iterable<InterfaceC12473b> mo7520v() {
        List singletonList = Collections.singletonList(new C11097a(this.f28367f, m9792r()));
        if (singletonList == null) {
            m9825a(5);
        }
        return singletonList;
    }

    /* renamed from: w */
    public InterfaceC11914e m9783w() {
        InterfaceC11914e m9798o = m9798o(C10884k.C10885a.f28464U);
        if (m9798o == null) {
            m9825a(34);
        }
        return m9798o;
    }

    /* renamed from: x */
    public InterfaceC11914e m9781x() {
        return m9796p("Comparable");
    }

    /* renamed from: y */
    public AbstractC7302o0 m9779y() {
        AbstractC7302o0 m9842I = m9842I();
        if (m9842I == null) {
            m9825a(52);
        }
        return m9842I;
    }

    /* renamed from: z */
    public AbstractC7302o0 m9777z() {
        AbstractC7302o0 m9834R = m9834R(EnumC10876i.DOUBLE);
        if (m9834R == null) {
            m9825a(61);
        }
        return m9834R;
    }
}
