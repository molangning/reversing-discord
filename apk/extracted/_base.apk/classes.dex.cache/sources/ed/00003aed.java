package p164j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import p164j$.util.function.UnaryOperator;

/* renamed from: j$.util.List */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface List<E> extends Collection<E> {

    /* renamed from: j$.util.List$-CC */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class CC<E> {
        public static void $default$replaceAll(java.util.List list, UnaryOperator unaryOperator) {
            if (DesugarCollections.f22413b.isInstance(list)) {
                DesugarCollections.m17772e(list, unaryOperator);
                return;
            }
            unaryOperator.getClass();
            ListIterator<E> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set((E) unaryOperator.apply(listIterator.next()));
            }
        }

        public static Spliterator $default$spliterator(java.util.List list) {
            list.getClass();
            return new C8379a0(16, list);
        }
    }

    void add(int i, E e);

    @Override // p164j$.util.Collection
    boolean add(E e);

    boolean addAll(int i, Collection<? extends E> collection);

    @Override // p164j$.util.Collection
    boolean addAll(Collection<? extends E> collection);

    @Override // p164j$.util.Collection
    void clear();

    @Override // p164j$.util.Collection
    boolean contains(Object obj);

    @Override // p164j$.util.Collection
    boolean containsAll(Collection<?> collection);

    @Override // p164j$.util.Collection
    boolean equals(Object obj);

    E get(int i);

    @Override // p164j$.util.Collection
    int hashCode();

    int indexOf(Object obj);

    @Override // p164j$.util.Collection
    boolean isEmpty();

    @Override // p164j$.util.Collection
    Iterator<E> iterator();

    int lastIndexOf(Object obj);

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int i);

    E remove(int i);

    @Override // p164j$.util.Collection
    boolean remove(Object obj);

    @Override // p164j$.util.Collection
    boolean removeAll(Collection<?> collection);

    void replaceAll(UnaryOperator<E> unaryOperator);

    @Override // p164j$.util.Collection
    boolean retainAll(Collection<?> collection);

    E set(int i, E e);

    @Override // p164j$.util.Collection
    int size();

    void sort(Comparator<? super E> comparator);

    @Override // p164j$.util.Collection
    Spliterator<E> spliterator();

    java.util.List<E> subList(int i, int i2);

    @Override // p164j$.util.Collection
    Object[] toArray();

    @Override // p164j$.util.Collection
    <T> T[] toArray(T[] tArr);
}