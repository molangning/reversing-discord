package p164j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8505y implements DoubleToLongFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8507z f22622a;

    private /* synthetic */ C8505y(InterfaceC8507z interfaceC8507z) {
        this.f22622a = interfaceC8507z;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleToLongFunction m17636a(InterfaceC8507z interfaceC8507z) {
        if (interfaceC8507z == null) {
            return null;
        }
        return interfaceC8507z instanceof C8503x ? ((C8503x) interfaceC8507z).f22620a : new C8505y(interfaceC8507z);
    }

    @Override // java.util.function.DoubleToLongFunction
    public final /* synthetic */ long applyAsLong(double d) {
        return this.f22622a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8507z interfaceC8507z = this.f22622a;
        if (obj instanceof C8505y) {
            obj = ((C8505y) obj).f22622a;
        }
        return interfaceC8507z.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22622a.hashCode();
    }
}
