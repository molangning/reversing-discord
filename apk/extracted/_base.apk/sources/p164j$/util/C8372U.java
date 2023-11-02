package p164j$.util;

import java.util.Comparator;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.U */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8372U implements InterfaceC8356D {

    /* renamed from: a */
    private final double[] f22442a;

    /* renamed from: b */
    private int f22443b;

    /* renamed from: c */
    private final int f22444c;

    /* renamed from: d */
    private final int f22445d;

    public C8372U(double[] dArr, int i, int i2, int i3) {
        this.f22442a = dArr;
        this.f22443b = i;
        this.f22444c = i2;
        this.f22445d = i3 | 64 | 16384;
    }

    @Override // p164j$.util.InterfaceC8356D, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17604l(this, consumer);
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return this.f22445d;
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC8483n interfaceC8483n) {
        int i;
        interfaceC8483n.getClass();
        double[] dArr = this.f22442a;
        int length = dArr.length;
        int i2 = this.f22444c;
        if (length < i2 || (i = this.f22443b) < 0) {
            return;
        }
        this.f22443b = i2;
        if (i < i2) {
            do {
                interfaceC8483n.accept(dArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        return this.f22444c - this.f22443b;
    }

    @Override // p164j$.util.InterfaceC8356D, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17609e(this, consumer);
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

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: p */
    public final boolean tryAdvance(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        int i = this.f22443b;
        if (i < 0 || i >= this.f22444c) {
            return false;
        }
        this.f22443b = i + 1;
        interfaceC8483n.accept(this.f22442a[i]);
        return true;
    }

    @Override // p164j$.util.Spliterator
    public final InterfaceC8356D trySplit() {
        int i = this.f22443b;
        int i2 = (this.f22444c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f22443b = i2;
        return new C8372U(this.f22442a, i, i2, this.f22445d);
    }
}
