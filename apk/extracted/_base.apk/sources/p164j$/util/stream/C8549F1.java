package p164j$.util.stream;

import p164j$.util.function.BiConsumer;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8467f;

/* renamed from: j$.util.stream.F1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8549F1 extends AbstractC8744w0 {

    /* renamed from: h */
    final /* synthetic */ InterfaceC8467f f22669h;

    /* renamed from: i */
    final /* synthetic */ BiConsumer f22670i;

    /* renamed from: j */
    final /* synthetic */ InterfaceC8438K0 f22671j;

    /* renamed from: k */
    final /* synthetic */ InterfaceC8693m f22672k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8549F1(EnumC8620W2 enumC8620W2, InterfaceC8467f interfaceC8467f, BiConsumer biConsumer, InterfaceC8438K0 interfaceC8438K0, InterfaceC8693m interfaceC8693m) {
        super(enumC8620W2);
        this.f22669h = interfaceC8467f;
        this.f22670i = biConsumer;
        this.f22671j = interfaceC8438K0;
        this.f22672k = interfaceC8693m;
    }

    @Override // p164j$.util.stream.AbstractC8744w0, p164j$.util.stream.InterfaceC8546E3
    /* renamed from: P */
    public final int mo17363P() {
        if (((C8683k) this.f22672k).m17450b().contains(EnumC8678j.UNORDERED)) {
            return EnumC8616V2.f22788r;
        }
        return 0;
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: u1 */
    public final InterfaceC8592P1 mo17306u1() {
        return new C8554G1(this.f22671j, this.f22670i, this.f22669h);
    }
}
