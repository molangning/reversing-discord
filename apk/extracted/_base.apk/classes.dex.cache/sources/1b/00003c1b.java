package p164j$.util.stream;

import p164j$.util.function.C8431H;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.Z2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8632Z2 extends AbstractC8642b3 implements InterfaceC8437K {

    /* renamed from: c */
    final int[] f22814c = new int[128];

    @Override // p164j$.util.stream.AbstractC8642b3
    /* renamed from: a */
    public final void mo17504a(Object obj, long j) {
        InterfaceC8437K interfaceC8437K = (InterfaceC8437K) obj;
        for (int i = 0; i < j; i++) {
            interfaceC8437K.accept(this.f22814c[i]);
        }
    }

    @Override // p164j$.util.function.InterfaceC8437K
    public final void accept(int i) {
        int i2 = this.f22823b;
        this.f22823b = i2 + 1;
        this.f22814c[i2] = i;
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }
}