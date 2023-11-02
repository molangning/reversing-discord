package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import p029b9.C2198p;
import p282p8.C11465n;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzbq extends zzbs {
    private final zzck zza;

    public zzbq(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        C2198p.m33985j(zzbwVar);
        this.zza = new zzck(zzbvVar, zzbwVar);
    }

    public final void zzc() {
        zzW();
        Context zzo = zzo();
        if (zzfi.zza(zzo) && zzfn.zzh(zzo)) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsService"));
            zzo.startService(intent);
            return;
        }
        zze(null);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zza.zzX();
    }

    public final void zze(zzcz zzczVar) {
        zzW();
        zzq().m8035e(new zzbo(this, zzczVar));
    }

    public final void zzi() {
        C11465n.m8036d();
        this.zza.zzl();
    }

    public final void zzj() {
        C11465n.m8036d();
        this.zza.zzm();
    }

    public final void zzk() {
        zzW();
        C11465n.m8036d();
        zzck zzckVar = this.zza;
        C11465n.m8036d();
        zzckVar.zzW();
        zzckVar.zzO("Service disconnected");
    }

    public final void zzm() {
        this.zza.zzaa();
    }
}