package p164j$.util.function;

/* renamed from: j$.util.function.H */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8431H implements InterfaceC8437K {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8437K f22555a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8437K f22556b;

    public /* synthetic */ C8431H(InterfaceC8437K interfaceC8437K, InterfaceC8437K interfaceC8437K2) {
        this.f22555a = interfaceC8437K;
        this.f22556b = interfaceC8437K2;
    }

    @Override // p164j$.util.function.InterfaceC8437K
    public final void accept(int i) {
        this.f22555a.accept(i);
        this.f22556b.accept(i);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }
}
