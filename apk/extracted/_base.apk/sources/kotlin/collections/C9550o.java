package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000*\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u001a&\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a/\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a&\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001f\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m14357d2 = {"T", "", "", "elements", "", "y", "", "z", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "A", "C", "", "B", "(Ljava/util/List;)Ljava/lang/Object;", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9550o extends C9549n {
    /* renamed from: A */
    public static final <T> Collection<T> m14088A(Iterable<? extends T> iterable) {
        List m14075C0;
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        m14075C0 = C9553r.m14075C0(iterable);
        return m14075C0;
    }

    /* renamed from: B */
    public static <T> T m14087B(List<T> list) {
        int m14102k;
        C9612q.m13917h(list, "<this>");
        if (!list.isEmpty()) {
            m14102k = C9545j.m14102k(list);
            return list.remove(m14102k);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: C */
    public static final <T> boolean m14086C(Collection<? super T> collection, Iterable<? extends T> elements) {
        C9612q.m13917h(collection, "<this>");
        C9612q.m13917h(elements, "elements");
        return collection.retainAll(m14088A(elements));
    }

    /* renamed from: y */
    public static <T> boolean m14085y(Collection<? super T> collection, Iterable<? extends T> elements) {
        C9612q.m13917h(collection, "<this>");
        C9612q.m13917h(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: z */
    public static <T> boolean m14084z(Collection<? super T> collection, T[] elements) {
        C9612q.m13917h(collection, "<this>");
        C9612q.m13917h(elements, "elements");
        return collection.addAll(C9533b.m14316d(elements));
    }
}
