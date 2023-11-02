package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.C8431H;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.o1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8705o1 extends AbstractC8720r1 implements InterfaceC8661f2 {

    /* renamed from: h */
    private final int[] f22905h;

    public C8705o1(Spliterator spliterator, AbstractC8744w0 abstractC8744w0, int[] iArr) {
        super(iArr.length, spliterator, abstractC8744w0);
        this.f22905h = iArr;
    }

    C8705o1(C8705o1 c8705o1, Spliterator spliterator, long j, long j2) {
        super(c8705o1, spliterator, j, j2, c8705o1.f22905h.length);
        this.f22905h = c8705o1.f22905h;
    }

    @Override // p164j$.util.stream.AbstractC8720r1
    /* renamed from: a */
    final AbstractC8720r1 mo17404a(Spliterator spliterator, long j, long j2) {
        return new C8705o1(this, spliterator, j, j2);
    }

    @Override // p164j$.util.stream.AbstractC8720r1, p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        int i2 = this.f22931f;
        if (i2 >= this.f22932g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f22931f));
        }
        int[] iArr = this.f22905h;
        this.f22931f = i2 + 1;
        iArr[i2] = i;
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17408h((Integer) obj);
    }

    @Override // p164j$.util.stream.InterfaceC8661f2
    /* renamed from: h */
    public final /* synthetic */ void mo17408h(Integer num) {
        AbstractC8744w0.m17329s0(this, num);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }
}