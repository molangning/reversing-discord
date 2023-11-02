package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.Set;
import p394w2.C13379j;
import p394w2.C13381l;
import p394w2.C13386n;
import p414x2.C13677a;
import p437y4.C13905z;
import p437y4.InterfaceC13875a0;
import p455z2.InterfaceC14074c;
import p455z2.InterfaceC14076e;

/* renamed from: com.facebook.imagepipeline.memory.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3719b<V> implements InterfaceC14076e<V> {

    /* renamed from: a */
    private final Class<?> f10493a;

    /* renamed from: b */
    final InterfaceC14074c f10494b;

    /* renamed from: c */
    final C13905z f10495c;

    /* renamed from: d */
    final SparseArray<C3723c<V>> f10496d;

    /* renamed from: e */
    final Set<V> f10497e;

    /* renamed from: f */
    private boolean f10498f;

    /* renamed from: g */
    final C3720a f10499g;

    /* renamed from: h */
    final C3720a f10500h;

    /* renamed from: i */
    private final InterfaceC13875a0 f10501i;

    /* renamed from: j */
    private boolean f10502j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3720a {

        /* renamed from: a */
        int f10503a;

        /* renamed from: b */
        int f10504b;

        C3720a() {
        }

        /* renamed from: a */
        public void m30998a(int i) {
            int i2;
            int i3 = this.f10504b;
            if (i3 >= i && (i2 = this.f10503a) > 0) {
                this.f10503a = i2 - 1;
                this.f10504b = i3 - i;
                return;
            }
            C13677a.m1864N("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f10504b), Integer.valueOf(this.f10503a));
        }

        /* renamed from: b */
        public void m30997b(int i) {
            this.f10503a++;
            this.f10504b += i;
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3721b extends RuntimeException {
        public C3721b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3722c extends RuntimeException {
        public C3722c(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    public AbstractC3719b(InterfaceC14074c interfaceC14074c, C13905z c13905z, InterfaceC13875a0 interfaceC13875a0) {
        this.f10493a = getClass();
        this.f10494b = (InterfaceC14074c) C13379j.m2677g(interfaceC14074c);
        C13905z c13905z2 = (C13905z) C13379j.m2677g(c13905z);
        this.f10495c = c13905z2;
        this.f10501i = (InterfaceC13875a0) C13379j.m2677g(interfaceC13875a0);
        this.f10496d = new SparseArray<>();
        if (c13905z2.f35783f) {
            m31005r();
        } else {
            m31002v(new SparseIntArray(0));
        }
        this.f10497e = C13381l.m2671b();
        this.f10500h = new C3720a();
        this.f10499g = new C3720a();
    }

    /* renamed from: i */
    private synchronized void m31009i() {
        boolean z;
        if (m31003t() && this.f10500h.f10504b != 0) {
            z = false;
            C13379j.m2675i(z);
        }
        z = true;
        C13379j.m2675i(z);
    }

    /* renamed from: j */
    private void m31008j(SparseIntArray sparseIntArray) {
        this.f10496d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            this.f10496d.put(keyAt, new C3723c<>(mo30967p(keyAt), sparseIntArray.valueAt(i), 0, this.f10495c.f35783f));
        }
    }

    /* renamed from: m */
    private synchronized C3723c<V> m31006m(int i) {
        return this.f10496d.get(i);
    }

    /* renamed from: r */
    private synchronized void m31005r() {
        SparseIntArray sparseIntArray = this.f10495c.f35780c;
        if (sparseIntArray != null) {
            m31008j(sparseIntArray);
            this.f10498f = false;
        } else {
            this.f10498f = true;
        }
    }

    /* renamed from: v */
    private synchronized void m31002v(SparseIntArray sparseIntArray) {
        C13379j.m2677g(sparseIntArray);
        this.f10496d.clear();
        SparseIntArray sparseIntArray2 = this.f10495c.f35780c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f10496d.put(keyAt, new C3723c<>(mo30967p(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f10495c.f35783f));
            }
            this.f10498f = false;
        } else {
            this.f10498f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    /* renamed from: w */
    private void m31001w() {
        if (C13677a.m1842v(2)) {
            C13677a.m1877A(this.f10493a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f10499g.f10503a), Integer.valueOf(this.f10499g.f10504b), Integer.valueOf(this.f10500h.f10503a), Integer.valueOf(this.f10500h.f10504b));
        }
    }

    /* renamed from: g */
    protected abstract V mo30971g(int i);

    @Override // p455z2.InterfaceC14076e
    public V get(int i) {
        V v;
        V mo30985q;
        m31009i();
        int mo30969n = mo30969n(i);
        synchronized (this) {
            C3723c<V> m31007l = m31007l(mo30969n);
            if (m31007l != null && (mo30985q = mo30985q(m31007l)) != null) {
                C13379j.m2675i(this.f10497e.add(mo30985q));
                int mo30968o = mo30968o(mo30985q);
                int mo30967p = mo30967p(mo30968o);
                this.f10499g.m30997b(mo30967p);
                this.f10500h.m30998a(mo30967p);
                this.f10501i.mo1269e(mo30967p);
                m31001w();
                if (C13677a.m1842v(2)) {
                    C13677a.m1839y(this.f10493a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(mo30985q)), Integer.valueOf(mo30968o));
                }
                return mo30985q;
            }
            int mo30967p2 = mo30967p(mo30969n);
            if (m31010h(mo30967p2)) {
                this.f10499g.m30997b(mo30967p2);
                if (m31007l != null) {
                    m31007l.m30993e();
                }
                try {
                    v = mo30971g(mo30969n);
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f10499g.m30998a(mo30967p2);
                        C3723c<V> m31007l2 = m31007l(mo30969n);
                        if (m31007l2 != null) {
                            m31007l2.m30996b();
                        }
                        C13386n.m2664c(th2);
                        v = null;
                    }
                }
                synchronized (this) {
                    C13379j.m2675i(this.f10497e.add(v));
                    m30999z();
                    this.f10501i.mo1270d(mo30967p2);
                    m31001w();
                    if (C13677a.m1842v(2)) {
                        C13677a.m1839y(this.f10493a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(mo30969n));
                    }
                }
                return v;
            }
            throw new C3722c(this.f10495c.f35778a, this.f10499g.f10504b, this.f10500h.f10504b, mo30967p2);
        }
    }

    /* renamed from: h */
    synchronized boolean m31010h(int i) {
        if (this.f10502j) {
            return true;
        }
        C13905z c13905z = this.f10495c;
        int i2 = c13905z.f35778a;
        int i3 = this.f10499g.f10504b;
        if (i > i2 - i3) {
            this.f10501i.mo1267g();
            return false;
        }
        int i4 = c13905z.f35779b;
        if (i > i4 - (i3 + this.f10500h.f10504b)) {
            m31000y(i4 - i);
        }
        if (i <= i2 - (this.f10499g.f10504b + this.f10500h.f10504b)) {
            return true;
        }
        this.f10501i.mo1267g();
        return false;
    }

    /* renamed from: k */
    protected abstract void mo30970k(V v);

    /* renamed from: l */
    synchronized C3723c<V> m31007l(int i) {
        C3723c<V> c3723c = this.f10496d.get(i);
        if (c3723c == null && this.f10498f) {
            if (C13677a.m1842v(2)) {
                C13677a.m1840x(this.f10493a, "creating new bucket %s", Integer.valueOf(i));
            }
            C3723c<V> mo30980x = mo30980x(i);
            this.f10496d.put(i, mo30980x);
            return mo30980x;
        }
        return c3723c;
    }

    /* renamed from: n */
    protected abstract int mo30969n(int i);

    /* renamed from: o */
    protected abstract int mo30968o(V v);

    /* renamed from: p */
    protected abstract int mo30967p(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public synchronized V mo30985q(C3723c<V> c3723c) {
        return c3723c.m30995c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        r2.m30996b();
     */
    @Override // p455z2.InterfaceC14076e, p004a3.InterfaceC0016c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void release(V r8) {
        /*
            r7 = this;
            p394w2.C13379j.m2677g(r8)
            int r0 = r7.mo30968o(r8)
            int r1 = r7.mo30967p(r0)
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.c r2 = r7.m31006m(r0)     // Catch: java.lang.Throwable -> Lae
            java.util.Set<V> r3 = r7.f10497e     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.remove(r8)     // Catch: java.lang.Throwable -> Lae
            r4 = 2
            if (r3 != 0) goto L3d
            java.lang.Class<?> r2 = r7.f10493a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lae
            int r5 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lae
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            r5 = 1
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lae
            p414x2.C13677a.m1856h(r2, r3, r4)     // Catch: java.lang.Throwable -> Lae
            r7.mo30970k(r8)     // Catch: java.lang.Throwable -> Lae
            y4.a0 r8 = r7.f10501i     // Catch: java.lang.Throwable -> Lae
            r8.mo1272b(r1)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L3d:
            if (r2 == 0) goto L7e
            boolean r3 = r2.m30992f()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.m31003t()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.mo30966u(r8)     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L52
            goto L7e
        L52:
            r2.m30991h(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.b$a r2 = r7.f10500h     // Catch: java.lang.Throwable -> Lae
            r2.m30997b(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.b$a r2 = r7.f10499g     // Catch: java.lang.Throwable -> Lae
            r2.m30998a(r1)     // Catch: java.lang.Throwable -> Lae
            y4.a0 r2 = r7.f10501i     // Catch: java.lang.Throwable -> Lae
            r2.mo1271c(r1)     // Catch: java.lang.Throwable -> Lae
            boolean r1 = p414x2.C13677a.m1842v(r4)     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto La9
            java.lang.Class<?> r1 = r7.f10493a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            p414x2.C13677a.m1839y(r1, r2, r8, r0)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L7e:
            if (r2 == 0) goto L83
            r2.m30996b()     // Catch: java.lang.Throwable -> Lae
        L83:
            boolean r2 = p414x2.C13677a.m1842v(r4)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L9c
            java.lang.Class<?> r2 = r7.f10493a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            p414x2.C13677a.m1839y(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lae
        L9c:
            r7.mo30970k(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.b$a r8 = r7.f10499g     // Catch: java.lang.Throwable -> Lae
            r8.m30998a(r1)     // Catch: java.lang.Throwable -> Lae
            y4.a0 r8 = r7.f10501i     // Catch: java.lang.Throwable -> Lae
            r8.mo1272b(r1)     // Catch: java.lang.Throwable -> Lae
        La9:
            r7.m31001w()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            return
        Lae:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.AbstractC3719b.release(java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void m31004s() {
        this.f10494b.mo729a(this);
        this.f10501i.mo1268f(this);
    }

    /* renamed from: t */
    synchronized boolean m31003t() {
        boolean z;
        if (this.f10499g.f10504b + this.f10500h.f10504b > this.f10495c.f35779b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f10501i.mo1273a();
        }
        return z;
    }

    /* renamed from: u */
    protected boolean mo30966u(V v) {
        C13379j.m2677g(v);
        return true;
    }

    /* renamed from: x */
    C3723c<V> mo30980x(int i) {
        return new C3723c<>(mo30967p(i), ViewDefaults.NUMBER_OF_LINES, 0, this.f10495c.f35783f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    synchronized void m31000y(int i) {
        int i2 = this.f10499g.f10504b;
        int i3 = this.f10500h.f10504b;
        int min = Math.min((i2 + i3) - i, i3);
        if (min <= 0) {
            return;
        }
        if (C13677a.m1842v(2)) {
            C13677a.m1838z(this.f10493a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f10499g.f10504b + this.f10500h.f10504b), Integer.valueOf(min));
        }
        m31001w();
        for (int i4 = 0; i4 < this.f10496d.size() && min > 0; i4++) {
            C3723c c3723c = (C3723c) C13379j.m2677g(this.f10496d.valueAt(i4));
            while (min > 0) {
                Object mo30959g = c3723c.mo30959g();
                if (mo30959g == null) {
                    break;
                }
                mo30970k(mo30959g);
                int i5 = c3723c.f10505a;
                min -= i5;
                this.f10500h.m30998a(i5);
            }
        }
        m31001w();
        if (C13677a.m1842v(2)) {
            C13677a.m1839y(this.f10493a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f10499g.f10504b + this.f10500h.f10504b));
        }
    }

    /* renamed from: z */
    synchronized void m30999z() {
        if (m31003t()) {
            m31000y(this.f10495c.f35779b);
        }
    }

    public AbstractC3719b(InterfaceC14074c interfaceC14074c, C13905z c13905z, InterfaceC13875a0 interfaceC13875a0, boolean z) {
        this(interfaceC14074c, c13905z, interfaceC13875a0);
        this.f10502j = z;
    }
}
