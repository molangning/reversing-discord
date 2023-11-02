package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p355ti.C12796i;
import p355ti.C12797j;
import pf.C11549b0;
import pf.C11555d0;
import pf.C11563g0;
import pf.C11568i;
import pf.C11593z;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u001a\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u001a\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u001a\u0011\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0016\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m14357d2 = {"", "Lpf/z;", "a", "(Ljava/lang/String;)B", "Lpf/g0;", "j", "(Ljava/lang/String;)S", "Lpf/b0;", "d", "(Ljava/lang/String;)I", "Lpf/d0;", "g", "(Ljava/lang/String;)J", "b", "", "radix", "c", "k", "l", "e", "f", "h", "i", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kotlin.text.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9660s {
    /* renamed from: a */
    public static final byte m13672a(String str) {
        C9612q.m13917h(str, "<this>");
        C11593z m13671b = m13671b(str);
        if (m13671b != null) {
            return m13671b.m7571f();
        }
        C9652n.m13770l(str);
        throw new C11568i();
    }

    /* renamed from: b */
    public static final C11593z m13671b(String str) {
        C9612q.m13917h(str, "<this>");
        return m13670c(str, 10);
    }

    /* renamed from: c */
    public static final C11593z m13670c(String str, int i) {
        int compare;
        C9612q.m13917h(str, "<this>");
        C11549b0 m13667f = m13667f(str, i);
        if (m13667f == null) {
            return null;
        }
        int m7682f = m13667f.m7682f();
        compare = Integer.compare(m7682f ^ Integer.MIN_VALUE, C11549b0.m7686b(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return C11593z.m7576a(C11593z.m7575b((byte) m7682f));
    }

    /* renamed from: d */
    public static final int m13669d(String str) {
        C9612q.m13917h(str, "<this>");
        C11549b0 m13668e = m13668e(str);
        if (m13668e != null) {
            return m13668e.m7682f();
        }
        C9652n.m13770l(str);
        throw new C11568i();
    }

    /* renamed from: e */
    public static final C11549b0 m13668e(String str) {
        C9612q.m13917h(str, "<this>");
        return m13667f(str, 10);
    }

    /* renamed from: f */
    public static final C11549b0 m13667f(String str, int i) {
        int i2;
        int compare;
        int compare2;
        int compare3;
        C9612q.m13917h(str, "<this>");
        C9637b.m13854a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        if (C9612q.m13915j(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int m7686b = C11549b0.m7686b(i);
        int i4 = 119304647;
        while (i2 < length) {
            int m13853b = C9637b.m13853b(str.charAt(i2), i);
            if (m13853b < 0) {
                return null;
            }
            compare = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                if (i4 == 119304647) {
                    i4 = C12797j.m3900a(-1, m7686b);
                    compare3 = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            int m7686b2 = C11549b0.m7686b(i3 * m7686b);
            int m7686b3 = C11549b0.m7686b(C11549b0.m7686b(m13853b) + m7686b2);
            compare2 = Integer.compare(m7686b3 ^ Integer.MIN_VALUE, m7686b2 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i2++;
            i3 = m7686b3;
        }
        return C11549b0.m7687a(i3);
    }

    /* renamed from: g */
    public static final long m13666g(String str) {
        C9612q.m13917h(str, "<this>");
        C11555d0 m13665h = m13665h(str);
        if (m13665h != null) {
            return m13665h.m7657f();
        }
        C9652n.m13770l(str);
        throw new C11568i();
    }

    /* renamed from: h */
    public static final C11555d0 m13665h(String str) {
        C9612q.m13917h(str, "<this>");
        return m13664i(str, 10);
    }

    /* renamed from: i */
    public static final C11555d0 m13664i(String str, int i) {
        int m13853b;
        int compare;
        int compare2;
        int compare3;
        C9612q.m13917h(str, "<this>");
        C9637b.m13854a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (C9612q.m13915j(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long m7661b = C11555d0.m7661b(i);
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            if (C9637b.m13853b(str.charAt(i2), i) < 0) {
                return null;
            }
            compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare > 0) {
                if (j2 == 512409557603043100L) {
                    j2 = C12796i.m3901a(-1L, m7661b);
                    compare3 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            long m7661b2 = C11555d0.m7661b(j * m7661b);
            long m7661b3 = C11555d0.m7661b(C11555d0.m7661b(C11549b0.m7686b(m13853b) & 4294967295L) + m7661b2);
            compare2 = Long.compare(m7661b3 ^ Long.MIN_VALUE, m7661b2 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i2++;
            j = m7661b3;
        }
        return C11555d0.m7662a(j);
    }

    /* renamed from: j */
    public static final short m13663j(String str) {
        C9612q.m13917h(str, "<this>");
        C11563g0 m13662k = m13662k(str);
        if (m13662k != null) {
            return m13662k.m7630f();
        }
        C9652n.m13770l(str);
        throw new C11568i();
    }

    /* renamed from: k */
    public static final C11563g0 m13662k(String str) {
        C9612q.m13917h(str, "<this>");
        return m13661l(str, 10);
    }

    /* renamed from: l */
    public static final C11563g0 m13661l(String str, int i) {
        int compare;
        C9612q.m13917h(str, "<this>");
        C11549b0 m13667f = m13667f(str, i);
        if (m13667f == null) {
            return null;
        }
        int m7682f = m13667f.m7682f();
        compare = Integer.compare(m7682f ^ Integer.MIN_VALUE, C11549b0.m7686b(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return C11563g0.m7635a(C11563g0.m7634b((short) m7682f));
    }
}
