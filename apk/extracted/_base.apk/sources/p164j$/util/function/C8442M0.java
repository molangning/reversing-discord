package p164j$.util.function;

import java.util.function.ToIntFunction;
import p164j$.util.function.ToIntFunction;

/* renamed from: j$.util.function.M0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8442M0 implements ToIntFunction {

    /* renamed from: a */
    public final /* synthetic */ ToIntFunction f22566a;

    private /* synthetic */ C8442M0(ToIntFunction toIntFunction) {
        this.f22566a = toIntFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ ToIntFunction m17695a(ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return toIntFunction instanceof ToIntFunction.VivifiedWrapper ? ((ToIntFunction.VivifiedWrapper) toIntFunction).f22575a : new C8442M0(toIntFunction);
    }

    @Override // java.util.function.ToIntFunction
    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.f22566a.applyAsInt(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToIntFunction toIntFunction = this.f22566a;
        if (obj instanceof C8442M0) {
            obj = ((C8442M0) obj).f22566a;
        }
        return toIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22566a.hashCode();
    }
}
