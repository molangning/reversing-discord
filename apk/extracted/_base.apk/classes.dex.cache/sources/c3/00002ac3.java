package com.google.android.gms.internal.gtm;

import android.os.Handler;
import p029b9.C2198p;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class zzcw {
    private static volatile Handler zza;
    private final zzbv zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzcw(zzbv zzbvVar) {
        C2198p.m33985j(zzbvVar);
        this.zzb = zzbvVar;
        this.zzc = new zzcv(this);
    }

    private final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcw.class) {
            if (zza == null) {
                zza = new zzga(this.zzb.zza().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    public abstract void zza();

    public final long zzb() {
        if (this.zzd == 0) {
            return 0L;
        }
        return Math.abs(this.zzb.zzr().mo22382a() - this.zzd);
    }

    public final void zze(long j) {
        if (!zzh()) {
            return;
        }
        long j2 = 0;
        if (j < 0) {
            zzf();
            return;
        }
        long abs = j - Math.abs(this.zzb.zzr().mo22382a() - this.zzd);
        if (abs >= 0) {
            j2 = abs;
        }
        zzi().removeCallbacks(this.zzc);
        if (!zzi().postDelayed(this.zzc, j2)) {
            this.zzb.zzm().zzK("Failed to adjust delayed post. time", Long.valueOf(j2));
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j) {
        zzf();
        if (j >= 0) {
            this.zzd = this.zzb.zzr().mo22382a();
            if (!zzi().postDelayed(this.zzc, j)) {
                this.zzb.zzm().zzK("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean zzh() {
        return this.zzd != 0;
    }
}