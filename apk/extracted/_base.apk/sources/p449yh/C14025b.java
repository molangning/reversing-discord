package p449yh;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import p142hi.AbstractC7264g0;
import p234mi.C10472a;
import p305qg.C11974t;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11947m;
import p429xh.C13801c;
import th.C12758e;
import th.C12762g;

/* renamed from: yh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C14025b {
    /* renamed from: a */
    private static final boolean m895a(InterfaceC11914e interfaceC11914e) {
        return C9612q.m13922c(C13801c.m1503l(interfaceC11914e), C10884k.f28424q);
    }

    /* renamed from: b */
    public static final boolean m894b(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p == null || !m893c(mo2788p)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m893c(InterfaceC11947m interfaceC11947m) {
        C9612q.m13917h(interfaceC11947m, "<this>");
        if (C12762g.m4084b(interfaceC11947m) && !m895a((InterfaceC11914e) interfaceC11947m)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static final boolean m892d(AbstractC7264g0 abstractC7264g0) {
        InterfaceC11920f1 interfaceC11920f1;
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p instanceof InterfaceC11920f1) {
            interfaceC11920f1 = (InterfaceC11920f1) mo2788p;
        } else {
            interfaceC11920f1 = null;
        }
        if (interfaceC11920f1 == null) {
            return false;
        }
        return m891e(C10472a.m11448j(interfaceC11920f1));
    }

    /* renamed from: e */
    private static final boolean m891e(AbstractC7264g0 abstractC7264g0) {
        return m894b(abstractC7264g0) || m892d(abstractC7264g0);
    }

    /* renamed from: f */
    public static final boolean m890f(InterfaceC11902b descriptor) {
        InterfaceC11910d interfaceC11910d;
        C9612q.m13917h(descriptor, "descriptor");
        if (descriptor instanceof InterfaceC11910d) {
            interfaceC11910d = (InterfaceC11910d) descriptor;
        } else {
            interfaceC11910d = null;
        }
        if (interfaceC11910d == null || C11974t.m6672g(interfaceC11910d.getVisibility())) {
            return false;
        }
        InterfaceC11914e mo4418b0 = interfaceC11910d.mo4418b0();
        C9612q.m13918g(mo4418b0, "constructorDescriptor.constructedClass");
        if (C12762g.m4084b(mo4418b0) || C12758e.m4118G(interfaceC11910d.mo4418b0())) {
            return false;
        }
        List<InterfaceC11936j1> mo4301i = interfaceC11910d.mo4301i();
        C9612q.m13918g(mo4301i, "constructorDescriptor.valueParameters");
        if ((mo4301i instanceof Collection) && mo4301i.isEmpty()) {
            return false;
        }
        for (InterfaceC11936j1 interfaceC11936j1 : mo4301i) {
            AbstractC7264g0 type = interfaceC11936j1.getType();
            C9612q.m13918g(type, "it.type");
            if (m891e(type)) {
                return true;
            }
        }
        return false;
    }
}
