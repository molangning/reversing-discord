package p164j$.util.stream;

import p164j$.util.function.C8431H;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.P */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8590P extends AbstractC8605T implements InterfaceC8661f2 {

    /* renamed from: b */
    final InterfaceC8437K f22736b;

    public C8590P(InterfaceC8437K interfaceC8437K, boolean z) {
        super(z);
        this.f22736b = interfaceC8437K;
    }

    @Override // p164j$.util.stream.AbstractC8605T, p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        this.f22736b.accept(i);
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17408h((Integer) obj);
    }

    @Override // p164j$.util.stream.InterfaceC8661f2
    /* renamed from: h */
    public final /* synthetic */ void mo17408h(Integer num) {
        AbstractC8744w0.m17329s0(this, num);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }
}