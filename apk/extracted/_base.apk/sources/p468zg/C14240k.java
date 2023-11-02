package p468zg;

import ng.C10864c;
import ng.C10865d;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11992w;
import th.C12758e;

/* renamed from: zg.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14240k {
    /* renamed from: a */
    private static /* synthetic */ void m336a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static boolean m335b(InterfaceC11902b interfaceC11902b) {
        InterfaceC11992w mo4505w0;
        if (interfaceC11902b == null) {
            m336a(3);
        }
        if ((interfaceC11902b instanceof InterfaceC11989u0) && (mo4505w0 = ((InterfaceC11989u0) interfaceC11902b).mo4505w0()) != null && mo4505w0.getAnnotations().mo6023q(C14206a0.f36520b)) {
            return true;
        }
        return interfaceC11902b.getAnnotations().mo6023q(C14206a0.f36520b);
    }

    /* renamed from: c */
    public static boolean m334c(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m == null) {
            m336a(1);
        }
        if (C12758e.m4088x(interfaceC11947m) && C12758e.m4089w(interfaceC11947m.mo4163b()) && !m333d((InterfaceC11914e) interfaceC11947m)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m333d(InterfaceC11914e interfaceC11914e) {
        if (interfaceC11914e == null) {
            m336a(2);
        }
        return C10865d.m9877a(C10864c.f28357a, interfaceC11914e);
    }

    /* renamed from: e */
    public static boolean m332e(InterfaceC11989u0 interfaceC11989u0) {
        if (interfaceC11989u0 == null) {
            m336a(0);
        }
        if (interfaceC11989u0.mo4305g() == InterfaceC11902b.EnumC11903a.FAKE_OVERRIDE) {
            return false;
        }
        if (m334c(interfaceC11989u0.mo4163b())) {
            return true;
        }
        if (!C12758e.m4088x(interfaceC11989u0.mo4163b()) || !m335b(interfaceC11989u0)) {
            return false;
        }
        return true;
    }
}
