package io.sentry;

import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8100q;
import io.sentry.protocol.EnumC8118z;
import io.sentry.util.C8232r;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7891d {

    /* renamed from: e */
    static final Integer f21501e = 8192;

    /* renamed from: f */
    static final Integer f21502f = 64;

    /* renamed from: a */
    final Map<String, String> f21503a;

    /* renamed from: b */
    final String f21504b;

    /* renamed from: c */
    private boolean f21505c;

    /* renamed from: d */
    final InterfaceC8040o0 f21506d;

    /* renamed from: io.sentry.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7892a {

        /* renamed from: a */
        public static final List<String> f21507a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-user_segment", "sentry-transaction", "sentry-sample_rate");
    }

    public C7891d(InterfaceC8040o0 interfaceC8040o0) {
        this(new HashMap(), null, true, interfaceC8040o0);
    }

    /* renamed from: b */
    public static C7891d m19452b(C7923f4 c7923f4, C8132r4 c8132r4) {
        String str;
        String str2;
        C7891d c7891d = new C7891d(c8132r4.getLogger());
        C7911e5 m18798f = c7923f4.m19270C().m18798f();
        if (m18798f != null) {
            str = m18798f.m19295k().toString();
        } else {
            str = null;
        }
        c7891d.m19430x(str);
        c7891d.m19433u(new C8119q(c8132r4.getDsn()).m18479a());
        c7891d.m19432v(c7923f4.m19263J());
        c7891d.m19434t(c7923f4.m19267F());
        C8062a0 m19256Q = c7923f4.m19256Q();
        if (m19256Q != null) {
            str2 = m19445i(m19256Q);
        } else {
            str2 = null;
        }
        c7891d.m19428z(str2);
        c7891d.m19429y(c7923f4.m19193t0());
        c7891d.m19431w(null);
        c7891d.m19453a();
        return c7891d;
    }

    /* renamed from: i */
    private static String m19445i(C8062a0 c8062a0) {
        if (c8062a0.m18818n() != null) {
            return c8062a0.m18818n();
        }
        Map<String, String> m18822j = c8062a0.m18822j();
        if (m18822j != null) {
            return m18822j.get("segment");
        }
        return null;
    }

    /* renamed from: o */
    private static boolean m19439o(EnumC8118z enumC8118z) {
        if (enumC8118z != null && !EnumC8118z.URL.equals(enumC8118z)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private static Double m19437q(C8054p5 c8054p5) {
        if (c8054p5 == null) {
            return null;
        }
        return c8054p5.m18861b();
    }

    /* renamed from: r */
    private static String m19436r(Double d) {
        if (!C8232r.m18160e(d, false)) {
            return null;
        }
        return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d);
    }

    /* renamed from: A */
    public void m19456A(Scope scope, C8132r4 c8132r4) {
        String str;
        C8051p2 m20066p = scope.m20066p();
        C8062a0 m20059w = scope.m20059w();
        m19430x(m20066p.m18871e().toString());
        m19433u(new C8119q(c8132r4.getDsn()).m18479a());
        m19432v(c8132r4.getRelease());
        m19434t(c8132r4.getEnvironment());
        if (m20059w != null) {
            str = m19445i(m20059w);
        } else {
            str = null;
        }
        m19428z(str);
        m19429y(null);
        m19431w(null);
    }

    /* renamed from: B */
    public void m19455B(InterfaceC8259w0 interfaceC8259w0, C8062a0 c8062a0, C8132r4 c8132r4, C8054p5 c8054p5) {
        String str;
        m19430x(interfaceC8259w0.mo17936p().m19295k().toString());
        m19433u(new C8119q(c8132r4.getDsn()).m18479a());
        m19432v(c8132r4.getRelease());
        m19434t(c8132r4.getEnvironment());
        String str2 = null;
        if (c8062a0 != null) {
            str = m19445i(c8062a0);
        } else {
            str = null;
        }
        m19428z(str);
        if (m19439o(interfaceC8259w0.mo17945g())) {
            str2 = interfaceC8259w0.getName();
        }
        m19429y(str2);
        m19431w(m19436r(m19437q(c8054p5)));
    }

    /* renamed from: C */
    public C8034n5 m19454C() {
        String m19444j = m19444j();
        String m19449e = m19449e();
        if (m19444j != null && m19449e != null) {
            C8034n5 c8034n5 = new C8034n5(new C8100q(m19444j), m19449e, m19448f(), m19450d(), m19441m(), m19440n(), m19443k(), m19447g());
            c8034n5.m18927b(m19442l());
            return c8034n5;
        }
        return null;
    }

    /* renamed from: a */
    public void m19453a() {
        this.f21505c = false;
    }

    /* renamed from: c */
    public String m19451c(String str) {
        if (str == null) {
            return null;
        }
        return this.f21503a.get(str);
    }

    /* renamed from: d */
    public String m19450d() {
        return m19451c("sentry-environment");
    }

    /* renamed from: e */
    public String m19449e() {
        return m19451c("sentry-public_key");
    }

    /* renamed from: f */
    public String m19448f() {
        return m19451c("sentry-release");
    }

    /* renamed from: g */
    public String m19447g() {
        return m19451c("sentry-sample_rate");
    }

    /* renamed from: h */
    public Double m19446h() {
        String m19447g = m19447g();
        if (m19447g != null) {
            try {
                double parseDouble = Double.parseDouble(m19447g);
                if (C8232r.m18160e(Double.valueOf(parseDouble), false)) {
                    return Double.valueOf(parseDouble);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: j */
    public String m19444j() {
        return m19451c("sentry-trace_id");
    }

    /* renamed from: k */
    public String m19443k() {
        return m19451c("sentry-transaction");
    }

    /* renamed from: l */
    public Map<String, Object> m19442l() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : this.f21503a.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!C7892a.f21507a.contains(key) && value != null) {
                concurrentHashMap.put(key.replaceFirst("sentry-", ""), value);
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: m */
    public String m19441m() {
        return m19451c("sentry-user_id");
    }

    /* renamed from: n */
    public String m19440n() {
        return m19451c("sentry-user_segment");
    }

    /* renamed from: p */
    public boolean m19438p() {
        return this.f21505c;
    }

    /* renamed from: s */
    public void m19435s(String str, String str2) {
        if (this.f21505c) {
            this.f21503a.put(str, str2);
        }
    }

    /* renamed from: t */
    public void m19434t(String str) {
        m19435s("sentry-environment", str);
    }

    /* renamed from: u */
    public void m19433u(String str) {
        m19435s("sentry-public_key", str);
    }

    /* renamed from: v */
    public void m19432v(String str) {
        m19435s("sentry-release", str);
    }

    /* renamed from: w */
    public void m19431w(String str) {
        m19435s("sentry-sample_rate", str);
    }

    /* renamed from: x */
    public void m19430x(String str) {
        m19435s("sentry-trace_id", str);
    }

    /* renamed from: y */
    public void m19429y(String str) {
        m19435s("sentry-transaction", str);
    }

    /* renamed from: z */
    public void m19428z(String str) {
        m19435s("sentry-user_segment", str);
    }

    public C7891d(C7891d c7891d) {
        this(c7891d.f21503a, c7891d.f21504b, c7891d.f21505c, c7891d.f21506d);
    }

    public C7891d(Map<String, String> map, String str, boolean z, InterfaceC8040o0 interfaceC8040o0) {
        this.f21503a = map;
        this.f21506d = interfaceC8040o0;
        this.f21505c = z;
        this.f21504b = str;
    }
}