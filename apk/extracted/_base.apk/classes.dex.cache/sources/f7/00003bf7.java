package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.R0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8598R0 extends AbstractC8558H0 {
    public C8598R0(InterfaceC8548F0 interfaceC8548F0, InterfaceC8548F0 interfaceC8548F02) {
        super(interfaceC8548F0, interfaceC8548F02);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: f */
    public final void mo17391f(Object[] objArr, int i) {
        objArr.getClass();
        InterfaceC8548F0 interfaceC8548F0 = this.f22685a;
        interfaceC8548F0.mo17391f(objArr, i);
        this.f22686b.mo17391f(objArr, i + ((int) interfaceC8548F0.count()));
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final void forEach(Consumer consumer) {
        this.f22685a.forEach(consumer);
        this.f22686b.forEach(consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: p */
    public final Object[] mo17389p(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            mo17391f(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: r */
    public final InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.f22685a.count();
        return j >= count ? this.f22686b.mo17388r(j - count, j2 - count, intFunction) : j2 <= count ? this.f22685a.mo17388r(j, j2, intFunction) : AbstractC8744w0.m17357U0(EnumC8620W2.REFERENCE, this.f22685a.mo17388r(j, count, intFunction), this.f22686b.mo17388r(0L, j2 - count, intFunction));
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final Spliterator spliterator() {
        return new C8675i1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f22685a, this.f22686b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}