package p030bc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.google.android.gms.tasks.C4713b;
import com.google.firebase.installations.C5051d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p029b9.C2198p;
import p030bc.AbstractC2263d;
import p030bc.AbstractC2267f;
import p119g9.C6578a;
import p119g9.C6584g;
import p386vb.InterfaceC13238j;
import p423xb.InterfaceC13776b;

/* renamed from: bc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2262c {

    /* renamed from: d */
    private static final Pattern f6368d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f6369e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f6370a;

    /* renamed from: b */
    private final InterfaceC13776b<InterfaceC13238j> f6371b;

    /* renamed from: c */
    private final C2266e f6372c = new C2266e();

    public C2262c(Context context, InterfaceC13776b<InterfaceC13238j> interfaceC13776b) {
        this.f6370a = context;
        this.f6371b = interfaceC13776b;
    }

    /* renamed from: a */
    private static String m33751a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m33750b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m33749c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m33746f() {
        try {
            Context context = this.f6370a;
            byte[] m22387a = C6578a.m22387a(context, context.getPackageName());
            if (m22387a == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f6370a.getPackageName());
                return null;
            }
            return C6584g.m22372b(m22387a, false);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f6370a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private URL m33745g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new C5051d(e.getMessage(), C5051d.EnumC5052a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m33744h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m33743i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    private static void m33742j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m33741k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m33737o = m33737o(httpURLConnection);
        if (!TextUtils.isEmpty(m33737o)) {
            Log.w("Firebase-Installations", m33737o);
            Log.w("Firebase-Installations", m33751a(str, str2, str3));
        }
    }

    /* renamed from: l */
    private HttpURLConnection m33740l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f6370a.getPackageName());
            InterfaceC13238j interfaceC13238j = this.f6371b.get();
            if (interfaceC13238j != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) C4713b.m28008a(interfaceC13238j.mo2989a()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m33746f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C5051d("Firebase Installations Service is unavailable. Please try again later.", C5051d.EnumC5052a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m33739m(String str) {
        C2198p.m33993b(f6368d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    /* renamed from: n */
    private AbstractC2263d m33738n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f6369e));
        AbstractC2267f.AbstractC2268a m33714a = AbstractC2267f.m33714a();
        AbstractC2263d.AbstractC2264a m33732a = AbstractC2263d.m33732a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                m33732a.mo33721f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m33732a.mo33724c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m33732a.mo33723d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m33714a.mo33708c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m33714a.mo33707d(m33739m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m33732a.mo33725b(m33714a.mo33710a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m33732a.mo33722e(AbstractC2263d.EnumC2265b.OK).mo33726a();
    }

    /* renamed from: o */
    private static String m33737o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f6369e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th2;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    /* renamed from: p */
    private AbstractC2267f m33736p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f6369e));
        AbstractC2267f.AbstractC2268a m33714a = AbstractC2267f.m33714a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m33714a.mo33708c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m33714a.mo33707d(m33739m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m33714a.mo33709b(AbstractC2267f.EnumC2269b.OK).mo33710a();
    }

    /* renamed from: q */
    private void m33735q(HttpURLConnection httpURLConnection, String str, String str2) {
        m33733s(httpURLConnection, m33744h(m33750b(str, str2)));
    }

    /* renamed from: r */
    private void m33734r(HttpURLConnection httpURLConnection) {
        m33733s(httpURLConnection, m33744h(m33749c()));
    }

    /* renamed from: s */
    private static void m33733s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* renamed from: d */
    public AbstractC2263d m33748d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC2263d m33738n;
        if (this.f6372c.m33719b()) {
            URL m33745g = m33745g(String.format("projects/%s/installations", str3));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection m33740l = m33740l(m33745g, str);
                try {
                    m33740l.setRequestMethod("POST");
                    m33740l.setDoOutput(true);
                    if (str5 != null) {
                        m33740l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m33735q(m33740l, str2, str4);
                    responseCode = m33740l.getResponseCode();
                    this.f6372c.m33715f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    m33740l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (m33743i(responseCode)) {
                    m33738n = m33738n(m33740l);
                } else {
                    m33741k(m33740l, str4, str, str3);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            m33742j();
                            m33738n = AbstractC2263d.m33732a().mo33722e(AbstractC2263d.EnumC2265b.BAD_CONFIG).mo33726a();
                        } else {
                            m33740l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    } else {
                        throw new C5051d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C5051d.EnumC5052a.TOO_MANY_REQUESTS);
                    }
                }
                m33740l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m33738n;
            }
            throw new C5051d("Firebase Installations Service is unavailable. Please try again later.", C5051d.EnumC5052a.UNAVAILABLE);
        }
        throw new C5051d("Firebase Installations Service is unavailable. Please try again later.", C5051d.EnumC5052a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC2267f m33747e(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC2267f m33736p;
        if (this.f6372c.m33719b()) {
            URL m33745g = m33745g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection m33740l = m33740l(m33745g, str);
                try {
                    m33740l.setRequestMethod("POST");
                    m33740l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m33740l.setDoOutput(true);
                    m33734r(m33740l);
                    responseCode = m33740l.getResponseCode();
                    this.f6372c.m33715f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    m33740l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (m33743i(responseCode)) {
                    m33736p = m33736p(m33740l);
                } else {
                    m33741k(m33740l, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                m33742j();
                                m33736p = AbstractC2267f.m33714a().mo33709b(AbstractC2267f.EnumC2269b.BAD_CONFIG).mo33710a();
                            } else {
                                m33740l.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        } else {
                            throw new C5051d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C5051d.EnumC5052a.TOO_MANY_REQUESTS);
                        }
                    }
                    m33736p = AbstractC2267f.m33714a().mo33709b(AbstractC2267f.EnumC2269b.AUTH_ERROR).mo33710a();
                }
                m33740l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m33736p;
            }
            throw new C5051d("Firebase Installations Service is unavailable. Please try again later.", C5051d.EnumC5052a.UNAVAILABLE);
        }
        throw new C5051d("Firebase Installations Service is unavailable. Please try again later.", C5051d.EnumC5052a.UNAVAILABLE);
    }
}
