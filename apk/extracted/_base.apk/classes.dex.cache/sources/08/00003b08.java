package p164j$.util.concurrent;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8359G;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.concurrent.A */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8384A implements InterfaceC8359G {

    /* renamed from: a */
    long f22469a;

    /* renamed from: b */
    final long f22470b;

    /* renamed from: c */
    final int f22471c;

    /* renamed from: d */
    final int f22472d;

    public C8384A(long j, long j2, int i, int i2) {
        this.f22469a = j;
        this.f22470b = j2;
        this.f22471c = i;
        this.f22472d = i2;
    }

    @Override // p164j$.util.InterfaceC8359G, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17603m(this, consumer);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: c */
    public final void forEachRemaining(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        long j = this.f22469a;
        long j2 = this.f22470b;
        if (j < j2) {
            this.f22469a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                interfaceC8437K.accept(current.m17745d(this.f22471c, this.f22472d));
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
    public final C8384A trySplit() {
        long j = this.f22469a;
        long j2 = (this.f22470b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f22469a = j2;
        return new C8384A(j, j2, this.f22471c, this.f22472d);
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        return this.f22470b - this.f22469a;
    }

    @Override // p164j$.util.InterfaceC8359G, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17608g(this, consumer);
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
    /* renamed from: k */
    public final boolean tryAdvance(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        long j = this.f22469a;
        if (j < this.f22470b) {
            interfaceC8437K.accept(ThreadLocalRandom.current().m17745d(this.f22471c, this.f22472d));
            this.f22469a = j + 1;
            return true;
        }
        return false;
    }
}