package p351t9;

/* renamed from: t9.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12617m {
    /* renamed from: a */
    public static int m4714a(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m4713b(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: b */
    private static String m4713b(int i, int i2, String str) {
        if (i < 0) {
            return C12623s.m4701a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C12623s.m4701a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
