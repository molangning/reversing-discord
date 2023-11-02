package io.sentry;

import io.sentry.util.C8229o;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7903e0 {

    /* renamed from: g */
    private static final long f21536g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h */
    private static final long f21537h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: i */
    private static C7903e0 f21538i;

    /* renamed from: a */
    private final long f21539a;

    /* renamed from: b */
    private volatile String f21540b;

    /* renamed from: c */
    private volatile long f21541c;

    /* renamed from: d */
    private final AtomicBoolean f21542d;

    /* renamed from: e */
    private final Callable<InetAddress> f21543e;

    /* renamed from: f */
    private final ExecutorService f21544f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.e0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class ThreadFactoryC7905b implements ThreadFactory {

        /* renamed from: j */
        private int f21545j;

        private ThreadFactoryC7905b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i = this.f21545j;
            this.f21545j = i + 1;
            sb2.append(i);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private C7903e0() {
        this(f21536g);
    }

    /* renamed from: e */
    public static C7903e0 m19317e() {
        if (f21538i == null) {
            f21538i = new C7903e0();
        }
        return f21538i;
    }

    /* renamed from: f */
    private void m19316f() {
        this.f21541c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    /* renamed from: g */
    public static /* synthetic */ InetAddress m19315g() {
        return InetAddress.getLocalHost();
    }

    /* renamed from: h */
    public /* synthetic */ Void m19314h() {
        try {
            this.f21540b = this.f21543e.call().getCanonicalHostName();
            this.f21541c = System.currentTimeMillis() + this.f21539a;
            this.f21542d.set(false);
            return null;
        } catch (Throwable th2) {
            this.f21542d.set(false);
            throw th2;
        }
    }

    /* renamed from: i */
    private void m19313i() {
        try {
            this.f21544f.submit(new Callable() { // from class: io.sentry.d0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m19314h;
                    m19314h = C7903e0.this.m19314h();
                    return m19314h;
                }
            }).get(f21537h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            m19316f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            m19316f();
        }
    }

    /* renamed from: c */
    public void m19319c() {
        this.f21544f.shutdown();
    }

    /* renamed from: d */
    public String m19318d() {
        if (this.f21541c < System.currentTimeMillis() && this.f21542d.compareAndSet(false, true)) {
            m19313i();
        }
        return this.f21540b;
    }

    C7903e0(long j) {
        this(j, new Callable() { // from class: io.sentry.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InetAddress m19315g;
                m19315g = C7903e0.m19315g();
                return m19315g;
            }
        });
    }

    C7903e0(long j, Callable<InetAddress> callable) {
        this.f21542d = new AtomicBoolean(false);
        this.f21544f = Executors.newSingleThreadExecutor(new ThreadFactoryC7905b());
        this.f21539a = j;
        this.f21543e = (Callable) C8229o.m18169c(callable, "getLocalhost is required");
        m19313i();
    }
}