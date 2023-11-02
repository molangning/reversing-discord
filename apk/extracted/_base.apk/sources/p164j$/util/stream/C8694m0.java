package p164j$.util.stream;

import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p164j$.util.AbstractC8511i;
import p164j$.util.C8361I;
import p164j$.util.C8767x;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.C8422C0;
import p164j$.util.function.C8434I0;
import p164j$.util.function.C8456Z;
import p164j$.util.function.C8464d0;
import p164j$.util.function.C8470g0;
import p164j$.util.function.C8476j0;
import p164j$.util.function.C8482m0;
import p164j$.util.function.C8488p0;
import p164j$.util.function.C8496t0;
import p164j$.util.stream.IntStream;
import p164j$.util.stream.Stream;

/* renamed from: j$.util.stream.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8694m0 implements LongStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8699n0 f22891a;

    private /* synthetic */ C8694m0(InterfaceC8699n0 interfaceC8699n0) {
        this.f22891a = interfaceC8699n0;
    }

    /* renamed from: y */
    public static /* synthetic */ LongStream m17431y(InterfaceC8699n0 interfaceC8699n0) {
        if (interfaceC8699n0 == null) {
            return null;
        }
        return interfaceC8699n0 instanceof C8689l0 ? ((C8689l0) interfaceC8699n0).f22887a : new C8694m0(interfaceC8699n0);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.f22891a.mo17423B(C8476j0.m17665b(longPredicate));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.f22891a.mo17413h0(C8476j0.m17665b(longPredicate));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C8547F.m17587y(this.f22891a.asDoubleStream());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC8511i.m17624f(this.f22891a.average());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return Stream.Wrapper.convert(this.f22891a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f22891a.close();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f22891a.mo17424A(C8434I0.m17705a(supplier), C8422C0.m17712a(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.f22891a.count();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return m17431y(this.f22891a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8699n0 interfaceC8699n0 = this.f22891a;
        if (obj instanceof C8694m0) {
            obj = ((C8694m0) obj).f22891a;
        }
        return interfaceC8699n0.equals(obj);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream filter(LongPredicate longPredicate) {
        return m17431y(this.f22891a.mo17412k0(C8476j0.m17665b(longPredicate)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findAny() {
        return AbstractC8511i.m17622h(this.f22891a.findAny());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findFirst() {
        return AbstractC8511i.m17622h(this.f22891a.findFirst());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream flatMap(LongFunction longFunction) {
        return m17431y(this.f22891a.mo17414g(C8470g0.m17670a(longFunction)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f22891a.mo17422G(C8464d0.m17674a(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f22891a.mo17410z(C8464d0.m17674a(longConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f22891a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f22891a.isParallel();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Long> iterator() {
        return this.f22891a.iterator();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator<Long> iterator2() {
        return C8767x.m17291a(this.f22891a.iterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j) {
        return m17431y(this.f22891a.limit(j));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return m17431y(this.f22891a.mo17420Q(C8496t0.m17644c(longUnaryOperator)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        return C8547F.m17587y(this.f22891a.mo17421M(C8482m0.m17657b(longToDoubleFunction)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ IntStream mapToInt(LongToIntFunction longToIntFunction) {
        return IntStream.Wrapper.convert(this.f22891a.mo17419X(C8488p0.m17652b(longToIntFunction)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(LongFunction longFunction) {
        return Stream.Wrapper.convert(this.f22891a.mo17418Y(C8470g0.m17670a(longFunction)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong max() {
        return AbstractC8511i.m17622h(this.f22891a.max());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong min() {
        return AbstractC8511i.m17622h(this.f22891a.min());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.f22891a.mo17417a(C8476j0.m17665b(longPredicate));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream onClose(Runnable runnable) {
        return C8668h.m17465y(this.f22891a.onClose(runnable));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        return C8668h.m17465y(this.f22891a.parallel());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: parallel */
    public final /* synthetic */ LongStream parallel2() {
        return m17431y(this.f22891a.parallel());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return m17431y(this.f22891a.mo17415f(C8464d0.m17674a(longConsumer)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.f22891a.mo17411m(j, C8456Z.m17679a(longBinaryOperator));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC8511i.m17622h(this.f22891a.mo17416e(C8456Z.m17679a(longBinaryOperator)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        return C8668h.m17465y(this.f22891a.sequential());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: sequential */
    public final /* synthetic */ LongStream sequential2() {
        return m17431y(this.f22891a.sequential());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j) {
        return m17431y(this.f22891a.skip(j));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return m17431y(this.f22891a.sorted());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Long> spliterator() {
        return C8361I.m17767a(this.f22891a.spliterator());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator<Long> spliterator2() {
        return Spliterator.Wrapper.convert(this.f22891a.spliterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.f22891a.sum();
    }

    @Override // java.util.stream.LongStream
    public final LongSummaryStatistics summaryStatistics() {
        this.f22891a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.f22891a.toArray();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream unordered() {
        return C8668h.m17465y(this.f22891a.unordered());
    }
}
