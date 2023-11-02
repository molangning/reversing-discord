package kotlin.text;

import gg.C6759j;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import p304qf.AbstractC11883p;
import p355ti.C12785a;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\f\u0010\r\u001a\u00020\u0000*\u00020\fH\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u001c\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u0002*\u00020\u0015\u001a4\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u001c\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0010\"%\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u001ej\b\u0012\u0004\u0012\u00020\u0000`\u001f*\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m14357d2 = {"", "other", "", "ignoreCase", "t", "", "oldChar", "newChar", "A", "oldValue", "newValue", "B", "", "q", "prefix", "F", "", "startIndex", "E", "suffix", "r", "", "w", "thisOffset", "otherOffset", "length", "x", "n", "z", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "v", "(Lkotlin/jvm/internal/k0;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9653o extends C9652n {
    /* renamed from: A */
    public static final String m13765A(String str, char c, char c2, boolean z) {
        C9612q.m13917h(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            C9612q.m13918g(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C9638c.m13849f(charAt, c, z)) {
                charAt = c2;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    /* renamed from: B */
    public static final String m13764B(String str, String oldValue, String newValue, boolean z) {
        int m21930c;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(oldValue, "oldValue");
        C9612q.m13917h(newValue, "newValue");
        int i = 0;
        int m13713V = C9654p.m13713V(str, oldValue, 0, z);
        if (m13713V < 0) {
            return str;
        }
        int length = oldValue.length();
        m21930c = C6759j.m21930c(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i, m13713V);
                sb2.append(newValue);
                i = m13713V + length;
                if (m13713V >= str.length()) {
                    break;
                }
                m13713V = C9654p.m13713V(str, oldValue, m13713V + m21930c, z);
            } while (m13713V > 0);
            sb2.append((CharSequence) str, i, str.length());
            String sb3 = sb2.toString();
            C9612q.m13918g(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: C */
    public static /* synthetic */ String m13763C(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m13765A(str, c, c2, z);
    }

    /* renamed from: D */
    public static /* synthetic */ String m13762D(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m13764B(str, str2, str3, z);
    }

    /* renamed from: E */
    public static boolean m13761E(String str, String prefix, int i, boolean z) {
        boolean m13750x;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(prefix, "prefix");
        if (!z) {
            return str.startsWith(prefix, i);
        }
        m13750x = m13750x(str, i, prefix, 0, prefix.length(), z);
        return m13750x;
    }

    /* renamed from: F */
    public static boolean m13760F(String str, String prefix, boolean z) {
        boolean m13750x;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(prefix, "prefix");
        if (!z) {
            return str.startsWith(prefix);
        }
        m13750x = m13750x(str, 0, prefix, 0, prefix.length(), z);
        return m13750x;
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m13759G(String str, String str2, int i, boolean z, int i2, Object obj) {
        boolean m13761E;
        if ((i2 & 4) != 0) {
            z = false;
        }
        m13761E = m13761E(str, str2, i, z);
        return m13761E;
    }

    /* renamed from: H */
    public static /* synthetic */ boolean m13758H(String str, String str2, boolean z, int i, Object obj) {
        boolean m13760F;
        if ((i & 2) != 0) {
            z = false;
        }
        m13760F = m13760F(str, str2, z);
        return m13760F;
    }

    /* renamed from: q */
    public static String m13757q(byte[] bArr) {
        C9612q.m13917h(bArr, "<this>");
        return new String(bArr, C12785a.f33142b);
    }

    /* renamed from: r */
    public static boolean m13756r(String str, String suffix, boolean z) {
        boolean m13750x;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(suffix, "suffix");
        if (!z) {
            return str.endsWith(suffix);
        }
        m13750x = m13750x(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
        return m13750x;
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m13755s(String str, String str2, boolean z, int i, Object obj) {
        boolean m13756r;
        if ((i & 2) != 0) {
            z = false;
        }
        m13756r = m13756r(str, str2, z);
        return m13756r;
    }

    /* renamed from: t */
    public static boolean m13754t(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m13753u(String str, String str2, boolean z, int i, Object obj) {
        boolean m13754t;
        if ((i & 2) != 0) {
            z = false;
        }
        m13754t = m13754t(str, str2, z);
        return m13754t;
    }

    /* renamed from: v */
    public static Comparator<String> m13752v(C9602k0 c9602k0) {
        C9612q.m13917h(c9602k0, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        C9612q.m13918g(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    /* renamed from: w */
    public static boolean m13751w(CharSequence charSequence) {
        IntRange m13719S;
        boolean m13852c;
        boolean z;
        C9612q.m13917h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        m13719S = C9654p.m13719S(charSequence);
        if (!(m13719S instanceof Collection) || !((Collection) m13719S).isEmpty()) {
            Iterator<Integer> it = m13719S.iterator();
            while (it.hasNext()) {
                m13852c = C9637b.m13852c(charSequence.charAt(((AbstractC11883p) it).nextInt()));
                if (!m13852c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m13750x(String str, int i, String other, int i2, int i3, boolean z) {
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(other, "other");
        if (!z) {
            return str.regionMatches(i, other, i2, i3);
        }
        return str.regionMatches(z, i, other, i2, i3);
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m13749y(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        boolean m13750x;
        if ((i4 & 16) != 0) {
            z = false;
        }
        m13750x = m13750x(str, i, str2, i2, i3, z);
        return m13750x;
    }

    /* renamed from: z */
    public static String m13748z(CharSequence charSequence, int i) {
        boolean z;
        C9612q.m13917h(charSequence, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return "";
            }
            if (i != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb2 = new StringBuilder(charSequence.length() * i);
                    AbstractC11883p it = new IntRange(1, i).iterator();
                    while (it.hasNext()) {
                        it.nextInt();
                        sb2.append(charSequence);
                    }
                    String sb3 = sb2.toString();
                    C9612q.m13918g(sb3, "{\n                    va…tring()\n                }");
                    return sb3;
                }
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i];
                for (int i2 = 0; i2 < i; i2++) {
                    cArr[i2] = charAt;
                }
                return new String(cArr);
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
    }
}
