package p324rf;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\b\u0000\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b \u0010!J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0096\u0002J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0014\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m14357d2 = {"Lrf/e;", "K", "V", "Lrf/a;", "", "", "isEmpty", "", "element", "h", "", "clear", "k", "", "elements", "addAll", "i", "", "iterator", "containsAll", "removeAll", "retainAll", "Lrf/d;", "j", "Lrf/d;", "getBacking", "()Lrf/d;", "backing", "", "a", "()I", "size", "<init>", "(Lrf/d;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: rf.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12143e<K, V> extends AbstractC12132a<Map.Entry<K, V>, K, V> {

    /* renamed from: j */
    private final C12136d<K, V> f31578j;

    public C12143e(C12136d<K, V> backing) {
        C9612q.m13917h(backing, "backing");
        this.f31578j = backing;
    }

    @Override // p304qf.AbstractC11873f
    /* renamed from: a */
    public int mo6048a() {
        return this.f31578j.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        C9612q.m13917h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f31578j.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        return this.f31578j.m6077n(elements);
    }

    @Override // p324rf.AbstractC12132a
    /* renamed from: h */
    public boolean mo6052h(Map.Entry<? extends K, ? extends V> element) {
        C9612q.m13917h(element, "element");
        return this.f31578j.m6076o(element);
    }

    @Override // p324rf.AbstractC12132a
    /* renamed from: i */
    public boolean mo6051i(Map.Entry element) {
        C9612q.m13917h(element, "element");
        return this.f31578j.m6094I(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f31578j.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f31578j.m6072t();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: k */
    public boolean add(Map.Entry<K, V> element) {
        C9612q.m13917h(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        this.f31578j.m6079l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        this.f31578j.m6079l();
        return super.retainAll(elements);
    }
}