package p164j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p164j$.util.Spliterator;
import p164j$.util.function.InterfaceC8467f;
import p164j$.util.function.InterfaceC8474i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.M0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8579M0 extends AbstractC8658f {

    /* renamed from: h */
    protected final AbstractC8744w0 f22722h;

    /* renamed from: i */
    protected final InterfaceC8474i0 f22723i;

    /* renamed from: j */
    protected final InterfaceC8467f f22724j;

    C8579M0(C8579M0 c8579m0, Spliterator spliterator) {
        super(c8579m0, spliterator);
        this.f22722h = c8579m0.f22722h;
        this.f22723i = c8579m0.f22723i;
        this.f22724j = c8579m0.f22724j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8579M0(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, InterfaceC8474i0 interfaceC8474i0, C8571K0 c8571k0) {
        super(abstractC8744w0, spliterator);
        this.f22722h = abstractC8744w0;
        this.f22723i = interfaceC8474i0;
        this.f22724j = c8571k0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: a */
    public final Object mo17384a() {
        InterfaceC8523A0 interfaceC8523A0 = (InterfaceC8523A0) this.f22723i.apply(this.f22722h.mo17351a1(this.f22853b));
        this.f22722h.mo17321w1(this.f22853b, interfaceC8523A0);
        return interfaceC8523A0.build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: d */
    public final AbstractC8658f mo17383d(Spliterator spliterator) {
        return new C8579M0(this, spliterator);
    }

    @Override // p164j$.util.stream.AbstractC8658f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC8658f abstractC8658f = this.f22855d;
        if (!(abstractC8658f == null)) {
            mo17471e((InterfaceC8548F0) this.f22724j.apply((InterfaceC8548F0) ((C8579M0) abstractC8658f).mo17473b(), (InterfaceC8548F0) ((C8579M0) this.f22856e).mo17473b()));
        }
        super.onCompletion(countedCompleter);
    }
}
