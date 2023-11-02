package gb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p102fb.C6377g;
import p102fb.C6378h;

/* renamed from: gb.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6601a0 {
    /* renamed from: a */
    public static boolean m22338a(List<?> list, Object obj) {
        if (obj == C6378h.m22834j(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i = 0; i < size; i++) {
                if (!C6377g.m22845a(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return C6713y.m22053c(list.iterator(), list2.iterator());
    }

    /* renamed from: b */
    public static int m22337b(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m22336c(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C6377g.m22845a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static int m22336c(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: d */
    public static int m22335d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m22334e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C6377g.m22845a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m22334e(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static <E> ArrayList<E> m22333f() {
        return new ArrayList<>();
    }

    /* renamed from: g */
    public static <E> ArrayList<E> m22332g(Iterator<? extends E> it) {
        ArrayList<E> m22333f = m22333f();
        C6713y.m22055a(m22333f, it);
        return m22333f;
    }
}