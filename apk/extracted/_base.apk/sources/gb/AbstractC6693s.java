package gb;

import gb.AbstractC6683q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p102fb.C6378h;

/* renamed from: gb.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6693s<E> extends AbstractC6683q<E> implements List<E>, RandomAccess {

    /* renamed from: k */
    private static final AbstractC6710v0<Object> f18894k = new C6695b(C6668l0.f18853n, 0);

    /* renamed from: gb.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6694a<E> extends AbstractC6683q.AbstractC6684a<E> {
        public C6694a() {
            this(4);
        }

        /* renamed from: d */
        public C6694a<E> m22128d(E e) {
            super.m22154b(e);
            return this;
        }

        /* renamed from: e */
        public AbstractC6693s<E> m22127e() {
            this.f18887c = true;
            return AbstractC6693s.m22137r(this.f18885a, this.f18886b);
        }

        C6694a(int i) {
            super(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.s$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6695b<E> extends AbstractC6600a<E> {

        /* renamed from: l */
        private final AbstractC6693s<E> f18895l;

        C6695b(AbstractC6693s<E> abstractC6693s, int i) {
            super(abstractC6693s.size(), i);
            this.f18895l = abstractC6693s;
        }

        @Override // gb.AbstractC6600a
        /* renamed from: a */
        protected E mo22043a(int i) {
            return this.f18895l.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.s$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6696c extends AbstractC6693s<E> {

        /* renamed from: l */
        final transient int f18896l;

        /* renamed from: m */
        final transient int f18897m;

        C6696c(int i, int i2) {
            this.f18896l = i;
            this.f18897m = i2;
        }

        @Override // gb.AbstractC6693s, java.util.List
        /* renamed from: C */
        public AbstractC6693s<E> subList(int i, int i2) {
            C6378h.m22830n(i, i2, this.f18897m);
            AbstractC6693s abstractC6693s = AbstractC6693s.this;
            int i3 = this.f18896l;
            return abstractC6693s.subList(i + i3, i2 + i3);
        }

        @Override // gb.AbstractC6683q
        /* renamed from: e */
        Object[] mo22125e() {
            return AbstractC6693s.this.mo22125e();
        }

        @Override // java.util.List
        public E get(int i) {
            C6378h.m22836h(i, this.f18897m);
            return AbstractC6693s.this.get(i + this.f18896l);
        }

        @Override // gb.AbstractC6683q
        /* renamed from: h */
        int mo22124h() {
            return AbstractC6693s.this.mo22123i() + this.f18896l + this.f18897m;
        }

        @Override // gb.AbstractC6683q
        /* renamed from: i */
        int mo22123i() {
            return AbstractC6693s.this.mo22123i() + this.f18896l;
        }

        @Override // gb.AbstractC6693s, gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // gb.AbstractC6683q
        /* renamed from: k */
        boolean mo22122k() {
            return true;
        }

        @Override // gb.AbstractC6693s, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f18897m;
        }

        @Override // gb.AbstractC6693s, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* renamed from: A */
    public static <E> AbstractC6693s<E> m22141A(E e, E e2, E e3, E e4, E e5) {
        return m22135t(e, e2, e3, e4, e5);
    }

    /* renamed from: B */
    public static <E> AbstractC6693s<E> m22140B(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C6378h.m22834j(comparator);
        Object[] m22057e = C6712x.m22057e(iterable);
        C6654i0.m22242b(m22057e);
        Arrays.sort(m22057e, comparator);
        return m22138p(m22057e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static <E> AbstractC6693s<E> m22138p(Object[] objArr) {
        return m22137r(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static <E> AbstractC6693s<E> m22137r(Object[] objArr, int i) {
        if (i == 0) {
            return m22131x();
        }
        return new C6668l0(objArr, i);
    }

    /* renamed from: s */
    public static <E> C6694a<E> m22136s() {
        return new C6694a<>();
    }

    /* renamed from: t */
    private static <E> AbstractC6693s<E> m22135t(Object... objArr) {
        return m22138p(C6654i0.m22242b(objArr));
    }

    /* renamed from: u */
    public static <E> AbstractC6693s<E> m22134u(Collection<? extends E> collection) {
        if (collection instanceof AbstractC6683q) {
            AbstractC6693s<E> mo22073a = ((AbstractC6683q) collection).mo22073a();
            if (mo22073a.mo22122k()) {
                return m22138p(mo22073a.toArray());
            }
            return mo22073a;
        }
        return m22135t(collection.toArray());
    }

    /* renamed from: x */
    public static <E> AbstractC6693s<E> m22131x() {
        return (AbstractC6693s<E>) C6668l0.f18853n;
    }

    /* renamed from: y */
    public static <E> AbstractC6693s<E> m22130y(E e) {
        return m22135t(e);
    }

    /* renamed from: z */
    public static <E> AbstractC6693s<E> m22129z(E e, E e2) {
        return m22135t(e, e2);
    }

    @Override // java.util.List
    /* renamed from: C */
    public AbstractC6693s<E> subList(int i, int i2) {
        C6378h.m22830n(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m22131x();
        }
        return m22139D(i, i2);
    }

    /* renamed from: D */
    AbstractC6693s<E> m22139D(int i, int i2) {
        return new C6696c(i, i2 - i);
    }

    @Override // gb.AbstractC6683q
    /* renamed from: a */
    public final AbstractC6693s<E> mo22073a() {
        return this;
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

    @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gb.AbstractC6683q
    /* renamed from: d */
    public int mo22075d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return C6601a0.m22338a(this, obj);
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
        return C6601a0.m22337b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C6601a0.m22335d(this, obj);
    }

    @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o */
    public AbstractC6703u0<E> iterator() {
        return listIterator();
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
    /* renamed from: v */
    public AbstractC6710v0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: w */
    public AbstractC6710v0<E> listIterator(int i) {
        C6378h.m22832l(i, size());
        if (isEmpty()) {
            return (AbstractC6710v0<E>) f18894k;
        }
        return new C6695b(this, i);
    }
}
