package p165j;

import java.util.HashMap;
import java.util.Map;
import p165j.C8771b;

/* renamed from: j.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C8770a<K, V> extends C8771b<K, V> {

    /* renamed from: n */
    private HashMap<K, C8771b.C8774c<K, V>> f23007n = new HashMap<>();

    public boolean contains(K k) {
        return this.f23007n.containsKey(k);
    }

    @Override // p165j.C8771b
    /* renamed from: d */
    protected C8771b.C8774c<K, V> mo17287d(K k) {
        return this.f23007n.get(k);
    }

    @Override // p165j.C8771b
    /* renamed from: k */
    public V mo17283k(K k, V v) {
        C8771b.C8774c<K, V> mo17287d = mo17287d(k);
        if (mo17287d != null) {
            return mo17287d.f23013k;
        }
        this.f23007n.put(k, m17284i(k, v));
        return null;
    }

    @Override // p165j.C8771b
    /* renamed from: o */
    public V mo17282o(K k) {
        V v = (V) super.mo17282o(k);
        this.f23007n.remove(k);
        return v;
    }

    /* renamed from: p */
    public Map.Entry<K, V> m17289p(K k) {
        if (contains(k)) {
            return this.f23007n.get(k).f23015m;
        }
        return null;
    }
}
