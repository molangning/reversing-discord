package p165j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: j.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C8771b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: j */
    C8774c<K, V> f23008j;

    /* renamed from: k */
    private C8774c<K, V> f23009k;

    /* renamed from: l */
    private WeakHashMap<InterfaceC8777f<K, V>, Boolean> f23010l = new WeakHashMap<>();

    /* renamed from: m */
    private int f23011m = 0;

    /* renamed from: j.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C8772a<K, V> extends AbstractC8776e<K, V> {
        C8772a(C8774c<K, V> c8774c, C8774c<K, V> c8774c2) {
            super(c8774c, c8774c2);
        }

        @Override // p165j.C8771b.AbstractC8776e
        /* renamed from: b */
        C8774c<K, V> mo17280b(C8774c<K, V> c8774c) {
            return c8774c.f23015m;
        }

        @Override // p165j.C8771b.AbstractC8776e
        /* renamed from: d */
        C8774c<K, V> mo17279d(C8774c<K, V> c8774c) {
            return c8774c.f23014l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C8773b<K, V> extends AbstractC8776e<K, V> {
        C8773b(C8774c<K, V> c8774c, C8774c<K, V> c8774c2) {
            super(c8774c, c8774c2);
        }

        @Override // p165j.C8771b.AbstractC8776e
        /* renamed from: b */
        C8774c<K, V> mo17280b(C8774c<K, V> c8774c) {
            return c8774c.f23014l;
        }

        @Override // p165j.C8771b.AbstractC8776e
        /* renamed from: d */
        C8774c<K, V> mo17279d(C8774c<K, V> c8774c) {
            return c8774c.f23015m;
        }
    }

    /* renamed from: j.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C8774c<K, V> implements Map.Entry<K, V> {

        /* renamed from: j */
        final K f23012j;

        /* renamed from: k */
        final V f23013k;

        /* renamed from: l */
        C8774c<K, V> f23014l;

        /* renamed from: m */
        C8774c<K, V> f23015m;

        C8774c(K k, V v) {
            this.f23012j = k;
            this.f23013k = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C8774c)) {
                return false;
            }
            C8774c c8774c = (C8774c) obj;
            if (this.f23012j.equals(c8774c.f23012j) && this.f23013k.equals(c8774c.f23013k)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f23012j;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f23013k;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f23012j.hashCode() ^ this.f23013k.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f23012j + "=" + this.f23013k;
        }
    }

    /* renamed from: j.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C8775d implements Iterator<Map.Entry<K, V>>, InterfaceC8777f<K, V> {

        /* renamed from: j */
        private C8774c<K, V> f23016j;

        /* renamed from: k */
        private boolean f23017k = true;

        C8775d() {
            C8771b.this = r1;
        }

        @Override // p165j.C8771b.InterfaceC8777f
        /* renamed from: a */
        public void mo17276a(C8774c<K, V> c8774c) {
            boolean z;
            C8774c<K, V> c8774c2 = this.f23016j;
            if (c8774c == c8774c2) {
                C8774c<K, V> c8774c3 = c8774c2.f23015m;
                this.f23016j = c8774c3;
                if (c8774c3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f23017k = z;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C8774c<K, V> c8774c;
            if (this.f23017k) {
                this.f23017k = false;
                this.f23016j = C8771b.this.f23008j;
            } else {
                C8774c<K, V> c8774c2 = this.f23016j;
                if (c8774c2 != null) {
                    c8774c = c8774c2.f23014l;
                } else {
                    c8774c = null;
                }
                this.f23016j = c8774c;
            }
            return this.f23016j;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f23017k) {
                if (C8771b.this.f23008j != null) {
                    return true;
                }
                return false;
            }
            C8774c<K, V> c8774c = this.f23016j;
            if (c8774c != null && c8774c.f23014l != null) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC8776e<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC8777f<K, V> {

        /* renamed from: j */
        C8774c<K, V> f23019j;

        /* renamed from: k */
        C8774c<K, V> f23020k;

        AbstractC8776e(C8774c<K, V> c8774c, C8774c<K, V> c8774c2) {
            this.f23019j = c8774c2;
            this.f23020k = c8774c;
        }

        /* renamed from: f */
        private C8774c<K, V> m17277f() {
            C8774c<K, V> c8774c = this.f23020k;
            C8774c<K, V> c8774c2 = this.f23019j;
            if (c8774c != c8774c2 && c8774c2 != null) {
                return mo17279d(c8774c);
            }
            return null;
        }

        @Override // p165j.C8771b.InterfaceC8777f
        /* renamed from: a */
        public void mo17276a(C8774c<K, V> c8774c) {
            if (this.f23019j == c8774c && c8774c == this.f23020k) {
                this.f23020k = null;
                this.f23019j = null;
            }
            C8774c<K, V> c8774c2 = this.f23019j;
            if (c8774c2 == c8774c) {
                this.f23019j = mo17280b(c8774c2);
            }
            if (this.f23020k == c8774c) {
                this.f23020k = m17277f();
            }
        }

        /* renamed from: b */
        abstract C8774c<K, V> mo17280b(C8774c<K, V> c8774c);

        /* renamed from: d */
        abstract C8774c<K, V> mo17279d(C8774c<K, V> c8774c);

        @Override // java.util.Iterator
        /* renamed from: e */
        public Map.Entry<K, V> next() {
            C8774c<K, V> c8774c = this.f23020k;
            this.f23020k = m17277f();
            return c8774c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23020k != null;
        }
    }

    /* renamed from: j.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC8777f<K, V> {
        /* renamed from: a */
        void mo17276a(C8774c<K, V> c8774c);
    }

    /* renamed from: a */
    public Map.Entry<K, V> m17288a() {
        return this.f23008j;
    }

    /* renamed from: d */
    protected C8774c<K, V> mo17287d(K k) {
        C8774c<K, V> c8774c = this.f23008j;
        while (c8774c != null && !c8774c.f23012j.equals(k)) {
            c8774c = c8774c.f23014l;
        }
        return c8774c;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C8773b c8773b = new C8773b(this.f23009k, this.f23008j);
        this.f23010l.put(c8773b, Boolean.FALSE);
        return c8773b;
    }

    /* renamed from: e */
    public C8771b<K, V>.C8775d m17286e() {
        C8771b<K, V>.C8775d c8775d = new C8775d();
        this.f23010l.put(c8775d, Boolean.FALSE);
        return c8775d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8771b)) {
            return false;
        }
        C8771b c8771b = (C8771b) obj;
        if (size() != c8771b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c8771b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public Map.Entry<K, V> m17285h() {
        return this.f23009k;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public C8774c<K, V> m17284i(K k, V v) {
        C8774c<K, V> c8774c = new C8774c<>(k, v);
        this.f23011m++;
        C8774c<K, V> c8774c2 = this.f23009k;
        if (c8774c2 == null) {
            this.f23008j = c8774c;
            this.f23009k = c8774c;
            return c8774c;
        }
        c8774c2.f23014l = c8774c;
        c8774c.f23015m = c8774c2;
        this.f23009k = c8774c;
        return c8774c;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C8772a c8772a = new C8772a(this.f23008j, this.f23009k);
        this.f23010l.put(c8772a, Boolean.FALSE);
        return c8772a;
    }

    /* renamed from: k */
    public V mo17283k(K k, V v) {
        C8774c<K, V> mo17287d = mo17287d(k);
        if (mo17287d != null) {
            return mo17287d.f23013k;
        }
        m17284i(k, v);
        return null;
    }

    /* renamed from: o */
    public V mo17282o(K k) {
        C8774c<K, V> mo17287d = mo17287d(k);
        if (mo17287d == null) {
            return null;
        }
        this.f23011m--;
        if (!this.f23010l.isEmpty()) {
            for (InterfaceC8777f<K, V> interfaceC8777f : this.f23010l.keySet()) {
                interfaceC8777f.mo17276a(mo17287d);
            }
        }
        C8774c<K, V> c8774c = mo17287d.f23015m;
        if (c8774c != null) {
            c8774c.f23014l = mo17287d.f23014l;
        } else {
            this.f23008j = mo17287d.f23014l;
        }
        C8774c<K, V> c8774c2 = mo17287d.f23014l;
        if (c8774c2 != null) {
            c8774c2.f23015m = c8774c;
        } else {
            this.f23009k = c8774c;
        }
        mo17287d.f23014l = null;
        mo17287d.f23015m = null;
        return mo17287d.f23013k;
    }

    public int size() {
        return this.f23011m;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}