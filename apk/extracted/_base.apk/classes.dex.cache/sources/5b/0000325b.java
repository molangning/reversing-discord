package eg;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0000¨\u0006\u0010"}, m14357d2 = {"Leg/c;", "Lkotlin/ranges/IntRange;", "range", "", "d", "value", "c", "bitCount", "e", "from", "until", "", "b", "", "", "a", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: eg.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6223d {
    /* renamed from: a */
    public static final String m23225a(Object from, Object until) {
        C9612q.m13917h(from, "from");
        C9612q.m13917h(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    /* renamed from: b */
    public static final void m23224b(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(m23225a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: c */
    public static final int m23223c(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: d */
    public static final int m23222d(AbstractC6221c abstractC6221c, IntRange range) {
        C9612q.m13917h(abstractC6221c, "<this>");
        C9612q.m13917h(range, "range");
        if (!range.isEmpty()) {
            if (range.m13889e() < Integer.MAX_VALUE) {
                return abstractC6221c.mo22782d(range.m13890a(), range.m13889e() + 1);
            }
            if (range.m13890a() > Integer.MIN_VALUE) {
                return abstractC6221c.mo22782d(range.m13890a() - 1, range.m13889e()) + 1;
            }
            return abstractC6221c.mo23226c();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    /* renamed from: e */
    public static final int m23221e(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}