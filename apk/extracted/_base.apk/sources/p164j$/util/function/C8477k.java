package p164j$.util.function;

import p164j$.time.AbstractC8284a;

/* renamed from: j$.util.function.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8477k implements InterfaceC8483n {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8483n f22599a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8483n f22600b;

    public /* synthetic */ C8477k(InterfaceC8483n interfaceC8483n, InterfaceC8483n interfaceC8483n2) {
        this.f22599a = interfaceC8483n;
        this.f22600b = interfaceC8483n2;
    }

    @Override // p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        AbstractC8284a.m17903c(this.f22599a, this.f22600b, d);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }
}
