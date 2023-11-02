package p164j$.util.stream;

import p164j$.util.C8514l;
import p164j$.util.function.C8462c0;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.K */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8570K extends AbstractC8578M implements InterfaceC8666g2 {
    @Override // p164j$.util.stream.AbstractC8578M, p164j$.util.stream.InterfaceC8671h2
    public final void accept(long j) {
        m17568q(Long.valueOf(j));
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        if (this.f22720a) {
            return C8514l.m17610d(((Long) this.f22721b).longValue());
        }
        return null;
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }
}
