package p366u9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: u9.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12925q<E> extends AbstractC12927r<E> implements List<E>, RandomAccess {

    /* renamed from: k */
    private static final AbstractC12902e0<Object> f33632k = new C12931t(C12937w.f33641n, 0);

    /* renamed from: p */
    public static <E> AbstractC12925q<E> m3662p(E e) {
        Object[] objArr = {e};
        for (int i = 0; i <= 0; i++) {
            C12938x.m3650a(objArr[0], 0);
        }
        return m3660s(objArr, 1);
    }

    /* renamed from: r */
    public static <E> AbstractC12925q<E> m3661r(Object[] objArr) {
        return m3660s(objArr, objArr.length);
    }

    /* renamed from: s */
    public static <E> AbstractC12925q<E> m3660s(Object[] objArr, int i) {
        if (i == 0) {
            return (AbstractC12925q<E>) C12937w.f33641n;
        }
        return new C12937w(objArr, i);
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: a */
    int mo3648a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: d */
    public final AbstractC12896b0<E> mo3647d() {
        return (AbstractC12902e0) listIterator();
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: e */
    public final AbstractC12925q<E> mo3655e() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == C12919n.m3674b(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C12913k.m3681a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e = get(i2);
                        i2++;
                        if (!C12913k.m3681a(e, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
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

    @Override // p366u9.AbstractC12927r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return mo3647d();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
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
    public /* synthetic */ ListIterator listIterator(int i) {
        C12919n.m3669g(i, size());
        if (isEmpty()) {
            return f33632k;
        }
        return new C12931t(this, i);
    }

    @Override // java.util.List
    /* renamed from: o */
    public AbstractC12925q<E> subList(int i, int i2) {
        C12919n.m3672d(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (AbstractC12925q<E>) C12937w.f33641n;
        }
        return new C12929s(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (AbstractC12902e0) listIterator(0);
    }
}