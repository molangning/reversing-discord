package p059d6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p007a6.C0030a;
import p078e6.InterfaceC6117d;
import p130h6.C7021a;
import p381v5.AbstractC13103o;

/* renamed from: d6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5749d implements InterfaceC5773x {

    /* renamed from: a */
    private final Context f16535a;

    /* renamed from: b */
    private final InterfaceC6117d f16536b;

    /* renamed from: c */
    private final AbstractC5751f f16537c;

    public C5749d(Context context, InterfaceC6117d interfaceC6117d, AbstractC5751f abstractC5751f) {
        this.f16535a = context;
        this.f16536b = interfaceC6117d;
        this.f16537c = abstractC5751f;
    }

    /* renamed from: d */
    private boolean m24579d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                if (i3 < i2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p059d6.InterfaceC5773x
    /* renamed from: a */
    public void mo24524a(AbstractC13103o abstractC13103o, int i) {
        mo24523b(abstractC13103o, i, false);
    }

    @Override // p059d6.InterfaceC5773x
    /* renamed from: b */
    public void mo24523b(AbstractC13103o abstractC13103o, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f16535a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f16535a.getSystemService("jobscheduler");
        int m24580c = m24580c(abstractC13103o);
        if (!z && m24579d(jobScheduler, m24580c, i)) {
            C0030a.m41372a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC13103o);
            return;
        }
        long mo23439v0 = this.f16536b.mo23439v0(abstractC13103o);
        JobInfo.Builder m24576c = this.f16537c.m24576c(new JobInfo.Builder(m24580c, componentName), abstractC13103o.mo3259d(), mo23439v0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", abstractC13103o.mo3261b());
        persistableBundle.putInt("priority", C7021a.m21528a(abstractC13103o.mo3259d()));
        if (abstractC13103o.mo3260c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC13103o.mo3260c(), 0));
        }
        m24576c.setExtras(persistableBundle);
        C0030a.m41371b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC13103o, Integer.valueOf(m24580c), Long.valueOf(this.f16537c.m24572g(abstractC13103o.mo3259d(), mo23439v0, i)), Long.valueOf(mo23439v0), Integer.valueOf(i));
        jobScheduler.schedule(m24576c.build());
    }

    /* renamed from: c */
    int m24580c(AbstractC13103o abstractC13103o) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f16535a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC13103o.mo3261b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C7021a.m21528a(abstractC13103o.mo3259d())).array());
        if (abstractC13103o.mo3260c() != null) {
            adler32.update(abstractC13103o.mo3260c());
        }
        return (int) adler32.getValue();
    }
}
