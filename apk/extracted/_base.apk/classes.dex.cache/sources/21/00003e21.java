package p195k8;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: k8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9149a {
    @Pure
    /* renamed from: a */
    public static void m16452a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* renamed from: b */
    public static void m16451b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    /* renamed from: c */
    public static int m16450c(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: d */
    public static String m16449d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: e */
    public static <T> T m16448e(T t) {
        t.getClass();
        return t;
    }

    @Pure
    /* renamed from: f */
    public static void m16447f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    /* renamed from: g */
    public static void m16446g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: h */
    public static <T> T m16445h(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: i */
    public static <T> T m16444i(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}