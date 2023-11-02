package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.firebase.messaging.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5097l0 {
    /* renamed from: a */
    private static SharedPreferences m26213a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* renamed from: b */
    public static boolean m26212b(Context context) {
        return m26213a(context).getBoolean("proxy_notification_initialized", false);
    }

    /* renamed from: c */
    public static void m26211c(Context context, boolean z) {
        SharedPreferences.Editor edit = m26213a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}