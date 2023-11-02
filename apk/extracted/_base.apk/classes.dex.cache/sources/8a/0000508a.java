package p397w5;

import android.content.Context;
import javax.inject.Provider;
import p116g6.InterfaceC6553a;
import p438y5.InterfaceC13907b;

/* renamed from: w5.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13402j implements InterfaceC13907b<C13401i> {

    /* renamed from: a */
    private final Provider<Context> f34485a;

    /* renamed from: b */
    private final Provider<InterfaceC6553a> f34486b;

    /* renamed from: c */
    private final Provider<InterfaceC6553a> f34487c;

    public C13402j(Provider<Context> provider, Provider<InterfaceC6553a> provider2, Provider<InterfaceC6553a> provider3) {
        this.f34485a = provider;
        this.f34486b = provider2;
        this.f34487c = provider3;
    }

    /* renamed from: a */
    public static C13402j m2639a(Provider<Context> provider, Provider<InterfaceC6553a> provider2, Provider<InterfaceC6553a> provider3) {
        return new C13402j(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13401i m2637c(Context context, InterfaceC6553a interfaceC6553a, InterfaceC6553a interfaceC6553a2) {
        return new C13401i(context, interfaceC6553a, interfaceC6553a2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C13401i get() {
        return m2637c(this.f34485a.get(), this.f34486b.get(), this.f34487c.get());
    }
}