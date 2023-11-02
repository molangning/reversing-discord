package androidx.concurrent.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p198kb.InterfaceFutureC9213a;

/* renamed from: androidx.concurrent.futures.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0636a<V> implements InterfaceFutureC9213a<V> {

    /* renamed from: m */
    static final boolean f2156m = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: n */
    private static final Logger f2157n = Logger.getLogger(AbstractC0636a.class.getName());

    /* renamed from: o */
    static final AbstractC0638b f2158o;

    /* renamed from: p */
    private static final Object f2159p;

    /* renamed from: j */
    volatile Object f2160j;

    /* renamed from: k */
    volatile C0642e f2161k;

    /* renamed from: l */
    volatile C0646i f2162l;

    /* renamed from: androidx.concurrent.futures.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC0638b {
        private AbstractC0638b() {
        }

        /* renamed from: a */
        abstract boolean mo39444a(AbstractC0636a<?> abstractC0636a, C0642e c0642e, C0642e c0642e2);

        /* renamed from: b */
        abstract boolean mo39443b(AbstractC0636a<?> abstractC0636a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo39442c(AbstractC0636a<?> abstractC0636a, C0646i c0646i, C0646i c0646i2);

        /* renamed from: d */
        abstract void mo39441d(C0646i c0646i, C0646i c0646i2);

        /* renamed from: e */
        abstract void mo39440e(C0646i c0646i, Thread thread);
    }

    /* renamed from: androidx.concurrent.futures.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0639c {

        /* renamed from: c */
        static final C0639c f2163c;

        /* renamed from: d */
        static final C0639c f2164d;

        /* renamed from: a */
        final boolean f2165a;

        /* renamed from: b */
        final Throwable f2166b;

        static {
            if (AbstractC0636a.f2156m) {
                f2164d = null;
                f2163c = null;
                return;
            }
            f2164d = new C0639c(false, null);
            f2163c = new C0639c(true, null);
        }

        C0639c(boolean z, Throwable th2) {
            this.f2165a = z;
            this.f2166b = th2;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0640d {

        /* renamed from: b */
        static final C0640d f2167b = new C0640d(new C0641a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f2168a;

        /* renamed from: androidx.concurrent.futures.a$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0641a extends Throwable {
            C0641a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C0640d(Throwable th2) {
            this.f2168a = (Throwable) AbstractC0636a.m39456e(th2);
        }
    }

    /* renamed from: androidx.concurrent.futures.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0642e {

        /* renamed from: d */
        static final C0642e f2169d = new C0642e(null, null);

        /* renamed from: a */
        final Runnable f2170a;

        /* renamed from: b */
        final Executor f2171b;

        /* renamed from: c */
        C0642e f2172c;

        C0642e(Runnable runnable, Executor executor) {
            this.f2170a = runnable;
            this.f2171b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C0643f extends AbstractC0638b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C0646i, Thread> f2173a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C0646i, C0646i> f2174b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC0636a, C0646i> f2175c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC0636a, C0642e> f2176d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC0636a, Object> f2177e;

        C0643f(AtomicReferenceFieldUpdater<C0646i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0646i, C0646i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0636a, C0646i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0636a, C0642e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0636a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f2173a = atomicReferenceFieldUpdater;
            this.f2174b = atomicReferenceFieldUpdater2;
            this.f2175c = atomicReferenceFieldUpdater3;
            this.f2176d = atomicReferenceFieldUpdater4;
            this.f2177e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractC0636a.AbstractC0638b
        /* renamed from: a */
        boolean mo39444a(AbstractC0636a<?> abstractC0636a, C0642e c0642e, C0642e c0642e2) {
            return C0647b.m39437a(this.f2176d, abstractC0636a, c0642e, c0642e2);
        }

        @Override // androidx.concurrent.futures.AbstractC0636a.AbstractC0638b
        /* renamed from: b */
        boolean mo39443b(AbstractC0636a<?> abstractC0636a, Object obj, Object obj2) {
            return C0647b.m39437a(this.f2177e, abstractC0636a, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractC0636a.AbstractC0638b
        /* renamed from: c */
        boolean mo39442c(AbstractC0636a<?> abstractC0636a, C0646i c0646i, C0646i c0646i2) {
            return C0647b.m39437a(this.f2175c, abstractC0636a, c0646i, c0646i2);
        }

        @Override // androidx.concurrent.futures.AbstractC0636a.AbstractC0638b
        /* renamed from: d */
        void mo39441d(C0646i c0646i, C0646i c0646i2) {
            this.f2174b.lazySet(c0646i, c0646i2);
        }

        @Override // androidx.concurrent.futures.AbstractC0636a.AbstractC0638b
        /* renamed from: e */
        void mo39440e(C0646i c0646i, Thread thread) {
            this.f2173a.lazySet(c0646i, thread);
        }
    }

    /* renamed from: androidx.concurrent.futures.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class RunnableC0644g<V> implements Runnable {

        /* renamed from: j */
        final AbstractC0636a<V> f2178j;

        /* renamed from: k */
        final InterfaceFutureC9213a<? extends V> f2179k;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2178j.f2160j != this) {
                return;
            }
            if (AbstractC0636a.f2158o.mo39443b(this.f2178j, this, AbstractC0636a.m39451j(this.f2179k))) {
                AbstractC0636a.m39454g(this.f2178j);
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.a$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C0645h extends AbstractC0638b {
        C0645h() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractC0636a.AbstractC0638b
        /* renamed from: a */
        boolean mo39444a(AbstractC0636a<?> abstractC0636a, C0642e c0642e, C0642e c0642e2) {
            synchronized (abstractC0636a) {
                if (abstractC0636a.f2161k == c0642e) {
                    abstractC0636a.f2161k = c0642e2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0636a.AbstractC0638b
        /* renamed from: b */
        boolean mo39443b(AbstractC0636a<?> abstractC0636a, Object obj, Object obj2) {
            synchronized (abstractC0636a) {
                if (abstractC0636a.f2160j == obj) {
                    abstractC0636a.f2160j = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0636a.AbstractC0638b
        /* renamed from: c */
        boolean mo39442c(AbstractC0636a<?> abstractC0636a, C0646i c0646i, C0646i c0646i2) {
            synchronized (abstractC0636a) {
                if (abstractC0636a.f2162l == c0646i) {
                    abstractC0636a.f2162l = c0646i2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0636a.AbstractC0638b
        /* renamed from: d */
        void mo39441d(C0646i c0646i, C0646i c0646i2) {
            c0646i.f2182b = c0646i2;
        }

        @Override // androidx.concurrent.futures.AbstractC0636a.AbstractC0638b
        /* renamed from: e */
        void mo39440e(C0646i c0646i, Thread thread) {
            c0646i.f2181a = thread;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0646i {

        /* renamed from: c */
        static final C0646i f2180c = new C0646i(false);

        /* renamed from: a */
        volatile Thread f2181a;

        /* renamed from: b */
        volatile C0646i f2182b;

        C0646i(boolean z) {
        }

        /* renamed from: a */
        void m39439a(C0646i c0646i) {
            AbstractC0636a.f2158o.mo39441d(this, c0646i);
        }

        /* renamed from: b */
        void m39438b() {
            Thread thread = this.f2181a;
            if (thread != null) {
                this.f2181a = null;
                LockSupport.unpark(thread);
            }
        }

        C0646i() {
            AbstractC0636a.f2158o.mo39440e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0638b c0645h;
        try {
            c0645h = new C0643f(AtomicReferenceFieldUpdater.newUpdater(C0646i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0646i.class, C0646i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0636a.class, C0646i.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0636a.class, C0642e.class, "k"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0636a.class, Object.class, "j"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c0645h = new C0645h();
        }
        f2158o = c0645h;
        if (th != null) {
            f2157n.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2159p = new Object();
    }

    /* renamed from: b */
    private void m39459b(StringBuilder sb2) {
        try {
            Object m39450k = m39450k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m39445r(m39450k));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e2.getCause());
            sb2.append("]");
        }
    }

    /* renamed from: d */
    private static CancellationException m39457d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: e */
    static <T> T m39456e(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: f */
    private C0642e m39455f(C0642e c0642e) {
        C0642e c0642e2;
        do {
            c0642e2 = this.f2161k;
        } while (!f2158o.mo39444a(this, c0642e2, C0642e.f2169d));
        C0642e c0642e3 = c0642e;
        C0642e c0642e4 = c0642e2;
        while (c0642e4 != null) {
            C0642e c0642e5 = c0642e4.f2172c;
            c0642e4.f2172c = c0642e3;
            c0642e3 = c0642e4;
            c0642e4 = c0642e5;
        }
        return c0642e3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.concurrent.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.concurrent.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.concurrent.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.concurrent.futures.a<V>, androidx.concurrent.futures.a] */
    /* renamed from: g */
    static void m39454g(AbstractC0636a<?> abstractC0636a) {
        C0642e c0642e = null;
        while (true) {
            abstractC0636a.m39447n();
            abstractC0636a.m39458c();
            C0642e m39455f = abstractC0636a.m39455f(c0642e);
            while (m39455f != null) {
                c0642e = m39455f.f2172c;
                Runnable runnable = m39455f.f2170a;
                if (runnable instanceof RunnableC0644g) {
                    RunnableC0644g runnableC0644g = (RunnableC0644g) runnable;
                    abstractC0636a = runnableC0644g.f2178j;
                    if (abstractC0636a.f2160j == runnableC0644g) {
                        if (f2158o.mo39443b(abstractC0636a, runnableC0644g, m39451j(runnableC0644g.f2179k))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m39453h(runnable, m39455f.f2171b);
                }
                m39455f = c0642e;
            }
            return;
        }
    }

    /* renamed from: h */
    private static void m39453h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f2157n;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private V m39452i(Object obj) {
        if (!(obj instanceof C0639c)) {
            if (!(obj instanceof C0640d)) {
                if (obj == f2159p) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C0640d) obj).f2168a);
        }
        throw m39457d("Task was cancelled.", ((C0639c) obj).f2166b);
    }

    /* renamed from: j */
    static Object m39451j(InterfaceFutureC9213a<?> interfaceFutureC9213a) {
        if (interfaceFutureC9213a instanceof AbstractC0636a) {
            Object obj = ((AbstractC0636a) interfaceFutureC9213a).f2160j;
            if (obj instanceof C0639c) {
                C0639c c0639c = (C0639c) obj;
                if (c0639c.f2165a) {
                    if (c0639c.f2166b != null) {
                        return new C0639c(false, c0639c.f2166b);
                    }
                    return C0639c.f2164d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = interfaceFutureC9213a.isCancelled();
        if ((!f2156m) & isCancelled) {
            return C0639c.f2164d;
        }
        try {
            Object m39450k = m39450k(interfaceFutureC9213a);
            if (m39450k == null) {
                return f2159p;
            }
            return m39450k;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new C0640d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC9213a, e));
            }
            return new C0639c(false, e);
        } catch (ExecutionException e2) {
            return new C0640d(e2.getCause());
        } catch (Throwable th2) {
            return new C0640d(th2);
        }
    }

    /* renamed from: k */
    private static <V> V m39450k(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: n */
    private void m39447n() {
        C0646i c0646i;
        do {
            c0646i = this.f2162l;
        } while (!f2158o.mo39442c(this, c0646i, C0646i.f2180c));
        while (c0646i != null) {
            c0646i.m39438b();
            c0646i = c0646i.f2182b;
        }
    }

    /* renamed from: o */
    private void m39446o(C0646i c0646i) {
        c0646i.f2181a = null;
        while (true) {
            C0646i c0646i2 = this.f2162l;
            if (c0646i2 == C0646i.f2180c) {
                return;
            }
            C0646i c0646i3 = null;
            while (c0646i2 != null) {
                C0646i c0646i4 = c0646i2.f2182b;
                if (c0646i2.f2181a != null) {
                    c0646i3 = c0646i2;
                } else if (c0646i3 != null) {
                    c0646i3.f2182b = c0646i4;
                    if (c0646i3.f2181a == null) {
                        break;
                    }
                } else if (!f2158o.mo39442c(this, c0646i2, c0646i4)) {
                    break;
                }
                c0646i2 = c0646i4;
            }
            return;
        }
    }

    /* renamed from: r */
    private String m39445r(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Override // p198kb.InterfaceFutureC9213a
    /* renamed from: a */
    public final void mo16057a(Runnable runnable, Executor executor) {
        m39456e(runnable);
        m39456e(executor);
        C0642e c0642e = this.f2161k;
        if (c0642e != C0642e.f2169d) {
            C0642e c0642e2 = new C0642e(runnable, executor);
            do {
                c0642e2.f2172c = c0642e;
                if (f2158o.mo39444a(this, c0642e, c0642e2)) {
                    return;
                }
                c0642e = this.f2161k;
            } while (c0642e != C0642e.f2169d);
            m39453h(runnable, executor);
        }
        m39453h(runnable, executor);
    }

    /* renamed from: c */
    protected void m39458c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C0639c c0639c;
        boolean z3;
        Object obj = this.f2160j;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof RunnableC0644g))) {
            return false;
        }
        if (f2156m) {
            c0639c = new C0639c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            c0639c = C0639c.f2163c;
        } else {
            c0639c = C0639c.f2164d;
        }
        AbstractC0636a<V> abstractC0636a = this;
        boolean z4 = false;
        while (true) {
            if (f2158o.mo39443b(abstractC0636a, obj, c0639c)) {
                if (z) {
                    abstractC0636a.m39449l();
                }
                m39454g(abstractC0636a);
                if (!(obj instanceof RunnableC0644g)) {
                    return true;
                }
                InterfaceFutureC9213a<? extends V> interfaceFutureC9213a = ((RunnableC0644g) obj).f2179k;
                if (interfaceFutureC9213a instanceof AbstractC0636a) {
                    abstractC0636a = (AbstractC0636a) interfaceFutureC9213a;
                    obj = abstractC0636a.f2160j;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(z3 | (obj instanceof RunnableC0644g))) {
                        return true;
                    }
                    z4 = true;
                } else {
                    interfaceFutureC9213a.cancel(z);
                    return true;
                }
            } else {
                obj = abstractC0636a.f2160j;
                if (!(obj instanceof RunnableC0644g)) {
                    return z4;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f2160j;
            if ((obj != null) & (!(obj instanceof RunnableC0644g))) {
                return m39452i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C0646i c0646i = this.f2162l;
                if (c0646i != C0646i.f2180c) {
                    C0646i c0646i2 = new C0646i();
                    do {
                        c0646i2.m39439a(c0646i);
                        if (f2158o.mo39442c(this, c0646i, c0646i2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2160j;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC0644g))) {
                                        return m39452i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m39446o(c0646i2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m39446o(c0646i2);
                        } else {
                            c0646i = this.f2162l;
                        }
                    } while (c0646i != C0646i.f2180c);
                    return m39452i(this.f2160j);
                }
                return m39452i(this.f2160j);
            }
            while (nanos > 0) {
                Object obj3 = this.f2160j;
                if ((obj3 != null) & (!(obj3 instanceof RunnableC0644g))) {
                    return m39452i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC0636a = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractC0636a);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2160j instanceof C0639c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj;
        boolean z;
        if (this.f2160j != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC0644g)) & z;
    }

    /* renamed from: l */
    protected void m39449l() {
    }

    /* renamed from: m */
    protected String m39448m() {
        Object obj = this.f2160j;
        if (obj instanceof RunnableC0644g) {
            return "setFuture=[" + m39445r(((RunnableC0644g) obj).f2179k) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* renamed from: p */
    public boolean mo39436p(V v) {
        if (v == null) {
            v = (V) f2159p;
        }
        if (f2158o.mo39443b(this, null, v)) {
            m39454g(this);
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo39435q(Throwable th2) {
        if (f2158o.mo39443b(this, null, new C0640d((Throwable) m39456e(th2)))) {
            m39454g(this);
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m39459b(sb2);
        } else {
            try {
                str = m39448m();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                m39459b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2160j;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC0644g))) {
                return m39452i(obj2);
            }
            C0646i c0646i = this.f2162l;
            if (c0646i != C0646i.f2180c) {
                C0646i c0646i2 = new C0646i();
                do {
                    c0646i2.m39439a(c0646i);
                    if (f2158o.mo39442c(this, c0646i, c0646i2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2160j;
                            } else {
                                m39446o(c0646i2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC0644g))));
                        return m39452i(obj);
                    }
                    c0646i = this.f2162l;
                } while (c0646i != C0646i.f2180c);
                return m39452i(this.f2160j);
            }
            return m39452i(this.f2160j);
        }
        throw new InterruptedException();
    }
}