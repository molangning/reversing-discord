package p021b1;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: b1.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2033f {

    /* renamed from: j */
    private static final InterfaceC2025c0 f5610j = C2055l.m34422j();

    /* renamed from: a */
    String f5611a;

    /* renamed from: b */
    Double f5612b;

    /* renamed from: c */
    String f5613c;

    /* renamed from: d */
    Integer f5614d;

    /* renamed from: e */
    String f5615e;

    /* renamed from: f */
    String f5616f;

    /* renamed from: g */
    String f5617g;

    /* renamed from: h */
    Map<String, String> f5618h;

    /* renamed from: i */
    Map<String, String> f5619i;

    public C2033f(String str) {
        if (!m34584d(str)) {
            return;
        }
        this.f5611a = str;
    }

    /* renamed from: d */
    private boolean m34584d(String str) {
        if (str == null) {
            f5610j.mo34444b("Missing source", new Object[0]);
            return false;
        } else if (str.isEmpty()) {
            f5610j.mo34444b("Source can't be empty", new Object[0]);
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public void m34587a(String str, String str2) {
        if (!C2043h1.m34497W(str, "key", "Callback") || !C2043h1.m34497W(str2, "value", "Callback")) {
            return;
        }
        if (this.f5618h == null) {
            this.f5618h = new LinkedHashMap();
        }
        if (this.f5618h.put(str, str2) != null) {
            f5610j.mo34445a("Key %s was overwritten", str);
        }
    }

    /* renamed from: b */
    public void m34586b(String str, String str2) {
        if (!C2043h1.m34497W(str, "key", "Partner") || !C2043h1.m34497W(str2, "value", "Partner")) {
            return;
        }
        if (this.f5619i == null) {
            this.f5619i = new LinkedHashMap();
        }
        if (this.f5619i.put(str, str2) != null) {
            f5610j.mo34445a("Key %s was overwritten", str);
        }
    }

    /* renamed from: c */
    public boolean m34585c() {
        return m34584d(this.f5611a);
    }

    /* renamed from: e */
    public void m34583e(Integer num) {
        this.f5614d = num;
    }

    /* renamed from: f */
    public void m34582f(String str) {
        this.f5615e = str;
    }

    /* renamed from: g */
    public void m34581g(String str) {
        this.f5617g = str;
    }

    /* renamed from: h */
    public void m34580h(String str) {
        this.f5616f = str;
    }

    /* renamed from: i */
    public void m34579i(Double d, String str) {
        this.f5612b = d;
        this.f5613c = str;
    }
}