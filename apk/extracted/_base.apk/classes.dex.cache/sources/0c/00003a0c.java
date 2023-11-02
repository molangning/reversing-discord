package io.sentry;

import io.sentry.protocol.C8086j;
import io.sentry.protocol.C8100q;

/* renamed from: io.sentry.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final /* synthetic */ class C8155s0 {
    /* renamed from: a */
    public static C8100q m18380a(InterfaceC8162t0 interfaceC8162t0, C7923f4 c7923f4, Scope scope) {
        return interfaceC8162t0.mo18359c(c7923f4, scope, null);
    }

    /* renamed from: b */
    public static C8100q m18379b(InterfaceC8162t0 interfaceC8162t0, String str, EnumC8021m4 enumC8021m4, Scope scope) {
        C7923f4 c7923f4 = new C7923f4();
        C8086j c8086j = new C8086j();
        c8086j.m18653d(str);
        c7923f4.m19213A0(c8086j);
        c7923f4.m19187z0(enumC8021m4);
        return interfaceC8162t0.mo18361a(c7923f4, scope);
    }
}