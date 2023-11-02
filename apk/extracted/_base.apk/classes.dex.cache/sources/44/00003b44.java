package p164j$.util.function;

import java.util.function.Supplier;

/* renamed from: j$.util.function.I0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8434I0 implements InterfaceC8438K0 {

    /* renamed from: a */
    public final /* synthetic */ Supplier f22559a;

    private /* synthetic */ C8434I0(Supplier supplier) {
        this.f22559a = supplier;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8438K0 m17705a(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof C8436J0 ? ((C8436J0) supplier).f22562a : new C8434I0(supplier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8434I0) {
            obj = ((C8434I0) obj).f22559a;
        }
        return this.f22559a.equals(obj);
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final /* synthetic */ Object get() {
        return this.f22559a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.f22559a.hashCode();
    }
}