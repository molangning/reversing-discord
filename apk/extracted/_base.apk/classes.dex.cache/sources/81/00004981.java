package pg;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9559v;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import ng.C10884k;
import p305qg.InterfaceC11914e;
import p429xh.C13801c;
import ph.C11632b;
import ph.C11633c;
import th.C12758e;

/* renamed from: pg.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11601d {

    /* renamed from: a */
    public static final C11601d f30130a = new C11601d();

    private C11601d() {
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC11914e m7539f(C11601d c11601d, C11633c c11633c, AbstractC10870h abstractC10870h, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return c11601d.m7540e(c11633c, abstractC10870h, num);
    }

    /* renamed from: a */
    public final InterfaceC11914e m7544a(InterfaceC11914e mutable) {
        C9612q.m13917h(mutable, "mutable");
        C11633c m7550o = C11599c.f30110a.m7550o(C12758e.m4099m(mutable));
        if (m7550o != null) {
            InterfaceC11914e m9798o = C13801c.m1505j(mutable).m9798o(m7550o);
            C9612q.m13918g(m9798o, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return m9798o;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    /* renamed from: b */
    public final InterfaceC11914e m7543b(InterfaceC11914e readOnly) {
        C9612q.m13917h(readOnly, "readOnly");
        C11633c m7549p = C11599c.f30110a.m7549p(C12758e.m4099m(readOnly));
        if (m7549p != null) {
            InterfaceC11914e m9798o = C13801c.m1505j(readOnly).m9798o(m7549p);
            C9612q.m13918g(m9798o, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return m9798o;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    /* renamed from: c */
    public final boolean m7542c(InterfaceC11914e mutable) {
        C9612q.m13917h(mutable, "mutable");
        return C11599c.f30110a.m7554k(C12758e.m4099m(mutable));
    }

    /* renamed from: d */
    public final boolean m7541d(InterfaceC11914e readOnly) {
        C9612q.m13917h(readOnly, "readOnly");
        return C11599c.f30110a.m7553l(C12758e.m4099m(readOnly));
    }

    /* renamed from: e */
    public final InterfaceC11914e m7540e(C11633c fqName, AbstractC10870h builtIns, Integer num) {
        C11632b m7552m;
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(builtIns, "builtIns");
        if (num != null && C9612q.m13922c(fqName, C11599c.f30110a.m7557h())) {
            m7552m = C10884k.m9756a(num.intValue());
        } else {
            m7552m = C11599c.f30110a.m7552m(fqName);
        }
        if (m7552m != null) {
            return builtIns.m9798o(m7552m.m7471b());
        }
        return null;
    }

    /* renamed from: g */
    public final Collection<InterfaceC11914e> m7538g(C11633c fqName, AbstractC10870h builtIns) {
        List m14101l;
        Set m14008c;
        Set m14007d;
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(builtIns, "builtIns");
        InterfaceC11914e m7539f = m7539f(this, fqName, builtIns, null, 4, null);
        if (m7539f == null) {
            m14007d = C9560w.m14007d();
            return m14007d;
        }
        C11633c m7549p = C11599c.f30110a.m7549p(C13801c.m1502m(m7539f));
        if (m7549p == null) {
            m14008c = C9559v.m14008c(m7539f);
            return m14008c;
        }
        InterfaceC11914e m9798o = builtIns.m9798o(m7549p);
        C9612q.m13918g(m9798o, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        m14101l = C9545j.m14101l(m7539f, m9798o);
        return m14101l;
    }
}