package p164j$.util.stream;

import p164j$.util.function.C8462c0;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.Q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8594Q extends AbstractC8605T implements InterfaceC8666g2 {

    /* renamed from: b */
    final InterfaceC8468f0 f22743b;

    public C8594Q(InterfaceC8468f0 interfaceC8468f0, boolean z) {
        super(z);
        this.f22743b = interfaceC8468f0;
    }

    @Override // p164j$.util.stream.AbstractC8605T, p164j$.util.stream.InterfaceC8671h2
    public final void accept(long j) {
        this.f22743b.accept(j);
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17315m((Long) obj);
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }

    @Override // p164j$.util.stream.InterfaceC8666g2
    /* renamed from: m */
    public final /* synthetic */ void mo17315m(Long l) {
        AbstractC8744w0.m17325u0(this, l);
    }
}