package p164j$.util.stream;

import p164j$.util.InterfaceC8356D;
import p164j$.util.InterfaceC8359G;
import p164j$.util.InterfaceC8362J;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8437K;
import p164j$.util.function.InterfaceC8445O;
import p164j$.util.function.InterfaceC8468f0;
import p164j$.util.function.InterfaceC8480l0;
import p164j$.util.function.InterfaceC8483n;
import p164j$.util.function.InterfaceC8495t;
import p164j$.util.function.Predicate;

/* renamed from: j$.util.stream.w0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract /* synthetic */ class AbstractC8744w0 implements InterfaceC8546E3 {

    /* renamed from: a */
    private static final C8626Y0 f22973a = new C8626Y0();

    /* renamed from: b */
    private static final InterfaceC8533C0 f22974b = new C8618W0();

    /* renamed from: c */
    private static final InterfaceC8538D0 f22975c = new C8622X0();

    /* renamed from: d */
    private static final InterfaceC8528B0 f22976d = new C8614V0();

    /* renamed from: e */
    private static final int[] f22977e = new int[0];

    /* renamed from: f */
    private static final long[] f22978f = new long[0];

    /* renamed from: g */
    private static final double[] f22979g = new double[0];

    public /* synthetic */ AbstractC8744w0() {
    }

    public /* synthetic */ AbstractC8744w0(EnumC8620W2 enumC8620W2) {
    }

    /* renamed from: A0 */
    public static void m17378A0(InterfaceC8533C0 interfaceC8533C0, Integer[] numArr, int i) {
        if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(interfaceC8533C0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) interfaceC8533C0.mo17430b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    /* renamed from: B0 */
    public static void m17377B0(InterfaceC8538D0 interfaceC8538D0, Long[] lArr, int i) {
        if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(interfaceC8538D0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) interfaceC8538D0.mo17430b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    /* renamed from: C0 */
    public static void m17376C0(InterfaceC8528B0 interfaceC8528B0, Consumer consumer) {
        if (consumer instanceof InterfaceC8483n) {
            interfaceC8528B0.mo17428d((InterfaceC8483n) consumer);
        } else if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(interfaceC8528B0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((InterfaceC8356D) interfaceC8528B0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* renamed from: D0 */
    public static void m17375D0(InterfaceC8533C0 interfaceC8533C0, Consumer consumer) {
        if (consumer instanceof InterfaceC8437K) {
            interfaceC8533C0.mo17428d((InterfaceC8437K) consumer);
        } else if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(interfaceC8533C0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((InterfaceC8359G) interfaceC8533C0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* renamed from: E0 */
    public static void m17374E0(InterfaceC8538D0 interfaceC8538D0, Consumer consumer) {
        if (consumer instanceof InterfaceC8468f0) {
            interfaceC8538D0.mo17428d((InterfaceC8468f0) consumer);
        } else if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(interfaceC8538D0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((InterfaceC8362J) interfaceC8538D0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* renamed from: F0 */
    public static InterfaceC8528B0 m17373F0(InterfaceC8528B0 interfaceC8528B0, long j, long j2) {
        if (j == 0 && j2 == interfaceC8528B0.count()) {
            return interfaceC8528B0;
        }
        long j3 = j2 - j;
        InterfaceC8356D interfaceC8356D = (InterfaceC8356D) interfaceC8528B0.spliterator();
        InterfaceC8749x0 m17354X0 = m17354X0(j3);
        m17354X0.mo17302g(j3);
        for (int i = 0; i < j && interfaceC8356D.mo17466p(new C8692l3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && interfaceC8356D.mo17466p(m17354X0); i2++) {
        }
        m17354X0.end();
        return m17354X0.build();
    }

    /* renamed from: G0 */
    public static InterfaceC8533C0 m17372G0(InterfaceC8533C0 interfaceC8533C0, long j, long j2) {
        if (j == 0 && j2 == interfaceC8533C0.count()) {
            return interfaceC8533C0;
        }
        long j3 = j2 - j;
        InterfaceC8359G interfaceC8359G = (InterfaceC8359G) interfaceC8533C0.spliterator();
        InterfaceC8754y0 m17344h1 = m17344h1(j3);
        m17344h1.mo17302g(j3);
        for (int i = 0; i < j && interfaceC8359G.mo17457k(new C8702n3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && interfaceC8359G.mo17457k(m17344h1); i2++) {
        }
        m17344h1.end();
        return m17344h1.build();
    }

    /* renamed from: H0 */
    public static InterfaceC8538D0 m17371H0(InterfaceC8538D0 interfaceC8538D0, long j, long j2) {
        if (j == 0 && j2 == interfaceC8538D0.count()) {
            return interfaceC8538D0;
        }
        long j3 = j2 - j;
        InterfaceC8362J interfaceC8362J = (InterfaceC8362J) interfaceC8538D0.spliterator();
        InterfaceC8759z0 m17342j1 = m17342j1(j3);
        m17342j1.mo17302g(j3);
        for (int i = 0; i < j && interfaceC8362J.mo17437f(new C8712p3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && interfaceC8362J.mo17437f(m17342j1); i2++) {
        }
        m17342j1.end();
        return m17342j1.build();
    }

    /* renamed from: I0 */
    public static InterfaceC8548F0 m17370I0(InterfaceC8548F0 interfaceC8548F0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == interfaceC8548F0.count()) {
            return interfaceC8548F0;
        }
        Spliterator spliterator = interfaceC8548F0.spliterator();
        long j3 = j2 - j;
        InterfaceC8523A0 m17362P0 = m17362P0(j3, intFunction);
        m17362P0.mo17302g(j3);
        for (int i = 0; i < j && spliterator.mo17305a(new C8659f0(5)); i++) {
        }
        for (int i2 = 0; i2 < j3 && spliterator.mo17305a(m17362P0); i2++) {
        }
        m17362P0.end();
        return m17362P0.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public static long m17369J0(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public static Spliterator m17368K0(EnumC8620W2 enumC8620W2, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = AbstractC8716q2.f22923a[enumC8620W2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new C8697m3((InterfaceC8356D) spliterator, j, j4);
                    }
                    throw new IllegalStateException("Unknown shape " + enumC8620W2);
                }
                return new C8717q3((InterfaceC8362J) spliterator, j, j4);
            }
            return new C8707o3((InterfaceC8359G) spliterator, j, j4);
        }
        return new C8727s3(spliterator, j, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public static long m17367L0(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public static InterfaceC8523A0 m17362P0(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C8725s1() : new C8635a1(j, intFunction);
    }

    /* renamed from: Q0 */
    public static InterfaceC8548F0 m17361Q0(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long mo17351a1 = abstractC8744w0.mo17351a1(spliterator);
        if (mo17351a1 < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC8548F0 interfaceC8548F0 = (InterfaceC8548F0) new C8575L0(spliterator, intFunction, abstractC8744w0).invoke();
            return z ? m17349c1(interfaceC8548F0, intFunction) : interfaceC8548F0;
        } else if (mo17351a1 < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) mo17351a1);
            new C8715q1(spliterator, abstractC8744w0, objArr).invoke();
            return new C8563I0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: R0 */
    public static InterfaceC8528B0 m17360R0(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z) {
        long mo17351a1 = abstractC8744w0.mo17351a1(spliterator);
        if (mo17351a1 < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC8528B0 interfaceC8528B0 = (InterfaceC8528B0) new C8575L0(0, spliterator, abstractC8744w0).invoke();
            return z ? m17348d1(interfaceC8528B0) : interfaceC8528B0;
        } else if (mo17351a1 < 2147483639) {
            double[] dArr = new double[(int) mo17351a1];
            new C8700n1(spliterator, abstractC8744w0, dArr).invoke();
            return new C8602S0(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: S0 */
    public static InterfaceC8533C0 m17359S0(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z) {
        long mo17351a1 = abstractC8744w0.mo17351a1(spliterator);
        if (mo17351a1 < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC8533C0 interfaceC8533C0 = (InterfaceC8533C0) new C8575L0(1, spliterator, abstractC8744w0).invoke();
            return z ? m17347e1(interfaceC8533C0) : interfaceC8533C0;
        } else if (mo17351a1 < 2147483639) {
            int[] iArr = new int[(int) mo17351a1];
            new C8705o1(spliterator, abstractC8744w0, iArr).invoke();
            return new C8640b1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: T0 */
    public static InterfaceC8538D0 m17358T0(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z) {
        long mo17351a1 = abstractC8744w0.mo17351a1(spliterator);
        if (mo17351a1 < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC8538D0 interfaceC8538D0 = (InterfaceC8538D0) new C8575L0(2, spliterator, abstractC8744w0).invoke();
            return z ? m17346f1(interfaceC8538D0) : interfaceC8538D0;
        } else if (mo17351a1 < 2147483639) {
            long[] jArr = new long[(int) mo17351a1];
            new C8710p1(spliterator, abstractC8744w0, jArr).invoke();
            return new C8685k1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public static AbstractC8558H0 m17357U0(EnumC8620W2 enumC8620W2, InterfaceC8548F0 interfaceC8548F0, InterfaceC8548F0 interfaceC8548F02) {
        int i = AbstractC8553G0.f22675a[enumC8620W2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new C8583N0((InterfaceC8528B0) interfaceC8548F0, (InterfaceC8528B0) interfaceC8548F02);
                    }
                    throw new IllegalStateException("Unknown shape " + enumC8620W2);
                }
                return new C8591P0((InterfaceC8538D0) interfaceC8548F0, (InterfaceC8538D0) interfaceC8548F02);
            }
            return new C8587O0((InterfaceC8533C0) interfaceC8548F0, (InterfaceC8533C0) interfaceC8548F02);
        }
        return new C8598R0(interfaceC8548F0, interfaceC8548F02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public static InterfaceC8749x0 m17354X0(long j) {
        return (j < 0 || j >= 2147483639) ? new C8610U0() : new C8606T0(j);
    }

    /* renamed from: Y0 */
    public static InterfaceC8552G m17353Y0(InterfaceC8356D interfaceC8356D) {
        return new C8522A(interfaceC8356D, EnumC8616V2.m17538c(interfaceC8356D));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public static AbstractC8630Z0 m17352Z0(EnumC8620W2 enumC8620W2) {
        Object obj;
        int i = AbstractC8553G0.f22675a[enumC8620W2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                obj = f22974b;
            } else if (i == 3) {
                obj = f22975c;
            } else if (i != 4) {
                throw new IllegalStateException("Unknown shape " + enumC8620W2);
            } else {
                obj = f22976d;
            }
            return (AbstractC8630Z0) obj;
        }
        return f22973a;
    }

    /* renamed from: b1 */
    private static int m17350b1(long j) {
        return (j != -1 ? EnumC8616V2.f22791u : 0) | EnumC8616V2.f22790t;
    }

    /* renamed from: c1 */
    public static InterfaceC8548F0 m17349c1(InterfaceC8548F0 interfaceC8548F0, IntFunction intFunction) {
        if (interfaceC8548F0.mo17390k() > 0) {
            long count = interfaceC8548F0.count();
            if (count < 2147483639) {
                Object[] objArr = (Object[]) intFunction.apply((int) count);
                new C8735u1(interfaceC8548F0, objArr).invoke();
                return new C8563I0(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return interfaceC8548F0;
    }

    /* renamed from: d1 */
    public static InterfaceC8528B0 m17348d1(InterfaceC8528B0 interfaceC8528B0) {
        if (interfaceC8528B0.mo17390k() > 0) {
            long count = interfaceC8528B0.count();
            if (count < 2147483639) {
                double[] dArr = new double[(int) count];
                new C8730t1(interfaceC8528B0, dArr).invoke();
                return new C8602S0(dArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return interfaceC8528B0;
    }

    /* renamed from: e1 */
    public static InterfaceC8533C0 m17347e1(InterfaceC8533C0 interfaceC8533C0) {
        if (interfaceC8533C0.mo17390k() > 0) {
            long count = interfaceC8533C0.count();
            if (count < 2147483639) {
                int[] iArr = new int[(int) count];
                new C8730t1(interfaceC8533C0, iArr).invoke();
                return new C8640b1(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return interfaceC8533C0;
    }

    /* renamed from: f1 */
    public static InterfaceC8538D0 m17346f1(InterfaceC8538D0 interfaceC8538D0) {
        if (interfaceC8538D0.mo17390k() > 0) {
            long count = interfaceC8538D0.count();
            if (count < 2147483639) {
                long[] jArr = new long[(int) count];
                new C8730t1(interfaceC8538D0, jArr).invoke();
                return new C8685k1(jArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return interfaceC8538D0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1 */
    public static InterfaceC8754y0 m17344h1(long j) {
        return (j < 0 || j >= 2147483639) ? new C8650d1() : new C8645c1(j);
    }

    /* renamed from: i1 */
    public static IntStream m17343i1(InterfaceC8359G interfaceC8359G) {
        return new C8634a0(interfaceC8359G, EnumC8616V2.m17538c(interfaceC8359G));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1 */
    public static InterfaceC8759z0 m17342j1(long j) {
        return (j < 0 || j >= 2147483639) ? new C8695m1() : new C8690l1(j);
    }

    /* renamed from: k1 */
    public static InterfaceC8699n0 m17341k1(InterfaceC8362J interfaceC8362J) {
        return new C8669h0(interfaceC8362J, EnumC8616V2.m17538c(interfaceC8362J));
    }

    /* renamed from: l1 */
    public static InterfaceC8552G m17340l1(AbstractC8643c abstractC8643c, long j, long j2) {
        if (j >= 0) {
            return new C8711p2(abstractC8643c, m17350b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: m1 */
    public static C8734u0 m17339m1(InterfaceC8495t interfaceC8495t, EnumC8729t0 enumC8729t0) {
        interfaceC8495t.getClass();
        enumC8729t0.getClass();
        return new C8734u0(EnumC8620W2.DOUBLE_VALUE, enumC8729t0, new C8703o(3, enumC8729t0, interfaceC8495t));
    }

    /* renamed from: n1 */
    public static IntStream m17337n1(AbstractC8643c abstractC8643c, long j, long j2) {
        if (j >= 0) {
            return new C8691l2(abstractC8643c, m17350b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: o1 */
    public static C8734u0 m17336o1(InterfaceC8445O interfaceC8445O, EnumC8729t0 enumC8729t0) {
        interfaceC8445O.getClass();
        enumC8729t0.getClass();
        return new C8734u0(EnumC8620W2.INT_VALUE, enumC8729t0, new C8703o(1, enumC8729t0, interfaceC8445O));
    }

    /* renamed from: p0 */
    public static void m17335p0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: p1 */
    public static InterfaceC8699n0 m17334p1(AbstractC8643c abstractC8643c, long j, long j2) {
        if (j >= 0) {
            return new C8701n2(abstractC8643c, m17350b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: q0 */
    public static void m17333q0(InterfaceC8656e2 interfaceC8656e2, Double d) {
        if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(interfaceC8656e2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        } else {
            interfaceC8656e2.accept(d.doubleValue());
        }
    }

    /* renamed from: q1 */
    public static C8734u0 m17332q1(InterfaceC8480l0 interfaceC8480l0, EnumC8729t0 enumC8729t0) {
        interfaceC8480l0.getClass();
        enumC8729t0.getClass();
        return new C8734u0(EnumC8620W2.LONG_VALUE, enumC8729t0, new C8703o(4, enumC8729t0, interfaceC8480l0));
    }

    /* renamed from: s0 */
    public static void m17329s0(InterfaceC8661f2 interfaceC8661f2, Integer num) {
        if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(interfaceC8661f2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        } else {
            interfaceC8661f2.accept(num.intValue());
        }
    }

    /* renamed from: s1 */
    public static C8734u0 m17328s1(Predicate predicate, EnumC8729t0 enumC8729t0) {
        predicate.getClass();
        enumC8729t0.getClass();
        return new C8734u0(EnumC8620W2.REFERENCE, enumC8729t0, new C8703o(2, enumC8729t0, predicate));
    }

    /* renamed from: t1 */
    public static Stream m17326t1(AbstractC8643c abstractC8643c, long j, long j2) {
        if (j >= 0) {
            return new C8681j2(abstractC8643c, m17350b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: u0 */
    public static void m17325u0(InterfaceC8666g2 interfaceC8666g2, Long l) {
        if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(interfaceC8666g2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        } else {
            interfaceC8666g2.accept(l.longValue());
        }
    }

    /* renamed from: v1 */
    public static Stream m17323v1(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        return new C8619W1(spliterator, EnumC8616V2.m17538c(spliterator), z);
    }

    /* renamed from: w0 */
    public static void m17322w0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: x0 */
    public static void m17320x0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: y0 */
    public static Object[] m17317y0(InterfaceC8543E0 interfaceC8543E0, IntFunction intFunction) {
        if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(interfaceC8543E0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (interfaceC8543E0.count() < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) interfaceC8543E0.count());
            interfaceC8543E0.mo17391f(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: z0 */
    public static void m17316z0(InterfaceC8528B0 interfaceC8528B0, Double[] dArr, int i) {
        if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(interfaceC8528B0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC8528B0.mo17430b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: P */
    public /* synthetic */ int mo17363P() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V0 */
    public abstract void mo17356V0(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public abstract void mo17355W0(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a1 */
    public abstract long mo17351a1(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1 */
    public abstract int mo17345g1();

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: n0 */
    public Object mo17338n0(AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        InterfaceC8592P1 mo17306u1 = mo17306u1();
        abstractC8744w0.mo17321w1(spliterator, mo17306u1);
        return mo17306u1.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r1 */
    public abstract InterfaceC8523A0 mo17330r1(long j, IntFunction intFunction);

    /* renamed from: u1 */
    public abstract InterfaceC8592P1 mo17306u1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1 */
    public abstract InterfaceC8671h2 mo17321w1(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x1 */
    public abstract InterfaceC8671h2 mo17319x1(InterfaceC8671h2 interfaceC8671h2);

    @Override // p164j$.util.stream.InterfaceC8546E3
    /* renamed from: y */
    public Object mo17318y(AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        return ((InterfaceC8592P1) new C8599R1(this, abstractC8744w0, spliterator).invoke()).get();
    }
}
