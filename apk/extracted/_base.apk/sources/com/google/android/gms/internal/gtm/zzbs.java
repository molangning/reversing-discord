package com.google.android.gms.internal.gtm;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class zzbs extends zzbr {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbs(zzbv zzbvVar) {
        super(zzbvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzW() {
        if (zzY()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzX() {
        zzd();
        this.zza = true;
    }

    public final boolean zzY() {
        return this.zza;
    }

    protected abstract void zzd();
}
