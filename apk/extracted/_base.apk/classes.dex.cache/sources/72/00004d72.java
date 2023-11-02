package p351t9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: t9.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC12610f<T> implements Iterator<T>, p164j$.util.Iterator {

    /* renamed from: j */
    private T f32702j;

    /* renamed from: k */
    private int f32703k = 2;

    /* renamed from: a */
    protected abstract T mo4712a();

    /* renamed from: b */
    public final T m4718b() {
        this.f32703k = 3;
        return null;
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
    public final boolean hasNext() {
        int i = this.f32703k;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    return true;
                }
                if (i2 != 2) {
                    this.f32703k = 4;
                    this.f32702j = mo4712a();
                    if (this.f32703k != 3) {
                        this.f32703k = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f32703k = 2;
            T t = this.f32702j;
            this.f32702j = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}