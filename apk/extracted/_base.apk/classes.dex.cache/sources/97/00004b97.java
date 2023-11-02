package p324rf;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0018\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001c\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m14357d2 = {"E", "", "size", "", "d", "(I)[Ljava/lang/Object;", "T", "offset", "length", "", "j", "([Ljava/lang/Object;II)Ljava/lang/String;", "i", "([Ljava/lang/Object;II)I", "", "other", "", "h", "([Ljava/lang/Object;IILjava/util/List;)Z", "newSize", "e", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "index", "", "f", "([Ljava/lang/Object;I)V", "fromIndex", "toIndex", "g", "([Ljava/lang/Object;II)V", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: rf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12135c {
    /* renamed from: d */
    public static final <E> E[] m6109d(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (E[]) new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: e */
    public static final <T> T[] m6108e(T[] tArr, int i) {
        C9612q.m13917h(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        C9612q.m13918g(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    /* renamed from: f */
    public static final <E> void m6107f(E[] eArr, int i) {
        C9612q.m13917h(eArr, "<this>");
        eArr[i] = null;
    }

    /* renamed from: g */
    public static final <E> void m6106g(E[] eArr, int i, int i2) {
        C9612q.m13917h(eArr, "<this>");
        while (i < i2) {
            m6107f(eArr, i);
            i++;
        }
    }

    /* renamed from: h */
    public static final <T> boolean m6105h(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C9612q.m13922c(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static final <T> int m6104i(T[] tArr, int i, int i2) {
        int i3;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            T t = tArr[i + i5];
            int i6 = i4 * 31;
            if (t != null) {
                i3 = t.hashCode();
            } else {
                i3 = 0;
            }
            i4 = i6 + i3;
        }
        return i4;
    }

    /* renamed from: j */
    public static final <T> String m6103j(T[] tArr, int i, int i2) {
        StringBuilder sb2 = new StringBuilder((i2 * 3) + 2);
        sb2.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb2.append(", ");
            }
            sb2.append(tArr[i + i3]);
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "sb.toString()");
        return sb3;
    }
}