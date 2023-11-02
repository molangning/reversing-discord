package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import ga.C6594a;
import p029b9.C2198p;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzfi {
    static final Object zza = new Object();
    static C6594a zzb;
    static Boolean zzc;

    public static boolean zza(Context context) {
        C2198p.m33985j(context);
        Boolean bool = zzc;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zzi = zzfs.zzi(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        zzc = Boolean.valueOf(zzi);
        return zzi;
    }

    public static final void zzb(Context context, Intent intent) {
        zzbv zzg = zzbv.zzg(context);
        zzfb zzm = zzg.zzm();
        if (intent == null) {
            zzm.zzR("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzg.zzj();
        zzm.zzP("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean zzh = zzfn.zzh(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (zza) {
                context.startService(intent2);
                if (!zzh) {
                    return;
                }
                try {
                    if (zzb == null) {
                        C6594a c6594a = new C6594a(context, 1, "Analytics WakeLock");
                        zzb = c6594a;
                        c6594a.m22344d(false);
                    }
                    zzb.m22347a(1000L);
                } catch (SecurityException unused) {
                    zzm.zzR("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                }
            }
        }
    }
}
