package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8431H;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8429G;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.J1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8568J1 implements InterfaceC8592P1, InterfaceC8661f2 {

    /* renamed from: a */
    private int f22707a;

    /* renamed from: b */
    final /* synthetic */ int f22708b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8429G f22709c;

    public C8568J1(int i, InterfaceC8429G interfaceC8429G) {
        this.f22708b = i;
        this.f22709c = interfaceC8429G;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        this.f22707a = this.f22709c.applyAsInt(this.f22707a, i);
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
        this.f22707a = this.f22708b;
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        return Integer.valueOf(this.f22707a);
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
        accept(((C8568J1) interfaceC8592P1).f22707a);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }
}