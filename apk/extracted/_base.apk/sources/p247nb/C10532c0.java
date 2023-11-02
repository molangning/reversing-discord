package p247nb;

/* renamed from: nb.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10532c0 {
    /* renamed from: a */
    public static void m11314a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m11313b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m11312c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m11311d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
