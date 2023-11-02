package p205l0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l0.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC9996c<Params, Progress, Result> {

    /* renamed from: o */
    private static final ThreadFactory f25931o;

    /* renamed from: p */
    private static final BlockingQueue<Runnable> f25932p;

    /* renamed from: q */
    public static final Executor f25933q;

    /* renamed from: r */
    private static HandlerC10002f f25934r;

    /* renamed from: s */
    private static volatile Executor f25935s;

    /* renamed from: j */
    private final AbstractCallableC10004h<Params, Result> f25936j;

    /* renamed from: k */
    private final FutureTask<Result> f25937k;

    /* renamed from: l */
    private volatile EnumC10003g f25938l = EnumC10003g.PENDING;

    /* renamed from: m */
    final AtomicBoolean f25939m = new AtomicBoolean();

    /* renamed from: n */
    final AtomicBoolean f25940n = new AtomicBoolean();

    /* renamed from: l0.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class ThreadFactoryC9997a implements ThreadFactory {

        /* renamed from: j */
        private final AtomicInteger f25941j = new AtomicInteger(1);

        ThreadFactoryC9997a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f25941j.getAndIncrement());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C9998b extends AbstractCallableC10004h<Params, Result> {
        C9998b() {
            AbstractC9996c.this = r1;
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            AbstractC9996c.this.f25940n.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC9996c.this.mo12635b(this.f25951j);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C9999c extends FutureTask<Result> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9999c(Callable callable) {
            super(callable);
            AbstractC9996c.this = r1;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC9996c.this.m12624m(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                AbstractC9996c.this.m12624m(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C10000d {

        /* renamed from: a */
        static final /* synthetic */ int[] f25944a;

        static {
            int[] iArr = new int[EnumC10003g.values().length];
            f25944a = iArr;
            try {
                iArr[EnumC10003g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25944a[EnumC10003g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: l0.c$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C10001e<Data> {

        /* renamed from: a */
        final AbstractC9996c f25945a;

        /* renamed from: b */
        final Data[] f25946b;

        C10001e(AbstractC9996c abstractC9996c, Data... dataArr) {
            this.f25945a = abstractC9996c;
            this.f25946b = dataArr;
        }
    }

    /* renamed from: l0.c$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class HandlerC10002f extends Handler {
        HandlerC10002f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C10001e c10001e = (C10001e) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    c10001e.f25945a.m12626k(c10001e.f25946b);
                    return;
                }
                return;
            }
            c10001e.f25945a.m12633d(c10001e.f25946b[0]);
        }
    }

    /* renamed from: l0.c$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC10003g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0.c$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractCallableC10004h<Params, Result> implements Callable<Result> {

        /* renamed from: j */
        Params[] f25951j;

        AbstractCallableC10004h() {
        }
    }

    static {
        ThreadFactoryC9997a threadFactoryC9997a = new ThreadFactoryC9997a();
        f25931o = threadFactoryC9997a;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f25932p = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactoryC9997a);
        f25933q = threadPoolExecutor;
        f25935s = threadPoolExecutor;
    }

    public AbstractC9996c() {
        C9998b c9998b = new C9998b();
        this.f25936j = c9998b;
        this.f25937k = new C9999c(c9998b);
    }

    /* renamed from: e */
    private static Handler m12632e() {
        HandlerC10002f handlerC10002f;
        synchronized (AbstractC9996c.class) {
            if (f25934r == null) {
                f25934r = new HandlerC10002f();
            }
            handlerC10002f = f25934r;
        }
        return handlerC10002f;
    }

    /* renamed from: a */
    public final boolean m12636a(boolean z) {
        this.f25939m.set(true);
        return this.f25937k.cancel(z);
    }

    /* renamed from: b */
    protected abstract Result mo12635b(Params... paramsArr);

    /* renamed from: c */
    public final AbstractC9996c<Params, Progress, Result> m12634c(Executor executor, Params... paramsArr) {
        if (this.f25938l != EnumC10003g.PENDING) {
            int i = C10000d.f25944a[this.f25938l.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f25938l = EnumC10003g.RUNNING;
        m12627j();
        this.f25936j.f25951j = paramsArr;
        executor.execute(this.f25937k);
        return this;
    }

    /* renamed from: d */
    void m12633d(Result result) {
        if (m12631f()) {
            mo12629h(result);
        } else {
            mo12628i(result);
        }
        this.f25938l = EnumC10003g.FINISHED;
    }

    /* renamed from: f */
    public final boolean m12631f() {
        return this.f25939m.get();
    }

    /* renamed from: g */
    protected void m12630g() {
    }

    /* renamed from: h */
    protected void mo12629h(Result result) {
        m12630g();
    }

    /* renamed from: i */
    protected void mo12628i(Result result) {
    }

    /* renamed from: j */
    protected void m12627j() {
    }

    /* renamed from: k */
    protected void m12626k(Progress... progressArr) {
    }

    /* renamed from: l */
    Result m12625l(Result result) {
        m12632e().obtainMessage(1, new C10001e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: m */
    void m12624m(Result result) {
        if (!this.f25940n.get()) {
            m12625l(result);
        }
    }
}