package p164j$.util.stream;

import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8356D;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.e1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8655e1 extends AbstractC8670h1 implements InterfaceC8356D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8655e1(InterfaceC8528B0 interfaceC8528B0) {
        super(interfaceC8528B0);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17604l(this, consumer);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17609e(this, consumer);
    }
}
