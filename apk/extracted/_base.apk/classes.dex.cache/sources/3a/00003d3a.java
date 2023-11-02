package p180jf;

import androidx.lifecycle.C1696m;
import bf.C2275a;
import bf.InterfaceC2276b;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p085ef.EnumC6215c;
import ye.AbstractC14015g;

/* renamed from: jf.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8918b extends AbstractC14015g {

    /* renamed from: d */
    static final ThreadFactoryC8924e f23330d;

    /* renamed from: e */
    static final ThreadFactoryC8924e f23331e;

    /* renamed from: h */
    static final C8921c f23334h;

    /* renamed from: i */
    static final RunnableC8919a f23335i;

    /* renamed from: b */
    final ThreadFactory f23336b;

    /* renamed from: c */
    final AtomicReference<RunnableC8919a> f23337c;

    /* renamed from: g */
    private static final TimeUnit f23333g = TimeUnit.SECONDS;

    /* renamed from: f */
    private static final long f23332f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: jf.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class RunnableC8919a implements Runnable {

        /* renamed from: j */
        private final long f23338j;

        /* renamed from: k */
        private final ConcurrentLinkedQueue<C8921c> f23339k;

        /* renamed from: l */
        final C2275a f23340l;

        /* renamed from: m */
        private final ScheduledExecutorService f23341m;

        /* renamed from: n */
        private final Future<?> f23342n;

        /* renamed from: o */
        private final ThreadFactory f23343o;

        RunnableC8919a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f23338j = j3;
            this.f23339k = new ConcurrentLinkedQueue<>();
            this.f23340l = new C2275a();
            this.f23343o = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C8918b.f23331e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f23341m = scheduledExecutorService;
            this.f23342n = scheduledFuture;
        }

        /* renamed from: a */
        void m17046a() {
            if (!this.f23339k.isEmpty()) {
                long m17044c = m17044c();
                Iterator<C8921c> it = this.f23339k.iterator();
                while (it.hasNext()) {
                    C8921c next = it.next();
                    if (next.m17041f() <= m17044c) {
                        if (this.f23339k.remove(next)) {
                            this.f23340l.mo23231d(next);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        C8921c m17045b() {
            if (this.f23340l.mo16034b()) {
                return C8918b.f23334h;
            }
            while (!this.f23339k.isEmpty()) {
                C8921c poll = this.f23339k.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C8921c c8921c = new C8921c(this.f23343o);
            this.f23340l.mo23232c(c8921c);
            return c8921c;
        }

        /* renamed from: c */
        long m17044c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        void m17043d(C8921c c8921c) {
            c8921c.m17040g(m17044c() + this.f23338j);
            this.f23339k.offer(c8921c);
        }

        /* renamed from: e */
        void m17042e() {
            this.f23340l.dispose();
            Future<?> future = this.f23342n;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f23341m;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m17046a();
        }
    }

    /* renamed from: jf.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C8920b extends AbstractC14015g.AbstractC14016a {

        /* renamed from: k */
        private final RunnableC8919a f23345k;

        /* renamed from: l */
        private final C8921c f23346l;

        /* renamed from: m */
        final AtomicBoolean f23347m = new AtomicBoolean();

        /* renamed from: j */
        private final C2275a f23344j = new C2275a();

        C8920b(RunnableC8919a runnableC8919a) {
            this.f23345k = runnableC8919a;
            this.f23346l = runnableC8919a.m17045b();
        }

        @Override // bf.InterfaceC2276b
        /* renamed from: b */
        public boolean mo16034b() {
            return this.f23347m.get();
        }

        @Override // ye.AbstractC14015g.AbstractC14016a
        /* renamed from: d */
        public InterfaceC2276b mo900d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f23344j.mo16034b()) {
                return EnumC6215c.INSTANCE;
            }
            return this.f23346l.m17039e(runnable, j, timeUnit, this.f23344j);
        }

        @Override // bf.InterfaceC2276b
        public void dispose() {
            if (this.f23347m.compareAndSet(false, true)) {
                this.f23344j.dispose();
                this.f23345k.m17043d(this.f23346l);
            }
        }
    }

    /* renamed from: jf.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8921c extends C8923d {

        /* renamed from: l */
        private long f23348l;

        C8921c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f23348l = 0L;
        }

        /* renamed from: f */
        public long m17041f() {
            return this.f23348l;
        }

        /* renamed from: g */
        public void m17040g(long j) {
            this.f23348l = j;
        }
    }

    static {
        C8921c c8921c = new C8921c(new ThreadFactoryC8924e("RxCachedThreadSchedulerShutdown"));
        f23334h = c8921c;
        c8921c.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        ThreadFactoryC8924e threadFactoryC8924e = new ThreadFactoryC8924e("RxCachedThreadScheduler", max);
        f23330d = threadFactoryC8924e;
        f23331e = new ThreadFactoryC8924e("RxCachedWorkerPoolEvictor", max);
        RunnableC8919a runnableC8919a = new RunnableC8919a(0L, null, threadFactoryC8924e);
        f23335i = runnableC8919a;
        runnableC8919a.m17042e();
    }

    public C8918b() {
        this(f23330d);
    }

    @Override // ye.AbstractC14015g
    /* renamed from: a */
    public AbstractC14015g.AbstractC14016a mo903a() {
        return new C8920b(this.f23337c.get());
    }

    /* renamed from: b */
    public void m17047b() {
        RunnableC8919a runnableC8919a = new RunnableC8919a(f23332f, f23333g, this.f23336b);
        if (!C1696m.m36034a(this.f23337c, f23335i, runnableC8919a)) {
            runnableC8919a.m17042e();
        }
    }

    public C8918b(ThreadFactory threadFactory) {
        this.f23336b = threadFactory;
        this.f23337c = new AtomicReference<>(f23335i);
        m17047b();
    }
}