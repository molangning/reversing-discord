package p164j$.util.stream;

import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8359G;
import p164j$.util.Spliterator;
import p164j$.util.function.C8431H;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.v3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8742v3 extends AbstractC8752x3 implements InterfaceC8359G, InterfaceC8437K {

    /* renamed from: e */
    int f22970e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8742v3(InterfaceC8359G interfaceC8359G, long j, long j2) {
        super(interfaceC8359G, j, j2);
    }

    C8742v3(InterfaceC8359G interfaceC8359G, C8742v3 c8742v3) {
        super(interfaceC8359G, c8742v3);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17603m(this, consumer);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    public final void accept(int i) {
        this.f22970e = i;
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17608g(this, consumer);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }

    @Override // p164j$.util.stream.AbstractC8526A3
    /* renamed from: s */
    protected final Spliterator mo17304s(Spliterator spliterator) {
        return new C8742v3((InterfaceC8359G) spliterator, this);
    }

    @Override // p164j$.util.stream.AbstractC8752x3
    /* renamed from: u */
    protected final void mo17308u(Object obj) {
        ((InterfaceC8437K) obj).accept(this.f22970e);
    }

    @Override // p164j$.util.stream.AbstractC8752x3
    /* renamed from: v */
    protected final AbstractC8642b3 mo17307v() {
        return new C8632Z2();
    }
}
