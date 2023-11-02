package p164j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.Spliterator */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface Spliterator<T> {

    /* renamed from: j$.util.Spliterator$Wrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class Wrapper implements java.util.Spliterator {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.Spliterator convert(Spliterator spliterator) {
            if (spliterator == null) {
                return null;
            }
            return spliterator instanceof C8366N ? ((C8366N) spliterator).f22424a : spliterator instanceof InterfaceC8365M ? C8364L.m17765a((InterfaceC8365M) spliterator) : new Wrapper();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ int characteristics() {
            return Spliterator.this.characteristics();
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Spliterator spliterator = Spliterator.this;
            if (obj instanceof Wrapper) {
                obj = Spliterator.this;
            }
            return spliterator.equals(obj);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ long estimateSize() {
            return Spliterator.this.estimateSize();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.this.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ Comparator getComparator() {
            return Spliterator.this.getComparator();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.this.getExactSizeIfKnown();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.this.hasCharacteristics(i);
        }

        public final /* synthetic */ int hashCode() {
            return Spliterator.this.hashCode();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
            return Spliterator.this.mo17305a(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ java.util.Spliterator trySplit() {
            return convert(Spliterator.this.trySplit());
        }
    }

    /* renamed from: a */
    boolean mo17305a(p164j$.util.function.Consumer consumer);

    int characteristics();

    long estimateSize();

    void forEachRemaining(p164j$.util.function.Consumer consumer);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    Spliterator trySplit();
}
