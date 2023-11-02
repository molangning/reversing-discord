package p164j$.util.stream;

import p164j$.util.AbstractC8383c0;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.V0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8614V0 extends AbstractC8630Z0 implements InterfaceC8528B0 {
    @Override // p164j$.util.stream.AbstractC8630Z0, p164j$.util.stream.InterfaceC8548F0
    /* renamed from: a */
    public final InterfaceC8543E0 mo17392a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p164j$.util.stream.AbstractC8630Z0, p164j$.util.stream.InterfaceC8548F0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC8548F0 mo17392a(int i) {
        mo17392a(i);
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: b */
    public final Object mo17430b() {
        double[] dArr;
        dArr = AbstractC8744w0.f22979g;
        return dArr;
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: e */
    public final /* synthetic */ void mo17391f(Double[] dArr, int i) {
        AbstractC8744w0.m17316z0(this, dArr, i);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC8744w0.m17376C0(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8630Z0, p164j$.util.stream.InterfaceC8548F0
    /* renamed from: r */
    public final /* synthetic */ InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        return AbstractC8744w0.m17373F0(this, j, j2);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final InterfaceC8365M spliterator() {
        return AbstractC8383c0.m17762b();
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final Spliterator spliterator() {
        return AbstractC8383c0.m17762b();
    }
}