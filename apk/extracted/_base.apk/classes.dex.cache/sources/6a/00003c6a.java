package p164j$.util.stream;

import p164j$.util.InterfaceC8356D;
import p164j$.util.Spliterator;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.p2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8711p2 extends AbstractC8527B {

    /* renamed from: s */
    final /* synthetic */ long f22914s;

    /* renamed from: t */
    final /* synthetic */ long f22915t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8711p2(AbstractC8643c abstractC8643c, int i, long j, long j2) {
        super(abstractC8643c, i);
        this.f22914s = j;
        this.f22915t = j2;
    }

    /* renamed from: R1 */
    static InterfaceC8356D m17407R1(InterfaceC8356D interfaceC8356D, long j, long j2, long j3) {
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
        return new C8737u3(interfaceC8356D, j4, j5);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: H1 */
    final InterfaceC8548F0 mo17297H1(Spliterator spliterator, IntFunction intFunction, AbstractC8643c abstractC8643c) {
        long mo17351a1 = abstractC8643c.mo17351a1(spliterator);
        return (mo17351a1 <= 0 || !spliterator.hasCharacteristics(16384)) ? !EnumC8616V2.ORDERED.m17537d(abstractC8643c.mo17345g1()) ? AbstractC8744w0.m17360R0(this, m17407R1((InterfaceC8356D) abstractC8643c.m17497O1(spliterator), this.f22914s, this.f22915t, mo17351a1), true) : (InterfaceC8548F0) new C8721r2(this, abstractC8643c, spliterator, intFunction, this.f22914s, this.f22915t).invoke() : AbstractC8744w0.m17360R0(abstractC8643c, AbstractC8744w0.m17368K0(abstractC8643c.m17502E1(), spliterator, this.f22914s, this.f22915t), true);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: I1 */
    final Spliterator mo17406I1(AbstractC8643c abstractC8643c, Spliterator spliterator) {
        long mo17351a1 = abstractC8643c.mo17351a1(spliterator);
        if (mo17351a1 <= 0 || !spliterator.hasCharacteristics(16384)) {
            return !EnumC8616V2.ORDERED.m17537d(abstractC8643c.mo17345g1()) ? m17407R1((InterfaceC8356D) abstractC8643c.m17497O1(spliterator), this.f22914s, this.f22915t, mo17351a1) : ((InterfaceC8548F0) new C8721r2(this, abstractC8643c, spliterator, new C8603S1(5), this.f22914s, this.f22915t).invoke()).spliterator();
        }
        long j = this.f22914s;
        return new C8697m3((InterfaceC8356D) abstractC8643c.m17497O1(spliterator), j, AbstractC8744w0.m17369J0(j, this.f22915t));
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        return new C8706o2(this, interfaceC8671h2);
    }
}