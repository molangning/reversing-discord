package p080e8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p151i6.C7402m;
import p195k8.C9191p0;
import p195k8.C9208y;

/* renamed from: e8.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6183i {

    /* renamed from: a */
    private static final Pattern f17499a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static Matcher m23328a(C9208y c9208y) {
        String m16082p;
        while (true) {
            String m16082p2 = c9208y.m16082p();
            if (m16082p2 != null) {
                if (f17499a.matcher(m16082p2).matches()) {
                    do {
                        m16082p = c9208y.m16082p();
                        if (m16082p != null) {
                        }
                    } while (!m16082p.isEmpty());
                } else {
                    Matcher matcher = C6175f.f17473a.matcher(m16082p2);
                    if (matcher.matches()) {
                        return matcher;
                    }
                }
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static boolean m23327b(C9208y c9208y) {
        String m16082p = c9208y.m16082p();
        if (m16082p != null && m16082p.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static float m23326c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: d */
    public static long m23325d(String str) {
        String[] m16284O0 = C9191p0.m16284O0(str, "\\.");
        long j = 0;
        for (String str2 : C9191p0.m16286N0(m16284O0[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (m16284O0.length == 2) {
            j2 += Long.parseLong(m16284O0[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: e */
    public static void m23324e(C9208y c9208y) {
        int m16093e = c9208y.m16093e();
        if (m23327b(c9208y)) {
            return;
        }
        c9208y.m16099P(m16093e);
        throw new C7402m("Expected WEBVTT. Got " + c9208y.m16082p());
    }
}