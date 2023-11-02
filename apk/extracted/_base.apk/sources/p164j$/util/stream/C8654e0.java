package p164j$.util.stream;

import p164j$.util.function.C8462c0;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8654e0 implements InterfaceC8468f0 {

    /* renamed from: a */
    public final /* synthetic */ int f22845a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8671h2 f22846b;

    public /* synthetic */ C8654e0(int i, InterfaceC8671h2 interfaceC8671h2) {
        this.f22845a = i;
        this.f22846b = interfaceC8671h2;
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    public final void accept(long j) {
        int i = this.f22845a;
        InterfaceC8671h2 interfaceC8671h2 = this.f22846b;
        switch (i) {
            case 0:
                interfaceC8671h2.accept(j);
                return;
            default:
                ((C8664g0) interfaceC8671h2).f22835a.accept(j);
                return;
        }
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        switch (this.f22845a) {
            case 0:
                interfaceC8468f0.getClass();
                return new C8462c0(this, interfaceC8468f0);
            default:
                interfaceC8468f0.getClass();
                return new C8462c0(this, interfaceC8468f0);
        }
    }
}
