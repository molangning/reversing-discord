package p021b1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: b1.w0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2105w0 {
    /* renamed from: a */
    public static String m34243a(Context context, String str, InterfaceC2025c0 interfaceC2025c0) {
        if (!C2043h1.m34488c0(context, "com.adjust.preinstall")) {
            return null;
        }
        return m34232l(context, C2043h1.m34474l("content://%s/%s", "com.adjust.preinstall", "trackers"), str, interfaceC2025c0);
    }

    /* renamed from: b */
    public static String m34242b(String str, String str2, InterfaceC2025c0 interfaceC2025c0) {
        String m34230n = m34230n("/data/local/tmp/adjust.preinstall", interfaceC2025c0);
        if (m34230n == null || m34230n.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                m34230n = m34230n(str2, interfaceC2025c0);
            }
            if (m34230n == null || m34230n.isEmpty()) {
                return null;
            }
        }
        return m34229o(m34230n, str, interfaceC2025c0);
    }

    /* renamed from: c */
    public static String m34241c(String str, InterfaceC2025c0 interfaceC2025c0) {
        return m34228p("adjust.preinstall." + str, interfaceC2025c0);
    }

    /* renamed from: d */
    public static String m34240d(String str, InterfaceC2025c0 interfaceC2025c0) {
        String m34230n;
        String m34228p = m34228p("adjust.preinstall.path", interfaceC2025c0);
        if (m34228p == null || m34228p.isEmpty() || (m34230n = m34230n(m34228p, interfaceC2025c0)) == null || m34230n.isEmpty()) {
            return null;
        }
        return m34229o(m34230n, str, interfaceC2025c0);
    }

    /* renamed from: e */
    public static String m34239e(String str, InterfaceC2025c0 interfaceC2025c0) {
        String m34230n;
        String m34227q = m34227q("adjust.preinstall.path", interfaceC2025c0);
        if (m34227q == null || m34227q.isEmpty() || (m34230n = m34230n(m34227q, interfaceC2025c0)) == null || m34230n.isEmpty()) {
            return null;
        }
        return m34229o(m34230n, str, interfaceC2025c0);
    }

    /* renamed from: f */
    public static String m34238f(String str, InterfaceC2025c0 interfaceC2025c0) {
        return m34227q("adjust.preinstall." + str, interfaceC2025c0);
    }

    /* renamed from: g */
    public static List<String> m34237g(Context context, String str, InterfaceC2025c0 interfaceC2025c0) {
        return m34231m(context, str, "android.permission.INSTALL_PACKAGES", interfaceC2025c0);
    }

    /* renamed from: h */
    public static List<String> m34236h(Context context, String str, InterfaceC2025c0 interfaceC2025c0) {
        return m34231m(context, str, null, interfaceC2025c0);
    }

    /* renamed from: i */
    public static boolean m34235i(long j) {
        return (j & 255) == 255;
    }

    /* renamed from: j */
    public static boolean m34234j(String str, long j) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1771852303:
                if (str.equals("content_provider_intent_action")) {
                    c = 0;
                    break;
                }
                break;
            case -1590804087:
                if (str.equals("system_properties_path_reflection")) {
                    c = 1;
                    break;
                }
                break;
            case -782042377:
                if (str.equals("content_provider")) {
                    c = 2;
                    break;
                }
                break;
            case -480091743:
                if (str.equals("system_properties_path")) {
                    c = 3;
                    break;
                }
                break;
            case -468656985:
                if (str.equals("system_properties_reflection")) {
                    c = 4;
                    break;
                }
                break;
            case -95318717:
                if (str.equals("system_properties")) {
                    c = 5;
                    break;
                }
                break;
            case 2055247442:
                if (str.equals("file_system")) {
                    c = 6;
                    break;
                }
                break;
            case 2080271301:
                if (str.equals("content_provider_no_permission")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return (j & 32) != 32;
            case 1:
                return (j & 8) != 8;
            case 2:
                return (j & 16) != 16;
            case 3:
                return (j & 4) != 4;
            case 4:
                return (j & 2) != 2;
            case 5:
                return (j & 1) != 1;
            case 6:
                return (j & 64) != 64;
            case 7:
                return (j & 128) != 128;
            default:
                return false;
        }
    }

    /* renamed from: k */
    public static long m34233k(String str, long j) {
        long j2;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1771852303:
                if (str.equals("content_provider_intent_action")) {
                    c = 0;
                    break;
                }
                break;
            case -1590804087:
                if (str.equals("system_properties_path_reflection")) {
                    c = 1;
                    break;
                }
                break;
            case -782042377:
                if (str.equals("content_provider")) {
                    c = 2;
                    break;
                }
                break;
            case -480091743:
                if (str.equals("system_properties_path")) {
                    c = 3;
                    break;
                }
                break;
            case -468656985:
                if (str.equals("system_properties_reflection")) {
                    c = 4;
                    break;
                }
                break;
            case -95318717:
                if (str.equals("system_properties")) {
                    c = 5;
                    break;
                }
                break;
            case 2055247442:
                if (str.equals("file_system")) {
                    c = 6;
                    break;
                }
                break;
            case 2080271301:
                if (str.equals("content_provider_no_permission")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                j2 = 32;
                break;
            case 1:
                j2 = 8;
                break;
            case 2:
                j2 = 16;
                break;
            case 3:
                j2 = 4;
                break;
            case 4:
                j2 = 2;
                break;
            case 5:
                j2 = 1;
                break;
            case 6:
                j2 = 64;
                break;
            case 7:
                j2 = 128;
                break;
            default:
                return j;
        }
        return j | j2;
    }

    /* renamed from: l */
    private static String m34232l(Context context, String str, String str2, InterfaceC2025c0 interfaceC2025c0) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse(str), new String[]{"encrypted_data"}, "package_name=?", new String[]{str2}, null);
            if (query == null) {
                interfaceC2025c0.mo34443c("Read content provider cursor null content uri [%s]", str);
                return null;
            } else if (!query.moveToFirst()) {
                interfaceC2025c0.mo34443c("Read content provider cursor empty content uri [%s]", str);
                query.close();
                return null;
            } else {
                String string = query.getString(0);
                query.close();
                return string;
            }
        } catch (Exception e) {
            interfaceC2025c0.mo34444b("Exception read content provider uri [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }

    /* renamed from: m */
    private static List<String> m34231m(Context context, String str, String str2, InterfaceC2025c0 interfaceC2025c0) {
        boolean z;
        String str3;
        String m34232l;
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.attribution.REFERRAL_PROVIDER"), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentContentProviders) {
            if (str2 != null && context.getPackageManager().checkPermission(str2, resolveInfo.providerInfo.packageName) != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z && (str3 = resolveInfo.providerInfo.authority) != null && !str3.isEmpty() && (m34232l = m34232l(context, C2043h1.m34474l("content://%s/%s", str3, "trackers"), str, interfaceC2025c0)) != null && !m34232l.isEmpty()) {
                arrayList.add(m34232l);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: n */
    private static String m34230n(String str, InterfaceC2025c0 interfaceC2025c0) {
        File file = new File(str);
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                int length = (int) file.length();
                if (length <= 0) {
                    interfaceC2025c0.mo34443c("Read file content empty file", new Object[0]);
                    return null;
                }
                byte[] bArr = new byte[length];
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    return new String(bArr);
                } catch (Exception e) {
                    interfaceC2025c0.mo34444b("Exception read file input stream error [%s]", e.getMessage());
                    fileInputStream.close();
                    return null;
                }
            } catch (Exception e2) {
                interfaceC2025c0.mo34444b("Exception read file content error [%s]", e2.getMessage());
            }
        }
        return null;
    }

    /* renamed from: o */
    private static String m34229o(String str, String str2, InterfaceC2025c0 interfaceC2025c0) {
        try {
            return new JSONObject(str.trim()).optString(str2);
        } catch (Exception e) {
            interfaceC2025c0.mo34444b("Exception read payload from json string error [%s]", e.getMessage());
            return null;
        }
    }

    /* renamed from: p */
    private static String m34228p(String str, InterfaceC2025c0 interfaceC2025c0) {
        try {
            return System.getProperty(str);
        } catch (Exception e) {
            interfaceC2025c0.mo34444b("Exception read system property key [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: q */
    private static String m34227q(String str, InterfaceC2025c0 interfaceC2025c0) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            interfaceC2025c0.mo34444b("Exception read system property using reflection key [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }
}
