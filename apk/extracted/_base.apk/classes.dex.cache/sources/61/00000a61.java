package p039c6;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import p059d6.InterfaceC5773x;
import p078e6.InterfaceC6117d;
import p097f6.InterfaceC6312b;
import p397w5.InterfaceC13395e;
import p438y5.InterfaceC13907b;

/* renamed from: c6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2401d implements InterfaceC13907b<C2400c> {

    /* renamed from: a */
    private final Provider<Executor> f6566a;

    /* renamed from: b */
    private final Provider<InterfaceC13395e> f6567b;

    /* renamed from: c */
    private final Provider<InterfaceC5773x> f6568c;

    /* renamed from: d */
    private final Provider<InterfaceC6117d> f6569d;

    /* renamed from: e */
    private final Provider<InterfaceC6312b> f6570e;

    public C2401d(Provider<Executor> provider, Provider<InterfaceC13395e> provider2, Provider<InterfaceC5773x> provider3, Provider<InterfaceC6117d> provider4, Provider<InterfaceC6312b> provider5) {
        this.f6566a = provider;
        this.f6567b = provider2;
        this.f6568c = provider3;
        this.f6569d = provider4;
        this.f6570e = provider5;
    }

    /* renamed from: a */
    public static C2401d m33514a(Provider<Executor> provider, Provider<InterfaceC13395e> provider2, Provider<InterfaceC5773x> provider3, Provider<InterfaceC6117d> provider4, Provider<InterfaceC6312b> provider5) {
        return new C2401d(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C2400c m33512c(Executor executor, InterfaceC13395e interfaceC13395e, InterfaceC5773x interfaceC5773x, InterfaceC6117d interfaceC6117d, InterfaceC6312b interfaceC6312b) {
        return new C2400c(executor, interfaceC13395e, interfaceC5773x, interfaceC6117d, interfaceC6312b);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C2400c get() {
        return m33512c(this.f6566a.get(), this.f6567b.get(), this.f6568c.get(), this.f6569d.get(), this.f6570e.get());
    }
}