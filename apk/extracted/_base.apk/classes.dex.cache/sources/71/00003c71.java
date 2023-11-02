package p164j$.util.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p164j$.util.Spliterator;
import p164j$.util.concurrent.ConcurrentHashMap;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8718r extends AbstractC8623X1 {
    public C8718r(AbstractC8643c abstractC8643c, int i) {
        super(abstractC8643c, i);
    }

    /* renamed from: P1 */
    static C8567J0 m17405P1(AbstractC8643c abstractC8643c, Spliterator spliterator) {
        C8603S1 c8603s1 = new C8603S1(11);
        C8603S1 c8603s12 = new C8603S1(12);
        return new C8567J0((Collection) new C8745w1(EnumC8620W2.REFERENCE, new C8603S1(13), c8603s12, c8603s1, 3).mo17318y(abstractC8643c, spliterator));
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: H1 */
    final InterfaceC8548F0 mo17297H1(Spliterator spliterator, IntFunction intFunction, AbstractC8643c abstractC8643c) {
        if (EnumC8616V2.DISTINCT.m17537d(abstractC8643c.mo17345g1())) {
            return abstractC8643c.m17496y1(spliterator, false, intFunction);
        }
        if (EnumC8616V2.ORDERED.m17537d(abstractC8643c.mo17345g1())) {
            return m17405P1(abstractC8643c, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new C8601S(new C8703o(0, atomicBoolean, concurrentHashMap), false).mo17318y(abstractC8643c, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new C8567J0(keySet);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: I1 */
    final Spliterator mo17406I1(AbstractC8643c abstractC8643c, Spliterator spliterator) {
        return EnumC8616V2.DISTINCT.m17537d(abstractC8643c.mo17345g1()) ? abstractC8643c.m17497O1(spliterator) : EnumC8616V2.ORDERED.m17537d(abstractC8643c.mo17345g1()) ? m17405P1(abstractC8643c, spliterator).spliterator() : new C8657e3(abstractC8643c.m17497O1(spliterator));
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: K1 */
    public final InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2) {
        interfaceC8671h2.getClass();
        return EnumC8616V2.DISTINCT.m17537d(i) ? interfaceC8671h2 : EnumC8616V2.SORTED.m17537d(i) ? new C8708p(interfaceC8671h2) : new C8713q(this, interfaceC8671h2);
    }
}