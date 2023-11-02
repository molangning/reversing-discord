package p164j$.util.stream;

import p164j$.util.C8514l;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.C8462c0;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8460b0;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.O1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8588O1 implements InterfaceC8592P1, InterfaceC8666g2 {

    /* renamed from: a */
    private boolean f22733a;

    /* renamed from: b */
    private long f22734b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8460b0 f22735c;

    public C8588O1(InterfaceC8460b0 interfaceC8460b0) {
        this.f22735c = interfaceC8460b0;
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
    public final void accept(long j) {
        if (this.f22733a) {
            this.f22733a = false;
        } else {
            j = this.f22735c.applyAsLong(this.f22734b, j);
        }
        this.f22734b = j;
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17315m((Long) obj);
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
        this.f22733a = true;
        this.f22734b = 0L;
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        return this.f22733a ? C8514l.m17613a() : C8514l.m17610d(this.f22734b);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }

    @Override // p164j$.util.stream.InterfaceC8592P1
    /* renamed from: l */
    public final void mo17300l(InterfaceC8592P1 interfaceC8592P1) {
        C8588O1 c8588o1 = (C8588O1) interfaceC8592P1;
        if (c8588o1.f22733a) {
            return;
        }
        accept(c8588o1.f22734b);
    }

    @Override // p164j$.util.stream.InterfaceC8666g2
    /* renamed from: m */
    public final /* synthetic */ void mo17315m(Long l) {
        AbstractC8744w0.m17325u0(this, l);
    }
}