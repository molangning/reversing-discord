package p164j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p164j$.util.Spliterator;
import p164j$.util.function.C8433I;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.F */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8358F implements Spliterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8359G f22419a;

    private /* synthetic */ C8358F(InterfaceC8359G interfaceC8359G) {
        this.f22419a = interfaceC8359G;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfInt m17769a(InterfaceC8359G interfaceC8359G) {
        if (interfaceC8359G == null) {
            return null;
        }
        return interfaceC8359G instanceof C8357E ? ((C8357E) interfaceC8359G).f22418a : new C8358F(interfaceC8359G);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f22419a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8359G interfaceC8359G = this.f22419a;
        if (obj instanceof C8358F) {
            obj = ((C8358F) obj).f22419a;
        }
        return interfaceC8359G.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f22419a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f22419a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22419a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f22419a.mo17458c(C8433I.m17706a(intConsumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f22419a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f22419a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f22419a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22419a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f22419a.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f22419a.mo17305a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return this.f22419a.mo17457k(C8433I.m17706a(intConsumer));
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return m17769a(this.f22419a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C8364L.m17765a(this.f22419a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f22419a.trySplit());
    }
}
