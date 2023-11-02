package p164j$.util;

import p164j$.util.function.C8477k;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8515m implements InterfaceC8483n {

    /* renamed from: a */
    public final /* synthetic */ Consumer f22635a;

    public /* synthetic */ C8515m(Consumer consumer) {
        this.f22635a = consumer;
    }

    @Override // p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        this.f22635a.accept(Double.valueOf(d));
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }
}
