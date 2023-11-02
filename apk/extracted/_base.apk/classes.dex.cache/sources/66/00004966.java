package pf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9637b;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001\u001a\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0001\u001a\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0000H\u0000¨\u0006\u000b"}, m14357d2 = {"", "v1", "v2", "a", "", "b", "v", "", "c", "base", "d", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: pf.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11574k0 {
    /* renamed from: a */
    public static final int m7609a(int i, int i2) {
        return C9612q.m13915j(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public static final int m7608b(long j, long j2) {
        return C9612q.m13914k(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* renamed from: c */
    public static final String m7607c(long j) {
        return m7606d(j, 10);
    }

    /* renamed from: d */
    public static final String m7606d(long j, int i) {
        int m13854a;
        int m13854a2;
        int m13854a3;
        if (j >= 0) {
            m13854a3 = C9637b.m13854a(i);
            String l = Long.toString(j, m13854a3);
            C9612q.m13918g(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb2 = new StringBuilder();
        m13854a = C9637b.m13854a(i);
        String l2 = Long.toString(j3, m13854a);
        C9612q.m13918g(l2, "toString(this, checkRadix(radix))");
        sb2.append(l2);
        m13854a2 = C9637b.m13854a(i);
        String l3 = Long.toString(j4, m13854a2);
        C9612q.m13918g(l3, "toString(this, checkRadix(radix))");
        sb2.append(l3);
        return sb2.toString();
    }
}