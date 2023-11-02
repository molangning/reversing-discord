package p142hi;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import pf.C11581q;

/* renamed from: hi.u1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7329u1 {
    /* renamed from: a */
    public static final AbstractC7264g0 m20949a(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        if (abstractC7264g0 instanceof InterfaceC7324t1) {
            return ((InterfaceC7324t1) abstractC7264g0).mo20962g0();
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC7333v1 m20948b(AbstractC7333v1 abstractC7333v1, AbstractC7264g0 origin) {
        C9612q.m13917h(abstractC7333v1, "<this>");
        C9612q.m13917h(origin, "origin");
        return m20946d(abstractC7333v1, m20949a(origin));
    }

    /* renamed from: c */
    public static final AbstractC7333v1 m20947c(AbstractC7333v1 abstractC7333v1, AbstractC7264g0 origin, Function1<? super AbstractC7264g0, ? extends AbstractC7264g0> transform) {
        AbstractC7264g0 abstractC7264g0;
        C9612q.m13917h(abstractC7333v1, "<this>");
        C9612q.m13917h(origin, "origin");
        C9612q.m13917h(transform, "transform");
        AbstractC7264g0 m20949a = m20949a(origin);
        if (m20949a != null) {
            abstractC7264g0 = transform.invoke(m20949a);
        } else {
            abstractC7264g0 = null;
        }
        return m20946d(abstractC7333v1, abstractC7264g0);
    }

    /* renamed from: d */
    public static final AbstractC7333v1 m20946d(AbstractC7333v1 abstractC7333v1, AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7333v1, "<this>");
        if (abstractC7333v1 instanceof InterfaceC7324t1) {
            return m20946d(((InterfaceC7324t1) abstractC7333v1).mo20963G0(), abstractC7264g0);
        }
        if (abstractC7264g0 != null && !C9612q.m13922c(abstractC7264g0, abstractC7333v1)) {
            if (abstractC7333v1 instanceof AbstractC7302o0) {
                return new C7316r0((AbstractC7302o0) abstractC7333v1, abstractC7264g0);
            }
            if (abstractC7333v1 instanceof AbstractC7217a0) {
                return new C7225c0((AbstractC7217a0) abstractC7333v1, abstractC7264g0);
            }
            throw new C11581q();
        }
        return abstractC7333v1;
    }
}