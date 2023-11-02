package gb;

import java.util.Collection;
import java.util.Map;

/* renamed from: gb.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC6634d0<K, V> {
    /* renamed from: a */
    Collection<Map.Entry<K, V>> mo22096a();

    Map<K, Collection<V>> asMap();

    /* renamed from: b */
    boolean mo22095b(Object obj, Object obj2);

    void clear();

    Collection<V> get(K k);

    boolean put(K k, V v);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}
