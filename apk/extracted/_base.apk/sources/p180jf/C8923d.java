package p180jf;

import bf.InterfaceC2276b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import nf.C10859a;
import p085ef.EnumC6215c;
import p085ef.InterfaceC6213a;
import ye.AbstractC14015g;

/* renamed from: jf.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8923d extends AbstractC14015g.AbstractC14016a {

    /* renamed from: j */
    private final ScheduledExecutorService f23351j;

    /* renamed from: k */
    volatile boolean f23352k;

    public C8923d(ThreadFactory threadFactory) {
        this.f23351j = C8927g.m17037a(threadFactory);
    }

    @Override // bf.InterfaceC2276b
    /* renamed from: b */
    public boolean mo16034b() {
        return this.f23352k;
    }

    @Override // ye.AbstractC14015g.AbstractC14016a
    /* renamed from: c */
    public InterfaceC2276b mo901c(Runnable runnable) {
        return mo900d(runnable, 0L, null);
    }

    @Override // ye.AbstractC14015g.AbstractC14016a
    /* renamed from: d */
    public InterfaceC2276b mo900d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f23352k) {
            return EnumC6215c.INSTANCE;
        }
        return m17039e(runnable, j, timeUnit, null);
    }

    @Override // bf.InterfaceC2276b
    public void dispose() {
        if (!this.f23352k) {
            this.f23352k = true;
            this.f23351j.shutdownNow();
        }
    }

    /* renamed from: e */
    public RunnableC8926f m17039e(Runnable runnable, long j, TimeUnit timeUnit, InterfaceC6213a interfaceC6213a) {
        Future<?> schedule;
        RunnableC8926f runnableC8926f = new RunnableC8926f(C10859a.m9885l(runnable), interfaceC6213a);
        if (interfaceC6213a != null && !interfaceC6213a.mo23232c(runnableC8926f)) {
            return runnableC8926f;
        }
        try {
            if (j <= 0) {
                schedule = this.f23351j.submit((Callable) runnableC8926f);
            } else {
                schedule = this.f23351j.schedule((Callable) runnableC8926f, j, timeUnit);
            }
            runnableC8926f.m17038a(schedule);
        } catch (RejectedExecutionException e) {
            if (interfaceC6213a != null) {
                interfaceC6213a.mo23231d(runnableC8926f);
            }
            C10859a.m9887j(e);
        }
        return runnableC8926f;
    }
}
