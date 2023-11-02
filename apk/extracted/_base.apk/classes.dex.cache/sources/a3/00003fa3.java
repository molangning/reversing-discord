package kotlin.collections;

import com.facebook.react.uimanager.ViewDefaults;
import gg.C6759j;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.AbstractC11866c;
import p304qf.AbstractC11872e;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 A*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001<B\t\b\u0016¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001d\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u001e\u0010 \u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0018\u0010!\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b%\u0010\u001eJ\u0017\u0010&\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010*\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010\"J\u0016\u0010+\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0016\u0010,\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J)\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010/\"\u0004\b\u0001\u0010.2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030/H\u0016¢\u0006\u0004\b1\u00104R\u0016\u00107\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R$\u0010>\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=¨\u0006B"}, m14357d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lqf/e;", "", "minCapacity", "", "o", "newCapacity", "i", "index", "s", "r", "p", "k", "internalIndex", "", "elements", "h", "", "isEmpty", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "()Ljava/lang/Object;", "t", "removeLast", "u", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "e", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "j", "I", "head", "[Ljava/lang/Object;", "elementData", "<set-?>", "l", "a", "()I", "size", "<init>", "()V", "m", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ArrayDeque<E> extends AbstractC11872e<E> {

    /* renamed from: m */
    public static final C9531a f25303m = new C9531a(null);

    /* renamed from: n */
    private static final Object[] f25304n = new Object[0];

    /* renamed from: j */
    private int f25305j;

    /* renamed from: k */
    private Object[] f25306k = f25304n;

    /* renamed from: l */
    private int f25307l;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, m14357d2 = {"Lkotlin/collections/ArrayDeque$a;", "", "", "oldCapacity", "minCapacity", "a", "(II)I", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "maxArraySize", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.collections.ArrayDeque$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9531a {
        private C9531a() {
        }

        public /* synthetic */ C9531a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m14338a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 > 0) {
                if (i2 > 2147483639) {
                    return ViewDefaults.NUMBER_OF_LINES;
                }
                return 2147483639;
            }
            return i3;
        }
    }

    /* renamed from: h */
    private final void m14347h(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f25306k.length;
        while (i < length && it.hasNext()) {
            this.f25306k[i] = it.next();
            i++;
        }
        int i2 = this.f25305j;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f25306k[i3] = it.next();
        }
        this.f25307l = size() + collection.size();
    }

    /* renamed from: i */
    private final void m14346i(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f25306k;
        C9536e.m14272f(objArr2, objArr, 0, this.f25305j, objArr2.length);
        Object[] objArr3 = this.f25306k;
        int length = objArr3.length;
        int i2 = this.f25305j;
        C9536e.m14272f(objArr3, objArr, length - i2, 0, i2);
        this.f25305j = 0;
        this.f25306k = objArr;
    }

    /* renamed from: k */
    private final int m14345k(int i) {
        int m14239I;
        if (i == 0) {
            m14239I = C9538f.m14239I(this.f25306k);
            return m14239I;
        }
        return i - 1;
    }

    /* renamed from: o */
    private final void m14344o(int i) {
        int m21930c;
        if (i >= 0) {
            Object[] objArr = this.f25306k;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == f25304n) {
                m21930c = C6759j.m21930c(i, 10);
                this.f25306k = new Object[m21930c];
                return;
            }
            m14346i(f25303m.m14338a(objArr.length, i));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* renamed from: p */
    private final int m14343p(int i) {
        int m14239I;
        m14239I = C9538f.m14239I(this.f25306k);
        if (i == m14239I) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: r */
    private final int m14342r(int i) {
        return i < 0 ? i + this.f25306k.length : i;
    }

    /* renamed from: s */
    private final int m14341s(int i) {
        Object[] objArr = this.f25306k;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // p304qf.AbstractC11872e
    /* renamed from: a */
    public int mo6128a() {
        return this.f25307l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        C9612q.m13917h(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m14344o(size() + elements.size());
        m14347h(m14341s(this.f25305j + size()), elements);
        return true;
    }

    public final void addFirst(E e) {
        m14344o(size() + 1);
        int m14345k = m14345k(this.f25305j);
        this.f25305j = m14345k;
        this.f25306k[m14345k] = e;
        this.f25307l = size() + 1;
    }

    public final void addLast(E e) {
        m14344o(size() + 1);
        this.f25306k[m14341s(this.f25305j + size())] = e;
        this.f25307l = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int m14341s = m14341s(this.f25305j + size());
        int i = this.f25305j;
        if (i < m14341s) {
            C9536e.m14266l(this.f25306k, null, i, m14341s);
        } else if (!isEmpty()) {
            Object[] objArr = this.f25306k;
            C9536e.m14266l(objArr, null, this.f25305j, objArr.length);
            C9536e.m14266l(this.f25306k, null, 0, m14341s);
        }
        this.f25305j = 0;
        this.f25307l = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p304qf.AbstractC11872e
    /* renamed from: e */
    public E mo6127e(int i) {
        int m14102k;
        int m14102k2;
        AbstractC11866c.f30863j.m6808a(i, size());
        m14102k = C9545j.m14102k(this);
        if (i == m14102k) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int m14341s = m14341s(this.f25305j + i);
        E e = (E) this.f25306k[m14341s];
        if (i < (size() >> 1)) {
            int i2 = this.f25305j;
            if (m14341s >= i2) {
                Object[] objArr = this.f25306k;
                C9536e.m14272f(objArr, objArr, i2 + 1, i2, m14341s);
            } else {
                Object[] objArr2 = this.f25306k;
                C9536e.m14272f(objArr2, objArr2, 1, 0, m14341s);
                Object[] objArr3 = this.f25306k;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f25305j;
                C9536e.m14272f(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f25306k;
            int i4 = this.f25305j;
            objArr4[i4] = null;
            this.f25305j = m14343p(i4);
        } else {
            int i5 = this.f25305j;
            m14102k2 = C9545j.m14102k(this);
            int m14341s2 = m14341s(i5 + m14102k2);
            if (m14341s <= m14341s2) {
                Object[] objArr5 = this.f25306k;
                C9536e.m14272f(objArr5, objArr5, m14341s, m14341s + 1, m14341s2 + 1);
            } else {
                Object[] objArr6 = this.f25306k;
                C9536e.m14272f(objArr6, objArr6, m14341s, m14341s + 1, objArr6.length);
                Object[] objArr7 = this.f25306k;
                objArr7[objArr7.length - 1] = objArr7[0];
                C9536e.m14272f(objArr7, objArr7, 0, 1, m14341s2 + 1);
            }
            this.f25306k[m14341s2] = null;
        }
        this.f25307l = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC11866c.f30863j.m6808a(i, size());
        return (E) this.f25306k[m14341s(this.f25305j + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int m14341s = m14341s(this.f25305j + size());
        int i2 = this.f25305j;
        if (i2 < m14341s) {
            while (i2 < m14341s) {
                if (C9612q.m13922c(obj, this.f25306k[i2])) {
                    i = this.f25305j;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 >= m14341s) {
            int length = this.f25306k.length;
            while (true) {
                if (i2 < length) {
                    if (C9612q.m13922c(obj, this.f25306k[i2])) {
                        i = this.f25305j;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < m14341s; i3++) {
                        if (C9612q.m13922c(obj, this.f25306k[i3])) {
                            i2 = i3 + this.f25306k.length;
                            i = this.f25305j;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int m14239I;
        int i;
        int m14341s = m14341s(this.f25305j + size());
        int i2 = this.f25305j;
        if (i2 < m14341s) {
            m14239I = m14341s - 1;
            if (i2 <= m14239I) {
                while (!C9612q.m13922c(obj, this.f25306k[m14239I])) {
                    if (m14239I != i2) {
                        m14239I--;
                    }
                }
                i = this.f25305j;
                return m14239I - i;
            }
            return -1;
        }
        if (i2 > m14341s) {
            int i3 = m14341s - 1;
            while (true) {
                if (-1 < i3) {
                    if (C9612q.m13922c(obj, this.f25306k[i3])) {
                        m14239I = i3 + this.f25306k.length;
                        i = this.f25305j;
                        break;
                    }
                    i3--;
                } else {
                    m14239I = C9538f.m14239I(this.f25306k);
                    int i4 = this.f25305j;
                    if (i4 <= m14239I) {
                        while (!C9612q.m13922c(obj, this.f25306k[m14239I])) {
                            if (m14239I != i4) {
                                m14239I--;
                            }
                        }
                        i = this.f25305j;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        byte b;
        int m14341s;
        C9612q.m13917h(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.f25306k.length == 0) {
                b = 1;
            } else {
                b = 0;
            }
            if (b == 0) {
                int m14341s2 = m14341s(this.f25305j + size());
                int i = this.f25305j;
                if (i < m14341s2) {
                    m14341s = i;
                    while (i < m14341s2) {
                        Object obj = this.f25306k[i];
                        if (!elements.contains(obj)) {
                            this.f25306k[m14341s] = obj;
                            m14341s++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    C9536e.m14266l(this.f25306k, null, m14341s, m14341s2);
                } else {
                    int length = this.f25306k.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f25306k;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (!elements.contains(obj2)) {
                            this.f25306k[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    m14341s = m14341s(i2);
                    for (int i3 = 0; i3 < m14341s2; i3++) {
                        Object[] objArr2 = this.f25306k;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!elements.contains(obj3)) {
                            this.f25306k[m14341s] = obj3;
                            m14341s = m14343p(m14341s);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f25307l = m14342r(m14341s - this.f25305j);
                }
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f25306k;
            int i = this.f25305j;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.f25305j = m14343p(i);
            this.f25307l = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        int m14102k;
        if (!isEmpty()) {
            int i = this.f25305j;
            m14102k = C9545j.m14102k(this);
            int m14341s = m14341s(i + m14102k);
            Object[] objArr = this.f25306k;
            E e = (E) objArr[m14341s];
            objArr[m14341s] = null;
            this.f25307l = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        byte b;
        int m14341s;
        C9612q.m13917h(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.f25306k.length == 0) {
                b = 1;
            } else {
                b = 0;
            }
            if (b == 0) {
                int m14341s2 = m14341s(this.f25305j + size());
                int i = this.f25305j;
                if (i < m14341s2) {
                    m14341s = i;
                    while (i < m14341s2) {
                        Object obj = this.f25306k[i];
                        if (elements.contains(obj)) {
                            this.f25306k[m14341s] = obj;
                            m14341s++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    C9536e.m14266l(this.f25306k, null, m14341s, m14341s2);
                } else {
                    int length = this.f25306k.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f25306k;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (elements.contains(obj2)) {
                            this.f25306k[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    m14341s = m14341s(i2);
                    for (int i3 = 0; i3 < m14341s2; i3++) {
                        Object[] objArr2 = this.f25306k;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (elements.contains(obj3)) {
                            this.f25306k[m14341s] = obj3;
                            m14341s = m14343p(m14341s);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f25307l = m14342r(m14341s - this.f25305j);
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractC11866c.f30863j.m6808a(i, size());
        int m14341s = m14341s(this.f25305j + i);
        Object[] objArr = this.f25306k;
        E e2 = (E) objArr[m14341s];
        objArr[m14341s] = e;
        return e2;
    }

    /* renamed from: t */
    public final E m14340t() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        C9612q.m13917h(array, "array");
        if (array.length < size()) {
            array = (T[]) C9534c.m14277a(array, size());
        }
        int m14341s = m14341s(this.f25305j + size());
        int i = this.f25305j;
        if (i < m14341s) {
            C9536e.m14270h(this.f25306k, array, 0, i, m14341s, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f25306k;
            C9536e.m14272f(objArr, array, 0, this.f25305j, objArr.length);
            Object[] objArr2 = this.f25306k;
            C9536e.m14272f(objArr2, array, objArr2.length - this.f25305j, 0, m14341s);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    /* renamed from: u */
    public final E m14339u() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        AbstractC11866c.f30863j.m6807b(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            m14344o(size() + 1);
            int m14341s = m14341s(this.f25305j + i);
            if (i < ((size() + 1) >> 1)) {
                int m14345k = m14345k(m14341s);
                int m14345k2 = m14345k(this.f25305j);
                int i2 = this.f25305j;
                if (m14345k >= i2) {
                    Object[] objArr = this.f25306k;
                    objArr[m14345k2] = objArr[i2];
                    C9536e.m14272f(objArr, objArr, i2, i2 + 1, m14345k + 1);
                } else {
                    Object[] objArr2 = this.f25306k;
                    C9536e.m14272f(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f25306k;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C9536e.m14272f(objArr3, objArr3, 0, 1, m14345k + 1);
                }
                this.f25306k[m14345k] = e;
                this.f25305j = m14345k2;
            } else {
                int m14341s2 = m14341s(this.f25305j + size());
                if (m14341s < m14341s2) {
                    Object[] objArr4 = this.f25306k;
                    C9536e.m14272f(objArr4, objArr4, m14341s + 1, m14341s, m14341s2);
                } else {
                    Object[] objArr5 = this.f25306k;
                    C9536e.m14272f(objArr5, objArr5, 1, 0, m14341s2);
                    Object[] objArr6 = this.f25306k;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C9536e.m14272f(objArr6, objArr6, m14341s + 1, m14341s, objArr6.length - 1);
                }
                this.f25306k[m14341s] = e;
            }
            this.f25307l = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> elements) {
        C9612q.m13917h(elements, "elements");
        AbstractC11866c.f30863j.m6807b(i, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(elements);
        }
        m14344o(size() + elements.size());
        int m14341s = m14341s(this.f25305j + size());
        int m14341s2 = m14341s(this.f25305j + i);
        int size = elements.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f25305j;
            int i3 = i2 - size;
            if (m14341s2 < i2) {
                Object[] objArr = this.f25306k;
                C9536e.m14272f(objArr, objArr, i3, i2, objArr.length);
                if (size >= m14341s2) {
                    Object[] objArr2 = this.f25306k;
                    C9536e.m14272f(objArr2, objArr2, objArr2.length - size, 0, m14341s2);
                } else {
                    Object[] objArr3 = this.f25306k;
                    C9536e.m14272f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f25306k;
                    C9536e.m14272f(objArr4, objArr4, 0, size, m14341s2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f25306k;
                C9536e.m14272f(objArr5, objArr5, i3, i2, m14341s2);
            } else {
                Object[] objArr6 = this.f25306k;
                i3 += objArr6.length;
                int i4 = m14341s2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    C9536e.m14272f(objArr6, objArr6, i3, i2, m14341s2);
                } else {
                    C9536e.m14272f(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f25306k;
                    C9536e.m14272f(objArr7, objArr7, 0, this.f25305j + length, m14341s2);
                }
            }
            this.f25305j = i3;
            m14347h(m14342r(m14341s2 - size), elements);
        } else {
            int i5 = m14341s2 + size;
            if (m14341s2 < m14341s) {
                int i6 = size + m14341s;
                Object[] objArr8 = this.f25306k;
                if (i6 <= objArr8.length) {
                    C9536e.m14272f(objArr8, objArr8, i5, m14341s2, m14341s);
                } else if (i5 >= objArr8.length) {
                    C9536e.m14272f(objArr8, objArr8, i5 - objArr8.length, m14341s2, m14341s);
                } else {
                    int length2 = m14341s - (i6 - objArr8.length);
                    C9536e.m14272f(objArr8, objArr8, 0, length2, m14341s);
                    Object[] objArr9 = this.f25306k;
                    C9536e.m14272f(objArr9, objArr9, i5, m14341s2, length2);
                }
            } else {
                Object[] objArr10 = this.f25306k;
                C9536e.m14272f(objArr10, objArr10, size, 0, m14341s);
                Object[] objArr11 = this.f25306k;
                if (i5 >= objArr11.length) {
                    C9536e.m14272f(objArr11, objArr11, i5 - objArr11.length, m14341s2, objArr11.length);
                } else {
                    C9536e.m14272f(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f25306k;
                    C9536e.m14272f(objArr12, objArr12, i5, m14341s2, objArr12.length - size);
                }
            }
            m14347h(m14341s2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}