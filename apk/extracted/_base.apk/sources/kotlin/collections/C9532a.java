package kotlin.collections;

import cg.InterfaceC2533a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9581b;
import kotlin.jvm.internal.C9597i;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002J\u0017\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m14357d2 = {"Lkotlin/collections/a;", "T", "", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "", "iterator", "", "", "toArray", "()[Ljava/lang/Object;", "j", "[Ljava/lang/Object;", "getValues", "values", "k", "Z", "isVarargs", "()Z", "", "a", "()I", "size", "<init>", "([Ljava/lang/Object;Z)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.collections.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9532a<T> implements Collection<T>, InterfaceC2533a {

    /* renamed from: j */
    private final T[] f25308j;

    /* renamed from: k */
    private final boolean f25309k;

    public C9532a(T[] values, boolean z) {
        C9612q.m13917h(values, "values");
        this.f25308j = values;
        this.f25309k = z;
    }

    /* renamed from: a */
    public int m14337a() {
        return this.f25308j.length;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean m14190y;
        m14190y = C9538f.m14190y(this.f25308j, obj);
        return m14190y;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f25308j.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return C9581b.m13973a(this.f25308j);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m14337a();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C9544i.m14111b(this.f25308j, this.f25309k);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        C9612q.m13917h(array, "array");
        return (T[]) C9597i.m13946b(this, array);
    }
}
