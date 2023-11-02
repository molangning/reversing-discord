package com.google.android.gms.internal.gtm;

import p029b9.C2198p;
import p119g9.InterfaceC6581d;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzfo {
    private final InterfaceC6581d zza;
    private long zzb;

    public zzfo(InterfaceC6581d interfaceC6581d) {
        C2198p.m33985j(interfaceC6581d);
        this.zza = interfaceC6581d;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        this.zzb = this.zza.mo22381b();
    }

    public final boolean zzc(long j) {
        if (this.zzb == 0 || this.zza.mo22381b() - this.zzb > j) {
            return true;
        }
        return false;
    }
}