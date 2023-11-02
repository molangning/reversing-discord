package p324rf;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.AbstractC11873f;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0017\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u001e\u0010\u0017\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m14357d2 = {"Lrf/f;", "E", "", "Lqf/f;", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "", "clear", "add", "", "elements", "addAll", "remove", "", "iterator", "removeAll", "retainAll", "Lrf/d;", "j", "Lrf/d;", "backing", "", "a", "()I", "size", "<init>", "(Lrf/d;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: rf.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12144f<E> extends AbstractC11873f<E> {

    /* renamed from: j */
    private final C12136d<E, ?> f31579j;

    public C12144f(C12136d<E, ?> backing) {
        C9612q.m13917h(backing, "backing");
        this.f31579j = backing;
    }

    @Override // p304qf.AbstractC11873f
    /* renamed from: a */
    public int mo6048a() {
        return this.f31579j.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        C9612q.m13917h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f31579j.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f31579j.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f31579j.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f31579j.m6099D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f31579j.m6092K(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        this.f31579j.m6079l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        this.f31579j.m6079l();
        return super.retainAll(elements);
    }
}