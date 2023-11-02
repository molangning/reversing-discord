package th;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p305qg.C12004z;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11943k1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11991v0;
import p429xh.C13801c;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;

/* renamed from: th.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12762g {

    /* renamed from: a */
    private static final C11633c f33109a;

    /* renamed from: b */
    private static final C11632b f33110b;

    static {
        C11633c c11633c = new C11633c("kotlin.jvm.JvmInline");
        f33109a = c11633c;
        C11632b m7460m = C11632b.m7460m(c11633c);
        C9612q.m13918g(m7460m, "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
        f33110b = m7460m;
    }

    /* renamed from: a */
    public static final boolean m4085a(InterfaceC11897a interfaceC11897a) {
        C9612q.m13917h(interfaceC11897a, "<this>");
        if (interfaceC11897a instanceof InterfaceC11991v0) {
            InterfaceC11989u0 correspondingProperty = ((InterfaceC11991v0) interfaceC11897a).mo4535S();
            C9612q.m13918g(correspondingProperty, "correspondingProperty");
            if (m4082d(correspondingProperty)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m4084b(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        if ((interfaceC11947m instanceof InterfaceC11914e) && (((InterfaceC11914e) interfaceC11947m).mo4179R() instanceof C12004z)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m4083c(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p != null) {
            return m4084b(mo2788p);
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m4082d(InterfaceC11943k1 interfaceC11943k1) {
        InterfaceC11914e interfaceC11914e;
        C12004z<AbstractC7302o0> m1501n;
        C9612q.m13917h(interfaceC11943k1, "<this>");
        if (interfaceC11943k1.mo4329M() == null) {
            InterfaceC11947m mo4163b = interfaceC11943k1.mo4163b();
            C11638f c11638f = null;
            if (mo4163b instanceof InterfaceC11914e) {
                interfaceC11914e = (InterfaceC11914e) mo4163b;
            } else {
                interfaceC11914e = null;
            }
            if (interfaceC11914e != null && (m1501n = C13801c.m1501n(interfaceC11914e)) != null) {
                c11638f = m1501n.m6638c();
            }
            if (C9612q.m13922c(c11638f, interfaceC11943k1.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final AbstractC7264g0 m4081e(AbstractC7264g0 abstractC7264g0) {
        C12004z<AbstractC7302o0> m1501n;
        C9612q.m13917h(abstractC7264g0, "<this>");
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (!(mo2788p instanceof InterfaceC11914e)) {
            mo2788p = null;
        }
        InterfaceC11914e interfaceC11914e = (InterfaceC11914e) mo2788p;
        if (interfaceC11914e == null || (m1501n = C13801c.m1501n(interfaceC11914e)) == null) {
            return null;
        }
        return m1501n.m6637d();
    }
}