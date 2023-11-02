package p164j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p164j$.util.Spliterator;
import p164j$.util.function.C8464d0;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.I */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8361I implements Spliterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8362J f22421a;

    private /* synthetic */ C8361I(InterfaceC8362J interfaceC8362J) {
        this.f22421a = interfaceC8362J;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfLong m17767a(InterfaceC8362J interfaceC8362J) {
        if (interfaceC8362J == null) {
            return null;
        }
        return interfaceC8362J instanceof C8360H ? ((C8360H) interfaceC8362J).f22420a : new C8361I(interfaceC8362J);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f22421a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8362J interfaceC8362J = this.f22421a;
        if (obj instanceof C8361I) {
            obj = ((C8361I) obj).f22421a;
        }
        return interfaceC8362J.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f22421a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f22421a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22421a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f22421a.mo17438b(C8464d0.m17674a(longConsumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f22421a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f22421a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f22421a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22421a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f22421a.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f22421a.mo17305a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return this.f22421a.mo17437f(C8464d0.m17674a(longConsumer));
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfLong trySplit() {
        return m17767a(this.f22421a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C8364L.m17765a(this.f22421a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f22421a.trySplit());
    }
}