package p164j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8499v implements DoubleToIntFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8501w f22618a;

    private /* synthetic */ C8499v(InterfaceC8501w interfaceC8501w) {
        this.f22618a = interfaceC8501w;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleToIntFunction m17640a(InterfaceC8501w interfaceC8501w) {
        if (interfaceC8501w == null) {
            return null;
        }
        return interfaceC8501w instanceof C8497u ? ((C8497u) interfaceC8501w).f22616a : new C8499v(interfaceC8501w);
    }

    @Override // java.util.function.DoubleToIntFunction
    public final /* synthetic */ int applyAsInt(double d) {
        return ((C8497u) this.f22618a).m17643a(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8501w interfaceC8501w = this.f22618a;
        if (obj instanceof C8499v) {
            obj = ((C8499v) obj).f22618a;
        }
        return interfaceC8501w.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22618a.hashCode();
    }
}
