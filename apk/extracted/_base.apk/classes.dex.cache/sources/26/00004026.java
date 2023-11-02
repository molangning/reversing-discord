package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0001¨\u0006\r"}, m14357d2 = {"", "", "c", "Ljava/util/Locale;", "locale", "", "e", "d", "char", "", "radix", "b", "a", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/text/CharsKt")
/* renamed from: kotlin.text.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9637b {
    /* renamed from: a */
    public static int m13854a(int i) {
        if (new IntRange(2, 36).contains(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new IntRange(2, 36));
    }

    /* renamed from: b */
    public static final int m13853b(char c, int i) {
        return Character.digit((int) c, i);
    }

    /* renamed from: c */
    public static boolean m13852c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: d */
    public static String m13851d(char c, Locale locale) {
        C9612q.m13917h(locale, "locale");
        String m13850e = m13850e(c, locale);
        if (m13850e.length() > 1) {
            if (c != 329) {
                char charAt = m13850e.charAt(0);
                C9612q.m13919f(m13850e, "null cannot be cast to non-null type java.lang.String");
                String substring = m13850e.substring(1);
                C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
                C9612q.m13919f(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                C9612q.m13918g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return charAt + lowerCase;
            }
            return m13850e;
        }
        String valueOf = String.valueOf(c);
        C9612q.m13919f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        C9612q.m13918g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (!C9612q.m13922c(m13850e, upperCase)) {
            return m13850e;
        }
        return String.valueOf(Character.toTitleCase(c));
    }

    /* renamed from: e */
    public static final String m13850e(char c, Locale locale) {
        C9612q.m13917h(locale, "locale");
        String valueOf = String.valueOf(c);
        C9612q.m13919f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        C9612q.m13918g(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}