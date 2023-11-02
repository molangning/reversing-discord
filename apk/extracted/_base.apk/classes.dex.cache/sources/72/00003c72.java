package p164j$.util.stream;

import p164j$.util.function.C8477k;
import p164j$.util.function.C8491r;
import p164j$.util.function.InterfaceC8483n;
import p164j$.util.function.InterfaceC8495t;

/* renamed from: j$.util.stream.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8719r0 extends AbstractC8724s0 implements InterfaceC8656e2 {

    /* renamed from: c */
    final /* synthetic */ EnumC8729t0 f22924c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC8495t f22925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8719r0(InterfaceC8495t interfaceC8495t, EnumC8729t0 enumC8729t0) {
        super(enumC8729t0);
        this.f22924c = enumC8729t0;
        this.f22925d = interfaceC8495t;
    }

    @Override // p164j$.util.stream.AbstractC8724s0, p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        boolean z;
        boolean z2;
        if (this.f22941a) {
            return;
        }
        boolean m17646e = ((C8491r) this.f22925d).m17646e(d);
        EnumC8729t0 enumC8729t0 = this.f22924c;
        z = enumC8729t0.f22947a;
        if (m17646e == z) {
            this.f22941a = true;
            z2 = enumC8729t0.f22948b;
            this.f22942b = z2;
        }
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17298q((Double) obj);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }

    @Override // p164j$.util.stream.InterfaceC8656e2
    /* renamed from: q */
    public final /* synthetic */ void mo17298q(Double d) {
        AbstractC8744w0.m17333q0(this, d);
    }
}