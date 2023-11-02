package gb;

import gb.C6646f0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gb.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6643f<K, V> implements InterfaceC6634d0<K, V> {

    /* renamed from: j */
    private transient Collection<Map.Entry<K, V>> f18820j;

    /* renamed from: k */
    private transient Set<K> f18821k;

    /* renamed from: l */
    private transient Collection<V> f18822l;

    /* renamed from: m */
    private transient Map<K, Collection<V>> f18823m;

    /* renamed from: gb.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6644a extends C6646f0.AbstractC6648b<K, V> {
        public C6644a() {
            AbstractC6643f.this = r1;
        }

        @Override // gb.C6646f0.AbstractC6648b
        /* renamed from: a */
        InterfaceC6634d0<K, V> mo22249a() {
            return AbstractC6643f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC6643f.this.mo22089h();
        }
    }

    /* renamed from: gb.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6645b extends AbstractCollection<V> {
        public C6645b() {
            AbstractC6643f.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC6643f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC6643f.this.mo22094c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC6643f.this.mo22088j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC6643f.this.size();
        }
    }

    @Override // gb.InterfaceC6634d0
    /* renamed from: a */
    public Collection<Map.Entry<K, V>> mo22096a() {
        Collection<Map.Entry<K, V>> collection = this.f18820j;
        if (collection == null) {
            Collection<Map.Entry<K, V>> mo22092e = mo22092e();
            this.f18820j = mo22092e;
            return mo22092e;
        }
        return collection;
    }

    @Override // gb.InterfaceC6634d0
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f18823m;
        if (map == null) {
            Map<K, Collection<V>> mo22093d = mo22093d();
            this.f18823m = mo22093d;
            return mo22093d;
        }
        return map;
    }

    @Override // gb.InterfaceC6634d0
    /* renamed from: b */
    public boolean mo22095b(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo22094c(Object obj) {
        for (Collection<V> collection : asMap().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    abstract Map<K, Collection<V>> mo22093d();

    /* renamed from: e */
    abstract Collection<Map.Entry<K, V>> mo22092e();

    public boolean equals(Object obj) {
        return C6646f0.m22253a(this, obj);
    }

    /* renamed from: f */
    abstract Set<K> mo22091f();

    /* renamed from: g */
    abstract Collection<V> mo22090g();

    /* renamed from: h */
    abstract Iterator<Map.Entry<K, V>> mo22089h();

    public int hashCode() {
        return asMap().hashCode();
    }

    /* renamed from: i */
    public Set<K> m22254i() {
        Set<K> set = this.f18821k;
        if (set == null) {
            Set<K> mo22091f = mo22091f();
            this.f18821k = mo22091f;
            return mo22091f;
        }
        return set;
    }

    /* renamed from: j */
    abstract Iterator<V> mo22088j();

    @Override // gb.InterfaceC6634d0
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // gb.InterfaceC6634d0
    public Collection<V> values() {
        Collection<V> collection = this.f18822l;
        if (collection == null) {
            Collection<V> mo22090g = mo22090g();
            this.f18822l = mo22090g;
            return mo22090g;
        }
        return collection;
    }
}