package p164j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8482m0 implements InterfaceC8486o0 {

    /* renamed from: a */
    public final /* synthetic */ LongToDoubleFunction f22604a;

    private /* synthetic */ C8482m0(LongToDoubleFunction longToDoubleFunction) {
        this.f22604a = longToDoubleFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8486o0 m17657b(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return longToDoubleFunction instanceof C8484n0 ? ((C8484n0) longToDoubleFunction).f22605a : new C8482m0(longToDoubleFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ double m17658a(long j) {
        return this.f22604a.applyAsDouble(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8482m0) {
            obj = ((C8482m0) obj).f22604a;
        }
        return this.f22604a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22604a.hashCode();
    }
}