package p078e6;

import p438y5.C13909d;
import p438y5.InterfaceC13907b;

/* renamed from: e6.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6132j implements InterfaceC13907b<AbstractC6119e> {

    /* renamed from: e6.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C6133a {

        /* renamed from: a */
        private static final C6132j f17392a = new C6132j();
    }

    /* renamed from: a */
    public static C6132j m23524a() {
        return C6133a.f17392a;
    }

    /* renamed from: c */
    public static AbstractC6119e m23522c() {
        return (AbstractC6119e) C13909d.m1219c(AbstractC6122f.m23536d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public AbstractC6119e get() {
        return m23522c();
    }
}
