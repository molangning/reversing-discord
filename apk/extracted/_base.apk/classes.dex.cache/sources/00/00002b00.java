package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import java.util.UUID;
import p029b9.C2198p;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzfg {
    final /* synthetic */ zzfh zza;
    private final String zzb;
    private final long zzc;

    public /* synthetic */ zzfg(zzfh zzfhVar, String str, long j, zzff zzffVar) {
        boolean z;
        this.zza = zzfhVar;
        C2198p.m33989f("monitoring");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C2198p.m33994a(z);
        this.zzb = "monitoring";
        this.zzc = j;
    }

    private final long zzd() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zza.zza;
        return sharedPreferences.getLong(zzf(), 0L);
    }

    private final String zze() {
        return this.zzb.concat(":count");
    }

    private final String zzf() {
        return this.zzb.concat(":start");
    }

    private final void zzg() {
        SharedPreferences sharedPreferences;
        long mo22382a = this.zza.zzC().mo22382a();
        sharedPreferences = this.zza.zza;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(zze());
        edit.remove(zzb());
        edit.putLong(zzf(), mo22382a);
        edit.commit();
    }

    protected final String zzb() {
        return this.zzb.concat(":value");
    }

    public final void zzc(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        if (zzd() == 0) {
            zzg();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            sharedPreferences = this.zza.zza;
            long j = sharedPreferences.getLong(zze(), 0L);
            if (j <= 0) {
                sharedPreferences3 = this.zza.zza;
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.putString(zzb(), str);
                edit.putLong(zze(), 1L);
                edit.apply();
                return;
            }
            long j2 = j + 1;
            sharedPreferences2 = this.zza.zza;
            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
            if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2) {
                edit2.putString(zzb(), str);
            }
            edit2.putLong(zze(), j2);
            edit2.apply();
        }
    }
}