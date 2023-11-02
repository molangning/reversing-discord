package p029b9;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p119g9.C6593p;

/* renamed from: b9.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2198p {
    /* renamed from: a */
    public static void m33994a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m33993b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m33992c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m33991d(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 36 + String.valueOf(str).length());
            sb2.append("Must be called on ");
            sb2.append(name);
            sb2.append(" thread, but got ");
            sb2.append(str);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: e */
    public static void m33990e(String str) {
        if (C6593p.m22348a()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: f */
    public static String m33989f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: g */
    public static String m33988g(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: h */
    public static void m33987h() {
        m33986i("Must not be called on the main application thread");
    }

    /* renamed from: i */
    public static void m33986i(String str) {
        if (!C6593p.m22348a()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: j */
    public static <T> T m33985j(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: k */
    public static <T> T m33984k(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static void m33983l(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: m */
    public static void m33982m(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}