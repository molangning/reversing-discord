package p327ri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;

/* renamed from: ri.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12242a {
    /* renamed from: a */
    public static final <T> void m5675a(Collection<T> collection, T t) {
        C9612q.m13917h(collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }

    /* renamed from: b */
    private static final int m5674b(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    /* renamed from: c */
    public static final <T> List<T> m5673c(ArrayList<T> arrayList) {
        List<T> m14104i;
        Object m14056T;
        List<T> m14109d;
        C9612q.m13917h(arrayList, "<this>");
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                arrayList.trimToSize();
                return arrayList;
            }
            m14056T = C9553r.m14056T(arrayList);
            m14109d = C9544i.m14109d(m14056T);
            return m14109d;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: d */
    public static final <K> Map<K, Integer> m5672d(Iterable<? extends K> iterable) {
        C9612q.m13917h(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (K k : iterable) {
            linkedHashMap.put(k, Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public static final <K, V> HashMap<K, V> m5671e(int i) {
        return new HashMap<>(m5674b(i));
    }

    /* renamed from: f */
    public static final <E> HashSet<E> m5670f(int i) {
        return new HashSet<>(m5674b(i));
    }

    /* renamed from: g */
    public static final <E> LinkedHashSet<E> m5669g(int i) {
        return new LinkedHashSet<>(m5674b(i));
    }
}
