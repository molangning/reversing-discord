package p164j$.util.function;

import java.util.function.IntFunction;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.function.L */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8439L implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ IntFunction f22563a;

    private /* synthetic */ C8439L(IntFunction intFunction) {
        this.f22563a = intFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ IntFunction m17702a(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return intFunction instanceof IntFunction.VivifiedWrapper ? ((IntFunction.VivifiedWrapper) intFunction).f22560a : new C8439L(intFunction);
    }

    @Override // java.util.function.IntFunction
    public final /* synthetic */ Object apply(int i) {
        return this.f22563a.apply(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntFunction intFunction = this.f22563a;
        if (obj instanceof C8439L) {
            obj = ((C8439L) obj).f22563a;
        }
        return intFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22563a.hashCode();
    }
}
