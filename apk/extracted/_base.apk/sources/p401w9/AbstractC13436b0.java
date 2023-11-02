package p401w9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: w9.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13436b0 extends AbstractC13464y implements List, RandomAccess {

    /* renamed from: k */
    private static final AbstractC13449j f34671k = new C13465z(C13435b.f34668n, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static AbstractC13436b0 m2495r(Object[] objArr) {
        return m2494s(objArr, objArr.length);
    }

    /* renamed from: s */
    static AbstractC13436b0 m2494s(Object[] objArr, int i) {
        if (i == 0) {
            return C13435b.f34668n;
        }
        return new C13435b(objArr, i);
    }

    /* renamed from: t */
    public static AbstractC13436b0 m2493t(Collection collection) {
        if (collection instanceof AbstractC13464y) {
            AbstractC13436b0 mo2430h = ((AbstractC13464y) collection).mo2430h();
            if (mo2430h.mo2428k()) {
                Object[] array = mo2430h.toArray();
                return m2494s(array, array.length);
            }
            return mo2430h;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                throw new NullPointerException("at index " + i);
            }
        }
        return m2494s(array2, length);
    }

    /* renamed from: u */
    public static AbstractC13436b0 m2492u() {
        return C13435b.f34668n;
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: a */
    int mo2433a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p401w9.AbstractC13464y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C13458s.m2442a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C13458s.m2442a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p401w9.AbstractC13464y
    @Deprecated
    /* renamed from: h */
    public final AbstractC13436b0 mo2430h() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: i */
    public final AbstractC13448i mo2429i() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // p401w9.AbstractC13464y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: p */
    public AbstractC13436b0 subList(int i, int i2) {
        C13459t.m2438d(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C13435b.f34668n;
        }
        return new C13434a0(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v */
    public final AbstractC13449j listIterator(int i) {
        C13459t.m2440b(i, size(), "index");
        if (isEmpty()) {
            return f34671k;
        }
        return new C13465z(this, i);
    }
}
