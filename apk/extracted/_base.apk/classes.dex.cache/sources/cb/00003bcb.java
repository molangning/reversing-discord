package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.H */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8557H implements InterfaceC8546E3 {

    /* renamed from: a */
    final boolean f22681a;

    /* renamed from: b */
    final Object f22682b;

    /* renamed from: c */
    final Predicate f22683c;

    /* renamed from: d */
    final InterfaceC8438K0 f22684d;

    public C8557H(boolean z, EnumC8620W2 enumC8620W2, Object obj, C8603S1 c8603s1, C8638b c8638b) {
        this.f22681a = z;
        this.f22682b = obj;
        this.f22683c = c8603s1;
        this.f22684d = c8638b;
    }

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: P */
    public final int mo17363P() {
        return EnumC8616V2.f22791u | (this.f22681a ? 0 : EnumC8616V2.f22788r);
    }

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: n0 */
    public final Object mo17338n0(AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        InterfaceC8551F3 interfaceC8551F3 = (InterfaceC8551F3) this.f22684d.get();
        abstractC8744w0.mo17321w1(spliterator, interfaceC8551F3);
        Object obj = interfaceC8551F3.get();
        return obj != null ? obj : this.f22682b;
    }

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: y */
    public final Object mo17318y(AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        return new C8582N(this, abstractC8744w0, spliterator).invoke();
    }
}