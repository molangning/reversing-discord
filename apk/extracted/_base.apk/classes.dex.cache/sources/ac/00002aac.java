package com.google.android.gms.internal.gtm;

import android.content.Context;
import p029b9.C2198p;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzbw {
    private final Context zza;
    private final Context zzb;

    public zzbw(Context context) {
        C2198p.m33985j(context);
        Context applicationContext = context.getApplicationContext();
        C2198p.m33984k(applicationContext, "Application context can't be null");
        this.zza = applicationContext;
        this.zzb = applicationContext;
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}