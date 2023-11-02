package p164j$.util.stream;

import p164j$.util.InterfaceC8359G;
import p164j$.util.Spliterator;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8634a0 extends AbstractC8649d0 {
    public C8634a0(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: J1 */
    final boolean mo17456J1() {
        throw new UnsupportedOperationException();
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        throw new UnsupportedOperationException();
    }

    @Override // p164j$.util.stream.AbstractC8649d0, p164j$.util.stream.IntStream
    /* renamed from: S */
    public final void mo17489S(InterfaceC8437K interfaceC8437K) {
        InterfaceC8359G m17490Q1;
        if (isParallel()) {
            super.mo17489S(interfaceC8437K);
            return;
        }
        m17490Q1 = AbstractC8649d0.m17490Q1(m17498M1());
        m17490Q1.mo17458c(interfaceC8437K);
    }

    @Override // p164j$.util.stream.AbstractC8649d0, p164j$.util.stream.IntStream
    /* renamed from: a0 */
    public final void mo17486a0(InterfaceC8437K interfaceC8437K) {
        InterfaceC8359G m17490Q1;
        if (isParallel()) {
            super.mo17486a0(interfaceC8437K);
            return;
        }
        m17490Q1 = AbstractC8649d0.m17490Q1(m17498M1());
        m17490Q1.mo17458c(interfaceC8437K);
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}