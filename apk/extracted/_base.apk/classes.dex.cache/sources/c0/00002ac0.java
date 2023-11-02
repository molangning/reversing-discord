package com.google.android.gms.internal.gtm;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import p029b9.C2198p;
import p119g9.C6588k;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzct {
    private final zzbv zza;
    private volatile Boolean zzb;
    private String zzc;
    private Set<Integer> zzd;

    public zzct(zzbv zzbvVar) {
        C2198p.m33985j(zzbvVar);
        this.zza = zzbvVar;
    }

    public static final long zzd() {
        return zzeu.zzm.zzb().longValue();
    }

    public static final long zze() {
        return zzeu.zzj.zzb().longValue();
    }

    public static final int zzf() {
        return zzeu.zzy.zzb().intValue();
    }

    public static final int zzg() {
        return zzeu.zzp.zzb().intValue();
    }

    public static final int zzh() {
        return zzeu.zzo.zzb().intValue();
    }

    public static final String zzi() {
        return zzeu.zzr.zzb();
    }

    public static final String zzj() {
        return zzeu.zzs.zzb();
    }

    public static final String zzk() {
        return zzeu.zzq.zzb();
    }

    public static final boolean zzl() {
        return zzeu.zzb.zzb().booleanValue();
    }

    public final Set<Integer> zza() {
        String str;
        String zzb = zzeu.zzB.zzb();
        if (this.zzd == null || (str = this.zzc) == null || !str.equals(zzb)) {
            String[] split = TextUtils.split(zzb, ",");
            HashSet hashSet = new HashSet();
            for (String str2 : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str2)));
                } catch (NumberFormatException unused) {
                }
            }
            this.zzc = zzb;
            this.zzd = hashSet;
        }
        return this.zzd;
    }

    public final boolean zzb() {
        if (this.zzb == null) {
            synchronized (this) {
                if (this.zzb == null) {
                    ApplicationInfo applicationInfo = this.zza.zza().getApplicationInfo();
                    String m22356a = C6588k.m22356a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(m22356a)) {
                            z = true;
                        }
                        this.zzb = Boolean.valueOf(z);
                    }
                    if ((this.zzb == null || !this.zzb.booleanValue()) && "com.google.android.gms.analytics".equals(m22356a)) {
                        this.zzb = Boolean.TRUE;
                    }
                    if (this.zzb == null) {
                        this.zzb = Boolean.TRUE;
                        this.zza.zzm().zzJ("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzb.booleanValue();
    }
}