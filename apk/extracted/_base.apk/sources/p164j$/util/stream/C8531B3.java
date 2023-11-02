package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.B3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8531B3 implements InterfaceC8671h2 {

    /* renamed from: a */
    public final /* synthetic */ int f22649a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f22650b;

    public /* synthetic */ C8531B3(Consumer consumer, int i) {
        this.f22649a = i;
        this.f22650b = consumer;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        switch (this.f22649a) {
            case 0:
                AbstractC8744w0.m17335p0();
                throw null;
            default:
                AbstractC8744w0.m17335p0();
                throw null;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(int i) {
        switch (this.f22649a) {
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
        switch (this.f22649a) {
            case 0:
                AbstractC8744w0.m17320x0();
                throw null;
            default:
                AbstractC8744w0.m17320x0();
                throw null;
        }
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f22649a;
        Consumer consumer = this.f22650b;
        switch (i) {
            case 0:
                ((C8600R2) consumer).accept(obj);
                return;
            default:
                consumer.accept(obj);
                return;
        }
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        switch (this.f22649a) {
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
}
