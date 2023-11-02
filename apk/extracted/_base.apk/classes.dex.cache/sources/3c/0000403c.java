package kotlin.text;

import gg.C6759j;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, m14357d2 = {"", "", "X0", "Y0", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "Z0", "", "", "n", "W0", "a1", "b1", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9659r extends C9658q {
    /* renamed from: W0 */
    public static String m13678W0(String str, int i) {
        boolean z;
        int m21926g;
        C9612q.m13917h(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m21926g = C6759j.m21926g(i, str.length());
            String substring = str.substring(m21926g);
            C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: X0 */
    public static char m13677X0(CharSequence charSequence) {
        boolean z;
        int m13717T;
        C9612q.m13917h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m13717T = C9654p.m13717T(charSequence);
            return charSequence.charAt(m13717T);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: Y0 */
    public static Character m13676Y0(CharSequence charSequence) {
        boolean z;
        C9612q.m13917h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    /* renamed from: Z0 */
    public static char m13675Z0(CharSequence charSequence) {
        C9612q.m13917h(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: a1 */
    public static String m13674a1(String str, int i) {
        boolean z;
        int m21926g;
        C9612q.m13917h(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m21926g = C6759j.m21926g(i, str.length());
            String substring = str.substring(0, m21926g);
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: b1 */
    public static String m13673b1(String str, int i) {
        boolean z;
        int m21926g;
        C9612q.m13917h(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length();
            m21926g = C6759j.m21926g(i, length);
            String substring = str.substring(length - m21926g);
            C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}