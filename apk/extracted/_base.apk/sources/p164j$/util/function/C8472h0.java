package p164j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8472h0 implements LongFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8474i0 f22596a;

    private /* synthetic */ C8472h0(InterfaceC8474i0 interfaceC8474i0) {
        this.f22596a = interfaceC8474i0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongFunction m17668a(InterfaceC8474i0 interfaceC8474i0) {
        if (interfaceC8474i0 == null) {
            return null;
        }
        return interfaceC8474i0 instanceof C8470g0 ? ((C8470g0) interfaceC8474i0).f22594a : new C8472h0(interfaceC8474i0);
    }

    @Override // java.util.function.LongFunction
    public final /* synthetic */ Object apply(long j) {
        return this.f22596a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8474i0 interfaceC8474i0 = this.f22596a;
        if (obj instanceof C8472h0) {
            obj = ((C8472h0) obj).f22596a;
        }
        return interfaceC8474i0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22596a.hashCode();
    }
}
