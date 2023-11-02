package p164j$.util.function;

import java.util.function.Consumer;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.function.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8469g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f22593a;

    private /* synthetic */ C8469g(Consumer consumer) {
        this.f22593a = consumer;
    }

    /* renamed from: a */
    public static /* synthetic */ Consumer m17671a(Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof Consumer.VivifiedWrapper ? ((Consumer.VivifiedWrapper) consumer).f22545a : new C8469g(consumer);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.f22593a.accept(obj);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return m17671a(this.f22593a.mo17303e(Consumer.VivifiedWrapper.convert(consumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Consumer consumer = this.f22593a;
        if (obj instanceof C8469g) {
            obj = ((C8469g) obj).f22593a;
        }
        return consumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22593a.hashCode();
    }
}
