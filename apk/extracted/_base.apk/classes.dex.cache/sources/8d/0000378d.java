package p160ih;

import kh.C9439q;
import kotlin.jvm.internal.C9612q;
import p070di.InterfaceC5952s;
import p086eh.C6235h;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7267h0;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p250nh.C10890a;

/* renamed from: ih.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7548j implements InterfaceC5952s {

    /* renamed from: a */
    public static final C7548j f20843a = new C7548j();

    private C7548j() {
    }

    @Override // p070di.InterfaceC5952s
    /* renamed from: a */
    public AbstractC7264g0 mo20441a(C9439q proto, String flexibleId, AbstractC7302o0 lowerBound, AbstractC7302o0 upperBound) {
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(flexibleId, "flexibleId");
        C9612q.m13917h(lowerBound, "lowerBound");
        C9612q.m13917h(upperBound, "upperBound");
        if (!C9612q.m13922c(flexibleId, "kotlin.jvm.PlatformType")) {
            return C8967k.m16945d(EnumC8966j.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString());
        }
        if (proto.m5815y(C10890a.f28551g)) {
            return new C6235h(lowerBound, upperBound);
        }
        return C7267h0.m21104d(lowerBound, upperBound);
    }
}