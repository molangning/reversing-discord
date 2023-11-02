package p164j$.util.function;

import java.util.function.IntToDoubleFunction;

/* renamed from: j$.util.function.P */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8447P implements InterfaceC8449S {

    /* renamed from: a */
    public final /* synthetic */ IntToDoubleFunction f22570a;

    private /* synthetic */ C8447P(IntToDoubleFunction intToDoubleFunction) {
        this.f22570a = intToDoubleFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8449S m17690b(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return intToDoubleFunction instanceof C8448Q ? ((C8448Q) intToDoubleFunction).f22572a : new C8447P(intToDoubleFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ double m17691a(int i) {
        return this.f22570a.applyAsDouble(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8447P) {
            obj = ((C8447P) obj).f22570a;
        }
        return this.f22570a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22570a.hashCode();
    }
}