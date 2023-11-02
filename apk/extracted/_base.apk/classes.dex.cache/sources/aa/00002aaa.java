package com.google.android.gms.internal.gtm;

import java.lang.Thread;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzbu implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbv zza;

    public zzbu(zzbv zzbvVar) {
        this.zza = zzbvVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        zzfb zzn = this.zza.zzn();
        if (zzn != null) {
            zzn.zzK("Job execution failed", th2);
        }
    }
}