package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8477k;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8467f;
import p164j$.util.function.InterfaceC8483n;
import p164j$.util.function.InterfaceC8506y0;

/* renamed from: j$.util.stream.C1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8534C1 extends AbstractC8596Q1 implements InterfaceC8592P1, InterfaceC8656e2 {

    /* renamed from: b */
    final /* synthetic */ InterfaceC8438K0 f22651b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8506y0 f22652c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC8467f f22653d;

    public C8534C1(InterfaceC8438K0 interfaceC8438K0, InterfaceC8506y0 interfaceC8506y0, InterfaceC8467f interfaceC8467f) {
        this.f22651b = interfaceC8438K0;
        this.f22652c = interfaceC8506y0;
        this.f22653d = interfaceC8467f;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        this.f22652c.accept(this.f22744a, d);
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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17298q((Double) obj);
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
        this.f22744a = this.f22651b.get();
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.stream.InterfaceC8592P1
    /* renamed from: l */
    public final void mo17300l(InterfaceC8592P1 interfaceC8592P1) {
        this.f22744a = this.f22653d.apply(this.f22744a, ((C8534C1) interfaceC8592P1).f22744a);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }

    @Override // p164j$.util.stream.InterfaceC8656e2
    /* renamed from: q */
    public final /* synthetic */ void mo17298q(Double d) {
        AbstractC8744w0.m17333q0(this, d);
    }
}