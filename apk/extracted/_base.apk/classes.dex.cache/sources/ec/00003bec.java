package p164j$.util.stream;

import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.O0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8587O0 extends AbstractC8595Q0 implements InterfaceC8533C0 {
    public C8587O0(InterfaceC8533C0 interfaceC8533C0, InterfaceC8533C0 interfaceC8533C02) {
        super(interfaceC8533C0, interfaceC8533C02);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: e */
    public final /* synthetic */ void mo17391f(Integer[] numArr, int i) {
        AbstractC8744w0.m17378A0(this, numArr, i);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC8744w0.m17375D0(this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: r */
    public final /* synthetic */ InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        return AbstractC8744w0.m17372G0(this, j, j2);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final InterfaceC8365M spliterator() {
        return new C8660f1(this);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final Spliterator spliterator() {
        return new C8660f1(this);
    }
}