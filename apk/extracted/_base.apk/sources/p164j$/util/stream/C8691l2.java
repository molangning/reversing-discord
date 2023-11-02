package p164j$.util.stream;

import p164j$.util.InterfaceC8359G;
import p164j$.util.Spliterator;
import p164j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8691l2 extends AbstractC8639b0 {

    /* renamed from: s */
    final /* synthetic */ long f22888s;

    /* renamed from: t */
    final /* synthetic */ long f22889t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8691l2(AbstractC8643c abstractC8643c, int i, long j, long j2) {
        super(abstractC8643c, i);
        this.f22888s = j;
        this.f22889t = j2;
    }

    /* renamed from: R1 */
    static InterfaceC8359G m17432R1(InterfaceC8359G interfaceC8359G, long j, long j2, long j3) {
        long j4;
        long j5;
        if (j <= j3) {
            long j6 = j3 - j;
            j5 = j2 >= 0 ? Math.min(j2, j6) : j6;
            j4 = 0;
        } else {
            j4 = j;
            j5 = j2;
        }
        return new C8742v3(interfaceC8359G, j4, j5);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: H1 */
    final InterfaceC8548F0 mo17297H1(Spliterator spliterator, IntFunction intFunction, AbstractC8643c abstractC8643c) {
        long mo17351a1 = abstractC8643c.mo17351a1(spliterator);
        return (mo17351a1 <= 0 || !spliterator.hasCharacteristics(16384)) ? !EnumC8616V2.ORDERED.m17537d(abstractC8643c.mo17345g1()) ? AbstractC8744w0.m17359S0(this, m17432R1((InterfaceC8359G) abstractC8643c.m17497O1(spliterator), this.f22888s, this.f22889t, mo17351a1), true) : (InterfaceC8548F0) new C8721r2(this, abstractC8643c, spliterator, intFunction, this.f22888s, this.f22889t).invoke() : AbstractC8744w0.m17359S0(abstractC8643c, AbstractC8744w0.m17368K0(abstractC8643c.m17502E1(), spliterator, this.f22888s, this.f22889t), true);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: I1 */
    final Spliterator mo17406I1(AbstractC8643c abstractC8643c, Spliterator spliterator) {
        long mo17351a1 = abstractC8643c.mo17351a1(spliterator);
        if (mo17351a1 <= 0 || !spliterator.hasCharacteristics(16384)) {
            return !EnumC8616V2.ORDERED.m17537d(abstractC8643c.mo17345g1()) ? m17432R1((InterfaceC8359G) abstractC8643c.m17497O1(spliterator), this.f22888s, this.f22889t, mo17351a1) : ((InterfaceC8548F0) new C8721r2(this, abstractC8643c, spliterator, new C8603S1(3), this.f22888s, this.f22889t).invoke()).spliterator();
        }
        long j = this.f22888s;
        return new C8707o3((InterfaceC8359G) abstractC8643c.m17497O1(spliterator), j, AbstractC8744w0.m17369J0(j, this.f22889t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        return new C8686k2(this, interfaceC8671h2);
    }
}
