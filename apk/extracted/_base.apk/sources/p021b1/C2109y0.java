package p021b1;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: b1.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2109y0 {
    /* renamed from: a */
    public static Object m34197a(Class cls) {
        try {
            return cls.newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Object m34196b(String str) {
        Class m34194d = m34194d(str);
        if (m34194d == null) {
            return null;
        }
        return m34197a(m34194d);
    }

    /* renamed from: c */
    public static Object m34195c(String str, Class[] clsArr, Object... objArr) {
        try {
            return Class.forName(str).getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Class m34194d(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Object m34193e(Context context) {
        return m34187k("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Map<String, String> m34192f(Context context, InterfaceC2025c0 interfaceC2025c0) {
        try {
            Object m34187k = m34187k("com.adjust.sdk.imei.Util", "getImeiParameters", new Class[]{Context.class, InterfaceC2025c0.class}, context, interfaceC2025c0);
            if (m34187k != null && Map.class.isInstance(m34187k)) {
                return (Map) m34187k;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Map<String, String> m34191g(Context context, InterfaceC2025c0 interfaceC2025c0) {
        try {
            Object m34187k = m34187k("com.adjust.sdk.oaid.Util", "getOaidParameters", new Class[]{Context.class, InterfaceC2025c0.class}, context, interfaceC2025c0);
            if (m34187k != null && Map.class.isInstance(m34187k)) {
                return (Map) m34187k;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m34190h(Context context, Object obj) {
        try {
            return (String) m34189i(obj, "getId", null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Object m34189i(Object obj, String str, Class[] clsArr, Object... objArr) {
        return m34188j(obj.getClass(), str, obj, clsArr, objArr);
    }

    /* renamed from: j */
    public static Object m34188j(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) {
        Method method = cls.getMethod(str, clsArr);
        if (method == null) {
            return null;
        }
        return method.invoke(obj, objArr);
    }

    /* renamed from: k */
    public static Object m34187k(String str, String str2, Class[] clsArr, Object... objArr) {
        return m34188j(Class.forName(str), str2, null, clsArr, objArr);
    }

    /* renamed from: l */
    public static Boolean m34186l(Context context, Object obj) {
        try {
            boolean z = false;
            Boolean bool = (Boolean) m34189i(obj, "isLimitAdTrackingEnabled", null, new Object[0]);
            if (bool == null) {
                return null;
            }
            if (!bool.booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }
}
