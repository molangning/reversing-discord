package p025b5;

import p170j4.C8793c;

/* renamed from: b5.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2129h implements InterfaceC2125d {

    /* renamed from: a */
    private final int f5997a;

    public C2129h(int i) {
        this.f5997a = i;
    }

    @Override // p025b5.InterfaceC2125d
    public InterfaceC2124c createImageTranscoder(C8793c c8793c, boolean z) {
        return new C2128g(z, this.f5997a);
    }
}