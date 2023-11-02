package io.sentry.transport;

import io.sentry.C7831b0;
import io.sentry.C7991j;
import io.sentry.C8020m3;
import io.sentry.C8122q2;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.cache.InterfaceC7851f;
import io.sentry.clientreport.EnumC7875e;
import io.sentry.hints.InterfaceC7948f;
import io.sentry.hints.InterfaceC7949g;
import io.sentry.hints.InterfaceC7953k;
import io.sentry.hints.InterfaceC7958p;
import io.sentry.transport.C8175d;
import io.sentry.util.C8220j;
import io.sentry.util.C8227m;
import io.sentry.util.C8229o;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.transport.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8175d implements InterfaceC8190p {

    /* renamed from: j */
    private final C8196v f22094j;

    /* renamed from: k */
    private final InterfaceC7851f f22095k;

    /* renamed from: l */
    private final C8132r4 f22096l;

    /* renamed from: m */
    private final C8200y f22097m;

    /* renamed from: n */
    private final InterfaceC8191q f22098n;

    /* renamed from: o */
    private final C8188n f22099o;

    /* renamed from: io.sentry.transport.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class ThreadFactoryC8177b implements ThreadFactory {

        /* renamed from: j */
        private int f22100j;

        private ThreadFactoryC8177b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i = this.f22100j;
            this.f22100j = i + 1;
            sb2.append(i);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* renamed from: io.sentry.transport.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class RunnableC8178c implements Runnable {

        /* renamed from: j */
        private final C8020m3 f22101j;

        /* renamed from: k */
        private final C7831b0 f22102k;

        /* renamed from: l */
        private final InterfaceC7851f f22103l;

        /* renamed from: m */
        private final AbstractC8169a0 f22104m = AbstractC8169a0.m18348a();

        RunnableC8178c(C8020m3 c8020m3, C7831b0 c7831b0, InterfaceC7851f interfaceC7851f) {
            C8175d.this = r1;
            this.f22101j = (C8020m3) C8229o.m18169c(c8020m3, "Envelope is required.");
            this.f22102k = c7831b0;
            this.f22103l = (InterfaceC7851f) C8229o.m18169c(interfaceC7851f, "EnvelopeCache is required.");
        }

        /* renamed from: j */
        private AbstractC8169a0 m18323j() {
            AbstractC8169a0 abstractC8169a0 = this.f22104m;
            this.f22101j.m18987b().m18945d(null);
            this.f22103l.mo18300m(this.f22101j, this.f22102k);
            C8220j.m18215o(this.f22102k, InterfaceC7949g.class, new C8220j.InterfaceC8221a() { // from class: io.sentry.transport.f
                @Override // io.sentry.util.C8220j.InterfaceC8221a
                public final void accept(Object obj) {
                    C8175d.RunnableC8178c.this.m18322k((InterfaceC7949g) obj);
                }
            });
            if (C8175d.this.f22098n.mo18296a()) {
                final C8020m3 mo19471d = C8175d.this.f22096l.getClientReportRecorder().mo19471d(this.f22101j);
                try {
                    mo19471d.m18987b().m18945d(C7991j.m19081j(C8175d.this.f22096l.getDateProvider().now().mo18864f()));
                    AbstractC8169a0 m18305h = C8175d.this.f22099o.m18305h(mo19471d);
                    if (m18305h.mo18344d()) {
                        this.f22103l.mo18301c(this.f22101j);
                        return m18305h;
                    }
                    String str = "The transport failed to send the envelope with response code " + m18305h.mo18345c();
                    C8175d.this.f22096l.getLogger().mo18135c(EnumC8021m4.ERROR, str, new Object[0]);
                    if (m18305h.mo18345c() >= 400 && m18305h.mo18345c() != 429) {
                        C8220j.m18216n(this.f22102k, InterfaceC7953k.class, new C8220j.InterfaceC8223c() { // from class: io.sentry.transport.g
                            @Override // io.sentry.util.C8220j.InterfaceC8223c
                            public final void accept(Object obj) {
                                C8175d.RunnableC8178c.this.m18321l(mo19471d, obj);
                            }
                        });
                    }
                    throw new IllegalStateException(str);
                } catch (IOException e) {
                    C8220j.m18214p(this.f22102k, InterfaceC7953k.class, new C8220j.InterfaceC8221a() { // from class: io.sentry.transport.h
                        @Override // io.sentry.util.C8220j.InterfaceC8221a
                        public final void accept(Object obj) {
                            ((InterfaceC7953k) obj).mo18901c(true);
                        }
                    }, new C8220j.InterfaceC8222b() { // from class: io.sentry.transport.i
                        @Override // io.sentry.util.C8220j.InterfaceC8222b
                        /* renamed from: a */
                        public final void mo18208a(Object obj, Class cls) {
                            C8175d.RunnableC8178c.this.m18319n(mo19471d, obj, cls);
                        }
                    });
                    throw new IllegalStateException("Sending the event failed.", e);
                }
            }
            C8220j.m18214p(this.f22102k, InterfaceC7953k.class, new C8220j.InterfaceC8221a() { // from class: io.sentry.transport.j
                @Override // io.sentry.util.C8220j.InterfaceC8221a
                public final void accept(Object obj) {
                    ((InterfaceC7953k) obj).mo18901c(true);
                }
            }, new C8220j.InterfaceC8222b() { // from class: io.sentry.transport.k
                @Override // io.sentry.util.C8220j.InterfaceC8222b
                /* renamed from: a */
                public final void mo18208a(Object obj, Class cls) {
                    C8175d.RunnableC8178c.this.m18317p(obj, cls);
                }
            });
            return abstractC8169a0;
        }

        /* renamed from: k */
        public /* synthetic */ void m18322k(InterfaceC7949g interfaceC7949g) {
            interfaceC7949g.mo19150b();
            C8175d.this.f22096l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Disk flush envelope fired", new Object[0]);
        }

        /* renamed from: l */
        public /* synthetic */ void m18321l(C8020m3 c8020m3, Object obj) {
            C8175d.this.f22096l.getClientReportRecorder().mo19473b(EnumC7875e.NETWORK_ERROR, c8020m3);
        }

        /* renamed from: n */
        public /* synthetic */ void m18319n(C8020m3 c8020m3, Object obj, Class cls) {
            C8227m.m18202a(cls, obj, C8175d.this.f22096l.getLogger());
            C8175d.this.f22096l.getClientReportRecorder().mo19473b(EnumC7875e.NETWORK_ERROR, c8020m3);
        }

        /* renamed from: p */
        public /* synthetic */ void m18317p(Object obj, Class cls) {
            C8227m.m18202a(cls, obj, C8175d.this.f22096l.getLogger());
            C8175d.this.f22096l.getClientReportRecorder().mo19473b(EnumC7875e.NETWORK_ERROR, this.f22101j);
        }

        /* renamed from: q */
        public /* synthetic */ void m18316q(AbstractC8169a0 abstractC8169a0, InterfaceC7958p interfaceC7958p) {
            C8175d.this.f22096l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(abstractC8169a0.mo18344d()));
            interfaceC7958p.mo18902b(abstractC8169a0.mo18344d());
        }

        @Override // java.lang.Runnable
        public void run() {
            final AbstractC8169a0 abstractC8169a0 = this.f22104m;
            try {
                abstractC8169a0 = m18323j();
                C8175d.this.f22096l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public C8175d(C8132r4 c8132r4, C8200y c8200y, InterfaceC8191q interfaceC8191q, C8122q2 c8122q2) {
        this(m18336q(c8132r4.getMaxQueueSize(), c8132r4.getEnvelopeDiskCache(), c8132r4.getLogger()), c8132r4, c8200y, interfaceC8191q, new C8188n(c8132r4, c8122q2, c8200y));
    }

    /* renamed from: A */
    private static void m18343A(C7831b0 c7831b0, final boolean z) {
        C8220j.m18215o(c7831b0, InterfaceC7958p.class, new C8220j.InterfaceC8221a() { // from class: io.sentry.transport.b
            @Override // io.sentry.util.C8220j.InterfaceC8221a
            public final void accept(Object obj) {
                ((InterfaceC7958p) obj).mo18902b(false);
            }
        });
        C8220j.m18215o(c7831b0, InterfaceC7953k.class, new C8220j.InterfaceC8221a() { // from class: io.sentry.transport.c
            @Override // io.sentry.util.C8220j.InterfaceC8221a
            public final void accept(Object obj) {
                ((InterfaceC7953k) obj).mo18901c(z);
            }
        });
    }

    /* renamed from: q */
    private static C8196v m18336q(int i, final InterfaceC7851f interfaceC7851f, final InterfaceC8040o0 interfaceC8040o0) {
        return new C8196v(1, i, new ThreadFactoryC8177b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                C8175d.m18335s(InterfaceC7851f.this, interfaceC8040o0, runnable, threadPoolExecutor);
            }
        }, interfaceC8040o0);
    }

    /* renamed from: s */
    public static /* synthetic */ void m18335s(InterfaceC7851f interfaceC7851f, InterfaceC8040o0 interfaceC8040o0, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof RunnableC8178c) {
            RunnableC8178c runnableC8178c = (RunnableC8178c) runnable;
            if (!C8220j.m18222h(runnableC8178c.f22102k, InterfaceC7948f.class)) {
                interfaceC7851f.mo18300m(runnableC8178c.f22101j, runnableC8178c.f22102k);
            }
            m18343A(runnableC8178c.f22102k, true);
            interfaceC8040o0.mo18135c(EnumC8021m4.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    @Override // io.sentry.transport.InterfaceC8190p
    /* renamed from: b */
    public void mo18298b(long j) {
        this.f22094j.m18293b(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f22094j.shutdown();
        this.f22096l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Shutting down", new Object[0]);
        try {
            if (!this.f22094j.awaitTermination(1L, TimeUnit.MINUTES)) {
                this.f22096l.getLogger().mo18135c(EnumC8021m4.WARNING, "Failed to shutdown the async connection async sender within 1 minute. Trying to force it now.", new Object[0]);
                this.f22094j.shutdownNow();
            }
        } catch (InterruptedException unused) {
            this.f22096l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.InterfaceC8190p
    /* renamed from: y */
    public void mo18297y(C8020m3 c8020m3, C7831b0 c7831b0) {
        InterfaceC7851f interfaceC7851f = this.f22095k;
        boolean z = false;
        if (C8220j.m18222h(c7831b0, InterfaceC7948f.class)) {
            interfaceC7851f = C8192r.m18302a();
            this.f22096l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        }
        C8020m3 m18289d = this.f22097m.m18289d(c8020m3, c7831b0);
        if (m18289d == null) {
            if (z) {
                this.f22095k.mo18301c(c8020m3);
                return;
            }
            return;
        }
        if (C8220j.m18222h(c7831b0, UncaughtExceptionHandlerIntegration.C7683a.class)) {
            m18289d = this.f22096l.getClientReportRecorder().mo19471d(m18289d);
        }
        Future<?> submit = this.f22094j.submit(new RunnableC8178c(m18289d, c7831b0, interfaceC7851f));
        if (submit != null && submit.isCancelled()) {
            this.f22096l.getClientReportRecorder().mo19473b(EnumC7875e.QUEUE_OVERFLOW, m18289d);
        }
    }

    public C8175d(C8196v c8196v, C8132r4 c8132r4, C8200y c8200y, InterfaceC8191q interfaceC8191q, C8188n c8188n) {
        this.f22094j = (C8196v) C8229o.m18169c(c8196v, "executor is required");
        this.f22095k = (InterfaceC7851f) C8229o.m18169c(c8132r4.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f22096l = (C8132r4) C8229o.m18169c(c8132r4, "options is required");
        this.f22097m = (C8200y) C8229o.m18169c(c8200y, "rateLimiter is required");
        this.f22098n = (InterfaceC8191q) C8229o.m18169c(interfaceC8191q, "transportGate is required");
        this.f22099o = (C8188n) C8229o.m18169c(c8188n, "httpConnection is required");
    }
}