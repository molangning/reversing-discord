package p218lg;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import kg.C9258h0;
import kg.C9336p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.C7320s1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11943k1;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11997x0;
import p429xh.C13801c;
import th.C12762g;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\rH\u0000\u001a\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u0004\u0018\u00010\u000fH\u0000\u001a\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\"\u001a\u0010\u0015\u001a\u0004\u0018\u00010\r*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m14357d2 = {"Ljava/lang/reflect/Member;", "M", "Llg/e;", "Lqg/b;", "descriptor", "", "isDefault", "b", "g", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "f", "d", "Lhi/g0;", "h", "Lqg/m;", "i", "", "a", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: lg.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10183i {
    /* renamed from: a */
    public static final Object m12151a(Object obj, InterfaceC11902b descriptor) {
        Class<?> m12144h;
        Method m12146f;
        C9612q.m13917h(descriptor, "descriptor");
        if ((descriptor instanceof InterfaceC11989u0) && C12762g.m4082d((InterfaceC11943k1) descriptor)) {
            return obj;
        }
        AbstractC7264g0 m12147e = m12147e(descriptor);
        if (m12147e != null && (m12144h = m12144h(m12147e)) != null && (m12146f = m12146f(m12144h, descriptor)) != null) {
            return m12146f.invoke(obj, new Object[0]);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <M extends Member> InterfaceC10153e<M> m12150b(InterfaceC10153e<? extends M> interfaceC10153e, InterfaceC11902b descriptor, boolean z) {
        boolean z2;
        boolean z3;
        C9612q.m13917h(interfaceC10153e, "<this>");
        C9612q.m13917h(descriptor, "descriptor");
        boolean z4 = true;
        if (!C12762g.m4085a(descriptor)) {
            List<InterfaceC11936j1> mo4301i = descriptor.mo4301i();
            C9612q.m13918g(mo4301i, "descriptor.valueParameters");
            if (!(mo4301i instanceof Collection) || !mo4301i.isEmpty()) {
                for (InterfaceC11936j1 interfaceC11936j1 : mo4301i) {
                    AbstractC7264g0 type = interfaceC11936j1.getType();
                    C9612q.m13918g(type, "it.type");
                    if (C12762g.m4083c(type)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                AbstractC7264g0 returnType = descriptor.getReturnType();
                if (returnType != null && C12762g.m4083c(returnType)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && ((interfaceC10153e instanceof InterfaceC10152d) || !m12145g(descriptor))) {
                    z4 = false;
                }
            }
        }
        if (z4) {
            return new C10181h(descriptor, interfaceC10153e, z);
        }
        return interfaceC10153e;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC10153e m12149c(InterfaceC10153e interfaceC10153e, InterfaceC11902b interfaceC11902b, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m12150b(interfaceC10153e, interfaceC11902b, z);
    }

    /* renamed from: d */
    public static final Method m12148d(Class<?> cls, InterfaceC11902b descriptor) {
        C9612q.m13917h(cls, "<this>");
        C9612q.m13917h(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", m12146f(cls, descriptor).getReturnType());
            C9612q.m13918g(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C9258h0("No box method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    /* renamed from: e */
    private static final AbstractC7264g0 m12147e(InterfaceC11902b interfaceC11902b) {
        InterfaceC11914e interfaceC11914e;
        InterfaceC11997x0 mo4329M = interfaceC11902b.mo4329M();
        InterfaceC11997x0 mo4332I = interfaceC11902b.mo4332I();
        if (mo4329M != null) {
            return mo4329M.getType();
        }
        if (mo4332I != null) {
            if (interfaceC11902b instanceof InterfaceC11944l) {
                return mo4332I.getType();
            }
            InterfaceC11947m mo4163b = interfaceC11902b.mo4163b();
            if (mo4163b instanceof InterfaceC11914e) {
                interfaceC11914e = (InterfaceC11914e) mo4163b;
            } else {
                interfaceC11914e = null;
            }
            if (interfaceC11914e != null) {
                return interfaceC11914e.mo4224p();
            }
        }
        return null;
    }

    /* renamed from: f */
    public static final Method m12146f(Class<?> cls, InterfaceC11902b descriptor) {
        C9612q.m13917h(cls, "<this>");
        C9612q.m13917h(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            C9612q.m13918g(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C9258h0("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    /* renamed from: g */
    private static final boolean m12145g(InterfaceC11902b interfaceC11902b) {
        AbstractC7264g0 m12147e = m12147e(interfaceC11902b);
        return m12147e != null && C12762g.m4083c(m12147e);
    }

    /* renamed from: h */
    public static final Class<?> m12144h(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        Class<?> m12143i = m12143i(abstractC7264g0.mo3564N0().mo2788p());
        if (m12143i == null) {
            return null;
        }
        if (!C7320s1.m20983l(abstractC7264g0)) {
            return m12143i;
        }
        AbstractC7264g0 m4081e = C12762g.m4081e(abstractC7264g0);
        if (m4081e == null || C7320s1.m20983l(m4081e) || AbstractC10870h.m9791r0(m4081e)) {
            return null;
        }
        return m12143i;
    }

    /* renamed from: i */
    public static final Class<?> m12143i(InterfaceC11947m interfaceC11947m) {
        if ((interfaceC11947m instanceof InterfaceC11914e) && C12762g.m4084b(interfaceC11947m)) {
            InterfaceC11914e interfaceC11914e = (InterfaceC11914e) interfaceC11947m;
            Class<?> m15844p = C9336p0.m15844p(interfaceC11914e);
            if (m15844p == null) {
                throw new C9258h0("Class object for the class " + interfaceC11914e.getName() + " cannot be found (classId=" + C13801c.m1504k((InterfaceC11927h) interfaceC11947m) + ')');
            }
            return m15844p;
        }
        return null;
    }
}