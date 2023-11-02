package p355ti;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, m14357d2 = {"", "", "a", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: ti.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12798k {
    /* renamed from: a */
    public static final String m3899a(char c) {
        String valueOf = String.valueOf(c);
        C9612q.m13919f(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        C9612q.m13918g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() > 1) {
            if (c != 329) {
                char charAt = upperCase.charAt(0);
                C9612q.m13919f(upperCase, "null cannot be cast to non-null type java.lang.String");
                String substring = upperCase.substring(1);
                C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
                C9612q.m13919f(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(locale);
                C9612q.m13918g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return charAt + lowerCase;
            }
            return upperCase;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}