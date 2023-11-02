package io.sentry;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.h4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7939h4 implements InterfaceC8204u0 {

    /* renamed from: a */
    private final ScheduledExecutorService f21626a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.h4$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class ThreadFactoryC7941b implements ThreadFactory {

        /* renamed from: j */
        private int f21627j;

        private ThreadFactoryC7941b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryExecutorServiceThreadFactory-");
            int i = this.f21627j;
            this.f21627j = i + 1;
            sb2.append(i);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    C7939h4(ScheduledExecutorService scheduledExecutorService) {
        this.f21626a = scheduledExecutorService;
    }

    @Override // io.sentry.InterfaceC8204u0
    /* renamed from: a */
    public void mo18040a(long j) {
        synchronized (this.f21626a) {
            if (!this.f21626a.isShutdown()) {
                this.f21626a.shutdown();
                try {
                    if (!this.f21626a.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        this.f21626a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f21626a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC8204u0
    /* renamed from: b */
    public Future<?> mo18039b(Runnable runnable, long j) {
        return this.f21626a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC8204u0
    public boolean isClosed() {
        boolean isShutdown;
        synchronized (this.f21626a) {
            isShutdown = this.f21626a.isShutdown();
        }
        return isShutdown;
    }

    @Override // io.sentry.InterfaceC8204u0
    public Future<?> submit(Runnable runnable) {
        return this.f21626a.submit(runnable);
    }

    public C7939h4() {
        this(Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC7941b()));
    }
}