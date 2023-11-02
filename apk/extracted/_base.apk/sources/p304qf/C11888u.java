package p304qf;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import p324rf.C12136d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a2\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u001a \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001\u001a4\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0001\u001a@\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\n\u001a2\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¨\u0006\u0012"}, m14357d2 = {"K", "V", "Lkotlin/Pair;", "pair", "", "e", "", "c", "builder", "b", "Ljava/util/Comparator;", "comparator", "Ljava/util/SortedMap;", "g", "f", "", "expectedSize", "d", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/MapsKt")
/* renamed from: qf.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11888u extends C11887t {
    /* renamed from: b */
    public static <K, V> Map<K, V> m6760b(Map<K, V> builder) {
        C9612q.m13917h(builder, "builder");
        return ((C12136d) builder).m6080k();
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m6759c() {
        return new C12136d();
    }

    /* renamed from: d */
    public static int m6758d(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : ViewDefaults.NUMBER_OF_LINES;
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m6757e(Pair<? extends K, ? extends V> pair) {
        C9612q.m13917h(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.m14349c(), pair.m14348d());
        C9612q.m13918g(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: f */
    public static final <K, V> Map<K, V> m6756f(Map<? extends K, ? extends V> map) {
        C9612q.m13917h(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C9612q.m13918g(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: g */
    public static <K, V> SortedMap<K, V> m6755g(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        C9612q.m13917h(map, "<this>");
        C9612q.m13917h(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
