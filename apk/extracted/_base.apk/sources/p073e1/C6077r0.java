package p073e1;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p291q1.C11674f;

/* renamed from: e1.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6077r0<T> {

    /* renamed from: e */
    public static Executor f17297e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<InterfaceC6065l0<T>> f17298a;

    /* renamed from: b */
    private final Set<InterfaceC6065l0<Throwable>> f17299b;

    /* renamed from: c */
    private final Handler f17300c;

    /* renamed from: d */
    private volatile C6073p0<T> f17301d;

    /* renamed from: e1.r0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C6078a extends FutureTask<C6073p0<T>> {
        C6078a(Callable<C6073p0<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                C6077r0.this.m23635k(get());
            } catch (InterruptedException | ExecutionException e) {
                C6077r0.this.m23635k(new C6073p0(e));
            }
        }
    }

    public C6077r0(Callable<C6073p0<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m23641e() {
        C6073p0<T> c6073p0 = this.f17301d;
        if (c6073p0 == null) {
            return;
        }
        if (c6073p0.m23646b() != null) {
            m23638h(c6073p0.m23646b());
        } else {
            m23640f(c6073p0.m23647a());
        }
    }

    /* renamed from: f */
    private synchronized void m23640f(Throwable th2) {
        ArrayList<InterfaceC6065l0> arrayList = new ArrayList(this.f17299b);
        if (arrayList.isEmpty()) {
            C11674f.m7232d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        for (InterfaceC6065l0 interfaceC6065l0 : arrayList) {
            interfaceC6065l0.onResult(th2);
        }
    }

    /* renamed from: g */
    private void m23639g() {
        this.f17300c.post(new Runnable() { // from class: e1.q0
            @Override // java.lang.Runnable
            public final void run() {
                C6077r0.this.m23641e();
            }
        });
    }

    /* renamed from: h */
    private synchronized void m23638h(T t) {
        for (InterfaceC6065l0 interfaceC6065l0 : new ArrayList(this.f17298a)) {
            interfaceC6065l0.onResult(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m23635k(C6073p0<T> c6073p0) {
        if (this.f17301d == null) {
            this.f17301d = c6073p0;
            m23639g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: c */
    public synchronized C6077r0<T> m23643c(InterfaceC6065l0<Throwable> interfaceC6065l0) {
        C6073p0<T> c6073p0 = this.f17301d;
        if (c6073p0 != null && c6073p0.m23647a() != null) {
            interfaceC6065l0.onResult(c6073p0.m23647a());
        }
        this.f17299b.add(interfaceC6065l0);
        return this;
    }

    /* renamed from: d */
    public synchronized C6077r0<T> m23642d(InterfaceC6065l0<T> interfaceC6065l0) {
        C6073p0<T> c6073p0 = this.f17301d;
        if (c6073p0 != null && c6073p0.m23646b() != null) {
            interfaceC6065l0.onResult(c6073p0.m23646b());
        }
        this.f17298a.add(interfaceC6065l0);
        return this;
    }

    /* renamed from: i */
    public synchronized C6077r0<T> m23637i(InterfaceC6065l0<Throwable> interfaceC6065l0) {
        this.f17299b.remove(interfaceC6065l0);
        return this;
    }

    /* renamed from: j */
    public synchronized C6077r0<T> m23636j(InterfaceC6065l0<T> interfaceC6065l0) {
        this.f17298a.remove(interfaceC6065l0);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6077r0(Callable<C6073p0<T>> callable, boolean z) {
        this.f17298a = new LinkedHashSet(1);
        this.f17299b = new LinkedHashSet(1);
        this.f17300c = new Handler(Looper.getMainLooper());
        this.f17301d = null;
        if (z) {
            try {
                m23635k(callable.call());
                return;
            } catch (Throwable th2) {
                m23635k(new C6073p0<>(th2));
                return;
            }
        }
        f17297e.execute(new C6078a(callable));
    }
}
