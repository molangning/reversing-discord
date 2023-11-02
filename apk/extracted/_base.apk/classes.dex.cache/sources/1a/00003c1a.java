package p164j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import p164j$.util.AbstractC8383c0;
import p164j$.util.C8510h;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.C8461c;
import p164j$.util.function.Consumer;
import p164j$.util.function.Function;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8467f;
import p164j$.util.function.Predicate;
import p164j$.util.function.ToDoubleFunction;
import p164j$.util.function.ToIntFunction;
import p164j$.util.function.ToLongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.Z1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8631Z1 extends AbstractC8643c implements Stream {
    public AbstractC8631Z1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    public AbstractC8631Z1(AbstractC8643c abstractC8643c, int i) {
        super(abstractC8643c, i);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: B1 */
    final InterfaceC8548F0 mo17445B1(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC8744w0.m17361Q0(abstractC8744w0, spliterator, z, intFunction);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: C1 */
    final void mo17444C1(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2) {
        while (!interfaceC8671h2.mo17301i() && spliterator.mo17305a(interfaceC8671h2)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: D1 */
    public final EnumC8620W2 mo17443D1() {
        return EnumC8620W2.REFERENCE;
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: E */
    public final boolean mo17526E(Predicate predicate) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17328s1(predicate, EnumC8729t0.ANY))).booleanValue();
    }

    /* renamed from: H */
    public void mo17525H(Consumer consumer) {
        consumer.getClass();
        m17495z1(new C8601S(consumer, true));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: I */
    public final Object mo17524I(InterfaceC8438K0 interfaceC8438K0, BiConsumer biConsumer, BiConsumer biConsumer2) {
        interfaceC8438K0.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return m17495z1(new C8745w1(EnumC8620W2.REFERENCE, biConsumer2, biConsumer, interfaceC8438K0, 3));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: K */
    public final IntStream mo17523K(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new C8748x(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, toIntFunction, 6);
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: L */
    public final Stream mo17522L(Function function) {
        function.getClass();
        return new C8615V1(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, function, 0);
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: N */
    public final Stream mo17521N(Function function) {
        function.getClass();
        return new C8615V1(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n | EnumC8616V2.f22790t, function, 1);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: N1 */
    final Spliterator mo17442N1(AbstractC8744w0 abstractC8744w0, C8633a c8633a, boolean z) {
        return new C8536C3(abstractC8744w0, c8633a, z);
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: O */
    public final C8510h mo17520O(InterfaceC8467f interfaceC8467f) {
        interfaceC8467f.getClass();
        return (C8510h) m17495z1(new C8524A1(EnumC8620W2.REFERENCE, interfaceC8467f, 1));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: c */
    public final IntStream mo17519c(Function function) {
        function.getClass();
        return new C8748x(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n | EnumC8616V2.f22790t, function, 7);
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: c0 */
    public final boolean mo17518c0(Predicate predicate) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17328s1(predicate, EnumC8729t0.ALL))).booleanValue();
    }

    @Override // p164j$.util.stream.Stream
    public final long count() {
        return ((AbstractC8684k0) mo17515j0(new C8603S1(1))).sum();
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: d0 */
    public final InterfaceC8699n0 mo17517d0(Function function) {
        function.getClass();
        return new C8753y(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n | EnumC8616V2.f22790t, function, 6);
    }

    @Override // p164j$.util.stream.Stream
    public final Stream distinct() {
        return new C8718r(this, EnumC8616V2.f22783m | EnumC8616V2.f22790t);
    }

    @Override // p164j$.util.stream.Stream
    public final C8510h findAny() {
        return (C8510h) m17495z1(new C8557H(false, EnumC8620W2.REFERENCE, C8510h.m17633a(), new C8603S1(21), new C8638b(12)));
    }

    @Override // p164j$.util.stream.Stream
    public final C8510h findFirst() {
        return (C8510h) m17495z1(new C8557H(true, EnumC8620W2.REFERENCE, C8510h.m17633a(), new C8603S1(21), new C8638b(12)));
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        m17495z1(new C8601S(consumer, false));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: i0 */
    public final boolean mo17516i0(Predicate predicate) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17328s1(predicate, EnumC8729t0.NONE))).booleanValue();
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final Iterator iterator() {
        return AbstractC8383c0.m17755i(spliterator());
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: j0 */
    public final InterfaceC8699n0 mo17515j0(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C8753y(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, toLongFunction, 7);
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: l */
    public final Object mo17514l(Object obj, BiFunction biFunction, InterfaceC8467f interfaceC8467f) {
        biFunction.getClass();
        interfaceC8467f.getClass();
        return m17495z1(new C8745w1(EnumC8620W2.REFERENCE, interfaceC8467f, biFunction, obj, 2));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: l0 */
    public final InterfaceC8552G mo17513l0(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C8738v(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, toDoubleFunction, 6);
    }

    @Override // p164j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return AbstractC8744w0.m17326t1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p164j$.util.stream.Stream
    public final C8510h max(Comparator comparator) {
        comparator.getClass();
        return mo17520O(new C8461c(comparator, 0));
    }

    @Override // p164j$.util.stream.Stream
    public final C8510h min(Comparator comparator) {
        comparator.getClass();
        return mo17520O(new C8461c(comparator, 1));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: n */
    public final InterfaceC8552G mo17512n(Function function) {
        function.getClass();
        return new C8738v(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n | EnumC8616V2.f22790t, function, 7);
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: o0 */
    public final Object mo17511o0(Object obj, InterfaceC8467f interfaceC8467f) {
        interfaceC8467f.getClass();
        return m17495z1(new C8745w1(EnumC8620W2.REFERENCE, interfaceC8467f, interfaceC8467f, obj, 2));
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: r1 */
    public final InterfaceC8523A0 mo17330r1(long j, IntFunction intFunction) {
        return AbstractC8744w0.m17362P0(j, intFunction);
    }

    @Override // p164j$.util.stream.Stream
    public final Stream skip(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : AbstractC8744w0.m17326t1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p164j$.util.stream.Stream
    public final Stream sorted() {
        return new C8535C2(this);
    }

    @Override // p164j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new C8535C2(this, comparator);
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: t */
    public final Stream mo17510t(Predicate predicate) {
        predicate.getClass();
        return new C8743w(this, EnumC8616V2.f22790t, predicate, 4);
    }

    @Override // p164j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C8603S1(0));
    }

    @Override // p164j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC8744w0.m17349c1(m17503A1(intFunction), intFunction).mo17389p(intFunction);
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final InterfaceC8673i unordered() {
        return !m17501F1() ? this : new C8611U1(this, EnumC8616V2.f22788r);
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: v */
    public final Stream mo17509v(Consumer consumer) {
        consumer.getClass();
        return new C8743w(this, 0, consumer, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // p164j$.util.stream.Stream
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo17508w(p164j$.util.stream.InterfaceC8693m r8) {
        /*
            r7 = this;
            boolean r0 = r7.isParallel()
            if (r0 == 0) goto L3d
            r0 = r8
            j$.util.stream.k r0 = (p164j$.util.stream.C8683k) r0
            java.util.Set r1 = r0.m17450b()
            j$.util.stream.j r2 = p164j$.util.stream.EnumC8678j.CONCURRENT
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L3d
            boolean r1 = r7.m17501F1()
            if (r1 == 0) goto L27
            java.util.Set r1 = r0.m17450b()
            j$.util.stream.j r2 = p164j$.util.stream.EnumC8678j.UNORDERED
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L3d
        L27:
            j$.util.function.K0 r1 = r0.m17446f()
            java.lang.Object r1 = r1.get()
            j$.util.function.BiConsumer r0 = r0.m17451a()
            j$.util.stream.o r2 = new j$.util.stream.o
            r3 = 5
            r2.<init>(r3, r0, r1)
            r7.forEach(r2)
            goto L5c
        L3d:
            r8.getClass()
            r0 = r8
            j$.util.stream.k r0 = (p164j$.util.stream.C8683k) r0
            j$.util.function.K0 r5 = r0.m17446f()
            j$.util.function.BiConsumer r4 = r0.m17451a()
            j$.util.function.f r3 = r0.m17449c()
            j$.util.stream.F1 r0 = new j$.util.stream.F1
            j$.util.stream.W2 r2 = p164j$.util.stream.EnumC8620W2.REFERENCE
            r1 = r0
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r7.m17495z1(r0)
        L5c:
            j$.util.stream.k r8 = (p164j$.util.stream.C8683k) r8
            java.util.Set r0 = r8.m17450b()
            j$.util.stream.j r2 = p164j$.util.stream.EnumC8678j.IDENTITY_FINISH
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L6b
            goto L73
        L6b:
            j$.util.function.Function r8 = r8.m17447e()
            java.lang.Object r1 = r8.apply(r1)
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.stream.AbstractC8631Z1.mo17508w(j$.util.stream.m):java.lang.Object");
    }
}