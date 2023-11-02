package p164j$.util.function;

/* renamed from: j$.util.function.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8462c0 implements InterfaceC8468f0 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8468f0 f22587a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8468f0 f22588b;

    public /* synthetic */ C8462c0(InterfaceC8468f0 interfaceC8468f0, InterfaceC8468f0 interfaceC8468f02) {
        this.f22587a = interfaceC8468f0;
        this.f22588b = interfaceC8468f02;
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    public final void accept(long j) {
        this.f22587a.accept(j);
        this.f22588b.accept(j);
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }
}
