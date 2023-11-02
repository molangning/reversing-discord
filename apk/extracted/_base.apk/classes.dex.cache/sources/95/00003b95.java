package p164j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8503x implements InterfaceC8507z {

    /* renamed from: a */
    public final /* synthetic */ DoubleToLongFunction f22620a;

    private /* synthetic */ C8503x(DoubleToLongFunction doubleToLongFunction) {
        this.f22620a = doubleToLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8507z m17638a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return doubleToLongFunction instanceof C8505y ? ((C8505y) doubleToLongFunction).f22622a : new C8503x(doubleToLongFunction);
    }

    @Override // p164j$.util.function.InterfaceC8507z
    public final /* synthetic */ long applyAsLong(double d) {
        return this.f22620a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8503x) {
            obj = ((C8503x) obj).f22620a;
        }
        return this.f22620a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22620a.hashCode();
    }
}