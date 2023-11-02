package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import ga.C6594a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C5066a1 {

    /* renamed from: a */
    private static final long f14312a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f14313b = new Object();

    /* renamed from: c */
    private static C6594a f14314c;

    /* renamed from: a */
    private static void m26347a(Context context) {
        if (f14314c == null) {
            C6594a c6594a = new C6594a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f14314c = c6594a;
            c6594a.m22344d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m26346b(Intent intent) {
        synchronized (f14313b) {
            if (f14314c != null && m26345c(intent)) {
                m26344d(intent, false);
                f14314c.m22345c();
            }
        }
    }

    /* renamed from: c */
    static boolean m26345c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: d */
    private static void m26344d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ComponentName m26343e(Context context, Intent intent) {
        synchronized (f14313b) {
            m26347a(context);
            boolean m26345c = m26345c(intent);
            m26344d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!m26345c) {
                f14314c.m22347a(f14312a);
            }
            return startService;
        }
    }
}
