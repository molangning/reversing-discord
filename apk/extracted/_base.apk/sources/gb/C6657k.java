package gb;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p102fb.C6377g;
import p102fb.C6378h;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;
import p177jb.C8891c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gb.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6657k<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: s */
    private static final Object f18830s = new Object();

    /* renamed from: j */
    private transient Object f18831j;

    /* renamed from: k */
    transient int[] f18832k;

    /* renamed from: l */
    transient Object[] f18833l;

    /* renamed from: m */
    transient Object[] f18834m;

    /* renamed from: n */
    private transient int f18835n;

    /* renamed from: o */
    private transient int f18836o;

    /* renamed from: p */
    private transient Set<K> f18837p;

    /* renamed from: q */
    private transient Set<Map.Entry<K, V>> f18838q;

    /* renamed from: r */
    private transient Collection<V> f18839r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6658a extends C6657k<K, V>.AbstractC6662e<K> {
        C6658a() {
            super(C6657k.this, null);
        }

        @Override // gb.C6657k.AbstractC6662e
        /* renamed from: b */
        K mo22195b(int i) {
            return (K) C6657k.this.f18833l[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6659b extends C6657k<K, V>.AbstractC6662e<Map.Entry<K, V>> {
        C6659b() {
            super(C6657k.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // gb.C6657k.AbstractC6662e
        /* renamed from: e */
        public Map.Entry<K, V> mo22195b(int i) {
            return new C6664g(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6660c extends C6657k<K, V>.AbstractC6662e<V> {
        C6660c() {
            super(C6657k.this, null);
        }

        @Override // gb.C6657k.AbstractC6662e
        /* renamed from: b */
        V mo22195b(int i) {
            return (V) C6657k.this.f18834m[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.k$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6661d extends AbstractSet<Map.Entry<K, V>> {
        C6661d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6657k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> m22205s = C6657k.this.m22205s();
            if (m22205s != null) {
                return m22205s.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int m22199y = C6657k.this.m22199y(entry.getKey());
            if (m22199y == -1 || !C6377g.m22845a(C6657k.this.f18834m[m22199y], entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return C6657k.this.m22204t();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> m22205s = C6657k.this.m22205s();
            if (m22205s != null) {
                return m22205s.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C6657k.this.m22229D()) {
                return false;
            }
            int m22201w = C6657k.this.m22201w();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = C6657k.this.f18831j;
            C6657k c6657k = C6657k.this;
            int m22183f = C6667l.m22183f(key, value, m22201w, obj2, c6657k.f18832k, c6657k.f18833l, c6657k.f18834m);
            if (m22183f == -1) {
                return false;
            }
            C6657k.this.m22230C(m22183f, m22201w);
            C6657k.m22216h(C6657k.this);
            C6657k.this.m22200x();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6657k.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.k$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6663f extends AbstractSet<K> {
        C6663f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6657k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C6657k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C6657k.this.m22231B();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> m22205s = C6657k.this.m22205s();
            if (m22205s != null) {
                return m22205s.keySet().remove(obj);
            }
            if (C6657k.this.m22228E(obj) != C6657k.f18830s) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6657k.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.k$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C6664g extends AbstractC6635e<K, V> {

        /* renamed from: j */
        private final K f18849j;

        /* renamed from: k */
        private int f18850k;

        C6664g(int i) {
            this.f18849j = (K) C6657k.this.f18833l[i];
            this.f18850k = i;
        }

        /* renamed from: a */
        private void m22193a() {
            int i = this.f18850k;
            if (i == -1 || i >= C6657k.this.size() || !C6377g.m22845a(this.f18849j, C6657k.this.f18833l[this.f18850k])) {
                this.f18850k = C6657k.this.m22199y(this.f18849j);
            }
        }

        @Override // gb.AbstractC6635e, java.util.Map.Entry
        public K getKey() {
            return this.f18849j;
        }

        @Override // gb.AbstractC6635e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> m22205s = C6657k.this.m22205s();
            if (m22205s != null) {
                return m22205s.get(this.f18849j);
            }
            m22193a();
            int i = this.f18850k;
            if (i == -1) {
                return null;
            }
            return (V) C6657k.this.f18834m[i];
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            Map<K, V> m22205s = C6657k.this.m22205s();
            if (m22205s != null) {
                return m22205s.put(this.f18849j, v);
            }
            m22193a();
            int i = this.f18850k;
            if (i == -1) {
                C6657k.this.put(this.f18849j, v);
                return null;
            }
            Object[] objArr = C6657k.this.f18834m;
            V v2 = (V) objArr[i];
            objArr[i] = v;
            return v2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.k$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6665h extends AbstractCollection<V> {
        C6665h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C6657k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C6657k.this.m22223J();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C6657k.this.size();
        }
    }

    C6657k() {
        m22198z(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public Object m22228E(Object obj) {
        if (m22229D()) {
            return f18830s;
        }
        int m22201w = m22201w();
        int m22183f = C6667l.m22183f(obj, null, m22201w, this.f18831j, this.f18832k, this.f18833l, null);
        if (m22183f == -1) {
            return f18830s;
        }
        Object obj2 = this.f18834m[m22183f];
        m22230C(m22183f, m22201w);
        this.f18836o--;
        m22200x();
        return obj2;
    }

    /* renamed from: G */
    private void m22226G(int i) {
        int min;
        int length = this.f18832k.length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            m22227F(min);
        }
    }

    /* renamed from: H */
    private int m22225H(int i, int i2, int i3, int i4) {
        Object m22188a = C6667l.m22188a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C6667l.m22180i(m22188a, i3 & i5, i4 + 1);
        }
        Object obj = this.f18831j;
        int[] iArr = this.f18832k;
        for (int i6 = 0; i6 <= i; i6++) {
            int m22181h = C6667l.m22181h(obj, i6);
            while (m22181h != 0) {
                int i7 = m22181h - 1;
                int i8 = iArr[i7];
                int m22187b = C6667l.m22187b(i8, i) | i6;
                int i9 = m22187b & i5;
                int m22181h2 = C6667l.m22181h(m22188a, i9);
                C6667l.m22180i(m22188a, i9, m22181h);
                iArr[i7] = C6667l.m22185d(m22187b, m22181h2, i5);
                m22181h = C6667l.m22186c(i8, i);
            }
        }
        this.f18831j = m22188a;
        m22224I(i5);
        return i5;
    }

    /* renamed from: I */
    private void m22224I(int i) {
        this.f18835n = C6667l.m22185d(this.f18835n, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* renamed from: h */
    static /* synthetic */ int m22216h(C6657k c6657k) {
        int i = c6657k.f18836o;
        c6657k.f18836o = i - 1;
        return i;
    }

    /* renamed from: m */
    public static <K, V> C6657k<K, V> m22211m() {
        return new C6657k<>();
    }

    /* renamed from: r */
    public static <K, V> C6657k<K, V> m22206r(int i) {
        return new C6657k<>(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public int m22201w() {
        return (1 << (this.f18835n & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public int m22199y(Object obj) {
        if (m22229D()) {
            return -1;
        }
        int m22156c = C6681p.m22156c(obj);
        int m22201w = m22201w();
        int m22181h = C6667l.m22181h(this.f18831j, m22156c & m22201w);
        if (m22181h == 0) {
            return -1;
        }
        int m22187b = C6667l.m22187b(m22156c, m22201w);
        do {
            int i = m22181h - 1;
            int i2 = this.f18832k[i];
            if (C6667l.m22187b(i2, m22201w) == m22187b && C6377g.m22845a(obj, this.f18833l[i])) {
                return i;
            }
            m22181h = C6667l.m22186c(i2, m22201w);
        } while (m22181h != 0);
        return -1;
    }

    /* renamed from: A */
    void m22232A(int i, K k, V v, int i2, int i3) {
        this.f18832k[i] = C6667l.m22185d(i2, 0, i3);
        this.f18833l[i] = k;
        this.f18834m[i] = v;
    }

    /* renamed from: B */
    Iterator<K> m22231B() {
        Map<K, V> m22205s = m22205s();
        if (m22205s != null) {
            return m22205s.keySet().iterator();
        }
        return new C6658a();
    }

    /* renamed from: C */
    void m22230C(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f18833l;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f18834m;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f18832k;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int m22156c = C6681p.m22156c(obj) & i2;
            int m22181h = C6667l.m22181h(this.f18831j, m22156c);
            int i3 = size + 1;
            if (m22181h == i3) {
                C6667l.m22180i(this.f18831j, m22156c, i + 1);
                return;
            }
            while (true) {
                int i4 = m22181h - 1;
                int i5 = this.f18832k[i4];
                int m22186c = C6667l.m22186c(i5, i2);
                if (m22186c == i3) {
                    this.f18832k[i4] = C6667l.m22185d(i5, i + 1, i2);
                    return;
                }
                m22181h = m22186c;
            }
        } else {
            this.f18833l[i] = null;
            this.f18834m[i] = null;
            this.f18832k[i] = 0;
        }
    }

    /* renamed from: D */
    boolean m22229D() {
        return this.f18831j == null;
    }

    /* renamed from: F */
    void m22227F(int i) {
        this.f18832k = Arrays.copyOf(this.f18832k, i);
        this.f18833l = Arrays.copyOf(this.f18833l, i);
        this.f18834m = Arrays.copyOf(this.f18834m, i);
    }

    /* renamed from: J */
    Iterator<V> m22223J() {
        Map<K, V> m22205s = m22205s();
        if (m22205s != null) {
            return m22205s.values().iterator();
        }
        return new C6660c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m22229D()) {
            return;
        }
        m22200x();
        if (m22205s() != null) {
            this.f18835n = C8891c.m17076e(size(), 3, 1073741823);
            this.f18831j = null;
            this.f18836o = 0;
            return;
        }
        Arrays.fill(this.f18833l, 0, this.f18836o, (Object) null);
        Arrays.fill(this.f18834m, 0, this.f18836o, (Object) null);
        C6667l.m22182g(this.f18831j);
        Arrays.fill(this.f18832k, 0, this.f18836o, 0);
        this.f18836o = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> m22205s = m22205s();
        if (m22205s != null) {
            return m22205s.containsKey(obj);
        }
        if (m22199y(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> m22205s = m22205s();
        if (m22205s != null) {
            return m22205s.containsValue(obj);
        }
        for (int i = 0; i < this.f18836o; i++) {
            if (C6377g.m22845a(obj, this.f18834m[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f18838q;
        if (set == null) {
            Set<Map.Entry<K, V>> m22210n = m22210n();
            this.f18838q = m22210n;
            return m22210n;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> m22205s = m22205s();
        if (m22205s != null) {
            return m22205s.get(obj);
        }
        int m22199y = m22199y(obj);
        if (m22199y == -1) {
            return null;
        }
        m22215i(m22199y);
        return (V) this.f18834m[m22199y];
    }

    /* renamed from: i */
    void m22215i(int i) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    int m22214j(int i, int i2) {
        return i - 1;
    }

    /* renamed from: k */
    int m22213k() {
        C6378h.m22828p(m22229D(), "Arrays already allocated");
        int i = this.f18835n;
        int m22179j = C6667l.m22179j(i);
        this.f18831j = C6667l.m22188a(m22179j);
        m22224I(m22179j - 1);
        this.f18832k = new int[i];
        this.f18833l = new Object[i];
        this.f18834m = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f18837p;
        if (set == null) {
            Set<K> m22208p = m22208p();
            this.f18837p = m22208p;
            return m22208p;
        }
        return set;
    }

    /* renamed from: l */
    Map<K, V> m22212l() {
        Map<K, V> m22209o = m22209o(m22201w() + 1);
        int m22203u = m22203u();
        while (m22203u >= 0) {
            m22209o.put((K) this.f18833l[m22203u], (V) this.f18834m[m22203u]);
            m22203u = m22202v(m22203u);
        }
        this.f18831j = m22209o;
        this.f18832k = null;
        this.f18833l = null;
        this.f18834m = null;
        m22200x();
        return m22209o;
    }

    /* renamed from: n */
    Set<Map.Entry<K, V>> m22210n() {
        return new C6661d();
    }

    /* renamed from: o */
    Map<K, V> m22209o(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    /* renamed from: p */
    Set<K> m22208p() {
        return new C6663f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        int m22225H;
        int i;
        if (m22229D()) {
            m22213k();
        }
        Map<K, V> m22205s = m22205s();
        if (m22205s != null) {
            return m22205s.put(k, v);
        }
        int[] iArr = this.f18832k;
        Object[] objArr = this.f18833l;
        Object[] objArr2 = this.f18834m;
        int i2 = this.f18836o;
        int i3 = i2 + 1;
        int m22156c = C6681p.m22156c(k);
        int m22201w = m22201w();
        int i4 = m22156c & m22201w;
        int m22181h = C6667l.m22181h(this.f18831j, i4);
        if (m22181h == 0) {
            if (i3 > m22201w) {
                m22225H = m22225H(m22201w, C6667l.m22184e(m22201w), m22156c, i2);
                i = m22225H;
            } else {
                C6667l.m22180i(this.f18831j, i4, i3);
                i = m22201w;
            }
        } else {
            int m22187b = C6667l.m22187b(m22156c, m22201w);
            int i5 = 0;
            while (true) {
                int i6 = m22181h - 1;
                int i7 = iArr[i6];
                if (C6667l.m22187b(i7, m22201w) == m22187b && C6377g.m22845a(k, objArr[i6])) {
                    V v2 = (V) objArr2[i6];
                    objArr2[i6] = v;
                    m22215i(i6);
                    return v2;
                }
                int m22186c = C6667l.m22186c(i7, m22201w);
                i5++;
                if (m22186c == 0) {
                    if (i5 >= 9) {
                        return m22212l().put(k, v);
                    }
                    if (i3 > m22201w) {
                        m22225H = m22225H(m22201w, C6667l.m22184e(m22201w), m22156c, i2);
                    } else {
                        iArr[i6] = C6667l.m22185d(i7, i3, m22201w);
                    }
                } else {
                    m22181h = m22186c;
                }
            }
        }
        m22226G(i3);
        m22232A(i2, k, v, m22156c, i);
        this.f18836o = i3;
        m22200x();
        return null;
    }

    /* renamed from: q */
    Collection<V> m22207q() {
        return new C6665h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> m22205s = m22205s();
        if (m22205s != null) {
            return m22205s.remove(obj);
        }
        V v = (V) m22228E(obj);
        if (v == f18830s) {
            return null;
        }
        return v;
    }

    /* renamed from: s */
    Map<K, V> m22205s() {
        Object obj = this.f18831j;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> m22205s = m22205s();
        if (m22205s != null) {
            return m22205s.size();
        }
        return this.f18836o;
    }

    /* renamed from: t */
    Iterator<Map.Entry<K, V>> m22204t() {
        Map<K, V> m22205s = m22205s();
        if (m22205s != null) {
            return m22205s.entrySet().iterator();
        }
        return new C6659b();
    }

    /* renamed from: u */
    int m22203u() {
        return isEmpty() ? -1 : 0;
    }

    /* renamed from: v */
    int m22202v(int i) {
        int i2 = i + 1;
        if (i2 < this.f18836o) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f18839r;
        if (collection == null) {
            Collection<V> m22207q = m22207q();
            this.f18839r = m22207q;
            return m22207q;
        }
        return collection;
    }

    /* renamed from: x */
    void m22200x() {
        this.f18835n += 32;
    }

    /* renamed from: z */
    void m22198z(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C6378h.m22839e(z, "Expected size must be >= 0");
        this.f18835n = C8891c.m17076e(i, 1, 1073741823);
    }

    C6657k(int i) {
        m22198z(i);
    }

    /* renamed from: gb.k$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private abstract class AbstractC6662e<T> implements Iterator<T>, p164j$.util.Iterator {

        /* renamed from: j */
        int f18844j;

        /* renamed from: k */
        int f18845k;

        /* renamed from: l */
        int f18846l;

        private AbstractC6662e() {
            this.f18844j = C6657k.this.f18835n;
            this.f18845k = C6657k.this.m22203u();
            this.f18846l = -1;
        }

        /* renamed from: a */
        private void m22196a() {
            if (C6657k.this.f18835n == this.f18844j) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        abstract T mo22195b(int i);

        /* renamed from: d */
        void m22194d() {
            this.f18844j += 32;
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f18845k >= 0;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            m22196a();
            if (hasNext()) {
                int i = this.f18845k;
                this.f18846l = i;
                T mo22195b = mo22195b(i);
                this.f18845k = C6657k.this.m22202v(this.f18845k);
                return mo22195b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            boolean z;
            m22196a();
            if (this.f18846l >= 0) {
                z = true;
            } else {
                z = false;
            }
            C6653i.m22244c(z);
            m22194d();
            C6657k c6657k = C6657k.this;
            c6657k.remove(c6657k.f18833l[this.f18846l]);
            this.f18845k = C6657k.this.m22214j(this.f18845k, this.f18846l);
            this.f18846l = -1;
        }

        /* synthetic */ AbstractC6662e(C6657k c6657k, C6658a c6658a) {
            this();
        }
    }
}
