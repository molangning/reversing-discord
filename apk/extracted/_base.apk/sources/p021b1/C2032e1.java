package p021b1;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: b1.e1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2032e1 {

    /* renamed from: a */
    private final SharedPreferences f5609a;

    public C2032e1(Context context) {
        this.f5609a = context.getSharedPreferences("adjust_preferences", 0);
    }

    /* renamed from: C */
    private synchronized void m34619C(String str, String str2) {
        this.f5609a.edit().putString(str, str2).apply();
    }

    /* renamed from: b */
    private synchronized boolean m34612b(String str, boolean z) {
        try {
        } catch (ClassCastException unused) {
            return z;
        }
        return this.f5609a.getBoolean(str, z);
    }

    /* renamed from: h */
    private synchronized long m34606h(String str, long j) {
        try {
        } catch (ClassCastException unused) {
            return j;
        }
        return this.f5609a.getLong(str, j);
    }

    /* renamed from: n */
    private synchronized int m34600n(String str, long j) {
        try {
            JSONArray m34601m = m34601m();
            for (int i = 0; i < m34601m.length(); i++) {
                JSONArray jSONArray = m34601m.getJSONArray(i);
                String optString = jSONArray.optString(0, null);
                if (optString != null && optString.equals(str) && jSONArray.optLong(1, -1L) == j) {
                    return i;
                }
            }
        } catch (JSONException unused) {
        }
        return -1;
    }

    /* renamed from: o */
    private synchronized String m34599o(String str) {
        try {
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable unused2) {
            if (str.equals("raw_referrers")) {
                m34598p("raw_referrers");
            }
            return null;
        }
        return this.f5609a.getString(str, null);
    }

    /* renamed from: p */
    private synchronized void m34598p(String str) {
        this.f5609a.edit().remove(str).apply();
    }

    /* renamed from: w */
    private synchronized void m34591w(String str, boolean z) {
        this.f5609a.edit().putBoolean(str, z).apply();
    }

    /* renamed from: y */
    private synchronized void m34589y(String str, long j) {
        this.f5609a.edit().putLong(str, j).apply();
    }

    /* renamed from: A */
    public synchronized void m34621A(String str, long j) {
        if (m34602l(str, j) != null) {
            return;
        }
        JSONArray m34601m = m34601m();
        if (m34601m.length() == 10) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(0, str);
        jSONArray.put(1, j);
        jSONArray.put(2, 0);
        m34601m.put(jSONArray);
        m34620B(m34601m);
    }

    /* renamed from: B */
    public synchronized void m34620B(JSONArray jSONArray) {
        try {
            m34619C("raw_referrers", jSONArray.toString());
        } catch (Throwable unused) {
            m34598p("raw_referrers");
        }
    }

    /* renamed from: D */
    public synchronized void m34618D() {
        m34591w("disable_third_party_sharing", true);
    }

    /* renamed from: E */
    public synchronized void m34617E() {
        m34591w("gdpr_forget_me", true);
    }

    /* renamed from: F */
    public synchronized void m34616F() {
        m34591w("install_tracked", true);
    }

    /* renamed from: G */
    public synchronized void m34615G(long j) {
        m34589y("preinstall_payload_read_status", j);
    }

    /* renamed from: H */
    public synchronized void m34614H() {
        try {
            JSONArray m34601m = m34601m();
            boolean z = false;
            for (int i = 0; i < m34601m.length(); i++) {
                JSONArray jSONArray = m34601m.getJSONArray(i);
                if (jSONArray.optInt(2, -1) == 1) {
                    jSONArray.put(2, 0);
                    z = true;
                }
            }
            if (z) {
                m34620B(m34601m);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public synchronized void m34613a() {
        this.f5609a.edit().clear().apply();
    }

    /* renamed from: c */
    public synchronized long m34611c() {
        return m34606h("deeplink_click_time", -1L);
    }

    /* renamed from: d */
    public synchronized String m34610d() {
        return m34599o("deeplink_url");
    }

    /* renamed from: e */
    public synchronized boolean m34609e() {
        return m34612b("disable_third_party_sharing", false);
    }

    /* renamed from: f */
    public synchronized boolean m34608f() {
        return m34612b("gdpr_forget_me", false);
    }

    /* renamed from: g */
    public synchronized boolean m34607g() {
        return m34612b("install_tracked", false);
    }

    /* renamed from: i */
    public synchronized long m34605i() {
        return m34606h("preinstall_payload_read_status", 0L);
    }

    /* renamed from: j */
    public synchronized String m34604j() {
        return m34599o("preinstall_system_installer_referrer");
    }

    /* renamed from: k */
    public synchronized String m34603k() {
        return m34599o("push_token");
    }

    /* renamed from: l */
    public synchronized JSONArray m34602l(String str, long j) {
        int m34600n = m34600n(str, j);
        if (m34600n >= 0) {
            try {
                return m34601m().getJSONArray(m34600n);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: m */
    public synchronized JSONArray m34601m() {
        String m34599o = m34599o("raw_referrers");
        if (m34599o != null) {
            try {
                JSONArray jSONArray = new JSONArray(m34599o);
                if (jSONArray.length() > 10) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < 10; i++) {
                        jSONArray2.put(jSONArray.get(i));
                    }
                    m34620B(jSONArray2);
                    return jSONArray2;
                }
                return new JSONArray(m34599o);
            } catch (Throwable unused) {
            }
        }
        return new JSONArray();
    }

    /* renamed from: q */
    public synchronized void m34597q() {
        m34598p("deeplink_url");
        m34598p("deeplink_click_time");
    }

    /* renamed from: r */
    public synchronized void m34596r() {
        m34598p("disable_third_party_sharing");
    }

    /* renamed from: s */
    public synchronized void m34595s() {
        m34598p("gdpr_forget_me");
    }

    /* renamed from: t */
    public synchronized void m34594t() {
        m34598p("preinstall_system_installer_referrer");
    }

    /* renamed from: u */
    public synchronized void m34593u() {
        m34598p("push_token");
    }

    /* renamed from: v */
    public synchronized void m34592v(String str, long j) {
        if (str != null) {
            if (str.length() != 0) {
                int m34600n = m34600n(str, j);
                if (m34600n < 0) {
                    return;
                }
                JSONArray m34601m = m34601m();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < m34601m.length(); i++) {
                    if (i != m34600n) {
                        try {
                            jSONArray.put(m34601m.getJSONArray(i));
                        } catch (JSONException unused) {
                        }
                    }
                }
                m34619C("raw_referrers", jSONArray.toString());
            }
        }
    }

    /* renamed from: x */
    public synchronized void m34590x(Uri uri, long j) {
        if (uri == null) {
            return;
        }
        m34619C("deeplink_url", uri.toString());
        m34589y("deeplink_click_time", j);
    }

    /* renamed from: z */
    public synchronized void m34588z(String str) {
        m34619C("push_token", str);
    }
}
