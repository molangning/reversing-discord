package io.sentry;

import java.util.Queue;

/* renamed from: io.sentry.l5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C8013l5<E> extends C8005k5<E> implements Queue<E> {
    private C8013l5(Queue<E> queue) {
        super(queue);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <E> C8013l5<E> m19005e(Queue<E> queue) {
        return new C8013l5<>(queue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.C8005k5
    /* renamed from: d */
    public Queue<E> mo19007a() {
        return (Queue) super.mo19007a();
    }

    @Override // java.util.Queue
    public E element() {
        E element;
        synchronized (this.f21690k) {
            element = mo19007a().element();
        }
        return element;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f21690k) {
            equals = mo19007a().equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.f21690k) {
            hashCode = mo19007a().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        boolean offer;
        synchronized (this.f21690k) {
            offer = mo19007a().offer(e);
        }
        return offer;
    }

    @Override // java.util.Queue
    public E peek() {
        E peek;
        synchronized (this.f21690k) {
            peek = mo19007a().peek();
        }
        return peek;
    }

    @Override // java.util.Queue
    public E poll() {
        E poll;
        synchronized (this.f21690k) {
            poll = mo19007a().poll();
        }
        return poll;
    }

    @Override // java.util.Queue
    public E remove() {
        E remove;
        synchronized (this.f21690k) {
            remove = mo19007a().remove();
        }
        return remove;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f21690k) {
            array = mo19007a().toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f21690k) {
            tArr2 = (T[]) mo19007a().toArray(tArr);
        }
        return tArr2;
    }
}
