package p164j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p164j$.util.function.C8469g;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.K */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8363K implements InterfaceC8365M {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfPrimitive f22422a;

    private /* synthetic */ C8363K(Spliterator.OfPrimitive ofPrimitive) {
        this.f22422a = ofPrimitive;
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC8365M m17766e(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof C8364L ? ((C8364L) ofPrimitive).f22423a : ofPrimitive instanceof Spliterator.OfDouble ? C8354B.m17779e((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? C8357E.m17770e((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? C8360H.m17768e((Spliterator.OfLong) ofPrimitive) : new C8363K(ofPrimitive);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return this.f22422a.tryAdvance(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f22422a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8363K) {
            obj = ((C8363K) obj).f22422a;
        }
        return this.f22422a.equals(obj);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f22422a.estimateSize();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22422a.forEachRemaining(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.InterfaceC8365M
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f22422a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f22422a.getComparator();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f22422a.getExactSizeIfKnown();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f22422a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22422a.hashCode();
    }

    @Override // p164j$.util.InterfaceC8365M
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f22422a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* synthetic */ InterfaceC8365M trySplit() {
        return m17766e(this.f22422a.trySplit());
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C8366N.m17764e(this.f22422a.trySplit());
    }
}