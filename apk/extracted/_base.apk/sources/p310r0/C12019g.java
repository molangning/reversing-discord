package p310r0;

import android.os.Trace;

/* renamed from: r0.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C12019g {
    /* renamed from: a */
    public static void m6589a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    /* renamed from: b */
    public static void m6588b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    /* renamed from: c */
    public static boolean m6587c() {
        boolean isEnabled;
        isEnabled = Trace.isEnabled();
        return isEnabled;
    }

    /* renamed from: d */
    public static void m6586d(String str, int i) {
        Trace.setCounter(str, i);
    }
}
