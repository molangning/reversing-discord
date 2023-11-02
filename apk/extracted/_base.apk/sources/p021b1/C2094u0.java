package p021b1;

import android.net.UrlQuerySanitizer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b1.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2094u0 {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
        r1 = r7.toString();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p021b1.C2024c m34275a(android.net.Uri r7, long r8, p021b1.C2027d r10, p021b1.C2041h r11, p021b1.C2106x r12, p021b1.C2026c1 r13) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r7.toString()
            if (r1 == 0) goto L8c
            int r2 = r1.length()
            if (r2 != 0) goto L12
            goto L8c
        L12:
            r2 = 0
            r3 = 1
            java.lang.String r4 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r4)     // Catch: java.lang.Exception -> L1b java.lang.IllegalArgumentException -> L2e java.io.UnsupportedEncodingException -> L41
            goto L53
        L1b:
            r4 = move-exception
            b1.c0 r5 = p021b1.C2055l.m34422j()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed. Message: (%s)"
            r5.mo34444b(r4, r6)
            goto L53
        L2e:
            r4 = move-exception
            b1.c0 r5 = p021b1.C2055l.m34422j()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed due to IllegalArgumentException. Message: (%s)"
            r5.mo34444b(r4, r6)
            goto L53
        L41:
            r4 = move-exception
            b1.c0 r5 = p021b1.C2055l.m34422j()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed due to UnsupportedEncodingException. Message: (%s)"
            r5.mo34444b(r4, r6)
        L53:
            b1.c0 r4 = p021b1.C2055l.m34422j()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r1
            java.lang.String r2 = "Url to parse (%s)"
            r4.mo34439g(r2, r5)
            android.net.UrlQuerySanitizer r2 = new android.net.UrlQuerySanitizer
            r2.<init>()
            android.net.UrlQuerySanitizer$ValueSanitizer r4 = android.net.UrlQuerySanitizer.getAllButNulLegal()
            r2.setUnregisteredParameterValueSanitizer(r4)
            r2.setAllowUnregisteredParamaters(r3)
            r2.parseUrl(r1)
            java.util.List r1 = r2.getParameterList()
            b1.t0 r10 = m34271e(r1, r10, r11, r12, r13)
            if (r10 != 0) goto L7d
            return r0
        L7d:
            java.lang.String r7 = r7.toString()
            r10.f5840l = r7
            r10.f5835g = r8
            java.lang.String r7 = "deeplink"
            b1.c r7 = r10.m34311p(r7)
            return r7
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p021b1.C2094u0.m34275a(android.net.Uri, long, b1.d, b1.h, b1.x, b1.c1):b1.c");
    }

    /* renamed from: b */
    public static C2024c m34274b(C2107x0 c2107x0, String str, C2027d c2027d, C2041h c2041h, C2106x c2106x, C2026c1 c2026c1) {
        C2085t0 c2085t0 = new C2085t0(c2041h, c2106x, c2027d, c2026c1, System.currentTimeMillis());
        c2085t0.f5841m = c2107x0.f5936a;
        c2085t0.f5834f = c2107x0.f5937b;
        c2085t0.f5836h = c2107x0.f5938c;
        c2085t0.f5837i = c2107x0.f5939d;
        c2085t0.f5838j = c2107x0.f5940e;
        c2085t0.f5842n = c2107x0.f5941f;
        c2085t0.f5847s = c2107x0.f5942g;
        c2085t0.f5844p = str;
        return c2085t0.m34311p("install_referrer");
    }

    /* renamed from: c */
    public static C2024c m34273c(String str, String str2, C2027d c2027d, C2041h c2041h, C2106x c2106x, C2026c1 c2026c1) {
        if (str != null && str.length() != 0) {
            C2085t0 c2085t0 = new C2085t0(c2041h, c2106x, c2027d, c2026c1, System.currentTimeMillis());
            c2085t0.f5845q = str;
            c2085t0.f5846r = str2;
            return c2085t0.m34311p("preinstall");
        }
        return null;
    }

    /* renamed from: d */
    public static C2024c m34272d(String str, long j, C2027d c2027d, C2041h c2041h, C2106x c2106x, C2026c1 c2026c1) {
        String str2 = "malformed";
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            str2 = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C2055l.m34422j().mo34444b("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e.getMessage());
        } catch (IllegalArgumentException e2) {
            C2055l.m34422j().mo34444b("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e2.getMessage());
        } catch (Exception e3) {
            C2055l.m34422j().mo34444b("Referrer decoding failed. Message: (%s)", e3.getMessage());
        }
        C2055l.m34422j().mo34439g("Referrer to parse (%s)", str2);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(str2);
        C2085t0 m34271e = m34271e(urlQuerySanitizer.getParameterList(), c2027d, c2041h, c2106x, c2026c1);
        if (m34271e == null) {
            return null;
        }
        m34271e.f5841m = str2;
        m34271e.f5835g = j;
        m34271e.f5843o = str;
        return m34271e.m34311p("reftag");
    }

    /* renamed from: e */
    private static C2085t0 m34271e(List<UrlQuerySanitizer.ParameterValuePair> list, C2027d c2027d, C2041h c2041h, C2106x c2106x, C2026c1 c2026c1) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2036g c2036g = new C2036g();
        for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : list) {
            m34270f(parameterValuePair.mParameter, parameterValuePair.mValue, linkedHashMap, c2036g);
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = (String) linkedHashMap.remove("reftag");
        if (c2027d != null) {
            c2027d.f5602v = currentTimeMillis - c2027d.f5601u;
        }
        C2085t0 c2085t0 = new C2085t0(c2041h, c2106x, c2027d, c2026c1, currentTimeMillis);
        c2085t0.f5849u = linkedHashMap;
        c2085t0.f5848t = c2036g;
        c2085t0.f5839k = str;
        return c2085t0;
    }

    /* renamed from: f */
    private static boolean m34270f(String str, String str2, Map<String, String> map, C2036g c2036g) {
        if (str == null || str2 == null || !str.startsWith("adjust_")) {
            return false;
        }
        String substring = str.substring(7);
        if (substring.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (!m34269g(c2036g, substring, str2)) {
            map.put(substring, str2);
            return true;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m34269g(C2036g c2036g, String str, String str2) {
        if (str.equals("tracker")) {
            c2036g.f5625k = str2;
            return true;
        } else if (str.equals("campaign")) {
            c2036g.f5627m = str2;
            return true;
        } else if (str.equals("adgroup")) {
            c2036g.f5628n = str2;
            return true;
        } else if (str.equals("creative")) {
            c2036g.f5629o = str2;
            return true;
        } else {
            return false;
        }
    }
}
