package p034c1;

import android.net.Uri;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;
import p021b1.C2024c;
import p021b1.C2036g;
import p021b1.C2043h1;
import p021b1.C2055l;
import p021b1.C2114z0;
import p021b1.EnumC2020b;
import p021b1.EnumC2035f1;
import p021b1.InterfaceC2025c0;
import p034c1.C2384d;
import p034c1.InterfaceC2381b;
import p054d1.C5722d;
import p054d1.InterfaceC5729f;

/* renamed from: c1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2379a implements InterfaceC2381b {

    /* renamed from: a */
    private String f6503a;

    /* renamed from: b */
    private String f6504b;

    /* renamed from: c */
    private String f6505c;

    /* renamed from: d */
    private String f6506d;

    /* renamed from: g */
    private C2383c f6509g;

    /* renamed from: e */
    private InterfaceC2025c0 f6507e = C2055l.m34422j();

    /* renamed from: f */
    private InterfaceC5729f f6508f = new C5722d("ActivityPackageSender");

    /* renamed from: h */
    private C2384d.InterfaceC2388d f6510h = C2055l.m34424h();

    /* renamed from: i */
    private C2384d.InterfaceC2387c f6511i = C2055l.m34426f();

    /* renamed from: c1.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2380a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ InterfaceC2381b.InterfaceC2382a f6512j;

        /* renamed from: k */
        final /* synthetic */ C2024c f6513k;

        /* renamed from: l */
        final /* synthetic */ Map f6514l;

        RunnableC2380a(InterfaceC2381b.InterfaceC2382a interfaceC2382a, C2024c c2024c, Map map) {
            C2379a.this = r1;
            this.f6512j = interfaceC2382a;
            this.f6513k = c2024c;
            this.f6514l = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6512j.mo33546h(C2379a.this.mo33548a(this.f6513k, this.f6514l));
        }
    }

    public C2379a(String str, String str2, String str3, String str4, String str5) {
        this.f6503a = str2;
        this.f6504b = str3;
        this.f6505c = str4;
        this.f6506d = str5;
        this.f6509g = new C2383c(C2055l.m34427e(), C2055l.m34425g(), C2055l.m34415q(), str);
    }

    /* renamed from: A */
    private void m33574A(C2114z0 c2114z0) {
        boolean z;
        String m33557r;
        boolean z2;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                C2024c c2024c = c2114z0.f5964m;
                                HashMap hashMap = new HashMap(c2024c.m34674m());
                                Map<String, String> map = c2114z0.f5965n;
                                String m33572c = m33572c(hashMap, c2024c.m34686a());
                                boolean z3 = true;
                                if (c2114z0.f5964m.m34686a() == EnumC2020b.ATTRIBUTION) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    m33564k(hashMap);
                                    m33557r = m33558q(c2024c.m34686a(), c2024c.m34672o(), hashMap, map);
                                } else {
                                    m33557r = m33557r(c2024c.m34686a(), c2024c.m34672o());
                                }
                                HttpsURLConnection mo33532a = this.f6510h.mo33532a(new URL(m33557r));
                                this.f6511i.mo33533a(mo33532a, c2024c.m34681f());
                                if (m33572c != null) {
                                    mo33532a.setRequestProperty("Authorization", m33572c);
                                }
                                if (z) {
                                    dataOutputStream = m33569f(mo33532a);
                                } else {
                                    m33564k(hashMap);
                                    dataOutputStream = m33568g(mo33532a, hashMap, map);
                                }
                                Integer m33551x = m33551x(mo33532a, c2114z0);
                                if (c2114z0.f5957f != null && c2114z0.f5962k == null && m33551x != null && m33551x.intValue() == 200) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c2114z0.f5952a = z2;
                                if (c2114z0.f5957f != null && c2114z0.f5962k == null) {
                                    z3 = false;
                                }
                                c2114z0.f5953b = z3;
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (IOException e) {
                                        this.f6507e.mo34444b(m33567h(e, "Flushing and closing connection output stream", c2114z0.f5964m), new Object[0]);
                                    }
                                }
                            } catch (MalformedURLException e2) {
                                m33553v(e2, "Malformed URL", c2114z0);
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (IOException e3) {
                                        this.f6507e.mo34444b(m33567h(e3, "Flushing and closing connection output stream", c2114z0.f5964m), new Object[0]);
                                    }
                                }
                            } catch (IOException e4) {
                                m33550y(e4, "Request failed", c2114z0);
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (IOException e5) {
                                        this.f6507e.mo34444b(m33567h(e5, "Flushing and closing connection output stream", c2114z0.f5964m), new Object[0]);
                                    }
                                }
                            }
                        } catch (ProtocolException e6) {
                            m33553v(e6, "Protocol Error", c2114z0);
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                } catch (IOException e7) {
                                    this.f6507e.mo34444b(m33567h(e7, "Flushing and closing connection output stream", c2114z0.f5964m), new Object[0]);
                                }
                            }
                        }
                    } catch (SocketTimeoutException e8) {
                        m33550y(e8, "Request timed out", c2114z0);
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            } catch (IOException e9) {
                                this.f6507e.mo34444b(m33567h(e9, "Flushing and closing connection output stream", c2114z0.f5964m), new Object[0]);
                            }
                        }
                    }
                } catch (SSLHandshakeException e10) {
                    m33550y(e10, "Certificate failed", c2114z0);
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        } catch (IOException e11) {
                            this.f6507e.mo34444b(m33567h(e11, "Flushing and closing connection output stream", c2114z0.f5964m), new Object[0]);
                        }
                    }
                }
            } catch (UnsupportedEncodingException e12) {
                m33553v(e12, "Failed to encode parameters", c2114z0);
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (IOException e13) {
                        this.f6507e.mo34444b(m33567h(e13, "Flushing and closing connection output stream", c2114z0.f5964m), new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: B */
    private String m33573B(EnumC2020b enumC2020b, String str) {
        if (enumC2020b == EnumC2020b.GDPR) {
            if (this.f6504b != null) {
                return str + this.f6504b;
            }
            return str;
        } else if (enumC2020b == EnumC2020b.SUBSCRIPTION) {
            if (this.f6505c != null) {
                return str + this.f6505c;
            }
            return str;
        } else if (this.f6503a != null) {
            return str + this.f6503a;
        } else {
            return str;
        }
    }

    /* renamed from: c */
    private String m33572c(Map<String, String> map, EnumC2020b enumC2020b) {
        String enumC2020b2 = enumC2020b.toString();
        String m33561n = m33561n(map);
        String m33570e = m33570e(m33560o(map), m33561n, m33563l(map), m33566i(map), m33562m(map));
        if (m33570e != null) {
            return m33570e;
        }
        return m33571d(map, m33565j(map), m33561n, enumC2020b2);
    }

    /* renamed from: d */
    private String m33571d(Map<String, String> map, String str, String str2, String str3) {
        if (str != null && str.length() != 0) {
            Map<String, String> m33556s = m33556s(map, str3, str);
            String m34474l = C2043h1.m34474l("Signature %s,%s,%s,%s", C2043h1.m34474l("secret_id=\"%s\"", str2), C2043h1.m34474l("signature=\"%s\"", C2043h1.m34480g0(m33556s.get("clear_signature"))), C2043h1.m34474l("algorithm=\"%s\"", "sha256"), C2043h1.m34474l("headers=\"%s\"", m33556s.get("fields")));
            this.f6507e.mo34439g("authorizationHeader: %s", m34474l);
            return m34474l;
        }
        return null;
    }

    /* renamed from: e */
    private String m33570e(String str, String str2, String str3, String str4, String str5) {
        if (str2 != null && str != null && str3 != null) {
            String m34474l = C2043h1.m34474l("signature=\"%s\"", str);
            String m34474l2 = C2043h1.m34474l("secret_id=\"%s\"", str2);
            String m34474l3 = C2043h1.m34474l("headers_id=\"%s\"", str3);
            Object[] objArr = new Object[1];
            if (str4 == null) {
                str4 = "adj1";
            }
            objArr[0] = str4;
            String m34474l4 = C2043h1.m34474l("algorithm=\"%s\"", objArr);
            Object[] objArr2 = new Object[1];
            if (str5 == null) {
                str5 = "";
            }
            objArr2[0] = str5;
            String m34474l5 = C2043h1.m34474l("Signature %s,%s,%s,%s,%s", m34474l, m34474l2, m34474l4, m34474l3, C2043h1.m34474l("native_version=\"%s\"", objArr2));
            this.f6507e.mo34439g("authorizationHeader: %s", m34474l5);
            return m34474l5;
        }
        return null;
    }

    /* renamed from: f */
    private DataOutputStream m33569f(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod("GET");
        return null;
    }

    /* renamed from: g */
    private DataOutputStream m33568g(HttpsURLConnection httpsURLConnection, Map<String, String> map, Map<String, String> map2) {
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        String m33559p = m33559p(map, map2);
        if (m33559p == null) {
            return null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(m33559p);
        return dataOutputStream;
    }

    /* renamed from: h */
    private String m33567h(Throwable th2, String str, C2024c c2024c) {
        return C2043h1.m34474l("%s. (%s)", c2024c.m34679h(), C2043h1.m34518B(str, th2));
    }

    /* renamed from: i */
    private static String m33566i(Map<String, String> map) {
        return map.remove("algorithm");
    }

    /* renamed from: j */
    private static String m33565j(Map<String, String> map) {
        return map.remove("app_secret");
    }

    /* renamed from: k */
    private static void m33564k(Map<String, String> map) {
        map.remove("event_callback_id");
    }

    /* renamed from: l */
    private static String m33563l(Map<String, String> map) {
        return map.remove("headers_id");
    }

    /* renamed from: m */
    private static String m33562m(Map<String, String> map) {
        return map.remove("native_version");
    }

    /* renamed from: n */
    private static String m33561n(Map<String, String> map) {
        return map.remove("secret_id");
    }

    /* renamed from: o */
    private static String m33560o(Map<String, String> map) {
        return map.remove("signature");
    }

    /* renamed from: p */
    private String m33559p(Map<String, String> map, Map<String, String> map2) {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        m33554u(map, sb2);
        m33554u(map2, sb2);
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '&') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    /* renamed from: q */
    private String m33558q(EnumC2020b enumC2020b, String str, Map<String, String> map, Map<String, String> map2) {
        URL url = new URL(m33573B(enumC2020b, this.f6509g.m33540f(enumC2020b)));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.f6507e.mo34443c("Making request to url: %s", builder.toString());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                builder.appendQueryParameter(entry2.getKey(), entry2.getValue());
            }
        }
        return builder.build().toString();
    }

    /* renamed from: r */
    private String m33557r(EnumC2020b enumC2020b, String str) {
        String m34474l = C2043h1.m34474l("%s%s", m33573B(enumC2020b, this.f6509g.m33540f(enumC2020b)), str);
        this.f6507e.mo34443c("Making request to url : %s", m34474l);
        return m34474l;
    }

    /* renamed from: s */
    private Map<String, String> m33556s(Map<String, String> map, String str, String str2) {
        String m33555t = m33555t(map);
        String str3 = map.get("source");
        String str4 = map.get("payload");
        HashMap hashMap = new HashMap();
        hashMap.put("app_secret", str2);
        hashMap.put("created_at", map.get("created_at"));
        hashMap.put("activity_kind", str);
        hashMap.put(m33555t, map.get(m33555t));
        if (str3 != null) {
            hashMap.put("source", str3);
        }
        if (str4 != null) {
            hashMap.put("payload", str4);
        }
        String str5 = "";
        String str6 = "";
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                str5 = str5 + ((String) entry.getKey()) + " ";
                str6 = str6 + ((String) entry.getValue());
            }
        }
        String substring = str5.substring(0, str5.length() - 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("clear_signature", str6);
        hashMap2.put("fields", substring);
        return hashMap2;
    }

    /* renamed from: t */
    private String m33555t(Map<String, String> map) {
        if (map.get("gps_adid") != null) {
            return "gps_adid";
        }
        if (map.get("fire_adid") != null) {
            return "fire_adid";
        }
        if (map.get("android_id") != null) {
            return "android_id";
        }
        if (map.get("mac_sha1") != null) {
            return "mac_sha1";
        }
        if (map.get("mac_md5") != null) {
            return "mac_md5";
        }
        if (map.get("android_uuid") != null) {
            return "android_uuid";
        }
        return null;
    }

    /* renamed from: u */
    private void m33554u(Map<String, String> map, StringBuilder sb2) {
        String str;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String encode = URLEncoder.encode(entry.getKey(), "UTF-8");
                String value = entry.getValue();
                if (value != null) {
                    str = URLEncoder.encode(value, "UTF-8");
                } else {
                    str = "";
                }
                sb2.append(encode);
                sb2.append("=");
                sb2.append(str);
                sb2.append("&");
            }
        }
    }

    /* renamed from: v */
    private void m33553v(Throwable th2, String str, C2114z0 c2114z0) {
        String m33567h = m33567h(th2, str, c2114z0.f5964m);
        this.f6507e.mo34444b(m33567h, new Object[0]);
        c2114z0.f5955d = m33567h;
        c2114z0.f5953b = false;
    }

    /* renamed from: w */
    private void m33552w(C2114z0 c2114z0, String str) {
        JSONObject jSONObject;
        if (str.length() == 0) {
            this.f6507e.mo34444b("Empty response string", new Object[0]);
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            this.f6507e.mo34444b(m33567h(e, "Failed to parse JSON response", c2114z0.f5964m), new Object[0]);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        c2114z0.f5957f = jSONObject;
        c2114z0.f5955d = C2384d.m33535e(jSONObject, "message");
        c2114z0.f5954c = C2384d.m33535e(jSONObject, "adid");
        c2114z0.f5956e = C2384d.m33535e(jSONObject, "timestamp");
        String m33535e = C2384d.m33535e(jSONObject, "tracking_state");
        if (m33535e != null && m33535e.equals("opted_out")) {
            c2114z0.f5959h = EnumC2035f1.OPTED_OUT;
        }
        c2114z0.f5961j = C2384d.m33536d(jSONObject, "ask_in");
        c2114z0.f5962k = C2384d.m33536d(jSONObject, "retry_in");
        c2114z0.f5963l = C2384d.m33536d(jSONObject, "continue_in");
        c2114z0.f5960i = C2036g.m34571a(jSONObject.optJSONObject("attribution"), c2114z0.f5954c, C2043h1.m34515E(this.f6506d));
    }

    /* renamed from: y */
    private void m33550y(Throwable th2, String str, C2114z0 c2114z0) {
        String str2 = m33567h(th2, str, c2114z0.f5964m) + " Will retry later";
        this.f6507e.mo34444b(str2, new Object[0]);
        c2114z0.f5955d = str2;
        c2114z0.f5953b = true;
    }

    /* renamed from: z */
    private boolean m33549z(C2114z0 c2114z0) {
        if (!c2114z0.f5953b) {
            this.f6507e.mo34443c("Will not retry with current url strategy", new Object[0]);
            this.f6509g.m33543c();
            return false;
        } else if (this.f6509g.m33542d(c2114z0.f5958g)) {
            this.f6507e.mo34444b("Failed with current url strategy, but it will retry with new", new Object[0]);
            return true;
        } else {
            this.f6507e.mo34444b("Failed with current url strategy and it will not retry", new Object[0]);
            return false;
        }
    }

    @Override // p034c1.InterfaceC2381b
    /* renamed from: a */
    public C2114z0 mo33548a(C2024c c2024c, Map<String, String> map) {
        C2114z0 m34179a;
        do {
            m34179a = C2114z0.m34179a(c2024c, map);
            m33574A(m34179a);
        } while (m33549z(m34179a));
        return m34179a;
    }

    @Override // p034c1.InterfaceC2381b
    /* renamed from: b */
    public void mo33547b(C2024c c2024c, Map<String, String> map, InterfaceC2381b.InterfaceC2382a interfaceC2382a) {
        this.f6508f.submit(new RunnableC2380a(interfaceC2382a, c2024c, map));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004d, code lost:
        if (r7 == null) goto L12;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.Integer m33551x(javax.net.ssl.HttpsURLConnection r7, p021b1.C2114z0 r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
            r7.connect()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r3 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r3 = r2.intValue()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L1f
            java.io.InputStream r3 = r7.getErrorStream()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            goto L23
        L1f:
            java.io.InputStream r3 = r7.getInputStream()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L23:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L2d:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r4 == 0) goto L37
            r0.append(r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            goto L2d
        L37:
            r7.disconnect()
            goto L50
        L3b:
            r8 = move-exception
            goto La8
        L3d:
            r3 = move-exception
            java.lang.String r4 = "Connecting and reading response"
            b1.c r5 = r8.f5964m     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r6.m33567h(r3, r4, r5)     // Catch: java.lang.Throwable -> L3b
            b1.c0 r4 = r6.f6507e     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3b
            r4.mo34444b(r3, r5)     // Catch: java.lang.Throwable -> L3b
            if (r7 == 0) goto L50
            goto L37
        L50:
            int r7 = r0.length()
            if (r7 != 0) goto L60
            b1.c0 r7 = r6.f6507e
            java.lang.String r8 = "Empty response string buffer"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r7.mo34444b(r8, r0)
            return r2
        L60:
            int r7 = r2.intValue()
            r3 = 429(0x1ad, float:6.01E-43)
            if (r7 != r3) goto L72
            b1.c0 r7 = r6.f6507e
            java.lang.String r8 = "Too frequent requests to the endpoint (429)"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r7.mo34444b(r8, r0)
            return r2
        L72:
            java.lang.String r7 = r0.toString()
            b1.c0 r0 = r6.f6507e
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r7
            java.lang.String r5 = "Response string: %s"
            r0.mo34443c(r5, r4)
            r6.m33552w(r8, r7)
            java.lang.String r7 = r8.f5955d
            if (r7 != 0) goto L8a
            return r2
        L8a:
            int r8 = r2.intValue()
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r4 = "Response message: %s"
            if (r8 != r0) goto L9e
            b1.c0 r8 = r6.f6507e
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r7
            r8.mo34438h(r4, r0)
            goto La7
        L9e:
            b1.c0 r8 = r6.f6507e
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r7
            r8.mo34444b(r4, r0)
        La7:
            return r2
        La8:
            if (r7 == 0) goto Lad
            r7.disconnect()
        Lad:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c1.C2379a.m33551x(javax.net.ssl.HttpsURLConnection, b1.z0):java.lang.Integer");
    }
}