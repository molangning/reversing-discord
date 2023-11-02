package gb;

import java.util.Map;
import p102fb.C6377g;

/* renamed from: gb.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC6635e<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C6377g.m22845a(getKey(), entry.getKey()) || !C6377g.m22845a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        K key = getKey();
        V value = getValue();
        int i = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}