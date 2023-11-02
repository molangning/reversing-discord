package p164j$.util.stream;

import p164j$.util.function.InterfaceC8429G;

/* renamed from: j$.util.stream.I1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8564I1 extends AbstractC8744w0 {

    /* renamed from: h */
    final /* synthetic */ InterfaceC8429G f22696h;

    /* renamed from: i */
    final /* synthetic */ int f22697i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8564I1(EnumC8620W2 enumC8620W2, InterfaceC8429G interfaceC8429G, int i) {
        super(enumC8620W2);
        this.f22696h = interfaceC8429G;
        this.f22697i = i;
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: u1 */
    public final InterfaceC8592P1 mo17306u1() {
        return new C8568J1(this.f22697i, this.f22696h);
    }
}