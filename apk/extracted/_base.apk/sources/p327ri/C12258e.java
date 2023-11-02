package p327ri;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p164j$.lang.Iterable$CC;
import p164j$.util.AbstractC8516n;
import p164j$.util.Collection;
import p164j$.util.Iterator;
import p164j$.util.List;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.Predicate;
import p164j$.util.function.UnaryOperator;
import p164j$.util.stream.AbstractC8744w0;
import p164j$.util.stream.Stream;

/* renamed from: ri.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12258e<E> extends AbstractList<E> implements RandomAccess, List {

    /* renamed from: j */
    private int f31859j;

    /* renamed from: k */
    private Object f31860k;

    /* renamed from: ri.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C12260b<T> implements Iterator<T>, p164j$.util.Iterator {

        /* renamed from: j */
        private static final C12260b f31861j = new C12260b();

        private C12260b() {
        }

        /* renamed from: a */
        public static <T> C12260b<T> m5647a() {
            return f31861j;
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: ri.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private class C12261c extends AbstractC12262d<E> implements p164j$.util.Iterator {

        /* renamed from: k */
        private final int f31862k;

        public C12261c() {
            super();
            this.f31862k = ((AbstractList) C12258e.this).modCount;
        }

        @Override // p327ri.C12258e.AbstractC12262d
        /* renamed from: a */
        protected void mo5646a() {
            if (((AbstractList) C12258e.this).modCount == this.f31862k) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) C12258e.this).modCount + "; expected: " + this.f31862k);
        }

        @Override // p327ri.C12258e.AbstractC12262d
        /* renamed from: b */
        protected E mo5645b() {
            return (E) C12258e.this.f31860k;
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            mo5646a();
            C12258e.this.clear();
        }
    }

    /* renamed from: ri.e$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static abstract class AbstractC12262d<T> implements java.util.Iterator<T> {

        /* renamed from: j */
        private boolean f31864j;

        private AbstractC12262d() {
        }

        /* renamed from: a */
        protected abstract void mo5646a();

        /* renamed from: b */
        protected abstract T mo5645b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f31864j;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f31864j) {
                this.f31864j = true;
                mo5646a();
                return mo5645b();
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m5652a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, p164j$.util.List, p164j$.util.Collection
    public boolean add(E e) {
        int i = this.f31859j;
        if (i == 0) {
            this.f31860k = e;
        } else if (i == 1) {
            this.f31860k = new Object[]{this.f31860k, e};
        } else {
            Object[] objArr = (Object[]) this.f31860k;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f31860k = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f31859j] = e;
        }
        this.f31859j++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, p164j$.util.List, p164j$.util.Collection
    public void clear() {
        this.f31860k = null;
        this.f31859j = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // p164j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.AbstractList, java.util.List, p164j$.util.List
    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f31859j)) {
            if (i2 == 1) {
                return (E) this.f31860k;
            }
            return (E) ((Object[]) this.f31860k)[i];
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f31859j);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List, p164j$.util.List, p164j$.util.Collection
    public java.util.Iterator<E> iterator() {
        int i = this.f31859j;
        if (i == 0) {
            C12260b m5647a = C12260b.m5647a();
            if (m5647a == null) {
                m5652a(2);
            }
            return m5647a;
        } else if (i == 1) {
            return new C12261c();
        } else {
            java.util.Iterator<E> it = super.iterator();
            if (it == null) {
                m5652a(3);
            }
            return it;
        }
    }

    @Override // java.util.Collection, p164j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        Stream m17323v1;
        m17323v1 = AbstractC8744w0.m17323v1(AbstractC8516n.m17598s(this), true);
        return m17323v1;
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.AbstractList, java.util.List, p164j$.util.List
    public E remove(int i) {
        int i2;
        E e;
        if (i >= 0 && i < (i2 = this.f31859j)) {
            if (i2 == 1) {
                e = (E) this.f31860k;
                this.f31860k = null;
            } else {
                Object[] objArr = (Object[]) this.f31860k;
                Object obj = objArr[i];
                if (i2 == 2) {
                    this.f31860k = objArr[1 - i];
                } else {
                    int i3 = (i2 - i) - 1;
                    if (i3 > 0) {
                        System.arraycopy(objArr, i + 1, objArr, i, i3);
                    }
                    objArr[this.f31859j - 1] = null;
                }
                e = (E) obj;
            }
            this.f31859j--;
            ((AbstractList) this).modCount++;
            return e;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f31859j);
    }

    @Override // p164j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return removeIf(Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // p164j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    @Override // java.util.AbstractList, java.util.List, p164j$.util.List
    public E set(int i, E e) {
        int i2;
        if (i >= 0 && i < (i2 = this.f31859j)) {
            if (i2 == 1) {
                E e2 = (E) this.f31860k;
                this.f31860k = e;
                return e2;
            }
            Object[] objArr = (Object[]) this.f31860k;
            E e3 = (E) objArr[i];
            objArr[i] = e;
            return e3;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f31859j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, p164j$.util.List, p164j$.util.Collection
    public int size() {
        return this.f31859j;
    }

    @Override // java.util.List, p164j$.util.List
    public void sort(Comparator<? super E> comparator) {
        int i = this.f31859j;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f31860k, 0, i, comparator);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, p164j$.util.List, p164j$.util.Collection
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, p164j$.util.Collection
    public /* synthetic */ Stream stream() {
        Stream m17323v1;
        m17323v1 = AbstractC8744w0.m17323v1(AbstractC8516n.m17598s(this), false);
        return m17323v1;
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // p164j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray(IntFunction.VivifiedWrapper.convert(intFunction));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, p164j$.util.List, p164j$.util.Collection
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            m5652a(4);
        }
        int length = tArr.length;
        int i = this.f31859j;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.f31860k;
            } else {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f31860k;
                return tArr2;
            }
        } else if (length < i) {
            T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f31860k, i, tArr.getClass());
            if (tArr3 == null) {
                m5652a(6);
            }
            return tArr3;
        } else if (i != 0) {
            System.arraycopy(this.f31860k, 0, tArr, 0, i);
        }
        int i2 = this.f31859j;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List, p164j$.util.List
    public void add(int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f31859j)) {
            if (i2 == 0) {
                this.f31860k = e;
            } else if (i2 == 1 && i == 0) {
                this.f31860k = new Object[]{e, this.f31860k};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.f31860k;
                } else {
                    Object[] objArr2 = (Object[]) this.f31860k;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.f31859j - i);
                }
                objArr[i] = e;
                this.f31860k = objArr;
            }
            this.f31859j++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f31859j);
    }
}
