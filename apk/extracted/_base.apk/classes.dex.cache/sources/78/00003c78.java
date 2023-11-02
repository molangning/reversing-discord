package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.s1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8725s1 extends C8600R2 implements InterfaceC8548F0, InterfaceC8523A0 {
    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: a */
    public final InterfaceC8548F0 mo17392a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(int i) {
        AbstractC8744w0.m17322w0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(long j) {
        AbstractC8744w0.m17320x0();
        throw null;
    }

    @Override // p164j$.util.stream.C8600R2, p164j$.util.function.Consumer
    public final void accept(Object obj) {
        super.accept(obj);
    }

    @Override // p164j$.util.stream.InterfaceC8523A0
    public final InterfaceC8548F0 build() {
        return this;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final void end() {
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: f */
    public final void mo17391f(Object[] objArr, int i) {
        long j = i;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f22843c == 0) {
            System.arraycopy(this.f22748e, 0, objArr, i, this.f22842b);
            return;
        }
        for (int i2 = 0; i2 < this.f22843c; i2++) {
            Object[] objArr2 = this.f22749f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f22749f[i2].length;
        }
        int i3 = this.f22842b;
        if (i3 > 0) {
            System.arraycopy(this.f22748e, 0, objArr, i, i3);
        }
    }

    @Override // p164j$.util.stream.C8600R2, p164j$.util.stream.InterfaceC8548F0
    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        clear();
        m17549s(j);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: k */
    public final /* synthetic */ int mo17390k() {
        return 0;
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
    public final /* synthetic */ InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        return AbstractC8744w0.m17370I0(this, j, j2, intFunction);
    }

    @Override // p164j$.util.stream.C8600R2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }
}