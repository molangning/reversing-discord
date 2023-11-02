package p163ik;

import java.util.regex.Pattern;

/* renamed from: ik.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C7678b {

    /* renamed from: a */
    private static final Pattern f20988a = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

    /* renamed from: a */
    public static boolean m20095a(CharSequence charSequence) {
        if (m20092d(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLowerCase(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m20094b(CharSequence charSequence) {
        if (m20092d(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isUpperCase(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m20093c(CharSequence charSequence) {
        int m20090f = m20090f(charSequence);
        if (m20090f == 0) {
            return true;
        }
        for (int i = 0; i < m20090f; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m20092d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: e */
    public static boolean m20091e(CharSequence charSequence) {
        if (m20092d(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static int m20090f(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }
}