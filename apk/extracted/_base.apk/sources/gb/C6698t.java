package gb;

import gb.AbstractC6701u;
import gb.AbstractC6704v;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* renamed from: gb.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6698t<K, V> extends AbstractC6704v<K, V> implements InterfaceC6717z<K, V> {

    /* renamed from: gb.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6699a<K, V> extends AbstractC6704v.C6707c<K, V> {
        /* renamed from: e */
        public C6698t<K, V> m22117e() {
            return (C6698t) super.m22079a();
        }

        @Override // gb.AbstractC6704v.C6707c
        /* renamed from: f */
        public C6699a<K, V> mo22077c(K k, Iterable<? extends V> iterable) {
            super.mo22077c(k, iterable);
            return this;
        }

        /* renamed from: g */
        public C6699a<K, V> m22115g(K k, V... vArr) {
            super.m22076d(k, vArr);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6698t(AbstractC6701u<K, AbstractC6693s<V>> abstractC6701u, int i) {
        super(abstractC6701u, i);
    }

    /* renamed from: r */
    public static <K, V> C6699a<K, V> m22121r() {
        return new C6699a<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static <K, V> C6698t<K, V> m22120s(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        AbstractC6693s m22140B;
        if (collection.isEmpty()) {
            return m22118u();
        }
        AbstractC6701u.C6702a c6702a = new AbstractC6701u.C6702a(collection.size());
        int i = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                m22140B = AbstractC6693s.m22134u(value);
            } else {
                m22140B = AbstractC6693s.m22140B(comparator, value);
            }
            if (!m22140B.isEmpty()) {
                c6702a.m22100c(key, m22140B);
                i += m22140B.size();
            }
        }
        return new C6698t<>(c6702a.m22102a(), i);
    }

    /* renamed from: u */
    public static <K, V> C6698t<K, V> m22118u() {
        return C6679o.f18881p;
    }

    @Override // gb.InterfaceC6634d0
    /* renamed from: t */
    public AbstractC6693s<V> get(K k) {
        AbstractC6693s<V> abstractC6693s = (AbstractC6693s) this.f18910n.get(k);
        if (abstractC6693s == null) {
            return AbstractC6693s.m22131x();
        }
        return abstractC6693s;
    }
}
