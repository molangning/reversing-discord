package p164j$.util.function;

/* renamed from: j$.util.function.BiConsumer */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface BiConsumer<T, U> {

    /* renamed from: j$.util.function.BiConsumer$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.BiConsumer f22542a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f22542a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return biConsumer instanceof C8457a ? ((C8457a) biConsumer).f22582a : new VivifiedWrapper(biConsumer);
        }

        @Override // p164j$.util.function.BiConsumer
        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.f22542a.accept(obj, obj2);
        }

        @Override // p164j$.util.function.BiConsumer
        /* renamed from: c */
        public final /* synthetic */ BiConsumer mo17469c(BiConsumer biConsumer) {
            return convert(this.f22542a.andThen(C8457a.m17678a(biConsumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22542a;
            }
            return this.f22542a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f22542a.hashCode();
        }
    }

    void accept(Object obj, Object obj2);

    /* renamed from: c */
    BiConsumer mo17469c(BiConsumer biConsumer);
}