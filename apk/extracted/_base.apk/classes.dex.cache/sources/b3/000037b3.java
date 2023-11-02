package p161ii;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7217a0;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.C7229d0;
import p142hi.C7267h0;
import p142hi.C7276i0;
import p142hi.C7334w;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import pf.C11581q;

/* renamed from: ii.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7586d {
    /* renamed from: a */
    public static final AbstractC7333v1 m20288a(List<? extends AbstractC7333v1> types) {
        Object m14033q0;
        int m14093t;
        int m14093t2;
        AbstractC7302o0 m21218V0;
        C9612q.m13917h(types, "types");
        int size = types.size();
        if (size != 0) {
            if (size != 1) {
                m14093t = C9546k.m14093t(types, 10);
                ArrayList arrayList = new ArrayList(m14093t);
                boolean z = false;
                boolean z2 = false;
                for (AbstractC7333v1 abstractC7333v1 : types) {
                    if (!z && !C7276i0.m21083a(abstractC7333v1)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (abstractC7333v1 instanceof AbstractC7302o0) {
                        m21218V0 = (AbstractC7302o0) abstractC7333v1;
                    } else if (abstractC7333v1 instanceof AbstractC7217a0) {
                        if (C7334w.m20938a(abstractC7333v1)) {
                            return abstractC7333v1;
                        }
                        m21218V0 = ((AbstractC7217a0) abstractC7333v1).m21218V0();
                        z2 = true;
                    } else {
                        throw new C11581q();
                    }
                    arrayList.add(m21218V0);
                }
                if (z) {
                    return C8967k.m16945d(EnumC8966j.INTERSECTION_OF_ERROR_TYPES, types.toString());
                }
                if (!z2) {
                    return C7614w.f20912a.m20236c(arrayList);
                }
                m14093t2 = C9546k.m14093t(types, 10);
                ArrayList arrayList2 = new ArrayList(m14093t2);
                for (AbstractC7333v1 abstractC7333v12 : types) {
                    arrayList2.add(C7229d0.m21190d(abstractC7333v12));
                }
                C7614w c7614w = C7614w.f20912a;
                return C7267h0.m21104d(c7614w.m20236c(arrayList), c7614w.m20236c(arrayList2));
            }
            m14033q0 = C9553r.m14033q0(types);
            return (AbstractC7333v1) m14033q0;
        }
        throw new IllegalStateException("Expected some types".toString());
    }
}