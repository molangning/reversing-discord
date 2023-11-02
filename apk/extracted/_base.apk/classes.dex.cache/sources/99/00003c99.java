package p164j$.util.stream;

/* renamed from: j$.util.stream.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8758z extends AbstractC8532C {

    /* renamed from: s */
    public final /* synthetic */ int f22998s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8758z(AbstractC8643c abstractC8643c, int i, int i2) {
        super(abstractC8643c, i);
        this.f22998s = i2;
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        switch (this.f22998s) {
            case 0:
                return interfaceC8671h2;
            case 1:
                return new C8621X(this, interfaceC8671h2, 2);
            default:
                return new C8664g0(this, interfaceC8671h2, 0);
        }
    }
}