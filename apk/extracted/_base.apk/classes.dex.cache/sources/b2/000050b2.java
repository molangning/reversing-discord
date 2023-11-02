package p401w9;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import p164j$.util.Map;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.Function;

/* renamed from: w9.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13442e0 implements Map, Serializable, p164j$.util.Map {

    /* renamed from: j */
    private transient AbstractC13444f0 f34684j;

    /* renamed from: k */
    private transient AbstractC13444f0 f34685k;

    /* renamed from: l */
    private transient AbstractC13464y f34686l;

    /* renamed from: a */
    abstract AbstractC13464y mo2482a();

    @Override // java.util.Map, p164j$.util.Map
    /* renamed from: b */
    public final AbstractC13464y values() {
        AbstractC13464y abstractC13464y = this.f34686l;
        if (abstractC13464y == null) {
            AbstractC13464y mo2482a = mo2482a();
            this.f34686l = mo2482a;
            return mo2482a;
        }
        return abstractC13464y;
    }

    /* renamed from: c */
    abstract AbstractC13444f0 mo2481c();

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
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: e */
    abstract AbstractC13444f0 mo2480e();

    @Override // java.util.Map, p164j$.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        return entrySet().equals(((java.util.Map) obj).entrySet());
    }

    @Override // java.util.Map, p164j$.util.Map
    /* renamed from: f */
    public final AbstractC13444f0 entrySet() {
        AbstractC13444f0 abstractC13444f0 = this.f34684j;
        if (abstractC13444f0 == null) {
            AbstractC13444f0 mo2481c = mo2481c();
            this.f34684j = mo2481c;
            return mo2481c;
        }
        return abstractC13444f0;
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
    public abstract Object get(Object obj);

    @Override // java.util.Map, p164j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final int hashCode() {
        return C13447h.m2477a(entrySet());
    }

    @Override // java.util.Map, p164j$.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC13444f0 abstractC13444f0 = this.f34685k;
        if (abstractC13444f0 == null) {
            AbstractC13444f0 mo2480e = mo2480e();
            this.f34685k = mo2480e;
            return mo2480e;
        }
        return abstractC13444f0;
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
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p164j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p164j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p164j$.util.Map
    @Deprecated
    public final Object remove(Object obj) {
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

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb2.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z = false;
            }
            sb2.append('}');
            return sb2.toString();
        }
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }
}