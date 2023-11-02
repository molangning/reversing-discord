package p142hi;

import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11920f1;

/* renamed from: hi.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C7337x {
    /* renamed from: b */
    public static /* synthetic */ InterfaceC7288k1 m20932b(C7337x c7337x, InterfaceC11920f1 interfaceC11920f1, C7341y c7341y, C7281j1 c7281j1, AbstractC7264g0 abstractC7264g0, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                abstractC7264g0 = c7281j1.m21068c(interfaceC11920f1, c7341y);
            }
            return c7337x.mo20933a(interfaceC11920f1, c7341y, c7281j1, abstractC7264g0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
    }

    /* renamed from: a */
    public InterfaceC7288k1 mo20933a(InterfaceC11920f1 parameter, C7341y typeAttr, C7281j1 typeParameterUpperBoundEraser, AbstractC7264g0 erasedUpperBound) {
        C9612q.m13917h(parameter, "parameter");
        C9612q.m13917h(typeAttr, "typeAttr");
        C9612q.m13917h(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        C9612q.m13917h(erasedUpperBound, "erasedUpperBound");
        return new C7294m1(EnumC7336w1.OUT_VARIANCE, erasedUpperBound);
    }
}
