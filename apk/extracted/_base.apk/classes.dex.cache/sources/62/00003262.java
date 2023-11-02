package p086eh;

import java.util.List;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.C7281j1;
import p142hi.C7294m1;
import p142hi.C7320s1;
import p142hi.C7337x;
import p142hi.C7341y;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7288k1;
import p305qg.InterfaceC11920f1;
import p429xh.C13801c;
import pf.C11581q;

/* renamed from: eh.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C6230f extends C7337x {

    /* renamed from: eh.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C6231a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17652a;

        static {
            int[] iArr = new int[EnumC6226c.values().length];
            try {
                iArr[EnumC6226c.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6226c.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6226c.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17652a = iArr;
        }
    }

    @Override // p142hi.C7337x
    /* renamed from: a */
    public InterfaceC7288k1 mo20933a(InterfaceC11920f1 parameter, C7341y typeAttr, C7281j1 typeParameterUpperBoundEraser, AbstractC7264g0 erasedUpperBound) {
        InterfaceC7288k1 m20975t;
        C9612q.m13917h(parameter, "parameter");
        C9612q.m13917h(typeAttr, "typeAttr");
        C9612q.m13917h(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        C9612q.m13917h(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof C6224a)) {
            return super.mo20933a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        C6224a c6224a = (C6224a) typeAttr;
        if (!c6224a.m23216i()) {
            c6224a = c6224a.m23213l(EnumC6226c.INFLEXIBLE);
        }
        int i = C6231a.f17652a[c6224a.m23218g().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C11581q();
            }
            if (!parameter.mo4464m().m20935b()) {
                m20975t = new C7294m1(EnumC7336w1.INVARIANT, C13801c.m1505j(parameter).m9843H());
            } else {
                List<InterfaceC11920f1> parameters = erasedUpperBound.mo3564N0().getParameters();
                C9612q.m13918g(parameters, "erasedUpperBound.constructor.parameters");
                if (!parameters.isEmpty()) {
                    m20975t = new C7294m1(EnumC7336w1.OUT_VARIANCE, erasedUpperBound);
                } else {
                    m20975t = C7320s1.m20975t(parameter, c6224a);
                }
            }
            C9612q.m13918g(m20975t, "{\n                if (!p…          }\n            }");
            return m20975t;
        }
        return new C7294m1(EnumC7336w1.INVARIANT, erasedUpperBound);
    }
}