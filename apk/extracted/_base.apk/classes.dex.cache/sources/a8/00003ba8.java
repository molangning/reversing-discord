package p164j$.util.stream;

import p164j$.util.InterfaceC8356D;
import p164j$.util.Spliterator;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.A */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8522A extends AbstractC8537D {
    public C8522A(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // p164j$.util.stream.AbstractC8537D, p164j$.util.stream.InterfaceC8552G
    /* renamed from: J */
    public final void mo17585J(InterfaceC8483n interfaceC8483n) {
        InterfaceC8356D m17589Q1;
        if (isParallel()) {
            super.mo17585J(interfaceC8483n);
            return;
        }
        m17589Q1 = AbstractC8537D.m17589Q1(m17498M1());
        m17589Q1.mo17467d(interfaceC8483n);
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

    @Override // p164j$.util.stream.AbstractC8537D, p164j$.util.stream.InterfaceC8552G
    /* renamed from: m0 */
    public final void mo17576m0(InterfaceC8483n interfaceC8483n) {
        InterfaceC8356D m17589Q1;
        if (isParallel()) {
            super.mo17576m0(interfaceC8483n);
            return;
        }
        m17589Q1 = AbstractC8537D.m17589Q1(m17498M1());
        m17589Q1.mo17467d(interfaceC8483n);
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* bridge */ /* synthetic */ InterfaceC8552G parallel() {
        parallel();
        return this;
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* bridge */ /* synthetic */ InterfaceC8552G sequential() {
        sequential();
        return this;
    }
}