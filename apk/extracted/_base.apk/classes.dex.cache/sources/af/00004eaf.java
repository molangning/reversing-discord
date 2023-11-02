package p366u9;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: u9.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12927r<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: j */
    private static final Object[] f33633j = new Object[0];

    /* renamed from: a */
    int mo3648a(Object[] objArr, int i) {
        AbstractC12896b0 abstractC12896b0 = (AbstractC12896b0) iterator();
        while (abstractC12896b0.hasNext()) {
            objArr[i] = abstractC12896b0.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public abstract AbstractC12896b0<E> mo3647d();

    /* renamed from: e */
    public abstract AbstractC12925q<E> mo3655e();

    /* renamed from: h */
    public Object[] mo3646h() {
        return null;
    }

    /* renamed from: i */
    public int mo3645i() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract /* synthetic */ Iterator iterator();

    /* renamed from: k */
    int mo3644k() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f33633j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C12919n.m3674b(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo3646h = mo3646h();
            if (mo3646h != null) {
                return (T[]) Arrays.copyOfRange(mo3646h, mo3645i(), mo3644k(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo3648a(tArr, 0);
        return tArr;
    }
}