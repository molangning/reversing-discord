package com.facebook.datasource;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.datasource.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3569a<T> implements DataSource<T> {

    /* renamed from: a */
    private Map<String, Object> f9704a;

    /* renamed from: d */
    private T f9707d = null;

    /* renamed from: e */
    private Throwable f9708e = null;

    /* renamed from: f */
    private float f9709f = 0.0f;

    /* renamed from: c */
    private boolean f9706c = false;

    /* renamed from: b */
    private EnumC3573d f9705b = EnumC3573d.IN_PROGRESS;

    /* renamed from: g */
    private final ConcurrentLinkedQueue<Pair<InterfaceC3577d<T>, Executor>> f9710g = new ConcurrentLinkedQueue<>();

    /* renamed from: com.facebook.datasource.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC3570a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ boolean f9711j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC3577d f9712k;

        /* renamed from: l */
        final /* synthetic */ boolean f9713l;

        RunnableC3570a(boolean z, InterfaceC3577d interfaceC3577d, boolean z2) {
            AbstractC3569a.this = r1;
            this.f9711j = z;
            this.f9712k = interfaceC3577d;
            this.f9713l = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9711j) {
                this.f9712k.onFailure(AbstractC3569a.this);
            } else if (this.f9713l) {
                this.f9712k.onCancellation(AbstractC3569a.this);
            } else {
                this.f9712k.onNewResult(AbstractC3569a.this);
            }
        }
    }

    /* renamed from: com.facebook.datasource.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC3571b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ InterfaceC3577d f9715j;

        RunnableC3571b(InterfaceC3577d interfaceC3577d) {
            AbstractC3569a.this = r1;
            this.f9715j = interfaceC3577d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9715j.onProgressUpdate(AbstractC3569a.this);
        }
    }

    /* renamed from: com.facebook.datasource.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC3572c {
    }

    /* renamed from: com.facebook.datasource.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3573d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* renamed from: i */
    public static InterfaceC3572c m31707i() {
        return null;
    }

    /* renamed from: m */
    private void m31703m() {
        boolean m31706j = m31706j();
        boolean m31694w = m31694w();
        Iterator<Pair<InterfaceC3577d<T>, Executor>> it = this.f9710g.iterator();
        while (it.hasNext()) {
            Pair<InterfaceC3577d<T>, Executor> next = it.next();
            m31704l((InterfaceC3577d) next.first, (Executor) next.second, m31706j, m31694w);
        }
    }

    /* renamed from: r */
    private synchronized boolean m31699r(Throwable th2, Map<String, Object> map) {
        if (!this.f9706c && this.f9705b == EnumC3573d.IN_PROGRESS) {
            this.f9705b = EnumC3573d.FAILURE;
            this.f9708e = th2;
            this.f9704a = map;
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private synchronized boolean m31697t(float f) {
        if (!this.f9706c && this.f9705b == EnumC3573d.IN_PROGRESS) {
            if (f < this.f9709f) {
                return false;
            }
            this.f9709f = f;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0029, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x002c, code lost:
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x002e, code lost:
        mo31017h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0031, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
        return false;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m31695v(T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r3.f9706c     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L2b
            com.facebook.datasource.a$d r1 = r3.f9705b     // Catch: java.lang.Throwable -> L37
            com.facebook.datasource.a$d r2 = com.facebook.datasource.AbstractC3569a.EnumC3573d.IN_PROGRESS     // Catch: java.lang.Throwable -> L37
            if (r1 == r2) goto Ld
            goto L2b
        Ld:
            if (r5 == 0) goto L17
            com.facebook.datasource.a$d r5 = com.facebook.datasource.AbstractC3569a.EnumC3573d.SUCCESS     // Catch: java.lang.Throwable -> L37
            r3.f9705b = r5     // Catch: java.lang.Throwable -> L37
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f9709f = r5     // Catch: java.lang.Throwable -> L37
        L17:
            T r5 = r3.f9707d     // Catch: java.lang.Throwable -> L37
            if (r5 == r4) goto L22
            r3.f9707d = r4     // Catch: java.lang.Throwable -> L1f
            r4 = r5
            goto L23
        L1f:
            r4 = move-exception
            r0 = r5
            goto L38
        L22:
            r4 = r0
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L29
            r3.mo31017h(r4)
        L29:
            r4 = 1
            return r4
        L2b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L31
            r3.mo31017h(r4)
        L31:
            r4 = 0
            return r4
        L33:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L38
        L37:
            r4 = move-exception
        L38:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L3a
        L3a:
            r4 = move-exception
            if (r0 == 0) goto L40
            r3.mo31017h(r0)
        L40:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractC3569a.m31695v(java.lang.Object, boolean):boolean");
    }

    /* renamed from: w */
    private synchronized boolean m31694w() {
        boolean z;
        if (m31705k()) {
            if (!mo31712a()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: a */
    public synchronized boolean mo31712a() {
        boolean z;
        if (this.f9705b != EnumC3573d.IN_PROGRESS) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: b */
    public synchronized boolean mo31663b() {
        boolean z;
        if (this.f9707d != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: c */
    public synchronized Throwable mo31711c() {
        return this.f9708e;
    }

    @Override // com.facebook.datasource.DataSource
    public boolean close() {
        synchronized (this) {
            if (this.f9706c) {
                return false;
            }
            this.f9706c = true;
            T t = this.f9707d;
            this.f9707d = null;
            if (t != null) {
                mo31017h(t);
            }
            if (!mo31712a()) {
                m31703m();
            }
            synchronized (this) {
                this.f9710g.clear();
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.datasource.DataSource
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo31710d(com.facebook.datasource.InterfaceC3577d<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            p394w2.C13379j.m2677g(r3)
            p394w2.C13379j.m2677g(r4)
            monitor-enter(r2)
            boolean r0 = r2.f9706c     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            return
        Ld:
            com.facebook.datasource.a$d r0 = r2.f9705b     // Catch: java.lang.Throwable -> L41
            com.facebook.datasource.a$d r1 = com.facebook.datasource.AbstractC3569a.EnumC3573d.IN_PROGRESS     // Catch: java.lang.Throwable -> L41
            if (r0 != r1) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.d<T>, java.util.concurrent.Executor>> r0 = r2.f9710g     // Catch: java.lang.Throwable -> L41
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
        L1c:
            boolean r0 = r2.mo31663b()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.mo31712a()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.m31694w()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            boolean r0 = r2.m31706j()
            boolean r1 = r2.m31694w()
            r2.m31704l(r3, r4, r0, r1)
        L40:
            return
        L41:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractC3569a.mo31710d(com.facebook.datasource.d, java.util.concurrent.Executor):void");
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: e */
    public synchronized float mo31709e() {
        return this.f9709f;
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: f */
    public boolean mo31708f() {
        return false;
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: g */
    public synchronized T mo31018g() {
        return this.f9707d;
    }

    @Override // com.facebook.datasource.DataSource
    public Map<String, Object> getExtras() {
        return this.f9704a;
    }

    /* renamed from: h */
    protected void mo31017h(T t) {
    }

    /* renamed from: j */
    public synchronized boolean m31706j() {
        boolean z;
        if (this.f9705b == EnumC3573d.FAILURE) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: k */
    public synchronized boolean m31705k() {
        return this.f9706c;
    }

    /* renamed from: l */
    protected void m31704l(InterfaceC3577d<T> interfaceC3577d, Executor executor, boolean z, boolean z2) {
        RunnableC3570a runnableC3570a = new RunnableC3570a(z, interfaceC3577d, z2);
        m31707i();
        executor.execute(runnableC3570a);
    }

    /* renamed from: n */
    protected void m31702n() {
        Iterator<Pair<InterfaceC3577d<T>, Executor>> it = this.f9710g.iterator();
        while (it.hasNext()) {
            Pair<InterfaceC3577d<T>, Executor> next = it.next();
            ((Executor) next.second).execute(new RunnableC3571b((InterfaceC3577d) next.first));
        }
    }

    /* renamed from: o */
    public void m31701o(Map<String, Object> map) {
        this.f9704a = map;
    }

    /* renamed from: p */
    public boolean mo31659p(Throwable th2) {
        return m31700q(th2, null);
    }

    /* renamed from: q */
    public boolean m31700q(Throwable th2, Map<String, Object> map) {
        boolean m31699r = m31699r(th2, map);
        if (m31699r) {
            m31703m();
        }
        return m31699r;
    }

    /* renamed from: s */
    public boolean m31698s(float f) {
        boolean m31697t = m31697t(f);
        if (m31697t) {
            m31702n();
        }
        return m31697t;
    }

    /* renamed from: u */
    public boolean m31696u(T t, boolean z, Map<String, Object> map) {
        m31701o(map);
        boolean m31695v = m31695v(t, z);
        if (m31695v) {
            m31703m();
        }
        return m31695v;
    }
}