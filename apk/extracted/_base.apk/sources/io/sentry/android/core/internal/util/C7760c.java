package io.sentry.android.core.internal.util;

import io.sentry.C7901e;
import io.sentry.EnumC8021m4;

/* renamed from: io.sentry.android.core.internal.util.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7760c {
    /* renamed from: a */
    public static C7901e m19776a(String str) {
        C7901e c7901e = new C7901e();
        c7901e.m19325p("session");
        c7901e.m19328m("state", str);
        c7901e.m19329l("app.lifecycle");
        c7901e.m19327n(EnumC8021m4.INFO);
        return c7901e;
    }
}
