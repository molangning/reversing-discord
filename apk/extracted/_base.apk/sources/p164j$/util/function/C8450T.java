package p164j$.util.function;

import java.util.function.IntToLongFunction;

/* renamed from: j$.util.function.T */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8450T implements InterfaceC8452V {

    /* renamed from: a */
    public final /* synthetic */ IntToLongFunction f22573a;

    private /* synthetic */ C8450T(IntToLongFunction intToLongFunction) {
        this.f22573a = intToLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8452V m17688a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return intToLongFunction instanceof C8451U ? ((C8451U) intToLongFunction).f22577a : new C8450T(intToLongFunction);
    }

    @Override // p164j$.util.function.InterfaceC8452V
    public final /* synthetic */ long applyAsLong(int i) {
        return this.f22573a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8450T) {
            obj = ((C8450T) obj).f22573a;
        }
        return this.f22573a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22573a.hashCode();
    }
}
