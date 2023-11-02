package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p324rf.C12133b;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001\u001a3\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\n\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m14357d2 = {"T", "element", "", "d", "(Ljava/lang/Object;)Ljava/util/List;", "E", "", "c", "builder", "a", "", "", "isVarargs", "", "b", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9544i {
    /* renamed from: a */
    public static <E> List<E> m14112a(List<E> builder) {
        C9612q.m13917h(builder, "builder");
        return ((C12133b) builder).m6121r();
    }

    /* renamed from: b */
    public static final <T> Object[] m14111b(T[] tArr, boolean z) {
        C9612q.m13917h(tArr, "<this>");
        if (!z || !C9612q.m13922c(tArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
            C9612q.m13918g(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
            return copyOf;
        }
        return tArr;
    }

    /* renamed from: c */
    public static <E> List<E> m14110c() {
        return new C12133b();
    }

    /* renamed from: d */
    public static <T> List<T> m14109d(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C9612q.m13918g(singletonList, "singletonList(element)");
        return singletonList;
    }
}
