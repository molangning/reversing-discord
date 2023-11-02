package io.sentry.util;

/* renamed from: io.sentry.util.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8231q {

    /* renamed from: a */
    private static boolean f22152a;

    /* renamed from: b */
    static boolean f22153b;

    static {
        boolean z;
        try {
            f22152a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f22152a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                if (Double.valueOf(property).doubleValue() >= 9.0d) {
                    z = true;
                } else {
                    z = false;
                }
                f22153b = z;
                return;
            }
            f22153b = false;
        } catch (Throwable unused2) {
            f22153b = false;
        }
    }

    /* renamed from: a */
    public static boolean m18166a() {
        return f22153b;
    }

    /* renamed from: b */
    public static boolean m18165b() {
        return !f22152a;
    }
}
