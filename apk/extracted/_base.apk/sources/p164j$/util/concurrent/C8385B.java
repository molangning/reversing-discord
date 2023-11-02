package p164j$.util.concurrent;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8362J;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.concurrent.B */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8385B implements InterfaceC8362J {

    /* renamed from: a */
    long f22473a;

    /* renamed from: b */
    final long f22474b;

    /* renamed from: c */
    final long f22475c;

    /* renamed from: d */
    final long f22476d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8385B(long j, long j2, long j3, long j4) {
        this.f22473a = j;
        this.f22474b = j2;
        this.f22475c = j3;
        this.f22476d = j4;
    }

    @Override // p164j$.util.InterfaceC8362J, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17602n(this, consumer);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        long j = this.f22473a;
        long j2 = this.f22474b;
        if (j < j2) {
            this.f22473a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                interfaceC8468f0.accept(current.m17744e(this.f22475c, this.f22476d));
                j++;
            } while (j < j2);
        }
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: e */
    public final C8385B trySplit() {
        long j = this.f22473a;
        long j2 = (this.f22474b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f22473a = j2;
        return new C8385B(j, j2, this.f22475c, this.f22476d);
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        return this.f22474b - this.f22473a;
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: f */
    public final boolean tryAdvance(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        long j = this.f22473a;
        if (j < this.f22474b) {
            interfaceC8468f0.accept(ThreadLocalRandom.current().m17744e(this.f22475c, this.f22476d));
            this.f22473a = j + 1;
            return true;
        }
        return false;
    }

    @Override // p164j$.util.InterfaceC8362J, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17607h(this, consumer);
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
}
