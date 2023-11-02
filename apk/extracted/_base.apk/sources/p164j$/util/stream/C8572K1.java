package p164j$.util.stream;

import p164j$.util.C8513k;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8431H;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8429G;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.K1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8572K1 implements InterfaceC8592P1, InterfaceC8661f2 {

    /* renamed from: a */
    private boolean f22712a;

    /* renamed from: b */
    private int f22713b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8429G f22714c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8572K1(InterfaceC8429G interfaceC8429G) {
        this.f22714c = interfaceC8429G;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        if (this.f22712a) {
            this.f22712a = false;
        } else {
            i = this.f22714c.applyAsInt(this.f22713b, i);
        }
        this.f22713b = i;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(long j) {
        AbstractC8744w0.m17320x0();
        throw null;
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17408h((Integer) obj);
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
        this.f22712a = true;
        this.f22713b = 0;
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        return this.f22712a ? C8513k.m17617a() : C8513k.m17614d(this.f22713b);
    }

    @Override // p164j$.util.stream.InterfaceC8661f2
    /* renamed from: h */
    public final /* synthetic */ void mo17408h(Integer num) {
        AbstractC8744w0.m17329s0(this, num);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.stream.InterfaceC8592P1
    /* renamed from: l */
    public final void mo17300l(InterfaceC8592P1 interfaceC8592P1) {
        C8572K1 c8572k1 = (C8572K1) interfaceC8592P1;
        if (c8572k1.f22712a) {
            return;
        }
        accept(c8572k1.f22713b);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }
}
