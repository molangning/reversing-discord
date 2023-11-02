package p433y0;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: y0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C13848a {

    /* renamed from: b */
    private static final C13848a f35650b = new C13848a();

    /* renamed from: c */
    private static final int f35651c;

    /* renamed from: d */
    static final int f35652d;

    /* renamed from: e */
    static final int f35653e;

    /* renamed from: a */
    private final Executor f35654a = new ExecutorC13850b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class ExecutorC13850b implements Executor {
        private ExecutorC13850b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f35651c = availableProcessors;
        f35652d = availableProcessors + 1;
        f35653e = (availableProcessors * 2) + 1;
    }

    private C13848a() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m1401a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        threadPoolExecutor.allowCoreThreadTimeOut(z);
    }

    /* renamed from: b */
    public static ExecutorService m1400b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f35652d, f35653e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m1401a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static Executor m1399c() {
        return f35650b.f35654a;
    }
}