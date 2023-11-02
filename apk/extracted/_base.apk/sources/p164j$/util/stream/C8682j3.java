package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8462c0;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.j3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8682j3 implements InterfaceC8666g2 {

    /* renamed from: a */
    public final /* synthetic */ int f22878a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8468f0 f22879b;

    public /* synthetic */ C8682j3(InterfaceC8468f0 interfaceC8468f0, int i) {
        this.f22878a = i;
        this.f22879b = interfaceC8468f0;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        switch (this.f22878a) {
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
        switch (this.f22878a) {
            case 0:
                AbstractC8744w0.m17322w0();
                throw null;
            default:
                AbstractC8744w0.m17322w0();
                throw null;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8666g2, p164j$.util.stream.InterfaceC8671h2
    public final void accept(long j) {
        int i = this.f22878a;
        InterfaceC8468f0 interfaceC8468f0 = this.f22879b;
        switch (i) {
            case 0:
                ((C8589O2) interfaceC8468f0).accept(j);
                return;
            default:
                interfaceC8468f0.accept(j);
                return;
        }
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f22878a) {
            case 0:
                mo17315m((Long) obj);
                return;
            default:
                mo17315m((Long) obj);
                return;
        }
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        switch (this.f22878a) {
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

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        switch (this.f22878a) {
            case 0:
                interfaceC8468f0.getClass();
                return new C8462c0(this, interfaceC8468f0);
            default:
                interfaceC8468f0.getClass();
                return new C8462c0(this, interfaceC8468f0);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8666g2
    /* renamed from: m */
    public final /* synthetic */ void mo17315m(Long l) {
        switch (this.f22878a) {
            case 0:
                AbstractC8744w0.m17325u0(this, l);
                return;
            default:
                AbstractC8744w0.m17325u0(this, l);
                return;
        }
    }
}
