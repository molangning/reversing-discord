package p059d6;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import p078e6.InterfaceC6117d;
import p097f6.InterfaceC6312b;
import p438y5.InterfaceC13907b;

/* renamed from: d6.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5772w implements InterfaceC13907b<C5771v> {

    /* renamed from: a */
    private final Provider<Executor> f16595a;

    /* renamed from: b */
    private final Provider<InterfaceC6117d> f16596b;

    /* renamed from: c */
    private final Provider<InterfaceC5773x> f16597c;

    /* renamed from: d */
    private final Provider<InterfaceC6312b> f16598d;

    public C5772w(Provider<Executor> provider, Provider<InterfaceC6117d> provider2, Provider<InterfaceC5773x> provider3, Provider<InterfaceC6312b> provider4) {
        this.f16595a = provider;
        this.f16596b = provider2;
        this.f16597c = provider3;
        this.f16598d = provider4;
    }

    /* renamed from: a */
    public static C5772w m24527a(Provider<Executor> provider, Provider<InterfaceC6117d> provider2, Provider<InterfaceC5773x> provider3, Provider<InterfaceC6312b> provider4) {
        return new C5772w(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C5771v m24525c(Executor executor, InterfaceC6117d interfaceC6117d, InterfaceC5773x interfaceC5773x, InterfaceC6312b interfaceC6312b) {
        return new C5771v(executor, interfaceC6117d, interfaceC5773x, interfaceC6312b);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C5771v get() {
        return m24525c(this.f16595a.get(), this.f16596b.get(), this.f16597c.get(), this.f16598d.get());
    }
}