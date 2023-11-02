package gb;

import java.util.NoSuchElementException;
import p102fb.C6378h;

/* renamed from: gb.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC6600a<E> extends AbstractC6710v0<E> {

    /* renamed from: j */
    private final int f18763j;

    /* renamed from: k */
    private int f18764k;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6600a(int i, int i2) {
        C6378h.m22832l(i2, i);
        this.f18763j = i;
        this.f18764k = i2;
    }

    /* renamed from: a */
    protected abstract E mo22043a(int i);

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final boolean hasNext() {
        return this.f18764k < this.f18763j;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18764k > 0;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final E next() {
        if (hasNext()) {
            int i = this.f18764k;
            this.f18764k = i + 1;
            return mo22043a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18764k;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f18764k - 1;
            this.f18764k = i;
            return mo22043a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18764k - 1;
    }
}
