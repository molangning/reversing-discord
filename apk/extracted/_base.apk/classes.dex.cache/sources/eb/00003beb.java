package p164j$.util.stream;

import p164j$.util.function.C8477k;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.stream.O */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8586O extends AbstractC8605T implements InterfaceC8656e2 {

    /* renamed from: b */
    final InterfaceC8483n f22732b;

    public C8586O(InterfaceC8483n interfaceC8483n, boolean z) {
        super(z);
        this.f22732b = interfaceC8483n;
    }

    @Override // p164j$.util.stream.AbstractC8605T, p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        this.f22732b.accept(d);
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17298q((Double) obj);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }

    @Override // p164j$.util.stream.InterfaceC8656e2
    /* renamed from: q */
    public final /* synthetic */ void mo17298q(Double d) {
        AbstractC8744w0.m17333q0(this, d);
    }
}