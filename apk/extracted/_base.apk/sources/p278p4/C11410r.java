package p278p4;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p004a3.InterfaceC0016c;
import p278p4.InterfaceC11396i;
import p278p4.InterfaceC11413s;
import p394w2.C13379j;
import p394w2.InterfaceC13380k;

/* renamed from: p4.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11410r<K, V> implements InterfaceC11396i<K, V>, InterfaceC11413s<K, V> {

    /* renamed from: a */
    private final InterfaceC11396i.InterfaceC11398b<K> f29703a;

    /* renamed from: b */
    final C11395h<K, InterfaceC11396i.C11397a<K, V>> f29704b;

    /* renamed from: c */
    final C11395h<K, InterfaceC11396i.C11397a<K, V>> f29705c;

    /* renamed from: e */
    private final InterfaceC11419x<V> f29707e;

    /* renamed from: f */
    private final InterfaceC11413s.InterfaceC11414a f29708f;

    /* renamed from: g */
    private final Supplier<MemoryCacheParams> f29709g;

    /* renamed from: h */
    protected MemoryCacheParams f29710h;

    /* renamed from: d */
    final Map<Bitmap, Object> f29706d = new WeakHashMap();

    /* renamed from: i */
    private long f29711i = SystemClock.uptimeMillis();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11411a implements InterfaceC11419x<InterfaceC11396i.C11397a<K, V>> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11419x f29712a;

        C11411a(InterfaceC11419x interfaceC11419x) {
            this.f29712a = interfaceC11419x;
        }

        @Override // p278p4.InterfaceC11419x
        /* renamed from: b */
        public int mo8081a(InterfaceC11396i.C11397a<K, V> c11397a) {
            return this.f29712a.mo8081a(c11397a.f29692b.m31730D());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11412b implements InterfaceC0016c<V> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11396i.C11397a f29714a;

        C11412b(InterfaceC11396i.C11397a c11397a) {
            this.f29714a = c11397a;
        }

        @Override // p004a3.InterfaceC0016c
        public void release(V v) {
            C11410r.this.m8115x(this.f29714a);
        }
    }

    public C11410r(InterfaceC11419x<V> interfaceC11419x, InterfaceC11413s.InterfaceC11414a interfaceC11414a, Supplier<MemoryCacheParams> supplier, InterfaceC11396i.InterfaceC11398b<K> interfaceC11398b) {
        this.f29707e = interfaceC11419x;
        this.f29704b = new C11395h<>(m8113z(interfaceC11419x));
        this.f29705c = new C11395h<>(m8113z(interfaceC11419x));
        this.f29708f = interfaceC11414a;
        this.f29709g = supplier;
        this.f29710h = (MemoryCacheParams) C13379j.m2676h(supplier.get(), "mMemoryCacheParamsSupplier returned null");
        this.f29703a = interfaceC11398b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (m8128k() <= (r3.f29710h.f10275a - r4)) goto L10;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m8131h(V r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            p4.x<V> r0 = r3.f29707e     // Catch: java.lang.Throwable -> L28
            int r4 = r0.mo8081a(r4)     // Catch: java.lang.Throwable -> L28
            com.facebook.imagepipeline.cache.MemoryCacheParams r0 = r3.f29710h     // Catch: java.lang.Throwable -> L28
            int r0 = r0.f10279e     // Catch: java.lang.Throwable -> L28
            if (r4 > r0) goto L25
            int r0 = r3.m8129j()     // Catch: java.lang.Throwable -> L28
            com.facebook.imagepipeline.cache.MemoryCacheParams r1 = r3.f29710h     // Catch: java.lang.Throwable -> L28
            int r1 = r1.f10276b     // Catch: java.lang.Throwable -> L28
            r2 = 1
            int r1 = r1 - r2
            if (r0 > r1) goto L25
            int r0 = r3.m8128k()     // Catch: java.lang.Throwable -> L28
            com.facebook.imagepipeline.cache.MemoryCacheParams r1 = r3.f29710h     // Catch: java.lang.Throwable -> L28
            int r1 = r1.f10275a     // Catch: java.lang.Throwable -> L28
            int r1 = r1 - r4
            if (r0 > r1) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            monitor-exit(r3)
            return r2
        L28:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p278p4.C11410r.m8131h(java.lang.Object):boolean");
    }

    /* renamed from: i */
    private synchronized void m8130i(InterfaceC11396i.C11397a<K, V> c11397a) {
        boolean z;
        C13379j.m2677g(c11397a);
        if (c11397a.f29693c > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        c11397a.f29693c--;
    }

    /* renamed from: l */
    private synchronized void m8127l(InterfaceC11396i.C11397a<K, V> c11397a) {
        boolean z;
        C13379j.m2677g(c11397a);
        if (!c11397a.f29694d) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        c11397a.f29693c++;
    }

    /* renamed from: m */
    private synchronized void m8126m(InterfaceC11396i.C11397a<K, V> c11397a) {
        boolean z;
        C13379j.m2677g(c11397a);
        if (!c11397a.f29694d) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        c11397a.f29694d = true;
    }

    /* renamed from: n */
    private synchronized void m8125n(ArrayList<InterfaceC11396i.C11397a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<InterfaceC11396i.C11397a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m8126m(it.next());
            }
        }
    }

    /* renamed from: o */
    private synchronized boolean m8124o(InterfaceC11396i.C11397a<K, V> c11397a) {
        if (!c11397a.f29694d && c11397a.f29693c == 0) {
            this.f29704b.m8157h(c11397a.f29691a, c11397a);
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private void m8123p(ArrayList<InterfaceC11396i.C11397a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<InterfaceC11396i.C11397a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                CloseableReference.m31715v(m8116w(it.next()));
            }
        }
    }

    /* renamed from: r */
    private static <K, V> void m8121r(InterfaceC11396i.C11397a<K, V> c11397a) {
        InterfaceC11396i.InterfaceC11398b<K> interfaceC11398b;
        if (c11397a != null && (interfaceC11398b = c11397a.f29695e) != null) {
            interfaceC11398b.mo8153a(c11397a.f29691a, true);
        }
    }

    /* renamed from: s */
    private void m8120s(ArrayList<InterfaceC11396i.C11397a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<InterfaceC11396i.C11397a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m8119t(it.next());
            }
        }
    }

    /* renamed from: t */
    private static <K, V> void m8119t(InterfaceC11396i.C11397a<K, V> c11397a) {
        InterfaceC11396i.InterfaceC11398b<K> interfaceC11398b;
        if (c11397a != null && (interfaceC11398b = c11397a.f29695e) != null) {
            interfaceC11398b.mo8153a(c11397a.f29691a, false);
        }
    }

    /* renamed from: u */
    private synchronized void m8118u() {
        if (this.f29711i + this.f29710h.f10280f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f29711i = SystemClock.uptimeMillis();
        this.f29710h = (MemoryCacheParams) C13379j.m2676h(this.f29709g.get(), "mMemoryCacheParamsSupplier returned null");
    }

    /* renamed from: v */
    private synchronized CloseableReference<V> m8117v(InterfaceC11396i.C11397a<K, V> c11397a) {
        m8127l(c11397a);
        return CloseableReference.m31724U(c11397a.f29692b.m31730D(), new C11412b(c11397a));
    }

    /* renamed from: w */
    private synchronized CloseableReference<V> m8116w(InterfaceC11396i.C11397a<K, V> c11397a) {
        CloseableReference<V> closeableReference;
        C13379j.m2677g(c11397a);
        if (c11397a.f29694d && c11397a.f29693c == 0) {
            closeableReference = c11397a.f29692b;
        } else {
            closeableReference = null;
        }
        return closeableReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m8115x(InterfaceC11396i.C11397a<K, V> c11397a) {
        boolean m8124o;
        CloseableReference<V> m8116w;
        C13379j.m2677g(c11397a);
        synchronized (this) {
            m8130i(c11397a);
            m8124o = m8124o(c11397a);
            m8116w = m8116w(c11397a);
        }
        CloseableReference.m31715v(m8116w);
        if (!m8124o) {
            c11397a = null;
        }
        m8121r(c11397a);
        m8118u();
        m8122q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format("key is null, but exclusiveEntries count: %d, size: %d", java.lang.Integer.valueOf(r4.f29704b.m8162c()), java.lang.Integer.valueOf(r4.f29704b.m8159f())));
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.ArrayList<p278p4.InterfaceC11396i.C11397a<K, V>> m8114y(int r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r5 = java.lang.Math.max(r5, r0)     // Catch: java.lang.Throwable -> L74
            int r6 = java.lang.Math.max(r6, r0)     // Catch: java.lang.Throwable -> L74
            p4.h<K, p4.i$a<K, V>> r1 = r4.f29704b     // Catch: java.lang.Throwable -> L74
            int r1 = r1.m8162c()     // Catch: java.lang.Throwable -> L74
            if (r1 > r5) goto L1d
            p4.h<K, p4.i$a<K, V>> r1 = r4.f29704b     // Catch: java.lang.Throwable -> L74
            int r1 = r1.m8159f()     // Catch: java.lang.Throwable -> L74
            if (r1 > r6) goto L1d
            monitor-exit(r4)
            r5 = 0
            return r5
        L1d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
        L22:
            p4.h<K, p4.i$a<K, V>> r2 = r4.f29704b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.m8162c()     // Catch: java.lang.Throwable -> L74
            if (r2 > r5) goto L35
            p4.h<K, p4.i$a<K, V>> r2 = r4.f29704b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.m8159f()     // Catch: java.lang.Throwable -> L74
            if (r2 <= r6) goto L33
            goto L35
        L33:
            monitor-exit(r4)
            return r1
        L35:
            p4.h<K, p4.i$a<K, V>> r2 = r4.f29704b     // Catch: java.lang.Throwable -> L74
            java.lang.Object r2 = r2.m8161d()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L4c
            p4.h<K, p4.i$a<K, V>> r3 = r4.f29704b     // Catch: java.lang.Throwable -> L74
            r3.m8156i(r2)     // Catch: java.lang.Throwable -> L74
            p4.h<K, p4.i$a<K, V>> r3 = r4.f29705c     // Catch: java.lang.Throwable -> L74
            java.lang.Object r2 = r3.m8156i(r2)     // Catch: java.lang.Throwable -> L74
            r1.add(r2)     // Catch: java.lang.Throwable -> L74
            goto L22
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = "key is null, but exclusiveEntries count: %d, size: %d"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L74
            p4.h<K, p4.i$a<K, V>> r2 = r4.f29704b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.m8162c()     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L74
            r1[r0] = r2     // Catch: java.lang.Throwable -> L74
            p4.h<K, p4.i$a<K, V>> r0 = r4.f29704b     // Catch: java.lang.Throwable -> L74
            int r0 = r0.m8159f()     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L74
            r2 = 1
            r1[r2] = r0     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = java.lang.String.format(r6, r1)     // Catch: java.lang.Throwable -> L74
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L74
            throw r5     // Catch: java.lang.Throwable -> L74
        L74:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p278p4.C11410r.m8114y(int, int):java.util.ArrayList");
    }

    /* renamed from: z */
    private InterfaceC11419x<InterfaceC11396i.C11397a<K, V>> m8113z(InterfaceC11419x<V> interfaceC11419x) {
        return new C11411a(interfaceC11419x);
    }

    @Override // p278p4.InterfaceC11413s
    /* renamed from: a */
    public synchronized boolean mo8111a(InterfaceC13380k<K> interfaceC13380k) {
        return !this.f29705c.m8160e(interfaceC13380k).isEmpty();
    }

    @Override // p278p4.InterfaceC11413s
    /* renamed from: b */
    public void mo8110b(K k) {
        C13379j.m2677g(k);
        synchronized (this) {
            InterfaceC11396i.C11397a<K, V> m8156i = this.f29704b.m8156i(k);
            if (m8156i != null) {
                this.f29704b.m8157h(k, m8156i);
            }
        }
    }

    @Override // p278p4.InterfaceC11413s
    /* renamed from: c */
    public CloseableReference<V> mo8109c(K k, CloseableReference<V> closeableReference) {
        return mo8134e(k, closeableReference, this.f29703a);
    }

    @Override // p278p4.InterfaceC11413s
    public synchronized boolean contains(K k) {
        return this.f29705c.m8164a(k);
    }

    @Override // p278p4.InterfaceC11413s
    /* renamed from: d */
    public int mo8108d(InterfaceC13380k<K> interfaceC13380k) {
        ArrayList<InterfaceC11396i.C11397a<K, V>> m8155j;
        ArrayList<InterfaceC11396i.C11397a<K, V>> m8155j2;
        synchronized (this) {
            m8155j = this.f29704b.m8155j(interfaceC13380k);
            m8155j2 = this.f29705c.m8155j(interfaceC13380k);
            m8125n(m8155j2);
        }
        m8123p(m8155j2);
        m8120s(m8155j);
        m8118u();
        m8122q();
        return m8155j2.size();
    }

    @Override // p278p4.InterfaceC11396i
    /* renamed from: e */
    public CloseableReference<V> mo8134e(K k, CloseableReference<V> closeableReference, InterfaceC11396i.InterfaceC11398b<K> interfaceC11398b) {
        InterfaceC11396i.C11397a<K, V> m8156i;
        CloseableReference<V> closeableReference2;
        CloseableReference<V> closeableReference3;
        C13379j.m2677g(k);
        C13379j.m2677g(closeableReference);
        m8118u();
        synchronized (this) {
            m8156i = this.f29704b.m8156i(k);
            InterfaceC11396i.C11397a<K, V> m8156i2 = this.f29705c.m8156i(k);
            closeableReference2 = null;
            if (m8156i2 != null) {
                m8126m(m8156i2);
                closeableReference3 = m8116w(m8156i2);
            } else {
                closeableReference3 = null;
            }
            if (m8131h(closeableReference.m31730D())) {
                InterfaceC11396i.C11397a<K, V> m8154a = InterfaceC11396i.C11397a.m8154a(k, closeableReference, interfaceC11398b);
                this.f29705c.m8157h(k, m8154a);
                closeableReference2 = m8117v(m8154a);
            }
        }
        CloseableReference.m31715v(closeableReference3);
        m8119t(m8156i);
        m8122q();
        return closeableReference2;
    }

    @Override // p278p4.InterfaceC11396i
    /* renamed from: f */
    public CloseableReference<V> mo8133f(K k) {
        InterfaceC11396i.C11397a<K, V> m8156i;
        boolean z;
        CloseableReference<V> closeableReference;
        C13379j.m2677g(k);
        synchronized (this) {
            m8156i = this.f29704b.m8156i(k);
            z = false;
            if (m8156i != null) {
                InterfaceC11396i.C11397a<K, V> m8156i2 = this.f29705c.m8156i(k);
                C13379j.m2677g(m8156i2);
                if (m8156i2.f29693c == 0) {
                    z = true;
                }
                C13379j.m2675i(z);
                closeableReference = m8156i2.f29692b;
                z = true;
            } else {
                closeableReference = null;
            }
        }
        if (z) {
            m8119t(m8156i);
        }
        return closeableReference;
    }

    @Override // p278p4.InterfaceC11413s
    public CloseableReference<V> get(K k) {
        InterfaceC11396i.C11397a<K, V> m8156i;
        CloseableReference<V> closeableReference;
        C13379j.m2677g(k);
        synchronized (this) {
            m8156i = this.f29704b.m8156i(k);
            InterfaceC11396i.C11397a<K, V> m8163b = this.f29705c.m8163b(k);
            if (m8163b != null) {
                closeableReference = m8117v(m8163b);
            } else {
                closeableReference = null;
            }
        }
        m8119t(m8156i);
        m8118u();
        m8122q();
        return closeableReference;
    }

    /* renamed from: j */
    public synchronized int m8129j() {
        return this.f29705c.m8162c() - this.f29704b.m8162c();
    }

    /* renamed from: k */
    public synchronized int m8128k() {
        return this.f29705c.m8159f() - this.f29704b.m8159f();
    }

    /* renamed from: q */
    public void m8122q() {
        ArrayList<InterfaceC11396i.C11397a<K, V>> m8114y;
        synchronized (this) {
            MemoryCacheParams memoryCacheParams = this.f29710h;
            int min = Math.min(memoryCacheParams.f10278d, memoryCacheParams.f10276b - m8129j());
            MemoryCacheParams memoryCacheParams2 = this.f29710h;
            m8114y = m8114y(min, Math.min(memoryCacheParams2.f10277c, memoryCacheParams2.f10275a - m8128k()));
            m8125n(m8114y);
        }
        m8123p(m8114y);
        m8120s(m8114y);
    }
}
