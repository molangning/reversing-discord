package p415x3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p056d3.InterfaceC5739b;
import p415x3.InterfaceC13680a;

/* renamed from: x3.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13682c<T extends InterfaceC13680a> extends C13681b<T> {

    /* renamed from: e */
    private final InterfaceC5739b f35205e;

    /* renamed from: f */
    private final ScheduledExecutorService f35206f;

    /* renamed from: g */
    private boolean f35207g;

    /* renamed from: h */
    private long f35208h;

    /* renamed from: i */
    private long f35209i;

    /* renamed from: j */
    private long f35210j;

    /* renamed from: k */
    private InterfaceC13684b f35211k;

    /* renamed from: l */
    private final Runnable f35212l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x3.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC13683a implements Runnable {
        RunnableC13683a() {
            C13682c.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C13682c.this) {
                C13682c.this.f35207g = false;
                if (C13682c.this.m1814p()) {
                    if (C13682c.this.f35211k != null) {
                        C13682c.this.f35211k.mo1340h();
                    }
                } else {
                    C13682c.this.m1813q();
                }
            }
        }
    }

    /* renamed from: x3.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC13684b {
        /* renamed from: h */
        void mo1340h();
    }

    private C13682c(T t, InterfaceC13684b interfaceC13684b, InterfaceC5739b interfaceC5739b, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f35207g = false;
        this.f35209i = 2000L;
        this.f35210j = 1000L;
        this.f35212l = new RunnableC13683a();
        this.f35211k = interfaceC13684b;
        this.f35205e = interfaceC5739b;
        this.f35206f = scheduledExecutorService;
    }

    /* renamed from: n */
    public static <T extends InterfaceC13680a & InterfaceC13684b> C13681b<T> m1816n(T t, InterfaceC5739b interfaceC5739b, ScheduledExecutorService scheduledExecutorService) {
        return m1815o(t, (InterfaceC13684b) t, interfaceC5739b, scheduledExecutorService);
    }

    /* renamed from: o */
    public static <T extends InterfaceC13680a> C13681b<T> m1815o(T t, InterfaceC13684b interfaceC13684b, InterfaceC5739b interfaceC5739b, ScheduledExecutorService scheduledExecutorService) {
        return new C13682c(t, interfaceC13684b, interfaceC5739b, scheduledExecutorService);
    }

    /* renamed from: p */
    public boolean m1814p() {
        return this.f35205e.now() - this.f35208h > this.f35209i;
    }

    /* renamed from: q */
    public synchronized void m1813q() {
        if (!this.f35207g) {
            this.f35207g = true;
            this.f35206f.schedule(this.f35212l, this.f35210j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // p415x3.C13681b, p415x3.InterfaceC13680a
    /* renamed from: g */
    public boolean mo1341g(Drawable drawable, Canvas canvas, int i) {
        this.f35208h = this.f35205e.now();
        boolean mo1341g = super.mo1341g(drawable, canvas, i);
        m1813q();
        return mo1341g;
    }
}