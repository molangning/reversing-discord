package p195k8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: k8.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9171h<E> implements Iterable<E> {

    /* renamed from: j */
    private final Object f24136j = new Object();

    /* renamed from: k */
    private final Map<E, Integer> f24137k = new HashMap();

    /* renamed from: l */
    private Set<E> f24138l = Collections.emptySet();

    /* renamed from: m */
    private List<E> f24139m = Collections.emptyList();

    /* renamed from: a */
    public void m16389a(E e) {
        synchronized (this.f24136j) {
            ArrayList arrayList = new ArrayList(this.f24139m);
            arrayList.add(e);
            this.f24139m = Collections.unmodifiableList(arrayList);
            Integer num = this.f24137k.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f24138l);
                hashSet.add(e);
                this.f24138l = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f24137k;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(e, Integer.valueOf(i));
        }
    }

    /* renamed from: d */
    public void m16388d(E e) {
        synchronized (this.f24136j) {
            Integer num = this.f24137k.get(e);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f24139m);
            arrayList.remove(e);
            this.f24139m = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f24137k.remove(e);
                HashSet hashSet = new HashSet(this.f24138l);
                hashSet.remove(e);
                this.f24138l = Collections.unmodifiableSet(hashSet);
            } else {
                this.f24137k.put(e, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f24136j) {
            it = this.f24139m.iterator();
        }
        return it;
    }

    /* renamed from: l */
    public Set<E> m16387l() {
        Set<E> set;
        synchronized (this.f24136j) {
            set = this.f24138l;
        }
        return set;
    }
}