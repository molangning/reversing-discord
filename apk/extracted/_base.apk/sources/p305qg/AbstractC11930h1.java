package p305qg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC10202k;
import pf.C11581q;
import pf.C11591x;
import ph.C11638f;

/* renamed from: qg.h1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC11930h1<Type extends InterfaceC10202k> {
    private AbstractC11930h1() {
    }

    public /* synthetic */ AbstractC11930h1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract List<Pair<C11638f, Type>> mo6639a();

    /* renamed from: b */
    public final <Other extends InterfaceC10202k> AbstractC11930h1<Other> m6706b(Function1<? super Type, ? extends Other> transform) {
        int m14093t;
        C9612q.m13917h(transform, "transform");
        if (this instanceof C12004z) {
            C12004z c12004z = (C12004z) this;
            return new C12004z(c12004z.m6638c(), transform.invoke(c12004z.m6637d()));
        } else if (this instanceof C11932i0) {
            List<Pair<C11638f, Type>> mo6639a = mo6639a();
            m14093t = C9546k.m14093t(mo6639a, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            Iterator<T> it = mo6639a.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(C11591x.m7577a((C11638f) pair.m14351a(), transform.invoke((InterfaceC10202k) pair.m14350b())));
            }
            return new C11932i0(arrayList);
        } else {
            throw new C11581q();
        }
    }
}
