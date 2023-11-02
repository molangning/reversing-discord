package p164j$.util.stream;

import p164j$.util.function.InterfaceC8475j;

/* renamed from: j$.util.stream.y1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8755y1 extends AbstractC8744w0 {

    /* renamed from: h */
    final /* synthetic */ InterfaceC8475j f22994h;

    /* renamed from: i */
    final /* synthetic */ double f22995i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8755y1(EnumC8620W2 enumC8620W2, InterfaceC8475j interfaceC8475j, double d) {
        super(enumC8620W2);
        this.f22994h = interfaceC8475j;
        this.f22995i = d;
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: u1 */
    public final InterfaceC8592P1 mo17306u1() {
        return new C8760z1(this.f22995i, this.f22994h);
    }
}
