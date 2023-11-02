package p054d1;

import java.text.DecimalFormat;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p021b1.C2043h1;
import p021b1.C2055l;
import p021b1.InterfaceC2025c0;

/* renamed from: d1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C5733i {

    /* renamed from: a */
    private InterfaceC5720b f16500a;

    /* renamed from: b */
    private ScheduledFuture f16501b;

    /* renamed from: c */
    private String f16502c;

    /* renamed from: d */
    private Runnable f16503d;

    /* renamed from: e */
    private long f16504e;

    /* renamed from: f */
    private long f16505f;

    /* renamed from: g */
    private boolean f16506g = true;

    /* renamed from: h */
    private InterfaceC2025c0 f16507h = C2055l.m34422j();

    /* renamed from: d1.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC5734a implements Runnable {
        RunnableC5734a() {
            C5733i.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5733i.this.f16507h.mo34439g("%s fired", C5733i.this.f16502c);
            C5733i.this.f16503d.run();
        }
    }

    public C5733i(Runnable runnable, long j, long j2, String str) {
        this.f16500a = new C5726e(str, true);
        this.f16502c = str;
        this.f16503d = runnable;
        this.f16504e = j;
        this.f16505f = j2;
        DecimalFormat decimalFormat = C2043h1.f5687a;
        String format = decimalFormat.format(j2 / 1000.0d);
        this.f16507h.mo34439g("%s configured to fire after %s seconds of starting and cycles every %s seconds", str, decimalFormat.format(j / 1000.0d), format);
    }

    /* renamed from: d */
    private void m24605d(boolean z) {
        ScheduledFuture scheduledFuture = this.f16501b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(z);
        }
        this.f16501b = null;
    }

    /* renamed from: e */
    public void m24604e() {
        if (!this.f16506g) {
            this.f16507h.mo34439g("%s is already started", this.f16502c);
            return;
        }
        this.f16507h.mo34439g("%s starting", this.f16502c);
        this.f16501b = this.f16500a.mo24613b(new RunnableC5734a(), this.f16504e, this.f16505f);
        this.f16506g = false;
    }

    /* renamed from: f */
    public void m24603f() {
        if (this.f16506g) {
            this.f16507h.mo34439g("%s is already suspended", this.f16502c);
            return;
        }
        this.f16504e = this.f16501b.getDelay(TimeUnit.MILLISECONDS);
        this.f16501b.cancel(false);
        this.f16507h.mo34439g("%s suspended with %s seconds left", this.f16502c, C2043h1.f5687a.format(this.f16504e / 1000.0d));
        this.f16506g = true;
    }

    /* renamed from: g */
    public void m24602g() {
        m24605d(true);
        InterfaceC5720b interfaceC5720b = this.f16500a;
        if (interfaceC5720b != null) {
            interfaceC5720b.mo24614a();
        }
        this.f16500a = null;
    }
}