package p164j$.util.function;

import java.util.function.BiConsumer;
import p164j$.util.function.BiConsumer;

/* renamed from: j$.util.function.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8457a implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f22582a;

    private /* synthetic */ C8457a(BiConsumer biConsumer) {
        this.f22582a = biConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ BiConsumer m17678a(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof BiConsumer.VivifiedWrapper ? ((BiConsumer.VivifiedWrapper) biConsumer).f22542a : new C8457a(biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.f22582a.accept(obj, obj2);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return m17678a(this.f22582a.mo17469c(BiConsumer.VivifiedWrapper.convert(biConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiConsumer biConsumer = this.f22582a;
        if (obj instanceof C8457a) {
            obj = ((C8457a) obj).f22582a;
        }
        return biConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22582a.hashCode();
    }
}
