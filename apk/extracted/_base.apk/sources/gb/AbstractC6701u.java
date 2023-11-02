package gb;

import gb.AbstractC6683q;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import p164j$.util.Map;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.Function;

/* renamed from: gb.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6701u<K, V> implements Map<K, V>, Serializable, p164j$.util.Map {

    /* renamed from: m */
    static final Map.Entry<?, ?>[] f18902m = new Map.Entry[0];

    /* renamed from: j */
    private transient AbstractC6711w<Map.Entry<K, V>> f18903j;

    /* renamed from: k */
    private transient AbstractC6711w<K> f18904k;

    /* renamed from: l */
    private transient AbstractC6683q<V> f18905l;

    /* renamed from: gb.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6702a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f18906a;

        /* renamed from: b */
        Object[] f18907b;

        /* renamed from: c */
        int f18908c;

        /* renamed from: d */
        boolean f18909d;

        public C6702a() {
            this(4);
        }

        /* renamed from: b */
        private void m22101b(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f18907b;
            if (i2 > objArr.length) {
                this.f18907b = Arrays.copyOf(objArr, AbstractC6683q.AbstractC6685b.m22152a(objArr.length, i2));
                this.f18909d = false;
            }
        }

        /* renamed from: a */
        public AbstractC6701u<K, V> m22102a() {
            m22097f();
            this.f18909d = true;
            return C6670m0.m22178m(this.f18908c, this.f18907b);
        }

        /* renamed from: c */
        public C6702a<K, V> m22100c(K k, V v) {
            m22101b(this.f18908c + 1);
            C6653i.m22246a(k, v);
            Object[] objArr = this.f18907b;
            int i = this.f18908c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f18908c = i + 1;
            return this;
        }

        /* renamed from: d */
        public C6702a<K, V> m22099d(Map.Entry<? extends K, ? extends V> entry) {
            return m22100c(entry.getKey(), entry.getValue());
        }

        /* renamed from: e */
        public C6702a<K, V> m22098e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m22101b(this.f18908c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                m22099d(entry);
            }
            return this;
        }

        /* renamed from: f */
        void m22097f() {
            int i;
            if (this.f18906a != null) {
                if (this.f18909d) {
                    this.f18907b = Arrays.copyOf(this.f18907b, this.f18908c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f18908c];
                int i2 = 0;
                while (true) {
                    i = this.f18908c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f18907b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, AbstractC6656j0.m22237b(this.f18906a).m22233i(C6607c0.m22319j()));
                for (int i4 = 0; i4 < this.f18908c; i4++) {
                    int i5 = i4 * 2;
                    this.f18907b[i5] = entryArr[i4].getKey();
                    this.f18907b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C6702a(int i) {
            this.f18907b = new Object[i * 2];
            this.f18908c = 0;
            this.f18909d = false;
        }
    }

    /* renamed from: a */
    public static <K, V> C6702a<K, V> m22113a() {
        return new C6702a<>();
    }

    /* renamed from: b */
    public static <K, V> AbstractC6701u<K, V> m22112b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        C6702a c6702a = new C6702a(i);
        c6702a.m22098e(iterable);
        return c6702a.m22102a();
    }

    /* renamed from: c */
    public static <K, V> AbstractC6701u<K, V> m22111c(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC6701u) && !(map instanceof SortedMap)) {
            AbstractC6701u<K, V> abstractC6701u = (AbstractC6701u) map;
            if (!abstractC6701u.mo22106i()) {
                return abstractC6701u;
            }
        }
        return m22112b(map.entrySet());
    }

    /* renamed from: k */
    public static <K, V> AbstractC6701u<K, V> m22104k() {
        return (AbstractC6701u<K, V>) C6670m0.f18857q;
    }

    @Override // java.util.Map, p164j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p164j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p164j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // p164j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p164j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, p164j$.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: e */
    abstract AbstractC6711w<Map.Entry<K, V>> mo22110e();

    @Override // java.util.Map, p164j$.util.Map
    public boolean equals(Object obj) {
        return C6607c0.m22327b(this, obj);
    }

    /* renamed from: f */
    abstract AbstractC6711w<K> mo22109f();

    @Override // p164j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* renamed from: g */
    abstract AbstractC6683q<V> mo22108g();

    @Override // java.util.Map, p164j$.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map, p164j$.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map, p164j$.util.Map
    /* renamed from: h */
    public AbstractC6711w<Map.Entry<K, V>> entrySet() {
        AbstractC6711w<Map.Entry<K, V>> abstractC6711w = this.f18903j;
        if (abstractC6711w == null) {
            AbstractC6711w<Map.Entry<K, V>> mo22110e = mo22110e();
            this.f18903j = mo22110e;
            return mo22110e;
        }
        return abstractC6711w;
    }

    @Override // java.util.Map, p164j$.util.Map
    public int hashCode() {
        return C6688r0.m22150b(entrySet());
    }

    /* renamed from: i */
    abstract boolean mo22106i();

    @Override // java.util.Map, p164j$.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, p164j$.util.Map
    /* renamed from: j */
    public AbstractC6711w<K> keySet() {
        AbstractC6711w<K> abstractC6711w = this.f18904k;
        if (abstractC6711w == null) {
            AbstractC6711w<K> mo22109f = mo22109f();
            this.f18904k = mo22109f;
            return mo22109f;
        }
        return abstractC6711w;
    }

    @Override // java.util.Map, p164j$.util.Map
    /* renamed from: l */
    public AbstractC6683q<V> values() {
        AbstractC6683q<V> abstractC6683q = this.f18905l;
        if (abstractC6683q == null) {
            AbstractC6683q<V> mo22108g = mo22108g();
            this.f18905l = mo22108g;
            return mo22108g;
        }
        return abstractC6683q;
    }

    @Override // p164j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p164j$.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p164j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p164j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p164j$.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p164j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p164j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p164j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // p164j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public String toString() {
        return C6607c0.m22320i(this);
    }
}
