package p407wg;

import gh.InterfaceC6768e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import p407wg.AbstractC13552f;
import ph.C11638f;

/* renamed from: wg.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13557j extends AbstractC13552f implements InterfaceC6768e {

    /* renamed from: c */
    private final Object[] f34939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13557j(C11638f c11638f, Object[] values) {
        super(c11638f, null);
        C9612q.m13917h(values, "values");
        this.f34939c = values;
    }

    @Override // gh.InterfaceC6768e
    /* renamed from: c */
    public List<AbstractC13552f> mo2225c() {
        Object[] objArr = this.f34939c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC13552f.C13553a c13553a = AbstractC13552f.f34936b;
            C9612q.m13920e(obj);
            arrayList.add(c13553a.m2229a(obj, null));
        }
        return arrayList;
    }
}