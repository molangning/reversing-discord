package p164j$.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import p164j$.util.Comparator;
import p164j$.util.List;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;
import p164j$.util.function.InterfaceC8468f0;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract /* synthetic */ class AbstractC8516n {
    /* renamed from: e */
    public static void m17609e(InterfaceC8356D interfaceC8356D, Consumer consumer) {
        if (consumer instanceof InterfaceC8483n) {
            interfaceC8356D.mo17467d((InterfaceC8483n) consumer);
        } else if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(interfaceC8356D.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            consumer.getClass();
            interfaceC8356D.mo17467d(new C8515m(consumer));
        }
    }

    /* renamed from: g */
    public static void m17608g(InterfaceC8359G interfaceC8359G, Consumer consumer) {
        if (consumer instanceof InterfaceC8437K) {
            interfaceC8359G.mo17458c((InterfaceC8437K) consumer);
        } else if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(interfaceC8359G.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            consumer.getClass();
            interfaceC8359G.mo17458c(new C8520r(consumer));
        }
    }

    /* renamed from: h */
    public static void m17607h(InterfaceC8362J interfaceC8362J, Consumer consumer) {
        if (consumer instanceof InterfaceC8468f0) {
            interfaceC8362J.mo17438b((InterfaceC8468f0) consumer);
        } else if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(interfaceC8362J.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            consumer.getClass();
            interfaceC8362J.mo17438b(new C8765v(consumer));
        }
    }

    /* renamed from: i */
    public static long m17606i(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    /* renamed from: j */
    public static boolean m17605j(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    /* renamed from: l */
    public static boolean m17604l(InterfaceC8356D interfaceC8356D, Consumer consumer) {
        if (consumer instanceof InterfaceC8483n) {
            return interfaceC8356D.mo17466p((InterfaceC8483n) consumer);
        }
        if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(interfaceC8356D.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return interfaceC8356D.mo17466p(new C8515m(consumer));
    }

    /* renamed from: m */
    public static boolean m17603m(InterfaceC8359G interfaceC8359G, Consumer consumer) {
        if (consumer instanceof InterfaceC8437K) {
            return interfaceC8359G.mo17457k((InterfaceC8437K) consumer);
        }
        if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(interfaceC8359G.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return interfaceC8359G.mo17457k(new C8520r(consumer));
    }

    /* renamed from: n */
    public static boolean m17602n(InterfaceC8362J interfaceC8362J, Consumer consumer) {
        if (consumer instanceof InterfaceC8468f0) {
            return interfaceC8362J.mo17437f((InterfaceC8468f0) consumer);
        }
        if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(interfaceC8362J.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return interfaceC8362J.mo17437f(new C8765v(consumer));
    }

    /* renamed from: o */
    public static boolean m17601o(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: q */
    public static void m17600q(Collection collection, Consumer consumer) {
        if (collection instanceof Collection) {
            ((Collection) collection).forEach(consumer);
            return;
        }
        consumer.getClass();
        for (Object obj : collection) {
            consumer.accept(obj);
        }
    }

    /* renamed from: r */
    public static void m17599r(List list, Comparator comparator) {
        if (list instanceof List) {
            ((List) list).sort(comparator);
        } else if (DesugarCollections.f22413b.isInstance(list)) {
            DesugarCollections.m17771f(list, comparator);
        } else {
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }
    }

    /* renamed from: s */
    public static Spliterator m17598s(Collection collection) {
        if (collection instanceof Collection) {
            return ((Collection) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
            linkedHashSet.getClass();
            return new C8379a0(17, linkedHashSet);
        } else if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C8353A(sortedSet, sortedSet);
        } else if (collection instanceof Set) {
            Set set = (Set) collection;
            set.getClass();
            return new C8379a0(1, set);
        } else if (collection instanceof List) {
            return List.CC.$default$spliterator((java.util.List) collection);
        } else {
            collection.getClass();
            return new C8379a0(0, collection);
        }
    }

    /* renamed from: t */
    public static /* synthetic */ Comparator m17597t(Comparator comparator, Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
