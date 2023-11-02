package androidx.collection;

/* renamed from: androidx.collection.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0629d<E> implements Cloneable {

    /* renamed from: n */
    private static final Object f2136n = new Object();

    /* renamed from: j */
    private boolean f2137j;

    /* renamed from: k */
    private long[] f2138k;

    /* renamed from: l */
    private Object[] f2139l;

    /* renamed from: m */
    private int f2140m;

    public C0629d() {
        this(10);
    }

    /* renamed from: f */
    private void m39489f() {
        int i = this.f2140m;
        long[] jArr = this.f2138k;
        Object[] objArr = this.f2139l;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2136n) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2137j = false;
        this.f2140m = i2;
    }

    /* renamed from: b */
    public void m39493b(long j, E e) {
        int i = this.f2140m;
        if (i != 0 && j <= this.f2138k[i - 1]) {
            m39484m(j, e);
            return;
        }
        if (this.f2137j && i >= this.f2138k.length) {
            m39489f();
        }
        int i2 = this.f2140m;
        if (i2 >= this.f2138k.length) {
            int m39494f = C0628c.m39494f(i2 + 1);
            long[] jArr = new long[m39494f];
            Object[] objArr = new Object[m39494f];
            long[] jArr2 = this.f2138k;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f2139l;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2138k = jArr;
            this.f2139l = objArr;
        }
        this.f2138k[i2] = j;
        this.f2139l[i2] = e;
        this.f2140m = i2 + 1;
    }

    /* renamed from: c */
    public void m39492c() {
        int i = this.f2140m;
        Object[] objArr = this.f2139l;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2140m = 0;
        this.f2137j = false;
    }

    /* renamed from: d */
    public C0629d<E> clone() {
        try {
            C0629d<E> c0629d = (C0629d) super.clone();
            c0629d.f2138k = (long[]) this.f2138k.clone();
            c0629d.f2139l = (Object[]) this.f2139l.clone();
            return c0629d;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public boolean m39490e(long j) {
        return m39486k(j) >= 0;
    }

    /* renamed from: g */
    public E m39488g(long j) {
        return m39487j(j, null);
    }

    /* renamed from: j */
    public E m39487j(long j, E e) {
        E e2;
        int m39498b = C0628c.m39498b(this.f2138k, this.f2140m, j);
        if (m39498b >= 0 && (e2 = (E) this.f2139l[m39498b]) != f2136n) {
            return e2;
        }
        return e;
    }

    /* renamed from: k */
    public int m39486k(long j) {
        if (this.f2137j) {
            m39489f();
        }
        return C0628c.m39498b(this.f2138k, this.f2140m, j);
    }

    /* renamed from: l */
    public long m39485l(int i) {
        if (this.f2137j) {
            m39489f();
        }
        return this.f2138k[i];
    }

    /* renamed from: m */
    public void m39484m(long j, E e) {
        int m39498b = C0628c.m39498b(this.f2138k, this.f2140m, j);
        if (m39498b >= 0) {
            this.f2139l[m39498b] = e;
            return;
        }
        int i = ~m39498b;
        int i2 = this.f2140m;
        if (i < i2) {
            Object[] objArr = this.f2139l;
            if (objArr[i] == f2136n) {
                this.f2138k[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f2137j && i2 >= this.f2138k.length) {
            m39489f();
            i = ~C0628c.m39498b(this.f2138k, this.f2140m, j);
        }
        int i3 = this.f2140m;
        if (i3 >= this.f2138k.length) {
            int m39494f = C0628c.m39494f(i3 + 1);
            long[] jArr = new long[m39494f];
            Object[] objArr2 = new Object[m39494f];
            long[] jArr2 = this.f2138k;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2139l;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2138k = jArr;
            this.f2139l = objArr2;
        }
        int i4 = this.f2140m;
        if (i4 - i != 0) {
            long[] jArr3 = this.f2138k;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f2139l;
            System.arraycopy(objArr4, i, objArr4, i5, this.f2140m - i);
        }
        this.f2138k[i] = j;
        this.f2139l[i] = e;
        this.f2140m++;
    }

    /* renamed from: n */
    public void m39483n(long j) {
        int m39498b = C0628c.m39498b(this.f2138k, this.f2140m, j);
        if (m39498b >= 0) {
            Object[] objArr = this.f2139l;
            Object obj = objArr[m39498b];
            Object obj2 = f2136n;
            if (obj != obj2) {
                objArr[m39498b] = obj2;
                this.f2137j = true;
            }
        }
    }

    /* renamed from: p */
    public void m39482p(int i) {
        Object[] objArr = this.f2139l;
        Object obj = objArr[i];
        Object obj2 = f2136n;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f2137j = true;
        }
    }

    /* renamed from: q */
    public int m39481q() {
        if (this.f2137j) {
            m39489f();
        }
        return this.f2140m;
    }

    /* renamed from: r */
    public E m39480r(int i) {
        if (this.f2137j) {
            m39489f();
        }
        return (E) this.f2139l[i];
    }

    public String toString() {
        if (m39481q() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2140m * 28);
        sb2.append('{');
        for (int i = 0; i < this.f2140m; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m39485l(i));
            sb2.append('=');
            E m39480r = m39480r(i);
            if (m39480r != this) {
                sb2.append(m39480r);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C0629d(int i) {
        this.f2137j = false;
        if (i == 0) {
            this.f2138k = C0628c.f2134b;
            this.f2139l = C0628c.f2135c;
            return;
        }
        int m39494f = C0628c.m39494f(i);
        this.f2138k = new long[m39494f];
        this.f2139l = new Object[m39494f];
    }
}