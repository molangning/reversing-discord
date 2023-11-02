package gb;

import java.util.Iterator;
import p102fb.C6378h;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: gb.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC6700t0<F, T> implements Iterator<T>, p164j$.util.Iterator {

    /* renamed from: j */
    final Iterator<? extends F> f18901j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6700t0(Iterator<? extends F> it) {
        this.f18901j = (Iterator) C6378h.m22834j(it);
    }

    /* renamed from: a */
    abstract T mo22114a(F f);

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
        return this.f18901j.hasNext();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final T next() {
        return mo22114a(this.f18901j.next());
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final void remove() {
        this.f18901j.remove();
    }
}
