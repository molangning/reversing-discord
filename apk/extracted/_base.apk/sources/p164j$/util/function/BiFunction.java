package p164j$.util.function;

import java.util.function.BinaryOperator;

/* renamed from: j$.util.function.BiFunction */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface BiFunction<T, U, R> {

    /* renamed from: j$.util.function.BiFunction$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.BiFunction f22543a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f22543a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof C8459b ? ((C8459b) biFunction).f22584a : biFunction instanceof BinaryOperator ? C8463d.m17675b((BinaryOperator) biFunction) : new VivifiedWrapper(biFunction);
        }

        @Override // p164j$.util.function.BiFunction
        /* renamed from: a */
        public final /* synthetic */ BiFunction mo17393a(Function function) {
            return convert(this.f22543a.andThen(C8423D.m17711a(function)));
        }

        @Override // p164j$.util.function.BiFunction
        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.f22543a.apply(obj, obj2);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22543a;
            }
            return this.f22543a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f22543a.hashCode();
        }
    }

    /* renamed from: a */
    BiFunction mo17393a(Function function);

    Object apply(Object obj, Object obj2);
}
