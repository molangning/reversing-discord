package ph;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;

/* renamed from: ph.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11636e {

    /* renamed from: ph.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C11637a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30212a;

        static {
            int[] iArr = new int[EnumC11643k.values().length];
            try {
                iArr[EnumC11643k.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11643k.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11643k.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30212a = iArr;
        }
    }

    /* renamed from: a */
    public static final <V> V m7434a(C11633c c11633c, Map<C11633c, ? extends V> values) {
        Object next;
        C9612q.m13917h(c11633c, "<this>");
        C9612q.m13917h(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<C11633c, ? extends V>> it = values.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<C11633c, ? extends V> next2 = it.next();
            C11633c key = next2.getKey();
            if (!C9612q.m13922c(c11633c, key) && !m7433b(c11633c, key)) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(next2.getKey(), next2.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int length = m7428g((C11633c) ((Map.Entry) next).getKey(), c11633c).m7458b().length();
                do {
                    Object next3 = it2.next();
                    int length2 = m7428g((C11633c) ((Map.Entry) next3).getKey(), c11633c).m7458b().length();
                    if (length > length2) {
                        next = next3;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (V) entry.getValue();
    }

    /* renamed from: b */
    public static final boolean m7433b(C11633c c11633c, C11633c packageName) {
        C9612q.m13917h(c11633c, "<this>");
        C9612q.m13917h(packageName, "packageName");
        return C9612q.m13922c(m7429f(c11633c), packageName);
    }

    /* renamed from: c */
    private static final boolean m7432c(String str, String str2) {
        boolean m13758H;
        m13758H = C9653o.m13758H(str, str2, false, 2, null);
        return m13758H && str.charAt(str2.length()) == '.';
    }

    /* renamed from: d */
    public static final boolean m7431d(C11633c c11633c, C11633c packageName) {
        C9612q.m13917h(c11633c, "<this>");
        C9612q.m13917h(packageName, "packageName");
        if (C9612q.m13922c(c11633c, packageName) || packageName.m7456d()) {
            return true;
        }
        String m7458b = c11633c.m7458b();
        C9612q.m13918g(m7458b, "this.asString()");
        String m7458b2 = packageName.m7458b();
        C9612q.m13918g(m7458b2, "packageName.asString()");
        return m7432c(m7458b, m7458b2);
    }

    /* renamed from: e */
    public static final boolean m7430e(String str) {
        if (str == null) {
            return false;
        }
        EnumC11643k enumC11643k = EnumC11643k.BEGINNING;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            int i2 = C11637a.f30212a[enumC11643k.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    continue;
                } else if (charAt == '.') {
                    enumC11643k = EnumC11643k.AFTER_DOT;
                } else if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            } else {
                enumC11643k = EnumC11643k.MIDDLE;
            }
        }
        if (enumC11643k == EnumC11643k.AFTER_DOT) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final C11633c m7429f(C11633c c11633c) {
        C9612q.m13917h(c11633c, "<this>");
        if (c11633c.m7456d()) {
            return null;
        }
        return c11633c.m7455e();
    }

    /* renamed from: g */
    public static final C11633c m7428g(C11633c c11633c, C11633c prefix) {
        C9612q.m13917h(c11633c, "<this>");
        C9612q.m13917h(prefix, "prefix");
        if (m7431d(c11633c, prefix) && !prefix.m7456d()) {
            if (C9612q.m13922c(c11633c, prefix)) {
                C11633c ROOT = C11633c.f30202c;
                C9612q.m13918g(ROOT, "ROOT");
                return ROOT;
            }
            String m7458b = c11633c.m7458b();
            C9612q.m13918g(m7458b, "asString()");
            String substring = m7458b.substring(prefix.m7458b().length() + 1);
            C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
            return new C11633c(substring);
        }
        return c11633c;
    }
}
