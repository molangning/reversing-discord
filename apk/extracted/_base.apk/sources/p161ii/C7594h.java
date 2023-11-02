package p161ii;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p305qg.C11922g0;

/* renamed from: ii.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7594h {

    /* renamed from: a */
    private static final C11922g0<C7607p<AbstractC7623x>> f20883a = new C11922g0<>("KotlinTypeRefiner");

    /* renamed from: a */
    public static final C11922g0<C7607p<AbstractC7623x>> m20274a() {
        return f20883a;
    }

    /* renamed from: b */
    public static final List<AbstractC7264g0> m20273b(AbstractC7592g abstractC7592g, Iterable<? extends AbstractC7264g0> types) {
        int m14093t;
        C9612q.m13917h(abstractC7592g, "<this>");
        C9612q.m13917h(types, "types");
        m14093t = C9546k.m14093t(types, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (AbstractC7264g0 abstractC7264g0 : types) {
            arrayList.add(abstractC7592g.mo20276h(abstractC7264g0));
        }
        return arrayList;
    }
}
