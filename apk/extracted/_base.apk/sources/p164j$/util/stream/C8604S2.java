package p164j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;
import p164j$.util.AbstractC8511i;
import p164j$.util.C8366N;
import p164j$.util.C8510h;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.C8423D;
import p164j$.util.function.C8432H0;
import p164j$.util.function.C8436J0;
import p164j$.util.function.C8439L;
import p164j$.util.function.C8440L0;
import p164j$.util.function.C8442M0;
import p164j$.util.function.C8444N0;
import p164j$.util.function.C8457a;
import p164j$.util.function.C8459b;
import p164j$.util.function.C8465e;
import p164j$.util.function.C8469g;
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
import p164j$.util.stream.Stream;

/* renamed from: j$.util.stream.S2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8604S2 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ Stream f22754a;

    private /* synthetic */ C8604S2(Stream stream) {
        this.f22754a = stream;
    }

    /* renamed from: y */
    public static /* synthetic */ Stream m17545y(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C8604S2(stream);
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: E */
    public final /* synthetic */ boolean mo17526E(Predicate predicate) {
        return this.f22754a.anyMatch(C8432H0.m17707a(predicate));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: H */
    public final /* synthetic */ void mo17525H(Consumer consumer) {
        this.f22754a.forEachOrdered(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: I */
    public final /* synthetic */ Object mo17524I(InterfaceC8438K0 interfaceC8438K0, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f22754a.collect(C8436J0.m17703a(interfaceC8438K0), C8457a.m17678a(biConsumer), C8457a.m17678a(biConsumer2));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: K */
    public final /* synthetic */ IntStream mo17523K(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f22754a.mapToInt(C8442M0.m17695a(toIntFunction)));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: L */
    public final /* synthetic */ Stream mo17522L(Function function) {
        return m17545y(this.f22754a.map(C8423D.m17711a(function)));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: N */
    public final /* synthetic */ Stream mo17521N(Function function) {
        return m17545y(this.f22754a.flatMap(C8423D.m17711a(function)));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: O */
    public final /* synthetic */ C8510h mo17520O(InterfaceC8467f interfaceC8467f) {
        return AbstractC8511i.m17629a(this.f22754a.reduce(C8465e.m17673a(interfaceC8467f)));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: c */
    public final /* synthetic */ IntStream mo17519c(Function function) {
        return IntStream.VivifiedWrapper.convert(this.f22754a.flatMapToInt(C8423D.m17711a(function)));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: c0 */
    public final /* synthetic */ boolean mo17518c0(Predicate predicate) {
        return this.f22754a.allMatch(C8432H0.m17707a(predicate));
    }

    @Override // p164j$.util.stream.InterfaceC8673i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f22754a.close();
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f22754a.count();
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: d0 */
    public final /* synthetic */ InterfaceC8699n0 mo17517d0(Function function) {
        return C8689l0.m17433y(this.f22754a.flatMapToLong(C8423D.m17711a(function)));
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return m17545y(this.f22754a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8604S2) {
            obj = ((C8604S2) obj).f22754a;
        }
        return this.f22754a.equals(obj);
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ C8510h findAny() {
        return AbstractC8511i.m17629a(this.f22754a.findAny());
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ C8510h findFirst() {
        return AbstractC8511i.m17629a(this.f22754a.findFirst());
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f22754a.forEach(C8469g.m17671a(consumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f22754a.hashCode();
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: i0 */
    public final /* synthetic */ boolean mo17516i0(Predicate predicate) {
        return this.f22754a.noneMatch(C8432H0.m17707a(predicate));
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ boolean isParallel() {
        return this.f22754a.isParallel();
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ Iterator iterator() {
        return this.f22754a.iterator();
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: j0 */
    public final /* synthetic */ InterfaceC8699n0 mo17515j0(ToLongFunction toLongFunction) {
        return C8689l0.m17433y(this.f22754a.mapToLong(C8444N0.m17693a(toLongFunction)));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: l */
    public final /* synthetic */ Object mo17514l(Object obj, BiFunction biFunction, InterfaceC8467f interfaceC8467f) {
        return this.f22754a.reduce(obj, C8459b.m17676a(biFunction), C8465e.m17673a(interfaceC8467f));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: l0 */
    public final /* synthetic */ InterfaceC8552G mo17513l0(ToDoubleFunction toDoubleFunction) {
        return C8542E.m17588y(this.f22754a.mapToDouble(C8440L0.m17701a(toDoubleFunction)));
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return m17545y(this.f22754a.limit(j));
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ C8510h max(Comparator comparator) {
        return AbstractC8511i.m17629a(this.f22754a.max(comparator));
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ C8510h min(Comparator comparator) {
        return AbstractC8511i.m17629a(this.f22754a.min(comparator));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: n */
    public final /* synthetic */ InterfaceC8552G mo17512n(Function function) {
        return C8542E.m17588y(this.f22754a.flatMapToDouble(C8423D.m17711a(function)));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: o0 */
    public final /* synthetic */ Object mo17511o0(Object obj, InterfaceC8467f interfaceC8467f) {
        return this.f22754a.reduce(obj, C8465e.m17673a(interfaceC8467f));
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ InterfaceC8673i onClose(Runnable runnable) {
        return C8663g.m17468y(this.f22754a.onClose(runnable));
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8673i parallel() {
        return C8663g.m17468y(this.f22754a.parallel());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8673i sequential() {
        return C8663g.m17468y(this.f22754a.sequential());
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return m17545y(this.f22754a.skip(j));
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return m17545y(this.f22754a.sorted());
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return m17545y(this.f22754a.sorted(comparator));
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ Spliterator spliterator() {
        return C8366N.m17764e(this.f22754a.spliterator());
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: t */
    public final /* synthetic */ Stream mo17510t(Predicate predicate) {
        return m17545y(this.f22754a.filter(C8432H0.m17707a(predicate)));
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f22754a.toArray();
    }

    @Override // p164j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f22754a.toArray(C8439L.m17702a(intFunction));
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ InterfaceC8673i unordered() {
        return C8663g.m17468y(this.f22754a.unordered());
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: v */
    public final /* synthetic */ Stream mo17509v(Consumer consumer) {
        return m17545y(this.f22754a.peek(C8469g.m17671a(consumer)));
    }

    @Override // p164j$.util.stream.Stream
    /* renamed from: w */
    public final /* synthetic */ Object mo17508w(InterfaceC8693m interfaceC8693m) {
        return this.f22754a.collect(C8688l.m17434a(interfaceC8693m));
    }
}
