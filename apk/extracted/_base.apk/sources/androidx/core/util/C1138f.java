package androidx.core.util;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: androidx.core.util.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1138f {
    /* renamed from: a */
    public static void m37829a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m37828b(int i, int i2, int i3, String str) {
        if (i >= i2) {
            if (i <= i3) {
                return i;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    /* renamed from: c */
    public static int m37827c(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static int m37826d(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: e */
    public static int m37825e(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    /* renamed from: f */
    public static <T> T m37824f(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: g */
    public static <T> T m37823g(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: h */
    public static void m37822h(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: i */
    public static <T extends CharSequence> T m37821i(T t, Object obj) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
}
