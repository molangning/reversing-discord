package p034c1;

import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* renamed from: c1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2384d {

    /* renamed from: a */
    private static String f6526a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c1.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2385a implements InterfaceC2387c {
        C2385a() {
        }

        @Override // p034c1.C2384d.InterfaceC2387c
        /* renamed from: a */
        public void mo33533a(HttpsURLConnection httpsURLConnection, String str) {
            httpsURLConnection.setRequestProperty("Client-SDK", str);
            httpsURLConnection.setConnectTimeout(60000);
            httpsURLConnection.setReadTimeout(60000);
            if (C2384d.f6526a != null) {
                httpsURLConnection.setRequestProperty("User-Agent", C2384d.f6526a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c1.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2386b implements InterfaceC2388d {
        C2386b() {
        }

        @Override // p034c1.C2384d.InterfaceC2388d
        /* renamed from: a */
        public HttpsURLConnection mo33532a(URL url) {
            return (HttpsURLConnection) url.openConnection();
        }
    }

    /* renamed from: c1.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC2387c {
        /* renamed from: a */
        void mo33533a(HttpsURLConnection httpsURLConnection, String str);
    }

    /* renamed from: c1.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC2388d {
        /* renamed from: a */
        HttpsURLConnection mo33532a(URL url);
    }

    /* renamed from: b */
    public static InterfaceC2387c m33538b() {
        return new C2385a();
    }

    /* renamed from: c */
    public static InterfaceC2388d m33537c() {
        return new C2386b();
    }

    /* renamed from: d */
    public static Long m33536d(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof Long) {
            return (Long) opt;
        }
        if (opt instanceof Number) {
            return Long.valueOf(((Number) opt).longValue());
        }
        if (opt instanceof String) {
            try {
                return Long.valueOf((long) Double.parseDouble((String) opt));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m33535e(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof String) {
            return (String) opt;
        }
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    /* renamed from: f */
    public static void m33534f(String str) {
        f6526a = str;
    }
}