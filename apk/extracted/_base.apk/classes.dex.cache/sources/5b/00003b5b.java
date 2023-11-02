package p164j$.util.function;

/* renamed from: j$.util.function.ToIntFunction */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface ToIntFunction<T> {

    /* renamed from: j$.util.function.ToIntFunction$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToIntFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToIntFunction f22575a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToIntFunction toIntFunction) {
            this.f22575a = toIntFunction;
        }

        public static /* synthetic */ ToIntFunction convert(java.util.function.ToIntFunction toIntFunction) {
            if (toIntFunction == null) {
                return null;
            }
            return toIntFunction instanceof C8442M0 ? ((C8442M0) toIntFunction).f22566a : new VivifiedWrapper(toIntFunction);
        }

        @Override // p164j$.util.function.ToIntFunction
        public final /* synthetic */ int applyAsInt(Object obj) {
            return this.f22575a.applyAsInt(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22575a;
            }
            return this.f22575a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f22575a.hashCode();
        }
    }

    int applyAsInt(Object obj);
}