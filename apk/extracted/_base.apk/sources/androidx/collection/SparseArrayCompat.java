package androidx.collection;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class SparseArrayCompat<E> implements Cloneable {

    /* renamed from: n */
    private static final Object f2115n = new Object();

    /* renamed from: j */
    private boolean f2116j;

    /* renamed from: k */
    private int[] f2117k;

    /* renamed from: l */
    private Object[] f2118l;

    /* renamed from: m */
    private int f2119m;

    public SparseArrayCompat() {
        this(10);
    }

    /* renamed from: e */
    private void m39517e() {
        int i = this.f2119m;
        int[] iArr = this.f2117k;
        Object[] objArr = this.f2118l;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2115n) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2116j = false;
        this.f2119m = i2;
    }

    /* renamed from: b */
    public void m39520b(int i, E e) {
        int i2 = this.f2119m;
        if (i2 != 0 && i <= this.f2117k[i2 - 1]) {
            m39512l(i, e);
            return;
        }
        if (this.f2116j && i2 >= this.f2117k.length) {
            m39517e();
        }
        int i3 = this.f2119m;
        if (i3 >= this.f2117k.length) {
            int m39495e = C0628c.m39495e(i3 + 1);
            int[] iArr = new int[m39495e];
            Object[] objArr = new Object[m39495e];
            int[] iArr2 = this.f2117k;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2118l;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2117k = iArr;
            this.f2118l = objArr;
        }
        this.f2117k[i3] = i;
        this.f2118l[i3] = e;
        this.f2119m = i3 + 1;
    }

    /* renamed from: c */
    public void m39519c() {
        int i = this.f2119m;
        Object[] objArr = this.f2118l;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2119m = 0;
        this.f2116j = false;
    }

    /* renamed from: d */
    public SparseArrayCompat<E> clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.f2117k = (int[]) this.f2117k.clone();
            sparseArrayCompat.f2118l = (Object[]) this.f2118l.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public E m39516f(int i) {
        return m39515g(i, null);
    }

    /* renamed from: g */
    public E m39515g(int i, E e) {
        E e2;
        int m39499a = C0628c.m39499a(this.f2117k, this.f2119m, i);
        if (m39499a >= 0 && (e2 = (E) this.f2118l[m39499a]) != f2115n) {
            return e2;
        }
        return e;
    }

    /* renamed from: j */
    public int m39514j(E e) {
        if (this.f2116j) {
            m39517e();
        }
        for (int i = 0; i < this.f2119m; i++) {
            if (this.f2118l[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public int m39513k(int i) {
        if (this.f2116j) {
            m39517e();
        }
        return this.f2117k[i];
    }

    /* renamed from: l */
    public void m39512l(int i, E e) {
        int m39499a = C0628c.m39499a(this.f2117k, this.f2119m, i);
        if (m39499a >= 0) {
            this.f2118l[m39499a] = e;
            return;
        }
        int i2 = ~m39499a;
        int i3 = this.f2119m;
        if (i2 < i3) {
            Object[] objArr = this.f2118l;
            if (objArr[i2] == f2115n) {
                this.f2117k[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f2116j && i3 >= this.f2117k.length) {
            m39517e();
            i2 = ~C0628c.m39499a(this.f2117k, this.f2119m, i);
        }
        int i4 = this.f2119m;
        if (i4 >= this.f2117k.length) {
            int m39495e = C0628c.m39495e(i4 + 1);
            int[] iArr = new int[m39495e];
            Object[] objArr2 = new Object[m39495e];
            int[] iArr2 = this.f2117k;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2118l;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2117k = iArr;
            this.f2118l = objArr2;
        }
        int i5 = this.f2119m;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f2117k;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2118l;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2119m - i2);
        }
        this.f2117k[i2] = i;
        this.f2118l[i2] = e;
        this.f2119m++;
    }

    /* renamed from: m */
    public int m39511m() {
        if (this.f2116j) {
            m39517e();
        }
        return this.f2119m;
    }

    /* renamed from: n */
    public E m39510n(int i) {
        if (this.f2116j) {
            m39517e();
        }
        return (E) this.f2118l[i];
    }

    public String toString() {
        if (m39511m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2119m * 28);
        sb2.append('{');
        for (int i = 0; i < this.f2119m; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m39513k(i));
            sb2.append('=');
            E m39510n = m39510n(i);
            if (m39510n != this) {
                sb2.append(m39510n);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public SparseArrayCompat(int i) {
        this.f2116j = false;
        if (i == 0) {
            this.f2117k = C0628c.f2133a;
            this.f2118l = C0628c.f2135c;
            return;
        }
        int m39495e = C0628c.m39495e(i);
        this.f2117k = new int[m39495e];
        this.f2118l = new Object[m39495e];
    }
}
