package p164j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.J */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8435J implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8437K f22561a;

    private /* synthetic */ C8435J(InterfaceC8437K interfaceC8437K) {
        this.f22561a = interfaceC8437K;
    }

    /* renamed from: a */
    public static /* synthetic */ IntConsumer m17704a(InterfaceC8437K interfaceC8437K) {
        if (interfaceC8437K == null) {
            return null;
        }
        return interfaceC8437K instanceof C8433I ? ((C8433I) interfaceC8437K).f22558a : new C8435J(interfaceC8437K);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        this.f22561a.accept(i);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return m17704a(this.f22561a.mo17379o(C8433I.m17706a(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8437K interfaceC8437K = this.f22561a;
        if (obj instanceof C8435J) {
            obj = ((C8435J) obj).f22561a;
        }
        return interfaceC8437K.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22561a.hashCode();
    }
}