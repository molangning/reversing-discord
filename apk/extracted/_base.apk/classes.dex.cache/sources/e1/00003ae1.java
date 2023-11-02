package p164j$.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p164j$.util.Collection;
import p164j$.util.List;
import p164j$.util.function.Consumer;
import p164j$.util.function.Predicate;
import p164j$.util.function.UnaryOperator;

/* renamed from: j$.util.DesugarCollections */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class DesugarCollections {

    /* renamed from: a */
    public static final Class f22412a;

    /* renamed from: b */
    static final Class f22413b;

    /* renamed from: c */
    private static final Field f22414c;

    /* renamed from: d */
    private static final Field f22415d;

    /* renamed from: e */
    private static final Constructor f22416e;

    /* renamed from: f */
    private static final Constructor f22417f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f22412a = cls;
        f22413b = Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f22414c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f22415d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f22417f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f22416e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    /* renamed from: c */
    public static void m17774c(Iterable iterable, Consumer consumer) {
        Field field = f22414c;
        if (field == null) {
            try {
                AbstractC8516n.m17600q((Collection) f22415d.get(iterable), consumer);
                return;
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection forEach fall-back.", e);
            }
        }
        try {
            synchronized (field.get(iterable)) {
                AbstractC8516n.m17600q((Collection) f22415d.get(iterable), consumer);
            }
        } catch (IllegalAccessException e2) {
            throw new Error("Runtime illegal access in synchronized collection forEach.", e2);
        }
    }

    /* renamed from: d */
    public static boolean m17773d(Collection collection, Predicate predicate) {
        boolean removeIf;
        Field field = f22414c;
        if (field == null) {
            try {
                Collection collection2 = (Collection) f22415d.get(collection);
                return collection2 instanceof Collection ? ((Collection) collection2).removeIf(predicate) : Collection.CC.$default$removeIf(collection2, predicate);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e);
            }
        }
        try {
            synchronized (field.get(collection)) {
                java.util.Collection collection3 = (java.util.Collection) f22415d.get(collection);
                removeIf = collection3 instanceof Collection ? ((Collection) collection3).removeIf(predicate) : Collection.CC.$default$removeIf(collection3, predicate);
            }
            return removeIf;
        } catch (IllegalAccessException e2) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e2);
        }
    }

    /* renamed from: e */
    public static void m17772e(List list, UnaryOperator unaryOperator) {
        Field field = f22414c;
        if (field == null) {
            try {
                List list2 = (List) f22415d.get(list);
                if (list2 instanceof List) {
                    ((List) list2).replaceAll(unaryOperator);
                    return;
                } else {
                    List.CC.$default$replaceAll(list2, unaryOperator);
                    return;
                }
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized list replaceAll fall-back.", e);
            }
        }
        try {
            synchronized (field.get(list)) {
                java.util.List list3 = (java.util.List) f22415d.get(list);
                if (list3 instanceof List) {
                    ((List) list3).replaceAll(unaryOperator);
                } else {
                    List.CC.$default$replaceAll(list3, unaryOperator);
                }
            }
        } catch (IllegalAccessException e2) {
            throw new Error("Runtime illegal access in synchronized list replaceAll.", e2);
        }
    }

    /* renamed from: f */
    public static void m17771f(java.util.List list, Comparator comparator) {
        Field field = f22414c;
        if (field == null) {
            try {
                AbstractC8516n.m17599r((java.util.List) f22415d.get(list), comparator);
                return;
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e);
            }
        }
        try {
            synchronized (field.get(list)) {
                AbstractC8516n.m17599r((java.util.List) f22415d.get(list), comparator);
            }
        } catch (IllegalAccessException e2) {
            throw new Error("Runtime illegal access in synchronized list sort.", e2);
        }
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C8412d(map);
    }
}