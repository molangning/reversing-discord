package p304qf;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u000f\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aQ\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\n\u0010\b\u001aa\u0010\r\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t2\u001a\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a@\u0010\u0016\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0015\u001a4\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0015\u001aQ\u0010\u001a\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0018*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00152\u0006\u0010\u0019\u001a\u00028\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aS\u0010\u001c\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0018*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00042\u0006\u0010\u0019\u001a\u00028\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a2\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001a2\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001aM\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0015H\u0086\u0002\u001aI\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010!\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002\u001a0\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¨\u0006$"}, m14357d2 = {"K", "V", "", "h", "", "Lkotlin/Pair;", "pairs", "k", "([Lkotlin/Pair;)Ljava/util/Map;", "", "l", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "j", "([Lkotlin/Pair;)Ljava/util/HashMap;", "key", "i", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "q", "(Ljava/util/Map;[Lkotlin/Pair;)V", "", "p", "r", "M", "destination", "s", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "u", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "t", "v", "n", "map", "o", "m", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/MapsKt")
/* renamed from: qf.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11889v extends C11888u {
    /* renamed from: h */
    public static <K, V> Map<K, V> m6754h() {
        C11877j c11877j = C11877j.f30872j;
        C9612q.m13919f(c11877j, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c11877j;
    }

    /* renamed from: i */
    public static <K, V> V m6753i(Map<K, ? extends V> map, K k) {
        C9612q.m13917h(map, "<this>");
        return (V) C11887t.m6761a(map, k);
    }

    /* renamed from: j */
    public static <K, V> HashMap<K, V> m6752j(Pair<? extends K, ? extends V>... pairs) {
        int m6758d;
        C9612q.m13917h(pairs, "pairs");
        m6758d = C11888u.m6758d(pairs.length);
        HashMap<K, V> hashMap = new HashMap<>(m6758d);
        m6745q(hashMap, pairs);
        return hashMap;
    }

    /* renamed from: k */
    public static <K, V> Map<K, V> m6751k(Pair<? extends K, ? extends V>... pairs) {
        Map<K, V> m6754h;
        int m6758d;
        C9612q.m13917h(pairs, "pairs");
        if (pairs.length > 0) {
            m6758d = C11888u.m6758d(pairs.length);
            return m6741u(pairs, new LinkedHashMap(m6758d));
        }
        m6754h = m6754h();
        return m6754h;
    }

    /* renamed from: l */
    public static <K, V> Map<K, V> m6750l(Pair<? extends K, ? extends V>... pairs) {
        int m6758d;
        C9612q.m13917h(pairs, "pairs");
        m6758d = C11888u.m6758d(pairs.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m6758d);
        m6745q(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static final <K, V> Map<K, V> m6749m(Map<K, ? extends V> map) {
        Map<K, V> m6754h;
        C9612q.m13917h(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                return C11888u.m6756f(map);
            }
            return map;
        }
        m6754h = m6754h();
        return m6754h;
    }

    /* renamed from: n */
    public static <K, V> Map<K, V> m6748n(Map<? extends K, ? extends V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Map<K, V> m6744r;
        C9612q.m13917h(map, "<this>");
        C9612q.m13917h(pairs, "pairs");
        if (map.isEmpty()) {
            m6744r = m6744r(pairs);
            return m6744r;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m6746p(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* renamed from: o */
    public static <K, V> Map<K, V> m6747o(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        C9612q.m13917h(map, "<this>");
        C9612q.m13917h(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: p */
    public static final <K, V> void m6746p(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        C9612q.m13917h(map, "<this>");
        C9612q.m13917h(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put((K) pair.m14351a(), (V) pair.m14350b());
        }
    }

    /* renamed from: q */
    public static final <K, V> void m6745q(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        C9612q.m13917h(map, "<this>");
        C9612q.m13917h(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put((K) pair.m14351a(), (V) pair.m14350b());
        }
    }

    /* renamed from: r */
    public static <K, V> Map<K, V> m6744r(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Map<K, V> m6754h;
        Pair<? extends K, ? extends V> next;
        Map<K, V> m6757e;
        int m6758d;
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    m6758d = C11888u.m6758d(collection.size());
                    return m6743s(iterable, new LinkedHashMap(m6758d));
                }
                if (iterable instanceof List) {
                    next = (Pair<? extends K, ? extends V>) ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                m6757e = C11888u.m6757e(next);
                return m6757e;
            }
            m6754h = m6754h();
            return m6754h;
        }
        return m6749m(m6743s(iterable, new LinkedHashMap()));
    }

    /* renamed from: s */
    public static final <K, V, M extends Map<? super K, ? super V>> M m6743s(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M destination) {
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(destination, "destination");
        m6746p(destination, iterable);
        return destination;
    }

    /* renamed from: t */
    public static <K, V> Map<K, V> m6742t(Map<? extends K, ? extends V> map) {
        Map<K, V> m6754h;
        Map<K, V> m6740v;
        C9612q.m13917h(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                m6740v = m6740v(map);
                return m6740v;
            }
            return C11888u.m6756f(map);
        }
        m6754h = m6754h();
        return m6754h;
    }

    /* renamed from: u */
    public static final <K, V, M extends Map<? super K, ? super V>> M m6741u(Pair<? extends K, ? extends V>[] pairArr, M destination) {
        C9612q.m13917h(pairArr, "<this>");
        C9612q.m13917h(destination, "destination");
        m6745q(destination, pairArr);
        return destination;
    }

    /* renamed from: v */
    public static <K, V> Map<K, V> m6740v(Map<? extends K, ? extends V> map) {
        C9612q.m13917h(map, "<this>");
        return new LinkedHashMap(map);
    }
}