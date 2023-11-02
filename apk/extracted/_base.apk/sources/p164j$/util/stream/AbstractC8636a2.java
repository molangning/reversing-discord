package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8477k;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.a2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8636a2 implements InterfaceC8656e2 {

    /* renamed from: a */
    protected final InterfaceC8671h2 f22817a;

    public AbstractC8636a2(InterfaceC8671h2 interfaceC8671h2) {
        interfaceC8671h2.getClass();
        this.f22817a = interfaceC8671h2;
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
    public void end() {
        this.f22817a.end();
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public boolean mo17301i() {
        return this.f22817a.mo17301i();
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
