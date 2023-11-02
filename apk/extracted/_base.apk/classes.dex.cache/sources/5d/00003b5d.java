package p164j$.util.function;

/* renamed from: j$.util.function.ToLongFunction */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface ToLongFunction<T> {

    /* renamed from: j$.util.function.ToLongFunction$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToLongFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToLongFunction f22576a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToLongFunction toLongFunction) {
            this.f22576a = toLongFunction;
        }

        public static /* synthetic */ ToLongFunction convert(java.util.function.ToLongFunction toLongFunction) {
            if (toLongFunction == null) {
                return null;
            }
            return toLongFunction instanceof C8444N0 ? ((C8444N0) toLongFunction).f22568a : new VivifiedWrapper(toLongFunction);
        }

        @Override // p164j$.util.function.ToLongFunction
        public final /* synthetic */ long applyAsLong(Object obj) {
            return this.f22576a.applyAsLong(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22576a;
            }
            return this.f22576a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f22576a.hashCode();
        }
    }

    long applyAsLong(Object obj);
}