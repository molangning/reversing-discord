package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8431H;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.h3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8672h3 implements InterfaceC8661f2 {

    /* renamed from: a */
    public final /* synthetic */ int f22865a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8437K f22866b;

    public /* synthetic */ C8672h3(InterfaceC8437K interfaceC8437K, int i) {
        this.f22865a = i;
        this.f22866b = interfaceC8437K;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        switch (this.f22865a) {
            case 0:
                AbstractC8744w0.m17335p0();
                throw null;
            default:
                AbstractC8744w0.m17335p0();
                throw null;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8661f2, p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        int i2 = this.f22865a;
        InterfaceC8437K interfaceC8437K = this.f22866b;
        switch (i2) {
            case 0:
                ((C8581M2) interfaceC8437K).accept(i);
                return;
            default:
                interfaceC8437K.accept(i);
                return;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(long j) {
        switch (this.f22865a) {
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
        switch (this.f22865a) {
            case 0:
                mo17408h((Integer) obj);
                return;
            default:
                mo17408h((Integer) obj);
                return;
        }
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        switch (this.f22865a) {
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

    @Override // p164j$.util.stream.InterfaceC8661f2
    /* renamed from: h */
    public final /* synthetic */ void mo17408h(Integer num) {
        switch (this.f22865a) {
            case 0:
                AbstractC8744w0.m17329s0(this, num);
                return;
            default:
                AbstractC8744w0.m17329s0(this, num);
                return;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        switch (this.f22865a) {
            case 0:
                interfaceC8437K.getClass();
                return new C8431H(this, interfaceC8437K);
            default:
                interfaceC8437K.getClass();
                return new C8431H(this, interfaceC8437K);
        }
    }
}