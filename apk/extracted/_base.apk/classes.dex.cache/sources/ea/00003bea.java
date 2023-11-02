package p164j$.util.stream;

import p164j$.util.AbstractC8383c0;
import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8362J;
import p164j$.util.InterfaceC8365M;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.N2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8585N2 extends AbstractC8593P2 implements InterfaceC8362J {

    /* renamed from: g */
    final /* synthetic */ C8589O2 f22731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8585N2(C8589O2 c8589o2, int i, int i2, int i3, int i4) {
        super(c8589o2, i, i2, i3, i4);
        this.f22731g = c8589o2;
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17602n(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8593P2
    /* renamed from: e */
    final void mo17561e(int i, Object obj, Object obj2) {
        ((InterfaceC8468f0) obj2).accept(((long[]) obj)[i]);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17607h(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8593P2
    /* renamed from: g */
    final InterfaceC8365M mo17559g(Object obj, int i, int i2) {
        return AbstractC8383c0.m17752l((long[]) obj, i, i2 + i);
    }

    @Override // p164j$.util.stream.AbstractC8593P2
    /* renamed from: h */
    final InterfaceC8365M mo17558h(int i, int i2, int i3, int i4) {
        return new C8585N2(this.f22731g, i, i2, i3, i4);
    }
}