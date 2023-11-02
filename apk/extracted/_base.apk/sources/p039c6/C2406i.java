package p039c6;

import android.content.Context;
import javax.inject.Provider;
import p059d6.AbstractC5751f;
import p059d6.InterfaceC5773x;
import p078e6.InterfaceC6117d;
import p116g6.InterfaceC6553a;
import p438y5.C13909d;
import p438y5.InterfaceC13907b;

/* renamed from: c6.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2406i implements InterfaceC13907b<InterfaceC5773x> {

    /* renamed from: a */
    private final Provider<Context> f6572a;

    /* renamed from: b */
    private final Provider<InterfaceC6117d> f6573b;

    /* renamed from: c */
    private final Provider<AbstractC5751f> f6574c;

    /* renamed from: d */
    private final Provider<InterfaceC6553a> f6575d;

    public C2406i(Provider<Context> provider, Provider<InterfaceC6117d> provider2, Provider<AbstractC5751f> provider3, Provider<InterfaceC6553a> provider4) {
        this.f6572a = provider;
        this.f6573b = provider2;
        this.f6574c = provider3;
        this.f6575d = provider4;
    }

    /* renamed from: a */
    public static C2406i m33505a(Provider<Context> provider, Provider<InterfaceC6117d> provider2, Provider<AbstractC5751f> provider3, Provider<InterfaceC6553a> provider4) {
        return new C2406i(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static InterfaceC5773x m33503c(Context context, InterfaceC6117d interfaceC6117d, AbstractC5751f abstractC5751f, InterfaceC6553a interfaceC6553a) {
        return (InterfaceC5773x) C13909d.m1219c(AbstractC2405h.m33506a(context, interfaceC6117d, abstractC5751f, interfaceC6553a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public InterfaceC5773x get() {
        return m33503c(this.f6572a.get(), this.f6573b.get(), this.f6574c.get(), this.f6575d.get());
    }
}
