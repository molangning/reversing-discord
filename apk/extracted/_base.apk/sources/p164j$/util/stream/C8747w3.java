package p164j$.util.stream;

import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8362J;
import p164j$.util.Spliterator;
import p164j$.util.function.C8462c0;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.w3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8747w3 extends AbstractC8752x3 implements InterfaceC8362J, InterfaceC8468f0 {

    /* renamed from: e */
    long f22985e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8747w3(InterfaceC8362J interfaceC8362J, long j, long j2) {
        super(interfaceC8362J, j, j2);
    }

    C8747w3(InterfaceC8362J interfaceC8362J, C8747w3 c8747w3) {
        super(interfaceC8362J, c8747w3);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17602n(this, consumer);
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    public final void accept(long j) {
        this.f22985e = j;
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17607h(this, consumer);
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }

    @Override // p164j$.util.stream.AbstractC8526A3
    /* renamed from: s */
    protected final Spliterator mo17304s(Spliterator spliterator) {
        return new C8747w3((InterfaceC8362J) spliterator, this);
    }

    @Override // p164j$.util.stream.AbstractC8752x3
    /* renamed from: u */
    protected final void mo17308u(Object obj) {
        ((InterfaceC8468f0) obj).accept(this.f22985e);
    }

    @Override // p164j$.util.stream.AbstractC8752x3
    /* renamed from: v */
    protected final AbstractC8642b3 mo17307v() {
        return new C8637a3();
    }
}
