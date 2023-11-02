package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p029b9.C2198p;
import p154i9.C7478d;
import p282p8.C11452a;
import p282p8.C11465n;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzck extends zzbs {
    private boolean zza;
    private final zzce zzb;
    private final zzfe zzc;
    private final zzfc zzd;
    private final zzcc zze;
    private long zzf;
    private final zzcw zzg;
    private final zzcw zzh;
    private final zzfo zzi;
    private long zzj;
    private boolean zzk;

    public zzck(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        C2198p.m33985j(zzbwVar);
        this.zzf = Long.MIN_VALUE;
        this.zzd = new zzfc(zzbvVar);
        this.zzb = new zzce(zzbvVar);
        this.zzc = new zzfe(zzbvVar);
        this.zze = new zzcc(zzbvVar);
        this.zzi = new zzfo(zzC());
        this.zzg = new zzcg(this, zzbvVar);
        this.zzh = new zzch(this, zzbvVar);
    }

    private final void zzag() {
        zzcy zzy = zzy();
        if (zzy.zze()) {
            zzy.zza();
        }
    }

    private final void zzah() {
        if (this.zzg.zzh()) {
            zzO("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzai() {
        long j;
        zzcy zzy = zzy();
        if (zzy.zzc() && !zzy.zze()) {
            C11465n.m8036d();
            zzW();
            try {
                j = this.zzb.zzc();
            } catch (SQLiteException e) {
                zzK("Failed to get min/max hit times from local store", e);
                j = 0;
            }
            if (j != 0) {
                long abs = Math.abs(zzC().mo22382a() - j);
                zzw();
                if (abs <= zzeu.zzn.zzb().longValue()) {
                    zzw();
                    zzP("Dispatch alarm scheduled (ms)", Long.valueOf(zzct.zzd()));
                    zzy.zzb();
                }
            }
        }
    }

    private final boolean zzak(String str) {
        return C7478d.m20598a(zzo()).m20604a(str) == 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzck zzckVar) {
        try {
            zzckVar.zzb.zza();
            zzckVar.zzae();
        } catch (SQLiteException e) {
            zzckVar.zzS("Failed to delete stale hits", e);
        }
        zzcw zzcwVar = zzckVar.zzh;
        zzckVar.zzw();
        zzcwVar.zzg(86400000L);
    }

    public final long zza() {
        long j = this.zzf;
        if (j != Long.MIN_VALUE) {
            return j;
        }
        zzw();
        long longValue = zzeu.zzi.zzb().longValue();
        zzft zzB = zzB();
        zzB.zzW();
        if (zzB.zzc) {
            zzft zzB2 = zzB();
            zzB2.zzW();
            return zzB2.zzd * 1000;
        }
        return longValue;
    }

    public final void zzaa() {
        zzW();
        C2198p.m33982m(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().m8035e(new zzci(this));
    }

    public final void zzab() {
        zzW();
        zzw();
        C11465n.m8036d();
        Context zza = zzt().zza();
        if (!zzfi.zza(zza)) {
            zzR("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfn.zzh(zza)) {
            zzJ("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!C11452a.zzb(zza)) {
            zzR("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzak("android.permission.ACCESS_NETWORK_STATE")) {
            zzJ("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (!zzak("android.permission.INTERNET")) {
            zzJ("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (zzfn.zzh(zzo())) {
            zzO("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzR("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzac()) {
                zzi();
            }
        }
        zzae();
    }

    public final void zzad() {
        zzW();
        C11465n.m8036d();
        this.zzk = true;
        this.zze.zzc();
        zzae();
    }

    public final void zzae() {
        long min;
        C11465n.m8036d();
        zzW();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzac()) {
                    this.zzd.zzc();
                    zzah();
                    zzag();
                    return;
                }
                if (!zzeu.zzJ.zzb().booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzah();
                        zzag();
                        zzai();
                        return;
                    }
                }
                zzai();
                long zza = zza();
                long zzb = zzA().zzb();
                if (zzb != 0) {
                    min = zza - Math.abs(zzC().mo22382a() - zzb);
                    if (min <= 0) {
                        zzw();
                        min = Math.min(zzct.zze(), zza);
                    }
                } else {
                    zzw();
                    min = Math.min(zzct.zze(), zza);
                }
                zzP("Dispatch scheduled (ms)", Long.valueOf(min));
                if (this.zzg.zzh()) {
                    this.zzg.zze(Math.max(1L, min + this.zzg.zzb()));
                    return;
                }
                this.zzg.zzg(min);
                return;
            }
        }
        this.zzd.zzc();
        zzah();
        zzag();
    }

    protected final boolean zzaf() {
        boolean z;
        C11465n.m8036d();
        zzW();
        zzO("Dispatching a batch of local hits");
        if (!this.zze.zzg()) {
            zzw();
            z = true;
        } else {
            z = false;
        }
        boolean zze = true ^ this.zzc.zze();
        if (z && zze) {
            zzO("No network or service available. Will retry later");
            return false;
        }
        zzw();
        int zzh = zzct.zzh();
        zzw();
        long max = Math.max(zzh, zzct.zzg());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        while (true) {
            try {
                try {
                    this.zzb.zzm();
                    arrayList.clear();
                    try {
                        List<zzex> zzj = this.zzb.zzj(max);
                        if (zzj.isEmpty()) {
                            zzO("Store is empty, nothing to dispatch");
                            zzah();
                            zzag();
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e) {
                                zzK("Failed to commit local dispatch transaction", e);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                        zzP("Hits loaded from store. count", Integer.valueOf(zzj.size()));
                        Iterator<zzex> it = zzj.iterator();
                        while (it.hasNext()) {
                            if (it.next().zzb() == j) {
                                zzL("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(zzj.size()));
                                zzah();
                                zzag();
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                    return false;
                                } catch (SQLiteException e2) {
                                    zzK("Failed to commit local dispatch transaction", e2);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            }
                        }
                        if (this.zze.zzg()) {
                            zzw();
                            zzO("Service connected, sending hits to the service");
                            while (!zzj.isEmpty()) {
                                zzex zzexVar = zzj.get(0);
                                if (!this.zze.zzh(zzexVar)) {
                                    break;
                                }
                                j = Math.max(j, zzexVar.zzb());
                                zzj.remove(zzexVar);
                                zzG("Hit sent do device AnalyticsService for delivery", zzexVar);
                                try {
                                    this.zzb.zzn(zzexVar.zzb());
                                    arrayList.add(Long.valueOf(zzexVar.zzb()));
                                } catch (SQLiteException e3) {
                                    zzK("Failed to remove hit that was send for delivery", e3);
                                    zzah();
                                    zzag();
                                    try {
                                        this.zzb.zzab();
                                        this.zzb.zzaa();
                                        return false;
                                    } catch (SQLiteException e4) {
                                        zzK("Failed to commit local dispatch transaction", e4);
                                        zzah();
                                        zzag();
                                        return false;
                                    }
                                }
                            }
                        }
                        if (this.zzc.zze()) {
                            List<Long> zzc = this.zzc.zzc(zzj);
                            for (Long l : zzc) {
                                j = Math.max(j, l.longValue());
                            }
                            try {
                                this.zzb.zzZ(zzc);
                                arrayList.addAll(zzc);
                            } catch (SQLiteException e5) {
                                zzK("Failed to remove successfully uploaded hits", e5);
                                zzah();
                                zzag();
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                    return false;
                                } catch (SQLiteException e6) {
                                    zzK("Failed to commit local dispatch transaction", e6);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e7) {
                                zzK("Failed to commit local dispatch transaction", e7);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                        } catch (SQLiteException e8) {
                            zzK("Failed to commit local dispatch transaction", e8);
                            zzah();
                            zzag();
                            return false;
                        }
                    } catch (SQLiteException e9) {
                        zzS("Failed to read hits from persisted store", e9);
                        zzah();
                        zzag();
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                            return false;
                        } catch (SQLiteException e10) {
                            zzK("Failed to commit local dispatch transaction", e10);
                            zzah();
                            zzag();
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    this.zzb.zzab();
                    this.zzb.zzaa();
                    throw th2;
                }
                this.zzb.zzab();
                this.zzb.zzaa();
                throw th2;
            } catch (SQLiteException e11) {
                zzK("Failed to commit local dispatch transaction", e11);
                zzah();
                zzag();
                return false;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zzb.zzX();
        this.zzc.zzX();
        this.zze.zzX();
    }

    public final void zzf(zzcz zzczVar) {
        zzg(zzczVar, this.zzj);
    }

    public final void zzg(zzcz zzczVar, long j) {
        long j2;
        C11465n.m8036d();
        zzW();
        long zzb = zzA().zzb();
        if (zzb != 0) {
            j2 = Math.abs(zzC().mo22382a() - zzb);
        } else {
            j2 = -1;
        }
        zzG("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j2));
        zzw();
        zzi();
        try {
            zzaf();
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(null);
            }
            if (this.zzj != j) {
                this.zzd.zzb();
            }
        } catch (Exception e) {
            zzK("Local dispatch failed", e);
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(e);
            }
        }
    }

    protected final void zzi() {
        if (this.zzk) {
            return;
        }
        zzw();
        if (!zzct.zzl() || this.zze.zzg()) {
            return;
        }
        zzw();
        if (this.zzi.zzc(zzeu.zzO.zzb().longValue())) {
            this.zzi.zzb();
            zzO("Connecting to service");
            if (this.zze.zzf()) {
                zzO("Connected to service");
                this.zzi.zza();
                zzm();
            }
        }
    }

    public final void zzl() {
        C11465n.m8036d();
        this.zzj = zzC().mo22382a();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x004d A[LOOP:1: B:53:0x004d->B:60:0x0069, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm() {
        /*
            r5 = this;
            p282p8.C11465n.m8036d()
            r5.zzw()
            p282p8.C11465n.m8036d()
            r5.zzW()
            r5.zzE()
            r5.zzw()
            boolean r0 = com.google.android.gms.internal.gtm.zzct.zzl()
            if (r0 != 0) goto L1d
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r5.zzR(r0)
        L1d:
            com.google.android.gms.internal.gtm.zzcc r0 = r5.zze
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L2b
            java.lang.String r0 = "Service not connected"
            r5.zzO(r0)
            return
        L2b:
            com.google.android.gms.internal.gtm.zzce r0 = r5.zzb
            boolean r0 = r0.zzac()
            if (r0 == 0) goto L34
            return
        L34:
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r5.zzO(r0)
        L39:
            com.google.android.gms.internal.gtm.zzce r0 = r5.zzb     // Catch: android.database.sqlite.SQLiteException -> L84
            r5.zzw()     // Catch: android.database.sqlite.SQLiteException -> L84
            int r1 = com.google.android.gms.internal.gtm.zzct.zzh()     // Catch: android.database.sqlite.SQLiteException -> L84
            long r1 = (long) r1     // Catch: android.database.sqlite.SQLiteException -> L84
            java.util.List r0 = r0.zzj(r1)     // Catch: android.database.sqlite.SQLiteException -> L84
            boolean r1 = r0.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> L84
            if (r1 != 0) goto L80
        L4d:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L39
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.gtm.zzex r1 = (com.google.android.gms.internal.gtm.zzex) r1
            com.google.android.gms.internal.gtm.zzcc r2 = r5.zze
            boolean r2 = r2.zzh(r1)
            if (r2 != 0) goto L66
            r5.zzae()
            return
        L66:
            r0.remove(r1)
            com.google.android.gms.internal.gtm.zzce r2 = r5.zzb     // Catch: android.database.sqlite.SQLiteException -> L73
            long r3 = r1.zzb()     // Catch: android.database.sqlite.SQLiteException -> L73
            r2.zzn(r3)     // Catch: android.database.sqlite.SQLiteException -> L73
            goto L4d
        L73:
            r0 = move-exception
            java.lang.String r1 = "Failed to remove hit that was send for delivery"
            r5.zzK(r1, r0)
            r5.zzah()
            r5.zzag()
            return
        L80:
            r5.zzae()     // Catch: android.database.sqlite.SQLiteException -> L84
            return
        L84:
            r0 = move-exception
            java.lang.String r1 = "Failed to read hits from store"
            r5.zzK(r1, r0)
            r5.zzah()
            r5.zzag()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzm():void");
    }
}