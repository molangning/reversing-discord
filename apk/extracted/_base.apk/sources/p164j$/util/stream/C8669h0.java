package p164j$.util.stream;

import p164j$.util.InterfaceC8362J;
import p164j$.util.Spliterator;
import p164j$.util.function.InterfaceC8468f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8669h0 extends AbstractC8684k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8669h0(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // p164j$.util.stream.AbstractC8684k0, p164j$.util.stream.InterfaceC8699n0
    /* renamed from: G */
    public final void mo17422G(InterfaceC8468f0 interfaceC8468f0) {
        InterfaceC8362J m17440Q1;
        if (isParallel()) {
            super.mo17422G(interfaceC8468f0);
            return;
        }
        m17440Q1 = AbstractC8684k0.m17440Q1(m17498M1());
        m17440Q1.mo17438b(interfaceC8468f0);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: J1 */
    final boolean mo17456J1() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        throw new UnsupportedOperationException();
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* bridge */ /* synthetic */ InterfaceC8699n0 parallel() {
        parallel();
        return this;
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* bridge */ /* synthetic */ InterfaceC8699n0 sequential() {
        sequential();
        return this;
    }

    @Override // p164j$.util.stream.AbstractC8684k0, p164j$.util.stream.InterfaceC8699n0
    /* renamed from: z */
    public final void mo17410z(InterfaceC8468f0 interfaceC8468f0) {
        InterfaceC8362J m17440Q1;
        if (isParallel()) {
            super.mo17410z(interfaceC8468f0);
            return;
        }
        m17440Q1 = AbstractC8684k0.m17440Q1(m17498M1());
        m17440Q1.mo17438b(interfaceC8468f0);
    }
}
