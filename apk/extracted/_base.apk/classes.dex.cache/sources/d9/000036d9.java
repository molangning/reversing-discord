package p144i;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C7369c extends AbstractC7371d {

    /* renamed from: a */
    private final Object f19840a = new Object();

    /* renamed from: b */
    private final ExecutorService f19841b = Executors.newFixedThreadPool(4, new ThreadFactoryC7370a());

    /* renamed from: c */
    private volatile Handler f19842c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class ThreadFactoryC7370a implements ThreadFactory {

        /* renamed from: j */
        private final AtomicInteger f19843j = new AtomicInteger(0);

        ThreadFactoryC7370a() {
            C7369c.this = r2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f19843j.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m20830d(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p144i.AbstractC7371d
    /* renamed from: a */
    public void mo20829a(Runnable runnable) {
        this.f19841b.execute(runnable);
    }

    @Override // p144i.AbstractC7371d
    /* renamed from: b */
    public boolean mo20828b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p144i.AbstractC7371d
    /* renamed from: c */
    public void mo20827c(Runnable runnable) {
        if (this.f19842c == null) {
            synchronized (this.f19840a) {
                if (this.f19842c == null) {
                    this.f19842c = m20830d(Looper.getMainLooper());
                }
            }
        }
        this.f19842c.post(runnable);
    }
}