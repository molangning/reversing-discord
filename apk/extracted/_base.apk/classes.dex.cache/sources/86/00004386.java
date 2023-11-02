package mh;

import java.util.ArrayList;
import java.util.List;
import kh.C9439q;
import kh.C9455t;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;

/* renamed from: mh.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10468g {

    /* renamed from: a */
    private final List<C9439q> f27349a;

    public C10468g(C9455t typeTable) {
        int m14093t;
        C9612q.m13917h(typeTable, "typeTable");
        List<C9439q> m14820B = typeTable.m14820B();
        if (typeTable.m14819C()) {
            int m14807y = typeTable.m14807y();
            List<C9439q> m14820B2 = typeTable.m14820B();
            C9612q.m13918g(m14820B2, "typeTable.typeList");
            m14093t = C9546k.m14093t(m14820B2, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            int i = 0;
            for (Object obj : m14820B2) {
                int i2 = i + 1;
                if (i < 0) {
                    C9545j.m14094s();
                }
                C9439q c9439q = (C9439q) obj;
                if (i >= m14807y) {
                    c9439q = c9439q.mo5768b().m14936M(true).build();
                }
                arrayList.add(c9439q);
                i = i2;
            }
            m14820B = arrayList;
        }
        C9612q.m13918g(m14820B, "run {\n        val origin… else originalTypes\n    }");
        this.f27349a = m14820B;
    }

    /* renamed from: a */
    public final C9439q m11463a(int i) {
        return this.f27349a.get(i);
    }
}