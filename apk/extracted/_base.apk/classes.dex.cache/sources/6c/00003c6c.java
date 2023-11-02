package p164j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import p164j$.util.function.Function;
import p164j$.util.function.InterfaceC8437K;
import p164j$.util.function.InterfaceC8468f0;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8713q extends AbstractC8651d2 {

    /* renamed from: b */
    public final /* synthetic */ int f22917b = 0;

    /* renamed from: c */
    Object f22918c;

    /* renamed from: d */
    final /* synthetic */ AbstractC8643c f22919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8713q(C8718r c8718r, InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
        this.f22919d = c8718r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8713q(C8738v c8738v, InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
        this.f22919d = c8738v;
        this.f22918c = new C8728t(0, interfaceC8671h2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8713q(C8748x c8748x, InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
        this.f22919d = c8748x;
        this.f22918c = new C8617W(0, interfaceC8671h2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8713q(C8753y c8753y, InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
        this.f22919d = c8753y;
        this.f22918c = new C8654e0(0, interfaceC8671h2);
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f22917b;
        AbstractC8643c abstractC8643c = this.f22919d;
        switch (i) {
            case 0:
                if (((Set) this.f22918c).contains(obj)) {
                    return;
                }
                ((Set) this.f22918c).add(obj);
                this.f22839a.accept(obj);
                return;
            case 1:
                InterfaceC8699n0 interfaceC8699n0 = (InterfaceC8699n0) ((Function) ((C8753y) abstractC8643c).f22993t).apply(obj);
                if (interfaceC8699n0 != null) {
                    try {
                        interfaceC8699n0.sequential().mo17422G((InterfaceC8468f0) this.f22918c);
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
            case 2:
                IntStream intStream = (IntStream) ((Function) ((C8748x) abstractC8643c).f22987t).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().mo17486a0((InterfaceC8437K) this.f22918c);
                    } catch (Throwable th4) {
                        try {
                            intStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                InterfaceC8552G interfaceC8552G = (InterfaceC8552G) ((Function) ((C8738v) abstractC8643c).f22964t).apply(obj);
                if (interfaceC8552G != null) {
                    try {
                        interfaceC8552G.sequential().mo17585J((InterfaceC8483n) this.f22918c);
                    } catch (Throwable th6) {
                        try {
                            interfaceC8552G.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                }
                if (interfaceC8552G != null) {
                    interfaceC8552G.close();
                    return;
                }
                return;
        }
    }

    @Override // p164j$.util.stream.AbstractC8651d2, p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        switch (this.f22917b) {
            case 0:
                this.f22918c = null;
                this.f22839a.end();
                return;
            default:
                super.end();
                return;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        int i = this.f22917b;
        InterfaceC8671h2 interfaceC8671h2 = this.f22839a;
        switch (i) {
            case 0:
                this.f22918c = new HashSet();
                interfaceC8671h2.mo17302g(-1L);
                return;
            case 1:
                interfaceC8671h2.mo17302g(-1L);
                return;
            case 2:
                interfaceC8671h2.mo17302g(-1L);
                return;
            default:
                interfaceC8671h2.mo17302g(-1L);
                return;
        }
    }
}