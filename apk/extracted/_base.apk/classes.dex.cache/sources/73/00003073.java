package p054d1;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p021b1.C2043h1;
import p021b1.C2055l;
import p021b1.InterfaceC2025c0;

/* renamed from: d1.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C5735j {

    /* renamed from: a */
    private InterfaceC5720b f16509a;

    /* renamed from: b */
    private ScheduledFuture f16510b;

    /* renamed from: c */
    private String f16511c;

    /* renamed from: d */
    private Runnable f16512d;

    /* renamed from: e */
    private InterfaceC2025c0 f16513e = C2055l.m34422j();

    /* renamed from: d1.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC5736a implements Runnable {
        RunnableC5736a() {
            C5735j.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5735j.this.f16513e.mo34439g("%s fired", C5735j.this.f16511c);
            C5735j.this.f16512d.run();
            C5735j.this.f16510b = null;
        }
    }

    public C5735j(Runnable runnable, String str) {
        this.f16511c = str;
        this.f16509a = new C5726e(str, true);
        this.f16512d = runnable;
    }

    /* renamed from: f */
    private void m24596f(boolean z) {
        ScheduledFuture scheduledFuture = this.f16510b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(z);
        }
        this.f16510b = null;
        this.f16513e.mo34439g("%s canceled", this.f16511c);
    }

    /* renamed from: e */
    public void m24597e() {
        m24596f(false);
    }

    /* renamed from: g */
    public long m24595g() {
        ScheduledFuture scheduledFuture = this.f16510b;
        if (scheduledFuture == null) {
            return 0L;
        }
        return scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
    }

    /* renamed from: h */
    public void m24594h(long j) {
        m24596f(false);
        this.f16513e.mo34439g("%s starting. Launching in %s seconds", this.f16511c, C2043h1.f5687a.format(j / 1000.0d));
        this.f16510b = this.f16509a.mo24612c(new RunnableC5736a(), j);
    }

    /* renamed from: i */
    public void m24593i() {
        m24596f(true);
        InterfaceC5720b interfaceC5720b = this.f16509a;
        if (interfaceC5720b != null) {
            interfaceC5720b.mo24614a();
        }
        this.f16509a = null;
    }
}