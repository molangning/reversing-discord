package p304qf;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"K", "V", "", "key", "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/MapsKt")
/* renamed from: qf.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11887t {
    /* renamed from: a */
    public static final <K, V> V m6761a(Map<K, ? extends V> map, K k) {
        C9612q.m13917h(map, "<this>");
        if (map instanceof InterfaceC11885r) {
            return (V) ((InterfaceC11885r) map).m6777d(k);
        }
        V v = map.get(k);
        if (v == null && !map.containsKey(k)) {
            throw new NoSuchElementException("Key " + k + " is missing in the map.");
        }
        return v;
    }
}
