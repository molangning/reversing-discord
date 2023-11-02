package p278p4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p394w2.InterfaceC13380k;

/* renamed from: p4.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11395h<K, V> {

    /* renamed from: a */
    private final InterfaceC11419x<V> f29688a;

    /* renamed from: b */
    private final LinkedHashMap<K, V> f29689b = new LinkedHashMap<>();

    /* renamed from: c */
    private int f29690c = 0;

    public C11395h(InterfaceC11419x<V> interfaceC11419x) {
        this.f29688a = interfaceC11419x;
    }

    /* renamed from: g */
    private int m8158g(V v) {
        if (v == null) {
            return 0;
        }
        return this.f29688a.mo8081a(v);
    }

    /* renamed from: a */
    public synchronized boolean m8164a(K k) {
        return this.f29689b.containsKey(k);
    }

    /* renamed from: b */
    public synchronized V m8163b(K k) {
        return this.f29689b.get(k);
    }

    /* renamed from: c */
    public synchronized int m8162c() {
        return this.f29689b.size();
    }

    /* renamed from: d */
    public synchronized K m8161d() {
        K next;
        if (this.f29689b.isEmpty()) {
            next = null;
        } else {
            next = this.f29689b.keySet().iterator().next();
        }
        return next;
    }

    /* renamed from: e */
    public synchronized ArrayList<Map.Entry<K, V>> m8160e(InterfaceC13380k<K> interfaceC13380k) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f29689b.entrySet().size());
        for (Map.Entry<K, V> entry : this.f29689b.entrySet()) {
            if (interfaceC13380k == null || interfaceC13380k.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public synchronized int m8159f() {
        return this.f29690c;
    }

    /* renamed from: h */
    public synchronized V m8157h(K k, V v) {
        V remove;
        remove = this.f29689b.remove(k);
        this.f29690c -= m8158g(remove);
        this.f29689b.put(k, v);
        this.f29690c += m8158g(v);
        return remove;
    }

    /* renamed from: i */
    public synchronized V m8156i(K k) {
        V remove;
        remove = this.f29689b.remove(k);
        this.f29690c -= m8158g(remove);
        return remove;
    }

    /* renamed from: j */
    public synchronized ArrayList<V> m8155j(InterfaceC13380k<K> interfaceC13380k) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.f29689b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (interfaceC13380k == null || interfaceC13380k.apply(next.getKey())) {
                arrayList.add(next.getValue());
                this.f29690c -= m8158g(next.getValue());
                it.remove();
            }
        }
        return arrayList;
    }
}
