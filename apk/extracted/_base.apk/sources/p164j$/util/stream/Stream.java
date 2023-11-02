package p164j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p164j$.util.AbstractC8511i;
import p164j$.util.C8510h;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.C8434I0;
import p164j$.util.function.C8463d;
import p164j$.util.function.Consumer;
import p164j$.util.function.Function;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8467f;
import p164j$.util.function.Predicate;
import p164j$.util.function.ToDoubleFunction;
import p164j$.util.function.ToIntFunction;
import p164j$.util.function.ToLongFunction;
import p164j$.util.stream.IntStream;

/* renamed from: j$.util.stream.Stream */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface Stream<T> extends InterfaceC8673i {

    /* renamed from: j$.util.stream.Stream$Wrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class Wrapper implements java.util.stream.Stream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.Stream convert(Stream stream) {
            if (stream == null) {
                return null;
            }
            return stream instanceof C8604S2 ? ((C8604S2) stream).f22754a : new Wrapper();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean allMatch(Predicate predicate) {
            return Stream.this.mo17518c0(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean anyMatch(java.util.function.Predicate predicate) {
            return Stream.this.mo17526E(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            Stream.this.close();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            return Stream.this.mo17524I(C8434I0.m17705a(supplier), BiConsumer.VivifiedWrapper.convert(biConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer2));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Collector collector) {
            return Stream.this.mo17508w(C8683k.m17448d(collector));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ long count() {
            return Stream.this.count();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream distinct() {
            return convert(Stream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Stream stream = Stream.this;
            if (obj instanceof Wrapper) {
                obj = Stream.this;
            }
            return stream.equals(obj);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream filter(java.util.function.Predicate predicate) {
            return convert(Stream.this.mo17510t(Predicate.VivifiedWrapper.convert(predicate)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional findAny() {
            return AbstractC8511i.m17625e(Stream.this.findAny());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional findFirst() {
            return AbstractC8511i.m17625e(Stream.this.findFirst());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
            return convert(Stream.this.mo17521N(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream flatMapToDouble(java.util.function.Function function) {
            return C8547F.m17587y(Stream.this.mo17512n(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ IntStream flatMapToInt(java.util.function.Function function) {
            return IntStream.Wrapper.convert(Stream.this.mo17519c(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ LongStream flatMapToLong(java.util.function.Function function) {
            return C8694m0.m17431y(Stream.this.mo17517d0(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEach(Consumer consumer) {
            Stream.this.forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
            Stream.this.mo17525H(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ int hashCode() {
            return Stream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return Stream.this.isParallel();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Iterator iterator() {
            return Stream.this.iterator();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream limit(long j) {
            return convert(Stream.this.limit(j));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream map(java.util.function.Function function) {
            return convert(Stream.this.mo17522L(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
            return C8547F.m17587y(Stream.this.mo17513l0(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.IntStream mapToInt(ToIntFunction toIntFunction) {
            return IntStream.Wrapper.convert(Stream.this.mo17523K(ToIntFunction.VivifiedWrapper.convert(toIntFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
            return C8694m0.m17431y(Stream.this.mo17515j0(ToLongFunction.VivifiedWrapper.convert(toLongFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional max(Comparator comparator) {
            return AbstractC8511i.m17625e(Stream.this.max(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional min(Comparator comparator) {
            return AbstractC8511i.m17625e(Stream.this.min(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean noneMatch(java.util.function.Predicate predicate) {
            return Stream.this.mo17516i0(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C8668h.m17465y(Stream.this.onClose(runnable));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C8668h.m17465y(Stream.this.parallel());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream peek(java.util.function.Consumer consumer) {
            return convert(Stream.this.mo17509v(Consumer.VivifiedWrapper.convert(consumer)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
            return Stream.this.mo17514l(obj, BiFunction.VivifiedWrapper.convert(biFunction), C8463d.m17675b(binaryOperator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
            return Stream.this.mo17511o0(obj, C8463d.m17675b(binaryOperator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
            return AbstractC8511i.m17625e(Stream.this.mo17520O(C8463d.m17675b(binaryOperator)));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C8668h.m17465y(Stream.this.sequential());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream skip(long j) {
            return convert(Stream.this.skip(j));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted() {
            return convert(Stream.this.sorted());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
            return convert(Stream.this.sorted(comparator));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(Stream.this.spliterator());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray() {
            return Stream.this.toArray();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Stream.this.toArray(IntFunction.VivifiedWrapper.convert(intFunction));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C8668h.m17465y(Stream.this.unordered());
        }
    }

    /* renamed from: E */
    boolean mo17526E(p164j$.util.function.Predicate predicate);

    /* renamed from: H */
    void mo17525H(p164j$.util.function.Consumer consumer);

    /* renamed from: I */
    Object mo17524I(InterfaceC8438K0 interfaceC8438K0, p164j$.util.function.BiConsumer biConsumer, p164j$.util.function.BiConsumer biConsumer2);

    /* renamed from: K */
    IntStream mo17523K(p164j$.util.function.ToIntFunction toIntFunction);

    /* renamed from: L */
    Stream mo17522L(p164j$.util.function.Function function);

    /* renamed from: N */
    Stream mo17521N(p164j$.util.function.Function function);

    /* renamed from: O */
    C8510h mo17520O(InterfaceC8467f interfaceC8467f);

    /* renamed from: c */
    IntStream mo17519c(p164j$.util.function.Function function);

    /* renamed from: c0 */
    boolean mo17518c0(p164j$.util.function.Predicate predicate);

    long count();

    /* renamed from: d0 */
    InterfaceC8699n0 mo17517d0(p164j$.util.function.Function function);

    Stream distinct();

    C8510h findAny();

    C8510h findFirst();

    void forEach(p164j$.util.function.Consumer consumer);

    /* renamed from: i0 */
    boolean mo17516i0(p164j$.util.function.Predicate predicate);

    /* renamed from: j0 */
    InterfaceC8699n0 mo17515j0(p164j$.util.function.ToLongFunction toLongFunction);

    /* renamed from: l */
    Object mo17514l(Object obj, p164j$.util.function.BiFunction biFunction, InterfaceC8467f interfaceC8467f);

    /* renamed from: l0 */
    InterfaceC8552G mo17513l0(p164j$.util.function.ToDoubleFunction toDoubleFunction);

    Stream limit(long j);

    C8510h max(Comparator comparator);

    C8510h min(Comparator comparator);

    /* renamed from: n */
    InterfaceC8552G mo17512n(p164j$.util.function.Function function);

    /* renamed from: o0 */
    Object mo17511o0(Object obj, InterfaceC8467f interfaceC8467f);

    Stream skip(long j);

    Stream sorted();

    Stream sorted(Comparator comparator);

    /* renamed from: t */
    Stream mo17510t(p164j$.util.function.Predicate predicate);

    Object[] toArray();

    Object[] toArray(p164j$.util.function.IntFunction intFunction);

    /* renamed from: v */
    Stream mo17509v(p164j$.util.function.Consumer consumer);

    /* renamed from: w */
    Object mo17508w(InterfaceC8693m interfaceC8693m);
}
