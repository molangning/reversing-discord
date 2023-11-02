package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8431H;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.b2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8641b2 implements InterfaceC8661f2 {

    /* renamed from: a */
    protected final InterfaceC8671h2 f22822a;

    public AbstractC8641b2(InterfaceC8671h2 interfaceC8671h2) {
        interfaceC8671h2.getClass();
        this.f22822a = interfaceC8671h2;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(long j) {
        AbstractC8744w0.m17320x0();
        throw null;
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17408h((Integer) obj);
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public void end() {
        this.f22822a.end();
    }

    @Override // p164j$.util.stream.InterfaceC8661f2
    /* renamed from: h */
    public final /* synthetic */ void mo17408h(Integer num) {
        AbstractC8744w0.m17329s0(this, num);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public boolean mo17301i() {
        return this.f22822a.mo17301i();
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }
}
