package p164j$.util.stream;

import p164j$.util.function.C8417A;
import p164j$.util.function.C8491r;
import p164j$.util.function.C8497u;
import p164j$.util.function.InterfaceC8421C;
import p164j$.util.function.InterfaceC8483n;
import p164j$.util.function.InterfaceC8489q;
import p164j$.util.function.InterfaceC8495t;
import p164j$.util.function.InterfaceC8501w;
import p164j$.util.function.InterfaceC8507z;

/* renamed from: j$.util.stream.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8733u extends AbstractC8636a2 {

    /* renamed from: b */
    public final /* synthetic */ int f22955b;

    /* renamed from: c */
    final /* synthetic */ AbstractC8643c f22956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8733u(AbstractC8643c abstractC8643c, InterfaceC8671h2 interfaceC8671h2, int i) {
        super(interfaceC8671h2);
        this.f22955b = i;
        this.f22956c = abstractC8643c;
    }

    @Override // p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        int i = this.f22955b;
        InterfaceC8671h2 interfaceC8671h2 = this.f22817a;
        AbstractC8643c abstractC8643c = this.f22956c;
        switch (i) {
            case 0:
                interfaceC8671h2.accept(((C8417A) ((InterfaceC8421C) ((C8738v) abstractC8643c).f22964t)).m17717b(d));
                return;
            case 1:
                interfaceC8671h2.accept(((InterfaceC8489q) ((C8743w) abstractC8643c).f22972t).apply(d));
                return;
            case 2:
                interfaceC8671h2.accept(((C8497u) ((InterfaceC8501w) ((C8748x) abstractC8643c).f22987t)).m17643a(d));
                return;
            case 3:
                interfaceC8671h2.accept(((InterfaceC8507z) ((C8753y) abstractC8643c).f22993t).applyAsLong(d));
                return;
            case 4:
                InterfaceC8552G interfaceC8552G = (InterfaceC8552G) ((InterfaceC8489q) ((C8738v) abstractC8643c).f22964t).apply(d);
                if (interfaceC8552G != null) {
                    try {
                        interfaceC8552G.sequential().mo17585J(new C8728t(1, this));
                    } catch (Throwable th2) {
                        try {
                            interfaceC8552G.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (interfaceC8552G != null) {
                    interfaceC8552G.close();
                    return;
                }
                return;
            case 5:
                if (((C8491r) ((InterfaceC8495t) ((C8738v) abstractC8643c).f22964t)).m17646e(d)) {
                    interfaceC8671h2.accept(d);
                    return;
                }
                return;
            default:
                ((InterfaceC8483n) ((C8738v) abstractC8643c).f22964t).accept(d);
                interfaceC8671h2.accept(d);
                return;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        int i = this.f22955b;
        InterfaceC8671h2 interfaceC8671h2 = this.f22817a;
        switch (i) {
            case 4:
                interfaceC8671h2.mo17302g(-1L);
                return;
            case 5:
                interfaceC8671h2.mo17302g(-1L);
                return;
            default:
                interfaceC8671h2.mo17302g(j);
                return;
        }
    }
}