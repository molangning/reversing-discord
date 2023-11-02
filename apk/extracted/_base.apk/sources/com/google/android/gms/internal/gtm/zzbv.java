package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import p029b9.C2198p;
import p119g9.C6582e;
import p119g9.InterfaceC6581d;
import p282p8.C11453b;
import p282p8.C11465n;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzbv {
    private static volatile zzbv zza;
    private final Context zzb;
    private final Context zzc;
    private final InterfaceC6581d zzd;
    private final zzct zze;
    private final zzfb zzf;
    private final C11465n zzg;
    private final zzbq zzh;
    private final zzcy zzi;
    private final zzft zzj;
    private final zzfh zzk;
    private final C11453b zzl;
    private final zzcn zzm;
    private final zzbi zzn;
    private final zzcf zzo;
    private final zzcx zzp;

    protected zzbv(zzbw zzbwVar) {
        Context zza2 = zzbwVar.zza();
        C2198p.m33984k(zza2, "Application context can't be null");
        Context zzb = zzbwVar.zzb();
        C2198p.m33985j(zzb);
        this.zzb = zza2;
        this.zzc = zzb;
        this.zzd = C6582e.m22380c();
        this.zze = new zzct(this);
        zzfb zzfbVar = new zzfb(this);
        zzfbVar.zzX();
        this.zzf = zzfbVar;
        zzfb zzm = zzm();
        String str = zzbt.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 134);
        sb2.append("Google Analytics ");
        sb2.append(str);
        sb2.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzm.zzM(sb2.toString());
        zzfh zzfhVar = new zzfh(this);
        zzfhVar.zzX();
        this.zzk = zzfhVar;
        zzft zzftVar = new zzft(this);
        zzftVar.zzX();
        this.zzj = zzftVar;
        zzbq zzbqVar = new zzbq(this, zzbwVar);
        zzcn zzcnVar = new zzcn(this);
        zzbi zzbiVar = new zzbi(this);
        zzcf zzcfVar = new zzcf(this);
        zzcx zzcxVar = new zzcx(this);
        C11465n m8039a = C11465n.m8039a(zza2);
        m8039a.m8034f(new zzbu(this));
        this.zzg = m8039a;
        C11453b c11453b = new C11453b(this);
        zzcnVar.zzX();
        this.zzm = zzcnVar;
        zzbiVar.zzX();
        this.zzn = zzbiVar;
        zzcfVar.zzX();
        this.zzo = zzcfVar;
        zzcxVar.zzX();
        this.zzp = zzcxVar;
        zzcy zzcyVar = new zzcy(this);
        zzcyVar.zzX();
        this.zzi = zzcyVar;
        zzbqVar.zzX();
        this.zzh = zzbqVar;
        c11453b.m8042d();
        this.zzl = c11453b;
        zzbqVar.zzm();
    }

    public static zzbv zzg(Context context) {
        C2198p.m33985j(context);
        if (zza == null) {
            synchronized (zzbv.class) {
                if (zza == null) {
                    InterfaceC6581d m22380c = C6582e.m22380c();
                    long mo22381b = m22380c.mo22381b();
                    zzbv zzbvVar = new zzbv(new zzbw(context));
                    zza = zzbvVar;
                    C11453b.m8043c();
                    long mo22381b2 = m22380c.mo22381b() - mo22381b;
                    long longValue = zzeu.zzQ.zzb().longValue();
                    if (mo22381b2 > longValue) {
                        zzbvVar.zzm().zzT("Slow initialization (ms)", Long.valueOf(mo22381b2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return zza;
    }

    private static final void zzs(zzbs zzbsVar) {
        C2198p.m33984k(zzbsVar, "Analytics service not created/initialized");
        C2198p.m33993b(zzbsVar.zzY(), "Analytics service not initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final C11465n zzd() {
        C2198p.m33985j(this.zzg);
        return this.zzg;
    }

    public final zzbq zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzct zzj() {
        return this.zze;
    }

    public final zzcy zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzfb zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzfb zzn() {
        return this.zzf;
    }

    public final zzfh zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzfh zzp() {
        zzfh zzfhVar = this.zzk;
        if (zzfhVar == null || !zzfhVar.zzY()) {
            return null;
        }
        return this.zzk;
    }

    public final zzft zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final InterfaceC6581d zzr() {
        return this.zzd;
    }
}
