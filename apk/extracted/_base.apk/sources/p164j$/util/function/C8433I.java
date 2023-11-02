package p164j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.I */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8433I implements InterfaceC8437K {

    /* renamed from: a */
    public final /* synthetic */ IntConsumer f22558a;

    private /* synthetic */ C8433I(IntConsumer intConsumer) {
        this.f22558a = intConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8437K m17706a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof C8435J ? ((C8435J) intConsumer).f22561a : new C8433I(intConsumer);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    public final /* synthetic */ void accept(int i) {
        this.f22558a.accept(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8433I) {
            obj = ((C8433I) obj).f22558a;
        }
        return this.f22558a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22558a.hashCode();
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final /* synthetic */ InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        return m17706a(this.f22558a.andThen(C8435J.m17704a(interfaceC8437K)));
    }
}
