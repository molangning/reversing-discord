package p468zg;

import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import p287pi.C11644a;
import ph.C11632b;
import ph.C11633c;

/* renamed from: zg.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14206a0 {

    /* renamed from: a */
    public static final C14206a0 f36519a = new C14206a0();

    /* renamed from: b */
    public static final C11633c f36520b;

    /* renamed from: c */
    public static final C11632b f36521c;

    /* renamed from: d */
    private static final C11632b f36522d;

    /* renamed from: e */
    private static final C11632b f36523e;

    static {
        C11633c c11633c = new C11633c("kotlin.jvm.JvmField");
        f36520b = c11633c;
        C11632b m7460m = C11632b.m7460m(c11633c);
        C9612q.m13918g(m7460m, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        f36521c = m7460m;
        C11632b m7460m2 = C11632b.m7460m(new C11633c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        C9612q.m13918g(m7460m2, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        f36522d = m7460m2;
        C11632b m7468e = C11632b.m7468e("kotlin/jvm/internal/RepeatableContainer");
        C9612q.m13918g(m7468e, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        f36523e = m7468e;
    }

    private C14206a0() {
    }

    /* renamed from: b */
    public static final String m450b(String propertyName) {
        C9612q.m13917h(propertyName, "propertyName");
        if (!m446f(propertyName)) {
            return "get" + C11644a.m7380a(propertyName);
        }
        return propertyName;
    }

    /* renamed from: c */
    public static final boolean m449c(String name) {
        boolean m13758H;
        boolean m13758H2;
        C9612q.m13917h(name, "name");
        m13758H = C9653o.m13758H(name, "get", false, 2, null);
        if (!m13758H) {
            m13758H2 = C9653o.m13758H(name, "is", false, 2, null);
            if (!m13758H2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m448d(String name) {
        boolean m13758H;
        C9612q.m13917h(name, "name");
        m13758H = C9653o.m13758H(name, "set", false, 2, null);
        return m13758H;
    }

    /* renamed from: e */
    public static final String m447e(String propertyName) {
        String m7380a;
        C9612q.m13917h(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (m446f(propertyName)) {
            m7380a = propertyName.substring(2);
            C9612q.m13918g(m7380a, "this as java.lang.String).substring(startIndex)");
        } else {
            m7380a = C11644a.m7380a(propertyName);
        }
        sb2.append(m7380a);
        return sb2.toString();
    }

    /* renamed from: f */
    public static final boolean m446f(String name) {
        boolean m13758H;
        C9612q.m13917h(name, "name");
        m13758H = C9653o.m13758H(name, "is", false, 2, null);
        if (!m13758H || name.length() == 2) {
            return false;
        }
        char charAt = name.charAt(2);
        if (C9612q.m13915j(97, charAt) <= 0 && C9612q.m13915j(charAt, 122) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C11632b m451a() {
        return f36523e;
    }
}