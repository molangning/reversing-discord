package p102fb;

/* renamed from: fb.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6368b {
    /* renamed from: a */
    public static boolean m22854a(CharSequence charSequence, CharSequence charSequence2) {
        int m22853b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((m22853b = m22853b(charAt)) >= 26 || m22853b != m22853b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m22853b(char c) {
        return (char) ((c | ' ') - 97);
    }
}
