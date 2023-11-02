package p164j$.util.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import p164j$.util.function.BiFunction;
import p164j$.util.function.Function;

/* renamed from: j$.util.function.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8459b implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ BiFunction f22584a;

    private /* synthetic */ C8459b(BiFunction biFunction) {
        this.f22584a = biFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ BiFunction m17676a(BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        return biFunction instanceof BiFunction.VivifiedWrapper ? ((BiFunction.VivifiedWrapper) biFunction).f22543a : biFunction instanceof InterfaceC8467f ? C8465e.m17673a((InterfaceC8467f) biFunction) : new C8459b(biFunction);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(Function function) {
        return m17676a(this.f22584a.mo17393a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f22584a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiFunction biFunction = this.f22584a;
        if (obj instanceof C8459b) {
            obj = ((C8459b) obj).f22584a;
        }
        return biFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22584a.hashCode();
    }
}
