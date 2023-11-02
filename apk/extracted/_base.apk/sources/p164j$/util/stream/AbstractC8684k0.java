package p164j$.util.stream;

import p164j$.util.AbstractC8383c0;
import p164j$.util.C8509g;
import p164j$.util.C8512j;
import p164j$.util.C8514l;
import p164j$.util.InterfaceC8362J;
import p164j$.util.InterfaceC8768y;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8426E0;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8460b0;
import p164j$.util.function.InterfaceC8468f0;
import p164j$.util.function.InterfaceC8474i0;
import p164j$.util.function.InterfaceC8480l0;
import p164j$.util.function.InterfaceC8486o0;
import p164j$.util.function.InterfaceC8492r0;
import p164j$.util.function.InterfaceC8500v0;

/* renamed from: j$.util.stream.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8684k0 extends AbstractC8643c implements InterfaceC8699n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8684k0(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8684k0(AbstractC8643c abstractC8643c, int i) {
        super(abstractC8643c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public static InterfaceC8362J m17440Q1(Spliterator spliterator) {
        if (spliterator instanceof InterfaceC8362J) {
            return (InterfaceC8362J) spliterator;
        }
        if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(AbstractC8643c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: A */
    public final Object mo17424A(InterfaceC8438K0 interfaceC8438K0, InterfaceC8426E0 interfaceC8426E0, BiConsumer biConsumer) {
        C8723s c8723s = new C8723s(biConsumer, 2);
        interfaceC8438K0.getClass();
        interfaceC8426E0.getClass();
        return m17495z1(new C8745w1(EnumC8620W2.LONG_VALUE, c8723s, interfaceC8426E0, interfaceC8438K0, 0));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: B */
    public final boolean mo17423B(InterfaceC8480l0 interfaceC8480l0) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17332q1(interfaceC8480l0, EnumC8729t0.ALL))).booleanValue();
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: B1 */
    final InterfaceC8548F0 mo17445B1(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC8744w0.m17358T0(abstractC8744w0, spliterator, z);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: C1 */
    final void mo17444C1(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2) {
        InterfaceC8468f0 c8654e0;
        InterfaceC8362J m17440Q1 = m17440Q1(spliterator);
        if (interfaceC8671h2 instanceof InterfaceC8468f0) {
            c8654e0 = (InterfaceC8468f0) interfaceC8671h2;
        } else if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(AbstractC8643c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        } else {
            interfaceC8671h2.getClass();
            c8654e0 = new C8654e0(0, interfaceC8671h2);
        }
        while (!interfaceC8671h2.mo17301i() && m17440Q1.mo17437f(c8654e0)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: D1 */
    public final EnumC8620W2 mo17443D1() {
        return EnumC8620W2.LONG_VALUE;
    }

    /* renamed from: G */
    public void mo17422G(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        m17495z1(new C8594Q(interfaceC8468f0, false));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: M */
    public final InterfaceC8552G mo17421M(InterfaceC8486o0 interfaceC8486o0) {
        interfaceC8486o0.getClass();
        return new C8738v(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8486o0, 5);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: N1 */
    final Spliterator mo17442N1(AbstractC8744w0 abstractC8744w0, C8633a c8633a, boolean z) {
        return new C8687k3(abstractC8744w0, c8633a, z);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: Q */
    public final InterfaceC8699n0 mo17420Q(InterfaceC8500v0 interfaceC8500v0) {
        interfaceC8500v0.getClass();
        return new C8753y(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8500v0, 2);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: X */
    public final IntStream mo17419X(InterfaceC8492r0 interfaceC8492r0) {
        interfaceC8492r0.getClass();
        return new C8748x(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8492r0, 5);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: Y */
    public final Stream mo17418Y(InterfaceC8474i0 interfaceC8474i0) {
        interfaceC8474i0.getClass();
        return new C8743w(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8474i0, 2);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: a */
    public final boolean mo17417a(InterfaceC8480l0 interfaceC8480l0) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17332q1(interfaceC8480l0, EnumC8729t0.NONE))).booleanValue();
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final InterfaceC8552G asDoubleStream() {
        return new C8758z(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, 2);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final C8512j average() {
        long[] jArr = (long[]) mo17424A(new C8638b(24), new C8638b(25), new C8638b(26));
        long j = jArr[0];
        return j > 0 ? C8512j.m17618d(jArr[1] / j) : C8512j.m17621a();
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final Stream boxed() {
        return mo17418Y(new C8659f0(1));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final long count() {
        return ((AbstractC8684k0) mo17420Q(new C8638b(21))).sum();
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final InterfaceC8699n0 distinct() {
        return ((AbstractC8631Z1) ((AbstractC8631Z1) boxed()).distinct()).mo17515j0(new C8638b(22));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: e */
    public final C8514l mo17416e(InterfaceC8460b0 interfaceC8460b0) {
        interfaceC8460b0.getClass();
        return (C8514l) m17495z1(new C8524A1(EnumC8620W2.LONG_VALUE, interfaceC8460b0, 3));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: f */
    public final InterfaceC8699n0 mo17415f(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8753y(this, 0, interfaceC8468f0, 5);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final C8514l findAny() {
        return (C8514l) m17495z1(new C8557H(false, EnumC8620W2.LONG_VALUE, C8514l.m17613a(), new C8603S1(20), new C8638b(11)));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final C8514l findFirst() {
        return (C8514l) m17495z1(new C8557H(true, EnumC8620W2.LONG_VALUE, C8514l.m17613a(), new C8603S1(20), new C8638b(11)));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: g */
    public final InterfaceC8699n0 mo17414g(InterfaceC8474i0 interfaceC8474i0) {
        return new C8753y(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n | EnumC8616V2.f22790t, interfaceC8474i0, 3);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: h0 */
    public final boolean mo17413h0(InterfaceC8480l0 interfaceC8480l0) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17332q1(interfaceC8480l0, EnumC8729t0.ANY))).booleanValue();
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final InterfaceC8768y iterator() {
        return AbstractC8383c0.m17756h(spliterator());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: k0 */
    public final InterfaceC8699n0 mo17412k0(InterfaceC8480l0 interfaceC8480l0) {
        interfaceC8480l0.getClass();
        return new C8753y(this, EnumC8616V2.f22790t, interfaceC8480l0, 4);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final InterfaceC8699n0 limit(long j) {
        if (j >= 0) {
            return AbstractC8744w0.m17334p1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: m */
    public final long mo17411m(long j, InterfaceC8460b0 interfaceC8460b0) {
        interfaceC8460b0.getClass();
        return ((Long) m17495z1(new C8580M1(EnumC8620W2.LONG_VALUE, interfaceC8460b0, j))).longValue();
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final C8514l max() {
        return mo17416e(new C8659f0(0));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final C8514l min() {
        return mo17416e(new C8603S1(29));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: r1 */
    public final InterfaceC8523A0 mo17330r1(long j, IntFunction intFunction) {
        return AbstractC8744w0.m17342j1(j);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final InterfaceC8699n0 skip(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : AbstractC8744w0.m17334p1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final InterfaceC8699n0 sorted() {
        return new C8530B2(this);
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final InterfaceC8362J spliterator() {
        return m17440Q1(super.spliterator());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final long sum() {
        return mo17411m(0L, new C8659f0(2));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final C8509g summaryStatistics() {
        return (C8509g) mo17424A(new C8603S1(10), new C8659f0(3), new C8659f0(4));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final long[] toArray() {
        return (long[]) AbstractC8744w0.m17346f1((InterfaceC8538D0) m17503A1(new C8638b(23))).mo17430b();
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final InterfaceC8673i unordered() {
        return !m17501F1() ? this : new C8625Y(this, EnumC8616V2.f22788r, 1);
    }

    /* renamed from: z */
    public void mo17410z(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        m17495z1(new C8594Q(interfaceC8468f0, true));
    }
}
