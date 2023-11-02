package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import p282p8.C11465n;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzfh extends zzbs {
    private SharedPreferences zza;
    private long zzb;
    private long zzc;
    private final zzfg zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfh(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = -1L;
        zzw();
        this.zzd = new zzfg(this, "monitoring", zzeu.zzP.zzb().longValue(), null);
    }

    public final long zza() {
        C11465n.m8036d();
        zzW();
        long j = this.zzb;
        if (j == 0) {
            long j2 = this.zza.getLong("first_run", 0L);
            if (j2 != 0) {
                this.zzb = j2;
                return j2;
            }
            long mo22382a = zzC().mo22382a();
            SharedPreferences.Editor edit = this.zza.edit();
            edit.putLong("first_run", mo22382a);
            if (!edit.commit()) {
                zzR("Failed to commit first run time");
            }
            this.zzb = mo22382a;
            return mo22382a;
        }
        return j;
    }

    public final long zzb() {
        C11465n.m8036d();
        zzW();
        long j = this.zzc;
        if (j == -1) {
            long j2 = this.zza.getLong("last_dispatch", 0L);
            this.zzc = j2;
            return j2;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzfg zze() {
        return this.zzd;
    }

    public final void zzi() {
        C11465n.m8036d();
        zzW();
        long mo22382a = zzC().mo22382a();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("last_dispatch", mo22382a);
        edit.apply();
        this.zzc = mo22382a;
    }
}
