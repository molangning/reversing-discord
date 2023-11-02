package io.sentry;

import io.sentry.C8132r4;
import io.sentry.config.InterfaceC7887g;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8276z {

    /* renamed from: a */
    private String f22226a;

    /* renamed from: b */
    private String f22227b;

    /* renamed from: c */
    private String f22228c;

    /* renamed from: d */
    private String f22229d;

    /* renamed from: e */
    private String f22230e;

    /* renamed from: f */
    private Boolean f22231f;

    /* renamed from: g */
    private Boolean f22232g;

    /* renamed from: h */
    private Boolean f22233h;

    /* renamed from: i */
    private Boolean f22234i;

    /* renamed from: j */
    private Double f22235j;

    /* renamed from: k */
    private Double f22236k;

    /* renamed from: l */
    private C8132r4.EnumC8138f f22237l;

    /* renamed from: n */
    private C8132r4.C8137e f22239n;

    /* renamed from: s */
    private String f22244s;

    /* renamed from: t */
    private Long f22245t;

    /* renamed from: v */
    private Boolean f22247v;

    /* renamed from: w */
    private Boolean f22248w;

    /* renamed from: m */
    private final Map<String, String> f22238m = new ConcurrentHashMap();

    /* renamed from: o */
    private final List<String> f22240o = new CopyOnWriteArrayList();

    /* renamed from: p */
    private final List<String> f22241p = new CopyOnWriteArrayList();

    /* renamed from: q */
    private List<String> f22242q = null;

    /* renamed from: r */
    private final List<String> f22243r = new CopyOnWriteArrayList();

    /* renamed from: u */
    private final Set<Class<? extends Throwable>> f22246u = new CopyOnWriteArraySet();

    /* renamed from: x */
    private Set<String> f22249x = new CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static C8276z m18004g(InterfaceC7887g interfaceC7887g, InterfaceC8040o0 interfaceC8040o0) {
        List<String> list;
        C8276z c8276z = new C8276z();
        c8276z.m18026G(interfaceC7887g.getProperty("dsn"));
        c8276z.m18022K(interfaceC7887g.getProperty("environment"));
        c8276z.m18015R(interfaceC7887g.getProperty("release"));
        c8276z.m18027F(interfaceC7887g.getProperty("dist"));
        c8276z.m18013T(interfaceC7887g.getProperty("servername"));
        c8276z.m18023J(interfaceC7887g.mo19458e("uncaught.handler.enabled"));
        c8276z.m18019N(interfaceC7887g.mo19458e("uncaught.handler.print-stacktrace"));
        c8276z.m18024I(interfaceC7887g.mo19458e("enable-tracing"));
        c8276z.m18011V(interfaceC7887g.mo19461b("traces-sample-rate"));
        c8276z.m18018O(interfaceC7887g.mo19461b("profiles-sample-rate"));
        c8276z.m18028E(interfaceC7887g.mo19458e("debug"));
        c8276z.m18025H(interfaceC7887g.mo19458e("enable-deduplication"));
        c8276z.m18014S(interfaceC7887g.mo19458e("send-client-reports"));
        String property = interfaceC7887g.getProperty("max-request-body-size");
        if (property != null) {
            c8276z.m18020M(C8132r4.EnumC8138f.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : interfaceC7887g.getMap("tags").entrySet()) {
            c8276z.m18012U(entry.getKey(), entry.getValue());
        }
        String property2 = interfaceC7887g.getProperty("proxy.host");
        String property3 = interfaceC7887g.getProperty("proxy.user");
        String property4 = interfaceC7887g.getProperty("proxy.pass");
        String mo19460c = interfaceC7887g.mo19460c("proxy.port", "80");
        if (property2 != null) {
            c8276z.m18016Q(new C8132r4.C8137e(property2, mo19460c, property3, property4));
        }
        for (String str : interfaceC7887g.mo19459d("in-app-includes")) {
            c8276z.m18006e(str);
        }
        for (String str2 : interfaceC7887g.mo19459d("in-app-excludes")) {
            c8276z.m18007d(str2);
        }
        if (interfaceC7887g.getProperty("trace-propagation-targets") != null) {
            list = interfaceC7887g.mo19459d("trace-propagation-targets");
        } else {
            list = null;
        }
        if (list == null && interfaceC7887g.getProperty("tracing-origins") != null) {
            list = interfaceC7887g.mo19459d("tracing-origins");
        }
        if (list != null) {
            for (String str3 : list) {
                c8276z.m18005f(str3);
            }
        }
        for (String str4 : interfaceC7887g.mo19459d("context-tags")) {
            c8276z.m18009b(str4);
        }
        c8276z.m18017P(interfaceC7887g.getProperty("proguard-uuid"));
        for (String str5 : interfaceC7887g.mo19459d("bundle-ids")) {
            c8276z.m18010a(str5);
        }
        c8276z.m18021L(interfaceC7887g.mo19462a("idle-timeout"));
        for (String str6 : interfaceC7887g.mo19459d("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str6);
                if (Throwable.class.isAssignableFrom(cls)) {
                    c8276z.m18008c(cls);
                } else {
                    interfaceC8040o0.mo18135c(EnumC8021m4.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str6, str6);
                }
            } catch (ClassNotFoundException unused) {
                interfaceC8040o0.mo18135c(EnumC8021m4.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str6, str6);
            }
        }
        return c8276z;
    }

    /* renamed from: A */
    public String m18032A() {
        return this.f22230e;
    }

    /* renamed from: B */
    public Map<String, String> m18031B() {
        return this.f22238m;
    }

    /* renamed from: C */
    public List<String> m18030C() {
        return this.f22242q;
    }

    /* renamed from: D */
    public Double m18029D() {
        return this.f22235j;
    }

    /* renamed from: E */
    public void m18028E(Boolean bool) {
        this.f22232g = bool;
    }

    /* renamed from: F */
    public void m18027F(String str) {
        this.f22229d = str;
    }

    /* renamed from: G */
    public void m18026G(String str) {
        this.f22226a = str;
    }

    /* renamed from: H */
    public void m18025H(Boolean bool) {
        this.f22233h = bool;
    }

    /* renamed from: I */
    public void m18024I(Boolean bool) {
        this.f22234i = bool;
    }

    /* renamed from: J */
    public void m18023J(Boolean bool) {
        this.f22231f = bool;
    }

    /* renamed from: K */
    public void m18022K(String str) {
        this.f22227b = str;
    }

    /* renamed from: L */
    public void m18021L(Long l) {
        this.f22245t = l;
    }

    /* renamed from: M */
    public void m18020M(C8132r4.EnumC8138f enumC8138f) {
        this.f22237l = enumC8138f;
    }

    /* renamed from: N */
    public void m18019N(Boolean bool) {
        this.f22247v = bool;
    }

    /* renamed from: O */
    public void m18018O(Double d) {
        this.f22236k = d;
    }

    /* renamed from: P */
    public void m18017P(String str) {
        this.f22244s = str;
    }

    /* renamed from: Q */
    public void m18016Q(C8132r4.C8137e c8137e) {
        this.f22239n = c8137e;
    }

    /* renamed from: R */
    public void m18015R(String str) {
        this.f22228c = str;
    }

    /* renamed from: S */
    public void m18014S(Boolean bool) {
        this.f22248w = bool;
    }

    /* renamed from: T */
    public void m18013T(String str) {
        this.f22230e = str;
    }

    /* renamed from: U */
    public void m18012U(String str, String str2) {
        this.f22238m.put(str, str2);
    }

    /* renamed from: V */
    public void m18011V(Double d) {
        this.f22235j = d;
    }

    /* renamed from: a */
    public void m18010a(String str) {
        this.f22249x.add(str);
    }

    /* renamed from: b */
    public void m18009b(String str) {
        this.f22243r.add(str);
    }

    /* renamed from: c */
    public void m18008c(Class<? extends Throwable> cls) {
        this.f22246u.add(cls);
    }

    /* renamed from: d */
    public void m18007d(String str) {
        this.f22240o.add(str);
    }

    /* renamed from: e */
    public void m18006e(String str) {
        this.f22241p.add(str);
    }

    /* renamed from: f */
    public void m18005f(String str) {
        if (this.f22242q == null) {
            this.f22242q = new CopyOnWriteArrayList();
        }
        if (!str.isEmpty()) {
            this.f22242q.add(str);
        }
    }

    /* renamed from: h */
    public Set<String> m18003h() {
        return this.f22249x;
    }

    /* renamed from: i */
    public List<String> m18002i() {
        return this.f22243r;
    }

    /* renamed from: j */
    public Boolean m18001j() {
        return this.f22232g;
    }

    /* renamed from: k */
    public String m18000k() {
        return this.f22229d;
    }

    /* renamed from: l */
    public String m17999l() {
        return this.f22226a;
    }

    /* renamed from: m */
    public Boolean m17998m() {
        return this.f22233h;
    }

    /* renamed from: n */
    public Boolean m17997n() {
        return this.f22234i;
    }

    /* renamed from: o */
    public Boolean m17996o() {
        return this.f22231f;
    }

    /* renamed from: p */
    public String m17995p() {
        return this.f22227b;
    }

    /* renamed from: q */
    public Long m17994q() {
        return this.f22245t;
    }

    /* renamed from: r */
    public Set<Class<? extends Throwable>> m17993r() {
        return this.f22246u;
    }

    /* renamed from: s */
    public List<String> m17992s() {
        return this.f22240o;
    }

    /* renamed from: t */
    public List<String> m17991t() {
        return this.f22241p;
    }

    /* renamed from: u */
    public Boolean m17990u() {
        return this.f22247v;
    }

    /* renamed from: v */
    public Double m17989v() {
        return this.f22236k;
    }

    /* renamed from: w */
    public String m17988w() {
        return this.f22244s;
    }

    /* renamed from: x */
    public C8132r4.C8137e m17987x() {
        return this.f22239n;
    }

    /* renamed from: y */
    public String m17986y() {
        return this.f22228c;
    }

    /* renamed from: z */
    public Boolean m17985z() {
        return this.f22248w;
    }
}