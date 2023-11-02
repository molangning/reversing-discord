package p164j$.util.stream;

import java.util.Iterator;
import java.util.stream.DoubleStream;
import p164j$.util.AbstractC8511i;
import p164j$.util.C8354B;
import p164j$.util.C8366N;
import p164j$.util.C8414e;
import p164j$.util.C8512j;
import p164j$.util.C8517o;
import p164j$.util.InterfaceC8356D;
import p164j$.util.InterfaceC8519q;
import p164j$.util.Spliterator;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.C8419B;
import p164j$.util.function.C8436J0;
import p164j$.util.function.C8457a;
import p164j$.util.function.C8473i;
import p164j$.util.function.C8481m;
import p164j$.util.function.C8487p;
import p164j$.util.function.C8493s;
import p164j$.util.function.C8499v;
import p164j$.util.function.C8504x0;
import p164j$.util.function.C8505y;
import p164j$.util.function.InterfaceC8421C;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8475j;
import p164j$.util.function.InterfaceC8483n;
import p164j$.util.function.InterfaceC8489q;
import p164j$.util.function.InterfaceC8495t;
import p164j$.util.function.InterfaceC8501w;
import p164j$.util.function.InterfaceC8506y0;
import p164j$.util.function.InterfaceC8507z;
import p164j$.util.stream.IntStream;

/* renamed from: j$.util.stream.E */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8542E implements InterfaceC8552G {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f22662a;

    private /* synthetic */ C8542E(DoubleStream doubleStream) {
        this.f22662a = doubleStream;
    }

    /* renamed from: y */
    public static /* synthetic */ InterfaceC8552G m17588y(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C8547F ? ((C8547F) doubleStream).f22668a : new C8542E(doubleStream);
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: D */
    public final /* synthetic */ IntStream mo17586D(InterfaceC8501w interfaceC8501w) {
        return IntStream.VivifiedWrapper.convert(this.f22662a.mapToInt(C8499v.m17640a(interfaceC8501w)));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: J */
    public final /* synthetic */ void mo17585J(InterfaceC8483n interfaceC8483n) {
        this.f22662a.forEach(C8481m.m17659a(interfaceC8483n));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: R */
    public final /* synthetic */ C8512j mo17584R(InterfaceC8475j interfaceC8475j) {
        return AbstractC8511i.m17628b(this.f22662a.reduce(C8473i.m17667a(interfaceC8475j)));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: U */
    public final /* synthetic */ double mo17583U(double d, InterfaceC8475j interfaceC8475j) {
        return this.f22662a.reduce(d, C8473i.m17667a(interfaceC8475j));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: V */
    public final /* synthetic */ boolean mo17582V(InterfaceC8495t interfaceC8495t) {
        return this.f22662a.noneMatch(C8493s.m17645a(interfaceC8495t));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: Z */
    public final /* synthetic */ boolean mo17581Z(InterfaceC8495t interfaceC8495t) {
        return this.f22662a.allMatch(C8493s.m17645a(interfaceC8495t));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ C8512j average() {
        return AbstractC8511i.m17628b(this.f22662a.average());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: b */
    public final /* synthetic */ InterfaceC8552G mo17580b(InterfaceC8483n interfaceC8483n) {
        return m17588y(this.f22662a.peek(C8481m.m17659a(interfaceC8483n)));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ Stream boxed() {
        return C8604S2.m17545y(this.f22662a.boxed());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f22662a.close();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ long count() {
        return this.f22662a.count();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8552G distinct() {
        return m17588y(this.f22662a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8542E) {
            obj = ((C8542E) obj).f22662a;
        }
        return this.f22662a.equals(obj);
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ C8512j findAny() {
        return AbstractC8511i.m17628b(this.f22662a.findAny());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ C8512j findFirst() {
        return AbstractC8511i.m17628b(this.f22662a.findFirst());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: h */
    public final /* synthetic */ InterfaceC8552G mo17579h(InterfaceC8495t interfaceC8495t) {
        return m17588y(this.f22662a.filter(C8493s.m17645a(interfaceC8495t)));
    }

    public final /* synthetic */ int hashCode() {
        return this.f22662a.hashCode();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: i */
    public final /* synthetic */ InterfaceC8552G mo17578i(InterfaceC8489q interfaceC8489q) {
        return m17588y(this.f22662a.flatMap(C8487p.m17654a(interfaceC8489q)));
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ boolean isParallel() {
        return this.f22662a.isParallel();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8519q iterator() {
        return C8517o.m17596a(this.f22662a.iterator());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ Iterator iterator() {
        return this.f22662a.iterator();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: j */
    public final /* synthetic */ InterfaceC8699n0 mo17577j(InterfaceC8507z interfaceC8507z) {
        return C8689l0.m17433y(this.f22662a.mapToLong(C8505y.m17636a(interfaceC8507z)));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8552G limit(long j) {
        return m17588y(this.f22662a.limit(j));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: m0 */
    public final /* synthetic */ void mo17576m0(InterfaceC8483n interfaceC8483n) {
        this.f22662a.forEachOrdered(C8481m.m17659a(interfaceC8483n));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ C8512j max() {
        return AbstractC8511i.m17628b(this.f22662a.max());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ C8512j min() {
        return AbstractC8511i.m17628b(this.f22662a.min());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: o */
    public final /* synthetic */ Object mo17575o(InterfaceC8438K0 interfaceC8438K0, InterfaceC8506y0 interfaceC8506y0, BiConsumer biConsumer) {
        return this.f22662a.collect(C8436J0.m17703a(interfaceC8438K0), C8504x0.m17637a(interfaceC8506y0), C8457a.m17678a(biConsumer));
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ InterfaceC8673i onClose(Runnable runnable) {
        return C8663g.m17468y(this.f22662a.onClose(runnable));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: p */
    public final /* synthetic */ InterfaceC8552G mo17574p(InterfaceC8421C interfaceC8421C) {
        return m17588y(this.f22662a.map(C8419B.m17713a(interfaceC8421C)));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8552G parallel() {
        return m17588y(this.f22662a.parallel());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8673i parallel() {
        return C8663g.m17468y(this.f22662a.parallel());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: q */
    public final /* synthetic */ Stream mo17573q(InterfaceC8489q interfaceC8489q) {
        return C8604S2.m17545y(this.f22662a.mapToObj(C8487p.m17654a(interfaceC8489q)));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8552G sequential() {
        return m17588y(this.f22662a.sequential());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8673i sequential() {
        return C8663g.m17468y(this.f22662a.sequential());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8552G skip(long j) {
        return m17588y(this.f22662a.skip(j));
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8552G sorted() {
        return m17588y(this.f22662a.sorted());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8356D spliterator() {
        return C8354B.m17779e(this.f22662a.spliterator());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ Spliterator spliterator() {
        return C8366N.m17764e(this.f22662a.spliterator());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ double sum() {
        return this.f22662a.sum();
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final C8414e summaryStatistics() {
        this.f22662a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ double[] toArray() {
        return this.f22662a.toArray();
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ InterfaceC8673i unordered() {
        return C8663g.m17468y(this.f22662a.unordered());
    }

    @Override // p164j$.util.stream.InterfaceC8552G
    /* renamed from: x */
    public final /* synthetic */ boolean mo17572x(InterfaceC8495t interfaceC8495t) {
        return this.f22662a.anyMatch(C8493s.m17645a(interfaceC8495t));
    }
}