package p468zg;

import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import p287pi.C11644a;
import ph.C11638f;

/* renamed from: zg.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14221f0 {
    /* renamed from: a */
    public static final List<C11638f> m399a(C11638f name) {
        List<C11638f> m14100m;
        C9612q.m13917h(name, "name");
        String m7426b = name.m7426b();
        C9612q.m13918g(m7426b, "name.asString()");
        if (C14206a0.m449c(m7426b)) {
            m14100m = C9545j.m14100m(m398b(name));
            return m14100m;
        } else if (C14206a0.m448d(m7426b)) {
            return m394f(name);
        } else {
            return C14222g.f36589a.m392b(name);
        }
    }

    /* renamed from: b */
    public static final C11638f m398b(C11638f methodName) {
        C9612q.m13917h(methodName, "methodName");
        C11638f m395e = m395e(methodName, "get", false, null, 12, null);
        if (m395e == null) {
            return m395e(methodName, "is", false, null, 8, null);
        }
        return m395e;
    }

    /* renamed from: c */
    public static final C11638f m397c(C11638f methodName, boolean z) {
        String str;
        C9612q.m13917h(methodName, "methodName");
        if (z) {
            str = "is";
        } else {
            str = null;
        }
        return m395e(methodName, "set", false, str, 4, null);
    }

    /* renamed from: d */
    private static final C11638f m396d(C11638f c11638f, String str, boolean z, String str2) {
        boolean m13758H;
        String m13692p0;
        String m13692p02;
        if (c11638f.m7421g()) {
            return null;
        }
        String m7424d = c11638f.m7424d();
        C9612q.m13918g(m7424d, "methodName.identifier");
        boolean z2 = false;
        m13758H = C9653o.m13758H(m7424d, str, false, 2, null);
        if (!m13758H || m7424d.length() == str.length()) {
            return null;
        }
        char charAt = m7424d.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            m13692p02 = C9654p.m13692p0(m7424d, str);
            sb2.append(m13692p02);
            return C11638f.m7422f(sb2.toString());
        } else if (!z) {
            return c11638f;
        } else {
            m13692p0 = C9654p.m13692p0(m7424d, str);
            String m7378c = C11644a.m7378c(m13692p0, true);
            if (!C11638f.m7420h(m7378c)) {
                return null;
            }
            return C11638f.m7422f(m7378c);
        }
    }

    /* renamed from: e */
    static /* synthetic */ C11638f m395e(C11638f c11638f, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return m396d(c11638f, str, z, str2);
    }

    /* renamed from: f */
    public static final List<C11638f> m394f(C11638f methodName) {
        List<C11638f> m14099n;
        C9612q.m13917h(methodName, "methodName");
        m14099n = C9545j.m14099n(m397c(methodName, false), m397c(methodName, true));
        return m14099n;
    }
}