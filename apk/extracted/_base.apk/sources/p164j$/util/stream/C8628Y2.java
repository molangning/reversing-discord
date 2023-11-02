package p164j$.util.stream;

import p164j$.util.function.C8477k;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.Y2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8628Y2 extends AbstractC8642b3 implements InterfaceC8483n {

    /* renamed from: c */
    final double[] f22813c = new double[128];

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8642b3
    /* renamed from: a */
    public final void mo17504a(Object obj, long j) {
        InterfaceC8483n interfaceC8483n = (InterfaceC8483n) obj;
        for (int i = 0; i < j; i++) {
            interfaceC8483n.accept(this.f22813c[i]);
        }
    }

    @Override // p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        int i = this.f22823b;
        this.f22823b = i + 1;
        this.f22813c[i] = d;
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }
}
