package p164j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.L */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8364L implements Spliterator.OfPrimitive {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8365M f22423a;

    private /* synthetic */ C8364L(InterfaceC8365M interfaceC8365M) {
        this.f22423a = interfaceC8365M;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfPrimitive m17765a(InterfaceC8365M interfaceC8365M) {
        if (interfaceC8365M == null) {
            return null;
        }
        return interfaceC8365M instanceof C8363K ? ((C8363K) interfaceC8365M).f22422a : interfaceC8365M instanceof InterfaceC8356D ? C8355C.m17778a((InterfaceC8356D) interfaceC8365M) : interfaceC8365M instanceof InterfaceC8359G ? C8358F.m17769a((InterfaceC8359G) interfaceC8365M) : interfaceC8365M instanceof InterfaceC8362J ? C8361I.m17767a((InterfaceC8362J) interfaceC8365M) : new C8364L(interfaceC8365M);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f22423a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8365M interfaceC8365M = this.f22423a;
        if (obj instanceof C8364L) {
            obj = ((C8364L) obj).f22423a;
        }
        return interfaceC8365M.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f22423a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f22423a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22423a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f22423a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f22423a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f22423a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22423a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f22423a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f22423a.mo17305a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return m17765a(this.f22423a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f22423a.trySplit());
    }
}