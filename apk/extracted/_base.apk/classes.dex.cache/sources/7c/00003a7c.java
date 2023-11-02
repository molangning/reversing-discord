package io.sentry;

import java.io.File;

/* renamed from: io.sentry.x2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final /* synthetic */ class C8267x2 {
    /* renamed from: a */
    public static boolean m18047a(InterfaceC8273y2 interfaceC8273y2, String str, InterfaceC8040o0 interfaceC8040o0) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    /* renamed from: b */
    public static InterfaceC8206u2 m18046b(InterfaceC8273y2 interfaceC8273y2, final AbstractC8047p abstractC8047p, final String str, final InterfaceC8040o0 interfaceC8040o0) {
        final File file = new File(str);
        return new InterfaceC8206u2() { // from class: io.sentry.w2
            @Override // io.sentry.InterfaceC8206u2
            /* renamed from: a */
            public final void mo18052a() {
                C8267x2.m18045c(InterfaceC8040o0.this, str, abstractC8047p, file);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ void m18045c(InterfaceC8040o0 interfaceC8040o0, String str, AbstractC8047p abstractC8047p, File file) {
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        interfaceC8040o0.mo18135c(enumC8021m4, "Started processing cached files from %s", str);
        abstractC8047p.mo18061e(file);
        interfaceC8040o0.mo18135c(enumC8021m4, "Finished processing cached files from %s", str);
    }
}