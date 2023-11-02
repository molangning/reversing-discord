package p359u2;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: u2.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ScheduledExecutorServiceC12823d extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: j */
    private final Handler f33325j;

    public ScheduledExecutorServiceC12823d(Handler handler) {
        this.f33325j = handler;
    }

    /* renamed from: a */
    public boolean m3866a() {
        return Thread.currentThread() == this.f33325j.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* renamed from: b */
    public <T> RunnableFutureC12824e<T> newTaskFor(Runnable runnable, T t) {
        return new RunnableFutureC12824e<>(this.f33325j, runnable, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* renamed from: c */
    public <T> RunnableFutureC12824e<T> newTaskFor(Callable<T> callable) {
        return new RunnableFutureC12824e<>(this.f33325j, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: d */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: e */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        runnable.getClass();
        RunnableFutureC12824e<T> newTaskFor = newTaskFor(runnable, t);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f33325j.post(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: f */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        callable.getClass();
        RunnableFutureC12824e<T> newTaskFor = newTaskFor(callable);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC12824e newTaskFor = newTaskFor(runnable, null);
        this.f33325j.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        RunnableFutureC12824e newTaskFor = newTaskFor(callable);
        this.f33325j.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }
}
