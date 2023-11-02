package p164j$.util;

import java.util.Iterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.Predicate;
import p164j$.util.stream.Stream;

/* renamed from: j$.util.Collection */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface Collection<E> {

    /* renamed from: j$.util.Collection$-CC */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class CC<E> {
        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            if (DesugarCollections.f22412a.isInstance(collection)) {
                return DesugarCollections.m17773d(collection, predicate);
            }
            predicate.getClass();
            Iterator<E> it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
    }

    boolean add(E e);

    boolean addAll(java.util.Collection<? extends E> collection);

    void clear();

    boolean contains(Object obj);

    boolean containsAll(java.util.Collection<?> collection);

    boolean equals(Object obj);

    void forEach(Consumer<? super E> consumer);

    int hashCode();

    boolean isEmpty();

    Iterator<E> iterator();

    Stream<E> parallelStream();

    boolean remove(Object obj);

    boolean removeAll(java.util.Collection<?> collection);

    boolean removeIf(Predicate<? super E> predicate);

    boolean retainAll(java.util.Collection<?> collection);

    int size();

    Spliterator<E> spliterator();

    Stream<E> stream();

    Object[] toArray();

    <T> T[] toArray(IntFunction<T[]> intFunction);

    <T> T[] toArray(T[] tArr);
}