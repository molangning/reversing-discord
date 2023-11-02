package p236n;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: n.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10477a<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f27360a;

    /* renamed from: b */
    private int f27361b;

    /* renamed from: c */
    private int f27362c;

    /* renamed from: d */
    private int f27363d;

    /* renamed from: e */
    private int f27364e;

    /* renamed from: f */
    private int f27365f;

    /* renamed from: g */
    private int f27366g;

    /* renamed from: h */
    private int f27367h;

    public C10477a(int i) {
        if (i > 0) {
            this.f27362c = i;
            this.f27360a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: e */
    private int m11426e(K k, V v) {
        int m11425f = m11425f(k, v);
        if (m11425f >= 0) {
            return m11425f;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    protected V m11430a(K k) {
        return null;
    }

    /* renamed from: b */
    protected void m11429b(boolean z, K k, V v, V v2) {
    }

    /* renamed from: c */
    public final V m11428c(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.f27360a.get(k);
                if (v != null) {
                    this.f27366g++;
                    return v;
                }
                this.f27367h++;
                V m11430a = m11430a(k);
                if (m11430a == null) {
                    return null;
                }
                synchronized (this) {
                    this.f27364e++;
                    put = this.f27360a.put(k, m11430a);
                    if (put != null) {
                        this.f27360a.put(k, put);
                    } else {
                        this.f27361b += m11426e(k, m11430a);
                    }
                }
                if (put != null) {
                    m11429b(false, k, m11430a, put);
                    return put;
                }
                m11424g(this.f27362c);
                return m11430a;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: d */
    public final V m11427d(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                this.f27363d++;
                this.f27361b += m11426e(k, v);
                put = this.f27360a.put(k, v);
                if (put != null) {
                    this.f27361b -= m11426e(k, put);
                }
            }
            if (put != null) {
                m11429b(false, k, put, v);
            }
            m11424g(this.f27362c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* renamed from: f */
    protected int m11425f(K k, V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m11424g(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f27361b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f27360a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f27361b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f27361b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f27360a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f27360a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f27360a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f27361b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m11426e(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f27361b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f27365f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f27365f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.m11429b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p236n.C10477a.m11424g(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f27366g;
        int i3 = this.f27367h + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f27362c), Integer.valueOf(this.f27366g), Integer.valueOf(this.f27367h), Integer.valueOf(i));
    }
}