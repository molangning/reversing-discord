package p160ih;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10200i;
import li.InterfaceC10205n;
import ng.EnumC10876i;
import p141hh.C7215s;
import p142hi.InterfaceC7314q1;
import p449yh.C14027d;
import p449yh.EnumC14028e;
import pg.C11599c;
import ph.C11632b;
import ph.C11634d;

/* renamed from: ih.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7531c0 {
    /* renamed from: a */
    public static final <T> T m20484a(InterfaceC7556n<T> interfaceC7556n, T possiblyPrimitiveType, boolean z) {
        C9612q.m13917h(interfaceC7556n, "<this>");
        C9612q.m13917h(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (z) {
            return interfaceC7556n.mo20414c(possiblyPrimitiveType);
        }
        return possiblyPrimitiveType;
    }

    /* renamed from: b */
    public static final <T> T m20483b(InterfaceC7314q1 interfaceC7314q1, InterfaceC10200i type, InterfaceC7556n<T> typeFactory, C7527b0 mode) {
        EnumC10876i mo3993T;
        C11632b c11632b;
        C9612q.m13917h(interfaceC7314q1, "<this>");
        C9612q.m13917h(type, "type");
        C9612q.m13917h(typeFactory, "typeFactory");
        C9612q.m13917h(mode, "mode");
        InterfaceC10205n mo3950s = interfaceC7314q1.mo3950s(type);
        if (!interfaceC7314q1.mo3952r(mo3950s)) {
            return null;
        }
        EnumC10876i mo3985a0 = interfaceC7314q1.mo3985a0(mo3950s);
        boolean z = true;
        if (mo3985a0 != null) {
            T mo20415b = typeFactory.mo20415b(mo3985a0);
            if (!interfaceC7314q1.mo3942w(type) && !C7215s.m21226c(interfaceC7314q1, type)) {
                z = false;
            }
            return (T) m20484a(typeFactory, mo20415b, z);
        }
        if (interfaceC7314q1.mo3993T(mo3950s) != null) {
            return typeFactory.mo20416a('[' + EnumC14028e.m878c(mo3993T).m877d());
        }
        if (interfaceC7314q1.mo4010F0(mo3950s)) {
            C11634d mo3943v0 = interfaceC7314q1.mo3943v0(mo3950s);
            if (mo3943v0 != null) {
                c11632b = C11599c.f30110a.m7551n(mo3943v0);
            } else {
                c11632b = null;
            }
            if (c11632b != null) {
                if (!mode.m20493a()) {
                    List<C11599c.C11600a> m7556i = C11599c.f30110a.m7556i();
                    if (!(m7556i instanceof Collection) || !m7556i.isEmpty()) {
                        for (C11599c.C11600a c11600a : m7556i) {
                            if (C9612q.m13922c(c11600a.m7545d(), c11632b)) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return null;
                    }
                }
                String m882f = C14027d.m886b(c11632b).m882f();
                C9612q.m13918g(m882f, "byClassId(classId).internalName");
                return typeFactory.mo20412e(m882f);
            }
        }
        return null;
    }
}
