package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p164j$.util.Iterator;
import p164j$.util.Map;
import p164j$.util.function.Consumer;

/* renamed from: androidx.collection.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0630e<K, V> {

    /* renamed from: a */
    AbstractC0630e<K, V>.C0632b f2141a;

    /* renamed from: b */
    AbstractC0630e<K, V>.C0633c f2142b;

    /* renamed from: c */
    AbstractC0630e<K, V>.C0635e f2143c;

    /* renamed from: androidx.collection.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    final class C0631a<T> implements Iterator<T>, p164j$.util.Iterator {

        /* renamed from: j */
        final int f2144j;

        /* renamed from: k */
        int f2145k;

        /* renamed from: l */
        int f2146l;

        /* renamed from: m */
        boolean f2147m = false;

        C0631a(int i) {
            AbstractC0630e.this = r2;
            this.f2144j = i;
            this.f2145k = r2.mo39476d();
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
            return this.f2146l < this.f2145k;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC0630e.this.mo39478b(this.f2146l, this.f2144j);
                this.f2146l++;
                this.f2147m = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            if (this.f2147m) {
                int i = this.f2146l - 1;
                this.f2146l = i;
                this.f2145k--;
                this.f2147m = false;
                AbstractC0630e.this.mo39472h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.collection.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C0632b implements Set<Map.Entry<K, V>> {
        C0632b() {
            AbstractC0630e.this = r1;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo39476d = AbstractC0630e.this.mo39476d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0630e.this.mo39473g(entry.getKey(), entry.getValue());
            }
            if (mo39476d != AbstractC0630e.this.mo39476d()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0630e.this.mo39479a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo39475e = AbstractC0630e.this.mo39475e(entry.getKey());
            if (mo39475e < 0) {
                return false;
            }
            return C0628c.m39497c(AbstractC0630e.this.mo39478b(mo39475e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0630e.m39469k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int i = 0;
            for (int mo39476d = AbstractC0630e.this.mo39476d() - 1; mo39476d >= 0; mo39476d--) {
                Object mo39478b = AbstractC0630e.this.mo39478b(mo39476d, 0);
                Object mo39478b2 = AbstractC0630e.this.mo39478b(mo39476d, 1);
                if (mo39478b == null) {
                    hashCode = 0;
                } else {
                    hashCode = mo39478b.hashCode();
                }
                if (mo39478b2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = mo39478b2.hashCode();
                }
                i += hashCode ^ hashCode2;
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0630e.this.mo39476d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C0634d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0630e.this.mo39476d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.collection.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C0633c implements Set<K> {
        C0633c() {
            AbstractC0630e.this = r1;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0630e.this.mo39479a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0630e.this.mo39475e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0630e.m39470j(AbstractC0630e.this.mo39477c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0630e.m39469k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i = 0;
            for (int mo39476d = AbstractC0630e.this.mo39476d() - 1; mo39476d >= 0; mo39476d--) {
                Object mo39478b = AbstractC0630e.this.mo39478b(mo39476d, 0);
                if (mo39478b == null) {
                    hashCode = 0;
                } else {
                    hashCode = mo39478b.hashCode();
                }
                i += hashCode;
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0630e.this.mo39476d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
            return new C0631a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo39475e = AbstractC0630e.this.mo39475e(obj);
            if (mo39475e >= 0) {
                AbstractC0630e.this.mo39472h(mo39475e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0630e.m39465o(AbstractC0630e.this.mo39477c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0630e.m39464p(AbstractC0630e.this.mo39477c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0630e.this.mo39476d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0630e.this.m39463q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0630e.this.m39462r(tArr, 0);
        }
    }

    /* renamed from: androidx.collection.e$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    final class C0634d implements java.util.Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, p164j$.util.Iterator, Map.Entry {

        /* renamed from: j */
        int f2151j;

        /* renamed from: l */
        boolean f2153l = false;

        /* renamed from: k */
        int f2152k = -1;

        C0634d() {
            AbstractC0630e.this = r2;
            this.f2151j = r2.mo39476d() - 1;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f2152k++;
                this.f2153l = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry, p164j$.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f2153l) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!C0628c.m39497c(entry.getKey(), AbstractC0630e.this.mo39478b(this.f2152k, 0)) || !C0628c.m39497c(entry.getValue(), AbstractC0630e.this.mo39478b(this.f2152k, 1))) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Map.Entry, p164j$.util.Map.Entry
        public K getKey() {
            if (this.f2153l) {
                return (K) AbstractC0630e.this.mo39478b(this.f2152k, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry, p164j$.util.Map.Entry
        public V getValue() {
            if (this.f2153l) {
                return (V) AbstractC0630e.this.mo39478b(this.f2152k, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f2152k < this.f2151j;
        }

        @Override // java.util.Map.Entry, p164j$.util.Map.Entry
        public int hashCode() {
            int hashCode;
            if (this.f2153l) {
                int i = 0;
                Object mo39478b = AbstractC0630e.this.mo39478b(this.f2152k, 0);
                Object mo39478b2 = AbstractC0630e.this.mo39478b(this.f2152k, 1);
                if (mo39478b == null) {
                    hashCode = 0;
                } else {
                    hashCode = mo39478b.hashCode();
                }
                if (mo39478b2 != null) {
                    i = mo39478b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            if (this.f2153l) {
                AbstractC0630e.this.mo39472h(this.f2152k);
                this.f2152k--;
                this.f2151j--;
                this.f2153l = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry, p164j$.util.Map.Entry
        public V setValue(V v) {
            if (this.f2153l) {
                return (V) AbstractC0630e.this.mo39471i(this.f2152k, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: androidx.collection.e$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C0635e implements Collection<V> {
        C0635e() {
            AbstractC0630e.this = r1;
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0630e.this.mo39479a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0630e.this.mo39474f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0630e.this.mo39476d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return new C0631a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo39474f = AbstractC0630e.this.mo39474f(obj);
            if (mo39474f >= 0) {
                AbstractC0630e.this.mo39472h(mo39474f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo39476d = AbstractC0630e.this.mo39476d();
            int i = 0;
            boolean z = false;
            while (i < mo39476d) {
                if (collection.contains(AbstractC0630e.this.mo39478b(i, 1))) {
                    AbstractC0630e.this.mo39472h(i);
                    i--;
                    mo39476d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo39476d = AbstractC0630e.this.mo39476d();
            int i = 0;
            boolean z = false;
            while (i < mo39476d) {
                if (!collection.contains(AbstractC0630e.this.mo39478b(i, 1))) {
                    AbstractC0630e.this.mo39472h(i);
                    i--;
                    mo39476d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0630e.this.mo39476d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0630e.this.m39463q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0630e.this.m39462r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m39470j(java.util.Map<K, V> map, Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m39469k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m39465o(java.util.Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static <K, V> boolean m39464p(java.util.Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract void mo39479a();

    /* renamed from: b */
    protected abstract Object mo39478b(int i, int i2);

    /* renamed from: c */
    protected abstract java.util.Map<K, V> mo39477c();

    /* renamed from: d */
    protected abstract int mo39476d();

    /* renamed from: e */
    protected abstract int mo39475e(Object obj);

    /* renamed from: f */
    protected abstract int mo39474f(Object obj);

    /* renamed from: g */
    protected abstract void mo39473g(K k, V v);

    /* renamed from: h */
    protected abstract void mo39472h(int i);

    /* renamed from: i */
    protected abstract V mo39471i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m39468l() {
        if (this.f2141a == null) {
            this.f2141a = new C0632b();
        }
        return this.f2141a;
    }

    /* renamed from: m */
    public Set<K> m39467m() {
        if (this.f2142b == null) {
            this.f2142b = new C0633c();
        }
        return this.f2142b;
    }

    /* renamed from: n */
    public Collection<V> m39466n() {
        if (this.f2143c == null) {
            this.f2143c = new C0635e();
        }
        return this.f2143c;
    }

    /* renamed from: q */
    public Object[] m39463q(int i) {
        int mo39476d = mo39476d();
        Object[] objArr = new Object[mo39476d];
        for (int i2 = 0; i2 < mo39476d; i2++) {
            objArr[i2] = mo39478b(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public <T> T[] m39462r(T[] tArr, int i) {
        int mo39476d = mo39476d();
        if (tArr.length < mo39476d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo39476d));
        }
        for (int i2 = 0; i2 < mo39476d; i2++) {
            tArr[i2] = mo39478b(i2, i);
        }
        if (tArr.length > mo39476d) {
            tArr[mo39476d] = null;
        }
        return tArr;
    }
}