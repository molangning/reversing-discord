package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.M */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8578M implements InterfaceC8551F3 {

    /* renamed from: a */
    boolean f22720a;

    /* renamed from: b */
    Object f22721b;

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public /* synthetic */ void accept(int i) {
        AbstractC8744w0.m17322w0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public /* synthetic */ void accept(long j) {
        AbstractC8744w0.m17320x0();
        throw null;
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: accept */
    public final void m17568q(Object obj) {
        if (this.f22720a) {
            return;
        }
        this.f22720a = true;
        this.f22721b = obj;
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
    public final /* synthetic */ void mo17302g(long j) {
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final boolean mo17301i() {
        return this.f22720a;
    }
}
