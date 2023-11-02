package p078e6;

import android.content.Context;
import javax.inject.Provider;
import p438y5.C13909d;
import p438y5.InterfaceC13907b;

/* renamed from: e6.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6127h implements InterfaceC13907b<String> {

    /* renamed from: a */
    private final Provider<Context> f17388a;

    public C6127h(Provider<Context> provider) {
        this.f17388a = provider;
    }

    /* renamed from: a */
    public static C6127h m23531a(Provider<Context> provider) {
        return new C6127h(provider);
    }

    /* renamed from: c */
    public static String m23529c(Context context) {
        return (String) C13909d.m1219c(AbstractC6122f.m23538b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public String get() {
        return m23529c(this.f17388a.get());
    }
}