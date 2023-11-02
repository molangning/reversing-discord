package p164j$.util;

import p164j$.util.function.C8431H;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8520r implements InterfaceC8437K {

    /* renamed from: a */
    public final /* synthetic */ Consumer f22638a;

    @Override // p164j$.util.function.InterfaceC8437K
    public final void accept(int i) {
        this.f22638a.accept(Integer.valueOf(i));
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }
}