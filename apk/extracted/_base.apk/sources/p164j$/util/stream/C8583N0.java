package p164j$.util.stream;

import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.N0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8583N0 extends AbstractC8595Q0 implements InterfaceC8528B0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8583N0(InterfaceC8528B0 interfaceC8528B0, InterfaceC8528B0 interfaceC8528B02) {
        super(interfaceC8528B0, interfaceC8528B02);
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

    @Override // p164j$.util.stream.InterfaceC8543E0
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: r */
    public final /* synthetic */ InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        return AbstractC8744w0.m17373F0(this, j, j2);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final InterfaceC8365M spliterator() {
        return new C8655e1(this);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final Spliterator spliterator() {
        return new C8655e1(this);
    }
}
