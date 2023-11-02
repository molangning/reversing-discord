package p116g6;

import p438y5.C13909d;
import p438y5.InterfaceC13907b;

/* renamed from: g6.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6555c implements InterfaceC13907b<InterfaceC6553a> {

    /* renamed from: g6.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C6556a {

        /* renamed from: a */
        private static final C6555c f18592a = new C6555c();
    }

    /* renamed from: a */
    public static C6555c m22410a() {
        return C6556a.f18592a;
    }

    /* renamed from: b */
    public static InterfaceC6553a m22409b() {
        return (InterfaceC6553a) C13909d.m1219c(AbstractC6554b.m22412a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public InterfaceC6553a get() {
        return m22409b();
    }
}
