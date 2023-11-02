package p164j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8743w extends AbstractC8627Y1 {

    /* renamed from: s */
    public final /* synthetic */ int f22971s;

    /* renamed from: t */
    final /* synthetic */ Object f22972t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8743w(AbstractC8643c abstractC8643c, int i, Object obj, int i2) {
        super(abstractC8643c, i);
        this.f22971s = i2;
        this.f22972t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        switch (this.f22971s) {
            case 0:
                return new C8733u(this, interfaceC8671h2, 1);
            case 1:
                return new C8621X(this, interfaceC8671h2, 4);
            case 2:
                return new C8664g0(this, interfaceC8671h2, 2);
            case 3:
                return new C8607T1(this, interfaceC8671h2, 0);
            default:
                return new C8607T1(this, interfaceC8671h2, 1);
        }
    }
}
