package p021b1;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: b1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2049i {

    /* renamed from: h */
    private static InterfaceC2025c0 f5696h = C2055l.m34422j();

    /* renamed from: a */
    String f5697a;

    /* renamed from: b */
    Double f5698b;

    /* renamed from: c */
    String f5699c;

    /* renamed from: d */
    Map<String, String> f5700d;

    /* renamed from: e */
    Map<String, String> f5701e;

    /* renamed from: f */
    String f5702f;

    /* renamed from: g */
    String f5703g;

    public C2049i(String str) {
        if (!m34452c(str, f5696h)) {
            return;
        }
        this.f5697a = str;
    }

    /* renamed from: c */
    private static boolean m34452c(String str, InterfaceC2025c0 interfaceC2025c0) {
        if (str == null) {
            interfaceC2025c0.mo34444b("Missing Event Token", new Object[0]);
            return false;
        } else if (str.length() <= 0) {
            interfaceC2025c0.mo34444b("Event Token can't be empty", new Object[0]);
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    private boolean m34451d(Double d, String str) {
        if (d != null) {
            if (d.doubleValue() < 0.0d) {
                f5696h.mo34444b("Invalid amount %.5f", d);
                return false;
            } else if (str == null) {
                f5696h.mo34444b("Currency must be set with revenue", new Object[0]);
                return false;
            } else if (str.equals("")) {
                f5696h.mo34444b("Currency is empty", new Object[0]);
                return false;
            }
        } else if (str != null) {
            f5696h.mo34444b("Revenue must be set with currency", new Object[0]);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m34454a(String str, String str2) {
        if (!C2043h1.m34497W(str, "key", "Callback") || !C2043h1.m34497W(str2, "value", "Callback")) {
            return;
        }
        if (this.f5700d == null) {
            this.f5700d = new LinkedHashMap();
        }
        if (this.f5700d.put(str, str2) != null) {
            f5696h.mo34445a("Key %s was overwritten", str);
        }
    }

    /* renamed from: b */
    public void m34453b(String str, String str2) {
        if (!C2043h1.m34497W(str, "key", "Partner") || !C2043h1.m34497W(str2, "value", "Partner")) {
            return;
        }
        if (this.f5701e == null) {
            this.f5701e = new LinkedHashMap();
        }
        if (this.f5701e.put(str, str2) != null) {
            f5696h.mo34445a("Key %s was overwritten", str);
        }
    }

    /* renamed from: e */
    public boolean m34450e() {
        return this.f5697a != null;
    }

    /* renamed from: f */
    public void m34449f(String str) {
        this.f5703g = str;
    }

    /* renamed from: g */
    public void m34448g(String str) {
        this.f5702f = str;
    }

    /* renamed from: h */
    public void m34447h(double d, String str) {
        if (!m34451d(Double.valueOf(d), str)) {
            return;
        }
        this.f5698b = Double.valueOf(d);
        this.f5699c = str;
    }
}
