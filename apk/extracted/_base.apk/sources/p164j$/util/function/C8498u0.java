package p164j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8498u0 implements LongUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8500v0 f22617a;

    private /* synthetic */ C8498u0(InterfaceC8500v0 interfaceC8500v0) {
        this.f22617a = interfaceC8500v0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongUnaryOperator m17641a(InterfaceC8500v0 interfaceC8500v0) {
        if (interfaceC8500v0 == null) {
            return null;
        }
        return interfaceC8500v0 instanceof C8496t0 ? ((C8496t0) interfaceC8500v0).f22615a : new C8498u0(interfaceC8500v0);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return m17641a(this.f22617a.mo17506b(C8496t0.m17644c(longUnaryOperator)));
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ long applyAsLong(long j) {
        return this.f22617a.applyAsLong(j);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return m17641a(this.f22617a.mo17507a(C8496t0.m17644c(longUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8500v0 interfaceC8500v0 = this.f22617a;
        if (obj instanceof C8498u0) {
            obj = ((C8498u0) obj).f22617a;
        }
        return interfaceC8500v0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22617a.hashCode();
    }
}
