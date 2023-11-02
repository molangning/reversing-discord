package p180jf;

import bf.C2275a;
import bf.InterfaceC2276b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nf.C10859a;
import p085ef.EnumC6215c;
import ye.AbstractC14015g;

/* renamed from: jf.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8930h extends AbstractC14015g {

    /* renamed from: d */
    static final ThreadFactoryC8924e f23365d;

    /* renamed from: e */
    static final ScheduledExecutorService f23366e;

    /* renamed from: b */
    final ThreadFactory f23367b;

    /* renamed from: c */
    final AtomicReference<ScheduledExecutorService> f23368c;

    /* renamed from: jf.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C8931a extends AbstractC14015g.AbstractC14016a {

        /* renamed from: j */
        final ScheduledExecutorService f23369j;

        /* renamed from: k */
        final C2275a f23370k = new C2275a();

        /* renamed from: l */
        volatile boolean f23371l;

        C8931a(ScheduledExecutorService scheduledExecutorService) {
            this.f23369j = scheduledExecutorService;
        }

        @Override // bf.InterfaceC2276b
        /* renamed from: b */
        public boolean mo16034b() {
            return this.f23371l;
        }

        @Override // ye.AbstractC14015g.AbstractC14016a
        /* renamed from: d */
        public InterfaceC2276b mo900d(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> schedule;
            if (this.f23371l) {
                return EnumC6215c.INSTANCE;
            }
            RunnableC8926f runnableC8926f = new RunnableC8926f(C10859a.m9885l(runnable), this.f23370k);
            this.f23370k.mo23232c(runnableC8926f);
            try {
                if (j <= 0) {
                    schedule = this.f23369j.submit((Callable) runnableC8926f);
                } else {
                    schedule = this.f23369j.schedule((Callable) runnableC8926f, j, timeUnit);
                }
                runnableC8926f.m17038a(schedule);
                return runnableC8926f;
            } catch (RejectedExecutionException e) {
                dispose();
                C10859a.m9887j(e);
                return EnumC6215c.INSTANCE;
            }
        }

        @Override // bf.InterfaceC2276b
        public void dispose() {
            if (!this.f23371l) {
                this.f23371l = true;
                this.f23370k.dispose();
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f23366e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f23365d = new ThreadFactoryC8924e("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C8930h() {
        this(f23365d);
    }

    /* renamed from: b */
    static ScheduledExecutorService m17030b(ThreadFactory threadFactory) {
        return C8927g.m17037a(threadFactory);
    }

    @Override // ye.AbstractC14015g
    /* renamed from: a */
    public AbstractC14015g.AbstractC14016a mo903a() {
        return new C8931a(this.f23368c.get());
    }

    public C8930h(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f23368c = atomicReference;
        this.f23367b = threadFactory;
        atomicReference.lazySet(m17030b(threadFactory));
    }
}