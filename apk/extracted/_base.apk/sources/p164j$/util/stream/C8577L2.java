package p164j$.util.stream;

import p164j$.util.AbstractC8383c0;
import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8359G;
import p164j$.util.InterfaceC8365M;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.L2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8577L2 extends AbstractC8593P2 implements InterfaceC8359G {

    /* renamed from: g */
    final /* synthetic */ C8581M2 f22719g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8577L2(C8581M2 c8581m2, int i, int i2, int i3, int i4) {
        super(c8581m2, i, i2, i3, i4);
        this.f22719g = c8581m2;
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17603m(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8593P2
    /* renamed from: e */
    final void mo17561e(int i, Object obj, Object obj2) {
        ((InterfaceC8437K) obj2).accept(((int[]) obj)[i]);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17608g(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8593P2
    /* renamed from: g */
    final InterfaceC8365M mo17559g(Object obj, int i, int i2) {
        return AbstractC8383c0.m17753k((int[]) obj, i, i2 + i);
    }

    @Override // p164j$.util.stream.AbstractC8593P2
    /* renamed from: h */
    final InterfaceC8365M mo17558h(int i, int i2, int i3, int i4) {
        return new C8577L2(this.f22719g, i, i2, i3, i4);
    }
}
