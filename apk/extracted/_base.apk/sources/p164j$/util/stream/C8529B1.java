package p164j$.util.stream;

import p164j$.util.C8512j;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8477k;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8475j;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.B1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8529B1 implements InterfaceC8592P1, InterfaceC8656e2 {

    /* renamed from: a */
    private boolean f22646a;

    /* renamed from: b */
    private double f22647b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8475j f22648c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8529B1(InterfaceC8475j interfaceC8475j) {
        this.f22648c = interfaceC8475j;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        if (this.f22646a) {
            this.f22646a = false;
        } else {
            d = this.f22648c.applyAsDouble(this.f22647b, d);
        }
        this.f22647b = d;
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
        this.f22646a = true;
        this.f22647b = 0.0d;
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        return this.f22646a ? C8512j.m17621a() : C8512j.m17618d(this.f22647b);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.stream.InterfaceC8592P1
    /* renamed from: l */
    public final void mo17300l(InterfaceC8592P1 interfaceC8592P1) {
        C8529B1 c8529b1 = (C8529B1) interfaceC8592P1;
        if (c8529b1.f22646a) {
            return;
        }
        accept(c8529b1.f22647b);
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
