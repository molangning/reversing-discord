package io.sentry.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.util.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8212b {
    /* renamed from: a */
    public static <T> List<T> m18239a(List<T> list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m18238b(Map<K, V> map) {
        if (map != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    concurrentHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return concurrentHashMap;
        }
        return null;
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m18237c(Map<K, V> map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    /* renamed from: d */
    public static int m18236d(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }
}