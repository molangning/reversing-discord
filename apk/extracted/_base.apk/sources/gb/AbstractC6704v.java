package gb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: gb.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6704v<K, V> extends AbstractC6649g<K, V> implements Serializable {

    /* renamed from: n */
    final transient AbstractC6701u<K, ? extends AbstractC6683q<V>> f18910n;

    /* renamed from: o */
    final transient int f18911o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.v$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6705a extends AbstractC6703u0<Map.Entry<K, V>> {

        /* renamed from: j */
        final Iterator<? extends Map.Entry<K, ? extends AbstractC6683q<V>>> f18912j;

        /* renamed from: k */
        K f18913k = null;

        /* renamed from: l */
        Iterator<V> f18914l = C6713y.m22052d();

        C6705a() {
            this.f18912j = AbstractC6704v.this.f18910n.entrySet().iterator();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!this.f18914l.hasNext()) {
                Map.Entry<K, ? extends AbstractC6683q<V>> next = this.f18912j.next();
                this.f18913k = next.getKey();
                this.f18914l = next.getValue().iterator();
            }
            return C6607c0.m22326c(this.f18913k, this.f18914l.next());
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f18914l.hasNext() || this.f18912j.hasNext();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.v$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6706b extends AbstractC6703u0<V> {

        /* renamed from: j */
        Iterator<? extends AbstractC6683q<V>> f18916j;

        /* renamed from: k */
        Iterator<V> f18917k = C6713y.m22052d();

        C6706b() {
            this.f18916j = AbstractC6704v.this.f18910n.values().iterator();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f18917k.hasNext() || this.f18916j.hasNext();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public V next() {
            if (!this.f18917k.hasNext()) {
                this.f18917k = this.f18916j.next().iterator();
            }
            return this.f18917k.next();
        }
    }

    /* renamed from: gb.v$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6707c<K, V> {

        /* renamed from: a */
        Map<K, Collection<V>> f18919a = C6666k0.m22189d();

        /* renamed from: b */
        Comparator<? super K> f18920b;

        /* renamed from: c */
        Comparator<? super V> f18921c;

        /* renamed from: a */
        public AbstractC6704v<K, V> m22079a() {
            Collection entrySet = this.f18919a.entrySet();
            Comparator<? super K> comparator = this.f18920b;
            if (comparator != null) {
                entrySet = AbstractC6656j0.m22237b(comparator).m22234g().m22236c(entrySet);
            }
            return C6698t.m22120s(entrySet, this.f18921c);
        }

        /* renamed from: b */
        Collection<V> m22078b() {
            return new ArrayList();
        }

        /* renamed from: c */
        public C6707c<K, V> mo22077c(K k, Iterable<? extends V> iterable) {
            if (k != null) {
                Collection<V> collection = this.f18919a.get(k);
                if (collection != null) {
                    for (V v : iterable) {
                        C6653i.m22246a(k, v);
                        collection.add(v);
                    }
                    return this;
                }
                Iterator<? extends V> it = iterable.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                Collection<V> m22078b = m22078b();
                while (it.hasNext()) {
                    V next = it.next();
                    C6653i.m22246a(k, next);
                    m22078b.add(next);
                }
                this.f18919a.put(k, m22078b);
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + C6712x.m22056f(iterable));
        }

        /* renamed from: d */
        public C6707c<K, V> m22076d(K k, V... vArr) {
            return mo22077c(k, Arrays.asList(vArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gb.v$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6708d<K, V> extends AbstractC6683q<Map.Entry<K, V>> {

        /* renamed from: k */
        final AbstractC6704v<K, V> f18922k;

        C6708d(AbstractC6704v<K, V> abstractC6704v) {
            this.f18922k = abstractC6704v;
        }

        @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f18922k.mo22095b(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: o */
        public AbstractC6703u0<Map.Entry<K, V>> iterator() {
            return this.f18922k.mo22089h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f18922k.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gb.v$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6709e<K, V> extends AbstractC6683q<V> {

        /* renamed from: k */
        private final transient AbstractC6704v<K, V> f18923k;

        C6709e(AbstractC6704v<K, V> abstractC6704v) {
            this.f18923k = abstractC6704v;
        }

        @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f18923k.mo22094c(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // gb.AbstractC6683q
        /* renamed from: d */
        public int mo22075d(Object[] objArr, int i) {
            AbstractC6703u0<? extends AbstractC6683q<V>> it = this.f18923k.f18910n.values().iterator();
            while (it.hasNext()) {
                i = it.next().mo22075d(objArr, i);
            }
            return i;
        }

        @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: o */
        public AbstractC6703u0<V> iterator() {
            return this.f18923k.mo22088j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f18923k.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6704v(AbstractC6701u<K, ? extends AbstractC6683q<V>> abstractC6701u, int i) {
        this.f18910n = abstractC6701u;
        this.f18911o = i;
    }

    @Override // gb.AbstractC6643f, gb.InterfaceC6634d0
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo22095b(Object obj, Object obj2) {
        return super.mo22095b(obj, obj2);
    }

    @Override // gb.AbstractC6643f
    /* renamed from: c */
    public boolean mo22094c(Object obj) {
        return obj != null && super.mo22094c(obj);
    }

    @Override // gb.InterfaceC6634d0
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // gb.AbstractC6643f
    /* renamed from: d */
    Map<K, Collection<V>> mo22093d() {
        throw new AssertionError("should never be called");
    }

    @Override // gb.AbstractC6643f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // gb.AbstractC6643f
    /* renamed from: f */
    Set<K> mo22091f() {
        throw new AssertionError("unreachable");
    }

    @Override // gb.AbstractC6643f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // gb.AbstractC6643f, gb.InterfaceC6634d0
    /* renamed from: k */
    public AbstractC6701u<K, Collection<V>> asMap() {
        return (AbstractC6701u<K, ? extends AbstractC6683q<V>>) this.f18910n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gb.AbstractC6643f
    /* renamed from: l */
    public AbstractC6683q<Map.Entry<K, V>> mo22092e() {
        return new C6708d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gb.AbstractC6643f
    /* renamed from: m */
    public AbstractC6683q<V> mo22090g() {
        return new C6709e(this);
    }

    @Override // gb.AbstractC6643f, gb.InterfaceC6634d0
    /* renamed from: n */
    public AbstractC6683q<Map.Entry<K, V>> mo22096a() {
        return (AbstractC6683q) super.mo22096a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gb.AbstractC6643f
    /* renamed from: o */
    public AbstractC6703u0<Map.Entry<K, V>> mo22089h() {
        return new C6705a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gb.AbstractC6643f
    /* renamed from: p */
    public AbstractC6703u0<V> mo22088j() {
        return new C6706b();
    }

    @Override // gb.InterfaceC6634d0
    @Deprecated
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // gb.AbstractC6643f, gb.InterfaceC6634d0
    /* renamed from: q */
    public AbstractC6683q<V> values() {
        return (AbstractC6683q) super.values();
    }

    @Override // gb.AbstractC6643f, gb.InterfaceC6634d0
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // gb.InterfaceC6634d0
    public int size() {
        return this.f18911o;
    }

    @Override // gb.AbstractC6643f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
