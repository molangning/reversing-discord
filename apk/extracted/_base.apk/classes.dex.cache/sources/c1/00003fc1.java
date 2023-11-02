package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.C11878k;
import p304qf.C11888u;

@Metadata(m14358d1 = {"\u0000.\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a7\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\n\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¨\u0006\u0012"}, m14357d2 = {"T", "", "d", "", "elements", "i", "([Ljava/lang/Object;)Ljava/util/Set;", "", "g", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "e", "([Ljava/lang/Object;)Ljava/util/HashSet;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "h", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.collections.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9560w extends C9559v {
    /* renamed from: d */
    public static <T> Set<T> m14007d() {
        return C11878k.f30873j;
    }

    /* renamed from: e */
    public static <T> HashSet<T> m14006e(T... elements) {
        int m6758d;
        C9612q.m13917h(elements, "elements");
        m6758d = C11888u.m6758d(elements.length);
        return (HashSet) C9538f.m14207m0(elements, new HashSet(m6758d));
    }

    /* renamed from: f */
    public static <T> LinkedHashSet<T> m14005f(T... elements) {
        int m6758d;
        C9612q.m13917h(elements, "elements");
        m6758d = C11888u.m6758d(elements.length);
        return (LinkedHashSet) C9538f.m14207m0(elements, new LinkedHashSet(m6758d));
    }

    /* renamed from: g */
    public static <T> Set<T> m14004g(T... elements) {
        int m6758d;
        C9612q.m13917h(elements, "elements");
        m6758d = C11888u.m6758d(elements.length);
        return (Set) C9538f.m14207m0(elements, new LinkedHashSet(m6758d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static final <T> Set<T> m14003h(Set<? extends T> set) {
        Set<T> m14007d;
        Set<T> m14008c;
        C9612q.m13917h(set, "<this>");
        int size = set.size();
        if (size != 0) {
            if (size == 1) {
                m14008c = C9559v.m14008c(set.iterator().next());
                return m14008c;
            }
            return set;
        }
        m14007d = m14007d();
        return m14007d;
    }

    /* renamed from: i */
    public static <T> Set<T> m14002i(T... elements) {
        Set<T> m14007d;
        Set<T> m14240H0;
        C9612q.m13917h(elements, "elements");
        if (elements.length > 0) {
            m14240H0 = C9538f.m14240H0(elements);
            return m14240H0;
        }
        m14007d = m14007d();
        return m14007d;
    }
}