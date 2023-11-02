package p164j$.util.function;

import java.util.function.IntToLongFunction;

/* renamed from: j$.util.function.U */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8451U implements IntToLongFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8452V f22577a;

    private /* synthetic */ C8451U(InterfaceC8452V interfaceC8452V) {
        this.f22577a = interfaceC8452V;
    }

    /* renamed from: a */
    public static /* synthetic */ IntToLongFunction m17687a(InterfaceC8452V interfaceC8452V) {
        if (interfaceC8452V == null) {
            return null;
        }
        return interfaceC8452V instanceof C8450T ? ((C8450T) interfaceC8452V).f22573a : new C8451U(interfaceC8452V);
    }

    @Override // java.util.function.IntToLongFunction
    public final /* synthetic */ long applyAsLong(int i) {
        return this.f22577a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8452V interfaceC8452V = this.f22577a;
        if (obj instanceof C8451U) {
            obj = ((C8451U) obj).f22577a;
        }
        return interfaceC8452V.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22577a.hashCode();
    }
}