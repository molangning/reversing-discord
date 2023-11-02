package p164j$.util.stream;

import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p164j$.util.AbstractC8511i;
import p164j$.util.C8355C;
import p164j$.util.C8518p;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.C8417A;
import p164j$.util.function.C8434I0;
import p164j$.util.function.C8471h;
import p164j$.util.function.C8479l;
import p164j$.util.function.C8485o;
import p164j$.util.function.C8491r;
import p164j$.util.function.C8497u;
import p164j$.util.function.C8502w0;
import p164j$.util.function.C8503x;
import p164j$.util.stream.IntStream;
import p164j$.util.stream.Stream;

/* renamed from: j$.util.stream.F */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8547F implements DoubleStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8552G f22668a;

    private /* synthetic */ C8547F(InterfaceC8552G interfaceC8552G) {
        this.f22668a = interfaceC8552G;
    }

    /* renamed from: y */
    public static /* synthetic */ DoubleStream m17587y(InterfaceC8552G interfaceC8552G) {
        if (interfaceC8552G == null) {
            return null;
        }
        return interfaceC8552G instanceof C8542E ? ((C8542E) interfaceC8552G).f22662a : new C8547F(interfaceC8552G);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.f22668a.mo17581Z(C8491r.m17649b(doublePredicate));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.f22668a.mo17572x(C8491r.m17649b(doublePredicate));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC8511i.m17624f(this.f22668a.average());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Stream boxed() {
        return Stream.Wrapper.convert(this.f22668a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f22668a.close();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f22668a.mo17575o(C8434I0.m17705a(supplier), C8502w0.m17639a(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ long count() {
        return this.f22668a.count();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream distinct() {
        return m17587y(this.f22668a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8552G interfaceC8552G = this.f22668a;
        if (obj instanceof C8547F) {
            obj = ((C8547F) obj).f22668a;
        }
        return interfaceC8552G.equals(obj);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream filter(DoublePredicate doublePredicate) {
        return m17587y(this.f22668a.mo17579h(C8491r.m17649b(doublePredicate)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findAny() {
        return AbstractC8511i.m17624f(this.f22668a.findAny());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findFirst() {
        return AbstractC8511i.m17624f(this.f22668a.findFirst());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream flatMap(DoubleFunction doubleFunction) {
        return m17587y(this.f22668a.mo17578i(C8485o.m17655a(doubleFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f22668a.mo17585J(C8479l.m17660a(doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f22668a.mo17576m0(C8479l.m17660a(doubleConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f22668a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f22668a.isParallel();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Double> iterator() {
        return this.f22668a.iterator();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator<Double> iterator2() {
        return C8518p.m17595a(this.f22668a.iterator());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream limit(long j) {
        return m17587y(this.f22668a.limit(j));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        return m17587y(this.f22668a.mo17574p(C8417A.m17715d(doubleUnaryOperator)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        return IntStream.Wrapper.convert(this.f22668a.mo17586D(C8497u.m17642b(doubleToIntFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C8694m0.m17431y(this.f22668a.mo17577j(C8503x.m17638a(doubleToLongFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(DoubleFunction doubleFunction) {
        return Stream.Wrapper.convert(this.f22668a.mo17573q(C8485o.m17655a(doubleFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble max() {
        return AbstractC8511i.m17624f(this.f22668a.max());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble min() {
        return AbstractC8511i.m17624f(this.f22668a.min());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.f22668a.mo17582V(C8491r.m17649b(doublePredicate));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream onClose(Runnable runnable) {
        return C8668h.m17465y(this.f22668a.onClose(runnable));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream parallel() {
        return C8668h.m17465y(this.f22668a.parallel());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: parallel */
    public final /* synthetic */ DoubleStream parallel2() {
        return m17587y(this.f22668a.parallel());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream peek(DoubleConsumer doubleConsumer) {
        return m17587y(this.f22668a.mo17580b(C8479l.m17660a(doubleConsumer)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f22668a.mo17583U(d, C8471h.m17669a(doubleBinaryOperator));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC8511i.m17624f(this.f22668a.mo17584R(C8471h.m17669a(doubleBinaryOperator)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream sequential() {
        return C8668h.m17465y(this.f22668a.sequential());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: sequential */
    public final /* synthetic */ DoubleStream sequential2() {
        return m17587y(this.f22668a.sequential());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream skip(long j) {
        return m17587y(this.f22668a.skip(j));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream sorted() {
        return m17587y(this.f22668a.sorted());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Double> spliterator() {
        return C8355C.m17778a(this.f22668a.spliterator());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator<Double> spliterator2() {
        return Spliterator.Wrapper.convert(this.f22668a.spliterator());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double sum() {
        return this.f22668a.sum();
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleSummaryStatistics summaryStatistics() {
        this.f22668a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double[] toArray() {
        return this.f22668a.toArray();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream unordered() {
        return C8668h.m17465y(this.f22668a.unordered());
    }
}