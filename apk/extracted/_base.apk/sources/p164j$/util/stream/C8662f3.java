package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8477k;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.f3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8662f3 implements InterfaceC8656e2 {

    /* renamed from: a */
    public final /* synthetic */ int f22859a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8483n f22860b;

    public /* synthetic */ C8662f3(InterfaceC8483n interfaceC8483n, int i) {
        this.f22859a = i;
        this.f22860b = interfaceC8483n;
    }

    @Override // p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        int i = this.f22859a;
        InterfaceC8483n interfaceC8483n = this.f22860b;
        switch (i) {
            case 0:
                ((C8573K2) interfaceC8483n).accept(d);
                return;
            default:
                interfaceC8483n.accept(d);
                return;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(int i) {
        switch (this.f22859a) {
            case 0:
                AbstractC8744w0.m17322w0();
                throw null;
            default:
                AbstractC8744w0.m17322w0();
                throw null;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(long j) {
        switch (this.f22859a) {
            case 0:
                AbstractC8744w0.m17320x0();
                throw null;
            default:
                AbstractC8744w0.m17320x0();
                throw null;
        }
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f22859a) {
            case 0:
                mo17298q((Double) obj);
                return;
            default:
                mo17298q((Double) obj);
                return;
        }
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        switch (this.f22859a) {
            case 0:
                consumer.getClass();
                return new C8406u(3, this, consumer);
            default:
                consumer.getClass();
                return new C8406u(3, this, consumer);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void end() {
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final /* synthetic */ void mo17302g(long j) {
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        switch (this.f22859a) {
            case 0:
                interfaceC8483n.getClass();
                return new C8477k(this, interfaceC8483n);
            default:
                interfaceC8483n.getClass();
                return new C8477k(this, interfaceC8483n);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8656e2
    /* renamed from: q */
    public final /* synthetic */ void mo17298q(Double d) {
        switch (this.f22859a) {
            case 0:
                AbstractC8744w0.m17333q0(this, d);
                return;
            default:
                AbstractC8744w0.m17333q0(this, d);
                return;
        }
    }
}
