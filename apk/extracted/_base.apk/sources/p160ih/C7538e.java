package p160ih;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import ng.AbstractC10870h;
import ng.C10869g;
import ng.C10886l;
import p142hi.AbstractC7264g0;
import p142hi.C7239f0;
import p142hi.C7320s1;
import p142hi.C7344z;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p161ii.C7608q;
import p183ji.C8967k;
import p234mi.C10472a;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11991v0;
import p327ri.C12251d;
import ph.C11633c;
import ph.C11640h;
import th.C12762g;

/* renamed from: ih.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7538e {
    /* renamed from: a */
    public static final String m20469a(InterfaceC11914e klass, InterfaceC7580z<?> typeMappingConfiguration) {
        InterfaceC11914e interfaceC11914e;
        String m13763C;
        C9612q.m13917h(klass, "klass");
        C9612q.m13917h(typeMappingConfiguration, "typeMappingConfiguration");
        String mo20366c = typeMappingConfiguration.mo20366c(klass);
        if (mo20366c != null) {
            return mo20366c;
        }
        InterfaceC11947m mo4163b = klass.mo4163b();
        C9612q.m13918g(mo4163b, "klass.containingDeclaration");
        String m7424d = C11640h.m7416b(klass.getName()).m7424d();
        C9612q.m13918g(m7424d, "safeIdentifier(klass.name).identifier");
        if (mo4163b instanceof InterfaceC11945l0) {
            C11633c mo4161e = ((InterfaceC11945l0) mo4163b).mo4161e();
            if (!mo4161e.m7456d()) {
                StringBuilder sb2 = new StringBuilder();
                String m7458b = mo4161e.m7458b();
                C9612q.m13918g(m7458b, "fqName.asString()");
                m13763C = C9653o.m13763C(m7458b, '.', '/', false, 4, null);
                sb2.append(m13763C);
                sb2.append('/');
                sb2.append(m7424d);
                return sb2.toString();
            }
            return m7424d;
        }
        if (mo4163b instanceof InterfaceC11914e) {
            interfaceC11914e = (InterfaceC11914e) mo4163b;
        } else {
            interfaceC11914e = null;
        }
        if (interfaceC11914e != null) {
            String mo20368a = typeMappingConfiguration.mo20368a(interfaceC11914e);
            if (mo20368a == null) {
                mo20368a = m20469a(interfaceC11914e, typeMappingConfiguration);
            }
            return mo20368a + '$' + m7424d;
        }
        throw new IllegalArgumentException("Unexpected container: " + mo4163b + " for " + klass);
    }

    /* renamed from: b */
    public static /* synthetic */ String m20468b(InterfaceC11914e interfaceC11914e, InterfaceC7580z interfaceC7580z, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC7580z = C7521a0.f20776a;
        }
        return m20469a(interfaceC11914e, interfaceC7580z);
    }

    /* renamed from: c */
    public static final boolean m20467c(InterfaceC11897a descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        if (descriptor instanceof InterfaceC11944l) {
            return true;
        }
        AbstractC7264g0 returnType = descriptor.getReturnType();
        C9612q.m13920e(returnType);
        if (AbstractC10870h.m9851B0(returnType)) {
            AbstractC7264g0 returnType2 = descriptor.getReturnType();
            C9612q.m13920e(returnType2);
            if (!C7320s1.m20983l(returnType2) && !(descriptor instanceof InterfaceC11991v0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, java.lang.Object] */
    /* renamed from: d */
    public static final <T> T m20466d(AbstractC7264g0 kotlinType, InterfaceC7556n<T> factory, C7527b0 mode, InterfaceC7580z<? extends T> typeMappingConfiguration, C7549k<T> c7549k, Function3<? super AbstractC7264g0, ? super T, ? super C7527b0, Unit> writeGenericType) {
        Object obj;
        AbstractC7264g0 abstractC7264g0;
        Object m20466d;
        C9612q.m13917h(kotlinType, "kotlinType");
        C9612q.m13917h(factory, "factory");
        C9612q.m13917h(mode, "mode");
        C9612q.m13917h(typeMappingConfiguration, "typeMappingConfiguration");
        C9612q.m13917h(writeGenericType, "writeGenericType");
        AbstractC7264g0 mo20365d = typeMappingConfiguration.mo20365d(kotlinType);
        if (mo20365d != null) {
            return (T) m20466d(mo20365d, factory, mode, typeMappingConfiguration, c7549k, writeGenericType);
        }
        if (C10869g.m9858q(kotlinType)) {
            return (T) m20466d(C10886l.m9745a(kotlinType), factory, mode, typeMappingConfiguration, c7549k, writeGenericType);
        }
        C7608q c7608q = C7608q.f20908a;
        Object m20483b = C7531c0.m20483b(c7608q, kotlinType, factory, mode);
        if (m20483b != null) {
            ?? r9 = (Object) C7531c0.m20484a(factory, m20483b, mode.m20490d());
            writeGenericType.invoke(kotlinType, r9, mode);
            return r9;
        }
        InterfaceC7265g1 mo3564N0 = kotlinType.mo3564N0();
        if (mo3564N0 instanceof C7239f0) {
            C7239f0 c7239f0 = (C7239f0) mo3564N0;
            AbstractC7264g0 m21155e = c7239f0.m21155e();
            if (m21155e == null) {
                m21155e = typeMappingConfiguration.mo20364e(c7239f0.mo2791m());
            }
            return (T) m20466d(C10472a.m11435w(m21155e), factory, mode, typeMappingConfiguration, c7549k, writeGenericType);
        }
        InterfaceC11927h mo2788p = mo3564N0.mo2788p();
        if (mo2788p != null) {
            if (C8967k.m16936m(mo2788p)) {
                T t = (T) factory.mo20412e("error/NonExistentClass");
                typeMappingConfiguration.mo20363f(kotlinType, (InterfaceC11914e) mo2788p);
                return t;
            }
            boolean z = mo2788p instanceof InterfaceC11914e;
            if (z && AbstractC10870h.m9820c0(kotlinType)) {
                if (kotlinType.mo3566L0().size() == 1) {
                    InterfaceC7288k1 interfaceC7288k1 = kotlinType.mo3566L0().get(0);
                    AbstractC7264g0 type = interfaceC7288k1.getType();
                    C9612q.m13918g(type, "memberProjection.type");
                    if (interfaceC7288k1.mo20954b() == EnumC7336w1.IN_VARIANCE) {
                        m20466d = factory.mo20412e("java/lang/Object");
                    } else {
                        EnumC7336w1 mo20954b = interfaceC7288k1.mo20954b();
                        C9612q.m13918g(mo20954b, "memberProjection.projectionKind");
                        m20466d = m20466d(type, factory, mode.m20488f(mo20954b, true), typeMappingConfiguration, c7549k, writeGenericType);
                    }
                    return (T) factory.mo20416a('[' + factory.mo20413d(m20466d));
                }
                throw new UnsupportedOperationException("arrays must have one type argument");
            } else if (z) {
                if (C12762g.m4084b(mo2788p) && !mode.m20491c() && (abstractC7264g0 = (AbstractC7264g0) C7344z.m20904a(c7608q, kotlinType)) != null) {
                    return (T) m20466d(abstractC7264g0, factory, mode.m20487g(), typeMappingConfiguration, c7549k, writeGenericType);
                }
                if (mode.m20489e() && AbstractC10870h.m9805k0((InterfaceC11914e) mo2788p)) {
                    obj = (Object) factory.mo20411f();
                } else {
                    InterfaceC11914e interfaceC11914e = (InterfaceC11914e) mo2788p;
                    InterfaceC11914e mo4221a = interfaceC11914e.mo4221a();
                    C9612q.m13918g(mo4221a, "descriptor.original");
                    T mo20367b = typeMappingConfiguration.mo20367b(mo4221a);
                    if (mo20367b == null) {
                        if (interfaceC11914e.mo4175g() == EnumC11918f.ENUM_ENTRY) {
                            InterfaceC11947m mo4163b = interfaceC11914e.mo4163b();
                            C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            interfaceC11914e = (InterfaceC11914e) mo4163b;
                        }
                        InterfaceC11914e mo4221a2 = interfaceC11914e.mo4221a();
                        C9612q.m13918g(mo4221a2, "enumClassIfEnumEntry.original");
                        obj = (Object) factory.mo20412e(m20469a(mo4221a2, typeMappingConfiguration));
                    } else {
                        obj = (Object) mo20367b;
                    }
                }
                writeGenericType.invoke(kotlinType, obj, mode);
                return (T) obj;
            } else if (mo2788p instanceof InterfaceC11920f1) {
                AbstractC7264g0 m11448j = C10472a.m11448j((InterfaceC11920f1) mo2788p);
                if (kotlinType.mo3563O0()) {
                    m11448j = C10472a.m11437u(m11448j);
                }
                return (T) m20466d(m11448j, factory, mode, typeMappingConfiguration, null, C12251d.m5657b());
            } else if ((mo2788p instanceof InterfaceC11917e1) && mode.m20492b()) {
                return (T) m20466d(((InterfaceC11917e1) mo2788p).mo6721F(), factory, mode, typeMappingConfiguration, c7549k, writeGenericType);
            } else {
                throw new UnsupportedOperationException("Unknown type " + kotlinType);
            }
        }
        throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m20465e(AbstractC7264g0 abstractC7264g0, InterfaceC7556n interfaceC7556n, C7527b0 c7527b0, InterfaceC7580z interfaceC7580z, C7549k c7549k, Function3 function3, int i, Object obj) {
        if ((i & 32) != 0) {
            function3 = C12251d.m5657b();
        }
        return m20466d(abstractC7264g0, interfaceC7556n, c7527b0, interfaceC7580z, c7549k, function3);
    }
}
