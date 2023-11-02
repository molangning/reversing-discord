package p164j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8497u implements InterfaceC8501w {

    /* renamed from: a */
    public final /* synthetic */ DoubleToIntFunction f22616a;

    private /* synthetic */ C8497u(DoubleToIntFunction doubleToIntFunction) {
        this.f22616a = doubleToIntFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8501w m17642b(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return doubleToIntFunction instanceof C8499v ? ((C8499v) doubleToIntFunction).f22618a : new C8497u(doubleToIntFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ int m17643a(double d) {
        return this.f22616a.applyAsInt(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8497u) {
            obj = ((C8497u) obj).f22616a;
        }
        return this.f22616a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22616a.hashCode();
    }
}