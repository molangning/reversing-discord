package p164j$.util.stream;

import p164j$.util.function.C8462c0;
import p164j$.util.function.C8476j0;
import p164j$.util.function.InterfaceC8468f0;
import p164j$.util.function.InterfaceC8480l0;

/* renamed from: j$.util.stream.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8714q0 extends AbstractC8724s0 implements InterfaceC8666g2 {

    /* renamed from: c */
    final /* synthetic */ EnumC8729t0 f22920c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC8480l0 f22921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8714q0(InterfaceC8480l0 interfaceC8480l0, EnumC8729t0 enumC8729t0) {
        super(enumC8729t0);
        this.f22920c = enumC8729t0;
        this.f22921d = interfaceC8480l0;
    }

    @Override // p164j$.util.stream.AbstractC8724s0, p164j$.util.stream.InterfaceC8671h2
    public final void accept(long j) {
        boolean z;
        boolean z2;
        if (this.f22941a) {
            return;
        }
        boolean m17662e = ((C8476j0) this.f22921d).m17662e(j);
        EnumC8729t0 enumC8729t0 = this.f22920c;
        z = enumC8729t0.f22947a;
        if (m17662e == z) {
            this.f22941a = true;
            z2 = enumC8729t0.f22948b;
            this.f22942b = z2;
        }
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17315m((Long) obj);
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