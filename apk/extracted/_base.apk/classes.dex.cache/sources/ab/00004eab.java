package p366u9;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u9.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12923p<E> extends AbstractC12902e0<E> {

    /* renamed from: j */
    private final int f33617j;

    /* renamed from: k */
    private int f33618k;

    public AbstractC12923p(int i, int i2) {
        C12919n.m3669g(i2, i);
        this.f33617j = i;
        this.f33618k = i2;
    }

    /* renamed from: a */
    protected abstract E mo3657a(int i);

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final boolean hasNext() {
        return this.f33618k < this.f33617j;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33618k > 0;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final E next() {
        if (hasNext()) {
            int i = this.f33618k;
            this.f33618k = i + 1;
            return mo3657a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33618k;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f33618k - 1;
            this.f33618k = i;
            return mo3657a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33618k - 1;
    }
}