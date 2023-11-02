package p058d5;

/* renamed from: d5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5743a {
    /* renamed from: a */
    public static void m24585a(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static void m24584b(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }

    /* renamed from: c */
    public static <T> T m24583c(T t) {
        if (t != null) {
            return t;
        }
        throw new AssertionError();
    }

    /* renamed from: d */
    public static <T> T m24582d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new AssertionError(str);
    }

    /* renamed from: e */
    public static <T> T m24581e(T t) {
        return t;
    }
}
