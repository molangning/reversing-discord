package p164j$.util.concurrent;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8396k extends C8402q implements Spliterator {

    /* renamed from: i */
    public final /* synthetic */ int f22492i;

    /* renamed from: j */
    long f22493j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8396k(C8398m[] c8398mArr, int i, int i2, int i3, long j, int i4) {
        super(c8398mArr, i, i2, i3);
        this.f22492i = i4;
        this.f22493j = j;
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final boolean mo17305a(Consumer consumer) {
        switch (this.f22492i) {
            case 0:
                consumer.getClass();
                C8398m m17738e = m17738e();
                if (m17738e == null) {
                    return false;
                }
                consumer.accept(m17738e.f22498b);
                return true;
            default:
                consumer.getClass();
                C8398m m17738e2 = m17738e();
                if (m17738e2 == null) {
                    return false;
                }
                consumer.accept(m17738e2.f22499c);
                return true;
        }
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        switch (this.f22492i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f22492i) {
            case 0:
                return this.f22493j;
            default:
                return this.f22493j;
        }
    }

    @Override // p164j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f22492i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C8398m m17738e = m17738e();
                    if (m17738e == null) {
                        return;
                    }
                    consumer.accept(m17738e.f22498b);
                }
            default:
                consumer.getClass();
                while (true) {
                    C8398m m17738e2 = m17738e();
                    if (m17738e2 == null) {
                        return;
                    }
                    consumer.accept(m17738e2.f22499c);
                }
        }
    }

    @Override // p164j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f22492i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f22492i) {
            case 0:
                return AbstractC8516n.m17606i(this);
            default:
                return AbstractC8516n.m17606i(this);
        }
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.f22492i) {
            case 0:
                return AbstractC8516n.m17605j(this, i);
            default:
                return AbstractC8516n.m17605j(this, i);
        }
    }

    @Override // p164j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f22492i) {
            case 0:
                int i = this.f22510f;
                int i2 = this.f22511g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                C8398m[] c8398mArr = this.f22505a;
                int i4 = this.f22512h;
                this.f22511g = i3;
                long j = this.f22493j >>> 1;
                this.f22493j = j;
                return new C8396k(c8398mArr, i4, i3, i2, j, 0);
            default:
                int i5 = this.f22510f;
                int i6 = this.f22511g;
                int i7 = (i5 + i6) >>> 1;
                if (i7 <= i5) {
                    return null;
                }
                C8398m[] c8398mArr2 = this.f22505a;
                int i8 = this.f22512h;
                this.f22511g = i7;
                long j2 = this.f22493j >>> 1;
                this.f22493j = j2;
                return new C8396k(c8398mArr2, i8, i7, i6, j2, 1);
        }
    }
}
