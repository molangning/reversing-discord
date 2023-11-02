package p359u2;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p414x2.C13677a;

/* renamed from: u2.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12819b extends AbstractExecutorService {

    /* renamed from: q */
    private static final Class<?> f33316q = C12819b.class;

    /* renamed from: j */
    private final String f33317j;

    /* renamed from: k */
    private final Executor f33318k;

    /* renamed from: l */
    private volatile int f33319l;

    /* renamed from: m */
    private final BlockingQueue<Runnable> f33320m;

    /* renamed from: n */
    private final RunnableC12821b f33321n;

    /* renamed from: o */
    private final AtomicInteger f33322o;

    /* renamed from: p */
    private final AtomicInteger f33323p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u2.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC12821b implements Runnable {
        private RunnableC12821b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) C12819b.this.f33320m.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    C13677a.m1840x(C12819b.f33316q, "%s: Worker has nothing to run", C12819b.this.f33317j);
                }
                int decrementAndGet = C12819b.this.f33322o.decrementAndGet();
                if (!C12819b.this.f33320m.isEmpty()) {
                    C12819b.this.m3867f();
                } else {
                    C13677a.m1839y(C12819b.f33316q, "%s: worker finished; %d workers left", C12819b.this.f33317j, Integer.valueOf(decrementAndGet));
                }
            } catch (Throwable th2) {
                int decrementAndGet2 = C12819b.this.f33322o.decrementAndGet();
                if (!C12819b.this.f33320m.isEmpty()) {
                    C12819b.this.m3867f();
                } else {
                    C13677a.m1839y(C12819b.f33316q, "%s: worker finished; %d workers left", C12819b.this.f33317j, Integer.valueOf(decrementAndGet2));
                }
                throw th2;
            }
        }
    }

    public C12819b(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i > 0) {
            this.f33317j = str;
            this.f33318k = executor;
            this.f33319l = i;
            this.f33320m = blockingQueue;
            this.f33321n = new RunnableC12821b();
            this.f33322o = new AtomicInteger(0);
            this.f33323p = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m3867f() {
        int i = this.f33322o.get();
        while (i < this.f33319l) {
            int i2 = i + 1;
            if (this.f33322o.compareAndSet(i, i2)) {
                C13677a.m1838z(f33316q, "%s: starting worker %d of %d", this.f33317j, Integer.valueOf(i2), Integer.valueOf(this.f33319l));
                this.f33318k.execute(this.f33321n);
                return;
            }
            C13677a.m1840x(f33316q, "%s: race in startWorkerIfNeeded; retrying", this.f33317j);
            i = this.f33322o.get();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            if (this.f33320m.offer(runnable)) {
                int size = this.f33320m.size();
                int i = this.f33323p.get();
                if (size > i && this.f33323p.compareAndSet(i, size)) {
                    C13677a.m1839y(f33316q, "%s: max pending work in queue = %d", this.f33317j, Integer.valueOf(size));
                }
                m3867f();
                return;
            }
            throw new RejectedExecutionException(this.f33317j + " queue is full, size=" + this.f33320m.size());
        }
        throw new NullPointerException("runnable parameter is null");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
