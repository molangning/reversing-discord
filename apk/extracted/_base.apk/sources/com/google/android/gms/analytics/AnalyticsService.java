package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AnalyticsService extends Service implements zzfm {

    /* renamed from: j */
    private zzfn<AnalyticsService> f12546j;

    /* renamed from: a */
    private final zzfn<AnalyticsService> m28332a() {
        if (this.f12546j == null) {
            this.f12546j = new zzfn<>(this);
        }
        return this.f12546j;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        m28332a();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m28332a().zze();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m28332a().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m28332a().zza(intent, i, i2);
        return 2;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public final void zza(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }
}
