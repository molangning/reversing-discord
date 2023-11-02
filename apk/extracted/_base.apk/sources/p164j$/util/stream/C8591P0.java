package p164j$.util.stream;

import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.P0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8591P0 extends AbstractC8595Q0 implements InterfaceC8538D0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8591P0(InterfaceC8538D0 interfaceC8538D0, InterfaceC8538D0 interfaceC8538D02) {
        super(interfaceC8538D0, interfaceC8538D02);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: e */
    public final /* synthetic */ void mo17391f(Long[] lArr, int i) {
        AbstractC8744w0.m17377B0(this, lArr, i);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC8744w0.m17374E0(this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: r */
    public final /* synthetic */ InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        return AbstractC8744w0.m17371H0(this, j, j2);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final InterfaceC8365M spliterator() {
        return new C8665g1(this);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final Spliterator spliterator() {
        return new C8665g1(this);
    }
}
