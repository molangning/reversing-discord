package p164j$.util.stream;

import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8362J;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.q3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8717q3 extends AbstractC8722r3 implements InterfaceC8362J {
    public C8717q3(InterfaceC8362J interfaceC8362J, long j, long j2) {
        super(interfaceC8362J, j, j2);
    }

    C8717q3(InterfaceC8362J interfaceC8362J, long j, long j2, long j3, long j4) {
        super(interfaceC8362J, j, j2, j3, j4);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17602n(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8732t3
    /* renamed from: e */
    protected final Spliterator mo17385e(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C8717q3((InterfaceC8362J) spliterator, j, j2, j3, j4);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17607h(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8722r3
    /* renamed from: g */
    protected final Object mo17396g() {
        return new C8712p3(0);
    }
}