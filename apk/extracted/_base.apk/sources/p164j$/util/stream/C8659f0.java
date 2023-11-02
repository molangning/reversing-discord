package p164j$.util.stream;

import p164j$.util.C8509g;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8426E0;
import p164j$.util.function.InterfaceC8460b0;
import p164j$.util.function.InterfaceC8474i0;

/* renamed from: j$.util.stream.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8659f0 implements InterfaceC8460b0, InterfaceC8474i0, InterfaceC8426E0, BiConsumer, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f22858a;

    public /* synthetic */ C8659f0(int i) {
        this.f22858a = i;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // p164j$.util.function.InterfaceC8426E0
    public final void accept(Object obj, long j) {
        ((C8509g) obj).accept(j);
    }

    @Override // p164j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((C8509g) obj).m17634a((C8509g) obj2);
    }

    @Override // p164j$.util.function.InterfaceC8474i0
    public final Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // p164j$.util.function.InterfaceC8460b0
    public final long applyAsLong(long j, long j2) {
        switch (this.f22858a) {
            case 0:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // p164j$.util.function.BiConsumer
    /* renamed from: c */
    public final BiConsumer mo17469c(BiConsumer biConsumer) {
        biConsumer.getClass();
        return new C8406u(1, this, biConsumer);
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }
}
