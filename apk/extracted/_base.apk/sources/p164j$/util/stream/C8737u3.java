package p164j$.util.stream;

import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8356D;
import p164j$.util.Spliterator;
import p164j$.util.function.C8477k;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.u3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8737u3 extends AbstractC8752x3 implements InterfaceC8356D, InterfaceC8483n {

    /* renamed from: e */
    double f22962e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8737u3(InterfaceC8356D interfaceC8356D, long j, long j2) {
        super(interfaceC8356D, j, j2);
    }

    C8737u3(InterfaceC8356D interfaceC8356D, C8737u3 c8737u3) {
        super(interfaceC8356D, c8737u3);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17604l(this, consumer);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        this.f22962e = d;
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17609e(this, consumer);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }

    @Override // p164j$.util.stream.AbstractC8526A3
    /* renamed from: s */
    protected final Spliterator mo17304s(Spliterator spliterator) {
        return new C8737u3((InterfaceC8356D) spliterator, this);
    }

    @Override // p164j$.util.stream.AbstractC8752x3
    /* renamed from: u */
    protected final void mo17308u(Object obj) {
        ((InterfaceC8483n) obj).accept(this.f22962e);
    }

    @Override // p164j$.util.stream.AbstractC8752x3
    /* renamed from: v */
    protected final AbstractC8642b3 mo17307v() {
        return new C8628Y2();
    }
}
