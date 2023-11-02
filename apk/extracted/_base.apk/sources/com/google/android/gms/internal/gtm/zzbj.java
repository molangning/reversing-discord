package com.google.android.gms.internal.gtm;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class zzbj implements Runnable {
    final /* synthetic */ zzbq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(zzbq zzbqVar, boolean z) {
        this.zza = zzbqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzckVar = this.zza.zza;
        zzckVar.zzae();
    }
}
