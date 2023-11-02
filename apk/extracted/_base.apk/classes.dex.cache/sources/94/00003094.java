package p059d6;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p078e6.InterfaceC6115c;
import p078e6.InterfaceC6117d;
import p097f6.InterfaceC6312b;
import p116g6.InterfaceC6553a;
import p397w5.InterfaceC13395e;
import p438y5.InterfaceC13907b;

/* renamed from: d6.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5768s implements InterfaceC13907b<C5767r> {

    /* renamed from: a */
    private final Provider<Context> f16580a;

    /* renamed from: b */
    private final Provider<InterfaceC13395e> f16581b;

    /* renamed from: c */
    private final Provider<InterfaceC6117d> f16582c;

    /* renamed from: d */
    private final Provider<InterfaceC5773x> f16583d;

    /* renamed from: e */
    private final Provider<Executor> f16584e;

    /* renamed from: f */
    private final Provider<InterfaceC6312b> f16585f;

    /* renamed from: g */
    private final Provider<InterfaceC6553a> f16586g;

    /* renamed from: h */
    private final Provider<InterfaceC6553a> f16587h;

    /* renamed from: i */
    private final Provider<InterfaceC6115c> f16588i;

    public C5768s(Provider<Context> provider, Provider<InterfaceC13395e> provider2, Provider<InterfaceC6117d> provider3, Provider<InterfaceC5773x> provider4, Provider<Executor> provider5, Provider<InterfaceC6312b> provider6, Provider<InterfaceC6553a> provider7, Provider<InterfaceC6553a> provider8, Provider<InterfaceC6115c> provider9) {
        this.f16580a = provider;
        this.f16581b = provider2;
        this.f16582c = provider3;
        this.f16583d = provider4;
        this.f16584e = provider5;
        this.f16585f = provider6;
        this.f16586g = provider7;
        this.f16587h = provider8;
        this.f16588i = provider9;
    }

    /* renamed from: a */
    public static C5768s m24535a(Provider<Context> provider, Provider<InterfaceC13395e> provider2, Provider<InterfaceC6117d> provider3, Provider<InterfaceC5773x> provider4, Provider<Executor> provider5, Provider<InterfaceC6312b> provider6, Provider<InterfaceC6553a> provider7, Provider<InterfaceC6553a> provider8, Provider<InterfaceC6115c> provider9) {
        return new C5768s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: c */
    public static C5767r m24533c(Context context, InterfaceC13395e interfaceC13395e, InterfaceC6117d interfaceC6117d, InterfaceC5773x interfaceC5773x, Executor executor, InterfaceC6312b interfaceC6312b, InterfaceC6553a interfaceC6553a, InterfaceC6553a interfaceC6553a2, InterfaceC6115c interfaceC6115c) {
        return new C5767r(context, interfaceC13395e, interfaceC6117d, interfaceC5773x, executor, interfaceC6312b, interfaceC6553a, interfaceC6553a2, interfaceC6115c);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C5767r get() {
        return m24533c(this.f16580a.get(), this.f16581b.get(), this.f16582c.get(), this.f16583d.get(), this.f16584e.get(), this.f16585f.get(), this.f16586g.get(), this.f16587h.get(), this.f16588i.get());
    }
}