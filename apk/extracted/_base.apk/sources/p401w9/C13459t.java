package p401w9;

/* renamed from: w9.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13459t {
    /* renamed from: a */
    public static int m2441a(int i, int i2, String str) {
        String m2436a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            m2436a = C13460u.m2436a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m2436a = C13460u.m2436a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m2436a);
    }

    /* renamed from: b */
    public static int m2440b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m2437e(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static Object m2439c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* renamed from: d */
    public static void m2438d(int i, int i2, int i3) {
        String m2437e;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m2437e = C13460u.m2436a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m2437e = m2437e(i2, i3, "end index");
            }
        } else {
            m2437e = m2437e(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m2437e);
    }

    /* renamed from: e */
    private static String m2437e(int i, int i2, String str) {
        if (i < 0) {
            return C13460u.m2436a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C13460u.m2436a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
