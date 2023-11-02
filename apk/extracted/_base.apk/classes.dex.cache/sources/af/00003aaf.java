package p164j$.time.format;

import p164j$.time.AbstractC8329o;
import p164j$.time.temporal.InterfaceC8346n;

/* renamed from: j$.time.format.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8312o implements InterfaceC8304g {

    /* renamed from: a */
    private final InterfaceC8346n f22331a;

    public C8312o(C8298a c8298a) {
        this.f22331a = c8298a;
    }

    @Override // p164j$.time.format.InterfaceC8304g
    /* renamed from: a */
    public final boolean mo17882a(C8315r c8315r, StringBuilder sb2) {
        AbstractC8329o abstractC8329o = (AbstractC8329o) c8315r.m17857f(this.f22331a);
        if (abstractC8329o == null) {
            return false;
        }
        sb2.append(abstractC8329o.mo17831f());
        return true;
    }

    public final String toString() {
        return "ZoneRegionId()";
    }
}