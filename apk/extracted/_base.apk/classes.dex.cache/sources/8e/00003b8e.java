package p164j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8496t0 implements InterfaceC8500v0 {

    /* renamed from: a */
    public final /* synthetic */ LongUnaryOperator f22615a;

    private /* synthetic */ C8496t0(LongUnaryOperator longUnaryOperator) {
        this.f22615a = longUnaryOperator;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC8500v0 m17644c(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return longUnaryOperator instanceof C8498u0 ? ((C8498u0) longUnaryOperator).f22617a : new C8496t0(longUnaryOperator);
    }

    @Override // p164j$.util.function.InterfaceC8500v0
    /* renamed from: a */
    public final /* synthetic */ InterfaceC8500v0 mo17507a(InterfaceC8500v0 interfaceC8500v0) {
        return m17644c(this.f22615a.compose(C8498u0.m17641a(interfaceC8500v0)));
    }

    @Override // p164j$.util.function.InterfaceC8500v0
    public final /* synthetic */ long applyAsLong(long j) {
        return this.f22615a.applyAsLong(j);
    }

    @Override // p164j$.util.function.InterfaceC8500v0
    /* renamed from: b */
    public final /* synthetic */ InterfaceC8500v0 mo17506b(InterfaceC8500v0 interfaceC8500v0) {
        return m17644c(this.f22615a.andThen(C8498u0.m17641a(interfaceC8500v0)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8496t0) {
            obj = ((C8496t0) obj).f22615a;
        }
        return this.f22615a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22615a.hashCode();
    }
}