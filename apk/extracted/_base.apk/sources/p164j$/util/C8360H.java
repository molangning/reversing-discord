package p164j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p164j$.util.function.C8466e0;
import p164j$.util.function.C8469g;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.H */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8360H implements InterfaceC8362J {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f22420a;

    private /* synthetic */ C8360H(Spliterator.OfLong ofLong) {
        this.f22420a = ofLong;
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC8362J m17768e(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C8361I ? ((C8361I) ofLong).f22421a : new C8360H(ofLong);
    }

    @Override // p164j$.util.InterfaceC8362J, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return this.f22420a.tryAdvance(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.InterfaceC8362J
    /* renamed from: b */
    public final /* synthetic */ void mo17438b(InterfaceC8468f0 interfaceC8468f0) {
        this.f22420a.forEachRemaining(C8466e0.m17672a(interfaceC8468f0));
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f22420a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8360H) {
            obj = ((C8360H) obj).f22420a;
        }
        return this.f22420a.equals(obj);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f22420a.estimateSize();
    }

    @Override // p164j$.util.InterfaceC8362J
    /* renamed from: f */
    public final /* synthetic */ boolean mo17437f(InterfaceC8468f0 interfaceC8468f0) {
        return this.f22420a.tryAdvance(C8466e0.m17672a(interfaceC8468f0));
    }

    @Override // p164j$.util.InterfaceC8362J, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22420a.forEachRemaining(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.InterfaceC8365M
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f22420a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f22420a.getComparator();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f22420a.getExactSizeIfKnown();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f22420a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22420a.hashCode();
    }

    @Override // p164j$.util.InterfaceC8365M
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f22420a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // p164j$.util.InterfaceC8362J, p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* synthetic */ InterfaceC8362J trySplit() {
        return m17768e(this.f22420a.trySplit());
    }

    @Override // p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* synthetic */ InterfaceC8365M trySplit() {
        return C8363K.m17766e(this.f22420a.trySplit());
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C8366N.m17764e(this.f22420a.trySplit());
    }
}
