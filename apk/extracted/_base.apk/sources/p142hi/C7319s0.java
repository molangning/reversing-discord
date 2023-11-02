package p142hi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import p161ii.C7595i;

/* renamed from: hi.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7319s0 {
    /* renamed from: a */
    public static final C7216a m21005a(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        AbstractC7333v1 mo20916Q0 = abstractC7264g0.mo20916Q0();
        if (mo20916Q0 instanceof C7216a) {
            return (C7216a) mo20916Q0;
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC7302o0 m21004b(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        C7216a m21005a = m21005a(abstractC7264g0);
        if (m21005a != null) {
            return m21005a.m21222Z0();
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m21003c(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        return abstractC7264g0.mo20916Q0() instanceof C7304p;
    }

    /* renamed from: d */
    private static final C7239f0 m21002d(C7239f0 c7239f0) {
        int m14093t;
        AbstractC7264g0 abstractC7264g0;
        Collection<AbstractC7264g0> mo2791m = c7239f0.mo2791m();
        m14093t = C9546k.m14093t(mo2791m, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        Iterator<T> it = mo2791m.iterator();
        boolean z = false;
        while (true) {
            abstractC7264g0 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC7264g0 abstractC7264g02 = (AbstractC7264g0) it.next();
            if (C7320s1.m20983l(abstractC7264g02)) {
                abstractC7264g02 = m21000f(abstractC7264g02.mo20916Q0(), false, 1, null);
                z = true;
            }
            arrayList.add(abstractC7264g02);
        }
        if (!z) {
            return null;
        }
        AbstractC7264g0 m21155e = c7239f0.m21155e();
        if (m21155e != null) {
            if (C7320s1.m20983l(m21155e)) {
                m21155e = m21000f(m21155e.mo20916Q0(), false, 1, null);
            }
            abstractC7264g0 = m21155e;
        }
        return new C7239f0(arrayList).m21151i(abstractC7264g0);
    }

    /* renamed from: e */
    public static final AbstractC7333v1 m21001e(AbstractC7333v1 abstractC7333v1, boolean z) {
        C9612q.m13917h(abstractC7333v1, "<this>");
        C7304p m21036b = C7304p.f19733m.m21036b(abstractC7333v1, z);
        if (m21036b == null) {
            AbstractC7302o0 m20999g = m20999g(abstractC7333v1);
            if (m20999g == null) {
                return abstractC7333v1.mo3561R0(false);
            }
            return m20999g;
        }
        return m21036b;
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC7333v1 m21000f(AbstractC7333v1 abstractC7333v1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m21001e(abstractC7333v1, z);
    }

    /* renamed from: g */
    private static final AbstractC7302o0 m20999g(AbstractC7264g0 abstractC7264g0) {
        C7239f0 c7239f0;
        C7239f0 m21002d;
        InterfaceC7265g1 mo3564N0 = abstractC7264g0.mo3564N0();
        if (mo3564N0 instanceof C7239f0) {
            c7239f0 = (C7239f0) mo3564N0;
        } else {
            c7239f0 = null;
        }
        if (c7239f0 == null || (m21002d = m21002d(c7239f0)) == null) {
            return null;
        }
        return m21002d.m21156d();
    }

    /* renamed from: h */
    public static final AbstractC7302o0 m20998h(AbstractC7302o0 abstractC7302o0, boolean z) {
        C9612q.m13917h(abstractC7302o0, "<this>");
        C7304p m21036b = C7304p.f19733m.m21036b(abstractC7302o0, z);
        if (m21036b == null) {
            AbstractC7302o0 m20999g = m20999g(abstractC7302o0);
            if (m20999g == null) {
                return abstractC7302o0.mo3558U0(false);
            }
            return m20999g;
        }
        return m21036b;
    }

    /* renamed from: i */
    public static /* synthetic */ AbstractC7302o0 m20997i(AbstractC7302o0 abstractC7302o0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m20998h(abstractC7302o0, z);
    }

    /* renamed from: j */
    public static final AbstractC7302o0 m20996j(AbstractC7302o0 abstractC7302o0, AbstractC7302o0 abbreviatedType) {
        C9612q.m13917h(abstractC7302o0, "<this>");
        C9612q.m13917h(abbreviatedType, "abbreviatedType");
        if (C7276i0.m21083a(abstractC7302o0)) {
            return abstractC7302o0;
        }
        return new C7216a(abstractC7302o0, abbreviatedType);
    }

    /* renamed from: k */
    public static final C7595i m20995k(C7595i c7595i) {
        C9612q.m13917h(c7595i, "<this>");
        return new C7595i(c7595i.m20272W0(), c7595i.mo3564N0(), c7595i.m20270Y0(), c7595i.mo3565M0(), c7595i.mo3563O0(), true);
    }
}
