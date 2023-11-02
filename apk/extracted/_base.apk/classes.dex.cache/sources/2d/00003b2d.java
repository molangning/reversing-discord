package p164j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.B */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8419B implements DoubleUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8421C f22541a;

    private /* synthetic */ C8419B(InterfaceC8421C interfaceC8421C) {
        this.f22541a = interfaceC8421C;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleUnaryOperator m17713a(InterfaceC8421C interfaceC8421C) {
        if (interfaceC8421C == null) {
            return null;
        }
        return interfaceC8421C instanceof C8417A ? ((C8417A) interfaceC8421C).f22539a : new C8419B(interfaceC8421C);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        return m17713a(((C8417A) this.f22541a).m17718a(C8417A.m17715d(doubleUnaryOperator)));
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ double applyAsDouble(double d) {
        return ((C8417A) this.f22541a).m17717b(d);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        return m17713a(((C8417A) this.f22541a).m17716c(C8417A.m17715d(doubleUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8421C interfaceC8421C = this.f22541a;
        if (obj instanceof C8419B) {
            obj = ((C8419B) obj).f22541a;
        }
        return interfaceC8421C.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22541a.hashCode();
    }
}