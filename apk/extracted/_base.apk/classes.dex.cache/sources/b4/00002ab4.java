package com.google.android.gms.internal.gtm;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzcf extends zzbs {
    private final zzav zza;

    public zzcf(zzbv zzbvVar) {
        super(zzbvVar);
        this.zza = new zzav();
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        zzq().m8038b().zzh(this.zza);
        zzft zzB = zzB();
        zzB.zzW();
        String str = zzB.zzb;
        if (str != null) {
            this.zza.zzk(str);
        }
        zzB.zzW();
        String str2 = zzB.zza;
        if (str2 != null) {
            this.zza.zzl(str2);
        }
    }
}