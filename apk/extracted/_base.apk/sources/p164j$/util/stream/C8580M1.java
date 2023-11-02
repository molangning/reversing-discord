package p164j$.util.stream;

import p164j$.util.function.InterfaceC8460b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.M1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8580M1 extends AbstractC8744w0 {

    /* renamed from: h */
    final /* synthetic */ InterfaceC8460b0 f22725h;

    /* renamed from: i */
    final /* synthetic */ long f22726i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8580M1(EnumC8620W2 enumC8620W2, InterfaceC8460b0 interfaceC8460b0, long j) {
        super(enumC8620W2);
        this.f22725h = interfaceC8460b0;
        this.f22726i = j;
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: u1 */
    public final InterfaceC8592P1 mo17306u1() {
        return new C8584N1(this.f22726i, this.f22725h);
    }
}
