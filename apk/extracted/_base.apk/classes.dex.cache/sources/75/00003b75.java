package p164j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8471h implements InterfaceC8475j {

    /* renamed from: a */
    public final /* synthetic */ DoubleBinaryOperator f22595a;

    private /* synthetic */ C8471h(DoubleBinaryOperator doubleBinaryOperator) {
        this.f22595a = doubleBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8475j m17669a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return doubleBinaryOperator instanceof C8473i ? ((C8473i) doubleBinaryOperator).f22597a : new C8471h(doubleBinaryOperator);
    }

    @Override // p164j$.util.function.InterfaceC8475j
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.f22595a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8471h) {
            obj = ((C8471h) obj).f22595a;
        }
        return this.f22595a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22595a.hashCode();
    }
}