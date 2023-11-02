package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import p304qf.C11876i;
import p340sf.C12466c;

@Metadata(m14358d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a7\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00102\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\t\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000\u001aG\u0010\u001a\u001a\u00020\u0017\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0011\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\b\u0010 \u001a\u00020\u001dH\u0001\u001a\b\u0010!\u001a\u00020\u001dH\u0001\"\u0019\u0010%\u001a\u00020\"*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"!\u0010(\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m14357d2 = {"T", "", "", "f", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "i", "elements", "l", "([Ljava/lang/Object;)Ljava/util/List;", "", "o", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "e", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "m", "(Ljava/lang/Object;)Ljava/util/List;", "n", "p", "", "", "fromIndex", "toIndex", "g", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "size", "", "q", "(III)V", "s", "r", "Lkotlin/ranges/IntRange;", "j", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "indices", "k", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9545j extends C9544i {
    /* renamed from: e */
    public static <T> ArrayList<T> m14108e(T... elements) {
        C9612q.m13917h(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C9532a(elements, true));
    }

    /* renamed from: f */
    public static final <T> Collection<T> m14107f(T[] tArr) {
        C9612q.m13917h(tArr, "<this>");
        return new C9532a(tArr, false);
    }

    /* renamed from: g */
    public static final <T extends Comparable<? super T>> int m14106g(List<? extends T> list, T t, int i, int i2) {
        int m5209d;
        C9612q.m13917h(list, "<this>");
        m14096q(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            m5209d = C12466c.m5209d(list.get(i4), t);
            if (m5209d < 0) {
                i = i4 + 1;
            } else if (m5209d > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i + 1);
    }

    /* renamed from: h */
    public static /* synthetic */ int m14105h(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m14106g(list, comparable, i, i2);
    }

    /* renamed from: i */
    public static <T> List<T> m14104i() {
        return C11876i.f30871j;
    }

    /* renamed from: j */
    public static IntRange m14103j(Collection<?> collection) {
        C9612q.m13917h(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    /* renamed from: k */
    public static <T> int m14102k(List<? extends T> list) {
        C9612q.m13917h(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: l */
    public static <T> List<T> m14101l(T... elements) {
        List<T> m14104i;
        List<T> m14274d;
        C9612q.m13917h(elements, "elements");
        if (elements.length > 0) {
            m14274d = C9536e.m14274d(elements);
            return m14274d;
        }
        m14104i = m14104i();
        return m14104i;
    }

    /* renamed from: m */
    public static <T> List<T> m14100m(T t) {
        List<T> m14104i;
        List<T> m14109d;
        if (t != null) {
            m14109d = C9544i.m14109d(t);
            return m14109d;
        }
        m14104i = m14104i();
        return m14104i;
    }

    /* renamed from: n */
    public static <T> List<T> m14099n(T... elements) {
        List<T> m14253B;
        C9612q.m13917h(elements, "elements");
        m14253B = C9538f.m14253B(elements);
        return m14253B;
    }

    /* renamed from: o */
    public static <T> List<T> m14098o(T... elements) {
        C9612q.m13917h(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C9532a(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static <T> List<T> m14097p(List<? extends T> list) {
        List<T> m14104i;
        List<T> m14109d;
        C9612q.m13917h(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                m14109d = C9544i.m14109d(list.get(0));
                return m14109d;
            }
            return list;
        }
        m14104i = m14104i();
        return m14104i;
    }

    /* renamed from: q */
    private static final void m14096q(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 >= 0) {
                if (i3 <= i) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
    }

    /* renamed from: r */
    public static void m14095r() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: s */
    public static void m14094s() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
