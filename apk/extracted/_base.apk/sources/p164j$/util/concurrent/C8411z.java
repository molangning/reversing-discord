package p164j$.util.concurrent;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8356D;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.concurrent.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8411z implements InterfaceC8356D {

    /* renamed from: a */
    long f22527a;

    /* renamed from: b */
    final long f22528b;

    /* renamed from: c */
    final double f22529c;

    /* renamed from: d */
    final double f22530d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8411z(long j, long j2, double d, double d2) {
        this.f22527a = j;
        this.f22528b = j2;
        this.f22529c = d;
        this.f22530d = d2;
    }

    @Override // p164j$.util.InterfaceC8356D, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17604l(this, consumer);
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        long j = this.f22527a;
        long j2 = this.f22528b;
        if (j < j2) {
            this.f22527a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                interfaceC8483n.accept(current.m17746c(this.f22529c, this.f22530d));
                j++;
            } while (j < j2);
        }
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: e */
    public final C8411z trySplit() {
        long j = this.f22527a;
        long j2 = (this.f22528b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f22527a = j2;
        return new C8411z(j, j2, this.f22529c, this.f22530d);
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        return this.f22528b - this.f22527a;
    }

    @Override // p164j$.util.InterfaceC8356D, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17609e(this, consumer);
    }

    @Override // p164j$.util.Spliterator
    public final Comparator getComparator() {
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
        long j = this.f22527a;
        if (j < this.f22528b) {
            interfaceC8483n.accept(ThreadLocalRandom.current().m17746c(this.f22529c, this.f22530d));
            this.f22527a = j + 1;
            return true;
        }
        return false;
    }
}
