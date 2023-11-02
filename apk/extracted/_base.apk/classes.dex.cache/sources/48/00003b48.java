package p164j$.util.function;

import java.util.function.Supplier;

/* renamed from: j$.util.function.J0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8436J0 implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8438K0 f22562a;

    private /* synthetic */ C8436J0(InterfaceC8438K0 interfaceC8438K0) {
        this.f22562a = interfaceC8438K0;
    }

    /* renamed from: a */
    public static /* synthetic */ Supplier m17703a(InterfaceC8438K0 interfaceC8438K0) {
        if (interfaceC8438K0 == null) {
            return null;
        }
        return interfaceC8438K0 instanceof C8434I0 ? ((C8434I0) interfaceC8438K0).f22559a : new C8436J0(interfaceC8438K0);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8438K0 interfaceC8438K0 = this.f22562a;
        if (obj instanceof C8436J0) {
            obj = ((C8436J0) obj).f22562a;
        }
        return interfaceC8438K0.equals(obj);
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.f22562a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.f22562a.hashCode();
    }
}