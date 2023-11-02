package p287pi;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import kotlin.text.C9654p;

/* renamed from: pi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11644a {
    /* renamed from: a */
    public static final String m7380a(String str) {
        boolean z;
        C9612q.m13917h(str, "<this>");
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (z2) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }
        return str;
    }

    /* renamed from: b */
    public static final String m7379b(String str) {
        boolean z;
        C9612q.m13917h(str, "<this>");
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z2 = true;
        }
        if (z2) {
            char lowerCase = Character.toLowerCase(charAt);
            String substring = str.substring(1);
            C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
            return lowerCase + substring;
        }
        return str;
    }

    /* renamed from: c */
    public static final String m7378c(String str, boolean z) {
        boolean z2;
        boolean z3;
        IntRange m13719S;
        Integer num;
        C9612q.m13917h(str, "<this>");
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && m7377d(str, 0, z)) {
            if (str.length() != 1 && m7377d(str, 1, z)) {
                m13719S = C9654p.m13719S(str);
                Iterator<Integer> it = m13719S.iterator();
                while (true) {
                    if (it.hasNext()) {
                        num = it.next();
                        if (!m7377d(str, num.intValue(), z)) {
                            break;
                        }
                    } else {
                        num = null;
                        break;
                    }
                }
                Integer num2 = num;
                if (num2 != null) {
                    int intValue = num2.intValue() - 1;
                    StringBuilder sb2 = new StringBuilder();
                    String substring = str.substring(0, intValue);
                    C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(m7376e(substring, z));
                    String substring2 = str.substring(intValue);
                    C9612q.m13918g(substring2, "this as java.lang.String).substring(startIndex)");
                    sb2.append(substring2);
                    return sb2.toString();
                }
                return m7376e(str, z);
            } else if (z) {
                return m7379b(str);
            } else {
                if (str.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    char lowerCase = Character.toLowerCase(str.charAt(0));
                    String substring3 = str.substring(1);
                    C9612q.m13918g(substring3, "this as java.lang.String).substring(startIndex)");
                    return lowerCase + substring3;
                }
                return str;
            }
        }
        return str;
    }

    /* renamed from: d */
    private static final boolean m7377d(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        if (z) {
            if ('A' > charAt || charAt >= '[') {
                return false;
            }
            return true;
        }
        return Character.isUpperCase(charAt);
    }

    /* renamed from: e */
    private static final String m7376e(String str, boolean z) {
        if (z) {
            return m7375f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C9612q.m13918g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* renamed from: f */
    public static final String m7375f(String str) {
        boolean z;
        C9612q.m13917h(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "builder.toString()");
        return sb3;
    }
}
