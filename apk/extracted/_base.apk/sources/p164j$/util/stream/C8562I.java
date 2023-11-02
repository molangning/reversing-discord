package p164j$.util.stream;

import p164j$.util.C8512j;
import p164j$.util.function.C8477k;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.I */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8562I extends AbstractC8578M implements InterfaceC8656e2 {
    @Override // p164j$.util.stream.AbstractC8578M, p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        m17568q(Double.valueOf(d));
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        if (this.f22720a) {
            return C8512j.m17618d(((Double) this.f22721b).doubleValue());
        }
        return null;
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }
}
