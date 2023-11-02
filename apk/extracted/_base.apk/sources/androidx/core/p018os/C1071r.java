package androidx.core.p018os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.core.os.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1071r {

    /* renamed from: a */
    private static long f3406a;

    /* renamed from: b */
    private static Method f3407b;

    /* renamed from: c */
    private static Method f3408c;

    /* renamed from: d */
    private static Method f3409d;

    /* renamed from: e */
    private static Method f3410e;

    /* renamed from: androidx.core.os.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1072a {
        /* renamed from: a */
        static void m37957a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        static void m37956b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f3406a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f3407b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f3408c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f3409d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f3410e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m37959a(String str) {
        C1072a.m37957a(str);
    }

    /* renamed from: b */
    public static void m37958b() {
        C1072a.m37956b();
    }
}
