package p180jf;

import bf.InterfaceC2276b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p085ef.InterfaceC6213a;

/* renamed from: jf.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RunnableC8926f extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC2276b {

    /* renamed from: k */
    static final Object f23356k = new Object();

    /* renamed from: l */
    static final Object f23357l = new Object();

    /* renamed from: m */
    static final Object f23358m = new Object();

    /* renamed from: n */
    static final Object f23359n = new Object();

    /* renamed from: j */
    final Runnable f23360j;

    public RunnableC8926f(Runnable runnable, InterfaceC6213a interfaceC6213a) {
        super(3);
        this.f23360j = runnable;
        lazySet(0, interfaceC6213a);
    }

    /* renamed from: a */
    public void m17038a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f23359n) {
                return;
            }
            if (obj == f23357l) {
                future.cancel(false);
                return;
            } else if (obj == f23358m) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // bf.InterfaceC2276b
    /* renamed from: b */
    public boolean mo16034b() {
        Object obj = get(0);
        if (obj != f23356k && obj != f23359n) {
            return false;
        }
        return true;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // bf.InterfaceC2276b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f23359n || obj5 == (obj3 = f23357l) || obj5 == (obj4 = f23358m)) {
                break;
            }
            if (get(2) != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f23359n || obj == (obj2 = f23356k) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((InterfaceC6213a) obj).mo23233a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f23360j.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f23356k) {
                    ((InterfaceC6213a) obj4).mo23233a(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f23357l) {
                        return;
                    }
                    return;
                } while (!compareAndSet(1, obj5, f23359n));
            } catch (Throwable th2) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f23356k && compareAndSet(0, obj4, f23359n) && obj4 != null) {
            ((InterfaceC6213a) obj4).mo23233a(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f23357l || obj5 == f23358m) {
                return;
            }
        } while (!compareAndSet(1, obj5, f23359n));
    }
}
