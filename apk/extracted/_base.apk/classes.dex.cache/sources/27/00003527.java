package p128h4;

import java.util.HashMap;
import java.util.Map;

/* renamed from: h4.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6935j {

    /* renamed from: a */
    private static Object f19184a = new C6937b();

    /* renamed from: b */
    private static Object f19185b = new C6936a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h4.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6936a {
        private C6936a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h4.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6937b {
        private C6937b() {
        }
    }

    /* renamed from: a */
    public static Object m21644a(Object obj, String str) {
        HashMap hashMap = (HashMap) obj;
        if (hashMap.containsKey(str)) {
            Object obj2 = hashMap.get(str);
            if (obj2 == null) {
                return m21643b();
            }
            return obj2;
        }
        return m21641d();
    }

    /* renamed from: b */
    public static Object m21643b() {
        return f19185b;
    }

    /* renamed from: c */
    public static void m21642c(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }

    /* renamed from: d */
    public static Object m21641d() {
        return f19184a;
    }

    /* renamed from: e */
    public static boolean m21640e(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: f */
    public static double m21639f(Object obj) {
        return ((Double) obj).doubleValue();
    }

    /* renamed from: g */
    public static Map<String, Object> m21638g(Object obj) {
        return (HashMap) obj;
    }

    /* renamed from: h */
    public static String m21637h(Object obj) {
        return (String) obj;
    }

    /* renamed from: i */
    public static boolean m21636i(Object obj) {
        return obj instanceof Boolean;
    }

    /* renamed from: j */
    public static boolean m21635j(Object obj) {
        return obj instanceof C6936a;
    }

    /* renamed from: k */
    public static boolean m21634k(Object obj) {
        return obj instanceof Double;
    }

    /* renamed from: l */
    public static boolean m21633l(Object obj) {
        return obj instanceof HashMap;
    }

    /* renamed from: m */
    public static boolean m21632m(Object obj) {
        return obj instanceof String;
    }

    /* renamed from: n */
    public static boolean m21631n(Object obj) {
        return obj instanceof C6937b;
    }

    /* renamed from: o */
    public static Object m21630o(boolean z) {
        return new Boolean(z);
    }

    /* renamed from: p */
    public static Object m21629p(double d) {
        return new Double(d);
    }

    /* renamed from: q */
    public static Object m21628q() {
        return new HashMap();
    }

    /* renamed from: r */
    public static Object m21627r(String str) {
        return str;
    }
}