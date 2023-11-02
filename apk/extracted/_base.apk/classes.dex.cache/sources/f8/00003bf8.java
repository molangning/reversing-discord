package p164j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.R1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8599R1 extends AbstractC8658f {

    /* renamed from: h */
    private final AbstractC8744w0 f22747h;

    C8599R1(C8599R1 c8599r1, Spliterator spliterator) {
        super(c8599r1, spliterator);
        this.f22747h = c8599r1.f22747h;
    }

    public C8599R1(AbstractC8744w0 abstractC8744w0, AbstractC8744w0 abstractC8744w02, Spliterator spliterator) {
        super(abstractC8744w02, spliterator);
        this.f22747h = abstractC8744w0;
    }

    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: a */
    public final Object mo17384a() {
        AbstractC8744w0 abstractC8744w0 = this.f22852a;
        InterfaceC8592P1 mo17306u1 = this.f22747h.mo17306u1();
        abstractC8744w0.mo17321w1(this.f22853b, mo17306u1);
        return mo17306u1;
    }

    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: d */
    public final AbstractC8658f mo17383d(Spliterator spliterator) {
        return new C8599R1(this, spliterator);
    }

    @Override // p164j$.util.stream.AbstractC8658f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC8658f abstractC8658f = this.f22855d;
        if (!(abstractC8658f == null)) {
            InterfaceC8592P1 interfaceC8592P1 = (InterfaceC8592P1) ((C8599R1) abstractC8658f).mo17473b();
            interfaceC8592P1.mo17300l((InterfaceC8592P1) ((C8599R1) this.f22856e).mo17473b());
            mo17471e(interfaceC8592P1);
        }
        super.onCompletion(countedCompleter);
    }
}