package p164j$.util.stream;

import p164j$.util.C8513k;
import p164j$.util.function.C8431H;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.J */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8566J extends AbstractC8578M implements InterfaceC8661f2 {
    @Override // p164j$.util.stream.AbstractC8578M, p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        m17568q(Integer.valueOf(i));
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        if (this.f22720a) {
            return C8513k.m17614d(((Integer) this.f22721b).intValue());
        }
        return null;
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }
}