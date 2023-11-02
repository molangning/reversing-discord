package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a2\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0006¨\u0006\t"}, m14357d2 = {"", "T", "", "", "w", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "x", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9549n extends C9548m {
    /* renamed from: w */
    public static <T extends Comparable<? super T>> void m14090w(List<T> list) {
        C9612q.m13917h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: x */
    public static <T> void m14089x(List<T> list, Comparator<? super T> comparator) {
        C9612q.m13917h(list, "<this>");
        C9612q.m13917h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
