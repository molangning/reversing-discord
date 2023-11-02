package p164j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import p164j$.util.Comparator;
import p164j$.util.Spliterator;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.C2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8535C2 extends AbstractC8623X1 {

    /* renamed from: s */
    private final boolean f22654s;

    /* renamed from: t */
    private final Comparator f22655t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8535C2(AbstractC8643c abstractC8643c) {
        super(abstractC8643c, EnumC8616V2.f22787q | EnumC8616V2.f22785o);
        this.f22654s = true;
        this.f22655t = Comparator.CC.m17777a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8535C2(AbstractC8643c abstractC8643c, java.util.Comparator comparator) {
        super(abstractC8643c, EnumC8616V2.f22787q | EnumC8616V2.f22786p);
        this.f22654s = false;
        comparator.getClass();
        this.f22655t = comparator;
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: H1 */
    public final InterfaceC8548F0 mo17297H1(Spliterator spliterator, IntFunction intFunction, AbstractC8643c abstractC8643c) {
        if (EnumC8616V2.SORTED.m17537d(abstractC8643c.mo17345g1()) && this.f22654s) {
            return abstractC8643c.m17496y1(spliterator, false, intFunction);
        }
        Object[] mo17389p = abstractC8643c.m17496y1(spliterator, true, intFunction).mo17389p(intFunction);
        Arrays.sort(mo17389p, this.f22655t);
        return new C8563I0(mo17389p);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        interfaceC8671h2.getClass();
        if (EnumC8616V2.SORTED.m17537d(i) && this.f22654s) {
            return interfaceC8671h2;
        }
        boolean m17537d = EnumC8616V2.SIZED.m17537d(i);
        java.util.Comparator comparator = this.f22655t;
        return m17537d ? new C8560H2(interfaceC8671h2, comparator) : new C8540D2(interfaceC8671h2, comparator);
    }
}
