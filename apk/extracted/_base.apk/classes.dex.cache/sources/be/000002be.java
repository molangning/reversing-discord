package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p164j$.util.Map;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.Function;

/* renamed from: androidx.collection.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0624a<K, V> extends SimpleArrayMap<K, V> implements Map<K, V>, p164j$.util.Map {

    /* renamed from: q */
    AbstractC0630e<K, V> f2120q;

    /* renamed from: androidx.collection.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0625a extends AbstractC0630e<K, V> {
        C0625a() {
            C0624a.this = r1;
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: a */
        protected void mo39479a() {
            C0624a.this.clear();
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: b */
        protected Object mo39478b(int i, int i2) {
            return C0624a.this.f2113k[(i << 1) + i2];
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: c */
        protected Map<K, V> mo39477c() {
            return C0624a.this;
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: d */
        protected int mo39476d() {
            return C0624a.this.f2114l;
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: e */
        protected int mo39475e(Object obj) {
            return C0624a.this.m39528g(obj);
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: f */
        protected int mo39474f(Object obj) {
            return C0624a.this.m39526i(obj);
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: g */
        protected void mo39473g(K k, V v) {
            C0624a.this.put(k, v);
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: h */
        protected void mo39472h(int i) {
            C0624a.this.m39523l(i);
        }

        @Override // androidx.collection.AbstractC0630e
        /* renamed from: i */
        protected V mo39471i(int i, V v) {
            return C0624a.this.m39522m(i, v);
        }
    }

    public C0624a() {
    }

    /* renamed from: o */
    private AbstractC0630e<K, V> m39509o() {
        if (this.f2120q == null) {
            this.f2120q = new C0625a();
        }
        return this.f2120q;
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
    public Set<Map.Entry<K, V>> entrySet() {
        return m39509o().m39468l();
    }

    @Override // p164j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, p164j$.util.Map
    public Set<K> keySet() {
        return m39509o().m39467m();
    }

    @Override // p164j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* renamed from: p */
    public boolean m39508p(Collection<?> collection) {
        return AbstractC0630e.m39464p(this, collection);
    }

    @Override // java.util.Map, p164j$.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        m39531c(this.f2114l + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p164j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p164j$.util.Map
    public Collection<V> values() {
        return m39509o().m39466n();
    }

    public C0624a(int i) {
        super(i);
    }

    public C0624a(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }
}