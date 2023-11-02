package p438y5;

/* renamed from: y5.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13909d {
    /* renamed from: a */
    public static <T> void m1221a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m1220b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m1219c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
