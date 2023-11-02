package p164j$.util;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import p164j$.time.AbstractC8284a;
import p164j$.util.Map;
import p164j$.util.concurrent.C8406u;
import p164j$.util.concurrent.InterfaceC8407v;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8412d implements Map, Serializable, Map {

    /* renamed from: a */
    private final Map f22531a;

    /* renamed from: b */
    final Object f22532b;

    /* renamed from: c */
    private transient Set f22533c;

    /* renamed from: d */
    private transient Set f22534d;

    /* renamed from: e */
    private transient Collection f22535e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8412d(Map map) {
        map.getClass();
        this.f22531a = map;
        this.f22532b = this;
    }

    /* renamed from: a */
    private static Set m17722a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f22417f;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f22417f;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    @Override // java.util.Map, p164j$.util.Map
    public final void clear() {
        synchronized (this.f22532b) {
            this.f22531a.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        r5 = null;
     */
    @Override // p164j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object compute(java.lang.Object r5, p164j$.util.function.BiFunction r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f22532b
            monitor-enter(r0)
            java.util.Map r1 = r4.f22531a     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r1 instanceof p164j$.util.Map     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L10
            j$.util.Map r1 = (p164j$.util.Map) r1     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r1.compute(r5, r6)     // Catch: java.lang.Throwable -> L4a
            goto L48
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L44
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L4a
            r6.getClass()     // Catch: java.lang.Throwable -> L4a
        L19:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L4a
        L1d:
            java.lang.Object r3 = r6.apply(r5, r2)     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L33
            if (r2 != 0) goto L2b
            boolean r3 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L31
        L2b:
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L19
        L31:
            r5 = 0
            goto L48
        L33:
            if (r2 == 0) goto L3c
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L19
            goto L42
        L3c:
            java.lang.Object r2 = r1.putIfAbsent(r5, r3)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L1d
        L42:
            r5 = r3
            goto L48
        L44:
            java.lang.Object r5 = p164j$.util.Map.CC.$default$compute(r1, r5, r6)     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r5
        L4a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.C8412d.compute(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p164j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object $default$computeIfAbsent;
        Object apply;
        synchronized (this.f22532b) {
            Map map = this.f22531a;
            if (map instanceof Map) {
                $default$computeIfAbsent = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                function.getClass();
                Object obj2 = concurrentMap.get(obj);
                $default$computeIfAbsent = (obj2 == null && (apply = function.apply(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, apply)) == null) ? apply : obj2;
            } else {
                $default$computeIfAbsent = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return $default$computeIfAbsent;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // p164j$.util.Map
    public final Object computeIfPresent(Object obj, p164j$.util.function.BiFunction biFunction) {
        Object $default$computeIfPresent;
        synchronized (this.f22532b) {
            java.util.Map map = this.f22531a;
            if (map instanceof Map) {
                $default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    if (obj2 == null) {
                        $default$computeIfPresent = obj2;
                        break;
                    }
                    Object apply = biFunction.apply(obj, obj2);
                    if (apply != null) {
                        if (concurrentMap.replace(obj, obj2, apply)) {
                            $default$computeIfPresent = apply;
                            break;
                        }
                    } else if (concurrentMap.remove(obj, obj2)) {
                        $default$computeIfPresent = null;
                        break;
                    }
                }
            } else {
                $default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return $default$computeIfPresent;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p164j$.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f22532b) {
            containsKey = this.f22531a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f22532b) {
            containsValue = this.f22531a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f22532b) {
            if (this.f22534d == null) {
                this.f22534d = m17722a(this.f22531a.entrySet(), this.f22532b);
            }
            set = this.f22534d;
        }
        return set;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f22532b) {
            equals = this.f22531a.equals(obj);
        }
        return equals;
    }

    @Override // p164j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f22532b) {
            java.util.Map map = this.f22531a;
            if (map instanceof Map) {
                ((Map) map).forEach(biConsumer);
            } else if (map instanceof ConcurrentMap) {
                AbstractC8284a.m17905a((ConcurrentMap) map, biConsumer);
            } else {
                Map.CC.$default$forEach(map, biConsumer);
            }
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, p164j$.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f22532b) {
            obj2 = this.f22531a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f22532b) {
            orDefault = Map.EL.getOrDefault(this.f22531a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f22532b) {
            hashCode = this.f22531a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f22532b) {
            isEmpty = this.f22531a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.f22532b) {
            if (this.f22533c == null) {
                this.f22533c = m17722a(this.f22531a.keySet(), this.f22532b);
            }
            set = this.f22533c;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        r3 = r7.apply(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1.replace(r5, r2, r3) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1.remove(r5, r2) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r6 = null;
     */
    @Override // p164j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(java.lang.Object r5, java.lang.Object r6, p164j$.util.function.BiFunction r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f22532b
            monitor-enter(r0)
            java.util.Map r1 = r4.f22531a     // Catch: java.lang.Throwable -> L46
            boolean r2 = r1 instanceof p164j$.util.Map     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L10
            j$.util.Map r1 = (p164j$.util.Map) r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r1.merge(r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            goto L44
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L40
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L46
            r7.getClass()     // Catch: java.lang.Throwable -> L46
            r6.getClass()     // Catch: java.lang.Throwable -> L46
        L1c:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L46
        L20:
            if (r2 == 0) goto L38
            java.lang.Object r3 = r7.apply(r2, r6)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L30
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = r3
            goto L3e
        L30:
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = 0
            goto L3e
        L38:
            java.lang.Object r2 = r1.putIfAbsent(r5, r6)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L20
        L3e:
            r5 = r6
            goto L44
        L40:
            java.lang.Object r5 = p164j$.util.Map.CC.$default$merge(r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return r5
        L46:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.C8412d.merge(java.lang.Object, java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p164j$.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f22532b) {
            put = this.f22531a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f22532b) {
            this.f22531a.putAll(map);
        }
    }

    @Override // java.util.Map, p164j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object putIfAbsent;
        synchronized (this.f22532b) {
            putIfAbsent = Map.EL.putIfAbsent(this.f22531a, obj, obj2);
        }
        return putIfAbsent;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f22532b) {
            remove = this.f22531a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f22532b) {
            java.util.Map map = this.f22531a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f22532b) {
            java.util.Map map = this.f22531a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return replace;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f22532b) {
            java.util.Map map = this.f22531a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    @Override // p164j$.util.Map
    public final void replaceAll(p164j$.util.function.BiFunction biFunction) {
        synchronized (this.f22532b) {
            java.util.Map map = this.f22531a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                C8406u c8406u = new C8406u(0, concurrentMap, biFunction);
                if (concurrentMap instanceof InterfaceC8407v) {
                    ((InterfaceC8407v) concurrentMap).forEach(c8406u);
                } else {
                    AbstractC8284a.m17905a(concurrentMap, c8406u);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p164j$.util.Map
    public final int size() {
        int size;
        synchronized (this.f22532b) {
            size = this.f22531a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f22532b) {
            obj = this.f22531a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final Collection values() {
        Collection collection;
        Constructor constructor;
        Constructor constructor2;
        Collection collection2;
        synchronized (this.f22532b) {
            if (this.f22535e == null) {
                Collection values = this.f22531a.values();
                Object obj = this.f22532b;
                constructor = DesugarCollections.f22416e;
                if (constructor == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        constructor2 = DesugarCollections.f22416e;
                        collection2 = (Collection) constructor2.newInstance(values, obj);
                    } catch (IllegalAccessException e) {
                        e = e;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InstantiationException e2) {
                        e = e2;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f22535e = collection2;
            }
            collection = this.f22535e;
        }
        return collection;
    }
}
