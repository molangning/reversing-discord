package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8462c0;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8426E0;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8467f;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.x1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8750x1 extends AbstractC8596Q1 implements InterfaceC8592P1, InterfaceC8666g2 {

    /* renamed from: b */
    final /* synthetic */ InterfaceC8438K0 f22988b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8426E0 f22989c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC8467f f22990d;

    public C8750x1(InterfaceC8438K0 interfaceC8438K0, InterfaceC8426E0 interfaceC8426E0, InterfaceC8467f interfaceC8467f) {
        this.f22988b = interfaceC8438K0;
        this.f22989c = interfaceC8426E0;
        this.f22990d = interfaceC8467f;
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
    public final void accept(long j) {
        this.f22989c.accept(this.f22744a, j);
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17315m((Long) obj);
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
        this.f22744a = this.f22988b.get();
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }

    @Override // p164j$.util.stream.InterfaceC8592P1
    /* renamed from: l */
    public final void mo17300l(InterfaceC8592P1 interfaceC8592P1) {
        this.f22744a = this.f22990d.apply(this.f22744a, ((C8750x1) interfaceC8592P1).f22744a);
    }

    @Override // p164j$.util.stream.InterfaceC8666g2
    /* renamed from: m */
    public final /* synthetic */ void mo17315m(Long l) {
        AbstractC8744w0.m17325u0(this, l);
    }
}