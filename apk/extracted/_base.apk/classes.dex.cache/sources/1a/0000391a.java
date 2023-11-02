package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: io.sentry.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7915f<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    /* renamed from: j */
    private transient E[] f21570j;

    /* renamed from: k */
    private transient int f21571k = 0;

    /* renamed from: l */
    private transient int f21572l = 0;

    /* renamed from: m */
    private transient boolean f21573m = false;

    /* renamed from: n */
    private final int f21574n;

    /* renamed from: io.sentry.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7916a implements Iterator<E>, p164j$.util.Iterator {

        /* renamed from: j */
        private int f21575j;

        /* renamed from: k */
        private int f21576k = -1;

        /* renamed from: l */
        private boolean f21577l;

        C7916a() {
            C7915f.this = r2;
            this.f21575j = r2.f21571k;
            this.f21577l = r2.f21573m;
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
            return this.f21577l || this.f21575j != C7915f.this.f21572l;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public E next() {
            if (hasNext()) {
                this.f21577l = false;
                int i = this.f21575j;
                this.f21576k = i;
                this.f21575j = C7915f.this.m19274t(i);
                return (E) C7915f.this.f21570j[this.f21576k];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            int i = this.f21576k;
            if (i != -1) {
                if (i == C7915f.this.f21571k) {
                    C7915f.this.remove();
                    this.f21576k = -1;
                    return;
                }
                int i2 = this.f21576k + 1;
                if (C7915f.this.f21571k < this.f21576k && i2 < C7915f.this.f21572l) {
                    System.arraycopy(C7915f.this.f21570j, i2, C7915f.this.f21570j, this.f21576k, C7915f.this.f21572l - i2);
                } else {
                    while (i2 != C7915f.this.f21572l) {
                        if (i2 >= C7915f.this.f21574n) {
                            C7915f.this.f21570j[i2 - 1] = C7915f.this.f21570j[0];
                            i2 = 0;
                        } else {
                            C7915f.this.f21570j[C7915f.this.m19275s(i2)] = C7915f.this.f21570j[i2];
                            i2 = C7915f.this.m19274t(i2);
                        }
                    }
                }
                this.f21576k = -1;
                C7915f c7915f = C7915f.this;
                c7915f.f21572l = c7915f.m19275s(c7915f.f21572l);
                C7915f.this.f21570j[C7915f.this.f21572l] = null;
                C7915f.this.f21573m = false;
                this.f21575j = C7915f.this.m19275s(this.f21575j);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C7915f(int i) {
        if (i > 0) {
            E[] eArr = (E[]) new Object[i];
            this.f21570j = eArr;
            this.f21574n = eArr.length;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    /* renamed from: s */
    public int m19275s(int i) {
        int i2 = i - 1;
        return i2 < 0 ? this.f21574n - 1 : i2;
    }

    /* renamed from: t */
    public int m19274t(int i) {
        int i2 = i + 1;
        if (i2 >= this.f21574n) {
            return 0;
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        if (e != null) {
            if (m19273u()) {
                remove();
            }
            E[] eArr = this.f21570j;
            int i = this.f21572l;
            int i2 = i + 1;
            this.f21572l = i2;
            eArr[i] = e;
            if (i2 >= this.f21574n) {
                this.f21572l = 0;
            }
            if (this.f21572l == this.f21571k) {
                this.f21573m = true;
            }
            return true;
        }
        throw new NullPointerException("Attempted to add null object to queue");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f21573m = false;
        this.f21571k = 0;
        this.f21572l = 0;
        Arrays.fill(this.f21570j, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new C7916a();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        return add(e);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f21570j[this.f21571k];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (!isEmpty()) {
            E[] eArr = this.f21570j;
            int i = this.f21571k;
            E e = eArr[i];
            if (e != null) {
                int i2 = i + 1;
                this.f21571k = i2;
                eArr[i] = null;
                if (i2 >= this.f21574n) {
                    this.f21571k = 0;
                }
                this.f21573m = false;
            }
            return e;
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i;
        int i2 = this.f21572l;
        int i3 = this.f21571k;
        if (i2 < i3) {
            return (this.f21574n - i3) + i2;
        }
        if (i2 == i3) {
            if (this.f21573m) {
                i = this.f21574n;
            } else {
                i = 0;
            }
            return i;
        }
        return i2 - i3;
    }

    /* renamed from: u */
    public boolean m19273u() {
        return size() == this.f21574n;
    }
}