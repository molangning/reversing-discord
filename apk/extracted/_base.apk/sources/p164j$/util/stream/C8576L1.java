package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8431H;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8420B0;
import p164j$.util.function.InterfaceC8437K;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8467f;

/* renamed from: j$.util.stream.L1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8576L1 extends AbstractC8596Q1 implements InterfaceC8592P1, InterfaceC8661f2 {

    /* renamed from: b */
    final /* synthetic */ InterfaceC8438K0 f22716b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8420B0 f22717c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC8467f f22718d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8576L1(InterfaceC8438K0 interfaceC8438K0, InterfaceC8420B0 interfaceC8420B0, InterfaceC8467f interfaceC8467f) {
        this.f22716b = interfaceC8438K0;
        this.f22717c = interfaceC8420B0;
        this.f22718d = interfaceC8467f;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        this.f22717c.accept(this.f22744a, i);
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
    public final /* synthetic */ void end() {
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        this.f22744a = this.f22716b.get();
    }

    @Override // p164j$.util.stream.InterfaceC8661f2
    /* renamed from: h */
    public final /* synthetic */ void mo17408h(Integer num) {
        AbstractC8744w0.m17329s0(this, num);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.stream.InterfaceC8592P1
    /* renamed from: l */
    public final void mo17300l(InterfaceC8592P1 interfaceC8592P1) {
        this.f22744a = this.f22718d.apply(this.f22744a, ((C8576L1) interfaceC8592P1).f22744a);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }
}
