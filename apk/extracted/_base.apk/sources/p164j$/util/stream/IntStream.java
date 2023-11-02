package p164j$.util.stream;

import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p164j$.util.AbstractC8511i;
import p164j$.util.C8357E;
import p164j$.util.C8358F;
import p164j$.util.C8366N;
import p164j$.util.C8416f;
import p164j$.util.C8512j;
import p164j$.util.C8513k;
import p164j$.util.C8521s;
import p164j$.util.C8763t;
import p164j$.util.InterfaceC8359G;
import p164j$.util.InterfaceC8764u;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.C8418A0;
import p164j$.util.function.C8425E;
import p164j$.util.function.C8427F;
import p164j$.util.function.C8433I;
import p164j$.util.function.C8434I0;
import p164j$.util.function.C8435J;
import p164j$.util.function.C8436J0;
import p164j$.util.function.C8439L;
import p164j$.util.function.C8441M;
import p164j$.util.function.C8443N;
import p164j$.util.function.C8447P;
import p164j$.util.function.C8448Q;
import p164j$.util.function.C8450T;
import p164j$.util.function.C8451U;
import p164j$.util.function.C8453W;
import p164j$.util.function.C8454X;
import p164j$.util.function.C8457a;
import p164j$.util.function.C8508z0;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8420B0;
import p164j$.util.function.InterfaceC8429G;
import p164j$.util.function.InterfaceC8437K;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8445O;
import p164j$.util.function.InterfaceC8449S;
import p164j$.util.function.InterfaceC8452V;
import p164j$.util.function.InterfaceC8455Y;
import p164j$.util.stream.Stream;

