package p164j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8485o implements InterfaceC8489q {

    /* renamed from: a */
    public final /* synthetic */ DoubleFunction f22606a;

    private /* synthetic */ C8485o(DoubleFunction doubleFunction) {
        this.f22606a = doubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8489q m17655a(DoubleFunction doubleFunction) {
        if (doubleFunction == null) {
            return null;
        }
        return doubleFunction instanceof C8487p ? ((C8487p) doubleFunction).f22607a : new C8485o(doubleFunction);
    }

    @Override // p164j$.util.function.InterfaceC8489q
    public final /* synthetic */ Object apply(double d) {
        return this.f22606a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8485o) {
            obj = ((C8485o) obj).f22606a;
        }
        return this.f22606a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22606a.hashCode();
    }
}