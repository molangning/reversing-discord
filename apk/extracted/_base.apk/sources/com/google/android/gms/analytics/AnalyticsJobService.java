package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

@TargetApi(24)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AnalyticsJobService extends JobService implements zzfm {

    /* renamed from: j */
    private zzfn<AnalyticsJobService> f12544j;

    /* renamed from: a */
    private final zzfn<AnalyticsJobService> m28333a() {
        if (this.f12544j == null) {
            this.f12544j = new zzfn<>(this);
        }
        return this.f12544j;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m28333a().zze();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m28333a().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m28333a().zza(intent, i, i2);
        return 2;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m28333a().zzi(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    @TargetApi(24)
    public final void zza(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
