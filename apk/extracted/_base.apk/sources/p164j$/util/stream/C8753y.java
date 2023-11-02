package p164j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8753y extends AbstractC8679j0 {

    /* renamed from: s */
    public final /* synthetic */ int f22992s;

    /* renamed from: t */
    final /* synthetic */ Object f22993t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8753y(AbstractC8643c abstractC8643c, int i, Object obj, int i2) {
        super(abstractC8643c, i);
        this.f22992s = i2;
        this.f22993t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        switch (this.f22992s) {
            case 0:
                return new C8733u(this, interfaceC8671h2, 3);
            case 1:
                return new C8621X(this, interfaceC8671h2, 5);
            case 2:
                return new C8664g0(this, interfaceC8671h2, 1);
            case 3:
                return new C8664g0(this, interfaceC8671h2, 5);
            case 4:
                return new C8664g0(this, interfaceC8671h2, 6);
            case 5:
                return new C8664g0(this, interfaceC8671h2, 7);
            case 6:
                return new C8713q(this, interfaceC8671h2);
            default:
                return new C8607T1(this, interfaceC8671h2, 4);
        }
    }
}
