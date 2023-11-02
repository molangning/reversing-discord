package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.d2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8651d2 implements InterfaceC8671h2 {

    /* renamed from: a */
    protected final InterfaceC8671h2 f22839a;

    public AbstractC8651d2(InterfaceC8671h2 interfaceC8671h2) {
        interfaceC8671h2.getClass();
        this.f22839a = interfaceC8671h2;
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
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public void end() {
        this.f22839a.end();
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public boolean mo17301i() {
        return this.f22839a.mo17301i();
    }
}