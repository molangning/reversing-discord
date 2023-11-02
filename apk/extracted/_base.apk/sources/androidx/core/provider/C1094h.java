package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1094h {

    /* renamed from: androidx.core.provider.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class ThreadFactoryC1095a implements ThreadFactory {

        /* renamed from: j */
        private String f3449j;

        /* renamed from: k */
        private int f3450k;

        /* renamed from: androidx.core.provider.h$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        private static class C1096a extends Thread {

            /* renamed from: j */
            private final int f3451j;

            C1096a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f3451j = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f3451j);
                super.run();
            }
        }

        ThreadFactoryC1095a(String str, int i) {
            this.f3449j = str;
            this.f3450k = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1096a(runnable, this.f3449j, this.f3450k);
        }
    }

    /* renamed from: androidx.core.provider.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class RunnableC1097b<T> implements Runnable {

        /* renamed from: j */
        private Callable<T> f3452j;

        /* renamed from: k */
        private Consumer<T> f3453k;

        /* renamed from: l */
        private Handler f3454l;

        /* renamed from: androidx.core.provider.h$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class RunnableC1098a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ Consumer f3455j;

            /* renamed from: k */
            final /* synthetic */ Object f3456k;

            RunnableC1098a(Consumer consumer, Object obj) {
                this.f3455j = consumer;
                this.f3456k = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f3455j.accept(this.f3456k);
            }
        }

        RunnableC1097b(Handler handler, Callable<T> callable, Consumer<T> consumer) {
            this.f3452j = callable;
            this.f3453k = consumer;
            this.f3454l = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.f3452j.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f3454l.post(new RunnableC1098a(this.f3453k, t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ThreadPoolExecutor m37908a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1095a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> void m37907b(Executor executor, Callable<T> callable, Consumer<T> consumer) {
        executor.execute(new RunnableC1097b(C1079b.m37949a(), callable, consumer));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> T m37906c(ExecutorService executorService, Callable<T> callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
