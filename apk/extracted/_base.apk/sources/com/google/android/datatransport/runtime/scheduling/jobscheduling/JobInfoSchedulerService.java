package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import p130h6.C7021a;
import p381v5.AbstractC13103o;
import p381v5.C13109t;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m29935b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C13109t.m3241f(getApplicationContext());
        AbstractC13103o.AbstractC13104a mo3253d = AbstractC13103o.m3262a().mo3255b(string).mo3253d(C7021a.m21527b(i));
        if (string2 != null) {
            mo3253d.mo3254c(Base64.decode(string2, 0));
        }
        C13109t.m3244c().m3242e().m24536v(mo3253d.mo3256a(), i2, new Runnable() { // from class: d6.e
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m29935b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
