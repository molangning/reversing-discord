package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;
import io.sentry.util.C8229o;

/* renamed from: io.sentry.android.core.internal.util.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7770k {
    /* renamed from: a */
    public static boolean m19757a(Context context, String str) {
        C8229o.m18169c(context, "The application context is required.");
        if (context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }
}
