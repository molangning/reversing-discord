package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.C8477k;
import p164j$.util.function.InterfaceC8483n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8700n1 extends AbstractC8720r1 implements InterfaceC8656e2 {

    /* renamed from: h */
    private final double[] f22896h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8700n1(Spliterator spliterator, AbstractC8744w0 abstractC8744w0, double[] dArr) {
        super(dArr.length, spliterator, abstractC8744w0);
        this.f22896h = dArr;
    }

    C8700n1(C8700n1 c8700n1, Spliterator spliterator, long j, long j2) {
        super(c8700n1, spliterator, j, j2, c8700n1.f22896h.length);
        this.f22896h = c8700n1.f22896h;
    }

    @Override // p164j$.util.stream.AbstractC8720r1
    /* renamed from: a */
    final AbstractC8720r1 mo17404a(Spliterator spliterator, long j, long j2) {
        return new C8700n1(this, spliterator, j, j2);
    }

    @Override // p164j$.util.stream.AbstractC8720r1, p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        int i = this.f22931f;
        if (i >= this.f22932g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f22931f));
        }
        double[] dArr = this.f22896h;
        this.f22931f = i + 1;
        dArr[i] = d;
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17298q((Double) obj);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }

    @Override // p164j$.util.stream.InterfaceC8656e2
    /* renamed from: q */
    public final /* synthetic */ void mo17298q(Double d) {
        AbstractC8744w0.m17333q0(this, d);
    }
}
