package p160ih;

import java.util.List;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import p142hi.AbstractC7264g0;
import p160ih.AbstractC7551m;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p305qg.InterfaceC12005z0;
import p429xh.C13801c;
import p449yh.C14027d;
import p449yh.EnumC14028e;
import p468zg.C14218f;
import p468zg.C14226h0;
import pg.C11599c;
import ph.C11632b;
import ph.C11634d;
import th.C12758e;

/* renamed from: ih.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7575w {
    /* renamed from: a */
    private static final void m20387a(StringBuilder sb2, AbstractC7264g0 abstractC7264g0) {
        sb2.append(m20381g(abstractC7264g0));
    }

    /* renamed from: b */
    public static final String m20386b(InterfaceC11998y interfaceC11998y, boolean z, boolean z2) {
        String m7426b;
        C9612q.m13917h(interfaceC11998y, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            if (interfaceC11998y instanceof InterfaceC11944l) {
                m7426b = "<init>";
            } else {
                m7426b = interfaceC11998y.getName().m7426b();
                C9612q.m13918g(m7426b, "name.asString()");
            }
            sb2.append(m7426b);
        }
        sb2.append("(");
        InterfaceC11997x0 mo4329M = interfaceC11998y.mo4329M();
        if (mo4329M != null) {
            AbstractC7264g0 type = mo4329M.getType();
            C9612q.m13918g(type, "it.type");
            m20387a(sb2, type);
        }
        for (InterfaceC11936j1 interfaceC11936j1 : interfaceC11998y.mo4301i()) {
            AbstractC7264g0 type2 = interfaceC11936j1.getType();
            C9612q.m13918g(type2, "parameter.type");
            m20387a(sb2, type2);
        }
        sb2.append(")");
        if (z) {
            if (C7538e.m20467c(interfaceC11998y)) {
                sb2.append("V");
            } else {
                AbstractC7264g0 returnType = interfaceC11998y.getReturnType();
                C9612q.m13920e(returnType);
                m20387a(sb2, returnType);
            }
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: c */
    public static /* synthetic */ String m20385c(InterfaceC11998y interfaceC11998y, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m20386b(interfaceC11998y, z, z2);
    }

    /* renamed from: d */
    public static final String m20384d(InterfaceC11897a interfaceC11897a) {
        InterfaceC11914e interfaceC11914e;
        InterfaceC12005z0 interfaceC12005z0;
        C9612q.m13917h(interfaceC11897a, "<this>");
        C7578y c7578y = C7578y.f20876a;
        if (C12758e.m4120E(interfaceC11897a)) {
            return null;
        }
        InterfaceC11947m mo4163b = interfaceC11897a.mo4163b();
        if (mo4163b instanceof InterfaceC11914e) {
            interfaceC11914e = (InterfaceC11914e) mo4163b;
        } else {
            interfaceC11914e = null;
        }
        if (interfaceC11914e == null || interfaceC11914e.getName().m7421g()) {
            return null;
        }
        InterfaceC11897a mo4221a = interfaceC11897a.mo4221a();
        if (mo4221a instanceof InterfaceC12005z0) {
            interfaceC12005z0 = (InterfaceC12005z0) mo4221a;
        } else {
            interfaceC12005z0 = null;
        }
        if (interfaceC12005z0 == null) {
            return null;
        }
        return C7574v.m20388a(c7578y, interfaceC11914e, m20385c(interfaceC12005z0, false, false, 3, null));
    }

    /* renamed from: e */
    public static final boolean m20383e(InterfaceC11897a f) {
        Object m14033q0;
        AbstractC7551m.C7555d c7555d;
        InterfaceC11998y m404k;
        Object m14033q02;
        C9612q.m13917h(f, "f");
        if (!(f instanceof InterfaceC11998y)) {
            return false;
        }
        InterfaceC11998y interfaceC11998y = (InterfaceC11998y) f;
        if (!C9612q.m13922c(interfaceC11998y.getName().m7426b(), "remove") || interfaceC11998y.mo4301i().size() != 1 || C14226h0.m374h((InterfaceC11902b) f)) {
            return false;
        }
        List<InterfaceC11936j1> mo4301i = interfaceC11998y.mo4221a().mo4301i();
        C9612q.m13918g(mo4301i, "f.original.valueParameters");
        m14033q0 = C9553r.m14033q0(mo4301i);
        AbstractC7264g0 type = ((InterfaceC11936j1) m14033q0).getType();
        C9612q.m13918g(type, "f.original.valueParameters.single().type");
        AbstractC7551m m20381g = m20381g(type);
        EnumC14028e enumC14028e = null;
        if (m20381g instanceof AbstractC7551m.C7555d) {
            c7555d = (AbstractC7551m.C7555d) m20381g;
        } else {
            c7555d = null;
        }
        if (c7555d != null) {
            enumC14028e = c7555d.m20417i();
        }
        if (enumC14028e != EnumC14028e.INT || (m404k = C14218f.m404k(interfaceC11998y)) == null) {
            return false;
        }
        List<InterfaceC11936j1> mo4301i2 = m404k.mo4221a().mo4301i();
        C9612q.m13918g(mo4301i2, "overridden.original.valueParameters");
        m14033q02 = C9553r.m14033q0(mo4301i2);
        AbstractC7264g0 type2 = ((InterfaceC11936j1) m14033q02).getType();
        C9612q.m13918g(type2, "overridden.original.valueParameters.single().type");
        AbstractC7551m m20381g2 = m20381g(type2);
        InterfaceC11947m mo4163b = m404k.mo4163b();
        C9612q.m13918g(mo4163b, "overridden.containingDeclaration");
        if (!C9612q.m13922c(C13801c.m1502m(mo4163b), C10884k.C10885a.f28475c0.m7450j()) || !(m20381g2 instanceof AbstractC7551m.C7554c) || !C9612q.m13922c(((AbstractC7551m.C7554c) m20381g2).m20418i(), "java/lang/Object")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final String m20382f(InterfaceC11914e interfaceC11914e) {
        C9612q.m13917h(interfaceC11914e, "<this>");
        C11599c c11599c = C11599c.f30110a;
        C11634d m7450j = C13801c.m1503l(interfaceC11914e).m7450j();
        C9612q.m13918g(m7450j, "fqNameSafe.toUnsafe()");
        C11632b m7551n = c11599c.m7551n(m7450j);
        if (m7551n != null) {
            String m882f = C14027d.m886b(m7551n).m882f();
            C9612q.m13918g(m882f, "byClassId(it).internalName");
            return m882f;
        }
        return C7538e.m20468b(interfaceC11914e, null, 2, null);
    }

    /* renamed from: g */
    public static final AbstractC7551m m20381g(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        return (AbstractC7551m) C7538e.m20465e(abstractC7264g0, C7557o.f20863a, C7527b0.f20789o, C7521a0.f20776a, null, null, 32, null);
    }
}
