package p021b1;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: b1.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2072n {

    /* renamed from: k */
    private static InterfaceC2025c0 f5789k = C2055l.m34422j();

    /* renamed from: a */
    private long f5790a;

    /* renamed from: b */
    private String f5791b;

    /* renamed from: c */
    private String f5792c;

    /* renamed from: d */
    private String f5793d;

    /* renamed from: e */
    private String f5794e;

    /* renamed from: f */
    private String f5795f;

    /* renamed from: i */
    private Map<String, String> f5798i;

    /* renamed from: j */
    private Map<String, String> f5799j;

    /* renamed from: h */
    private long f5797h = -1;

    /* renamed from: g */
    private String f5796g = "GooglePlay";

    public C2072n(long j, String str, String str2, String str3, String str4, String str5) {
        this.f5790a = j;
        this.f5791b = str;
        this.f5792c = str2;
        this.f5793d = str3;
        this.f5794e = str4;
        this.f5795f = str5;
    }

    /* renamed from: a */
    public void m34361a(String str, String str2) {
        if (!C2043h1.m34497W(str, "key", "Callback") || !C2043h1.m34497W(str2, "value", "Callback")) {
            return;
        }
        if (this.f5798i == null) {
            this.f5798i = new LinkedHashMap();
        }
        if (this.f5798i.put(str, str2) != null) {
            f5789k.mo34445a("Key %s was overwritten", str);
        }
    }

    /* renamed from: b */
    public void m34360b(String str, String str2) {
        if (!C2043h1.m34497W(str, "key", "Partner") || !C2043h1.m34497W(str2, "value", "Partner")) {
            return;
        }
        if (this.f5799j == null) {
            this.f5799j = new LinkedHashMap();
        }
        if (this.f5799j.put(str, str2) != null) {
            f5789k.mo34445a("Key %s was overwritten", str);
        }
    }

    /* renamed from: c */
    public String m34359c() {
        return this.f5796g;
    }

    /* renamed from: d */
    public Map<String, String> m34358d() {
        return this.f5798i;
    }

    /* renamed from: e */
    public String m34357e() {
        return this.f5791b;
    }

    /* renamed from: f */
    public String m34356f() {
        return this.f5793d;
    }

    /* renamed from: g */
    public Map<String, String> m34355g() {
        return this.f5799j;
    }

    /* renamed from: h */
    public long m34354h() {
        return this.f5790a;
    }

    /* renamed from: i */
    public long m34353i() {
        return this.f5797h;
    }

    /* renamed from: j */
    public String m34352j() {
        return this.f5795f;
    }

    /* renamed from: k */
    public String m34351k() {
        return this.f5794e;
    }

    /* renamed from: l */
    public String m34350l() {
        return this.f5792c;
    }

    /* renamed from: m */
    public void m34349m(long j) {
        this.f5797h = j;
    }
}