package io.sentry.android.core;

import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;

/* renamed from: io.sentry.android.core.d1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7720d1 {
    /* renamed from: a */
    public boolean m19906a(String str, InterfaceC8040o0 interfaceC8040o0) {
        return m19904c(str, interfaceC8040o0) != null;
    }

    /* renamed from: b */
    public boolean m19905b(String str, C8132r4 c8132r4) {
        return m19906a(str, c8132r4 != null ? c8132r4.getLogger() : null);
    }

    /* renamed from: c */
    public Class<?> m19904c(String str, InterfaceC8040o0 interfaceC8040o0) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            if (interfaceC8040o0 != null) {
                EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
                interfaceC8040o0.mo18136b(enumC8021m4, "Class not available:" + str, e);
                return null;
            }
            return null;
        } catch (UnsatisfiedLinkError e2) {
            if (interfaceC8040o0 != null) {
                EnumC8021m4 enumC8021m42 = EnumC8021m4.ERROR;
                interfaceC8040o0.mo18136b(enumC8021m42, "Failed to load (UnsatisfiedLinkError) " + str, e2);
                return null;
            }
            return null;
        } catch (Throwable th2) {
            if (interfaceC8040o0 != null) {
                EnumC8021m4 enumC8021m43 = EnumC8021m4.ERROR;
                interfaceC8040o0.mo18136b(enumC8021m43, "Failed to initialize " + str, th2);
                return null;
            }
            return null;
        }
    }
}
