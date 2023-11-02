package p164j$.util.stream;

import p164j$.util.C8510h;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8467f;

/* renamed from: j$.util.stream.E1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8544E1 implements InterfaceC8592P1 {

    /* renamed from: a */
    private boolean f22663a;

    /* renamed from: b */
    private Object f22664b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8467f f22665c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8544E1(InterfaceC8467f interfaceC8467f) {
        this.f22665c = interfaceC8467f;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(int i) {
        AbstractC8744w0.m17322w0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(long j) {
        AbstractC8744w0.m17320x0();
        throw null;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f22663a) {
            this.f22663a = false;
        } else {
            obj = this.f22665c.apply(this.f22664b, obj);
        }
        this.f22664b = obj;
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
    public final void mo17302g(long j) {
        this.f22663a = true;
        this.f22664b = null;
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        return this.f22663a ? C8510h.m17633a() : C8510h.m17630d(this.f22664b);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.stream.InterfaceC8592P1
    /* renamed from: l */
    public final void mo17300l(InterfaceC8592P1 interfaceC8592P1) {
        C8544E1 c8544e1 = (C8544E1) interfaceC8592P1;
        if (c8544e1.f22663a) {
            return;
        }
        accept(c8544e1.f22664b);
    }
}
