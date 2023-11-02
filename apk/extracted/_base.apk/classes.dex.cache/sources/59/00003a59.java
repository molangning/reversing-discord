package io.sentry.util;

/* renamed from: io.sentry.util.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8232r {
    /* renamed from: a */
    public static boolean m18164a(Double d) {
        return m18163b(d, true);
    }

    /* renamed from: b */
    private static boolean m18163b(Double d, boolean z) {
        return d == null ? z : !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    /* renamed from: c */
    public static boolean m18162c(Double d) {
        return m18163b(d, true);
    }

    /* renamed from: d */
    public static boolean m18161d(Double d) {
        return m18160e(d, true);
    }

    /* renamed from: e */
    public static boolean m18160e(Double d, boolean z) {
        return m18163b(d, z);
    }
}