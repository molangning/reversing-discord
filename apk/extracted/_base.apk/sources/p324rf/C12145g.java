package p324rf;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.AbstractC11871d;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016R!\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m14357d2 = {"Lrf/g;", "V", "", "Lqf/d;", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "", "clear", "", "iterator", "remove", "removeAll", "retainAll", "Lrf/d;", "j", "Lrf/d;", "getBacking", "()Lrf/d;", "backing", "", "a", "()I", "size", "<init>", "(Lrf/d;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: rf.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12145g<V> extends AbstractC11871d<V> {

    /* renamed from: j */
    private final C12136d<?, V> f31580j;

    public C12145g(C12136d<?, V> backing) {
        C9612q.m13917h(backing, "backing");
        this.f31580j = backing;
    }

    @Override // p304qf.AbstractC11871d
    /* renamed from: a */
    public int mo6049a() {
        return this.f31580j.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> elements) {
        C9612q.m13917h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f31580j.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f31580j.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f31580j.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f31580j.m6089N();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f31580j.m6090M(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        this.f31580j.m6079l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        this.f31580j.m6079l();
        return super.retainAll(elements);
    }
}
