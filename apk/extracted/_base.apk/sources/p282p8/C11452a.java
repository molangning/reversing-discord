package p282p8;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzfs;
import p029b9.C2198p;

/* renamed from: p8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11452a extends BroadcastReceiver {
    static Boolean zza;

    public static boolean zzb(Context context) {
        C2198p.m33985j(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zzi = zzfs.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = Boolean.valueOf(zzi);
        return zzi;
    }
}
