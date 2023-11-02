package io.sentry;

import io.sentry.util.C8229o;

/* renamed from: io.sentry.z2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8279z2 implements InterfaceC8273y2 {

    /* renamed from: a */
    private final InterfaceC8245v2 f22251a;

    public C8279z2(InterfaceC8245v2 interfaceC8245v2) {
        this.f22251a = (InterfaceC8245v2) C8229o.m18169c(interfaceC8245v2, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.InterfaceC8273y2
    /* renamed from: a */
    public InterfaceC8206u2 mo17977a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        C8229o.m18169c(interfaceC8025n0, "Hub is required");
        C8229o.m18169c(c8132r4, "SentryOptions is required");
        String mo18132a = this.f22251a.mo18132a();
        if (mo18132a != null && mo17976b(mo18132a, c8132r4.getLogger())) {
            return m17975c(new C8258w(interfaceC8025n0, c8132r4.getSerializer(), c8132r4.getLogger(), c8132r4.getFlushTimeoutMillis()), mo18132a, c8132r4.getLogger());
        }
        c8132r4.getLogger().mo18135c(EnumC8021m4.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC8273y2
    /* renamed from: b */
    public /* synthetic */ boolean mo17976b(String str, InterfaceC8040o0 interfaceC8040o0) {
        return C8267x2.m18047a(this, str, interfaceC8040o0);
    }

    /* renamed from: c */
    public /* synthetic */ InterfaceC8206u2 m17975c(AbstractC8047p abstractC8047p, String str, InterfaceC8040o0 interfaceC8040o0) {
        return C8267x2.m18046b(this, abstractC8047p, str, interfaceC8040o0);
    }
}