package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.sentry.k5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C8005k5<E> implements Collection<E>, Serializable {

    /* renamed from: j */
    private final Collection<E> f21689j;

    /* renamed from: k */
    final Object f21690k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8005k5(Collection<E> collection) {
        if (collection != null) {
            this.f21689j = collection;
            this.f21690k = this;
            return;
        }
        throw new NullPointerException("Collection must not be null.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Collection<E> mo19007a() {
        return this.f21689j;
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        boolean add;
        synchronized (this.f21690k) {
            add = mo19007a().add(e);
        }
        return add;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean addAll;
        synchronized (this.f21690k) {
            addAll = mo19007a().addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f21690k) {
            mo19007a().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f21690k) {
            contains = mo19007a().contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        boolean containsAll;
        synchronized (this.f21690k) {
            containsAll = mo19007a().containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f21690k) {
            isEmpty = mo19007a().isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return mo19007a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f21690k) {
            remove = mo19007a().remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll;
        synchronized (this.f21690k) {
            removeAll = mo19007a().removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll;
        synchronized (this.f21690k) {
            retainAll = mo19007a().retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f21690k) {
            size = mo19007a().size();
        }
        return size;
    }

    public String toString() {
        String obj;
        synchronized (this.f21690k) {
            obj = mo19007a().toString();
        }
        return obj;
    }
}
