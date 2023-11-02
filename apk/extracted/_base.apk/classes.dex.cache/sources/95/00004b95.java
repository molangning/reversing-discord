package p324rf;

import cg.InterfaceC2533a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9612q;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;
import p304qf.AbstractC11866c;
import p304qf.AbstractC11872e;

@Metadata(m14358d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b+\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001SBO\b\u0002\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000*\u0012\u0006\u0010J\u001a\u00020\f\u0012\u0006\u0010L\u001a\u00020\f\u0012\u0006\u0010O\u001a\u00020\n\u0012\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\bY\u0010ZB\t\b\u0016¢\u0006\u0004\bY\u0010[B\u0011\b\u0016\u0012\u0006\u0010\\\u001a\u00020\f¢\u0006\u0004\bY\u0010]J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\r\u001a\u00020\fH\u0016J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0016\u0010 \u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u001e\u0010 \u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0017\u0010\"\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000fJ\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u001bJ\u0016\u0010$\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u0016\u0010%\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0016J)\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010*\"\u0004\b\u0001\u0010)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0*H\u0016¢\u0006\u0004\b,\u0010/J\u0013\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u00102\u001a\u00020\fH\u0016J\b\u00104\u001a\u000203H\u0016J\u0010\u00106\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\fH\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\u0010\u00109\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\fH\u0002J\u0014\u0010:\u001a\u00020\n2\n\u00100\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0018\u0010<\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0002J\u001f\u0010=\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b=\u0010\u001dJ&\u0010>\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u00108\u001a\u00020\fH\u0002J\u0017\u0010?\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010\u000fJ\u0018\u0010B\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fH\u0002J.\u0010D\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010C\u001a\u00020\nH\u0002R\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010O\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001c\u0010Q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010PR\u001c\u0010R\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010PR\u0014\u0010U\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006^"}, m14357d2 = {"Lrf/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lqf/e;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "r", "", "isEmpty", "", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "", "listIterator", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "clear", "e", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "T", "", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "", "toString", "minCapacity", "u", "s", "n", "v", "t", "i", "w", "p", "o", "y", "rangeOffset", "rangeLength", "z", "retain", "A", "j", "[Ljava/lang/Object;", "array", "k", "I", "offset", "l", "length", "m", "Z", "isReadOnly", "Lrf/b;", "backing", "root", "a", "()I", "size", "x", "()Z", "isEffectivelyReadOnly", "<init>", "([Ljava/lang/Object;IIZLrf/b;Lrf/b;)V", "()V", "initialCapacity", "(I)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: rf.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12133b<E> extends AbstractC11872e<E> implements RandomAccess, Serializable {

    /* renamed from: j */
    private E[] f31551j;

    /* renamed from: k */
    private int f31552k;

    /* renamed from: l */
    private int f31553l;

    /* renamed from: m */
    private boolean f31554m;

    /* renamed from: n */
    private final C12133b<E> f31555n;

    /* renamed from: o */
    private final C12133b<E> f31556o;

    @Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\b\u0016\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0011\u001a\u00020\rH\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, m14357d2 = {"Lrf/b$a;", "E", "", "", "hasPrevious", "hasNext", "", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lrf/b;", "j", "Lrf/b;", "list", "k", "I", "index", "l", "lastIndex", "<init>", "(Lrf/b;I)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: rf.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C12134a<E> implements ListIterator<E>, InterfaceC2533a, Iterator {

        /* renamed from: j */
        private final C12133b<E> f31557j;

        /* renamed from: k */
        private int f31558k;

        /* renamed from: l */
        private int f31559l;

        public C12134a(C12133b<E> list, int i) {
            C9612q.m13917h(list, "list");
            this.f31557j = list;
            this.f31558k = i;
            this.f31559l = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            C12133b<E> c12133b = this.f31557j;
            int i = this.f31558k;
            this.f31558k = i + 1;
            c12133b.add(i, e);
            this.f31559l = -1;
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f31558k < ((C12133b) this.f31557j).f31553l;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f31558k > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, p164j$.util.Iterator
        public E next() {
            if (this.f31558k < ((C12133b) this.f31557j).f31553l) {
                int i = this.f31558k;
                this.f31558k = i + 1;
                this.f31559l = i;
                return (E) ((C12133b) this.f31557j).f31551j[((C12133b) this.f31557j).f31552k + this.f31559l];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f31558k;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i = this.f31558k;
            if (i > 0) {
                int i2 = i - 1;
                this.f31558k = i2;
                this.f31559l = i2;
                return (E) ((C12133b) this.f31557j).f31551j[((C12133b) this.f31557j).f31552k + this.f31559l];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f31558k - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            boolean z;
            int i = this.f31559l;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f31557j.remove(i);
                this.f31558k = this.f31559l;
                this.f31559l = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            boolean z;
            int i = this.f31559l;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f31557j.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    private C12133b(E[] eArr, int i, int i2, boolean z, C12133b<E> c12133b, C12133b<E> c12133b2) {
        this.f31551j = eArr;
        this.f31552k = i;
        this.f31553l = i2;
        this.f31554m = z;
        this.f31555n = c12133b;
        this.f31556o = c12133b2;
    }

    /* renamed from: A */
    private final int m6129A(int i, int i2, Collection<? extends E> collection, boolean z) {
        C12133b<E> c12133b = this.f31555n;
        if (c12133b != null) {
            int m6129A = c12133b.m6129A(i, i2, collection, z);
            this.f31553l -= m6129A;
            return m6129A;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f31551j[i5]) == z) {
                E[] eArr = this.f31551j;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.f31551j;
        C9536e.m14272f(eArr2, eArr2, i + i4, i2 + i, this.f31553l);
        E[] eArr3 = this.f31551j;
        int i7 = this.f31553l;
        C12135c.m6106g(eArr3, i7 - i6, i7);
        this.f31553l -= i6;
        return i6;
    }

    /* renamed from: o */
    private final void m6123o(int i, Collection<? extends E> collection, int i2) {
        C12133b<E> c12133b = this.f31555n;
        if (c12133b != null) {
            c12133b.m6123o(i, collection, i2);
            this.f31551j = this.f31555n.f31551j;
            this.f31553l += i2;
            return;
        }
        m6116w(i, i2);
        java.util.Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f31551j[i + i3] = it.next();
        }
    }

    /* renamed from: p */
    private final void m6122p(int i, E e) {
        C12133b<E> c12133b = this.f31555n;
        if (c12133b != null) {
            c12133b.m6122p(i, e);
            this.f31551j = this.f31555n.f31551j;
            this.f31553l++;
            return;
        }
        m6116w(i, 1);
        this.f31551j[i] = e;
    }

    /* renamed from: s */
    private final void m6120s() {
        if (m6115x()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: t */
    private final boolean m6119t(List<?> list) {
        boolean m6105h;
        m6105h = C12135c.m6105h(this.f31551j, this.f31552k, this.f31553l, list);
        return m6105h;
    }

    /* renamed from: u */
    private final void m6118u(int i) {
        if (this.f31555n == null) {
            if (i >= 0) {
                E[] eArr = this.f31551j;
                if (i > eArr.length) {
                    this.f31551j = (E[]) C12135c.m6108e(this.f31551j, ArrayDeque.f25303m.m14338a(eArr.length, i));
                    return;
                }
                return;
            }
            throw new OutOfMemoryError();
        }
        throw new IllegalStateException();
    }

    /* renamed from: v */
    private final void m6117v(int i) {
        m6118u(this.f31553l + i);
    }

    /* renamed from: w */
    private final void m6116w(int i, int i2) {
        m6117v(i2);
        E[] eArr = this.f31551j;
        C9536e.m14272f(eArr, eArr, i + i2, i, this.f31552k + this.f31553l);
        this.f31553l += i2;
    }

    /* renamed from: x */
    private final boolean m6115x() {
        C12133b<E> c12133b;
        return this.f31554m || ((c12133b = this.f31556o) != null && c12133b.f31554m);
    }

    /* renamed from: y */
    private final E m6114y(int i) {
        C12133b<E> c12133b = this.f31555n;
        if (c12133b != null) {
            this.f31553l--;
            return c12133b.m6114y(i);
        }
        E[] eArr = this.f31551j;
        E e = eArr[i];
        C9536e.m14272f(eArr, eArr, i, i + 1, this.f31552k + this.f31553l);
        C12135c.m6107f(this.f31551j, (this.f31552k + this.f31553l) - 1);
        this.f31553l--;
        return e;
    }

    /* renamed from: z */
    private final void m6113z(int i, int i2) {
        C12133b<E> c12133b = this.f31555n;
        if (c12133b != null) {
            c12133b.m6113z(i, i2);
        } else {
            E[] eArr = this.f31551j;
            C9536e.m14272f(eArr, eArr, i, i + i2, this.f31553l);
            E[] eArr2 = this.f31551j;
            int i3 = this.f31553l;
            C12135c.m6106g(eArr2, i3 - i2, i3);
        }
        this.f31553l -= i2;
    }

    @Override // p304qf.AbstractC11872e
    /* renamed from: a */
    public int mo6128a() {
        return this.f31553l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m6120s();
        m6122p(this.f31552k + this.f31553l, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        C9612q.m13917h(elements, "elements");
        m6120s();
        int size = elements.size();
        m6123o(this.f31552k + this.f31553l, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m6120s();
        m6113z(this.f31552k, this.f31553l);
    }

    @Override // p304qf.AbstractC11872e
    /* renamed from: e */
    public E mo6127e(int i) {
        m6120s();
        AbstractC11866c.f30863j.m6808a(i, this.f31553l);
        return m6114y(this.f31552k + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && m6119t((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC11866c.f30863j.m6808a(i, this.f31553l);
        return this.f31551j[this.f31552k + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int m6104i;
        m6104i = C12135c.m6104i(this.f31551j, this.f31552k, this.f31553l);
        return m6104i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.f31553l; i++) {
            if (C9612q.m13922c(this.f31551j[this.f31552k + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f31553l == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        return new C12134a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.f31553l - 1; i >= 0; i--) {
            if (C9612q.m13922c(this.f31551j[this.f31552k + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new C12134a(this, 0);
    }

    /* renamed from: r */
    public final List<E> m6121r() {
        if (this.f31555n == null) {
            m6120s();
            this.f31554m = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m6120s();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        m6120s();
        if (m6129A(this.f31552k, this.f31553l, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        m6120s();
        if (m6129A(this.f31552k, this.f31553l, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m6120s();
        AbstractC11866c.f30863j.m6808a(i, this.f31553l);
        E[] eArr = this.f31551j;
        int i2 = this.f31552k;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i2) {
        C12133b<E> c12133b;
        AbstractC11866c.f30863j.m6806c(i, i2, this.f31553l);
        E[] eArr = this.f31551j;
        int i3 = this.f31552k + i;
        int i4 = i2 - i;
        boolean z = this.f31554m;
        C12133b<E> c12133b2 = this.f31556o;
        if (c12133b2 == null) {
            c12133b = this;
        } else {
            c12133b = c12133b2;
        }
        return new C12133b(eArr, i3, i4, z, this, c12133b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        C9612q.m13917h(destination, "destination");
        int length = destination.length;
        int i = this.f31553l;
        if (length < i) {
            E[] eArr = this.f31551j;
            int i2 = this.f31552k;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, destination.getClass());
            C9612q.m13918g(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.f31551j;
        int i3 = this.f31552k;
        C9536e.m14272f(eArr2, destination, 0, i3, i + i3);
        int length2 = destination.length;
        int i4 = this.f31553l;
        if (length2 > i4) {
            destination[i4] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String m6103j;
        m6103j = C12135c.m6103j(this.f31551j, this.f31552k, this.f31553l);
        return m6103j;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        AbstractC11866c.f30863j.m6807b(i, this.f31553l);
        return new C12134a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        m6120s();
        AbstractC11866c.f30863j.m6807b(i, this.f31553l);
        m6122p(this.f31552k + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> elements) {
        C9612q.m13917h(elements, "elements");
        m6120s();
        AbstractC11866c.f30863j.m6807b(i, this.f31553l);
        int size = elements.size();
        m6123o(this.f31552k + i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] m14268j;
        E[] eArr = this.f31551j;
        int i = this.f31552k;
        m14268j = C9536e.m14268j(eArr, i, this.f31553l + i);
        return m14268j;
    }

    public C12133b() {
        this(10);
    }

    public C12133b(int i) {
        this(C12135c.m6109d(i), 0, 0, false, null, null);
    }
}