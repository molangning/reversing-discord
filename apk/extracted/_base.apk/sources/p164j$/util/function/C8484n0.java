package p164j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8484n0 implements LongToDoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8486o0 f22605a;

    private /* synthetic */ C8484n0(InterfaceC8486o0 interfaceC8486o0) {
        this.f22605a = interfaceC8486o0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongToDoubleFunction m17656a(InterfaceC8486o0 interfaceC8486o0) {
        if (interfaceC8486o0 == null) {
            return null;
        }
        return interfaceC8486o0 instanceof C8482m0 ? ((C8482m0) interfaceC8486o0).f22604a : new C8484n0(interfaceC8486o0);
    }

    @Override // java.util.function.LongToDoubleFunction
    public final /* synthetic */ double applyAsDouble(long j) {
        return ((C8482m0) this.f22605a).m17658a(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8486o0 interfaceC8486o0 = this.f22605a;
        if (obj instanceof C8484n0) {
            obj = ((C8484n0) obj).f22605a;
        }
        return interfaceC8486o0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22605a.hashCode();
    }
}
