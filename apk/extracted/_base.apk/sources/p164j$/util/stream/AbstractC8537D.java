package p164j$.util.stream;

import p164j$.util.AbstractC8383c0;
import p164j$.util.C8414e;
import p164j$.util.C8512j;
import p164j$.util.InterfaceC8356D;
import p164j$.util.InterfaceC8519q;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8421C;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8475j;
import p164j$.util.function.InterfaceC8483n;
import p164j$.util.function.InterfaceC8489q;
import p164j$.util.function.InterfaceC8495t;
import p164j$.util.function.InterfaceC8501w;
import p164j$.util.function.InterfaceC8506y0;
import p164j$.util.function.InterfaceC8507z;

/* renamed from: j$.util.stream.D */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8537D extends AbstractC8643c implements InterfaceC8552G {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8537D(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8537D(AbstractC8643c abstractC8643c, int i) {
        super(abstractC8643c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public static InterfaceC8356D m17589Q1(Spliterator spliterator) {
        if (spliterator instanceof InterfaceC8356D) {
            return (InterfaceC8356D) spliterator;
        }
        if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(AbstractC8643c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: B1 */
    final InterfaceC8548F0 mo17445B1(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC8744w0.m17360R0(abstractC8744w0, spliterator, z);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: C1 */
    final void mo17444C1(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2) {
        InterfaceC8483n c8728t;
        InterfaceC8356D m17589Q1 = m17589Q1(spliterator);
        if (interfaceC8671h2 instanceof InterfaceC8483n) {
            c8728t = (InterfaceC8483n) interfaceC8671h2;
        } else if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(AbstractC8643c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        } else {
            interfaceC8671h2.getClass();
            c8728t = new C8728t(0, interfaceC8671h2);
        }
        while (!interfaceC8671h2.mo17301i() && m17589Q1.mo17466p(c8728t)) {
        }
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: D */
    public final IntStream mo17586D(InterfaceC8501w interfaceC8501w) {
        interfaceC8501w.getClass();
        return new C8748x(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8501w, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: D1 */
    public final EnumC8620W2 mo17443D1() {
        return EnumC8620W2.DOUBLE_VALUE;
    }

    /* renamed from: J */
    public void mo17585J(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        m17495z1(new C8586O(interfaceC8483n, false));
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: N1 */
    final Spliterator mo17442N1(AbstractC8744w0 abstractC8744w0, C8633a c8633a, boolean z) {
        return new C8667g3(abstractC8744w0, c8633a, z);
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: R */
    public final C8512j mo17584R(InterfaceC8475j interfaceC8475j) {
        interfaceC8475j.getClass();
        return (C8512j) m17495z1(new C8524A1(EnumC8620W2.DOUBLE_VALUE, interfaceC8475j, 0));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: U */
    public final double mo17583U(double d, InterfaceC8475j interfaceC8475j) {
        interfaceC8475j.getClass();
        return ((Double) m17495z1(new C8755y1(EnumC8620W2.DOUBLE_VALUE, interfaceC8475j, d))).doubleValue();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: V */
    public final boolean mo17582V(InterfaceC8495t interfaceC8495t) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17339m1(interfaceC8495t, EnumC8729t0.NONE))).booleanValue();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: Z */
    public final boolean mo17581Z(InterfaceC8495t interfaceC8495t) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17339m1(interfaceC8495t, EnumC8729t0.ALL))).booleanValue();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final C8512j average() {
        double[] dArr = (double[]) mo17575o(new C8638b(5), new C8638b(6), new C8638b(7));
        if (dArr[2] > 0.0d) {
            int i = AbstractC8698n.f22895a;
            double d = dArr[0] + dArr[1];
            double d2 = dArr[dArr.length - 1];
            if (Double.isNaN(d) && Double.isInfinite(d2)) {
                d = d2;
            }
            return C8512j.m17618d(d / dArr[2]);
        }
        return C8512j.m17621a();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: b */
    public final InterfaceC8552G mo17580b(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8738v(this, 0, interfaceC8483n, 3);
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final Stream boxed() {
        return mo17573q(new C8603S1(16));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final long count() {
        return ((AbstractC8684k0) mo17577j(new C8638b(4))).sum();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final InterfaceC8552G distinct() {
        return ((AbstractC8631Z1) ((AbstractC8631Z1) boxed()).distinct()).mo17513l0(new C8638b(8));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final C8512j findAny() {
        return (C8512j) m17495z1(new C8557H(false, EnumC8620W2.DOUBLE_VALUE, C8512j.m17621a(), new C8603S1(19), new C8638b(10)));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final C8512j findFirst() {
        return (C8512j) m17495z1(new C8557H(true, EnumC8620W2.DOUBLE_VALUE, C8512j.m17621a(), new C8603S1(19), new C8638b(10)));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: h */
    public final InterfaceC8552G mo17579h(InterfaceC8495t interfaceC8495t) {
        interfaceC8495t.getClass();
        return new C8738v(this, EnumC8616V2.f22790t, interfaceC8495t, 2);
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: i */
    public final InterfaceC8552G mo17578i(InterfaceC8489q interfaceC8489q) {
        return new C8738v(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n | EnumC8616V2.f22790t, interfaceC8489q, 1);
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final InterfaceC8519q iterator() {
        return AbstractC8383c0.m17758f(spliterator());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: j */
    public final InterfaceC8699n0 mo17577j(InterfaceC8507z interfaceC8507z) {
        interfaceC8507z.getClass();
        return new C8753y(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8507z, 0);
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final InterfaceC8552G limit(long j) {
        if (j >= 0) {
            return AbstractC8744w0.m17340l1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    /* renamed from: m0 */
    public void mo17576m0(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        m17495z1(new C8586O(interfaceC8483n, true));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final C8512j max() {
        return mo17584R(new C8603S1(15));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final C8512j min() {
        return mo17584R(new C8603S1(14));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: o */
    public final Object mo17575o(InterfaceC8438K0 interfaceC8438K0, InterfaceC8506y0 interfaceC8506y0, BiConsumer biConsumer) {
        C8723s c8723s = new C8723s(biConsumer, 0);
        interfaceC8438K0.getClass();
        interfaceC8506y0.getClass();
        return m17495z1(new C8745w1(EnumC8620W2.DOUBLE_VALUE, c8723s, interfaceC8506y0, interfaceC8438K0, 1));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: p */
    public final InterfaceC8552G mo17574p(InterfaceC8421C interfaceC8421C) {
        interfaceC8421C.getClass();
        return new C8738v(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8421C, 0);
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: q */
    public final Stream mo17573q(InterfaceC8489q interfaceC8489q) {
        interfaceC8489q.getClass();
        return new C8743w(this, EnumC8616V2.f22786p | EnumC8616V2.f22784n, interfaceC8489q, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: r1 */
    public final InterfaceC8523A0 mo17330r1(long j, IntFunction intFunction) {
        return AbstractC8744w0.m17354X0(j);
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final InterfaceC8552G skip(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : AbstractC8744w0.m17340l1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final InterfaceC8552G sorted() {
        return new C8761z2(this);
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final InterfaceC8356D spliterator() {
        return m17589Q1(super.spliterator());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final double sum() {
        double[] dArr = (double[]) mo17575o(new C8638b(9), new C8638b(2), new C8638b(3));
        int i = AbstractC8698n.f22895a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final C8414e summaryStatistics() {
        return (C8414e) mo17575o(new C8603S1(8), new C8603S1(17), new C8603S1(18));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final double[] toArray() {
        return (double[]) AbstractC8744w0.m17348d1((InterfaceC8528B0) m17503A1(new C8638b(1))).mo17430b();
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final InterfaceC8673i unordered() {
        return !m17501F1() ? this : new C8758z(this, EnumC8616V2.f22788r, 0);
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: x */
    public final boolean mo17572x(InterfaceC8495t interfaceC8495t) {
        return ((Boolean) m17495z1(AbstractC8744w0.m17339m1(interfaceC8495t, EnumC8729t0.ANY))).booleanValue();
    }
}
