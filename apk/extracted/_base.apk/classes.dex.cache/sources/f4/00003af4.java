package p164j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p164j$.util.Spliterator;
import p164j$.util.function.C8469g;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.N */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8366N implements Spliterator {

    /* renamed from: a */
    public final /* synthetic */ Spliterator f22424a;

    private /* synthetic */ C8366N(Spliterator spliterator) {
        this.f22424a = spliterator;
    }

    /* renamed from: e */
    public static /* synthetic */ Spliterator m17764e(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof Spliterator.Wrapper ? Spliterator.this : spliterator instanceof Spliterator.OfPrimitive ? C8363K.m17766e((Spliterator.OfPrimitive) spliterator) : new C8366N(spliterator);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return this.f22424a.tryAdvance(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f22424a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8366N) {
            obj = ((C8366N) obj).f22424a;
        }
        return this.f22424a.equals(obj);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f22424a.estimateSize();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22424a.forEachRemaining(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f22424a.getComparator();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f22424a.getExactSizeIfKnown();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f22424a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22424a.hashCode();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return m17764e(this.f22424a.trySplit());
    }
}