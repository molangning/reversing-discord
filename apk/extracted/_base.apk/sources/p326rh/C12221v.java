package p326rh;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;
import p326rh.C12185h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rh.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12221v<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: j */
    private final int f31786j;

    /* renamed from: k */
    private List<C12221v<K, V>.C12226c> f31787k;

    /* renamed from: l */
    private Map<K, V> f31788l;

    /* renamed from: m */
    private boolean f31789m;

    /* renamed from: n */
    private volatile C12221v<K, V>.C12228e f31790n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* renamed from: rh.v$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12222a<FieldDescriptorType> extends C12221v<FieldDescriptorType, Object> {
        C12222a(int i) {
            super(i, null);
        }

        @Override // p326rh.C12221v
        /* renamed from: n */
        public void mo5711n() {
            if (!m5715m()) {
                for (int i = 0; i < m5718j(); i++) {
                    Map.Entry<FieldDescriptorType, Object> m5719i = m5719i(i);
                    if (((C12185h.InterfaceC12187b) m5719i.getKey()).mo5808u()) {
                        m5719i.setValue(Collections.unmodifiableList((List) m5719i.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m5717k()) {
                    if (((C12185h.InterfaceC12187b) entry.getKey()).mo5808u()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo5711n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m5713p((C12185h.InterfaceC12187b) obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rh.v$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12223b {

        /* renamed from: a */
        private static final Iterator<Object> f31791a = new C12224a();

        /* renamed from: b */
        private static final Iterable<Object> f31792b = new C12225b();

        /* renamed from: rh.v$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C12224a implements Iterator<Object>, p164j$.util.Iterator {
            C12224a() {
            }

            @Override // p164j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, p164j$.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator, p164j$.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator, p164j$.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: rh.v$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C12225b implements Iterable<Object> {
            C12225b() {
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<Object> iterator() {
                return C12223b.f31791a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m5709b() {
            return (Iterable<T>) f31792b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rh.v$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C12226c implements Comparable<C12221v<K, V>.C12226c>, Map.Entry<K, V> {

        /* renamed from: j */
        private final K f31793j;

        /* renamed from: k */
        private V f31794k;

        C12226c(C12221v c12221v, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        private boolean m5707b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C12221v<K, V>.C12226c c12226c) {
            return getKey().compareTo(c12226c.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: c */
        public K getKey() {
            return this.f31793j;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (m5707b(this.f31793j, entry.getKey()) && m5707b(this.f31794k, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f31794k;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f31793j;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f31794k;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C12221v.this.m5721g();
            V v2 = this.f31794k;
            this.f31794k = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f31793j);
            String valueOf2 = String.valueOf(this.f31794k);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append("=");
            sb2.append(valueOf2);
            return sb2.toString();
        }

        C12226c(K k, V v) {
            this.f31793j = k;
            this.f31794k = v;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rh.v$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C12228e extends AbstractSet<Map.Entry<K, V>> {
        private C12228e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                C12221v.this.m5713p(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C12221v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C12221v.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C12227d(C12221v.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                C12221v.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C12221v.this.size();
        }

        /* synthetic */ C12228e(C12221v c12221v, C12222a c12222a) {
            this();
        }
    }

    /* synthetic */ C12221v(int i, C12222a c12222a) {
        this(i);
    }

    /* renamed from: f */
    private int m5722f(K k) {
        int size = this.f31787k.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f31787k.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f31787k.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 > 0) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m5721g() {
        if (!this.f31789m) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    private void m5720h() {
        m5721g();
        if (this.f31787k.isEmpty() && !(this.f31787k instanceof ArrayList)) {
            this.f31787k = new ArrayList(this.f31786j);
        }
    }

    /* renamed from: l */
    private SortedMap<K, V> m5716l() {
        m5721g();
        if (this.f31788l.isEmpty() && !(this.f31788l instanceof TreeMap)) {
            this.f31788l = new TreeMap();
        }
        return (SortedMap) this.f31788l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static <FieldDescriptorType extends C12185h.InterfaceC12187b<FieldDescriptorType>> C12221v<FieldDescriptorType, Object> m5714o(int i) {
        return new C12222a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public V m5712q(int i) {
        m5721g();
        V value = this.f31787k.remove(i).getValue();
        if (!this.f31788l.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = m5716l().entrySet().iterator();
            this.f31787k.add(new C12226c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m5721g();
        if (!this.f31787k.isEmpty()) {
            this.f31787k.clear();
        }
        if (!this.f31788l.isEmpty()) {
            this.f31788l.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m5722f(comparable) < 0 && !this.f31788l.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f31790n == null) {
            this.f31790n = new C12228e(this, null);
        }
        return this.f31790n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m5722f = m5722f(comparable);
        if (m5722f >= 0) {
            return this.f31787k.get(m5722f).getValue();
        }
        return this.f31788l.get(comparable);
    }

    /* renamed from: i */
    public Map.Entry<K, V> m5719i(int i) {
        return this.f31787k.get(i);
    }

    /* renamed from: j */
    public int m5718j() {
        return this.f31787k.size();
    }

    /* renamed from: k */
    public Iterable<Map.Entry<K, V>> m5717k() {
        return this.f31788l.isEmpty() ? C12223b.m5709b() : this.f31788l.entrySet();
    }

    /* renamed from: m */
    public boolean m5715m() {
        return this.f31789m;
    }

    /* renamed from: n */
    public void mo5711n() {
        Map<K, V> unmodifiableMap;
        if (!this.f31789m) {
            if (this.f31788l.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f31788l);
            }
            this.f31788l = unmodifiableMap;
            this.f31789m = true;
        }
    }

    /* renamed from: p */
    public V m5713p(K k, V v) {
        m5721g();
        int m5722f = m5722f(k);
        if (m5722f >= 0) {
            return this.f31787k.get(m5722f).setValue(v);
        }
        m5720h();
        int i = -(m5722f + 1);
        if (i >= this.f31786j) {
            return m5716l().put(k, v);
        }
        int size = this.f31787k.size();
        int i2 = this.f31786j;
        if (size == i2) {
            C12221v<K, V>.C12226c remove = this.f31787k.remove(i2 - 1);
            m5716l().put((K) remove.getKey(), remove.getValue());
        }
        this.f31787k.add(i, new C12226c(k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m5721g();
        Comparable comparable = (Comparable) obj;
        int m5722f = m5722f(comparable);
        if (m5722f >= 0) {
            return (V) m5712q(m5722f);
        }
        if (this.f31788l.isEmpty()) {
            return null;
        }
        return this.f31788l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f31787k.size() + this.f31788l.size();
    }

    /* renamed from: rh.v$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private class C12227d implements java.util.Iterator<Map.Entry<K, V>>, p164j$.util.Iterator {

        /* renamed from: j */
        private int f31796j;

        /* renamed from: k */
        private boolean f31797k;

        /* renamed from: l */
        private java.util.Iterator<Map.Entry<K, V>> f31798l;

        private C12227d() {
            this.f31796j = -1;
        }

        /* renamed from: a */
        private java.util.Iterator<Map.Entry<K, V>> m5705a() {
            if (this.f31798l == null) {
                this.f31798l = C12221v.this.f31788l.entrySet().iterator();
            }
            return this.f31798l;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f31797k = true;
            int i = this.f31796j + 1;
            this.f31796j = i;
            if (i < C12221v.this.f31787k.size()) {
                return (Map.Entry) C12221v.this.f31787k.get(this.f31796j);
            }
            return m5705a().next();
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
            return this.f31796j + 1 < C12221v.this.f31787k.size() || m5705a().hasNext();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            if (this.f31797k) {
                this.f31797k = false;
                C12221v.this.m5721g();
                if (this.f31796j < C12221v.this.f31787k.size()) {
                    C12221v c12221v = C12221v.this;
                    int i = this.f31796j;
                    this.f31796j = i - 1;
                    c12221v.m5712q(i);
                    return;
                }
                m5705a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ C12227d(C12221v c12221v, C12222a c12222a) {
            this();
        }
    }

    private C12221v(int i) {
        this.f31786j = i;
        this.f31787k = Collections.emptyList();
        this.f31788l = Collections.emptyMap();
    }
}
