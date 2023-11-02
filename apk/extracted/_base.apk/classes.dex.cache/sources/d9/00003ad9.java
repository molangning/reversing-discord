package p164j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p164j$.util.function.C8469g;
import p164j$.util.function.C8481m;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.B */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8354B implements InterfaceC8356D {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f22410a;

    private /* synthetic */ C8354B(Spliterator.OfDouble ofDouble) {
        this.f22410a = ofDouble;
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC8356D m17779e(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C8355C ? ((C8355C) ofDouble).f22411a : new C8354B(ofDouble);
    }

    @Override // p164j$.util.InterfaceC8356D, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return this.f22410a.tryAdvance(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f22410a.characteristics();
    }

    @Override // p164j$.util.InterfaceC8356D
    /* renamed from: d */
    public final /* synthetic */ void mo17467d(InterfaceC8483n interfaceC8483n) {
        this.f22410a.forEachRemaining(C8481m.m17659a(interfaceC8483n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8354B) {
            obj = ((C8354B) obj).f22410a;
        }
        return this.f22410a.equals(obj);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f22410a.estimateSize();
    }

    @Override // p164j$.util.InterfaceC8356D, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22410a.forEachRemaining(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.InterfaceC8365M
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f22410a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f22410a.getComparator();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f22410a.getExactSizeIfKnown();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f22410a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22410a.hashCode();
    }

    @Override // p164j$.util.InterfaceC8356D
    /* renamed from: p */
    public final /* synthetic */ boolean mo17466p(InterfaceC8483n interfaceC8483n) {
        return this.f22410a.tryAdvance(C8481m.m17659a(interfaceC8483n));
    }

    @Override // p164j$.util.InterfaceC8365M
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f22410a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // p164j$.util.InterfaceC8356D, p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* synthetic */ InterfaceC8356D trySplit() {
        return m17779e(this.f22410a.trySplit());
    }

    @Override // p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* synthetic */ InterfaceC8365M trySplit() {
        return C8363K.m17766e(this.f22410a.trySplit());
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C8366N.m17764e(this.f22410a.trySplit());
    }
}