package p164j$.util;

import p164j$.util.function.Function;
import p164j$.util.function.ToDoubleFunction;
import p164j$.util.function.ToIntFunction;
import p164j$.util.function.ToLongFunction;

/* renamed from: j$.util.Comparator */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface Comparator<T> {

    /* renamed from: j$.util.Comparator$-CC */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class CC<T> {
        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, Function function) {
            function.getClass();
            return AbstractC8516n.m17597t(comparator, new C8378a(3, function));
        }

        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, Function function, java.util.Comparator comparator2) {
            function.getClass();
            comparator2.getClass();
            return AbstractC8516n.m17597t(comparator, new C8380b(comparator2, function, 1));
        }

        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, java.util.Comparator comparator2) {
            comparator2.getClass();
            return new C8380b(comparator, comparator2, 0);
        }

        public static java.util.Comparator $default$thenComparingDouble(java.util.Comparator comparator, ToDoubleFunction toDoubleFunction) {
            toDoubleFunction.getClass();
            return AbstractC8516n.m17597t(comparator, new C8378a(0, toDoubleFunction));
        }

        public static java.util.Comparator $default$thenComparingInt(java.util.Comparator comparator, ToIntFunction toIntFunction) {
            toIntFunction.getClass();
            return AbstractC8516n.m17597t(comparator, new C8378a(1, toIntFunction));
        }

        public static java.util.Comparator $default$thenComparingLong(java.util.Comparator comparator, ToLongFunction toLongFunction) {
            toLongFunction.getClass();
            return AbstractC8516n.m17597t(comparator, new C8378a(2, toLongFunction));
        }

        /* renamed from: a */
        public static java.util.Comparator m17777a() {
            return EnumC8382c.INSTANCE;
        }
    }

    int compare(T t, T t2);

    boolean equals(Object obj);

    java.util.Comparator<T> reversed();

    <U extends Comparable<? super U>> java.util.Comparator<T> thenComparing(Function<? super T, ? extends U> function);

    <U> java.util.Comparator<T> thenComparing(Function<? super T, ? extends U> function, java.util.Comparator<? super U> comparator);

    java.util.Comparator<T> thenComparing(java.util.Comparator<? super T> comparator);

    java.util.Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> toDoubleFunction);

    java.util.Comparator<T> thenComparingInt(ToIntFunction<? super T> toIntFunction);

    java.util.Comparator<T> thenComparingLong(ToLongFunction<? super T> toLongFunction);
}