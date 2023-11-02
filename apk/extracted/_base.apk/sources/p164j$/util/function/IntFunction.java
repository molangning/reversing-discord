package p164j$.util.function;

/* renamed from: j$.util.function.IntFunction */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface IntFunction<R> {

    /* renamed from: j$.util.function.IntFunction$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements IntFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.IntFunction f22560a;

        private /* synthetic */ VivifiedWrapper(java.util.function.IntFunction intFunction) {
            this.f22560a = intFunction;
        }

        public static /* synthetic */ IntFunction convert(java.util.function.IntFunction intFunction) {
            if (intFunction == null) {
                return null;
            }
            return intFunction instanceof C8439L ? ((C8439L) intFunction).f22563a : new VivifiedWrapper(intFunction);
        }

        @Override // p164j$.util.function.IntFunction
        public final /* synthetic */ Object apply(int i) {
            return this.f22560a.apply(i);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22560a;
            }
            return this.f22560a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f22560a.hashCode();
        }
    }

    Object apply(int i);
}
