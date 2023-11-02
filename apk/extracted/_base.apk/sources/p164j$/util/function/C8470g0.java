package p164j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8470g0 implements InterfaceC8474i0 {

    /* renamed from: a */
    public final /* synthetic */ LongFunction f22594a;

    private /* synthetic */ C8470g0(LongFunction longFunction) {
        this.f22594a = longFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8474i0 m17670a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return longFunction instanceof C8472h0 ? ((C8472h0) longFunction).f22596a : new C8470g0(longFunction);
    }

    @Override // p164j$.util.function.InterfaceC8474i0
    public final /* synthetic */ Object apply(long j) {
        return this.f22594a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8470g0) {
            obj = ((C8470g0) obj).f22594a;
        }
        return this.f22594a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22594a.hashCode();
    }
}
