package p142hi;

import java.util.List;
import kotlin.jvm.internal.C9612q;
import p325rg.C12166l;
import p325rg.InterfaceC12155g;
import pf.C11581q;

/* renamed from: hi.o1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7303o1 {
    /* renamed from: a */
    public static final AbstractC7302o0 m21047a(AbstractC7264g0 abstractC7264g0) {
        AbstractC7302o0 abstractC7302o0;
        C9612q.m13917h(abstractC7264g0, "<this>");
        AbstractC7333v1 mo20916Q0 = abstractC7264g0.mo20916Q0();
        if (mo20916Q0 instanceof AbstractC7302o0) {
            abstractC7302o0 = (AbstractC7302o0) mo20916Q0;
        } else {
            abstractC7302o0 = null;
        }
        if (abstractC7302o0 != null) {
            return abstractC7302o0;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC7264g0).toString());
    }

    /* renamed from: b */
    public static final AbstractC7264g0 m21046b(AbstractC7264g0 abstractC7264g0, List<? extends InterfaceC7288k1> newArguments, InterfaceC12155g newAnnotations) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        C9612q.m13917h(newArguments, "newArguments");
        C9612q.m13917h(newAnnotations, "newAnnotations");
        return m21043e(abstractC7264g0, newArguments, newAnnotations, null, 4, null);
    }

    /* renamed from: c */
    public static final AbstractC7264g0 m21045c(AbstractC7264g0 abstractC7264g0, List<? extends InterfaceC7288k1> newArguments, InterfaceC12155g newAnnotations, List<? extends InterfaceC7288k1> newArgumentsForUpperBound) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        C9612q.m13917h(newArguments, "newArguments");
        C9612q.m13917h(newAnnotations, "newAnnotations");
        C9612q.m13917h(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == abstractC7264g0.mo3566L0()) && newAnnotations == abstractC7264g0.getAnnotations()) {
            return abstractC7264g0;
        }
        C7226c1 mo3565M0 = abstractC7264g0.mo3565M0();
        if ((newAnnotations instanceof C12166l) && newAnnotations.isEmpty()) {
            newAnnotations = InterfaceC12155g.f31603f.m6037b();
        }
        C7226c1 m21189a = C7230d1.m21189a(mo3565M0, newAnnotations);
        AbstractC7333v1 mo20916Q0 = abstractC7264g0.mo20916Q0();
        if (mo20916Q0 instanceof AbstractC7217a0) {
            AbstractC7217a0 abstractC7217a0 = (AbstractC7217a0) mo20916Q0;
            return C7267h0.m21104d(m21044d(abstractC7217a0.m21218V0(), newArguments, m21189a), m21044d(abstractC7217a0.m21217W0(), newArgumentsForUpperBound, m21189a));
        } else if (mo20916Q0 instanceof AbstractC7302o0) {
            return m21044d((AbstractC7302o0) mo20916Q0, newArguments, m21189a);
        } else {
            throw new C11581q();
        }
    }

    /* renamed from: d */
    public static final AbstractC7302o0 m21044d(AbstractC7302o0 abstractC7302o0, List<? extends InterfaceC7288k1> newArguments, C7226c1 newAttributes) {
        C9612q.m13917h(abstractC7302o0, "<this>");
        C9612q.m13917h(newArguments, "newArguments");
        C9612q.m13917h(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == abstractC7302o0.mo3565M0()) {
            return abstractC7302o0;
        }
        if (newArguments.isEmpty()) {
            return abstractC7302o0.mo3557V0(newAttributes);
        }
        return C7267h0.m21098j(newAttributes, abstractC7302o0.mo3564N0(), newArguments, abstractC7302o0.mo3563O0(), null, 16, null);
    }

    /* renamed from: e */
    public static /* synthetic */ AbstractC7264g0 m21043e(AbstractC7264g0 abstractC7264g0, List list, InterfaceC12155g interfaceC12155g, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = abstractC7264g0.mo3566L0();
        }
        if ((i & 2) != 0) {
            interfaceC12155g = abstractC7264g0.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return m21045c(abstractC7264g0, list, interfaceC12155g, list2);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC7302o0 m21042f(AbstractC7302o0 abstractC7302o0, List list, C7226c1 c7226c1, int i, Object obj) {
        if ((i & 1) != 0) {
            list = abstractC7302o0.mo3566L0();
        }
        if ((i & 2) != 0) {
            c7226c1 = abstractC7302o0.mo3565M0();
        }
        return m21044d(abstractC7302o0, list, c7226c1);
    }
}