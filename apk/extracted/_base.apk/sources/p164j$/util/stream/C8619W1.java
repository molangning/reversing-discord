package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.W1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8619W1 extends AbstractC8631Z1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8619W1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    @Override // p164j$.util.stream.AbstractC8631Z1, p164j$.util.stream.Stream
    /* renamed from: H */
    public final void mo17525H(Consumer consumer) {
        if (isParallel()) {
            super.mo17525H(consumer);
        } else {
            m17498M1().forEachRemaining(consumer);
        }
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

    @Override // p164j$.util.stream.AbstractC8631Z1, p164j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (isParallel()) {
            super.forEach(consumer);
        } else {
            m17498M1().forEachRemaining(consumer);
        }
    }
}
