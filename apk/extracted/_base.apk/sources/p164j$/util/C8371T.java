package p164j$.util;

import java.util.Comparator;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.T */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8371T implements Spliterator {

    /* renamed from: a */
    private final Object[] f22438a;

    /* renamed from: b */
    private int f22439b;

    /* renamed from: c */
    private final int f22440c;

    /* renamed from: d */
    private final int f22441d;

    public C8371T(Object[] objArr, int i, int i2, int i3) {
        this.f22438a = objArr;
        this.f22439b = i;
        this.f22440c = i2;
        this.f22441d = i3 | 64 | 16384;
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final boolean mo17305a(Consumer consumer) {
        consumer.getClass();
        int i = this.f22439b;
        if (i < 0 || i >= this.f22440c) {
            return false;
        }
        this.f22439b = i + 1;
        consumer.accept(this.f22438a[i]);
        return true;
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return this.f22441d;
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        return this.f22440c - this.f22439b;
    }

    @Override // p164j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.f22438a;
        int length = objArr.length;
        int i2 = this.f22440c;
        if (length < i2 || (i = this.f22439b) < 0) {
            return;
        }
        this.f22439b = i2;
        if (i < i2) {
            do {
                consumer.accept(objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p164j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC8516n.m17605j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC8516n.m17606i(this);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC8516n.m17605j(this, i);
    }

    @Override // p164j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f22439b;
        int i2 = (this.f22440c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f22439b = i2;
        return new C8371T(this.f22438a, i, i2, this.f22441d);
    }
}
