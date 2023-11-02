package gb;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import p102fb.C6378h;

/* renamed from: gb.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6683q<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: j */
    private static final Object[] f18884j = new Object[0];

    /* renamed from: gb.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC6684a<E> extends AbstractC6685b<E> {

        /* renamed from: a */
        Object[] f18885a;

        /* renamed from: b */
        int f18886b;

        /* renamed from: c */
        boolean f18887c;

        public AbstractC6684a(int i) {
            C6653i.m22245b(i, "initialCapacity");
            this.f18885a = new Object[i];
            this.f18886b = 0;
        }

        /* renamed from: c */
        private void m22153c(int i) {
            Object[] objArr = this.f18885a;
            if (objArr.length < i) {
                this.f18885a = Arrays.copyOf(objArr, AbstractC6685b.m22152a(objArr.length, i));
                this.f18887c = false;
            } else if (this.f18887c) {
                this.f18885a = (Object[]) objArr.clone();
                this.f18887c = false;
            }
        }

        /* renamed from: b */
        public AbstractC6684a<E> m22154b(E e) {
            C6378h.m22834j(e);
            m22153c(this.f18886b + 1);
            Object[] objArr = this.f18885a;
            int i = this.f18886b;
            this.f18886b = i + 1;
            objArr[i] = e;
            return this;
        }
    }

    /* renamed from: gb.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC6685b<E> {
        AbstractC6685b() {
        }

        /* renamed from: a */
        public static int m22152a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return ViewDefaults.NUMBER_OF_LINES;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    /* renamed from: a */
    public AbstractC6693s<E> mo22073a() {
        return isEmpty() ? AbstractC6693s.m22131x() : AbstractC6693s.m22138p(toArray());
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    public int mo22075d(Object[] objArr, int i) {
        AbstractC6703u0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    /* renamed from: e */
    public Object[] mo22125e() {
        return null;
    }

    /* renamed from: h */
    int mo22124h() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public int mo22123i() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public abstract boolean mo22122k();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o */
    public abstract AbstractC6703u0<E> iterator();

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
        return toArray(f18884j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C6378h.m22834j(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo22125e = mo22125e();
            if (mo22125e != null) {
                return (T[]) C6666k0.m22192a(mo22125e, mo22123i(), mo22124h(), tArr);
            }
            tArr = (T[]) C6654i0.m22240d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo22075d(tArr, 0);
        return tArr;
    }
}