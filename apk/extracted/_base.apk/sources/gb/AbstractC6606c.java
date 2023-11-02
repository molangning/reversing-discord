package gb;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gb.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6606c<K, V> extends AbstractC6616d<K, V> implements InterfaceC6717z<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6606c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // gb.AbstractC6616d, gb.InterfaceC6634d0
    /* renamed from: A */
    public List<V> get(K k) {
        return (List) super.get(k);
    }

    @Override // gb.AbstractC6643f, gb.InterfaceC6634d0
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // gb.AbstractC6643f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // gb.AbstractC6616d, gb.InterfaceC6634d0
    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    @Override // gb.AbstractC6616d
    /* renamed from: x */
    <E> Collection<E> mo22299x(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // gb.AbstractC6616d
    /* renamed from: y */
    Collection<V> mo22298y(K k, Collection<V> collection) {
        return m22297z(k, (List) collection, null);
    }
}
