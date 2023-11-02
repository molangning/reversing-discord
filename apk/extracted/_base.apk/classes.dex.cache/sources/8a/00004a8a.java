package p304qf;

import cg.InterfaceC2533a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u0000 \u001a*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u001b\u001c\u001d\u001eB\t\b\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0016¨\u0006\u001f"}, m14357d2 = {"Lqf/c;", "E", "Lqf/a;", "", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "", "equals", "hashCode", "<init>", "()V", "j", "a", "b", "c", "d", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: qf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11866c<E> extends AbstractC11861a<E> implements List<E> {

    /* renamed from: j */
    public static final C11867a f30863j = new C11867a(null);

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00022\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00112\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\r2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m14357d2 = {"Lqf/c$a;", "", "", "index", "size", "", "a", "(II)V", "b", "fromIndex", "toIndex", "c", "(III)V", "", "e", "(Ljava/util/Collection;)I", "other", "", "d", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: qf.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11867a {
        private C11867a() {
        }

        public /* synthetic */ C11867a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m6808a(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: b */
        public final void m6807b(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void m6806c(int i, int i2, int i3) {
            if (i >= 0 && i2 <= i3) {
                if (i <= i2) {
                    return;
                }
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }

        /* renamed from: d */
        public final boolean m6805d(Collection<?> c, Collection<?> other) {
            C9612q.m13917h(c, "c");
            C9612q.m13917h(other, "other");
            if (c.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c.iterator();
            while (it2.hasNext()) {
                if (!C9612q.m13922c(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final int m6804e(Collection<?> c) {
            int i;
            C9612q.m13917h(c, "c");
            int i2 = 1;
            for (Object obj : c) {
                int i3 = i2 * 31;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
            return i2;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lqf/c$b;", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "j", "I", "a", "()I", "e", "(I)V", "index", "<init>", "(Lqf/c;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: qf.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11868b implements Iterator<E>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private int f30864j;

        public C11868b() {
            AbstractC11866c.this = r1;
        }

        /* renamed from: a */
        protected final int m6803a() {
            return this.f30864j;
        }

        /* renamed from: e */
        protected final void m6802e(int i) {
            this.f30864j = i;
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
            return this.f30864j < AbstractC11866c.this.size();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public E next() {
            if (hasNext()) {
                AbstractC11866c<E> abstractC11866c = AbstractC11866c.this;
                int i = this.f30864j;
                this.f30864j = i + 1;
                return abstractC11866c.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, m14357d2 = {"Lqf/c$c;", "Lqf/c$b;", "Lqf/c;", "", "", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "index", "<init>", "(Lqf/c;I)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: qf.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class C11869c extends AbstractC11866c<E>.C11868b implements ListIterator<E> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11869c(int i) {
            super();
            AbstractC11866c.this = r2;
            AbstractC11866c.f30863j.m6807b(i, r2.size());
            m6802e(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m6803a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m6803a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                AbstractC11866c<E> abstractC11866c = AbstractC11866c.this;
                m6802e(m6803a() - 1);
                return abstractC11866c.get(m6803a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m6803a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m14357d2 = {"Lqf/c$d;", "E", "Lqf/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "get", "(I)Ljava/lang/Object;", "k", "Lqf/c;", "list", "l", "I", "fromIndex", "m", "_size", "a", "()I", "size", "toIndex", "<init>", "(Lqf/c;II)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: qf.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C11870d<E> extends AbstractC11866c<E> implements RandomAccess {

        /* renamed from: k */
        private final AbstractC11866c<E> f30867k;

        /* renamed from: l */
        private final int f30868l;

        /* renamed from: m */
        private int f30869m;

        /* JADX WARN: Multi-variable type inference failed */
        public C11870d(AbstractC11866c<? extends E> list, int i, int i2) {
            C9612q.m13917h(list, "list");
            this.f30867k = list;
            this.f30868l = i;
            AbstractC11866c.f30863j.m6806c(i, i2, list.size());
            this.f30869m = i2 - i;
        }

        @Override // p304qf.AbstractC11861a
        /* renamed from: a */
        public int mo3916a() {
            return this.f30869m;
        }

        @Override // p304qf.AbstractC11866c, java.util.List
        public E get(int i) {
            AbstractC11866c.f30863j.m6808a(i, this.f30869m);
            return this.f30867k.get(this.f30868l + i);
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f30863j.m6805d(this, (Collection) obj);
    }

    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f30863j.m6804e(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (!C9612q.m13922c(e2, e)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        return new C11868b();
    }

    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C9612q.m13922c(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C11869c(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new C11870d(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C11869c(i);
    }
}