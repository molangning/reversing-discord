package p390vj;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0003\u0012\u0016\tB\u000f\u0012\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0004R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006)"}, m14357d2 = {"Lvj/e;", "", "Lvj/a;", "task", "", "e", "j", "", "delayNanos", "c", "Lvj/d;", "taskQueue", "h", "(Lvj/d;)V", "d", "i", "f", "", "a", "I", "nextQueueName", "", "b", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "Lvj/e$a;", "g", "Lvj/e$a;", "()Lvj/e$a;", "backend", "<init>", "(Lvj/e$a;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: vj.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13346e {

    /* renamed from: i */
    private static final Logger f34429i;

    /* renamed from: a */
    private int f34431a;

    /* renamed from: b */
    private boolean f34432b;

    /* renamed from: c */
    private long f34433c;

    /* renamed from: d */
    private final List<C13345d> f34434d;

    /* renamed from: e */
    private final List<C13345d> f34435e;

    /* renamed from: f */
    private final Runnable f34436f;

    /* renamed from: g */
    private final InterfaceC13347a f34437g;

    /* renamed from: j */
    public static final C13348b f34430j = new C13348b(null);

    /* renamed from: h */
    public static final C13346e f34428h = new C13346e(new C13349c(C12562c.m4825K(C12562c.f32616i + " TaskRunner", true)));

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, m14357d2 = {"Lvj/e$a;", "", "", "c", "Lvj/e;", "taskRunner", "", "b", "nanos", "a", "Ljava/lang/Runnable;", "runnable", "execute", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: vj.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface InterfaceC13347a {
        /* renamed from: a */
        void mo2723a(C13346e c13346e, long j);

        /* renamed from: b */
        void mo2722b(C13346e c13346e);

        /* renamed from: c */
        long mo2721c();

        void execute(Runnable runnable);
    }

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m14357d2 = {"Lvj/e$b;", "", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Lvj/e;", "INSTANCE", "Lvj/e;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: vj.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13348b {
        private C13348b() {
        }

        public /* synthetic */ C13348b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m2724a() {
            return C13346e.f34429i;
        }
    }

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0014"}, m14357d2 = {"Lvj/e$c;", "Lvj/e$a;", "", "c", "Lvj/e;", "taskRunner", "", "b", "nanos", "a", "Ljava/lang/Runnable;", "runnable", "execute", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: vj.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13349c implements InterfaceC13347a {

        /* renamed from: a */
        private final ThreadPoolExecutor f34438a;

        public C13349c(ThreadFactory threadFactory) {
            C9612q.m13917h(threadFactory, "threadFactory");
            this.f34438a = new ThreadPoolExecutor(0, (int) ViewDefaults.NUMBER_OF_LINES, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p390vj.C13346e.InterfaceC13347a
        /* renamed from: a */
        public void mo2723a(C13346e taskRunner, long j) {
            C9612q.m13917h(taskRunner, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // p390vj.C13346e.InterfaceC13347a
        /* renamed from: b */
        public void mo2722b(C13346e taskRunner) {
            C9612q.m13917h(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // p390vj.C13346e.InterfaceC13347a
        /* renamed from: c */
        public long mo2721c() {
            return System.nanoTime();
        }

        @Override // p390vj.C13346e.InterfaceC13347a
        public void execute(Runnable runnable) {
            C9612q.m13917h(runnable, "runnable");
            this.f34438a.execute(runnable);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"vj/e$d", "Ljava/lang/Runnable;", "", "run", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: vj.e$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class RunnableC13350d implements Runnable {
        RunnableC13350d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC13342a m2731d;
            long j;
            while (true) {
                synchronized (C13346e.this) {
                    m2731d = C13346e.this.m2731d();
                }
                if (m2731d != null) {
                    C13345d m2754d = m2731d.m2754d();
                    C9612q.m13920e(m2754d);
                    boolean isLoggable = C13346e.f34430j.m2724a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = m2754d.m2741h().m2728g().mo2721c();
                        C13343b.m2749c(m2731d, m2754d, "starting");
                    } else {
                        j = -1;
                    }
                    try {
                        C13346e.this.m2725j(m2731d);
                        Unit unit = Unit.f25302a;
                        if (isLoggable) {
                            C13343b.m2749c(m2731d, m2754d, "finished run in " + C13343b.m2750b(m2754d.m2741h().m2728g().mo2721c() - j));
                        }
                    } catch (Throwable th2) {
                        if (isLoggable) {
                            C13343b.m2749c(m2731d, m2754d, "failed a run in " + C13343b.m2750b(m2754d.m2741h().m2728g().mo2721c() - j));
                        }
                        throw th2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C13346e.class.getName());
        C9612q.m13918g(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f34429i = logger;
    }

    public C13346e(InterfaceC13347a backend) {
        C9612q.m13917h(backend, "backend");
        this.f34437g = backend;
        this.f34431a = 10000;
        this.f34434d = new ArrayList();
        this.f34435e = new ArrayList();
        this.f34436f = new RunnableC13350d();
    }

    /* renamed from: c */
    private final void m2732c(AbstractC13342a abstractC13342a, long j) {
        boolean z;
        if (C12562c.f32615h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        C13345d m2754d = abstractC13342a.m2754d();
        C9612q.m13920e(m2754d);
        if (m2754d.m2746c() == abstractC13342a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            boolean m2745d = m2754d.m2745d();
            m2754d.m2736m(false);
            m2754d.m2737l(null);
            this.f34434d.remove(m2754d);
            if (j != -1 && !m2745d && !m2754d.m2742g()) {
                m2754d.m2738k(abstractC13342a, j, true);
            }
            if (!m2754d.m2744e().isEmpty()) {
                this.f34435e.add(m2754d);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: e */
    private final void m2730e(AbstractC13342a abstractC13342a) {
        if (C12562c.f32615h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        abstractC13342a.m2752g(-1L);
        C13345d m2754d = abstractC13342a.m2754d();
        C9612q.m13920e(m2754d);
        m2754d.m2744e().remove(abstractC13342a);
        this.f34435e.remove(m2754d);
        m2754d.m2737l(abstractC13342a);
        this.f34434d.add(m2754d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m2725j(AbstractC13342a abstractC13342a) {
        if (C12562c.f32615h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        Thread currentThread2 = Thread.currentThread();
        C9612q.m13918g(currentThread2, "currentThread");
        String name = currentThread2.getName();
        currentThread2.setName(abstractC13342a.m2756b());
        try {
            long mo123f = abstractC13342a.mo123f();
            synchronized (this) {
                m2732c(abstractC13342a, mo123f);
                Unit unit = Unit.f25302a;
            }
            currentThread2.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                m2732c(abstractC13342a, -1L);
                Unit unit2 = Unit.f25302a;
                currentThread2.setName(name);
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final AbstractC13342a m2731d() {
        boolean z;
        if (C12562c.f32615h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        while (!this.f34435e.isEmpty()) {
            long mo2721c = this.f34437g.mo2721c();
            Iterator<C13345d> it = this.f34435e.iterator();
            long j = Long.MAX_VALUE;
            AbstractC13342a abstractC13342a = null;
            while (true) {
                if (it.hasNext()) {
                    AbstractC13342a abstractC13342a2 = it.next().m2744e().get(0);
                    long max = Math.max(0L, abstractC13342a2.m2755c() - mo2721c);
                    if (max > 0) {
                        j = Math.min(max, j);
                    } else if (abstractC13342a != null) {
                        z = true;
                        break;
                    } else {
                        abstractC13342a = abstractC13342a2;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (abstractC13342a != null) {
                m2730e(abstractC13342a);
                if (z || (!this.f34432b && (!this.f34435e.isEmpty()))) {
                    this.f34437g.execute(this.f34436f);
                }
                return abstractC13342a;
            } else if (this.f34432b) {
                if (j < this.f34433c - mo2721c) {
                    this.f34437g.mo2722b(this);
                }
                return null;
            } else {
                this.f34432b = true;
                this.f34433c = mo2721c + j;
                try {
                    try {
                        this.f34437g.mo2723a(this, j);
                    } catch (InterruptedException unused) {
                        m2729f();
                    }
                } finally {
                    this.f34432b = false;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m2729f() {
        for (int size = this.f34434d.size() - 1; size >= 0; size--) {
            this.f34434d.get(size).m2747b();
        }
        for (int size2 = this.f34435e.size() - 1; size2 >= 0; size2--) {
            C13345d c13345d = this.f34435e.get(size2);
            c13345d.m2747b();
            if (c13345d.m2744e().isEmpty()) {
                this.f34435e.remove(size2);
            }
        }
    }

    /* renamed from: g */
    public final InterfaceC13347a m2728g() {
        return this.f34437g;
    }

    /* renamed from: h */
    public final void m2727h(C13345d taskQueue) {
        C9612q.m13917h(taskQueue, "taskQueue");
        if (C12562c.f32615h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        if (taskQueue.m2746c() == null) {
            if (!taskQueue.m2744e().isEmpty()) {
                C12562c.m4810a(this.f34435e, taskQueue);
            } else {
                this.f34435e.remove(taskQueue);
            }
        }
        if (this.f34432b) {
            this.f34437g.mo2722b(this);
        } else {
            this.f34437g.execute(this.f34436f);
        }
    }

    /* renamed from: i */
    public final C13345d m2726i() {
        int i;
        synchronized (this) {
            i = this.f34431a;
            this.f34431a = i + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i);
        return new C13345d(this, sb2.toString());
    }
}
