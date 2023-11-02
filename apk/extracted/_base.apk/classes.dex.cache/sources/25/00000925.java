package p021b1;

import android.content.ContentResolver;
import android.text.TextUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: b1.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2085t0 {

    /* renamed from: v */
    private static InterfaceC2025c0 f5828v = C2055l.m34422j();

    /* renamed from: a */
    private long f5829a;

    /* renamed from: b */
    private C2106x f5830b;

    /* renamed from: c */
    private C2041h f5831c;

    /* renamed from: d */
    private C2086a f5832d;

    /* renamed from: e */
    private C2026c1 f5833e;

    /* renamed from: f */
    long f5834f = -1;

    /* renamed from: g */
    long f5835g = -1;

    /* renamed from: h */
    long f5836h = -1;

    /* renamed from: i */
    long f5837i = -1;

    /* renamed from: j */
    long f5838j = -1;

    /* renamed from: k */
    String f5839k;

    /* renamed from: l */
    String f5840l;

    /* renamed from: m */
    String f5841m;

    /* renamed from: n */
    String f5842n;

    /* renamed from: o */
    String f5843o;

    /* renamed from: p */
    String f5844p;

    /* renamed from: q */
    String f5845q;

    /* renamed from: r */
    String f5846r;

    /* renamed from: s */
    Boolean f5847s;

    /* renamed from: t */
    C2036g f5848t;

    /* renamed from: u */
    Map<String, String> f5849u;

    /* renamed from: b1.t0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C2086a {

        /* renamed from: a */
        int f5850a;

        /* renamed from: b */
        int f5851b;

        /* renamed from: c */
        int f5852c;

        /* renamed from: d */
        long f5853d;

        /* renamed from: e */
        long f5854e;

        /* renamed from: f */
        long f5855f;

        /* renamed from: g */
        String f5856g;

        /* renamed from: h */
        String f5857h;

        C2086a(C2027d c2027d) {
            C2085t0.this = r3;
            this.f5850a = -1;
            this.f5851b = -1;
            this.f5852c = -1;
            this.f5853d = -1L;
            this.f5854e = -1L;
            this.f5855f = -1L;
            this.f5856g = null;
            this.f5857h = null;
            if (c2027d == null) {
                return;
            }
            this.f5850a = c2027d.f5596p;
            this.f5851b = c2027d.f5597q;
            this.f5852c = c2027d.f5598r;
            this.f5853d = c2027d.f5600t;
            this.f5854e = c2027d.f5602v;
            this.f5855f = c2027d.f5599s;
            this.f5856g = c2027d.f5591k;
            this.f5857h = c2027d.f5605y;
        }
    }

    public C2085t0(C2041h c2041h, C2106x c2106x, C2027d c2027d, C2026c1 c2026c1, long j) {
        this.f5829a = j;
        this.f5830b = c2106x;
        this.f5831c = c2041h;
        this.f5832d = new C2086a(c2027d);
        this.f5833e = c2026c1;
    }

    /* renamed from: A */
    private boolean m34341A(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("gps_adid");
    }

    /* renamed from: B */
    private Map<String, String> m34340B(C2033f c2033f, boolean z) {
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        if (!z) {
            m34316k(hashMap, "callback_params", C2043h1.m34495Y(this.f5833e.f5576a, c2033f.f5618h, "Callback"));
            m34316k(hashMap, "partner_params", C2043h1.m34495Y(this.f5833e.f5577b, c2033f.f5619i, "Partner"));
        }
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34317j(hashMap, "connectivity_type", C2043h1.m34471o(this.f5831c.f5660d));
        m34315l(hashMap, "country", this.f5830b.f5929t);
        m34315l(hashMap, "cpu_type", this.f5830b.f5905A);
        m34324c(hashMap, "created_at", this.f5829a);
        m34315l(hashMap, "default_tracker", this.f5831c.f5666j);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34326a(hashMap, "needs_cost", this.f5831c.f5654E);
        m34315l(hashMap, "device_manufacturer", this.f5830b.f5924o);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "display_height", this.f5830b.f5934y);
        m34315l(hashMap, "display_width", this.f5830b.f5933x);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34315l(hashMap, "fb_id", this.f5830b.f5918i);
        m34315l(hashMap, "hardware_name", this.f5830b.f5935z);
        m34315l(hashMap, "installed_at", this.f5830b.f5907C);
        m34315l(hashMap, "language", this.f5830b.f5928s);
        m34320g(hashMap, "last_interval", this.f5832d.f5854e);
        m34315l(hashMap, "mcc", C2043h1.m34462x(this.f5831c.f5660d));
        m34315l(hashMap, "mnc", C2043h1.m34461y(this.f5831c.f5660d));
        m34326a(hashMap, "needs_response_details", bool);
        m34317j(hashMap, "network_type", C2043h1.m34460z(this.f5831c.f5660d));
        m34315l(hashMap, "os_build", this.f5830b.f5906B);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "screen_density", this.f5830b.f5932w);
        m34315l(hashMap, "screen_format", this.f5830b.f5931v);
        m34315l(hashMap, "screen_size", this.f5830b.f5930u);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34315l(hashMap, "source", c2033f.f5611a);
        m34321f(hashMap, "revenue", c2033f.f5612b);
        m34315l(hashMap, "currency", c2033f.f5613c);
        m34319h(hashMap, "ad_impressions_count", c2033f.f5614d);
        m34315l(hashMap, "ad_revenue_network", c2033f.f5615e);
        m34315l(hashMap, "ad_revenue_unit", c2033f.f5616f);
        m34315l(hashMap, "ad_revenue_placement", c2033f.f5617g);
        m34317j(hashMap, "session_count", this.f5832d.f5851b);
        m34320g(hashMap, "session_length", this.f5832d.f5855f);
        m34317j(hashMap, "subsession_count", this.f5832d.f5852c);
        m34320g(hashMap, "time_spent", this.f5832d.f5853d);
        m34315l(hashMap, "updated_at", this.f5830b.f5908D);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: C */
    private Map<String, String> m34339C(String str, JSONObject jSONObject) {
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34317j(hashMap, "connectivity_type", C2043h1.m34471o(this.f5831c.f5660d));
        m34315l(hashMap, "country", this.f5830b.f5929t);
        m34315l(hashMap, "cpu_type", this.f5830b.f5905A);
        m34324c(hashMap, "created_at", this.f5829a);
        m34315l(hashMap, "default_tracker", this.f5831c.f5666j);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34326a(hashMap, "needs_cost", this.f5831c.f5654E);
        m34315l(hashMap, "device_manufacturer", this.f5830b.f5924o);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "display_height", this.f5830b.f5934y);
        m34315l(hashMap, "display_width", this.f5830b.f5933x);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34315l(hashMap, "fb_id", this.f5830b.f5918i);
        m34315l(hashMap, "hardware_name", this.f5830b.f5935z);
        m34315l(hashMap, "installed_at", this.f5830b.f5907C);
        m34315l(hashMap, "language", this.f5830b.f5928s);
        m34320g(hashMap, "last_interval", this.f5832d.f5854e);
        m34315l(hashMap, "mcc", C2043h1.m34462x(this.f5831c.f5660d));
        m34315l(hashMap, "mnc", C2043h1.m34461y(this.f5831c.f5660d));
        m34326a(hashMap, "needs_response_details", bool);
        m34317j(hashMap, "network_type", C2043h1.m34460z(this.f5831c.f5660d));
        m34315l(hashMap, "os_build", this.f5830b.f5906B);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "screen_density", this.f5830b.f5932w);
        m34315l(hashMap, "screen_format", this.f5830b.f5931v);
        m34315l(hashMap, "screen_size", this.f5830b.f5930u);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34315l(hashMap, "source", str);
        m34318i(hashMap, "payload", jSONObject);
        m34317j(hashMap, "session_count", this.f5832d.f5851b);
        m34320g(hashMap, "session_length", this.f5832d.f5855f);
        m34317j(hashMap, "subsession_count", this.f5832d.f5852c);
        m34320g(hashMap, "time_spent", this.f5832d.f5853d);
        m34315l(hashMap, "updated_at", this.f5830b.f5908D);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: D */
    private Map<String, String> m34338D(String str) {
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34324c(hashMap, "created_at", this.f5829a);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34326a(hashMap, "needs_cost", this.f5831c.f5654E);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34315l(hashMap, "initiated_by", str);
        m34326a(hashMap, "needs_response_details", bool);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: E */
    private Map<String, String> m34337E(String str) {
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        C2036g c2036g = this.f5848t;
        if (c2036g != null) {
            m34315l(hashMap, "tracker", c2036g.f5625k);
            m34315l(hashMap, "campaign", this.f5848t.f5627m);
            m34315l(hashMap, "adgroup", this.f5848t.f5628n);
            m34315l(hashMap, "creative", this.f5848t.f5629o);
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34316k(hashMap, "callback_params", this.f5833e.f5576a);
        m34324c(hashMap, "click_time", this.f5835g);
        m34323d(hashMap, "click_time", this.f5834f);
        m34323d(hashMap, "click_time_server", this.f5837i);
        m34317j(hashMap, "connectivity_type", C2043h1.m34471o(this.f5831c.f5660d));
        m34315l(hashMap, "country", this.f5830b.f5929t);
        m34315l(hashMap, "cpu_type", this.f5830b.f5905A);
        m34324c(hashMap, "created_at", this.f5829a);
        m34315l(hashMap, "deeplink", this.f5840l);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34326a(hashMap, "needs_cost", this.f5831c.f5654E);
        m34315l(hashMap, "device_manufacturer", this.f5830b.f5924o);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "display_height", this.f5830b.f5934y);
        m34315l(hashMap, "display_width", this.f5830b.f5933x);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34315l(hashMap, "fb_id", this.f5830b.f5918i);
        m34326a(hashMap, "google_play_instant", this.f5847s);
        m34315l(hashMap, "hardware_name", this.f5830b.f5935z);
        m34323d(hashMap, "install_begin_time", this.f5836h);
        m34323d(hashMap, "install_begin_time_server", this.f5838j);
        m34315l(hashMap, "install_version", this.f5842n);
        m34315l(hashMap, "installed_at", this.f5830b.f5907C);
        m34315l(hashMap, "language", this.f5830b.f5928s);
        m34320g(hashMap, "last_interval", this.f5832d.f5854e);
        m34315l(hashMap, "mcc", C2043h1.m34462x(this.f5831c.f5660d));
        m34315l(hashMap, "mnc", C2043h1.m34461y(this.f5831c.f5660d));
        m34326a(hashMap, "needs_response_details", bool);
        m34317j(hashMap, "network_type", C2043h1.m34460z(this.f5831c.f5660d));
        m34315l(hashMap, "os_build", this.f5830b.f5906B);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34316k(hashMap, "params", this.f5849u);
        m34316k(hashMap, "partner_params", this.f5833e.f5577b);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "raw_referrer", this.f5843o);
        m34315l(hashMap, "referrer", this.f5841m);
        m34315l(hashMap, "referrer_api", this.f5844p);
        m34315l(hashMap, "reftag", this.f5839k);
        m34315l(hashMap, "screen_density", this.f5830b.f5932w);
        m34315l(hashMap, "screen_format", this.f5830b.f5931v);
        m34315l(hashMap, "screen_size", this.f5830b.f5930u);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34317j(hashMap, "session_count", this.f5832d.f5851b);
        m34320g(hashMap, "session_length", this.f5832d.f5855f);
        m34315l(hashMap, "source", str);
        m34317j(hashMap, "subsession_count", this.f5832d.f5852c);
        m34320g(hashMap, "time_spent", this.f5832d.f5853d);
        m34315l(hashMap, "updated_at", this.f5830b.f5908D);
        m34315l(hashMap, "payload", this.f5845q);
        m34315l(hashMap, "found_location", this.f5846r);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: F */
    private C2024c m34336F(EnumC2020b enumC2020b) {
        C2024c c2024c = new C2024c(enumC2020b);
        c2024c.m34664w(this.f5830b.f5919j);
        return c2024c;
    }

    /* renamed from: G */
    private Map<String, String> m34335G() {
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34324c(hashMap, "created_at", this.f5829a);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34326a(hashMap, "needs_cost", this.f5831c.f5654E);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34326a(hashMap, "needs_response_details", bool);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: I */
    private String m34333I(C2049i c2049i) {
        Double d = c2049i.f5698b;
        if (d == null) {
            return C2043h1.m34474l("'%s'", c2049i.f5697a);
        }
        return C2043h1.m34474l("(%.5f %s, '%s')", d, c2049i.f5699c, c2049i.f5697a);
    }

    /* renamed from: J */
    private Map<String, String> m34332J() {
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34324c(hashMap, "created_at", this.f5829a);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34326a(hashMap, "needs_cost", this.f5831c.f5654E);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34326a(hashMap, "needs_response_details", bool);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: K */
    private Map<String, String> m34331K(String str) {
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34324c(hashMap, "created_at", this.f5829a);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34326a(hashMap, "needs_cost", this.f5831c.f5654E);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34326a(hashMap, "needs_response_details", bool);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34315l(hashMap, "source", str);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: L */
    private Map<String, String> m34330L(boolean z) {
        String str;
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        if (z) {
            str = "enable";
        } else {
            str = "disable";
        }
        m34315l(hashMap, "measurement", str);
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34324c(hashMap, "created_at", this.f5829a);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34326a(hashMap, "needs_response_details", bool);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: M */
    private Map<String, String> m34329M(boolean z) {
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        if (!z) {
            m34316k(hashMap, "callback_params", this.f5833e.f5576a);
            m34316k(hashMap, "partner_params", this.f5833e.f5577b);
        }
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34317j(hashMap, "connectivity_type", C2043h1.m34471o(this.f5831c.f5660d));
        m34315l(hashMap, "country", this.f5830b.f5929t);
        m34315l(hashMap, "cpu_type", this.f5830b.f5905A);
        m34324c(hashMap, "created_at", this.f5829a);
        m34315l(hashMap, "default_tracker", this.f5831c.f5666j);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34326a(hashMap, "needs_cost", this.f5831c.f5654E);
        m34315l(hashMap, "device_manufacturer", this.f5830b.f5924o);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "display_height", this.f5830b.f5934y);
        m34315l(hashMap, "display_width", this.f5830b.f5933x);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34315l(hashMap, "fb_id", this.f5830b.f5918i);
        m34315l(hashMap, "hardware_name", this.f5830b.f5935z);
        m34315l(hashMap, "installed_at", this.f5830b.f5907C);
        m34315l(hashMap, "language", this.f5830b.f5928s);
        m34320g(hashMap, "last_interval", this.f5832d.f5854e);
        m34315l(hashMap, "mcc", C2043h1.m34462x(this.f5831c.f5660d));
        m34315l(hashMap, "mnc", C2043h1.m34461y(this.f5831c.f5660d));
        m34326a(hashMap, "needs_response_details", bool);
        m34317j(hashMap, "network_type", C2043h1.m34460z(this.f5831c.f5660d));
        m34315l(hashMap, "os_build", this.f5830b.f5906B);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "screen_density", this.f5830b.f5932w);
        m34315l(hashMap, "screen_format", this.f5830b.f5931v);
        m34315l(hashMap, "screen_size", this.f5830b.f5930u);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34317j(hashMap, "session_count", this.f5832d.f5851b);
        m34320g(hashMap, "session_length", this.f5832d.f5855f);
        m34317j(hashMap, "subsession_count", this.f5832d.f5852c);
        m34320g(hashMap, "time_spent", this.f5832d.f5853d);
        m34315l(hashMap, "updated_at", this.f5830b.f5908D);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: N */
    private Map<String, String> m34328N(C2072n c2072n, boolean z) {
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        if (!z) {
            m34316k(hashMap, "callback_params", C2043h1.m34495Y(this.f5833e.f5576a, c2072n.m34358d(), "Callback"));
            m34316k(hashMap, "partner_params", C2043h1.m34495Y(this.f5833e.f5577b, c2072n.m34355g(), "Partner"));
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34317j(hashMap, "connectivity_type", C2043h1.m34471o(this.f5831c.f5660d));
        m34315l(hashMap, "country", this.f5830b.f5929t);
        m34315l(hashMap, "cpu_type", this.f5830b.f5905A);
        m34324c(hashMap, "created_at", this.f5829a);
        m34315l(hashMap, "default_tracker", this.f5831c.f5666j);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34326a(hashMap, "needs_cost", this.f5831c.f5654E);
        m34315l(hashMap, "device_manufacturer", this.f5830b.f5924o);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "display_height", this.f5830b.f5934y);
        m34315l(hashMap, "display_width", this.f5830b.f5933x);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34315l(hashMap, "fb_id", this.f5830b.f5918i);
        m34315l(hashMap, "hardware_name", this.f5830b.f5935z);
        m34315l(hashMap, "installed_at", this.f5830b.f5907C);
        m34315l(hashMap, "language", this.f5830b.f5928s);
        m34320g(hashMap, "last_interval", this.f5832d.f5854e);
        m34315l(hashMap, "mcc", C2043h1.m34462x(this.f5831c.f5660d));
        m34315l(hashMap, "mnc", C2043h1.m34461y(this.f5831c.f5660d));
        m34326a(hashMap, "needs_response_details", bool);
        m34317j(hashMap, "network_type", C2043h1.m34460z(this.f5831c.f5660d));
        m34315l(hashMap, "os_build", this.f5830b.f5906B);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "screen_density", this.f5830b.f5932w);
        m34315l(hashMap, "screen_format", this.f5830b.f5931v);
        m34315l(hashMap, "screen_size", this.f5830b.f5930u);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34317j(hashMap, "session_count", this.f5832d.f5851b);
        m34320g(hashMap, "session_length", this.f5832d.f5855f);
        m34317j(hashMap, "subsession_count", this.f5832d.f5852c);
        m34320g(hashMap, "time_spent", this.f5832d.f5853d);
        m34315l(hashMap, "updated_at", this.f5830b.f5908D);
        m34315l(hashMap, "billing_store", c2072n.m34359c());
        m34315l(hashMap, "currency", c2072n.m34357e());
        m34315l(hashMap, "product_id", c2072n.m34350l());
        m34315l(hashMap, "purchase_token", c2072n.m34352j());
        m34315l(hashMap, "receipt", c2072n.m34351k());
        m34317j(hashMap, "revenue", c2072n.m34354h());
        m34324c(hashMap, "transaction_date", c2072n.m34353i());
        m34315l(hashMap, "transaction_id", c2072n.m34356f());
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: O */
    private Map<String, String> m34327O(C2082s c2082s) {
        String str;
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        Boolean bool = c2082s.f5826a;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "enable";
            } else {
                str = "disable";
            }
            m34315l(hashMap, "sharing", str);
        }
        m34316k(hashMap, "granular_third_party_sharing_options", c2082s.f5827b);
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool2 = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool2);
        m34324c(hashMap, "created_at", this.f5829a);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34326a(hashMap, "needs_response_details", bool2);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public static void m34326a(Map<String, String> map, String str, Boolean bool) {
        if (bool == null) {
            return;
        }
        m34317j(map, str, bool.booleanValue() ? 1L : 0L);
    }

    /* renamed from: b */
    private static void m34325b(Map<String, String> map, String str, Date date) {
        if (date == null) {
            return;
        }
        m34315l(map, str, C2043h1.f5688b.format(date));
    }

    /* renamed from: c */
    private static void m34324c(Map<String, String> map, String str, long j) {
        if (j <= 0) {
            return;
        }
        m34325b(map, str, new Date(j));
    }

    /* renamed from: d */
    private static void m34323d(Map<String, String> map, String str, long j) {
        if (j <= 0) {
            return;
        }
        m34325b(map, str, new Date(j * 1000));
    }

    /* renamed from: e */
    private static void m34322e(Map<String, String> map, String str, Double d) {
        if (d == null) {
            return;
        }
        m34315l(map, str, C2043h1.m34474l("%.5f", d));
    }

    /* renamed from: f */
    private static void m34321f(Map<String, String> map, String str, Double d) {
        if (d == null) {
            return;
        }
        m34315l(map, str, Double.toString(d.doubleValue()));
    }

    /* renamed from: g */
    private static void m34320g(Map<String, String> map, String str, long j) {
        if (j < 0) {
            return;
        }
        m34317j(map, str, (j + 500) / 1000);
    }

    /* renamed from: h */
    private static void m34319h(Map<String, String> map, String str, Integer num) {
        if (num == null) {
            return;
        }
        m34315l(map, str, Integer.toString(num.intValue()));
    }

    /* renamed from: i */
    static void m34318i(Map<String, String> map, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        m34315l(map, str, jSONObject.toString());
    }

    /* renamed from: j */
    public static void m34317j(Map<String, String> map, String str, long j) {
        if (j < 0) {
            return;
        }
        m34315l(map, str, Long.toString(j));
    }

    /* renamed from: k */
    public static void m34316k(Map<String, String> map, String str, Map map2) {
        if (map2 == null || map2.size() == 0) {
            return;
        }
        m34315l(map, str, new JSONObject(map2).toString());
    }

    /* renamed from: l */
    public static void m34315l(Map<String, String> map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    /* renamed from: y */
    private void m34302y(Map<String, String> map) {
        if (map != null && !map.containsKey("mac_sha1") && !map.containsKey("mac_md5") && !map.containsKey("android_id") && !map.containsKey("gps_adid") && !map.containsKey("fire_adid") && !map.containsKey("oaid") && !map.containsKey("imei") && !map.containsKey("meid") && !map.containsKey("device_id") && !map.containsKey("imeis") && !map.containsKey("meids") && !map.containsKey("device_ids")) {
            f5828v.mo34444b("Missing device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
        }
    }

    /* renamed from: z */
    private boolean m34301z(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("fire_adid");
    }

    /* renamed from: H */
    public Map<String, String> m34334H(C2049i c2049i, boolean z) {
        ContentResolver contentResolver = this.f5831c.f5660d.getContentResolver();
        HashMap hashMap = new HashMap();
        Map<String, String> m34192f = C2109y0.m34192f(this.f5831c.f5660d, f5828v);
        if (m34192f != null) {
            hashMap.putAll(m34192f);
        }
        Map<String, String> m34191g = C2109y0.m34191g(this.f5831c.f5660d, f5828v);
        if (m34191g != null) {
            hashMap.putAll(m34191g);
        }
        if (!z) {
            m34316k(hashMap, "callback_params", C2043h1.m34495Y(this.f5833e.f5576a, c2049i.f5700d, "Callback"));
            m34316k(hashMap, "partner_params", C2043h1.m34495Y(this.f5833e.f5577b, c2049i.f5701e, "Partner"));
        }
        this.f5830b.m34226A(this.f5831c.f5660d);
        m34315l(hashMap, "android_uuid", this.f5832d.f5856g);
        m34315l(hashMap, "gps_adid", this.f5830b.f5910a);
        m34317j(hashMap, "gps_adid_attempt", this.f5830b.f5912c);
        m34315l(hashMap, "gps_adid_src", this.f5830b.f5911b);
        m34326a(hashMap, "tracking_enabled", this.f5830b.f5913d);
        m34315l(hashMap, "fire_adid", C2043h1.m34469q(contentResolver));
        m34326a(hashMap, "fire_tracking_enabled", C2043h1.m34468r(contentResolver));
        if (!m34341A(hashMap) && !m34301z(hashMap)) {
            f5828v.mo34445a("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new Object[0]);
            this.f5830b.m34200z(this.f5831c.f5660d);
            m34315l(hashMap, "android_id", this.f5830b.f5917h);
            m34315l(hashMap, "mac_md5", this.f5830b.f5916g);
            m34315l(hashMap, "mac_sha1", this.f5830b.f5915f);
        }
        m34315l(hashMap, "api_level", this.f5830b.f5927r);
        m34315l(hashMap, "app_secret", this.f5831c.f5651B);
        m34315l(hashMap, "app_token", this.f5831c.f5661e);
        m34315l(hashMap, "app_version", this.f5830b.f5921l);
        Boolean bool = Boolean.TRUE;
        m34326a(hashMap, "attribution_deeplink", bool);
        m34317j(hashMap, "connectivity_type", C2043h1.m34471o(this.f5831c.f5660d));
        m34315l(hashMap, "country", this.f5830b.f5929t);
        m34315l(hashMap, "cpu_type", this.f5830b.f5905A);
        m34324c(hashMap, "created_at", this.f5829a);
        m34315l(hashMap, "currency", c2049i.f5699c);
        m34326a(hashMap, "device_known", this.f5831c.f5668l);
        m34326a(hashMap, "needs_cost", this.f5831c.f5654E);
        m34315l(hashMap, "device_manufacturer", this.f5830b.f5924o);
        m34315l(hashMap, "device_name", this.f5830b.f5923n);
        m34315l(hashMap, "device_type", this.f5830b.f5922m);
        m34317j(hashMap, "ui_mode", this.f5830b.f5909E);
        m34315l(hashMap, "display_height", this.f5830b.f5934y);
        m34315l(hashMap, "display_width", this.f5830b.f5933x);
        m34315l(hashMap, "environment", this.f5831c.f5662f);
        m34315l(hashMap, "event_callback_id", c2049i.f5703g);
        m34317j(hashMap, "event_count", this.f5832d.f5850a);
        m34326a(hashMap, "event_buffering_enabled", Boolean.valueOf(this.f5831c.f5665i));
        m34315l(hashMap, "event_token", c2049i.f5697a);
        m34315l(hashMap, "external_device_id", this.f5831c.f5652C);
        m34315l(hashMap, "fb_id", this.f5830b.f5918i);
        m34315l(hashMap, "hardware_name", this.f5830b.f5935z);
        m34315l(hashMap, "language", this.f5830b.f5928s);
        m34315l(hashMap, "mcc", C2043h1.m34462x(this.f5831c.f5660d));
        m34315l(hashMap, "mnc", C2043h1.m34461y(this.f5831c.f5660d));
        m34326a(hashMap, "needs_response_details", bool);
        m34317j(hashMap, "network_type", C2043h1.m34460z(this.f5831c.f5660d));
        m34315l(hashMap, "os_build", this.f5830b.f5906B);
        m34315l(hashMap, "os_name", this.f5830b.f5925p);
        m34315l(hashMap, "os_version", this.f5830b.f5926q);
        m34315l(hashMap, "package_name", this.f5830b.f5920k);
        m34315l(hashMap, "push_token", this.f5832d.f5857h);
        m34322e(hashMap, "revenue", c2049i.f5698b);
        m34315l(hashMap, "screen_density", this.f5830b.f5932w);
        m34315l(hashMap, "screen_format", this.f5830b.f5931v);
        m34315l(hashMap, "screen_size", this.f5830b.f5930u);
        m34315l(hashMap, "secret_id", this.f5831c.f5650A);
        m34317j(hashMap, "session_count", this.f5832d.f5851b);
        m34320g(hashMap, "session_length", this.f5832d.f5855f);
        m34317j(hashMap, "subsession_count", this.f5832d.f5852c);
        m34320g(hashMap, "time_spent", this.f5832d.f5853d);
        m34302y(hashMap);
        return hashMap;
    }

    /* renamed from: m */
    public C2024c m34314m(C2033f c2033f, boolean z) {
        Map<String, String> m34340B = m34340B(c2033f, z);
        EnumC2020b enumC2020b = EnumC2020b.AD_REVENUE;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/ad_revenue");
        m34336F.m34687E("");
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34340B, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34340B);
        if (z) {
            m34336F.m34668s(c2033f.f5618h);
            m34336F.m34689C(c2033f.f5619i);
        }
        return m34336F;
    }

    /* renamed from: n */
    public C2024c m34313n(String str, JSONObject jSONObject) {
        Map<String, String> m34339C = m34339C(str, jSONObject);
        EnumC2020b enumC2020b = EnumC2020b.AD_REVENUE;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/ad_revenue");
        m34336F.m34687E("");
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34339C, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34339C);
        return m34336F;
    }

    /* renamed from: o */
    public C2024c m34312o(String str) {
        Map<String, String> m34338D = m34338D(str);
        EnumC2020b enumC2020b = EnumC2020b.ATTRIBUTION;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("attribution");
        m34336F.m34687E("");
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34338D, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34338D);
        return m34336F;
    }

    /* renamed from: p */
    public C2024c m34311p(String str) {
        Map<String, String> m34337E = m34337E(str);
        EnumC2020b enumC2020b = EnumC2020b.CLICK;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/sdk_click");
        m34336F.m34687E("");
        m34336F.m34667t(this.f5835g);
        m34336F.m34666u(this.f5834f);
        m34336F.m34662y(this.f5836h);
        m34336F.m34665v(this.f5837i);
        m34336F.m34661z(this.f5838j);
        m34336F.m34691A(this.f5842n);
        m34336F.m34663x(this.f5847s);
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34337E, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34337E);
        return m34336F;
    }

    /* renamed from: q */
    public C2024c m34310q() {
        Map<String, String> m34335G = m34335G();
        EnumC2020b enumC2020b = EnumC2020b.DISABLE_THIRD_PARTY_SHARING;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/disable_third_party_sharing");
        m34336F.m34687E("");
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34335G, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34335G);
        return m34336F;
    }

    /* renamed from: r */
    public C2024c m34309r(C2049i c2049i, boolean z) {
        Map<String, String> m34334H = m34334H(c2049i, z);
        EnumC2020b enumC2020b = EnumC2020b.EVENT;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/event");
        m34336F.m34687E(m34333I(c2049i));
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34334H, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34334H);
        if (z) {
            m34336F.m34668s(c2049i.f5700d);
            m34336F.m34689C(c2049i.f5701e);
        }
        return m34336F;
    }

    /* renamed from: s */
    public C2024c m34308s() {
        Map<String, String> m34332J = m34332J();
        EnumC2020b enumC2020b = EnumC2020b.GDPR;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/gdpr_forget_device");
        m34336F.m34687E("");
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34332J, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34332J);
        return m34336F;
    }

    /* renamed from: t */
    public C2024c m34307t(String str) {
        Map<String, String> m34331K = m34331K(str);
        EnumC2020b enumC2020b = EnumC2020b.INFO;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/sdk_info");
        m34336F.m34687E("");
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34331K, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34331K);
        return m34336F;
    }

    /* renamed from: u */
    public C2024c m34306u(boolean z) {
        Map<String, String> m34330L = m34330L(z);
        EnumC2020b enumC2020b = EnumC2020b.MEASUREMENT_CONSENT;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/measurement_consent");
        m34336F.m34687E("");
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34330L, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34330L);
        return m34336F;
    }

    /* renamed from: v */
    public C2024c m34305v(boolean z) {
        Map<String, String> m34329M = m34329M(z);
        EnumC2020b enumC2020b = EnumC2020b.SESSION;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/session");
        m34336F.m34687E("");
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34329M, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34329M);
        return m34336F;
    }

    /* renamed from: w */
    public C2024c m34304w(C2072n c2072n, boolean z) {
        Map<String, String> m34328N = m34328N(c2072n, z);
        EnumC2020b enumC2020b = EnumC2020b.SUBSCRIPTION;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/v2/purchase");
        m34336F.m34687E("");
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34328N, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34328N);
        return m34336F;
    }

    /* renamed from: x */
    public C2024c m34303x(C2082s c2082s) {
        Map<String, String> m34327O = m34327O(c2082s);
        EnumC2020b enumC2020b = EnumC2020b.THIRD_PARTY_SHARING;
        C2024c m34336F = m34336F(enumC2020b);
        m34336F.m34688D("/third_party_sharing");
        m34336F.m34687E("");
        String enumC2020b2 = enumC2020b.toString();
        String m34681f = m34336F.m34681f();
        C2041h c2041h = this.f5831c;
        C2078q.m34344e(m34327O, enumC2020b2, m34681f, c2041h.f5660d, c2041h.f5678v);
        m34336F.m34690B(m34327O);
        return m34336F;
    }
}