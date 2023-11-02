package p340sf;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p164j$.util.Comparator;
import p164j$.util.function.Function;
import p164j$.util.function.ToDoubleFunction;
import p164j$.util.function.ToIntFunction;
import p164j$.util.function.ToLongFunction;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0006\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¨\u0006\u000b"}, m14357d2 = {"Lsf/g;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "a", "b", "", "reversed", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: sf.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12470g implements Comparator<Comparable<? super Object>>, p164j$.util.Comparator {

    /* renamed from: j */
    public static final C12470g f32420j = new C12470g();

    private C12470g() {
    }

    @Override // java.util.Comparator, p164j$.util.Comparator
    /* renamed from: b */
    public int compare(Comparable<Object> a, Comparable<Object> b) {
        C9612q.m13917h(a, "a");
        C9612q.m13917h(b, "b");
        return b.compareTo(a);
    }

    @Override // java.util.Comparator, p164j$.util.Comparator
    public final Comparator<Comparable<Object>> reversed() {
        return C12469f.f32419j;
    }

    @Override // p164j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // p164j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, p164j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparing(java.util.function.Function function) {
        return thenComparing(Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return thenComparing(Function.VivifiedWrapper.convert(function), comparator);
    }

    @Override // p164j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparingDouble(java.util.function.ToDoubleFunction<? super Comparable<? super Object>> toDoubleFunction) {
        return thenComparingDouble(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    @Override // p164j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparingInt(java.util.function.ToIntFunction<? super Comparable<? super Object>> toIntFunction) {
        return thenComparingInt(ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    @Override // p164j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparingLong(java.util.function.ToLongFunction<? super Comparable<? super Object>> toLongFunction) {
        return thenComparingLong(ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }
}
