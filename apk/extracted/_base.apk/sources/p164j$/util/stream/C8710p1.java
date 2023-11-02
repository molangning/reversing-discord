package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.C8462c0;
import p164j$.util.function.InterfaceC8468f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8710p1 extends AbstractC8720r1 implements InterfaceC8666g2 {

    /* renamed from: h */
    private final long[] f22913h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8710p1(Spliterator spliterator, AbstractC8744w0 abstractC8744w0, long[] jArr) {
        super(jArr.length, spliterator, abstractC8744w0);
        this.f22913h = jArr;
    }

    C8710p1(C8710p1 c8710p1, Spliterator spliterator, long j, long j2) {
        super(c8710p1, spliterator, j, j2, c8710p1.f22913h.length);
        this.f22913h = c8710p1.f22913h;
    }

    @Override // p164j$.util.stream.AbstractC8720r1
    /* renamed from: a */
    final AbstractC8720r1 mo17404a(Spliterator spliterator, long j, long j2) {
        return new C8710p1(this, spliterator, j, j2);
    }

    @Override // p164j$.util.stream.AbstractC8720r1, p164j$.util.stream.InterfaceC8671h2
    public final void accept(long j) {
        int i = this.f22931f;
        if (i >= this.f22932g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f22931f));
        }
        long[] jArr = this.f22913h;
        this.f22931f = i + 1;
        jArr[i] = j;
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17315m((Long) obj);
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }

    @Override // p164j$.util.stream.InterfaceC8666g2
    /* renamed from: m */
    public final /* synthetic */ void mo17315m(Long l) {
        AbstractC8744w0.m17325u0(this, l);
    }
}
