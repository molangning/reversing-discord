package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.T */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8605T implements InterfaceC8546E3, InterfaceC8551F3 {

    /* renamed from: a */
    private final boolean f22756a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8605T(boolean z) {
        this.f22756a = z;
    }

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: P */
    public final int mo17363P() {
        if (this.f22756a) {
            return 0;
        }
        return EnumC8616V2.f22788r;
    }

    public /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC8744w0.m17322w0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC8744w0.m17320x0();
        throw null;
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void end() {
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final /* synthetic */ void mo17302g(long j) {
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: n0 */
    public final Object mo17338n0(AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        abstractC8744w0.mo17321w1(spliterator, this);
        return null;
    }

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: y */
    public final Object mo17318y(AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        (this.f22756a ? new C8609U(abstractC8744w0, spliterator, this) : new C8613V(abstractC8744w0, spliterator, abstractC8744w0.mo17319x1(this))).invoke();
        return null;
    }
}
