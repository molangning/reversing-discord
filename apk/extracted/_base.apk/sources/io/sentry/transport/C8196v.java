package io.sentry.transport;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.transport.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C8196v extends ThreadPoolExecutor {

    /* renamed from: j */
    private final int f22126j;

    /* renamed from: k */
    private final InterfaceC8040o0 f22127k;

    /* renamed from: l */
    private final C8201z f22128l;

    /* renamed from: io.sentry.transport.v$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class FutureC8197a<T> implements Future<T> {
        FutureC8197a() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public C8196v(int i, int i2, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, InterfaceC8040o0 interfaceC8040o0) {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f22128l = new C8201z();
        this.f22126j = i2;
        this.f22127k = interfaceC8040o0;
    }

    /* renamed from: a */
    private boolean m18294a() {
        return this.f22128l.m18280b() < this.f22126j;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th2) {
        try {
            super.afterExecute(runnable, th2);
        } finally {
            this.f22128l.m18281a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m18293b(long j) {
        try {
            this.f22128l.m18278d(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            this.f22127k.mo18136b(EnumC8021m4.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (m18294a()) {
            this.f22128l.m18279c();
            return super.submit(runnable);
        }
        this.f22127k.mo18135c(EnumC8021m4.WARNING, "Submit cancelled", new Object[0]);
        return new FutureC8197a();
    }
}
