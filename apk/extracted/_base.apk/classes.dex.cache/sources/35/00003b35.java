package p164j$.util.function;

/* renamed from: j$.util.function.Consumer */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface Consumer<T> {

    /* renamed from: j$.util.function.Consumer$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Consumer f22545a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f22545a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof C8469g ? ((C8469g) consumer).f22593a : new VivifiedWrapper(consumer);
        }

        @Override // p164j$.util.function.Consumer
        public final /* synthetic */ void accept(Object obj) {
            this.f22545a.accept(obj);
        }

        @Override // p164j$.util.function.Consumer
        /* renamed from: e */
        public final /* synthetic */ Consumer mo17303e(Consumer consumer) {
            return convert(this.f22545a.andThen(C8469g.m17671a(consumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22545a;
            }
            return this.f22545a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f22545a.hashCode();
        }
    }

    void accept(Object obj);

    /* renamed from: e */
    Consumer mo17303e(Consumer consumer);
}