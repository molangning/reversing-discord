package p164j$.util.function;

import java.util.function.ToLongFunction;
import p164j$.util.function.ToLongFunction;

/* renamed from: j$.util.function.N0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8444N0 implements ToLongFunction {

    /* renamed from: a */
    public final /* synthetic */ ToLongFunction f22568a;

    private /* synthetic */ C8444N0(ToLongFunction toLongFunction) {
        this.f22568a = toLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ ToLongFunction m17693a(ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return toLongFunction instanceof ToLongFunction.VivifiedWrapper ? ((ToLongFunction.VivifiedWrapper) toLongFunction).f22576a : new C8444N0(toLongFunction);
    }

    @Override // java.util.function.ToLongFunction
    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.f22568a.applyAsLong(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToLongFunction toLongFunction = this.f22568a;
        if (obj instanceof C8444N0) {
            obj = ((C8444N0) obj).f22568a;
        }
        return toLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22568a.hashCode();
    }
}
