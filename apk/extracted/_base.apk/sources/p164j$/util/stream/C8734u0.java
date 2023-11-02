package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.InterfaceC8438K0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8734u0 implements InterfaceC8546E3 {

    /* renamed from: a */
    final EnumC8729t0 f22957a;

    /* renamed from: b */
    final InterfaceC8438K0 f22958b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8734u0(EnumC8620W2 enumC8620W2, EnumC8729t0 enumC8729t0, C8703o c8703o) {
        this.f22957a = enumC8729t0;
        this.f22958b = c8703o;
    }

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: P */
    public final int mo17363P() {
        return EnumC8616V2.f22791u | EnumC8616V2.f22788r;
    }

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: n0 */
    public final Object mo17338n0(AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        AbstractC8724s0 abstractC8724s0 = (AbstractC8724s0) this.f22958b.get();
        abstractC8744w0.mo17321w1(spliterator, abstractC8724s0);
        return Boolean.valueOf(abstractC8724s0.f22942b);
    }

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: y */
    public final Object mo17318y(AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        return (Boolean) new C8739v0(this, abstractC8744w0, spliterator).invoke();
    }
}
