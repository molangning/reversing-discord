package p433y0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: y0.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C13851b {

    /* renamed from: d */
    private static final C13851b f35655d = new C13851b();

    /* renamed from: a */
    private final ExecutorService f35656a;

    /* renamed from: b */
    private final ScheduledExecutorService f35657b;

    /* renamed from: c */
    private final Executor f35658c;

    /* renamed from: y0.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class ExecutorC13853b implements Executor {

        /* renamed from: j */
        private ThreadLocal<Integer> f35659j;

        private ExecutorC13853b() {
            this.f35659j = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m1395a() {
            Integer num = this.f35659j.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f35659j.remove();
            } else {
                this.f35659j.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* renamed from: b */
        private int m1394b() {
            Integer num = this.f35659j.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f35659j.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (m1394b() <= 15) {
                    runnable.run();
                } else {
                    C13851b.m1398a().execute(runnable);
                }
            } finally {
                m1395a();
            }
        }
    }

    private C13851b() {
        ExecutorService m1400b;
        if (!m1396c()) {
            m1400b = Executors.newCachedThreadPool();
        } else {
            m1400b = C13848a.m1400b();
        }
        this.f35656a = m1400b;
        this.f35657b = Executors.newSingleThreadScheduledExecutor();
        this.f35658c = new ExecutorC13853b();
    }

    /* renamed from: a */
    public static ExecutorService m1398a() {
        return f35655d.f35656a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Executor m1397b() {
        return f35655d.f35658c;
    }

    /* renamed from: c */
    private static boolean m1396c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
