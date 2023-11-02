package gb;

import com.facebook.react.uimanager.ViewDefaults;
import gb.C6688r0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p102fb.C6377g;
import p102fb.C6378h;
import p102fb.InterfaceC6376f;

/* renamed from: gb.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6607c0 {

    /* renamed from: gb.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6608a<K, V> extends AbstractC6700t0<Map.Entry<K, V>, V> {
        C6608a(Iterator it) {
            super(it);
        }

        @Override // gb.AbstractC6700t0
        /* renamed from: b */
        public V mo22114a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gb.c0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class EnumC6609b implements InterfaceC6376f<Map.Entry<?, ?>, Object> {

        /* renamed from: j */
        public static final EnumC6609b f18773j;

        /* renamed from: k */
        public static final EnumC6609b f18774k;

        /* renamed from: l */
        private static final /* synthetic */ EnumC6609b[] f18775l;

        /* renamed from: gb.c0$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        enum C6610a extends EnumC6609b {
            C6610a(String str, int i) {
                super(str, i, null);
            }

            @Override // p102fb.InterfaceC6376f
            /* renamed from: a */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: gb.c0$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        enum C6611b extends EnumC6609b {
            C6611b(String str, int i) {
                super(str, i, null);
            }

            @Override // p102fb.InterfaceC6376f
            /* renamed from: a */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        static {
            C6610a c6610a = new C6610a("KEY", 0);
            f18773j = c6610a;
            C6611b c6611b = new C6611b("VALUE", 1);
            f18774k = c6611b;
            f18775l = new EnumC6609b[]{c6610a, c6611b};
        }

        private EnumC6609b(String str, int i) {
            super(str, i);
        }

        public static EnumC6609b valueOf(String str) {
            return (EnumC6609b) Enum.valueOf(EnumC6609b.class, str);
        }

        public static EnumC6609b[] values() {
            return (EnumC6609b[]) f18775l.clone();
        }

        /* synthetic */ EnumC6609b(String str, int i, C6605b0 c6605b0) {
            this(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.c0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC6612c<K, V> extends C6688r0.AbstractC6691b<Map.Entry<K, V>> {
        /* renamed from: a */
        abstract Map<K, V> mo22291a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo22291a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo22291a().isEmpty();
        }

        @Override // gb.C6688r0.AbstractC6691b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C6378h.m22834j(collection));
            } catch (UnsupportedOperationException unused) {
                return C6688r0.m22144h(this, collection.iterator());
            }
        }

        @Override // gb.C6688r0.AbstractC6691b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C6378h.m22834j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m22147e = C6688r0.m22147e(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        m22147e.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo22291a().keySet().retainAll(m22147e);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo22291a().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.c0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6613d<K, V> extends C6688r0.AbstractC6691b<K> {

        /* renamed from: j */
        final Map<K, V> f18776j;

        public C6613d(Map<K, V> map) {
            this.f18776j = (Map) C6378h.m22834j(map);
        }

        /* renamed from: a */
        public Map<K, V> m22314a() {
            return this.f18776j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return m22314a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return m22314a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m22314a().size();
        }
    }

    /* renamed from: gb.c0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6614e<K, V> extends AbstractCollection<V> {

        /* renamed from: j */
        final Map<K, V> f18777j;

        C6614e(Map<K, V> map) {
            this.f18777j = (Map) C6378h.m22834j(map);
        }

        /* renamed from: a */
        final Map<K, V> m22313a() {
            return this.f18777j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m22313a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return m22313a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m22313a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C6607c0.m22318k(m22313a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m22313a().entrySet()) {
                    if (C6377g.m22845a(obj, entry.getValue())) {
                        m22313a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C6378h.m22834j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m22148d = C6688r0.m22148d();
                for (Map.Entry<K, V> entry : m22313a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m22148d.add(entry.getKey());
                    }
                }
                return m22313a().keySet().removeAll(m22148d);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C6378h.m22834j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m22148d = C6688r0.m22148d();
                for (Map.Entry<K, V> entry : m22313a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m22148d.add(entry.getKey());
                    }
                }
                return m22313a().keySet().retainAll(m22148d);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m22313a().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.c0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC6615f<K, V> extends AbstractMap<K, V> {

        /* renamed from: j */
        private transient Set<Map.Entry<K, V>> f18778j;

        /* renamed from: k */
        private transient Collection<V> f18779k;

        /* renamed from: a */
        abstract Set<Map.Entry<K, V>> mo22295a();

        /* renamed from: b */
        Collection<V> m22312b() {
            return new C6614e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f18778j;
            if (set == null) {
                Set<Map.Entry<K, V>> mo22295a = mo22295a();
                this.f18778j = mo22295a;
                return mo22295a;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f18779k;
            if (collection == null) {
                Collection<V> m22312b = m22312b();
                this.f18779k = m22312b;
                return m22312b;
            }
            return collection;
        }
    }

    /* renamed from: a */
    public static int m22328a(int i) {
        if (i < 3) {
            C6653i.m22245b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        } else {
            return ViewDefaults.NUMBER_OF_LINES;
        }
    }

    /* renamed from: b */
    public static boolean m22327b(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: c */
    public static <K, V> Map.Entry<K, V> m22326c(K k, V v) {
        return new C6687r(k, v);
    }

    /* renamed from: d */
    public static <K> InterfaceC6376f<Map.Entry<K, ?>, K> m22325d() {
        return EnumC6609b.f18773j;
    }

    /* renamed from: e */
    public static <K, V> IdentityHashMap<K, V> m22324e() {
        return new IdentityHashMap<>();
    }

    /* renamed from: f */
    public static boolean m22323f(Map<?, ?> map, Object obj) {
        C6378h.m22834j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static <V> V m22322g(Map<?, V> map, Object obj) {
        C6378h.m22834j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static <V> V m22321h(Map<?, V> map, Object obj) {
        C6378h.m22834j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static String m22320i(Map<?, ?> map) {
        StringBuilder m22239a = C6655j.m22239a(map.size());
        m22239a.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                m22239a.append(", ");
            }
            m22239a.append(entry.getKey());
            m22239a.append('=');
            m22239a.append(entry.getValue());
            z = false;
        }
        m22239a.append('}');
        return m22239a.toString();
    }

    /* renamed from: j */
    public static <V> InterfaceC6376f<Map.Entry<?, V>, V> m22319j() {
        return EnumC6609b.f18774k;
    }

    /* renamed from: k */
    static <K, V> Iterator<V> m22318k(Iterator<Map.Entry<K, V>> it) {
        return new C6608a(it);
    }
}