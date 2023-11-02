package p139hf;

import gf.InterfaceCallableC6743d;
import lk.InterfaceC10220b;
import p217lf.C10142d;
import ye.AbstractC14010b;

/* renamed from: hf.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7118i<T> extends AbstractC14010b<T> implements InterfaceCallableC6743d<T> {

    /* renamed from: k */
    private final T f19457k;

    public C7118i(T t) {
        this.f19457k = t;
    }

    @Override // gf.InterfaceCallableC6743d, java.util.concurrent.Callable
    public T call() {
        return this.f19457k;
    }

    @Override // ye.AbstractC14010b
    /* renamed from: t */
    protected void mo909t(InterfaceC10220b<? super T> interfaceC10220b) {
        interfaceC10220b.mo905a(new C10142d(interfaceC10220b, this.f19457k));
    }
}