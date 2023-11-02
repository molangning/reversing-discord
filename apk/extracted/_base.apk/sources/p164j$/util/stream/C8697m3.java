package p164j$.util.stream;

import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8356D;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8697m3 extends AbstractC8722r3 implements InterfaceC8356D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8697m3(InterfaceC8356D interfaceC8356D, long j, long j2) {
        super(interfaceC8356D, j, j2);
    }

    C8697m3(InterfaceC8356D interfaceC8356D, long j, long j2, long j3, long j4) {
        super(interfaceC8356D, j, j2, j3, j4);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17604l(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8732t3
    /* renamed from: e */
    protected final Spliterator mo17385e(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C8697m3((InterfaceC8356D) spliterator, j, j2, j3, j4);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17609e(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8722r3
    /* renamed from: g */
    protected final Object mo17396g() {
        return new C8692l3(0);
    }
}
