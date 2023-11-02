package p164j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p164j$.util.function.C8435J;
import p164j$.util.function.C8469g;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.E */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8357E implements InterfaceC8359G {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f22418a;

    private /* synthetic */ C8357E(Spliterator.OfInt ofInt) {
        this.f22418a = ofInt;
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC8359G m17770e(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C8358F ? ((C8358F) ofInt).f22419a : new C8357E(ofInt);
    }

    @Override // p164j$.util.InterfaceC8359G, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return this.f22418a.tryAdvance(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.InterfaceC8359G
    /* renamed from: c */
    public final /* synthetic */ void mo17458c(InterfaceC8437K interfaceC8437K) {
        this.f22418a.forEachRemaining(C8435J.m17704a(interfaceC8437K));
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f22418a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8357E) {
            obj = ((C8357E) obj).f22418a;
        }
        return this.f22418a.equals(obj);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f22418a.estimateSize();
    }

    @Override // p164j$.util.InterfaceC8359G, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22418a.forEachRemaining(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.InterfaceC8365M
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f22418a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f22418a.getComparator();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f22418a.getExactSizeIfKnown();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f22418a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22418a.hashCode();
    }

    @Override // p164j$.util.InterfaceC8359G
    /* renamed from: k */
    public final /* synthetic */ boolean mo17457k(InterfaceC8437K interfaceC8437K) {
        return this.f22418a.tryAdvance(C8435J.m17704a(interfaceC8437K));
    }

    @Override // p164j$.util.InterfaceC8365M
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f22418a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // p164j$.util.InterfaceC8359G, p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* synthetic */ InterfaceC8359G trySplit() {
        return m17770e(this.f22418a.trySplit());
    }

    @Override // p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* synthetic */ InterfaceC8365M trySplit() {
        return C8363K.m17766e(this.f22418a.trySplit());
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C8366N.m17764e(this.f22418a.trySplit());
    }
}