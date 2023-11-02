package p164j$.util.concurrent;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8392g extends C8402q implements Spliterator {

    /* renamed from: i */
    final ConcurrentHashMap f22488i;

    /* renamed from: j */
    long f22489j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8392g(C8398m[] c8398mArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(c8398mArr, i, i2, i3);
        this.f22488i = concurrentHashMap;
        this.f22489j = j;
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final boolean mo17305a(Consumer consumer) {
        consumer.getClass();
        C8398m m17738e = m17738e();
        if (m17738e == null) {
            return false;
        }
        consumer.accept(new C8397l(m17738e.f22498b, m17738e.f22499c, this.f22488i));
        return true;
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        return this.f22489j;
    }

    @Override // p164j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C8398m m17738e = m17738e();
            if (m17738e == null) {
                return;
            }
            consumer.accept(new C8397l(m17738e.f22498b, m17738e.f22499c, this.f22488i));
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

    @Override // p164j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f22510f;
        int i2 = this.f22511g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C8398m[] c8398mArr = this.f22505a;
        int i4 = this.f22512h;
        this.f22511g = i3;
        long j = this.f22489j >>> 1;
        this.f22489j = j;
        return new C8392g(c8398mArr, i4, i3, i2, j, this.f22488i);
    }
}
