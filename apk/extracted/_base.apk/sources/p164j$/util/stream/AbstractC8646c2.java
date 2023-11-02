package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8462c0;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.c2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8646c2 implements InterfaceC8666g2 {

    /* renamed from: a */
    protected final InterfaceC8671h2 f22835a;

    public AbstractC8646c2(InterfaceC8671h2 interfaceC8671h2) {
        interfaceC8671h2.getClass();
        this.f22835a = interfaceC8671h2;
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
    public void end() {
        this.f22835a.end();
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public boolean mo17301i() {
        return this.f22835a.mo17301i();
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }

    @Override // p164j$.util.stream.InterfaceC8666g2
    /* renamed from: m */
    public final /* synthetic */ void mo17315m(Long l) {
        AbstractC8744w0.m17325u0(this, l);
    }
}
