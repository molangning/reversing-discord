package p324rf;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.AbstractC11873f;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001b\b\u0000\u0012\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0018¢\u0006\u0004\b \u0010!B\t\b\u0016¢\u0006\u0004\b \u0010\"J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002J\u0016\u0010\u0015\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0016\u0010\u0016\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0016\u0010\u0017\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016R\u001e\u0010\u001b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m14357d2 = {"Lrf/h;", "E", "", "Lqf/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "e", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "", "clear", "add", "remove", "", "iterator", "", "elements", "addAll", "removeAll", "retainAll", "Lrf/d;", "j", "Lrf/d;", "backing", "", "a", "()I", "size", "<init>", "(Lrf/d;)V", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: rf.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12146h<E> extends AbstractC11873f<E> implements Serializable {

    /* renamed from: j */
    private final C12136d<E, ?> f31581j;

    public C12146h(C12136d<E, ?> backing) {
        C9612q.m13917h(backing, "backing");
        this.f31581j = backing;
    }

    @Override // p304qf.AbstractC11873f
    /* renamed from: a */
    public int mo6048a() {
        return this.f31581j.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return this.f31581j.m6082i(e) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        C9612q.m13917h(elements, "elements");
        this.f31581j.m6079l();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f31581j.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f31581j.containsKey(obj);
    }

    /* renamed from: e */
    public final Set<E> m6047e() {
        this.f31581j.m6080k();
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f31581j.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f31581j.m6099D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f31581j.m6092K(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        this.f31581j.m6079l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        this.f31581j.m6079l();
        return super.retainAll(elements);
    }

    public C12146h() {
        this(new C12136d());
    }
}
