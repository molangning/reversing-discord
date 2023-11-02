package sh;

import java.util.List;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import ph.C11634d;
import ph.C11638f;

/* renamed from: sh.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12527n {
    /* renamed from: a */
    public static final String m4935a(C11634d c11634d) {
        C9612q.m13917h(c11634d, "<this>");
        List<C11638f> m7441h = c11634d.m7441h();
        C9612q.m13918g(m7441h, "pathSegments()");
        return m4933c(m7441h);
    }

    /* renamed from: b */
    public static final String m4934b(C11638f c11638f) {
        C9612q.m13917h(c11638f, "<this>");
        if (m4931e(c11638f)) {
            StringBuilder sb2 = new StringBuilder();
            String m7426b = c11638f.m7426b();
            C9612q.m13918g(m7426b, "asString()");
            sb2.append('`' + m7426b);
            sb2.append('`');
            return sb2.toString();
        }
        String m7426b2 = c11638f.m7426b();
        C9612q.m13918g(m7426b2, "asString()");
        return m7426b2;
    }

    /* renamed from: c */
    public static final String m4933c(List<C11638f> pathSegments) {
        C9612q.m13917h(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (C11638f c11638f : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(m4934b(c11638f));
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: d */
    public static final String m4932d(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        boolean m13758H;
        boolean m13758H2;
        C9612q.m13917h(lowerRendered, "lowerRendered");
        C9612q.m13917h(lowerPrefix, "lowerPrefix");
        C9612q.m13917h(upperRendered, "upperRendered");
        C9612q.m13917h(upperPrefix, "upperPrefix");
        C9612q.m13917h(foldedPrefix, "foldedPrefix");
        m13758H = C9653o.m13758H(lowerRendered, lowerPrefix, false, 2, null);
        if (m13758H) {
            m13758H2 = C9653o.m13758H(upperRendered, upperPrefix, false, 2, null);
            if (m13758H2) {
                String substring = lowerRendered.substring(lowerPrefix.length());
                C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
                String substring2 = upperRendered.substring(upperPrefix.length());
                C9612q.m13918g(substring2, "this as java.lang.String).substring(startIndex)");
                String str = foldedPrefix + substring;
                if (C9612q.m13922c(substring, substring2)) {
                    return str;
                }
                if (m4930f(substring, substring2)) {
                    return str + '!';
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    private static final boolean m4931e(C11638f c11638f) {
        boolean z;
        boolean z2;
        String m7426b = c11638f.m7426b();
        C9612q.m13918g(m7426b, "asString()");
        if (C12520i.f32545a.contains(m7426b)) {
            return true;
        }
        int i = 0;
        while (true) {
            if (i < m7426b.length()) {
                char charAt = m7426b.charAt(i);
                if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r7 + '?', r8) == false) goto L7;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m4930f(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "lower"
            kotlin.jvm.internal.C9612q.m13917h(r7, r0)
            java.lang.String r0 = "upper"
            kotlin.jvm.internal.C9612q.m13917h(r8, r0)
            java.lang.String r2 = "?"
            java.lang.String r3 = ""
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            java.lang.String r0 = kotlin.text.C9642f.m13840D(r1, r2, r3, r4, r5, r6)
            boolean r0 = kotlin.jvm.internal.C9612q.m13922c(r7, r0)
            if (r0 != 0) goto L5a
            r0 = 2
            r1 = 0
            java.lang.String r2 = "?"
            r3 = 0
            boolean r0 = kotlin.text.C9642f.m13794s(r8, r2, r3, r0, r1)
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r1 = 63
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.C9612q.m13922c(r0, r8)
            if (r0 != 0) goto L5a
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.C9612q.m13922c(r7, r8)
            if (r7 == 0) goto L5b
        L5a:
            r3 = 1
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.C12527n.m4930f(java.lang.String, java.lang.String):boolean");
    }
}
