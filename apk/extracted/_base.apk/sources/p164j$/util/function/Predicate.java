package p164j$.util.function;

/* renamed from: j$.util.function.Predicate */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface Predicate<T> {

    /* renamed from: j$.util.function.Predicate$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Predicate {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Predicate f22571a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Predicate predicate) {
            this.f22571a = predicate;
        }

        public static /* synthetic */ Predicate convert(java.util.function.Predicate predicate) {
            if (predicate == null) {
                return null;
            }
            return predicate instanceof C8432H0 ? ((C8432H0) predicate).f22557a : new VivifiedWrapper(predicate);
        }

        @Override // p164j$.util.function.Predicate
        /* renamed from: a */
        public final /* synthetic */ Predicate mo17547a(Predicate predicate) {
            return convert(this.f22571a.and(C8432H0.m17707a(predicate)));
        }

        @Override // p164j$.util.function.Predicate
        /* renamed from: b */
        public final /* synthetic */ Predicate mo17546b(Predicate predicate) {
            return convert(this.f22571a.or(C8432H0.m17707a(predicate)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22571a;
            }
            return this.f22571a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f22571a.hashCode();
        }

        @Override // p164j$.util.function.Predicate
        public final /* synthetic */ Predicate negate() {
            return convert(this.f22571a.negate());
        }

        @Override // p164j$.util.function.Predicate
        public final /* synthetic */ boolean test(Object obj) {
            return this.f22571a.test(obj);
        }
    }

    /* renamed from: a */
    Predicate mo17547a(Predicate predicate);

    /* renamed from: b */
    Predicate mo17546b(Predicate predicate);

    Predicate negate();

    boolean test(Object obj);
}
