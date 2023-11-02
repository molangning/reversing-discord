package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.Collections;
import p029b9.C2198p;
import p100f9.C6351b;
import p282p8.C11465n;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzcc extends zzbs {
    private final zzcb zza;
    private final zzcw zzb;
    private final zzfo zzc;
    private zzey zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcc(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = new zzfo(zzbvVar.zzr());
        this.zza = new zzcb(this);
        this.zzb = new zzby(this, zzbvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzcc zzccVar, ComponentName componentName) {
        C11465n.m8036d();
        if (zzccVar.zzd != null) {
            zzccVar.zzd = null;
            zzccVar.zzP("Disconnected from device AnalyticsService", componentName);
            zzccVar.zzs().zzk();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzi(zzcc zzccVar, zzey zzeyVar) {
        C11465n.m8036d();
        zzccVar.zzd = zzeyVar;
        zzccVar.zzj();
        zzccVar.zzs().zzj();
    }

    private final void zzj() {
        this.zzc.zzb();
        zzcw zzcwVar = this.zzb;
        zzw();
        zzcwVar.zzg(zzeu.zzK.zzb().longValue());
    }

    public final void zzc() {
        C11465n.m8036d();
        zzW();
        try {
            C6351b.m22870b().m22869c(zzo(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzd != null) {
            this.zzd = null;
            zzs().zzk();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }

    public final boolean zzf() {
        C11465n.m8036d();
        zzW();
        if (this.zzd != null) {
            return true;
        }
        zzey zza = this.zza.zza();
        if (zza != null) {
            this.zzd = zza;
            zzj();
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        C11465n.m8036d();
        zzW();
        if (this.zzd != null) {
            return true;
        }
        return false;
    }

    public final boolean zzh(zzex zzexVar) {
        String zzk;
        C2198p.m33985j(zzexVar);
        C11465n.m8036d();
        zzW();
        zzey zzeyVar = this.zzd;
        if (zzeyVar == null) {
            return false;
        }
        if (zzexVar.zzh()) {
            zzw();
            zzk = zzct.zzi();
        } else {
            zzw();
            zzk = zzct.zzk();
        }
        try {
            zzeyVar.zzf(zzexVar.zzg(), zzexVar.zzd(), zzk, Collections.emptyList());
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzO("Failed to send hits to AnalyticsService");
            return false;
        }
    }
}
