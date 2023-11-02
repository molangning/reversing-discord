package p007a6;

import android.util.Log;

/* renamed from: a6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0030a {
    /* renamed from: a */
    public static void m41372a(String str, String str2, Object obj) {
        Log.d(m41369d(str), String.format(str2, obj));
    }

    /* renamed from: b */
    public static void m41371b(String str, String str2, Object... objArr) {
        Log.d(m41369d(str), String.format(str2, objArr));
    }

    /* renamed from: c */
    public static void m41370c(String str, String str2, Throwable th2) {
        Log.e(m41369d(str), str2, th2);
    }

    /* renamed from: d */
    private static String m41369d(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: e */
    public static void m41368e(String str, String str2) {
        Log.i(m41369d(str), str2);
    }

    /* renamed from: f */
    public static void m41367f(String str, String str2, Object obj) {
        Log.w(m41369d(str), String.format(str2, obj));
    }
}
