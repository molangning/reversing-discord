package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8467f;

/* renamed from: j$.util.stream.G1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8554G1 extends AbstractC8596Q1 implements InterfaceC8592P1 {

    /* renamed from: b */
    final /* synthetic */ InterfaceC8438K0 f22676b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f22677c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC8467f f22678d;

    public C8554G1(InterfaceC8438K0 interfaceC8438K0, BiConsumer biConsumer, InterfaceC8467f interfaceC8467f) {
        this.f22676b = interfaceC8438K0;
        this.f22677c = biConsumer;
        this.f22678d = interfaceC8467f;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(int i) {
        AbstractC8744w0.m17322w0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(long j) {
        AbstractC8744w0.m17320x0();
        throw null;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f22677c.accept(this.f22744a, obj);
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
        this.f22744a = this.f22676b.get();
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.stream.InterfaceC8592P1
    /* renamed from: l */
    public final void mo17300l(InterfaceC8592P1 interfaceC8592P1) {
        this.f22744a = this.f22678d.apply(this.f22744a, ((C8554G1) interfaceC8592P1).f22744a);
    }
}