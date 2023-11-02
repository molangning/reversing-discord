package gb;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: gb.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6712x {
    /* renamed from: a */
    private static <E> Collection<E> m22061a(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C6601a0.m22332g(iterable.iterator());
    }

    /* renamed from: b */
    public static <T> T m22060b(Iterable<? extends T> iterable, T t) {
        return (T) C6713y.m22048h(iterable.iterator(), t);
    }

    /* renamed from: c */
    public static <T> T m22059c(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return (T) m22058d(list);
            }
            throw new NoSuchElementException();
        }
        return (T) C6713y.m22049g(iterable.iterator());
    }

    /* renamed from: d */
    private static <T> T m22058d(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: e */
    public static Object[] m22057e(Iterable<?> iterable) {
        return m22061a(iterable).toArray();
    }

    /* renamed from: f */
    public static String m22056f(Iterable<?> iterable) {
        return C6713y.m22044l(iterable.iterator());
    }
}