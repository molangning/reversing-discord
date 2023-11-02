package gb;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p102fb.C6378h;

/* renamed from: gb.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6688r0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: gb.r0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C6689a<E> extends AbstractC6692c<E> {

        /* renamed from: j */
        final /* synthetic */ Set f18890j;

        /* renamed from: k */
        final /* synthetic */ Set f18891k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gb.r0$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C6690a extends AbstractC6602b<E> {

            /* renamed from: l */
            final Iterator<E> f18892l;

            C6690a() {
                this.f18892l = C6689a.this.f18890j.iterator();
            }

            @Override // gb.AbstractC6602b
            /* renamed from: a */
            protected E mo22142a() {
                while (this.f18892l.hasNext()) {
                    E next = this.f18892l.next();
                    if (C6689a.this.f18891k.contains(next)) {
                        return next;
                    }
                }
                return m22331b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6689a(Set set, Set set2) {
            super(null);
            this.f18890j = set;
            this.f18891k = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public AbstractC6703u0<E> iterator() {
            return new C6690a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f18890j.contains(obj) && this.f18891k.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f18890j.containsAll(collection) && this.f18891k.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f18891k, this.f18890j);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (E e : this.f18890j) {
                if (this.f18891k.contains(e)) {
                    i++;
                }
            }
            return i;
        }
    }

    /* renamed from: gb.r0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static abstract class AbstractC6691b<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return C6688r0.m22145g(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C6378h.m22834j(collection));
        }
    }

    /* renamed from: gb.r0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC6692c<E> extends AbstractSet<E> {
        /* synthetic */ AbstractC6692c(C6686q0 c6686q0) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private AbstractC6692c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m22151a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m22150b(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    /* renamed from: c */
    public static <E> AbstractC6692c<E> m22149c(Set<E> set, Set<?> set2) {
        C6378h.m22833k(set, "set1");
        C6378h.m22833k(set2, "set2");
        return new C6689a(set, set2);
    }

    /* renamed from: d */
    public static <E> HashSet<E> m22148d() {
        return new HashSet<>();
    }

    /* renamed from: e */
    public static <E> HashSet<E> m22147e(int i) {
        return new HashSet<>(C6607c0.m22328a(i));
    }

    /* renamed from: f */
    public static <E> Set<E> m22146f() {
        return Collections.newSetFromMap(C6607c0.m22324e());
    }

    /* renamed from: g */
    static boolean m22145g(Set<?> set, Collection<?> collection) {
        C6378h.m22834j(collection);
        if (collection instanceof InterfaceC6650g0) {
            collection = ((InterfaceC6650g0) collection).m22248l();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return C6713y.m22046j(set.iterator(), collection);
        }
        return m22144h(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m22144h(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
