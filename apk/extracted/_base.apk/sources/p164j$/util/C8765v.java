package p164j$.util;

import p164j$.util.function.C8462c0;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8765v implements InterfaceC8468f0 {

    /* renamed from: a */
    public final /* synthetic */ Consumer f23004a;

    @Override // p164j$.util.function.InterfaceC8468f0
    public final void accept(long j) {
        this.f23004a.accept(Long.valueOf(j));
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }
}
