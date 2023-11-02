package p164j$.util.stream;

import java.util.Arrays;
import p164j$.util.Spliterator;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.A2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8525A2 extends AbstractC8639b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8525A2(AbstractC8643c abstractC8643c) {
        super(abstractC8643c, EnumC8616V2.f22787q | EnumC8616V2.f22785o);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: H1 */
    public final InterfaceC8548F0 mo17297H1(Spliterator spliterator, IntFunction intFunction, AbstractC8643c abstractC8643c) {
        if (EnumC8616V2.SORTED.m17537d(abstractC8643c.mo17345g1())) {
            return abstractC8643c.m17496y1(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((InterfaceC8533C0) abstractC8643c.m17496y1(spliterator, true, intFunction)).mo17430b();
        Arrays.sort(iArr);
        return new C8640b1(iArr);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        interfaceC8671h2.getClass();
        return EnumC8616V2.SORTED.m17537d(i) ? interfaceC8671h2 : EnumC8616V2.SIZED.m17537d(i) ? new C8550F2(interfaceC8671h2) : new C8751x2(interfaceC8671h2);
    }
}
