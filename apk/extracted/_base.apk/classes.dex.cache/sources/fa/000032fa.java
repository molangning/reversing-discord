package p102fb;

/* renamed from: fb.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6378h {
    /* renamed from: a */
    private static String m22843a(int i, int i2, String str) {
        if (i < 0) {
            return C6385k.m22814a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C6385k.m22814a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    /* renamed from: b */
    private static String m22842b(int i, int i2, String str) {
        if (i < 0) {
            return C6385k.m22814a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C6385k.m22814a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    /* renamed from: c */
    private static String m22841c(int i, int i2, int i3) {
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                return C6385k.m22814a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            return m22842b(i2, i3, "end index");
        }
        return m22842b(i, i3, "start index");
    }

    /* renamed from: d */
    public static void m22840d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m22839e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m22838f(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(C6385k.m22814a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: g */
    public static void m22837g(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C6385k.m22814a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: h */
    public static int m22836h(int i, int i2) {
        return m22835i(i, i2, "index");
    }

    /* renamed from: i */
    public static int m22835i(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(m22843a(i, i2, str));
        }
        return i;
    }

    /* renamed from: j */
    public static <T> T m22834j(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: k */
    public static <T> T m22833k(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static int m22832l(int i, int i2) {
        return m22831m(i, i2, "index");
    }

    /* renamed from: m */
    public static int m22831m(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m22842b(i, i2, str));
        }
        return i;
    }

    /* renamed from: n */
    public static void m22830n(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m22841c(i, i2, i3));
        }
    }

    /* renamed from: o */
    public static void m22829o(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public static void m22828p(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}