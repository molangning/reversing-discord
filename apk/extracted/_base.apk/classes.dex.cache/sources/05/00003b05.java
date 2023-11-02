package p164j$.util;

import java.util.Comparator;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8381b0 implements InterfaceC8362J {

    /* renamed from: a */
    private final long[] f22460a;

    /* renamed from: b */
    private int f22461b;

    /* renamed from: c */
    private final int f22462c;

    /* renamed from: d */
    private final int f22463d;

    public C8381b0(long[] jArr, int i, int i2, int i3) {
        this.f22460a = jArr;
        this.f22461b = i;
        this.f22462c = i2;
        this.f22463d = i3 | 64 | 16384;
    }

    @Override // p164j$.util.InterfaceC8362J, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17602n(this, consumer);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC8468f0 interfaceC8468f0) {
        int i;
        interfaceC8468f0.getClass();
        long[] jArr = this.f22460a;
        int length = jArr.length;
        int i2 = this.f22462c;
        if (length < i2 || (i = this.f22461b) < 0) {
            return;
        }
        this.f22461b = i2;
        if (i < i2) {
            do {
                interfaceC8468f0.accept(jArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return this.f22463d;
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        return this.f22462c - this.f22461b;
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: f */
    public final boolean tryAdvance(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        int i = this.f22461b;
        if (i < 0 || i >= this.f22462c) {
            return false;
        }
        this.f22461b = i + 1;
        interfaceC8468f0.accept(this.f22460a[i]);
        return true;
    }

    @Override // p164j$.util.InterfaceC8362J, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17607h(this, consumer);
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
    public final InterfaceC8362J trySplit() {
        int i = this.f22461b;
        int i2 = (this.f22462c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f22461b = i2;
        return new C8381b0(this.f22460a, i, i2, this.f22463d);
    }
}