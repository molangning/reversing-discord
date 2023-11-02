package p054d1;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p021b1.C2055l;

/* renamed from: d1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C5726e implements InterfaceC5720b {

    /* renamed from: a */
    private ScheduledThreadPoolExecutor f16493a;

    /* renamed from: d1.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RejectedExecutionHandlerC5727a implements RejectedExecutionHandler {

        /* renamed from: a */
        final /* synthetic */ String f16494a;

        RejectedExecutionHandlerC5727a(String str) {
            this.f16494a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C2055l.m34422j().mo34445a("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f16494a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [V] */
    /* renamed from: d1.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class CallableC5728b<V> implements Callable<V> {

        /* renamed from: j */
        final /* synthetic */ Callable f16496j;

        CallableC5728b(Callable callable) {
            this.f16496j = callable;
        }

        @Override // java.util.concurrent.Callable
        public V call() {
            try {
                return (V) this.f16496j.call();
            } catch (Throwable th2) {
                C2055l.m34422j().mo34444b("Callable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
                return null;
            }
        }
    }

    public C5726e(String str, boolean z) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC5730g(str), new RejectedExecutionHandlerC5727a(str));
        this.f16493a = scheduledThreadPoolExecutor;
        if (!z) {
            scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
            this.f16493a.allowCoreThreadTimeOut(true);
        }
    }

    @Override // p054d1.InterfaceC5720b
    /* renamed from: a */
    public void mo24614a() {
        this.f16493a.shutdownNow();
    }

    @Override // p054d1.InterfaceC5720b
    /* renamed from: b */
    public ScheduledFuture<?> mo24613b(Runnable runnable, long j, long j2) {
        return this.f16493a.scheduleWithFixedDelay(new RunnableC5721c(runnable), j, j2, TimeUnit.MILLISECONDS);
    }

    @Override // p054d1.InterfaceC5720b
    /* renamed from: c */
    public ScheduledFuture<?> mo24612c(Runnable runnable, long j) {
        return this.f16493a.schedule(new RunnableC5721c(runnable), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    public <V> ScheduledFuture<V> m24611d(Callable<V> callable, long j) {
        return this.f16493a.schedule(new CallableC5728b(callable), j, TimeUnit.MILLISECONDS);
    }
}
