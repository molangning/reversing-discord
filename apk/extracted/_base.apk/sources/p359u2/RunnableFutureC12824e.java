package p359u2;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: u2.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RunnableFutureC12824e<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: j */
    private final Handler f33326j;

    /* renamed from: k */
    private final FutureTask<V> f33327k;

    public RunnableFutureC12824e(Handler handler, Callable<V> callable) {
        this.f33326j = handler;
        this.f33327k = new FutureTask<>(callable);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f33327k.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f33327k.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f33327k.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f33327k.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f33327k.run();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return this.f33327k.get(j, timeUnit);
    }

    public RunnableFutureC12824e(Handler handler, Runnable runnable, V v) {
        this.f33326j = handler;
        this.f33327k = new FutureTask<>(runnable, v);
    }
}
