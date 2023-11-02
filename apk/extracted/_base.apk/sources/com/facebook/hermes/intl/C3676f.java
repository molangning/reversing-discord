package com.facebook.hermes.intl;

import com.facebook.hermes.intl.C3673e;
import com.facebook.hermes.intl.C3683k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
import p128h4.C6947l;
import p128h4.C6962o;

/* renamed from: com.facebook.hermes.intl.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3676f {
    /* renamed from: a */
    private static void m31289a(String str, C3683k.C3684a c3684a) {
        ArrayList<String> arrayList = c3684a.f10243d;
        if (arrayList != null) {
            int binarySearch = Collections.binarySearch(arrayList, str);
            if (binarySearch < 0) {
                c3684a.f10243d.add((binarySearch * (-1)) - 1, str);
                return;
            }
            throw new C6947l("Duplicate variant");
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        c3684a.f10243d = arrayList2;
        arrayList2.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m31288b(String str) {
        return C6962o.m21603b(str).mo21545g();
    }

    /* renamed from: c */
    static boolean m31287c(CharSequence charSequence, C3673e c3673e, C3673e.C3674a c3674a, boolean z, C3683k c3683k) {
        if (z && c3674a.m31301d()) {
            m31280j(charSequence, c3673e, c3674a, c3683k);
            return true;
        } else if (!c3674a.m31304a()) {
            return false;
        } else {
            if (!z) {
                m31286d(charSequence, c3674a, c3673e, c3683k);
                return true;
            }
            throw new C6947l(String.format("Extension singletons in transformed extension language tag: %s", charSequence));
        }
    }

    /* renamed from: d */
    static void m31286d(CharSequence charSequence, C3673e.C3674a c3674a, C3673e c3673e, C3683k c3683k) {
        if (c3673e.m31307a()) {
            char charAt = c3674a.toString().charAt(0);
            if (charAt == 'u') {
                m31278l(charSequence, c3673e, c3683k);
                return;
            } else if (charAt == 't') {
                m31279k(charSequence, c3673e, c3683k);
                return;
            } else if (charAt == 'x') {
                m31281i(charSequence, c3673e, c3683k);
                return;
            } else {
                m31282h(charSequence, c3673e, c3683k, charAt);
                return;
            }
        }
        throw new C6947l("Extension sequence expected.");
    }

    /* renamed from: e */
    static void m31285e(CharSequence charSequence, C3673e c3673e, C3673e.C3674a c3674a, boolean z, C3683k c3683k) {
        C3683k.C3684a c3684a = new C3683k.C3684a();
        if (z) {
            c3683k.f10236d = c3684a;
        } else {
            c3683k.f10233a = c3684a;
        }
        try {
            if (c3674a.m31296i()) {
                c3684a.f10240a = c3674a.m31292m();
                if (!c3673e.m31307a()) {
                    return;
                }
                C3673e.C3674a m31305c = c3673e.m31305c();
                if (m31287c(charSequence, c3673e, m31305c, z, c3683k)) {
                    return;
                }
                if (m31305c.m31294k()) {
                    c3684a.f10241b = m31305c.m31291n();
                    if (!c3673e.m31307a()) {
                        return;
                    }
                    m31305c = c3673e.m31305c();
                }
                if (m31305c.m31295j()) {
                    c3684a.f10242c = m31305c.m31290o();
                    if (!c3673e.m31307a()) {
                        return;
                    }
                    m31305c = c3673e.m31305c();
                }
                while (!m31287c(charSequence, c3673e, m31305c, z, c3683k)) {
                    if (m31305c.m31293l()) {
                        m31289a(m31305c.toString(), c3684a);
                        if (!c3673e.m31307a()) {
                            return;
                        }
                        m31305c = c3673e.m31305c();
                    } else {
                        throw new C6947l(String.format("Unknown token [%s] found in locale id: %s", m31305c.toString(), charSequence));
                    }
                }
                return;
            }
            throw new C6947l(String.format("Language subtag expected at %s: %s", c3674a.toString(), charSequence));
        } catch (C3673e.C3675b unused) {
            throw new C6947l(String.format("Locale Identifier subtag iteration failed: %s", charSequence));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C3683k m31284f(String str) {
        int binarySearch;
        String[] strArr = C3672d.f10199a;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str.toString())) >= 0) {
            str = C3672d.f10200b[binarySearch];
        }
        String lowerCase = str.toLowerCase();
        return m31283g(lowerCase, new C3673e(lowerCase));
    }

    /* renamed from: g */
    static C3683k m31283g(String str, C3673e c3673e) {
        C3683k c3683k = new C3683k();
        try {
            if (c3673e.m31307a()) {
                m31285e(str, c3673e, c3673e.m31305c(), false, c3683k);
                return c3683k;
            }
            throw new C6947l(String.format("Language subtag not found: %s", str));
        } catch (C3673e.C3675b unused) {
            throw new C6947l(String.format("Locale Identifier subtag iteration failed: %s", str));
        }
    }

    /* renamed from: h */
    static void m31282h(CharSequence charSequence, C3673e c3673e, C3683k c3683k, char c) {
        if (c3673e.m31307a()) {
            C3673e.C3674a m31305c = c3673e.m31305c();
            if (c3683k.f10238f == null) {
                c3683k.f10238f = new TreeMap<>();
            }
            ArrayList<String> arrayList = new ArrayList<>();
            c3683k.f10238f.put(new Character(c), arrayList);
            while (m31305c.m31303b()) {
                arrayList.add(m31305c.toString());
                if (!c3673e.m31307a()) {
                    return;
                }
                m31305c = c3673e.m31305c();
            }
            if (m31305c.m31304a()) {
                m31286d(charSequence, m31305c, c3673e, c3683k);
                return;
            }
            throw new C6947l("Malformed sequence expected.");
        }
        throw new C6947l("Extension sequence expected.");
    }

    /* renamed from: i */
    static void m31281i(CharSequence charSequence, C3673e c3673e, C3683k c3683k) {
        if (c3673e.m31307a()) {
            C3673e.C3674a m31305c = c3673e.m31305c();
            if (c3683k.f10239g == null) {
                c3683k.f10239g = new ArrayList<>();
            }
            while (m31305c.m31302c()) {
                c3683k.f10239g.add(m31305c.toString());
                if (!c3673e.m31307a()) {
                    return;
                }
                m31305c = c3673e.m31305c();
            }
            throw new C6947l("Tokens are not expected after pu extension.");
        }
        throw new C6947l("Extension sequence expected.");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m31280j(java.lang.CharSequence r4, com.facebook.hermes.intl.C3673e r5, com.facebook.hermes.intl.C3673e.C3674a r6, com.facebook.hermes.intl.C3683k r7) {
        /*
            boolean r0 = r6.m31301d()
            if (r0 == 0) goto L6d
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r7.f10237e
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L5d
            if (r0 != 0) goto L15
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r7.f10237e = r0
        L15:
            java.lang.String r6 = r6.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r3 = r7.f10237e
            r3.put(r6, r0)
            boolean r6 = r5.m31307a()
            if (r6 == 0) goto L4d
            com.facebook.hermes.intl.e$a r6 = r5.m31305c()
        L2d:
            boolean r3 = r6.m31300e()
            if (r3 == 0) goto L46
            java.lang.String r6 = r6.toString()
            r0.add(r6)
            boolean r6 = r5.m31307a()
            if (r6 != 0) goto L41
            return
        L41:
            com.facebook.hermes.intl.e$a r6 = r5.m31305c()
            goto L2d
        L46:
            boolean r0 = r6.m31301d()
            if (r0 != 0) goto L15
            goto L6d
        L4d:
            h4.l r5 = new h4.l
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            java.lang.String r4 = "Malformated transformed key in : %s"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            r5.<init>(r4)
            throw r5
        L5d:
            h4.l r5 = new h4.l
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            java.lang.String r4 = "Duplicate transformed extension sequence in [%s]"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            r5.<init>(r4)
            throw r5
        L6d:
            boolean r0 = r6.m31304a()
            if (r0 == 0) goto L77
            m31286d(r4, r6, r5, r7)
            return
        L77:
            h4.l r4 = new h4.l
            java.lang.String r5 = "Malformed extension sequence."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C3676f.m31280j(java.lang.CharSequence, com.facebook.hermes.intl.e, com.facebook.hermes.intl.e$a, com.facebook.hermes.intl.k):void");
    }

    /* renamed from: k */
    static void m31279k(CharSequence charSequence, C3673e c3673e, C3683k c3683k) {
        if (c3673e.m31307a()) {
            C3673e.C3674a m31305c = c3673e.m31305c();
            if (m31305c.m31296i()) {
                m31285e(charSequence, c3673e, m31305c, true, c3683k);
                return;
            } else if (m31305c.m31301d()) {
                m31280j(charSequence, c3673e, m31305c, c3683k);
                return;
            } else {
                throw new C6947l(String.format("Unexpected token [%s] in transformed extension sequence [%s]", m31305c.toString(), charSequence));
            }
        }
        throw new C6947l("Extension sequence expected.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m31278l(java.lang.CharSequence r3, com.facebook.hermes.intl.C3673e r4, com.facebook.hermes.intl.C3683k r5) {
        /*
            boolean r0 = r4.m31307a()
            if (r0 == 0) goto La5
            com.facebook.hermes.intl.e$a r0 = r4.m31305c()
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f10234b
            if (r1 != 0) goto L93
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r1 = r5.f10235c
            if (r1 != 0) goto L93
        L12:
            boolean r1 = r0.m31299f()
            if (r1 == 0) goto L38
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f10234b
            if (r1 != 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f10234b = r1
        L23:
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f10234b
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            boolean r0 = r4.m31307a()
            if (r0 != 0) goto L33
            return
        L33:
            com.facebook.hermes.intl.e$a r0 = r4.m31305c()
            goto L12
        L38:
            boolean r1 = r0.m31298g()
            if (r1 == 0) goto L81
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r1 = r5.f10235c
            if (r1 != 0) goto L49
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r5.f10235c = r1
        L49:
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r2 = r5.f10235c
            r2.put(r0, r1)
            boolean r0 = r4.m31307a()
            if (r0 != 0) goto L5e
            return
        L5e:
            com.facebook.hermes.intl.e$a r0 = r4.m31305c()
        L62:
            boolean r2 = r0.m31297h()
            if (r2 == 0) goto L7b
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            boolean r0 = r4.m31307a()
            if (r0 != 0) goto L76
            return
        L76:
            com.facebook.hermes.intl.e$a r0 = r4.m31305c()
            goto L62
        L7b:
            boolean r1 = r0.m31298g()
            if (r1 != 0) goto L49
        L81:
            boolean r1 = r0.m31304a()
            if (r1 == 0) goto L8b
            m31286d(r3, r0, r4, r5)
            return
        L8b:
            h4.l r3 = new h4.l
            java.lang.String r4 = "Malformed sequence expected."
            r3.<init>(r4)
            throw r3
        L93:
            h4.l r4 = new h4.l
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r3
            java.lang.String r3 = "Duplicate unicode extension sequence in [%s]"
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r4.<init>(r3)
            throw r4
        La5:
            h4.l r3 = new h4.l
            java.lang.String r4 = "Extension sequence expected."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C3676f.m31278l(java.lang.CharSequence, com.facebook.hermes.intl.e, com.facebook.hermes.intl.k):void");
    }

    /* renamed from: m */
    public static void m31277m(StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        if (C3672d.f10201c == null) {
            return;
        }
        if (stringBuffer.length() == 2) {
            strArr = C3672d.f10201c;
            strArr2 = C3672d.f10202d;
            strArr3 = C3672d.f10205g;
            strArr4 = C3672d.f10206h;
            strArr5 = C3672d.f10207i;
            strArr6 = C3672d.f10208j;
        } else {
            strArr = C3672d.f10203e;
            strArr2 = C3672d.f10204f;
            strArr3 = C3672d.f10209k;
            strArr4 = C3672d.f10210l;
            strArr5 = C3672d.f10211m;
            strArr6 = C3672d.f10212n;
        }
        int binarySearch = Arrays.binarySearch(strArr, stringBuffer.toString());
        if (binarySearch >= 0) {
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append(strArr2[binarySearch]);
            return;
        }
        int binarySearch2 = Arrays.binarySearch(strArr3, stringBuffer.toString());
        if (binarySearch2 >= 0) {
            String str = strArr4[binarySearch2];
            String str2 = strArr5[binarySearch2];
            String str3 = strArr6[binarySearch2];
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append(str);
            if (stringBuffer2.length() == 0 && str2 != null) {
                stringBuffer2.append(str2);
            }
            if (stringBuffer3.length() == 0 && str3 != null) {
                stringBuffer3.append(str3);
            }
        }
    }

    /* renamed from: n */
    public static String m31276n(StringBuffer stringBuffer) {
        if (C3672d.f10213o == null) {
            return stringBuffer.toString();
        }
        if (stringBuffer.length() == 2) {
            int binarySearch = Arrays.binarySearch(C3672d.f10213o, stringBuffer.toString());
            if (binarySearch >= 0) {
                return C3672d.f10214p[binarySearch];
            }
            return stringBuffer.toString();
        }
        int binarySearch2 = Arrays.binarySearch(C3672d.f10215q, stringBuffer.toString());
        if (binarySearch2 >= 0) {
            return C3672d.f10216r[binarySearch2];
        }
        return stringBuffer.toString();
    }
}
