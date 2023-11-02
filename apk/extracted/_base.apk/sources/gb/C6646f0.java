package gb;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p102fb.C6378h;
import p102fb.InterfaceC6386l;

/* renamed from: gb.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6646f0 {

    /* renamed from: gb.f0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C6647a<K, V> extends AbstractC6606c<K, V> {

        /* renamed from: p */
        transient InterfaceC6386l<? extends List<V>> f18826p;

        C6647a(Map<K, Collection<V>> map, InterfaceC6386l<? extends List<V>> interfaceC6386l) {
            super(map);
            this.f18826p = (InterfaceC6386l) C6378h.m22834j(interfaceC6386l);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // gb.AbstractC6616d
        /* renamed from: B */
        public List<V> mo22250r() {
            return this.f18826p.get();
        }

        @Override // gb.AbstractC6643f
        /* renamed from: d */
        Map<K, Collection<V>> mo22093d() {
            return m22303t();
        }

        @Override // gb.AbstractC6643f
        /* renamed from: f */
        Set<K> mo22091f() {
            return m22302u();
        }
    }

    /* renamed from: gb.f0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static abstract class AbstractC6648b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        /* renamed from: a */
        abstract InterfaceC6634d0<K, V> mo22249a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo22249a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return mo22249a().mo22095b(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return mo22249a().remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo22249a().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m22253a(InterfaceC6634d0<?, ?> interfaceC6634d0, Object obj) {
        if (obj == interfaceC6634d0) {
            return true;
        }
        if (obj instanceof InterfaceC6634d0) {
            return interfaceC6634d0.asMap().equals(((InterfaceC6634d0) obj).asMap());
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> InterfaceC6717z<K, V> m22252b(Map<K, Collection<V>> map, InterfaceC6386l<? extends List<V>> interfaceC6386l) {
        return new C6647a(map, interfaceC6386l);
    }
}
