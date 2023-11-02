package p078e6;

import p438y5.C13909d;
import p438y5.InterfaceC13907b;

/* renamed from: e6.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6124g implements InterfaceC13907b<String> {

    /* renamed from: e6.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C6125a {

        /* renamed from: a */
        private static final C6124g f17386a = new C6124g();
    }

    /* renamed from: a */
    public static C6124g m23535a() {
        return C6125a.f17386a;
    }

    /* renamed from: b */
    public static String m23534b() {
        return (String) C13909d.m1219c(AbstractC6122f.m23539a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public String get() {
        return m23534b();
    }
}
