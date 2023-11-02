package p164j$.util.stream;

import p164j$.util.function.C8477k;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8728t implements InterfaceC8483n {

    /* renamed from: a */
    public final /* synthetic */ int f22944a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8671h2 f22945b;

    public /* synthetic */ C8728t(int i, InterfaceC8671h2 interfaceC8671h2) {
        this.f22944a = i;
        this.f22945b = interfaceC8671h2;
    }

    @Override // p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        int i = this.f22944a;
        InterfaceC8671h2 interfaceC8671h2 = this.f22945b;
        switch (i) {
            case 0:
                interfaceC8671h2.accept(d);
                return;
            default:
                ((C8733u) interfaceC8671h2).f22817a.accept(d);
                return;
        }
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        switch (this.f22944a) {
            case 0:
                interfaceC8483n.getClass();
                return new C8477k(this, interfaceC8483n);
            default:
                interfaceC8483n.getClass();
                return new C8477k(this, interfaceC8483n);
        }
    }
}
