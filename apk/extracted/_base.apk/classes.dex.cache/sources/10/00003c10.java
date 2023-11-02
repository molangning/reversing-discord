package p164j$.util.stream;

import p164j$.util.function.C8441M;
import p164j$.util.function.C8447P;
import p164j$.util.function.C8453W;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8437K;
import p164j$.util.function.InterfaceC8445O;
import p164j$.util.function.InterfaceC8449S;
import p164j$.util.function.InterfaceC8452V;
import p164j$.util.function.InterfaceC8455Y;

/* renamed from: j$.util.stream.X */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8621X extends AbstractC8641b2 {

    /* renamed from: b */
    public final /* synthetic */ int f22801b;

    /* renamed from: c */
    final /* synthetic */ AbstractC8643c f22802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8621X(AbstractC8643c abstractC8643c, InterfaceC8671h2 interfaceC8671h2, int i) {
        super(interfaceC8671h2);
        this.f22801b = i;
        this.f22802c = abstractC8643c;
    }

    @Override // p164j$.util.stream.InterfaceC8661f2, p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        int i2 = this.f22801b;
        AbstractC8643c abstractC8643c = this.f22802c;
        InterfaceC8671h2 interfaceC8671h2 = this.f22822a;
        switch (i2) {
            case 0:
                interfaceC8671h2.accept(i);
                return;
            case 1:
                ((InterfaceC8437K) ((C8748x) abstractC8643c).f22987t).accept(i);
                interfaceC8671h2.accept(i);
                return;
            case 2:
                interfaceC8671h2.accept(i);
                return;
            case 3:
                interfaceC8671h2.accept(((C8453W) ((InterfaceC8455Y) ((C8748x) abstractC8643c).f22987t)).m17683b(i));
                return;
            case 4:
                interfaceC8671h2.accept(((IntFunction) ((C8743w) abstractC8643c).f22972t).apply(i));
                return;
            case 5:
                interfaceC8671h2.accept(((InterfaceC8452V) ((C8753y) abstractC8643c).f22993t).applyAsLong(i));
                return;
            case 6:
                interfaceC8671h2.accept(((C8447P) ((InterfaceC8449S) ((C8738v) abstractC8643c).f22964t)).m17691a(i));
                return;
            case 7:
                IntStream intStream = (IntStream) ((IntFunction) ((C8748x) abstractC8643c).f22987t).apply(i);
                if (intStream != null) {
                    try {
                        intStream.sequential().mo17486a0(new C8617W(1, this));
                    } catch (Throwable th2) {
                        try {
                            intStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                if (((C8441M) ((InterfaceC8445O) ((C8748x) abstractC8643c).f22987t)).m17696e(i)) {
                    interfaceC8671h2.accept(i);
                    return;
                }
                return;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        int i = this.f22801b;
        InterfaceC8671h2 interfaceC8671h2 = this.f22822a;
        switch (i) {
            case 7:
                interfaceC8671h2.mo17302g(-1L);
                return;
            case 8:
                interfaceC8671h2.mo17302g(-1L);
                return;
            default:
                interfaceC8671h2.mo17302g(j);
                return;
        }
    }
}