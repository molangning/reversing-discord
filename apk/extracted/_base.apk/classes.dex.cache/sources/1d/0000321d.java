package p078e6;

import android.content.Context;
import javax.inject.Provider;
import p438y5.InterfaceC13907b;

/* renamed from: e6.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6161u0 implements InterfaceC13907b<C6158t0> {

    /* renamed from: a */
    private final Provider<Context> f17441a;

    /* renamed from: b */
    private final Provider<String> f17442b;

    /* renamed from: c */
    private final Provider<Integer> f17443c;

    public C6161u0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f17441a = provider;
        this.f17442b = provider2;
        this.f17443c = provider3;
    }

    /* renamed from: a */
    public static C6161u0 m23415a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new C6161u0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C6158t0 m23413c(Context context, String str, int i) {
        return new C6158t0(context, str, i);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C6158t0 get() {
        return m23413c(this.f17441a.get(), this.f17442b.get(), this.f17443c.get().intValue());
    }
}