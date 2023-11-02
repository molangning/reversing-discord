package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.C11886s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0005\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002\u001a.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¨\u0006\n"}, m14357d2 = {"T", "", "element", "k", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "j", "m", "l", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.collections.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9561x extends C9560w {
    /* renamed from: j */
    public static <T> Set<T> m14001j(Set<? extends T> set, Iterable<? extends T> elements) {
        C9612q.m13917h(set, "<this>");
        C9612q.m13917h(elements, "elements");
        Collection<?> m14088A = C9550o.m14088A(elements);
        if (m14088A.isEmpty()) {
            return C9543h.m14176G0(set);
        }
        if (m14088A instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!m14088A.contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(m14088A);
        return linkedHashSet2;
    }

    /* renamed from: k */
    public static <T> Set<T> m14000k(Set<? extends T> set, T t) {
        C9612q.m13917h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C11886s.m6774d(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && C9612q.m13922c(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: l */
    public static <T> Set<T> m13999l(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        C9612q.m13917h(set, "<this>");
        C9612q.m13917h(elements, "elements");
        Integer m14092u = C9546k.m14092u(elements);
        if (m14092u != null) {
            size = set.size() + m14092u.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C11886s.m6774d(size));
        linkedHashSet.addAll(set);
        C9543h.m14115y(linkedHashSet, elements);
        return linkedHashSet;
    }

    /* renamed from: m */
    public static <T> Set<T> m13998m(Set<? extends T> set, T t) {
        C9612q.m13917h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C11886s.m6774d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }
}
