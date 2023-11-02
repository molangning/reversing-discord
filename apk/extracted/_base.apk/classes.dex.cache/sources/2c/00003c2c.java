package p164j$.util.stream;

import p164j$.util.AbstractC8383c0;
import p164j$.util.C8416f;
import p164j$.util.C8512j;
import p164j$.util.C8513k;
import p164j$.util.InterfaceC8359G;
import p164j$.util.InterfaceC8764u;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8420B0;
import p164j$.util.function.InterfaceC8429G;
import p164j$.util.function.InterfaceC8437K;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8445O;
import p164j$.util.function.InterfaceC8449S;
import p164j$.util.function.InterfaceC8452V;
import p164j$.util.function.InterfaceC8455Y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8649d0 extends AbstractC8643c implements IntStream {
    public AbstractC8649d0(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    public AbstractC8649d0(AbstractC8643c abstractC8643c, int i) {
        super(abstractC8643c, i);
    }

    /* renamed from: Q1 */
    public static InterfaceC8359G m17490Q1(Spliterator spliterator) {
        if (spliterator instanceof InterfaceC8359G) {
            return (InterfaceC8359G) spliterator;
        }
        if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(AbstractC8643c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: B1 */
    final InterfaceC8548F0 mo17445B1(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC8744w0.m17359S0(abstractC8744w0, spliterator, z);
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: C */
    public final Object mo17493C(InterfaceC8438K0 interfaceC8438K0, InterfaceC8420B0 interfaceC8420B0, BiConsumer biConsumer) {
        C8723s c8723s = new C8723s(biConsumer, 1);
        interfaceC8438K0.getClass();
        interfaceC8420B0.getClass();
        return m17495z1(new C8745w1(EnumC8620W2.INT_VALUE, c8723s, interfaceC8420B0, interfaceC8438K0, 4));
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: C1 */
    final void mo17444C1(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2) {
        InterfaceC8437K c8617w;
        InterfaceC8359G m17490Q1 = m17490Q1(spliterator);
        if (interfaceC8671h2 instanceof InterfaceC8437K) {
            c8617w = (InterfaceC8437K) interfaceC8671h2;
        } else if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(AbstractC8643c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        } else {
            interfaceC8671h2.getClass();
            c8617w = new C8617W(0, interfaceC8671h2);
        }
        while (!interfaceC8671h2.mo17301i() && m17490Q1.mo17457k(c8617w)) {
        }
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: D1 */
    public final EnumC8620W2 mo17443D1() {
        return EnumC8620W2.INT_VALUE;
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: F */
    public final boolean mo17492F(InterfaceC8445O interfaceC8445O) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17336o1(interfaceC8445O, EnumC8729t0.ANY))).booleanValue();
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: N1 */
    final Spliterator mo17442N1(AbstractC8744w0 abstractC8744w0, C8633a c8633a, boolean z) {
        return new C8677i3(abstractC8744w0, c8633a, z);
    }

    /* renamed from: S */
    public void mo17489S(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        m17495z1(new C8590P(interfaceC8437K, true));
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: T */
    public final Stream mo17488T(IntFunction intFunction) {
        intFunction.getClass();
        return new C8743w(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, intFunction, 1);
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: W */
    public final IntStream mo17487W(IntFunction intFunction) {
        return new C8748x(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n | EnumC8616V2.f22790t, intFunction, 3);
    }

    /* renamed from: a0 */
    public void mo17486a0(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        m17495z1(new C8590P(interfaceC8437K, false));
    }

    @Override // p164j$.util.stream.IntStream
    public final InterfaceC8552G asDoubleStream() {
        return new C8758z(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, 1);
    }

    @Override // p164j$.util.stream.IntStream
    public final InterfaceC8699n0 asLongStream() {
        return new C8625Y(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, 0);
    }

    @Override // p164j$.util.stream.IntStream
    public final C8512j average() {
        long[] jArr = (long[]) mo17493C(new C8638b(17), new C8638b(18), new C8638b(19));
        long j = jArr[0];
        return j > 0 ? C8512j.m17618d(jArr[1] / j) : C8512j.m17621a();
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: b0 */
    public final InterfaceC8552G mo17485b0(InterfaceC8449S interfaceC8449S) {
        interfaceC8449S.getClass();
        return new C8738v(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8449S, 4);
    }

    @Override // p164j$.util.stream.IntStream
    public final Stream boxed() {
        return mo17488T(new C8603S1(27));
    }

    @Override // p164j$.util.stream.IntStream
    public final long count() {
        return ((AbstractC8684k0) mo17484d(new C8638b(16))).sum();
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: d */
    public final InterfaceC8699n0 mo17484d(InterfaceC8452V interfaceC8452V) {
        interfaceC8452V.getClass();
        return new C8753y(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8452V, 1);
    }

    @Override // p164j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC8631Z1) ((AbstractC8631Z1) boxed()).distinct()).mo17523K(new C8638b(15));
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: e0 */
    public final IntStream mo17483e0(InterfaceC8445O interfaceC8445O) {
        interfaceC8445O.getClass();
        return new C8748x(this, EnumC8616V2.f22790t, interfaceC8445O, 4);
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: f0 */
    public final C8513k mo17482f0(InterfaceC8429G interfaceC8429G) {
        interfaceC8429G.getClass();
        return (C8513k) m17495z1(new C8524A1(EnumC8620W2.INT_VALUE, interfaceC8429G, 2));
    }

    @Override // p164j$.util.stream.IntStream
    public final C8513k findAny() {
        return (C8513k) m17495z1(new C8557H(false, EnumC8620W2.INT_VALUE, C8513k.m17617a(), new C8603S1(22), new C8638b(13)));
    }

    @Override // p164j$.util.stream.IntStream
    public final C8513k findFirst() {
        return (C8513k) m17495z1(new C8557H(true, EnumC8620W2.INT_VALUE, C8513k.m17617a(), new C8603S1(22), new C8638b(13)));
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: g0 */
    public final IntStream mo17481g0(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8748x(this, 0, interfaceC8437K, 1);
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final InterfaceC8764u iterator() {
        return AbstractC8383c0.m17757g(spliterator());
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: k */
    public final IntStream mo17480k(InterfaceC8455Y interfaceC8455Y) {
        interfaceC8455Y.getClass();
        return new C8748x(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8455Y, 2);
    }

    @Override // p164j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return AbstractC8744w0.m17337n1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p164j$.util.stream.IntStream
    public final C8513k max() {
        return mo17482f0(new C8603S1(28));
    }

    @Override // p164j$.util.stream.IntStream
    public final C8513k min() {
        return mo17482f0(new C8603S1(23));
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: r */
    public final int mo17479r(int i, InterfaceC8429G interfaceC8429G) {
        interfaceC8429G.getClass();
        return ((Integer) m17495z1(new C8564I1(EnumC8620W2.INT_VALUE, interfaceC8429G, i))).intValue();
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: r1 */
    public final InterfaceC8523A0 mo17330r1(long j, IntFunction intFunction) {
        return AbstractC8744w0.m17344h1(j);
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: s */
    public final boolean mo17478s(InterfaceC8445O interfaceC8445O) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17336o1(interfaceC8445O, EnumC8729t0.ALL))).booleanValue();
    }

    @Override // p164j$.util.stream.IntStream
    public final IntStream skip(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : AbstractC8744w0.m17337n1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p164j$.util.stream.IntStream
    public final IntStream sorted() {
        return new C8525A2(this);
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final InterfaceC8359G spliterator() {
        return m17490Q1(super.spliterator());
    }

    @Override // p164j$.util.stream.IntStream
    public final int sum() {
        return mo17479r(0, new C8603S1(24));
    }

    @Override // p164j$.util.stream.IntStream
    public final C8416f summaryStatistics() {
        return (C8416f) mo17493C(new C8603S1(9), new C8603S1(25), new C8603S1(26));
    }

    @Override // p164j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC8744w0.m17347e1((InterfaceC8533C0) m17503A1(new C8638b(20))).mo17430b();
    }

    @Override // p164j$.util.stream.IntStream
    /* renamed from: u */
    public final boolean mo17477u(InterfaceC8445O interfaceC8445O) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17336o1(interfaceC8445O, EnumC8729t0.NONE))).booleanValue();
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final InterfaceC8673i unordered() {
        return !m17501F1() ? this : new C8629Z(this, EnumC8616V2.f22788r);
    }
}