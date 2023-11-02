package p381v5;

import javax.inject.Provider;
import p039c6.InterfaceC2402e;
import p059d6.C5767r;
import p059d6.C5771v;
import p116g6.InterfaceC6553a;
import p438y5.InterfaceC13907b;

/* renamed from: v5.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13112v implements InterfaceC13907b<C13109t> {

    /* renamed from: a */
    private final Provider<InterfaceC6553a> f33956a;

    /* renamed from: b */
    private final Provider<InterfaceC6553a> f33957b;

    /* renamed from: c */
    private final Provider<InterfaceC2402e> f33958c;

    /* renamed from: d */
    private final Provider<C5767r> f33959d;

    /* renamed from: e */
    private final Provider<C5771v> f33960e;

    public C13112v(Provider<InterfaceC6553a> provider, Provider<InterfaceC6553a> provider2, Provider<InterfaceC2402e> provider3, Provider<C5767r> provider4, Provider<C5771v> provider5) {
        this.f33956a = provider;
        this.f33957b = provider2;
        this.f33958c = provider3;
        this.f33959d = provider4;
        this.f33960e = provider5;
    }

    /* renamed from: a */
    public static C13112v m3236a(Provider<InterfaceC6553a> provider, Provider<InterfaceC6553a> provider2, Provider<InterfaceC2402e> provider3, Provider<C5767r> provider4, Provider<C5771v> provider5) {
        return new C13112v(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C13109t m3234c(InterfaceC6553a interfaceC6553a, InterfaceC6553a interfaceC6553a2, InterfaceC2402e interfaceC2402e, C5767r c5767r, C5771v c5771v) {
        return new C13109t(interfaceC6553a, interfaceC6553a2, interfaceC2402e, c5767r, c5771v);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C13109t get() {
        return m3234c(this.f33956a.get(), this.f33957b.get(), this.f33958c.get(), this.f33959d.get(), this.f33960e.get());
    }
}
