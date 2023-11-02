package p164j$.util;

import java.util.Collections;
import java.util.Comparator;
import p164j$.util.Comparator;
import p164j$.util.function.Function;
import p164j$.util.function.ToDoubleFunction;
import p164j$.util.function.ToIntFunction;
import p164j$.util.function.ToLongFunction;

/* renamed from: j$.util.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class EnumC8382c implements Comparator, Comparator {
    public static final EnumC8382c INSTANCE;

    /* renamed from: a */
    private static final /* synthetic */ EnumC8382c[] f22464a;

    static {
        EnumC8382c enumC8382c = new EnumC8382c();
        INSTANCE = enumC8382c;
        f22464a = new EnumC8382c[]{enumC8382c};
    }

    private EnumC8382c() {
        super("INSTANCE", 0);
    }

    public static EnumC8382c valueOf(String str) {
        return (EnumC8382c) Enum.valueOf(EnumC8382c.class, str);
    }

    public static EnumC8382c[] values() {
        return (EnumC8382c[]) f22464a.clone();
    }

    @Override // java.util.Comparator, p164j$.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator, p164j$.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // p164j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // p164j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, p164j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function), comparator);
    }

    @Override // p164j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    @Override // p164j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    @Override // p164j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }
}