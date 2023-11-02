package p164j$.util.stream;

import p164j$.util.function.C8431H;
import p164j$.util.function.C8441M;
import p164j$.util.function.InterfaceC8437K;
import p164j$.util.function.InterfaceC8445O;

/* renamed from: j$.util.stream.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8709p0 extends AbstractC8724s0 implements InterfaceC8661f2 {

    /* renamed from: c */
    final /* synthetic */ EnumC8729t0 f22911c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC8445O f22912d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8709p0(InterfaceC8445O interfaceC8445O, EnumC8729t0 enumC8729t0) {
        super(enumC8729t0);
        this.f22911c = enumC8729t0;
        this.f22912d = interfaceC8445O;
    }

    @Override // p164j$.util.stream.AbstractC8724s0, p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        boolean z;
        boolean z2;
        if (this.f22941a) {
            return;
        }
        boolean m17696e = ((C8441M) this.f22912d).m17696e(i);
        EnumC8729t0 enumC8729t0 = this.f22911c;
        z = enumC8729t0.f22947a;
        if (m17696e == z) {
            this.f22941a = true;
            z2 = enumC8729t0.f22948b;
            this.f22942b = z2;
        }
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
