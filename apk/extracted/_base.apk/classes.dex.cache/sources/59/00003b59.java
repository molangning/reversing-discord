package p164j$.util.function;

/* renamed from: j$.util.function.ToDoubleFunction */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface ToDoubleFunction<T> {

    /* renamed from: j$.util.function.ToDoubleFunction$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToDoubleFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToDoubleFunction f22574a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToDoubleFunction toDoubleFunction) {
            this.f22574a = toDoubleFunction;
        }

        public static /* synthetic */ ToDoubleFunction convert(java.util.function.ToDoubleFunction toDoubleFunction) {
            if (toDoubleFunction == null) {
                return null;
            }
            return toDoubleFunction instanceof C8440L0 ? ((C8440L0) toDoubleFunction).f22564a : new VivifiedWrapper(toDoubleFunction);
        }

        @Override // p164j$.util.function.ToDoubleFunction
        public final /* synthetic */ double applyAsDouble(Object obj) {
            return this.f22574a.applyAsDouble(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22574a;
            }
            return this.f22574a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f22574a.hashCode();
        }
    }

    double applyAsDouble(Object obj);
}