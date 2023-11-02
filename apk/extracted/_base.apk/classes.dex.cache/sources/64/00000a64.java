package p039c6;

import javax.inject.Provider;
import p059d6.AbstractC5751f;
import p116g6.InterfaceC6553a;
import p438y5.C13909d;
import p438y5.InterfaceC13907b;

/* renamed from: c6.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2404g implements InterfaceC13907b<AbstractC5751f> {

    /* renamed from: a */
    private final Provider<InterfaceC6553a> f6571a;

    public C2404g(Provider<InterfaceC6553a> provider) {
        this.f6571a = provider;
    }

    /* renamed from: a */
    public static AbstractC5751f m33509a(InterfaceC6553a interfaceC6553a) {
        return (AbstractC5751f) C13909d.m1219c(AbstractC2403f.m33510a(interfaceC6553a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C2404g m33508b(Provider<InterfaceC6553a> provider) {
        return new C2404g(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public AbstractC5751f get() {
        return m33509a(this.f6571a.get());
    }
}