package io.sentry;

import io.sentry.cache.C7850e;
import io.sentry.config.C7888h;
import io.sentry.internal.debugmeta.C7978b;
import io.sentry.internal.debugmeta.C7979c;
import io.sentry.internal.modules.C7983a;
import io.sentry.internal.modules.C7985c;
import io.sentry.internal.modules.C7988e;
import io.sentry.internal.modules.C7989f;
import io.sentry.protocol.C8100q;
import io.sentry.transport.C8192r;
import io.sentry.util.C8213c;
import io.sentry.util.C8215e;
import io.sentry.util.thread.C8237c;
import io.sentry.util.thread.C8238d;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: io.sentry.d3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7896d3 {

    /* renamed from: a */
    private static final ThreadLocal<InterfaceC8025n0> f21510a = new ThreadLocal<>();

    /* renamed from: b */
    private static volatile InterfaceC8025n0 f21511b = C8205u1.m18271a();

    /* renamed from: c */
    private static volatile boolean f21512c = false;

    /* renamed from: io.sentry.d3$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7897a<T extends C8132r4> {
        /* renamed from: a */
        void mo18435a(T t);
    }

    /* renamed from: A */
    public static InterfaceC8259w0 m19426A(String str, String str2) {
        return m19410o().mo18256p(str, str2);
    }

    /* renamed from: B */
    public static void m19425B(InterfaceC8164t2 interfaceC8164t2) {
        m19410o().mo18253s(interfaceC8164t2);
    }

    /* renamed from: c */
    public static void m19422c(C7901e c7901e) {
        m19410o().mo18269c(c7901e);
    }

    /* renamed from: d */
    public static void m19421d(C7901e c7901e, C7831b0 c7831b0) {
        m19410o().mo18266f(c7901e, c7831b0);
    }

    /* renamed from: e */
    private static <T extends C8132r4> void m19420e(InterfaceC7897a<T> interfaceC7897a, T t) {
        try {
            interfaceC7897a.mo18435a(t);
        } catch (Throwable th2) {
            t.getLogger().mo18136b(EnumC8021m4.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
    }

    /* renamed from: f */
    public static C8100q m19419f(C7923f4 c7923f4, C7831b0 c7831b0) {
        return m19410o().mo18257o(c7923f4, c7831b0);
    }

    /* renamed from: g */
    public static C8100q m19418g(Throwable th2) {
        return m19410o().mo18252t(th2);
    }

    /* renamed from: h */
    public static C8100q m19417h(Throwable th2, C7831b0 c7831b0) {
        return m19410o().mo18250v(th2, c7831b0);
    }

    /* renamed from: i */
    public static C8100q m19416i(String str, EnumC8021m4 enumC8021m4) {
        return m19410o().mo18261k(str, enumC8021m4);
    }

    /* renamed from: j */
    public static synchronized void m19415j() {
        synchronized (C7896d3.class) {
            InterfaceC8025n0 m19410o = m19410o();
            f21511b = C8205u1.m18271a();
            f21510a.remove();
            m19410o.close();
        }
    }

    /* renamed from: k */
    public static void m19414k(InterfaceC8164t2 interfaceC8164t2) {
        m19410o().mo18265g(interfaceC8164t2);
    }

    /* renamed from: l */
    public static void m19413l() {
        m19410o().mo18259m();
    }

    /* renamed from: m */
    private static void m19412m(C8132r4 c8132r4, InterfaceC8025n0 interfaceC8025n0) {
        try {
            c8132r4.getExecutorService().submit(new RunnableC8009l2(c8132r4, interfaceC8025n0));
        } catch (Throwable th2) {
            c8132r4.getLogger().mo18136b(EnumC8021m4.DEBUG, "Failed to finalize previous session.", th2);
        }
    }

    /* renamed from: n */
    public static void m19411n(long j) {
        m19410o().mo18270b(j);
    }

    /* renamed from: o */
    public static InterfaceC8025n0 m19410o() {
        if (f21512c) {
            return f21511b;
        }
        ThreadLocal<InterfaceC8025n0> threadLocal = f21510a;
        InterfaceC8025n0 interfaceC8025n0 = threadLocal.get();
        if (interfaceC8025n0 == null || (interfaceC8025n0 instanceof C8205u1)) {
            InterfaceC8025n0 clone = f21511b.clone();
            threadLocal.set(clone);
            return clone;
        }
        return interfaceC8025n0;
    }

    /* renamed from: p */
    public static <T extends C8132r4> void m19409p(C7929g2<T> c7929g2, InterfaceC7897a<T> interfaceC7897a, boolean z) {
        T m19182b = c7929g2.m19182b();
        m19420e(interfaceC7897a, m19182b);
        m19408q(m19182b, z);
    }

    /* renamed from: q */
    private static synchronized void m19408q(C8132r4 c8132r4, boolean z) {
        synchronized (C7896d3.class) {
            if (m19405t()) {
                c8132r4.getLogger().mo18135c(EnumC8021m4.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
            }
            if (!m19407r(c8132r4)) {
                return;
            }
            c8132r4.getLogger().mo18135c(EnumC8021m4.INFO, "GlobalHubMode: '%s'", String.valueOf(z));
            f21512c = z;
            InterfaceC8025n0 m19410o = m19410o();
            f21511b = new C7935h0(c8132r4);
            f21510a.set(f21511b);
            m19410o.close();
            if (c8132r4.getExecutorService().isClosed()) {
                c8132r4.setExecutorService(new C7939h4());
            }
            for (Integration integration : c8132r4.getIntegrations()) {
                integration.mo19952a(C7961i0.m19149a(), c8132r4);
            }
            m19402w(c8132r4);
            m19412m(c8132r4, C7961i0.m19149a());
        }
    }

    /* renamed from: r */
    private static boolean m19407r(C8132r4 c8132r4) {
        if (c8132r4.isEnableExternalConfiguration()) {
            c8132r4.merge(C8276z.m18004g(C7888h.m19457a(), c8132r4.getLogger()));
        }
        String dsn = c8132r4.getDsn();
        if (dsn != null) {
            if (dsn.isEmpty()) {
                m19415j();
                return false;
            }
            new C8119q(dsn);
            InterfaceC8040o0 logger = c8132r4.getLogger();
            if (c8132r4.isDebug() && (logger instanceof C8244v1)) {
                c8132r4.setLogger(new C8023m5());
                logger = c8132r4.getLogger();
            }
            EnumC8021m4 enumC8021m4 = EnumC8021m4.INFO;
            logger.mo18135c(enumC8021m4, "Initializing SDK with DSN: '%s'", c8132r4.getDsn());
            String outboxPath = c8132r4.getOutboxPath();
            if (outboxPath != null) {
                new File(outboxPath).mkdirs();
            } else {
                logger.mo18135c(enumC8021m4, "No outbox dir path is defined in options.", new Object[0]);
            }
            String cacheDirPath = c8132r4.getCacheDirPath();
            if (cacheDirPath != null) {
                new File(cacheDirPath).mkdirs();
                if (c8132r4.getEnvelopeDiskCache() instanceof C8192r) {
                    c8132r4.setEnvelopeDiskCache(C7850e.m19535z(c8132r4));
                }
            }
            String profilingTracesDirPath = c8132r4.getProfilingTracesDirPath();
            if (c8132r4.isProfilingEnabled() && profilingTracesDirPath != null) {
                File file = new File(profilingTracesDirPath);
                file.mkdirs();
                final File[] listFiles = file.listFiles();
                try {
                    c8132r4.getExecutorService().submit(new Runnable() { // from class: io.sentry.b3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7896d3.m19404u(listFiles);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    c8132r4.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e);
                }
            }
            if (c8132r4.getModulesLoader() instanceof C7988e) {
                c8132r4.setModulesLoader(new C7983a(Arrays.asList(new C7985c(c8132r4.getLogger()), new C7989f(c8132r4.getLogger())), c8132r4.getLogger()));
            }
            if (c8132r4.getDebugMetaLoader() instanceof C7978b) {
                c8132r4.setDebugMetaLoader(new C7979c(c8132r4.getLogger()));
            }
            C8213c.m18233c(c8132r4, c8132r4.getDebugMetaLoader().mo19108a());
            if (c8132r4.getMainThreadChecker() instanceof C8238d) {
                c8132r4.setMainThreadChecker(C8237c.m18151d());
            }
            if (c8132r4.getCollectors().isEmpty()) {
                c8132r4.addCollector(new C7841c1());
            }
            return true;
        }
        throw new IllegalArgumentException("DSN is required. Use empty string to disable SDK.");
    }

    /* renamed from: s */
    public static Boolean m19406s() {
        return m19410o().mo18254r();
    }

    /* renamed from: t */
    public static boolean m19405t() {
        return m19410o().isEnabled();
    }

    /* renamed from: u */
    public static /* synthetic */ void m19404u(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            C8215e.m18231a(file);
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m19403v(C8132r4 c8132r4) {
        for (InterfaceC8049p0 interfaceC8049p0 : c8132r4.getOptionsObservers()) {
            interfaceC8049p0.mo18893f(c8132r4.getRelease());
            interfaceC8049p0.mo18895d(c8132r4.getProguardUuid());
            interfaceC8049p0.mo18894e(c8132r4.getSdkVersion());
            interfaceC8049p0.mo18897b(c8132r4.getDist());
            interfaceC8049p0.mo18896c(c8132r4.getEnvironment());
            interfaceC8049p0.mo18898a(c8132r4.getTags());
        }
    }

    /* renamed from: w */
    private static void m19402w(final C8132r4 c8132r4) {
        try {
            c8132r4.getExecutorService().submit(new Runnable() { // from class: io.sentry.c3
                @Override // java.lang.Runnable
                public final void run() {
                    C7896d3.m19403v(C8132r4.this);
                }
            });
        } catch (Throwable th2) {
            c8132r4.getLogger().mo18136b(EnumC8021m4.DEBUG, "Failed to notify options observers.", th2);
        }
    }

    /* renamed from: x */
    public static void m19401x() {
        m19410o().mo18248x();
    }

    /* renamed from: y */
    public static InterfaceC8259w0 m19400y(C8125q5 c8125q5, C7934h c7934h, boolean z) {
        return m19410o().mo18264h(c8125q5, c7934h, z);
    }

    /* renamed from: z */
    public static InterfaceC8259w0 m19399z(C8125q5 c8125q5, C8160s5 c8160s5) {
        return m19410o().mo18255q(c8125q5, c8160s5);
    }
}