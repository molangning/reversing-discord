package hk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p122gk.C6854w;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\t"}, m14357d2 = {"", "", "value", "fromIndex", "toIndex", "a", "Lgk/w;", "pos", "b", "okio"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: hk.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C7363e {
    /* renamed from: a */
    public static final int m20835a(int[] binarySearch, int i, int i2, int i3) {
        C9612q.m13917h(binarySearch, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = binarySearch[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 > i) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m20834b(C6854w segment, int i) {
        C9612q.m13917h(segment, "$this$segment");
        int m20835a = m20835a(segment.m21779G(), i + 1, 0, segment.m21778H().length);
        if (m20835a < 0) {
            return ~m20835a;
        }
        return m20835a;
    }
}
