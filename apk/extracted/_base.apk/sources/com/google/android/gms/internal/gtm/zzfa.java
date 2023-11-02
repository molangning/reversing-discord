package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.util.Log;
import p282p8.InterfaceC11454c;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzfa {
    private static volatile InterfaceC11454c zza = new zzcu();

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String str2;
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzK(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                String str3 = (String) obj;
                StringBuilder sb2 = new StringBuilder(str.length() + 1 + str3.length());
                sb2.append(str);
                sb2.append(":");
                sb2.append(str3);
                str2 = sb2.toString();
            } else {
                str2 = str;
            }
            Log.e(zzeu.zzc.zzb(), str2);
        }
        InterfaceC11454c interfaceC11454c = zza;
        if (interfaceC11454c != null) {
            interfaceC11454c.error(str);
        }
    }

    public static boolean zzf(int i) {
        if (zza == null || zza.getLogLevel() > i) {
            return false;
        }
        return true;
    }
}
