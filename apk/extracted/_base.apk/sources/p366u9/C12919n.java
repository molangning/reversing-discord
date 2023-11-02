package p366u9;

/* renamed from: u9.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12919n {
    /* renamed from: a */
    public static int m3675a(int i, int i2) {
        String m3677b;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
            m3677b = C12917m.m3677b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m3677b = C12917m.m3677b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m3677b);
    }

    /* renamed from: b */
    public static <T> T m3674b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    private static String m3673c(int i, int i2, String str) {
        if (i < 0) {
            return C12917m.m3677b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C12917m.m3677b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: d */
    public static void m3672d(int i, int i2, int i3) {
        String m3673c;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m3673c = C12917m.m3677b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m3673c = m3673c(i2, i3, "end index");
            }
        } else {
            m3673c = m3673c(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m3673c);
    }

    /* renamed from: e */
    public static void m3671e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: f */
    public static void m3670f(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(C12917m.m3677b(str, Character.valueOf(c)));
        }
    }

    /* renamed from: g */
    public static int m3669g(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m3673c(i, i2, "index"));
        }
        return i;
    }
}
