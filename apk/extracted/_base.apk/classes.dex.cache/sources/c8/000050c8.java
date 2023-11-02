package p401w9;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: w9.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13464y extends AbstractCollection implements Serializable {

    /* renamed from: j */
    private static final Object[] f34701j = new Object[0];

    /* renamed from: a */
    public int mo2433a(Object[] objArr, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    int mo2432d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public int mo2431e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public AbstractC13436b0 mo2430h() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: i */
    public abstract AbstractC13448i iterator();

    /* renamed from: k */
    public abstract boolean mo2428k();

    /* renamed from: o */
    public Object[] mo2427o() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f34701j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] mo2427o = mo2427o();
            if (mo2427o == null) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            } else {
                return Arrays.copyOfRange(mo2427o, mo2431e(), mo2432d(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        mo2433a(objArr, 0);
        return objArr;
    }
}