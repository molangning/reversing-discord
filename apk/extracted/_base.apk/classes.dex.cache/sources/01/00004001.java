package kotlin.jvm.internal;

import java.util.Arrays;
import pf.C11569i0;
import pf.C11570j;

/* renamed from: kotlin.jvm.internal.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9612q {
    private C9612q() {
    }

    /* renamed from: a */
    public static boolean m13924a(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m13923b(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    /* renamed from: c */
    public static boolean m13922c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static void m13921d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m13911n(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: e */
    public static void m13920e(Object obj) {
        if (obj == null) {
            m13908q();
        }
    }

    /* renamed from: f */
    public static void m13919f(Object obj, String str) {
        if (obj == null) {
            m13907r(str);
        }
    }

    /* renamed from: g */
    public static void m13918g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m13911n(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: h */
    public static void m13917h(Object obj, String str) {
        if (obj == null) {
            m13904u(str);
        }
    }

    /* renamed from: i */
    public static void m13916i(Object obj, String str) {
        if (obj == null) {
            m13905t(str);
        }
    }

    /* renamed from: j */
    public static int m13915j(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: k */
    public static int m13914k(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: l */
    private static String m13913l(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C9612q.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: m */
    public static void m13912m(int i, String str) {
        m13903v();
    }

    /* renamed from: n */
    private static <T extends Throwable> T m13911n(T t) {
        return (T) m13910o(t, C9612q.class.getName());
    }

    /* renamed from: o */
    public static <T extends Throwable> T m13910o(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: p */
    public static String m13909p(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: q */
    public static void m13908q() {
        throw ((NullPointerException) m13911n(new NullPointerException()));
    }

    /* renamed from: r */
    public static void m13907r(String str) {
        throw ((NullPointerException) m13911n(new NullPointerException(str)));
    }

    /* renamed from: s */
    public static void m13906s() {
        throw ((C11570j) m13911n(new C11570j()));
    }

    /* renamed from: t */
    private static void m13905t(String str) {
        throw ((IllegalArgumentException) m13911n(new IllegalArgumentException(m13913l(str))));
    }

    /* renamed from: u */
    private static void m13904u(String str) {
        throw ((NullPointerException) m13911n(new NullPointerException(m13913l(str))));
    }

    /* renamed from: v */
    public static void m13903v() {
        m13902w("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: w */
    public static void m13902w(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: x */
    public static void m13901x(String str) {
        throw ((C11569i0) m13911n(new C11569i0(str)));
    }

    /* renamed from: y */
    public static void m13900y(String str) {
        m13901x("lateinit property " + str + " has not been initialized");
    }
}