/* renamed from: j$.util.stream.IntStream */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface IntStream extends InterfaceC8673i {

    /* renamed from: j$.util.stream.IntStream$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* renamed from: a */
        public final /* synthetic */ java.util.stream.IntStream f22704a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f22704a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: C */
        public final /* synthetic */ Object mo17493C(InterfaceC8438K0 interfaceC8438K0, InterfaceC8420B0 interfaceC8420B0, BiConsumer biConsumer) {
            return this.f22704a.collect(C8436J0.m17703a(interfaceC8438K0), C8418A0.m17714a(interfaceC8420B0), C8457a.m17678a(biConsumer));
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: F */
        public final /* synthetic */ boolean mo17492F(InterfaceC8445O interfaceC8445O) {
            return this.f22704a.anyMatch(C8443N.m17694a(interfaceC8445O));
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: S */
        public final /* synthetic */ void mo17489S(InterfaceC8437K interfaceC8437K) {
            this.f22704a.forEachOrdered(C8435J.m17704a(interfaceC8437K));
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: T */
        public final /* synthetic */ Stream mo17488T(IntFunction intFunction) {
            return C8604S2.m17545y(this.f22704a.mapToObj(C8439L.m17702a(intFunction)));
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: W */
        public final /* synthetic */ IntStream mo17487W(IntFunction intFunction) {
            return convert(this.f22704a.flatMap(C8439L.m17702a(intFunction)));
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: a0 */
        public final /* synthetic */ void mo17486a0(InterfaceC8437K interfaceC8437K) {
            this.f22704a.forEach(C8435J.m17704a(interfaceC8437K));
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC8552G asDoubleStream() {
            return C8542E.m17588y(this.f22704a.asDoubleStream());
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC8699n0 asLongStream() {
            return C8689l0.m17433y(this.f22704a.asLongStream());
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ C8512j average() {
            return AbstractC8511i.m17628b(this.f22704a.average());
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: b0 */
        public final /* synthetic */ InterfaceC8552G mo17485b0(InterfaceC8449S interfaceC8449S) {
            return C8542E.m17588y(this.f22704a.mapToDouble(C8448Q.m17689a(interfaceC8449S)));
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return C8604S2.m17545y(this.f22704a.boxed());
        }

        @Override // p164j$.util.stream.InterfaceC8673i, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f22704a.close();
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f22704a.count();
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: d */
        public final /* synthetic */ InterfaceC8699n0 mo17484d(InterfaceC8452V interfaceC8452V) {
            return C8689l0.m17433y(this.f22704a.mapToLong(C8451U.m17687a(interfaceC8452V)));
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.f22704a.distinct());
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: e0 */
        public final /* synthetic */ IntStream mo17483e0(InterfaceC8445O interfaceC8445O) {
            return convert(this.f22704a.filter(C8443N.m17694a(interfaceC8445O)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22704a;
            }
            return this.f22704a.equals(obj);
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: f0 */
        public final /* synthetic */ C8513k mo17482f0(InterfaceC8429G interfaceC8429G) {
            return AbstractC8511i.m17627c(this.f22704a.reduce(C8427F.m17708a(interfaceC8429G)));
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ C8513k findAny() {
            return AbstractC8511i.m17627c(this.f22704a.findAny());
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ C8513k findFirst() {
            return AbstractC8511i.m17627c(this.f22704a.findFirst());
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: g0 */
        public final /* synthetic */ IntStream mo17481g0(InterfaceC8437K interfaceC8437K) {
            return convert(this.f22704a.peek(C8435J.m17704a(interfaceC8437K)));
        }

        public final /* synthetic */ int hashCode() {
            return this.f22704a.hashCode();
        }

        @Override // p164j$.util.stream.InterfaceC8673i
        public final /* synthetic */ boolean isParallel() {
            return this.f22704a.isParallel();
        }

        @Override // p164j$.util.stream.IntStream, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
        public final /* synthetic */ InterfaceC8764u iterator() {
            return C8521s.m17593a(this.f22704a.iterator());
        }

        @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
        public final /* synthetic */ Iterator iterator() {
            return this.f22704a.iterator();
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: k */
        public final /* synthetic */ IntStream mo17480k(InterfaceC8455Y interfaceC8455Y) {
            return convert(this.f22704a.map(C8454X.m17680a(interfaceC8455Y)));
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j) {
            return convert(this.f22704a.limit(j));
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ C8513k max() {
            return AbstractC8511i.m17627c(this.f22704a.max());
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ C8513k min() {
            return AbstractC8511i.m17627c(this.f22704a.min());
        }

        @Override // p164j$.util.stream.InterfaceC8673i
        public final /* synthetic */ InterfaceC8673i onClose(Runnable runnable) {
            return C8663g.m17468y(this.f22704a.onClose(runnable));
        }

        @Override // p164j$.util.stream.IntStream, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
        public final /* synthetic */ IntStream parallel() {
            return convert(this.f22704a.parallel());
        }

        @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
        public final /* synthetic */ InterfaceC8673i parallel() {
            return C8663g.m17468y(this.f22704a.parallel());
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: r */
        public final /* synthetic */ int mo17479r(int i, InterfaceC8429G interfaceC8429G) {
            return this.f22704a.reduce(i, C8427F.m17708a(interfaceC8429G));
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: s */
        public final /* synthetic */ boolean mo17478s(InterfaceC8445O interfaceC8445O) {
            return this.f22704a.allMatch(C8443N.m17694a(interfaceC8445O));
        }

        @Override // p164j$.util.stream.IntStream, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
        public final /* synthetic */ IntStream sequential() {
            return convert(this.f22704a.sequential());
        }

        @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
        public final /* synthetic */ InterfaceC8673i sequential() {
            return C8663g.m17468y(this.f22704a.sequential());
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j) {
            return convert(this.f22704a.skip(j));
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.f22704a.sorted());
        }

        @Override // p164j$.util.stream.IntStream, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
        public final /* synthetic */ InterfaceC8359G spliterator() {
            return C8357E.m17770e(this.f22704a.spliterator());
        }

        @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
        public final /* synthetic */ Spliterator spliterator() {
            return C8366N.m17764e(this.f22704a.spliterator());
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f22704a.sum();
        }

        @Override // p164j$.util.stream.IntStream
        public final C8416f summaryStatistics() {
            this.f22704a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // p164j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f22704a.toArray();
        }

        @Override // p164j$.util.stream.IntStream
        /* renamed from: u */
        public final /* synthetic */ boolean mo17477u(InterfaceC8445O interfaceC8445O) {
            return this.f22704a.noneMatch(C8443N.m17694a(interfaceC8445O));
        }

        @Override // p164j$.util.stream.InterfaceC8673i
        public final /* synthetic */ InterfaceC8673i unordered() {
            return C8663g.m17468y(this.f22704a.unordered());
        }
    }

    /* renamed from: j$.util.stream.IntStream$Wrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
            IntStream.this = r1;
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f22704a : new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.mo17478s(C8441M.m17699b(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.mo17492F(C8441M.m17699b(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return C8547F.m17587y(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C8694m0.m17431y(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC8511i.m17624f(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return IntStream.this.mo17493C(C8434I0.m17705a(supplier), C8508z0.m17635a(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.mo17483e0(C8441M.m17699b(intPredicate)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC8511i.m17623g(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC8511i.m17623g(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream flatMap(java.util.function.IntFunction intFunction) {
            return convert(IntStream.this.mo17487W(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.mo17486a0(C8433I.m17706a(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.mo17489S(C8433I.m17706a(intConsumer));
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: iterator */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            return C8763t.m17295a(IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j) {
            return convert(IntStream.this.limit(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.mo17480k(C8453W.m17681d(intUnaryOperator)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return C8547F.m17587y(IntStream.this.mo17485b0(C8447P.m17690b(intToDoubleFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C8694m0.m17431y(IntStream.this.mo17484d(C8450T.m17688a(intToLongFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.mo17488T(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC8511i.m17623g(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC8511i.m17623g(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.mo17477u(C8441M.m17699b(intPredicate));
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream onClose(Runnable runnable) {
            return C8668h.m17465y(IntStream.this.onClose(runnable));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return C8668h.m17465y(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: parallel */
        public final /* synthetic */ java.util.stream.IntStream parallel2() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.mo17481g0(C8433I.m17706a(intConsumer)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.mo17479r(i, C8425E.m17709a(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC8511i.m17623g(IntStream.this.mo17482f0(C8425E.m17709a(intBinaryOperator)));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return C8668h.m17465y(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: sequential */
        public final /* synthetic */ java.util.stream.IntStream sequential2() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j) {
            return convert(IntStream.this.skip(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator() {
            return C8358F.m17769a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: spliterator */
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator2() {
            return Spliterator.Wrapper.convert(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream unordered() {
            return C8668h.m17465y(IntStream.this.unordered());
        }
    }

    /* renamed from: C */
    Object mo17493C(InterfaceC8438K0 interfaceC8438K0, InterfaceC8420B0 interfaceC8420B0, BiConsumer biConsumer);

    /* renamed from: F */
    boolean mo17492F(InterfaceC8445O interfaceC8445O);

    /* renamed from: S */
    void mo17489S(InterfaceC8437K interfaceC8437K);

    /* renamed from: T */
    Stream mo17488T(IntFunction intFunction);

    /* renamed from: W */
    IntStream mo17487W(IntFunction intFunction);

    /* renamed from: a0 */
    void mo17486a0(InterfaceC8437K interfaceC8437K);

    InterfaceC8552G asDoubleStream();

    InterfaceC8699n0 asLongStream();

    C8512j average();

    /* renamed from: b0 */
    InterfaceC8552G mo17485b0(InterfaceC8449S interfaceC8449S);

    Stream boxed();

    long count();

    /* renamed from: d */
    InterfaceC8699n0 mo17484d(InterfaceC8452V interfaceC8452V);

    IntStream distinct();

    /* renamed from: e0 */
    IntStream mo17483e0(InterfaceC8445O interfaceC8445O);

    /* renamed from: f0 */
    C8513k mo17482f0(InterfaceC8429G interfaceC8429G);

    C8513k findAny();

    C8513k findFirst();

    /* renamed from: g0 */
    IntStream mo17481g0(InterfaceC8437K interfaceC8437K);

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    InterfaceC8764u iterator();

    /* renamed from: k */
    IntStream mo17480k(InterfaceC8455Y interfaceC8455Y);

    IntStream limit(long j);

    C8513k max();

    C8513k min();

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    IntStream parallel();

    /* renamed from: r */
    int mo17479r(int i, InterfaceC8429G interfaceC8429G);

    /* renamed from: s */
    boolean mo17478s(InterfaceC8445O interfaceC8445O);

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    IntStream sequential();

    IntStream skip(long j);

    IntStream sorted();

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    InterfaceC8359G spliterator();

    int sum();

    C8416f summaryStatistics();

    int[] toArray();

    /* renamed from: u */
    boolean mo17477u(InterfaceC8445O interfaceC8445O);
}
