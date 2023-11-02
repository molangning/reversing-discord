package p128h4;

/* renamed from: h4.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6925h {
    /* renamed from: a */
    public static boolean m21671a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: b */
    public static boolean m21670b(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: c */
    public static boolean m21669c(char c) {
        return m21670b(c) || m21671a(c);
    }

    /* renamed from: d */
    public static boolean m21668d(CharSequence charSequence, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!m21670b(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m21667e(CharSequence charSequence, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!m21669c(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m21666f(CharSequence charSequence, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!m21671a(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m21665g(CharSequence charSequence, int i, int i2) {
        if ((i2 - i) + 1 == 4 && m21670b(charSequence.charAt(i)) && m21667e(charSequence, i + 1, i2, 3, 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m21664h(CharSequence charSequence, int i, int i2) {
        return m21667e(charSequence, i, i2, 1, 1);
    }

    /* renamed from: i */
    public static boolean m21663i(CharSequence charSequence, int i, int i2) {
        return m21667e(charSequence, i, i2, 2, 8);
    }

    /* renamed from: j */
    public static boolean m21662j(CharSequence charSequence, int i, int i2) {
        return m21667e(charSequence, i, i2, 1, 8);
    }

    /* renamed from: k */
    public static boolean m21661k(CharSequence charSequence, int i, int i2) {
        return i2 == i + 1 && m21670b(charSequence.charAt(i)) && m21671a(charSequence.charAt(i2));
    }

    /* renamed from: l */
    public static boolean m21660l(CharSequence charSequence, int i, int i2) {
        return m21667e(charSequence, i, i2, 3, 8);
    }

    /* renamed from: m */
    public static boolean m21659m(CharSequence charSequence, int i, int i2) {
        return m21667e(charSequence, i, i2, 3, 8);
    }

    /* renamed from: n */
    public static boolean m21658n(CharSequence charSequence, int i, int i2) {
        return i2 == i + 1 && m21669c(charSequence.charAt(i)) && m21670b(charSequence.charAt(i2));
    }

    /* renamed from: o */
    public static boolean m21657o(CharSequence charSequence, int i, int i2) {
        return m21667e(charSequence, i, i2, 3, 8);
    }

    /* renamed from: p */
    public static boolean m21656p(CharSequence charSequence, int i, int i2) {
        if (m21668d(charSequence, i, i2, 2, 3) || m21668d(charSequence, i, i2, 5, 8)) {
            return true;
        }
        if ((i2 - i) + 1 == 4 && charSequence.charAt(i) == 'r' && charSequence.charAt(i + 1) == 'o' && charSequence.charAt(i + 2) == 'o' && charSequence.charAt(i + 3) == 't') {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m21655q(CharSequence charSequence, int i, int i2) {
        return m21668d(charSequence, i, i2, 2, 2) || m21666f(charSequence, i, i2, 3, 3);
    }

    /* renamed from: r */
    public static boolean m21654r(CharSequence charSequence, int i, int i2) {
        return m21668d(charSequence, i, i2, 4, 4);
    }

    /* renamed from: s */
    public static boolean m21653s(CharSequence charSequence, int i, int i2) {
        return m21667e(charSequence, i, i2, 5, 8) || m21665g(charSequence, i, i2);
    }
}