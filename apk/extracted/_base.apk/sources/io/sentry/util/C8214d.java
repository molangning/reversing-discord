package io.sentry.util;

/* renamed from: io.sentry.util.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8214d {
    /* renamed from: a */
    public static Throwable m18232a(Throwable th2) {
        C8229o.m18169c(th2, "throwable cannot be null");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        return th2;
    }
}
