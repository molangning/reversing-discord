package p164j$.util.function;

/* renamed from: j$.util.function.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8494s0 implements InterfaceC8500v0 {

    /* renamed from: a */
    public final /* synthetic */ int f22612a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8500v0 f22613b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC8500v0 f22614c;

    public /* synthetic */ C8494s0(InterfaceC8500v0 interfaceC8500v0, InterfaceC8500v0 interfaceC8500v02, int i) {
        this.f22612a = i;
        this.f22613b = interfaceC8500v0;
        this.f22614c = interfaceC8500v02;
    }

    @Override // p164j$.util.function.InterfaceC8500v0
    /* renamed from: a */
    public final InterfaceC8500v0 mo17507a(InterfaceC8500v0 interfaceC8500v0) {
        switch (this.f22612a) {
            case 0:
                interfaceC8500v0.getClass();
                return new C8494s0(this, interfaceC8500v0, 1);
            default:
                interfaceC8500v0.getClass();
                return new C8494s0(this, interfaceC8500v0, 1);
        }
    }

    @Override // p164j$.util.function.InterfaceC8500v0
    public final long applyAsLong(long j) {
        int i = this.f22612a;
        InterfaceC8500v0 interfaceC8500v0 = this.f22614c;
        InterfaceC8500v0 interfaceC8500v02 = this.f22613b;
        switch (i) {
            case 0:
                return interfaceC8500v0.applyAsLong(interfaceC8500v02.applyAsLong(j));
            default:
                return interfaceC8500v02.applyAsLong(interfaceC8500v0.applyAsLong(j));
        }
    }

    @Override // p164j$.util.function.InterfaceC8500v0
    /* renamed from: b */
    public final InterfaceC8500v0 mo17506b(InterfaceC8500v0 interfaceC8500v0) {
        switch (this.f22612a) {
            case 0:
                interfaceC8500v0.getClass();
                return new C8494s0(this, interfaceC8500v0, 0);
            default:
                interfaceC8500v0.getClass();
                return new C8494s0(this, interfaceC8500v0, 0);
        }
    }
}