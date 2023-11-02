package p164j$.util.stream;

import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8362J;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.g1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8665g1 extends AbstractC8670h1 implements InterfaceC8362J {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8665g1(InterfaceC8538D0 interfaceC8538D0) {
        super(interfaceC8538D0);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17602n(this, consumer);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17607h(this, consumer);
    }
}
