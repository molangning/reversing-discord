package p394w2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w2.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13372f<K, V> extends HashMap<K, V> {
    private C13372f(Map<? extends K, ? extends V> map) {
        super(map);
    }

    /* renamed from: b */
    public static <K, V> C13372f<K, V> m2696b(Map<? extends K, ? extends V> map) {
        return new C13372f<>(map);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m2695of(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m2694of(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }
}
