package io.sentry.util;

import java.util.Arrays;

/* renamed from: io.sentry.util.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8229o {
    /* renamed from: a */
    public static boolean m18171a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m18170b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static <T> T m18169c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }
}