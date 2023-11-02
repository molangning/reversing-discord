package p164j$.util.function;

import java.util.function.ToDoubleFunction;
import p164j$.util.function.ToDoubleFunction;

/* renamed from: j$.util.function.L0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8440L0 implements ToDoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ ToDoubleFunction f22564a;

    private /* synthetic */ C8440L0(ToDoubleFunction toDoubleFunction) {
        this.f22564a = toDoubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ ToDoubleFunction m17701a(ToDoubleFunction toDoubleFunction) {
        if (toDoubleFunction == null) {
            return null;
        }
        return toDoubleFunction instanceof ToDoubleFunction.VivifiedWrapper ? ((ToDoubleFunction.VivifiedWrapper) toDoubleFunction).f22574a : new C8440L0(toDoubleFunction);
    }

    @Override // java.util.function.ToDoubleFunction
    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.f22564a.applyAsDouble(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToDoubleFunction toDoubleFunction = this.f22564a;
        if (obj instanceof C8440L0) {
            obj = ((C8440L0) obj).f22564a;
        }
        return toDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22564a.hashCode();
    }
}
