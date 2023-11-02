package p397w5;

import android.content.Context;
import javax.inject.Provider;
import p438y5.InterfaceC13907b;

/* renamed from: w5.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13405l implements InterfaceC13907b<C13403k> {

    /* renamed from: a */
    private final Provider<Context> f34493a;

    /* renamed from: b */
    private final Provider<C13401i> f34494b;

    public C13405l(Provider<Context> provider, Provider<C13401i> provider2) {
        this.f34493a = provider;
        this.f34494b = provider2;
    }

    /* renamed from: a */
    public static C13405l m2631a(Provider<Context> provider, Provider<C13401i> provider2) {
        return new C13405l(provider, provider2);
    }

    /* renamed from: c */
    public static C13403k m2629c(Context context, Object obj) {
        return new C13403k(context, (C13401i) obj);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C13403k get() {
        return m2629c(this.f34493a.get(), this.f34494b.get());
    }
}