package p164j$.util.stream;

import p164j$.util.function.C8431H;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.W */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8617W implements InterfaceC8437K {

    /* renamed from: a */
    public final /* synthetic */ int f22798a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8671h2 f22799b;

    public /* synthetic */ C8617W(int i, InterfaceC8671h2 interfaceC8671h2) {
        this.f22798a = i;
        this.f22799b = interfaceC8671h2;
    }

    @Override // p164j$.util.function.InterfaceC8437K
    public final void accept(int i) {
        int i2 = this.f22798a;
        InterfaceC8671h2 interfaceC8671h2 = this.f22799b;
        switch (i2) {
            case 0:
                interfaceC8671h2.accept(i);
                return;
            default:
                ((C8621X) interfaceC8671h2).f22822a.accept(i);
                return;
        }
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        switch (this.f22798a) {
            case 0:
                interfaceC8437K.getClass();
                return new C8431H(this, interfaceC8437K);
            default:
                interfaceC8437K.getClass();
                return new C8431H(this, interfaceC8437K);
        }
    }
}
