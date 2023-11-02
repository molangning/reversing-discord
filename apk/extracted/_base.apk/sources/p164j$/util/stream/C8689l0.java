package p164j$.util.stream;

import java.util.Iterator;
import java.util.stream.LongStream;
import p164j$.util.AbstractC8511i;
import p164j$.util.C8360H;
import p164j$.util.C8366N;
import p164j$.util.C8509g;
import p164j$.util.C8512j;
import p164j$.util.C8514l;
import p164j$.util.C8766w;
import p164j$.util.InterfaceC8362J;
import p164j$.util.InterfaceC8768y;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.C8424D0;
import p164j$.util.function.C8436J0;
import p164j$.util.function.C8457a;
import p164j$.util.function.C8458a0;
import p164j$.util.function.C8466e0;
import p164j$.util.function.C8472h0;
import p164j$.util.function.C8478k0;
import p164j$.util.function.C8484n0;
import p164j$.util.function.C8490q0;
import p164j$.util.function.C8498u0;
import p164j$.util.function.InterfaceC8426E0;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8460b0;
import p164j$.util.function.InterfaceC8468f0;
import p164j$.util.function.InterfaceC8474i0;
import p164j$.util.function.InterfaceC8480l0;
import p164j$.util.function.InterfaceC8486o0;
import p164j$.util.function.InterfaceC8492r0;
import p164j$.util.function.InterfaceC8500v0;
import p164j$.util.stream.IntStream;

