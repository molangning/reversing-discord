package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class SimpleArrayMap<K, V> {

    /* renamed from: m */
    static Object[] f2108m;

    /* renamed from: n */
    static int f2109n;

    /* renamed from: o */
    static Object[] f2110o;

    /* renamed from: p */
    static int f2111p;

    /* renamed from: j */
    int[] f2112j;

    /* renamed from: k */
    Object[] f2113k;

    /* renamed from: l */
    int f2114l;

    public SimpleArrayMap() {
        this.f2112j = C0628c.f2133a;
        this.f2113k = C0628c.f2135c;
        this.f2114l = 0;
    }

    /* renamed from: a */
    private void m39533a(int i) {
        if (i == 8) {
            synchronized (SimpleArrayMap.class) {
                Object[] objArr = f2110o;
                if (objArr != null) {
                    this.f2113k = objArr;
                    f2110o = (Object[]) objArr[0];
                    this.f2112j = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2111p--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (SimpleArrayMap.class) {
                Object[] objArr2 = f2108m;
                if (objArr2 != null) {
                    this.f2113k = objArr2;
                    f2108m = (Object[]) objArr2[0];
                    this.f2112j = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2109n--;
                    return;
                }
            }
        }
        this.f2112j = new int[i];
        this.f2113k = new Object[i << 1];
    }

    /* renamed from: b */
    private static int m39532b(int[] iArr, int i, int i2) {
        try {
            return C0628c.m39499a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private static void m39530e(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (SimpleArrayMap.class) {
                if (f2111p < 10) {
                    objArr[0] = f2110o;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2110o = objArr;
                    f2111p++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (SimpleArrayMap.class) {
                if (f2109n < 10) {
                    objArr[0] = f2108m;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2108m = objArr;
                    f2109n++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m39531c(int i) {
        int i2 = this.f2114l;
        int[] iArr = this.f2112j;
        if (iArr.length < i) {
            Object[] objArr = this.f2113k;
            m39533a(i);
            if (this.f2114l > 0) {
                System.arraycopy(iArr, 0, this.f2112j, 0, i2);
                System.arraycopy(objArr, 0, this.f2113k, 0, i2 << 1);
            }
            m39530e(iArr, objArr, i2);
        }
        if (this.f2114l == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f2114l;
        if (i > 0) {
            int[] iArr = this.f2112j;
            Object[] objArr = this.f2113k;
            this.f2112j = C0628c.f2133a;
            this.f2113k = C0628c.f2135c;
            this.f2114l = 0;
            m39530e(iArr, objArr, i);
        }
        if (this.f2114l <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        return m39528g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m39526i(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
            if (size() != simpleArrayMap.size()) {
                return false;
            }
            for (int i = 0; i < this.f2114l; i++) {
                try {
                    K m39525j = m39525j(i);
                    V m39521n = m39521n(i);
                    Object obj2 = simpleArrayMap.get(m39525j);
                    if (m39521n == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(m39525j)) {
                            return false;
                        }
                    } else if (!m39521n.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2114l; i2++) {
                try {
                    K m39525j2 = m39525j(i2);
                    V m39521n2 = m39521n(i2);
                    Object obj3 = map.get(m39525j2);
                    if (m39521n2 == null) {
                        if (obj3 != null || !map.containsKey(m39525j2)) {
                            return false;
                        }
                    } else if (!m39521n2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    int m39529f(Object obj, int i) {
        int i2 = this.f2114l;
        if (i2 == 0) {
            return -1;
        }
        int m39532b = m39532b(this.f2112j, i2, i);
        if (m39532b < 0) {
            return m39532b;
        }
        if (obj.equals(this.f2113k[m39532b << 1])) {
            return m39532b;
        }
        int i3 = m39532b + 1;
        while (i3 < i2 && this.f2112j[i3] == i) {
            if (obj.equals(this.f2113k[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m39532b - 1; i4 >= 0 && this.f2112j[i4] == i; i4--) {
            if (obj.equals(this.f2113k[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: g */
    public int m39528g(Object obj) {
        return obj == null ? m39527h() : m39529f(obj, obj.hashCode());
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int m39528g = m39528g(obj);
        if (m39528g >= 0) {
            return (V) this.f2113k[(m39528g << 1) + 1];
        }
        return v;
    }

    /* renamed from: h */
    int m39527h() {
        int i = this.f2114l;
        if (i == 0) {
            return -1;
        }
        int m39532b = m39532b(this.f2112j, i, 0);
        if (m39532b < 0) {
            return m39532b;
        }
        if (this.f2113k[m39532b << 1] == null) {
            return m39532b;
        }
        int i2 = m39532b + 1;
        while (i2 < i && this.f2112j[i2] == 0) {
            if (this.f2113k[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m39532b - 1; i3 >= 0 && this.f2112j[i3] == 0; i3--) {
            if (this.f2113k[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f2112j;
        Object[] objArr = this.f2113k;
        int i = this.f2114l;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public int m39526i(Object obj) {
        int i = this.f2114l * 2;
        Object[] objArr = this.f2113k;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f2114l <= 0;
    }

    /* renamed from: j */
    public K m39525j(int i) {
        return (K) this.f2113k[i << 1];
    }

    /* renamed from: k */
    public void m39524k(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i = simpleArrayMap.f2114l;
        m39531c(this.f2114l + i);
        if (this.f2114l == 0) {
            if (i > 0) {
                System.arraycopy(simpleArrayMap.f2112j, 0, this.f2112j, 0, i);
                System.arraycopy(simpleArrayMap.f2113k, 0, this.f2113k, 0, i << 1);
                this.f2114l = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(simpleArrayMap.m39525j(i2), simpleArrayMap.m39521n(i2));
        }
    }

    /* renamed from: l */
    public V m39523l(int i) {
        Object[] objArr = this.f2113k;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f2114l;
        int i4 = 0;
        if (i3 <= 1) {
            m39530e(this.f2112j, objArr, i3);
            this.f2112j = C0628c.f2133a;
            this.f2113k = C0628c.f2135c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f2112j;
            int i6 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m39533a(i6);
                if (i3 == this.f2114l) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f2112j, 0, i);
                        System.arraycopy(objArr, 0, this.f2113k, 0, i2);
                    }
                    if (i < i5) {
                        int i7 = i + 1;
                        int i8 = i5 - i;
                        System.arraycopy(iArr, i7, this.f2112j, i, i8);
                        System.arraycopy(objArr, i7 << 1, this.f2113k, i2, i8 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, iArr, i, i10);
                    Object[] objArr2 = this.f2113k;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i2, i10 << 1);
                }
                Object[] objArr3 = this.f2113k;
                int i11 = i5 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 == this.f2114l) {
            this.f2114l = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: m */
    public V m39522m(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f2113k;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: n */
    public V m39521n(int i) {
        return (V) this.f2113k[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int m39529f;
        int i2 = this.f2114l;
        if (k == null) {
            m39529f = m39527h();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m39529f = m39529f(k, hashCode);
        }
        if (m39529f >= 0) {
            int i3 = (m39529f << 1) + 1;
            Object[] objArr = this.f2113k;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~m39529f;
        int[] iArr = this.f2112j;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f2113k;
            m39533a(i5);
            if (i2 == this.f2114l) {
                int[] iArr2 = this.f2112j;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f2113k, 0, objArr2.length);
                }
                m39530e(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.f2112j;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f2113k;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f2114l - i4) << 1);
        }
        int i7 = this.f2114l;
        if (i2 == i7) {
            int[] iArr4 = this.f2112j;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f2113k;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f2114l = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    public V remove(Object obj) {
        int m39528g = m39528g(obj);
        if (m39528g >= 0) {
            return m39523l(m39528g);
        }
        return null;
    }

    public V replace(K k, V v) {
        int m39528g = m39528g(k);
        if (m39528g >= 0) {
            return m39522m(m39528g, v);
        }
        return null;
    }

    public int size() {
        return this.f2114l;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2114l * 28);
        sb2.append('{');
        for (int i = 0; i < this.f2114l; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            K m39525j = m39525j(i);
            if (m39525j != this) {
                sb2.append(m39525j);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V m39521n = m39521n(i);
            if (m39521n != this) {
                sb2.append(m39521n);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int m39528g = m39528g(obj);
        if (m39528g >= 0) {
            V m39521n = m39521n(m39528g);
            if (obj2 == m39521n || (obj2 != null && obj2.equals(m39521n))) {
                m39523l(m39528g);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int m39528g = m39528g(k);
        if (m39528g >= 0) {
            V m39521n = m39521n(m39528g);
            if (m39521n == v || (v != null && v.equals(m39521n))) {
                m39522m(m39528g, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.f2112j = C0628c.f2133a;
            this.f2113k = C0628c.f2135c;
        } else {
            m39533a(i);
        }
        this.f2114l = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != 0) {
            m39524k(simpleArrayMap);
        }
    }
}