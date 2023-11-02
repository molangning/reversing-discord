package p310r0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: r0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C12013a {

    /* renamed from: a */
    private static long f31010a;

    /* renamed from: b */
    private static Method f31011b;

    /* renamed from: c */
    private static Method f31012c;

    /* renamed from: d */
    private static Method f31013d;

    /* renamed from: e */
    private static Method f31014e;

    /* renamed from: a */
    public static void m6606a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C12019g.m6589a(str, i);
        } else {
            m6605b(str, i);
        }
    }

    /* renamed from: b */
    private static void m6605b(String str, int i) {
        try {
            if (f31012c == null) {
                f31012c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f31012c.invoke(null, Long.valueOf(f31010a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m6600g("asyncTraceBegin", e);
        }
    }

    /* renamed from: c */
    public static void m6604c(String str) {
        C12014b.m6595a(str);
    }

    /* renamed from: d */
    public static void m6603d(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C12019g.m6588b(str, i);
        } else {
            m6602e(str, i);
        }
    }

    /* renamed from: e */
    private static void m6602e(String str, int i) {
        try {
            if (f31013d == null) {
                f31013d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f31013d.invoke(null, Long.valueOf(f31010a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m6600g("asyncTraceEnd", e);
        }
    }

    /* renamed from: f */
    public static void m6601f() {
        C12014b.m6594b();
    }

    /* renamed from: g */
    private static void m6600g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* renamed from: h */
    public static boolean m6599h() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C12019g.m6587c();
        }
        return m6598i();
    }

    /* renamed from: i */
    private static boolean m6598i() {
        try {
            if (f31011b == null) {
                f31010a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f31011b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f31011b.invoke(null, Long.valueOf(f31010a))).booleanValue();
        } catch (Exception e) {
            m6600g("isTagEnabled", e);
            return false;
        }
    }

    /* renamed from: j */
    public static void m6597j(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C12019g.m6586d(str, i);
        } else {
            m6596k(str, i);
        }
    }

    /* renamed from: k */
    private static void m6596k(String str, int i) {
        try {
            if (f31014e == null) {
                f31014e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f31014e.invoke(null, Long.valueOf(f31010a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m6600g("traceCounter", e);
        }
    }
}