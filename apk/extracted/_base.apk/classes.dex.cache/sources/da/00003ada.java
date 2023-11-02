package p164j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p164j$.util.Spliterator;
import p164j$.util.function.C8479l;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.C */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8355C implements Spliterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8356D f22411a;

    private /* synthetic */ C8355C(InterfaceC8356D interfaceC8356D) {
        this.f22411a = interfaceC8356D;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfDouble m17778a(InterfaceC8356D interfaceC8356D) {
        if (interfaceC8356D == null) {
            return null;
        }
        return interfaceC8356D instanceof C8354B ? ((C8354B) interfaceC8356D).f22410a : new C8355C(interfaceC8356D);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f22411a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8356D interfaceC8356D = this.f22411a;
        if (obj instanceof C8355C) {
            obj = ((C8355C) obj).f22411a;
        }
        return interfaceC8356D.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f22411a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f22411a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22411a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f22411a.mo17467d(C8479l.m17660a(doubleConsumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f22411a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f22411a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f22411a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22411a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f22411a.tryAdvance(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f22411a.mo17305a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f22411a.mo17466p(C8479l.m17660a(doubleConsumer));
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfDouble trySplit() {
        return m17778a(this.f22411a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C8364L.m17765a(this.f22411a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f22411a.trySplit());
    }
}