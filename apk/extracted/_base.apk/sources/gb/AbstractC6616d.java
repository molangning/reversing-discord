package gb;

import gb.AbstractC6643f;
import gb.C6607c0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p102fb.C6378h;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gb.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6616d<K, V> extends AbstractC6643f<K, V> implements Serializable {

    /* renamed from: n */
    private transient Map<K, Collection<V>> f18780n;

    /* renamed from: o */
    private transient int f18781o;

    /* renamed from: gb.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6617a extends AbstractC6616d<K, V>.AbstractC6622d<V> {
        C6617a() {
            super();
        }

        @Override // gb.AbstractC6616d.AbstractC6622d
        /* renamed from: a */
        V mo22289a(K k, V v) {
            return v;
        }
    }

    /* renamed from: gb.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6618b extends AbstractC6616d<K, V>.AbstractC6622d<Map.Entry<K, V>> {
        C6618b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // gb.AbstractC6616d.AbstractC6622d
        /* renamed from: b */
        public Map.Entry<K, V> mo22289a(K k, V v) {
            return C6607c0.m22326c(k, v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gb.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6619c extends C6607c0.AbstractC6615f<K, Collection<V>> {

        /* renamed from: l */
        final transient Map<K, Collection<V>> f18784l;

        /* renamed from: gb.d$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C6620a extends C6607c0.AbstractC6612c<K, Collection<V>> {
            C6620a() {
            }

            @Override // gb.C6607c0.AbstractC6612c
            /* renamed from: a */
            Map<K, Collection<V>> mo22291a() {
                return C6619c.this;
            }

            @Override // gb.C6607c0.AbstractC6612c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C6655j.m22238b(C6619c.this.f18784l.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C6621b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractC6616d.this.m22300w(((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: gb.d$c$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C6621b implements Iterator<Map.Entry<K, Collection<V>>>, p164j$.util.Iterator {

            /* renamed from: j */
            final Iterator<Map.Entry<K, Collection<V>>> f18787j;

            /* renamed from: k */
            Collection<V> f18788k;

            C6621b() {
                this.f18787j = C6619c.this.f18784l.entrySet().iterator();
            }

            @Override // java.util.Iterator, p164j$.util.Iterator
            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f18787j.next();
                this.f18788k = next.getValue();
                return C6619c.this.m22292f(next);
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
                return this.f18787j.hasNext();
            }

            @Override // java.util.Iterator, p164j$.util.Iterator
            public void remove() {
                boolean z;
                if (this.f18788k != null) {
                    z = true;
                } else {
                    z = false;
                }
                C6653i.m22244c(z);
                this.f18787j.remove();
                AbstractC6616d.this.f18781o -= this.f18788k.size();
                this.f18788k.clear();
                this.f18788k = null;
            }
        }

        C6619c(Map<K, Collection<V>> map) {
            this.f18784l = map;
        }

        @Override // gb.C6607c0.AbstractC6615f
        /* renamed from: a */
        protected Set<Map.Entry<K, Collection<V>>> mo22295a() {
            return new C6620a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) C6607c0.m22322g(this.f18784l, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC6616d.this.mo22298y(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f18784l == AbstractC6616d.this.f18780n) {
                AbstractC6616d.this.clear();
            } else {
                C6713y.m22054b(new C6621b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return C6607c0.m22323f(this.f18784l, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f18784l.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> mo22250r = AbstractC6616d.this.mo22250r();
            mo22250r.addAll(remove);
            AbstractC6616d.this.f18781o -= remove.size();
            remove.clear();
            return mo22250r;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f18784l.equals(obj);
        }

        /* renamed from: f */
        Map.Entry<K, Collection<V>> m22292f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C6607c0.m22326c(key, AbstractC6616d.this.mo22298y(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f18784l.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC6616d.this.m22254i();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f18784l.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f18784l.toString();
        }
    }

    /* renamed from: gb.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private abstract class AbstractC6622d<T> implements java.util.Iterator<T>, p164j$.util.Iterator {

        /* renamed from: j */
        final java.util.Iterator<Map.Entry<K, Collection<V>>> f18790j;

        /* renamed from: k */
        K f18791k = null;

        /* renamed from: l */
        Collection<V> f18792l = null;

        /* renamed from: m */
        java.util.Iterator<V> f18793m = C6713y.m22050f();

        AbstractC6622d() {
            this.f18790j = (java.util.Iterator<Map.Entry<K, V>>) AbstractC6616d.this.f18780n.entrySet().iterator();
        }

        /* renamed from: a */
        abstract T mo22289a(K k, V v);

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
            return this.f18790j.hasNext() || this.f18793m.hasNext();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            if (!this.f18793m.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f18790j.next();
                this.f18791k = next.getKey();
                Collection<V> value = next.getValue();
                this.f18792l = value;
                this.f18793m = value.iterator();
            }
            return mo22289a(this.f18791k, this.f18793m.next());
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            this.f18793m.remove();
            if (this.f18792l.isEmpty()) {
                this.f18790j.remove();
            }
            AbstractC6616d.m22306p(AbstractC6616d.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gb.d$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6623e extends C6607c0.C6613d<K, Collection<V>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gb.d$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C6624a implements java.util.Iterator<K>, p164j$.util.Iterator {

            /* renamed from: j */
            Map.Entry<K, Collection<V>> f18796j;

            /* renamed from: k */
            final /* synthetic */ java.util.Iterator f18797k;

            C6624a(java.util.Iterator it) {
                this.f18797k = it;
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
                return this.f18797k.hasNext();
            }

            @Override // java.util.Iterator, p164j$.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f18797k.next();
                this.f18796j = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator, p164j$.util.Iterator
            public void remove() {
                boolean z;
                if (this.f18796j != null) {
                    z = true;
                } else {
                    z = false;
                }
                C6653i.m22244c(z);
                Collection<V> value = this.f18796j.getValue();
                this.f18797k.remove();
                AbstractC6616d.this.f18781o -= value.size();
                value.clear();
                this.f18796j = null;
            }
        }

        C6623e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6713y.m22054b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return m22314a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || m22314a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return m22314a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            return new C6624a(m22314a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i;
            Collection<V> remove = m22314a().remove(obj);
            if (remove != null) {
                i = remove.size();
                remove.clear();
                AbstractC6616d.this.f18781o -= i;
            } else {
                i = 0;
            }
            if (i <= 0) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.d$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6625f extends AbstractC6616d<K, V>.C6628i implements NavigableMap<K, Collection<V>> {
        C6625f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo22275i().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return m22292f(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return mo22275i().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C6625f(mo22275i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo22275i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m22292f(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> floorEntry = mo22275i().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return m22292f(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return mo22275i().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> higherEntry = mo22275i().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return m22292f(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return mo22275i().higherKey(k);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // gb.AbstractC6616d.C6628i
        /* renamed from: j */
        public NavigableSet<K> mo22277g() {
            return new C6626g(mo22275i());
        }

        @Override // gb.AbstractC6616d.C6628i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: k */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        @Override // gb.AbstractC6616d.C6628i, gb.AbstractC6616d.C6619c, java.util.AbstractMap, java.util.Map
        /* renamed from: l */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo22275i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m22292f(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> lowerEntry = mo22275i().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return m22292f(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return mo22275i().lowerKey(k);
        }

        /* renamed from: m */
        Map.Entry<K, Collection<V>> m22285m(java.util.Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> mo22250r = AbstractC6616d.this.mo22250r();
            mo22250r.addAll(next.getValue());
            it.remove();
            return C6607c0.m22326c(next.getKey(), AbstractC6616d.this.mo22299x(mo22250r));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // gb.AbstractC6616d.C6628i
        /* renamed from: n */
        public NavigableMap<K, Collection<V>> mo22275i() {
            return (NavigableMap) super.mo22275i();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // gb.AbstractC6616d.C6628i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // gb.AbstractC6616d.C6628i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: p */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m22285m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m22285m(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C6625f(mo22275i().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C6625f(mo22275i().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C6625f(mo22275i().tailMap(k, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.d$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6626g extends AbstractC6616d<K, V>.C6629j implements NavigableSet<K> {
        C6626g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return mo22274d().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new C6626g(mo22274d().descendingMap());
        }

        @Override // gb.AbstractC6616d.C6629j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: e */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return mo22274d().floorKey(k);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // gb.AbstractC6616d.C6629j
        /* renamed from: h */
        public NavigableMap<K, Collection<V>> mo22274d() {
            return (NavigableMap) super.mo22274d();
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return mo22274d().higherKey(k);
        }

        @Override // gb.AbstractC6616d.C6629j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: i */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // gb.AbstractC6616d.C6629j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return mo22274d().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) C6713y.m22047i(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) C6713y.m22047i(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return new C6626g(mo22274d().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C6626g(mo22274d().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C6626g(mo22274d().tailMap(k, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gb.d$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6627h extends AbstractC6616d<K, V>.C6632l implements RandomAccess {
        C6627h(K k, List<V> list, AbstractC6616d<K, V>.C6630k c6630k) {
            super(k, list, c6630k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gb.d$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6628i extends AbstractC6616d<K, V>.C6619c implements SortedMap<K, Collection<V>> {

        /* renamed from: n */
        SortedSet<K> f18802n;

        C6628i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo22275i().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo22275i().firstKey();
        }

        /* renamed from: g */
        SortedSet<K> mo22277g() {
            return new C6629j(mo22275i());
        }

        @Override // gb.AbstractC6616d.C6619c, java.util.AbstractMap, java.util.Map
        /* renamed from: h */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f18802n;
            if (sortedSet == null) {
                SortedSet<K> mo22277g = mo22277g();
                this.f18802n = mo22277g;
                return mo22277g;
            }
            return sortedSet;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C6628i(mo22275i().headMap(k));
        }

        /* renamed from: i */
        SortedMap<K, Collection<V>> mo22275i() {
            return (SortedMap) this.f18784l;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo22275i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C6628i(mo22275i().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C6628i(mo22275i().tailMap(k));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gb.d$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6629j extends AbstractC6616d<K, V>.C6623e implements SortedSet<K> {
        C6629j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo22274d().comparator();
        }

        /* renamed from: d */
        SortedMap<K, Collection<V>> mo22274d() {
            return (SortedMap) super.m22314a();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo22274d().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C6629j(mo22274d().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo22274d().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C6629j(mo22274d().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C6629j(mo22274d().tailMap(k));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6616d(Map<K, Collection<V>> map) {
        C6378h.m22840d(map.isEmpty());
        this.f18780n = map;
    }

    /* renamed from: o */
    static /* synthetic */ int m22307o(AbstractC6616d abstractC6616d) {
        int i = abstractC6616d.f18781o;
        abstractC6616d.f18781o = i + 1;
        return i;
    }

    /* renamed from: p */
    static /* synthetic */ int m22306p(AbstractC6616d abstractC6616d) {
        int i = abstractC6616d.f18781o;
        abstractC6616d.f18781o = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static <E> java.util.Iterator<E> m22301v(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m22300w(Object obj) {
        Collection collection = (Collection) C6607c0.m22321h(this.f18780n, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f18781o -= size;
        }
    }

    @Override // gb.AbstractC6643f, gb.InterfaceC6634d0
    /* renamed from: a */
    public Collection<Map.Entry<K, V>> mo22096a() {
        return super.mo22096a();
    }

    @Override // gb.InterfaceC6634d0
    public void clear() {
        for (Collection<V> collection : this.f18780n.values()) {
            collection.clear();
        }
        this.f18780n.clear();
        this.f18781o = 0;
    }

    @Override // gb.AbstractC6643f
    /* renamed from: e */
    Collection<Map.Entry<K, V>> mo22092e() {
        return new AbstractC6643f.C6644a();
    }

    @Override // gb.AbstractC6643f
    /* renamed from: g */
    Collection<V> mo22090g() {
        return new AbstractC6643f.C6645b();
    }

    @Override // gb.InterfaceC6634d0
    public Collection<V> get(K k) {
        Collection<V> collection = this.f18780n.get(k);
        if (collection == null) {
            collection = m22304s(k);
        }
        return mo22298y(k, collection);
    }

    @Override // gb.AbstractC6643f
    /* renamed from: h */
    java.util.Iterator<Map.Entry<K, V>> mo22089h() {
        return new C6618b();
    }

    @Override // gb.AbstractC6643f
    /* renamed from: j */
    java.util.Iterator<V> mo22088j() {
        return new C6617a();
    }

    @Override // gb.InterfaceC6634d0
    public boolean put(K k, V v) {
        Collection<V> collection = this.f18780n.get(k);
        if (collection == null) {
            Collection<V> m22304s = m22304s(k);
            if (m22304s.add(v)) {
                this.f18781o++;
                this.f18780n.put(k, m22304s);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v)) {
            this.f18781o++;
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: r */
    abstract Collection<V> mo22250r();

    /* renamed from: s */
    Collection<V> m22304s(K k) {
        return mo22250r();
    }

    @Override // gb.InterfaceC6634d0
    public int size() {
        return this.f18781o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final Map<K, Collection<V>> m22303t() {
        Map<K, Collection<V>> map = this.f18780n;
        if (map instanceof NavigableMap) {
            return new C6625f((NavigableMap) this.f18780n);
        }
        if (map instanceof SortedMap) {
            return new C6628i((SortedMap) this.f18780n);
        }
        return new C6619c(this.f18780n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final Set<K> m22302u() {
        Map<K, Collection<V>> map = this.f18780n;
        if (map instanceof NavigableMap) {
            return new C6626g((NavigableMap) this.f18780n);
        }
        if (map instanceof SortedMap) {
            return new C6629j((SortedMap) this.f18780n);
        }
        return new C6623e(this.f18780n);
    }

    @Override // gb.AbstractC6643f, gb.InterfaceC6634d0
    public Collection<V> values() {
        return super.values();
    }

    /* renamed from: x */
    abstract <E> Collection<E> mo22299x(Collection<E> collection);

    /* renamed from: y */
    abstract Collection<V> mo22298y(K k, Collection<V> collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final List<V> m22297z(K k, List<V> list, AbstractC6616d<K, V>.C6630k c6630k) {
        return list instanceof RandomAccess ? new C6627h(k, list, c6630k) : new C6632l(k, list, c6630k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.d$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6630k extends AbstractCollection<V> {

        /* renamed from: j */
        final K f18805j;

        /* renamed from: k */
        Collection<V> f18806k;

        /* renamed from: l */
        final AbstractC6616d<K, V>.C6630k f18807l;

        /* renamed from: m */
        final Collection<V> f18808m;

        C6630k(K k, Collection<V> collection, AbstractC6616d<K, V>.C6630k c6630k) {
            Collection<V> m22271e;
            this.f18805j = k;
            this.f18806k = collection;
            this.f18807l = c6630k;
            if (c6630k == null) {
                m22271e = null;
            } else {
                m22271e = c6630k.m22271e();
            }
            this.f18808m = m22271e;
        }

        /* renamed from: a */
        void m22273a() {
            AbstractC6616d<K, V>.C6630k c6630k = this.f18807l;
            if (c6630k != null) {
                c6630k.m22273a();
            } else {
                AbstractC6616d.this.f18780n.put(this.f18805j, this.f18806k);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            m22269i();
            boolean isEmpty = this.f18806k.isEmpty();
            boolean add = this.f18806k.add(v);
            if (add) {
                AbstractC6616d.m22307o(AbstractC6616d.this);
                if (isEmpty) {
                    m22273a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f18806k.addAll(collection);
            if (addAll) {
                int size2 = this.f18806k.size();
                AbstractC6616d.this.f18781o += size2 - size;
                if (size == 0) {
                    m22273a();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f18806k.clear();
            AbstractC6616d.this.f18781o -= size;
            m22268k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m22269i();
            return this.f18806k.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m22269i();
            return this.f18806k.containsAll(collection);
        }

        /* renamed from: d */
        AbstractC6616d<K, V>.C6630k m22272d() {
            return this.f18807l;
        }

        /* renamed from: e */
        Collection<V> m22271e() {
            return this.f18806k;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m22269i();
            return this.f18806k.equals(obj);
        }

        /* renamed from: h */
        K m22270h() {
            return this.f18805j;
        }

        @Override // java.util.Collection
        public int hashCode() {
            m22269i();
            return this.f18806k.hashCode();
        }

        /* renamed from: i */
        void m22269i() {
            Collection<V> collection;
            AbstractC6616d<K, V>.C6630k c6630k = this.f18807l;
            if (c6630k != null) {
                c6630k.m22269i();
                if (this.f18807l.m22271e() != this.f18808m) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f18806k.isEmpty() && (collection = (Collection) AbstractC6616d.this.f18780n.get(this.f18805j)) != null) {
                this.f18806k = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            m22269i();
            return new C6631a();
        }

        /* renamed from: k */
        void m22268k() {
            AbstractC6616d<K, V>.C6630k c6630k = this.f18807l;
            if (c6630k != null) {
                c6630k.m22268k();
            } else if (this.f18806k.isEmpty()) {
                AbstractC6616d.this.f18780n.remove(this.f18805j);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m22269i();
            boolean remove = this.f18806k.remove(obj);
            if (remove) {
                AbstractC6616d.m22306p(AbstractC6616d.this);
                m22268k();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f18806k.removeAll(collection);
            if (removeAll) {
                int size2 = this.f18806k.size();
                AbstractC6616d.this.f18781o += size2 - size;
                m22268k();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            C6378h.m22834j(collection);
            int size = size();
            boolean retainAll = this.f18806k.retainAll(collection);
            if (retainAll) {
                int size2 = this.f18806k.size();
                AbstractC6616d.this.f18781o += size2 - size;
                m22268k();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m22269i();
            return this.f18806k.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m22269i();
            return this.f18806k.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gb.d$k$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C6631a implements java.util.Iterator<V>, p164j$.util.Iterator {

            /* renamed from: j */
            final java.util.Iterator<V> f18810j;

            /* renamed from: k */
            final Collection<V> f18811k;

            C6631a() {
                Collection<V> collection = C6630k.this.f18806k;
                this.f18811k = collection;
                this.f18810j = AbstractC6616d.m22301v(collection);
            }

            /* renamed from: a */
            java.util.Iterator<V> m22267a() {
                m22266b();
                return this.f18810j;
            }

            /* renamed from: b */
            void m22266b() {
                C6630k.this.m22269i();
                if (C6630k.this.f18806k == this.f18811k) {
                    return;
                }
                throw new ConcurrentModificationException();
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
                m22266b();
                return this.f18810j.hasNext();
            }

            @Override // java.util.Iterator, p164j$.util.Iterator
            public V next() {
                m22266b();
                return this.f18810j.next();
            }

            @Override // java.util.Iterator, p164j$.util.Iterator
            public void remove() {
                this.f18810j.remove();
                AbstractC6616d.m22306p(AbstractC6616d.this);
                C6630k.this.m22268k();
            }

            C6631a(java.util.Iterator<V> it) {
                this.f18811k = C6630k.this.f18806k;
                this.f18810j = it;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.d$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6632l extends AbstractC6616d<K, V>.C6630k implements List<V> {

        /* renamed from: gb.d$l$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        private class C6633a extends AbstractC6616d<K, V>.C6630k.C6631a implements ListIterator<V> {
            C6633a() {
                super();
            }

            /* renamed from: d */
            private ListIterator<V> m22264d() {
                return (ListIterator) m22267a();
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean isEmpty = C6632l.this.isEmpty();
                m22264d().add(v);
                AbstractC6616d.m22307o(AbstractC6616d.this);
                if (isEmpty) {
                    C6632l.this.m22273a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m22264d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m22264d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return m22264d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m22264d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                m22264d().set(v);
            }

            public C6633a(int i) {
                super(C6632l.this.m22265o().listIterator(i));
            }
        }

        C6632l(K k, List<V> list, AbstractC6616d<K, V>.C6630k c6630k) {
            super(k, list, c6630k);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            m22269i();
            boolean isEmpty = m22271e().isEmpty();
            m22265o().add(i, v);
            AbstractC6616d.m22307o(AbstractC6616d.this);
            if (isEmpty) {
                m22273a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m22265o().addAll(i, collection);
            if (addAll) {
                int size2 = m22271e().size();
                AbstractC6616d.this.f18781o += size2 - size;
                if (size == 0) {
                    m22273a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i) {
            m22269i();
            return m22265o().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m22269i();
            return m22265o().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m22269i();
            return m22265o().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m22269i();
            return new C6633a();
        }

        /* renamed from: o */
        List<V> m22265o() {
            return (List) m22271e();
        }

        @Override // java.util.List
        public V remove(int i) {
            m22269i();
            V remove = m22265o().remove(i);
            AbstractC6616d.m22306p(AbstractC6616d.this);
            m22268k();
            return remove;
        }

        @Override // java.util.List
        public V set(int i, V v) {
            m22269i();
            return m22265o().set(i, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            AbstractC6616d<K, V>.C6630k m22272d;
            m22269i();
            AbstractC6616d abstractC6616d = AbstractC6616d.this;
            Object m22270h = m22270h();
            List<V> subList = m22265o().subList(i, i2);
            if (m22272d() == null) {
                m22272d = this;
            } else {
                m22272d = m22272d();
            }
            return abstractC6616d.m22297z(m22270h, subList, m22272d);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            m22269i();
            return new C6633a(i);
        }
    }
}
