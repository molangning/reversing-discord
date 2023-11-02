package p164j$.util.stream;

import p164j$.util.function.C8462c0;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.a3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8637a3 extends AbstractC8642b3 implements InterfaceC8468f0 {

    /* renamed from: c */
    final long[] f22818c = new long[128];

    @Override // p164j$.util.stream.AbstractC8642b3
    /* renamed from: a */
    public final void mo17504a(Object obj, long j) {
        InterfaceC8468f0 interfaceC8468f0 = (InterfaceC8468f0) obj;
        for (int i = 0; i < j; i++) {
            interfaceC8468f0.accept(this.f22818c[i]);
        }
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    public final void accept(long j) {
        int i = this.f22823b;
        this.f22823b = i + 1;
        this.f22818c[i] = j;
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }
}
