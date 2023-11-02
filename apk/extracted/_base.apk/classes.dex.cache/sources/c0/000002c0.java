package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.collection.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0626b<E> implements Collection<E>, Set<E> {

    /* renamed from: n */
    private static final int[] f2122n = new int[0];

    /* renamed from: o */
    private static final Object[] f2123o = new Object[0];

    /* renamed from: p */
    private static Object[] f2124p;

    /* renamed from: q */
    private static int f2125q;

    /* renamed from: r */
    private static Object[] f2126r;

    /* renamed from: s */
    private static int f2127s;

    /* renamed from: j */
    private int[] f2128j;

    /* renamed from: k */
    Object[] f2129k;

    /* renamed from: l */
    int f2130l;

    /* renamed from: m */
    private AbstractC0630e<E, E> f2131m;

    /* renamed from: androidx.collection.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0627a extends AbstractC0630e<E, E> {
        C0627a() {
            C0626b.this = r1;
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: a */
        protected void mo39479a() {
            C0626b.this.clear();
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: b */
        protected Object mo39478b(int i, int i2) {
            return C0626b.this.f2129k[i];
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: c */
        protected Map<E, E> mo39477c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: d */
        protected int mo39476d() {
            return C0626b.this.f2130l;
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: e */
        protected int mo39475e(Object obj) {
            return C0626b.this.indexOf(obj);
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: f */
        protected int mo39474f(Object obj) {
            return C0626b.this.indexOf(obj);
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: g */
        protected void mo39473g(E e, E e2) {
            C0626b.this.add(e);
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: h */
        protected void mo39472h(int i) {
            C0626b.this.m39501o(i);
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: i */
        protected E mo39471i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C0626b() {
        this(0);
    }

    /* renamed from: a */
    private void m39507a(int i) {
        if (i == 8) {
            synchronized (C0626b.class) {
                Object[] objArr = f2126r;
                if (objArr != null) {
                    this.f2129k = objArr;
                    f2126r = (Object[]) objArr[0];
                    this.f2128j = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2127s--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0626b.class) {
                Object[] objArr2 = f2124p;
                if (objArr2 != null) {
                    this.f2129k = objArr2;
                    f2124p = (Object[]) objArr2[0];
                    this.f2128j = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2125q--;
                    return;
                }
            }
        }
        this.f2128j = new int[i];
        this.f2129k = new Object[i];
    }

    /* renamed from: e */
    private static void m39505e(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0626b.class) {
                if (f2127s < 10) {
                    objArr[0] = f2126r;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2126r = objArr;
                    f2127s++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0626b.class) {
                if (f2125q < 10) {
                    objArr[0] = f2124p;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2124p = objArr;
                    f2125q++;
                }
            }
        }
    }

    /* renamed from: h */
    private AbstractC0630e<E, E> m39504h() {
        if (this.f2131m == null) {
            this.f2131m = new C0627a();
        }
        return this.f2131m;
    }

    /* renamed from: i */
    private int m39503i(Object obj, int i) {
        int i2 = this.f2130l;
        if (i2 == 0) {
            return -1;
        }
        int m39499a = C0628c.m39499a(this.f2128j, i2, i);
        if (m39499a < 0) {
            return m39499a;
        }
        if (obj.equals(this.f2129k[m39499a])) {
            return m39499a;
        }
        int i3 = m39499a + 1;
        while (i3 < i2 && this.f2128j[i3] == i) {
            if (obj.equals(this.f2129k[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m39499a - 1; i4 >= 0 && this.f2128j[i4] == i; i4--) {
            if (obj.equals(this.f2129k[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: k */
    private int m39502k() {
        int i = this.f2130l;
        if (i == 0) {
            return -1;
        }
        int m39499a = C0628c.m39499a(this.f2128j, i, 0);
        if (m39499a < 0) {
            return m39499a;
        }
        if (this.f2129k[m39499a] == null) {
            return m39499a;
        }
        int i2 = m39499a + 1;
        while (i2 < i && this.f2128j[i2] == 0) {
            if (this.f2129k[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m39499a - 1; i3 >= 0 && this.f2128j[i3] == 0; i3--) {
            if (this.f2129k[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m39503i;
        if (e == null) {
            m39503i = m39502k();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m39503i = m39503i(e, hashCode);
        }
        if (m39503i >= 0) {
            return false;
        }
        int i2 = ~m39503i;
        int i3 = this.f2130l;
        int[] iArr = this.f2128j;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f2129k;
            m39507a(i4);
            int[] iArr2 = this.f2128j;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2129k, 0, objArr.length);
            }
            m39505e(iArr, objArr, this.f2130l);
        }
        int i5 = this.f2130l;
        if (i2 < i5) {
            int[] iArr3 = this.f2128j;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f2129k;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f2130l - i2);
        }
        this.f2128j[i2] = i;
        this.f2129k[i2] = e;
        this.f2130l++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m39506d(this.f2130l + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f2130l;
        if (i != 0) {
            m39505e(this.f2128j, this.f2129k, i);
            this.f2128j = f2122n;
            this.f2129k = f2123o;
            this.f2130l = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void m39506d(int i) {
        int[] iArr = this.f2128j;
        if (iArr.length < i) {
            Object[] objArr = this.f2129k;
            m39507a(i);
            int i2 = this.f2130l;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f2128j, 0, i2);
                System.arraycopy(objArr, 0, this.f2129k, 0, this.f2130l);
            }
            m39505e(iArr, objArr, this.f2130l);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f2130l; i++) {
                try {
                    if (!set.contains(m39500p(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f2128j;
        int i = this.f2130l;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m39502k() : m39503i(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2130l <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m39504h().m39467m().iterator();
    }

    /* renamed from: o */
    public E m39501o(int i) {
        Object[] objArr = this.f2129k;
        E e = (E) objArr[i];
        int i2 = this.f2130l;
        if (i2 <= 1) {
            m39505e(this.f2128j, objArr, i2);
            this.f2128j = f2122n;
            this.f2129k = f2123o;
            this.f2130l = 0;
        } else {
            int[] iArr = this.f2128j;
            int i3 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m39507a(i3);
                this.f2130l--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f2128j, 0, i);
                    System.arraycopy(objArr, 0, this.f2129k, 0, i);
                }
                int i4 = this.f2130l;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, this.f2128j, i, i4 - i);
                    System.arraycopy(objArr, i5, this.f2129k, i, this.f2130l - i);
                }
            } else {
                int i6 = i2 - 1;
                this.f2130l = i6;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, iArr, i, i6 - i);
                    Object[] objArr2 = this.f2129k;
                    System.arraycopy(objArr2, i7, objArr2, i, this.f2130l - i);
                }
                this.f2129k[this.f2130l] = null;
            }
        }
        return e;
    }

    /* renamed from: p */
    public E m39500p(int i) {
        return (E) this.f2129k[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m39501o(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f2130l - 1; i >= 0; i--) {
            if (!collection.contains(this.f2129k[i])) {
                m39501o(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2130l;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f2130l;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f2129k, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2130l * 14);
        sb2.append('{');
        for (int i = 0; i < this.f2130l; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            E m39500p = m39500p(i);
            if (m39500p != this) {
                sb2.append(m39500p);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C0626b(int i) {
        if (i == 0) {
            this.f2128j = f2122n;
            this.f2129k = f2123o;
        } else {
            m39507a(i);
        }
        this.f2130l = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2130l) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2130l));
        }
        System.arraycopy(this.f2129k, 0, tArr, 0, this.f2130l);
        int length = tArr.length;
        int i = this.f2130l;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}