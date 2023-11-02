package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0000\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m14357d2 = {"", "", "index", "H", "(Ljava/util/List;I)I", "I", "T", "F", "", "G", "(Ljava/util/List;)Ljava/util/List;", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9551p extends C9550o {
    /* renamed from: F */
    public static <T> List<T> m14081F(List<? extends T> list) {
        C9612q.m13917h(list, "<this>");
        return new C9557t(list);
    }

    /* renamed from: G */
    public static <T> List<T> m14080G(List<T> list) {
        C9612q.m13917h(list, "<this>");
        return new C9556s(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final int m14079H(List<?> list, int i) {
        int m14102k;
        int m14102k2;
        int m14102k3;
        m14102k = C9545j.m14102k(list);
        if (new IntRange(0, m14102k).contains(i)) {
            m14102k3 = C9545j.m14102k(list);
            return m14102k3 - i;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Element index ");
        sb2.append(i);
        sb2.append(" must be in range [");
        m14102k2 = C9545j.m14102k(list);
        sb2.append(new IntRange(0, m14102k2));
        sb2.append("].");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final int m14078I(List<?> list, int i) {
        if (new IntRange(0, list.size()).contains(i)) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new IntRange(0, list.size()) + "].");
    }
}
