package p141hh;

import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hh.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7199k {

    /* renamed from: a */
    private final C7212q f19584a;

    /* renamed from: b */
    private final List<C7212q> f19585b;

    public C7199k() {
        this(null, null, 3, null);
    }

    public C7199k(C7212q c7212q, List<C7212q> parametersInfo) {
        C9612q.m13917h(parametersInfo, "parametersInfo");
        this.f19584a = c7212q;
        this.f19585b = parametersInfo;
    }

    /* renamed from: a */
    public final List<C7212q> m21287a() {
        return this.f19585b;
    }

    /* renamed from: b */
    public final C7212q m21286b() {
        return this.f19584a;
    }

    public /* synthetic */ C7199k(C7212q c7212q, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c7212q, (i & 2) != 0 ? C9545j.m14104i() : list);
    }
}
