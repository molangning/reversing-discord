package okhttp3;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p410wj.C13638e;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b9\u0010:J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0006\u0010\u001c\u001a\u00020\u001bR*\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010#\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R.\u0010-\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00104\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u001e\u00105\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0005028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00103R\u0011\u00108\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b/\u00107¨\u0006;"}, m14357d2 = {"Lokhttp3/Dispatcher;", "", "", ZeroconfModule.KEY_SERVICE_HOST, "Lwj/e$a;", "Lwj/e;", "e", "", "j", "T", "Ljava/util/Deque;", "calls", "call", "", "f", "(Ljava/util/Deque;Ljava/lang/Object;)V", "b", "(Lwj/e$a;)V", "a", "c", "(Lwj/e;)V", "g", "h", "", "Lokhttp3/Call;", "k", "l", "", "m", "maxRequests", "I", "i", "()I", "n", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "o", "Ljava/lang/Runnable;", "<set-?>", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "d", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "()Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class Dispatcher {

    /* renamed from: c */
    private Runnable f29290c;

    /* renamed from: d */
    private ExecutorService f29291d;

    /* renamed from: a */
    private int f29288a = 64;

    /* renamed from: b */
    private int f29289b = 5;

    /* renamed from: e */
    private final ArrayDeque<C13638e.RunnableC13639a> f29292e = new ArrayDeque<>();

    /* renamed from: f */
    private final ArrayDeque<C13638e.RunnableC13639a> f29293f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<C13638e> f29294g = new ArrayDeque<>();

    /* renamed from: e */
    private final C13638e.RunnableC13639a m8940e(String str) {
        Iterator<C13638e.RunnableC13639a> it = this.f29293f.iterator();
        while (it.hasNext()) {
            C13638e.RunnableC13639a next = it.next();
            if (C9612q.m13922c(next.m1973d(), str)) {
                return next;
            }
        }
        Iterator<C13638e.RunnableC13639a> it2 = this.f29292e.iterator();
        while (it2.hasNext()) {
            C13638e.RunnableC13639a next2 = it2.next();
            if (C9612q.m13922c(next2.m1973d(), str)) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: f */
    private final <T> void m8939f(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f29290c;
                Unit unit = Unit.f25302a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m8935j() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: j */
    private final boolean m8935j() {
        int i;
        boolean z;
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
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C13638e.RunnableC13639a> it = this.f29292e.iterator();
            C9612q.m13918g(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                C13638e.RunnableC13639a asyncCall = it.next();
                if (this.f29293f.size() >= this.f29288a) {
                    break;
                } else if (asyncCall.m1974c().get() < this.f29289b) {
                    it.remove();
                    asyncCall.m1974c().incrementAndGet();
                    C9612q.m13918g(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.f29293f.add(asyncCall);
                }
            }
            if (m8932m() > 0) {
                z = true;
            } else {
                z = false;
            }
            Unit unit = Unit.f25302a;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C13638e.RunnableC13639a) arrayList.get(i)).m1976a(m8941d());
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized void m8944a() {
        Iterator<C13638e.RunnableC13639a> it = this.f29292e.iterator();
        while (it.hasNext()) {
            it.next().m1975b().cancel();
        }
        Iterator<C13638e.RunnableC13639a> it2 = this.f29293f.iterator();
        while (it2.hasNext()) {
            it2.next().m1975b().cancel();
        }
        Iterator<C13638e> it3 = this.f29294g.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    /* renamed from: b */
    public final void m8943b(C13638e.RunnableC13639a call) {
        C13638e.RunnableC13639a m8940e;
        C9612q.m13917h(call, "call");
        synchronized (this) {
            this.f29292e.add(call);
            if (!call.m1975b().m1986q() && (m8940e = m8940e(call.m1973d())) != null) {
                call.m1972e(m8940e);
            }
            Unit unit = Unit.f25302a;
        }
        m8935j();
    }

    /* renamed from: c */
    public final synchronized void m8942c(C13638e call) {
        C9612q.m13917h(call, "call");
        this.f29294g.add(call);
    }

    /* renamed from: d */
    public final synchronized ExecutorService m8941d() {
        ExecutorService executorService;
        if (this.f29291d == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.f29291d = new ThreadPoolExecutor(0, (int) ViewDefaults.NUMBER_OF_LINES, 60L, timeUnit, synchronousQueue, C12562c.m4825K(C12562c.f32616i + " Dispatcher", false));
        }
        executorService = this.f29291d;
        C9612q.m13920e(executorService);
        return executorService;
    }

    /* renamed from: g */
    public final void m8938g(C13638e.RunnableC13639a call) {
        C9612q.m13917h(call, "call");
        call.m1974c().decrementAndGet();
        m8939f(this.f29293f, call);
    }

    /* renamed from: h */
    public final void m8937h(C13638e call) {
        C9612q.m13917h(call, "call");
        m8939f(this.f29294g, call);
    }

    /* renamed from: i */
    public final synchronized int m8936i() {
        return this.f29288a;
    }

    /* renamed from: k */
    public final synchronized List<Call> m8934k() {
        int m14093t;
        List<Call> unmodifiableList;
        ArrayDeque<C13638e.RunnableC13639a> arrayDeque = this.f29292e;
        m14093t = C9546k.m14093t(arrayDeque, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C13638e.RunnableC13639a runnableC13639a : arrayDeque) {
            arrayList.add(runnableC13639a.m1975b());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        C9612q.m13918g(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    /* renamed from: l */
    public final synchronized List<Call> m8933l() {
        int m14093t;
        List m14036n0;
        List<Call> unmodifiableList;
        ArrayDeque<C13638e> arrayDeque = this.f29294g;
        ArrayDeque<C13638e.RunnableC13639a> arrayDeque2 = this.f29293f;
        m14093t = C9546k.m14093t(arrayDeque2, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C13638e.RunnableC13639a runnableC13639a : arrayDeque2) {
            arrayList.add(runnableC13639a.m1975b());
        }
        m14036n0 = C9553r.m14036n0(arrayDeque, arrayList);
        unmodifiableList = Collections.unmodifiableList(m14036n0);
        C9612q.m13918g(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    /* renamed from: m */
    public final synchronized int m8932m() {
        return this.f29293f.size() + this.f29294g.size();
    }

    /* renamed from: n */
    public final void m8931n(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.f29288a = i;
                Unit unit = Unit.f25302a;
            }
            m8935j();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i).toString());
    }

    /* renamed from: o */
    public final void m8930o(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.f29289b = i;
                Unit unit = Unit.f25302a;
            }
            m8935j();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i).toString());
    }
}