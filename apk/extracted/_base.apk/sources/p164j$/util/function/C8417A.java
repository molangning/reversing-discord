package p164j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.A */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8417A implements InterfaceC8421C {

    /* renamed from: a */
    public final /* synthetic */ DoubleUnaryOperator f22539a;

    private /* synthetic */ C8417A(DoubleUnaryOperator doubleUnaryOperator) {
        this.f22539a = doubleUnaryOperator;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC8421C m17715d(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return doubleUnaryOperator instanceof C8419B ? ((C8419B) doubleUnaryOperator).f22541a : new C8417A(doubleUnaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8421C m17718a(InterfaceC8421C interfaceC8421C) {
        return m17715d(this.f22539a.andThen(C8419B.m17713a(interfaceC8421C)));
    }

    /* renamed from: b */
    public final /* synthetic */ double m17717b(double d) {
        return this.f22539a.applyAsDouble(d);
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC8421C m17716c(InterfaceC8421C interfaceC8421C) {
        return m17715d(this.f22539a.compose(C8419B.m17713a(interfaceC8421C)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8417A) {
            obj = ((C8417A) obj).f22539a;
        }
        return this.f22539a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22539a.hashCode();
    }
}
