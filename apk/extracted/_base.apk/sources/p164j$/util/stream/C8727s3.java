package p164j$.util.stream;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8727s3 extends AbstractC8732t3 implements Spliterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8727s3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2, 0L, Math.min(spliterator.estimateSize(), j2));
    }

    private C8727s3(Spliterator spliterator, long j, long j2, long j3, long j4) {
        super(spliterator, j, j2, j3, j4);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final boolean mo17305a(Consumer consumer) {
        long j;
        consumer.getClass();
        long j2 = this.f22954e;
        long j3 = this.f22950a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.f22953d;
            if (j3 <= j) {
                break;
            }
            this.f22952c.mo17305a(new C8603S1(7));
            this.f22953d++;
        }
        if (j >= this.f22954e) {
            return false;
        }
        this.f22953d = j + 1;
        return this.f22952c.mo17305a(consumer);
    }

    @Override // p164j$.util.stream.AbstractC8732t3
    /* renamed from: e */
    protected final Spliterator mo17385e(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C8727s3(spliterator, j, j2, j3, j4);
    }

    @Override // p164j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        long j = this.f22954e;
        long j2 = this.f22950a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.f22953d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && this.f22952c.estimateSize() + j3 <= this.f22951b) {
            this.f22952c.forEachRemaining(consumer);
            this.f22953d = this.f22954e;
            return;
        }
        while (j2 > this.f22953d) {
            this.f22952c.mo17305a(new C8603S1(6));
            this.f22953d++;
        }
        while (this.f22953d < this.f22954e) {
            this.f22952c.mo17305a(consumer);
            this.f22953d++;
        }
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
