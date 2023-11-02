package p164j$.util.stream;

import p164j$.util.function.C8476j0;
import p164j$.util.function.C8482m0;
import p164j$.util.function.C8488p0;
import p164j$.util.function.InterfaceC8468f0;
import p164j$.util.function.InterfaceC8474i0;
import p164j$.util.function.InterfaceC8480l0;
import p164j$.util.function.InterfaceC8486o0;
import p164j$.util.function.InterfaceC8492r0;
import p164j$.util.function.InterfaceC8500v0;

/* renamed from: j$.util.stream.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8664g0 extends AbstractC8646c2 {

    /* renamed from: b */
    public final /* synthetic */ int f22862b;

    /* renamed from: c */
    final /* synthetic */ AbstractC8643c f22863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8664g0(AbstractC8643c abstractC8643c, InterfaceC8671h2 interfaceC8671h2, int i) {
        super(interfaceC8671h2);
        this.f22862b = i;
        this.f22863c = abstractC8643c;
    }

    @Override // p164j$.util.stream.InterfaceC8666g2, p164j$.util.stream.InterfaceC8671h2
    public final void accept(long j) {
        int i = this.f22862b;
        AbstractC8643c abstractC8643c = this.f22863c;
        InterfaceC8671h2 interfaceC8671h2 = this.f22835a;
        switch (i) {
            case 0:
                interfaceC8671h2.accept(j);
                return;
            case 1:
                interfaceC8671h2.accept(((InterfaceC8500v0) ((C8753y) abstractC8643c).f22993t).applyAsLong(j));
                return;
            case 2:
                interfaceC8671h2.accept(((InterfaceC8474i0) ((C8743w) abstractC8643c).f22972t).apply(j));
                return;
            case 3:
                interfaceC8671h2.accept(((C8488p0) ((InterfaceC8492r0) ((C8748x) abstractC8643c).f22987t)).m17653a(j));
                return;
            case 4:
                interfaceC8671h2.accept(((C8482m0) ((InterfaceC8486o0) ((C8738v) abstractC8643c).f22964t)).m17658a(j));
                return;
            case 5:
                InterfaceC8699n0 interfaceC8699n0 = (InterfaceC8699n0) ((InterfaceC8474i0) ((C8753y) abstractC8643c).f22993t).apply(j);
                if (interfaceC8699n0 != null) {
                    try {
                        interfaceC8699n0.sequential().mo17422G(new C8654e0(1, this));
                    } catch (Throwable th2) {
                        try {
                            interfaceC8699n0.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (interfaceC8699n0 != null) {
                    interfaceC8699n0.close();
                    return;
                }
                return;
            case 6:
                if (((C8476j0) ((InterfaceC8480l0) ((C8753y) abstractC8643c).f22993t)).m17662e(j)) {
                    interfaceC8671h2.accept(j);
                    return;
                }
                return;
            default:
                ((InterfaceC8468f0) ((C8753y) abstractC8643c).f22993t).accept(j);
                interfaceC8671h2.accept(j);
                return;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        int i = this.f22862b;
        InterfaceC8671h2 interfaceC8671h2 = this.f22835a;
        switch (i) {
            case 5:
                interfaceC8671h2.mo17302g(-1L);
                return;
            case 6:
                interfaceC8671h2.mo17302g(-1L);
                return;
            default:
                interfaceC8671h2.mo17302g(j);
                return;
        }
    }
}
