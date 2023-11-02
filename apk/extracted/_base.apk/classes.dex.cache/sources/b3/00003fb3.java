package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0006\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0001\u001a\"\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001¨\u0006\t"}, m14357d2 = {"T", "", "", "u", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "default", "t", "", "v", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9546k extends C9545j {
    /* renamed from: t */
    public static <T> int m14093t(Iterable<? extends T> iterable, int i) {
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    /* renamed from: u */
    public static final <T> Integer m14092u(Iterable<? extends T> iterable) {
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: v */
    public static <T> List<T> m14091v(Iterable<? extends Iterable<? extends T>> iterable) {
        C9612q.m13917h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable<? extends T> iterable2 : iterable) {
            C9550o.m14085y(arrayList, iterable2);
        }
        return arrayList;
    }
}