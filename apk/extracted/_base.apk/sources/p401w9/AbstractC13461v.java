package p401w9;

import java.util.NoSuchElementException;

/* renamed from: w9.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC13461v extends AbstractC13449j {

    /* renamed from: j */
    private final int f34699j;

    /* renamed from: k */
    private int f34700k;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC13461v(int i, int i2) {
        C13459t.m2440b(i2, i, "index");
        this.f34699j = i;
        this.f34700k = i2;
    }

    /* renamed from: a */
    protected abstract Object mo2426a(int i);

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final boolean hasNext() {
        return this.f34700k < this.f34699j;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f34700k > 0;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f34700k;
            this.f34700k = i + 1;
            return mo2426a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f34700k;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f34700k - 1;
            this.f34700k = i;
            return mo2426a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f34700k - 1;
    }
}
