package p164j$.util.stream;

import p164j$.util.function.Function;

/* renamed from: j$.util.stream.V1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8615V1 extends AbstractC8627Y1 {

    /* renamed from: s */
    public final /* synthetic */ int f22774s;

    /* renamed from: t */
    final /* synthetic */ Function f22775t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8615V1(AbstractC8643c abstractC8643c, int i, Function function, int i2) {
        super(abstractC8643c, i);
        this.f22774s = i2;
        this.f22775t = function;
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        switch (this.f22774s) {
            case 0:
                return new C8607T1(this, interfaceC8671h2, 2);
            default:
                return new C8607T1(this, interfaceC8671h2, 6);
        }
    }
}