package p164j$.util.stream;

import p164j$.util.InterfaceC8362J;
import p164j$.util.Spliterator;
import p164j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8701n2 extends AbstractC8674i0 {

    /* renamed from: s */
    final /* synthetic */ long f22897s;

    /* renamed from: t */
    final /* synthetic */ long f22898t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8701n2(AbstractC8643c abstractC8643c, int i, long j, long j2) {
        super(abstractC8643c, i);
        this.f22897s = j;
        this.f22898t = j2;
    }

    /* renamed from: R1 */
    static InterfaceC8362J m17409R1(InterfaceC8362J interfaceC8362J, long j, long j2, long j3) {
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
        return new C8747w3(interfaceC8362J, j4, j5);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: H1 */
    final InterfaceC8548F0 mo17297H1(Spliterator spliterator, IntFunction intFunction, AbstractC8643c abstractC8643c) {
        long mo17351a1 = abstractC8643c.mo17351a1(spliterator);
        return (mo17351a1 <= 0 || !spliterator.hasCharacteristics(16384)) ? !EnumC8616V2.ORDERED.m17537d(abstractC8643c.mo17345g1()) ? AbstractC8744w0.m17358T0(this, m17409R1((InterfaceC8362J) abstractC8643c.m17497O1(spliterator), this.f22897s, this.f22898t, mo17351a1), true) : (InterfaceC8548F0) new C8721r2(this, abstractC8643c, spliterator, intFunction, this.f22897s, this.f22898t).invoke() : AbstractC8744w0.m17358T0(abstractC8643c, AbstractC8744w0.m17368K0(abstractC8643c.m17502E1(), spliterator, this.f22897s, this.f22898t), true);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: I1 */
    final Spliterator mo17406I1(AbstractC8643c abstractC8643c, Spliterator spliterator) {
        long mo17351a1 = abstractC8643c.mo17351a1(spliterator);
        if (mo17351a1 <= 0 || !spliterator.hasCharacteristics(16384)) {
            return !EnumC8616V2.ORDERED.m17537d(abstractC8643c.mo17345g1()) ? m17409R1((InterfaceC8362J) abstractC8643c.m17497O1(spliterator), this.f22897s, this.f22898t, mo17351a1) : ((InterfaceC8548F0) new C8721r2(this, abstractC8643c, spliterator, new C8603S1(4), this.f22897s, this.f22898t).invoke()).spliterator();
        }
        long j = this.f22897s;
        return new C8717q3((InterfaceC8362J) abstractC8643c.m17497O1(spliterator), j, AbstractC8744w0.m17369J0(j, this.f22898t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        return new C8696m2(this, interfaceC8671h2);
    }
}
