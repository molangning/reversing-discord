package p195k8;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: k8.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9197r {

    /* renamed from: a */
    private static int f24198a = 0;

    /* renamed from: b */
    private static boolean f24199b = true;

    @Pure
    /* renamed from: a */
    private static String m16185a(String str, Throwable th2) {
        String m16181e = m16181e(th2);
        if (!TextUtils.isEmpty(m16181e)) {
            return str + "\n  " + m16181e.replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\n  ") + '\n';
        }
        return str;
    }

    @Pure
    /* renamed from: b */
    public static void m16184b(String str, String str2) {
        if (f24198a == 0) {
            Log.d(str, str2);
        }
    }

    @Pure
    /* renamed from: c */
    public static void m16183c(String str, String str2) {
        if (f24198a <= 3) {
            Log.e(str, str2);
        }
    }

    @Pure
    /* renamed from: d */
    public static void m16182d(String str, String str2, Throwable th2) {
        m16183c(str, m16185a(str2, th2));
    }

    @Pure
    /* renamed from: e */
    public static String m16181e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        if (m16179g(th2)) {
            return "UnknownHostException (no network)";
        }
        if (!f24199b) {
            return th2.getMessage();
        }
        return Log.getStackTraceString(th2).trim().replace("\t", "    ");
    }

    @Pure
    /* renamed from: f */
    public static void m16180f(String str, String str2) {
        if (f24198a <= 1) {
            Log.i(str, str2);
        }
    }

    @Pure
    /* renamed from: g */
    private static boolean m16179g(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    @Pure
    /* renamed from: h */
    public static void m16178h(String str, String str2) {
        if (f24198a <= 2) {
            Log.w(str, str2);
        }
    }

    @Pure
    /* renamed from: i */
    public static void m16177i(String str, String str2, Throwable th2) {
        m16178h(str, m16185a(str2, th2));
    }
}