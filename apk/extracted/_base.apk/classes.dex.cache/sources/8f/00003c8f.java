package p164j$.util.stream;

/* renamed from: j$.util.stream.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8748x extends AbstractC8644c0 {

    /* renamed from: s */
    public final /* synthetic */ int f22986s;

    /* renamed from: t */
    final /* synthetic */ Object f22987t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8748x(AbstractC8643c abstractC8643c, int i, Object obj, int i2) {
        super(abstractC8643c, i);
        this.f22986s = i2;
        this.f22987t = obj;
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        switch (this.f22986s) {
            case 0:
                return new C8733u(this, interfaceC8671h2, 2);
            case 1:
                return new C8621X(this, interfaceC8671h2, 1);
            case 2:
                return new C8621X(this, interfaceC8671h2, 3);
            case 3:
                return new C8621X(this, interfaceC8671h2, 7);
            case 4:
                return new C8621X(this, interfaceC8671h2, 8);
            case 5:
                return new C8664g0(this, interfaceC8671h2, 3);
            case 6:
                return new C8607T1(this, interfaceC8671h2, 3);
            default:
                return new C8713q(this, interfaceC8671h2);
        }
    }
}