package p340sf;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002 \u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0007\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a[\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0002\u0010\u000e\u001a&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¨\u0006\u0010"}, m14357d2 = {"T", "a", "b", "", "Lkotlin/Function1;", "", "selectors", "", "e", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "f", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/comparisons/ComparisonsKt")
/* renamed from: sf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12466c {
    /* renamed from: b */
    public static <T> Comparator<T> m5211b(final Function1<? super T, ? extends Comparable<?>>... selectors) {
        boolean z;
        C9612q.m13917h(selectors, "selectors");
        if (selectors.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Comparator() { // from class: sf.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m5210c;
                    m5210c = C12466c.m5210c(selectors, obj, obj2);
                    return m5210c;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public static final int m5210c(Function1[] selectors, Object obj, Object obj2) {
        C9612q.m13917h(selectors, "$selectors");
        return m5208e(obj, obj2, selectors);
    }

    /* renamed from: d */
    public static <T extends Comparable<?>> int m5209d(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* renamed from: e */
    private static final <T> int m5208e(T t, T t2, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        int m5209d;
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            m5209d = m5209d(function1.invoke(t), function1.invoke(t2));
            if (m5209d != 0) {
                return m5209d;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static <T extends Comparable<? super T>> Comparator<T> m5207f() {
        C12469f c12469f = C12469f.f32419j;
        C9612q.m13919f(c12469f, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return c12469f;
    }
}