/* renamed from: j$.util.stream.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8689l0 implements InterfaceC8699n0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f22887a;

    private /* synthetic */ C8689l0(LongStream longStream) {
        this.f22887a = longStream;
    }

    /* renamed from: y */
    public static /* synthetic */ InterfaceC8699n0 m17433y(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C8694m0 ? ((C8694m0) longStream).f22891a : new C8689l0(longStream);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: A */
    public final /* synthetic */ Object mo17424A(InterfaceC8438K0 interfaceC8438K0, InterfaceC8426E0 interfaceC8426E0, BiConsumer biConsumer) {
        return this.f22887a.collect(C8436J0.m17703a(interfaceC8438K0), C8424D0.m17710a(interfaceC8426E0), C8457a.m17678a(biConsumer));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: B */
    public final /* synthetic */ boolean mo17423B(InterfaceC8480l0 interfaceC8480l0) {
        return this.f22887a.allMatch(C8478k0.m17661a(interfaceC8480l0));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: G */
    public final /* synthetic */ void mo17422G(InterfaceC8468f0 interfaceC8468f0) {
        this.f22887a.forEach(C8466e0.m17672a(interfaceC8468f0));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: M */
    public final /* synthetic */ InterfaceC8552G mo17421M(InterfaceC8486o0 interfaceC8486o0) {
        return C8542E.m17588y(this.f22887a.mapToDouble(C8484n0.m17656a(interfaceC8486o0)));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: Q */
    public final /* synthetic */ InterfaceC8699n0 mo17420Q(InterfaceC8500v0 interfaceC8500v0) {
        return m17433y(this.f22887a.map(C8498u0.m17641a(interfaceC8500v0)));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: X */
    public final /* synthetic */ IntStream mo17419X(InterfaceC8492r0 interfaceC8492r0) {
        return IntStream.VivifiedWrapper.convert(this.f22887a.mapToInt(C8490q0.m17651a(interfaceC8492r0)));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: Y */
    public final /* synthetic */ Stream mo17418Y(InterfaceC8474i0 interfaceC8474i0) {
        return C8604S2.m17545y(this.f22887a.mapToObj(C8472h0.m17668a(interfaceC8474i0)));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: a */
    public final /* synthetic */ boolean mo17417a(InterfaceC8480l0 interfaceC8480l0) {
        return this.f22887a.noneMatch(C8478k0.m17661a(interfaceC8480l0));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ InterfaceC8552G asDoubleStream() {
        return C8542E.m17588y(this.f22887a.asDoubleStream());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ C8512j average() {
        return AbstractC8511i.m17628b(this.f22887a.average());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ Stream boxed() {
        return C8604S2.m17545y(this.f22887a.boxed());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f22887a.close();
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ long count() {
        return this.f22887a.count();
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ InterfaceC8699n0 distinct() {
        return m17433y(this.f22887a.distinct());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: e */
    public final /* synthetic */ C8514l mo17416e(InterfaceC8460b0 interfaceC8460b0) {
        return AbstractC8511i.m17626d(this.f22887a.reduce(C8458a0.m17677a(interfaceC8460b0)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8689l0) {
            obj = ((C8689l0) obj).f22887a;
        }
        return this.f22887a.equals(obj);
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: f */
    public final /* synthetic */ InterfaceC8699n0 mo17415f(InterfaceC8468f0 interfaceC8468f0) {
        return m17433y(this.f22887a.peek(C8466e0.m17672a(interfaceC8468f0)));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ C8514l findAny() {
        return AbstractC8511i.m17626d(this.f22887a.findAny());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ C8514l findFirst() {
        return AbstractC8511i.m17626d(this.f22887a.findFirst());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: g */
    public final /* synthetic */ InterfaceC8699n0 mo17414g(InterfaceC8474i0 interfaceC8474i0) {
        return m17433y(this.f22887a.flatMap(C8472h0.m17668a(interfaceC8474i0)));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: h0 */
    public final /* synthetic */ boolean mo17413h0(InterfaceC8480l0 interfaceC8480l0) {
        return this.f22887a.anyMatch(C8478k0.m17661a(interfaceC8480l0));
    }

    public final /* synthetic */ int hashCode() {
        return this.f22887a.hashCode();
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ boolean isParallel() {
        return this.f22887a.isParallel();
    }

    @Override // p164j$.util.stream.InterfaceC8699n0, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8768y iterator() {
        return C8766w.m17292a(this.f22887a.iterator());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ Iterator iterator() {
        return this.f22887a.iterator();
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: k0 */
    public final /* synthetic */ InterfaceC8699n0 mo17412k0(InterfaceC8480l0 interfaceC8480l0) {
        return m17433y(this.f22887a.filter(C8478k0.m17661a(interfaceC8480l0)));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ InterfaceC8699n0 limit(long j) {
        return m17433y(this.f22887a.limit(j));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: m */
    public final /* synthetic */ long mo17411m(long j, InterfaceC8460b0 interfaceC8460b0) {
        return this.f22887a.reduce(j, C8458a0.m17677a(interfaceC8460b0));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ C8514l max() {
        return AbstractC8511i.m17626d(this.f22887a.max());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ C8514l min() {
        return AbstractC8511i.m17626d(this.f22887a.min());
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ InterfaceC8673i onClose(Runnable runnable) {
        return C8663g.m17468y(this.f22887a.onClose(runnable));
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8673i parallel() {
        return C8663g.m17468y(this.f22887a.parallel());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8699n0 parallel() {
        return m17433y(this.f22887a.parallel());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8673i sequential() {
        return C8663g.m17468y(this.f22887a.sequential());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8699n0 sequential() {
        return m17433y(this.f22887a.sequential());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ InterfaceC8699n0 skip(long j) {
        return m17433y(this.f22887a.skip(j));
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ InterfaceC8699n0 sorted() {
        return m17433y(this.f22887a.sorted());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8362J spliterator() {
        return C8360H.m17768e(this.f22887a.spliterator());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ Spliterator spliterator() {
        return C8366N.m17764e(this.f22887a.spliterator());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ long sum() {
        return this.f22887a.sum();
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final C8509g summaryStatistics() {
        this.f22887a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    public final /* synthetic */ long[] toArray() {
        return this.f22887a.toArray();
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ InterfaceC8673i unordered() {
        return C8663g.m17468y(this.f22887a.unordered());
    }

    @Override // p164j$.util.stream.InterfaceC8699n0
    /* renamed from: z */
    public final /* synthetic */ void mo17410z(InterfaceC8468f0 interfaceC8468f0) {
        this.f22887a.forEachOrdered(C8466e0.m17672a(interfaceC8468f0));
    }
}
