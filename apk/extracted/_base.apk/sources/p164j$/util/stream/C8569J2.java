package p164j$.util.stream;

import p164j$.util.AbstractC8383c0;
import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8356D;
import p164j$.util.InterfaceC8365M;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.J2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8569J2 extends AbstractC8593P2 implements InterfaceC8356D {

    /* renamed from: g */
    final /* synthetic */ C8573K2 f22710g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8569J2(C8573K2 c8573k2, int i, int i2, int i3, int i4) {
        super(c8573k2, i, i2, i3, i4);
        this.f22710g = c8573k2;
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17604l(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8593P2
    /* renamed from: e */
    final void mo17561e(int i, Object obj, Object obj2) {
        ((InterfaceC8483n) obj2).accept(((double[]) obj)[i]);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17609e(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8593P2
    /* renamed from: g */
    final InterfaceC8365M mo17559g(Object obj, int i, int i2) {
        return AbstractC8383c0.m17754j((double[]) obj, i, i2 + i);
    }

    @Override // p164j$.util.stream.AbstractC8593P2
    /* renamed from: h */
    final InterfaceC8365M mo17558h(int i, int i2, int i3, int i4) {
        return new C8569J2(this.f22710g, i, i2, i3, i4);
    }
}
