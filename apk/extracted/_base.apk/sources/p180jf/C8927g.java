package p180jf;

import androidx.lifecycle.C1696m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p067df.InterfaceC5833d;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: jf.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8927g {

    /* renamed from: a */
    public static final boolean f23361a;

    /* renamed from: b */
    public static final int f23362b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f23363c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f23364d = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jf.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class RunnableC8928a implements Runnable {
        RunnableC8928a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(C8927g.f23364d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C8927g.f23364d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* renamed from: jf.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C8929b implements InterfaceC5833d<String, String> {
        C8929b() {
        }

        @Override // p067df.InterfaceC5833d
        /* renamed from: a */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    static {
        C8929b c8929b = new C8929b();
        boolean m17036b = m17036b(true, "rx2.purge-enabled", true, true, c8929b);
        f23361a = m17036b;
        f23362b = m17035c(m17036b, "rx2.purge-period-seconds", 1, 1, c8929b);
        m17034d();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m17037a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m17033e(f23361a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    static boolean m17036b(boolean z, String str, boolean z2, boolean z3, InterfaceC5833d<String, String> interfaceC5833d) {
        if (z) {
            try {
                String apply = interfaceC5833d.apply(str);
                if (apply == null) {
                    return z2;
                }
                return "true".equals(apply);
            } catch (Throwable unused) {
                return z2;
            }
        }
        return z3;
    }

    /* renamed from: c */
    static int m17035c(boolean z, String str, int i, int i2, InterfaceC5833d<String, String> interfaceC5833d) {
        if (z) {
            try {
                String apply = interfaceC5833d.apply(str);
                if (apply == null) {
                    return i;
                }
                return Integer.parseInt(apply);
            } catch (Throwable unused) {
                return i;
            }
        }
        return i2;
    }

    /* renamed from: d */
    public static void m17034d() {
        m17032f(f23361a);
    }

    /* renamed from: e */
    static void m17033e(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f23364d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: f */
    static void m17032f(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f23363c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC8924e("RxSchedulerPurge"));
            if (C1696m.m36034a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                RunnableC8928a runnableC8928a = new RunnableC8928a();
                int i = f23362b;
                newScheduledThreadPool.scheduleAtFixedRate(runnableC8928a, i, i, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}
