package p021b1;

import android.content.Context;
import p021b1.C2057m;

/* renamed from: b1.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2041h {

    /* renamed from: A */
    String f5650A;

    /* renamed from: B */
    String f5651B;

    /* renamed from: C */
    String f5652C;

    /* renamed from: D */
    boolean f5653D;

    /* renamed from: E */
    Boolean f5654E;

    /* renamed from: F */
    String f5655F;

    /* renamed from: G */
    String f5656G;

    /* renamed from: a */
    String f5657a;

    /* renamed from: b */
    String f5658b;

    /* renamed from: c */
    String f5659c;

    /* renamed from: d */
    Context f5660d;

    /* renamed from: e */
    String f5661e;

    /* renamed from: f */
    String f5662f;

    /* renamed from: g */
    String f5663g;

    /* renamed from: h */
    String f5664h;

    /* renamed from: i */
    boolean f5665i;

    /* renamed from: j */
    String f5666j;

    /* renamed from: k */
    InterfaceC2071m0 f5667k;

    /* renamed from: l */
    Boolean f5668l;

    /* renamed from: m */
    Class f5669m;

    /* renamed from: n */
    InterfaceC2079q0 f5670n;

    /* renamed from: o */
    InterfaceC2077p0 f5671o;

    /* renamed from: p */
    InterfaceC2083s0 f5672p;

    /* renamed from: q */
    InterfaceC2081r0 f5673q;

    /* renamed from: r */
    InterfaceC2073n0 f5674r;

    /* renamed from: s */
    boolean f5675s;

    /* renamed from: t */
    Double f5676t;

    /* renamed from: u */
    C2057m.C2070m f5677u;

    /* renamed from: v */
    InterfaceC2025c0 f5678v;

    /* renamed from: w */
    String f5679w;

    /* renamed from: x */
    String f5680x;

    /* renamed from: y */
    Boolean f5681y;

    /* renamed from: z */
    boolean f5682z;

    public C2041h(Context context, String str, String str2, boolean z) {
        m34545d(context, str, str2, z);
    }

    /* renamed from: a */
    private boolean m34548a(String str) {
        if (str == null) {
            this.f5678v.mo34444b("Missing App Token", new Object[0]);
            return false;
        } else if (str.length() == 12) {
            return true;
        } else {
            this.f5678v.mo34444b("Malformed App Token '%s'", str);
            return false;
        }
    }

    /* renamed from: b */
    private boolean m34547b(Context context) {
        if (context == null) {
            this.f5678v.mo34444b("Missing context", new Object[0]);
            return false;
        } else if (!C2043h1.m34491b(context, "android.permission.INTERNET")) {
            this.f5678v.mo34444b("Missing permission: INTERNET", new Object[0]);
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    private boolean m34546c(String str) {
        if (str == null) {
            this.f5678v.mo34444b("Missing environment", new Object[0]);
            return false;
        } else if (str.equals("sandbox")) {
            this.f5678v.mo34441e("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
            return true;
        } else if (str.equals("production")) {
            this.f5678v.mo34441e("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
            return true;
        } else {
            this.f5678v.mo34444b("Unknown environment '%s'", str);
            return false;
        }
    }

    /* renamed from: d */
    private void m34545d(Context context, String str, String str2, boolean z) {
        this.f5678v = C2055l.m34422j();
        if (z && "production".equals(str2)) {
            m34536m(EnumC2052j0.SUPRESS, str2);
        } else {
            m34536m(EnumC2052j0.INFO, str2);
        }
        if (context != null) {
            context = context.getApplicationContext();
        }
        this.f5660d = context;
        this.f5661e = str;
        this.f5662f = str2;
        this.f5665i = false;
        this.f5675s = false;
        this.f5653D = false;
    }

    /* renamed from: m */
    private void m34536m(EnumC2052j0 enumC2052j0, String str) {
        this.f5678v.mo34440f(enumC2052j0, "production".equals(str));
    }

    /* renamed from: A */
    public void m34549A(String str) {
        this.f5679w = str;
    }

    /* renamed from: e */
    public boolean m34544e() {
        if (!m34548a(this.f5661e) || !m34546c(this.f5662f) || !m34547b(this.f5660d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void m34543f(long j, long j2, long j3, long j4, long j5) {
        this.f5650A = C2043h1.m34474l("%d", Long.valueOf(j));
        this.f5651B = C2043h1.m34474l("%d%d%d%d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5));
    }

    /* renamed from: g */
    public void m34542g(String str) {
        this.f5666j = str;
    }

    /* renamed from: h */
    public void m34541h(double d) {
        this.f5676t = Double.valueOf(d);
    }

    /* renamed from: i */
    public void m34540i(boolean z) {
        this.f5668l = Boolean.valueOf(z);
    }

    /* renamed from: j */
    public void m34539j(Boolean bool) {
        if (bool == null) {
            this.f5665i = false;
        } else {
            this.f5665i = bool.booleanValue();
        }
    }

    /* renamed from: k */
    public void m34538k(String str) {
        this.f5652C = str;
    }

    /* renamed from: l */
    public void m34537l(EnumC2052j0 enumC2052j0) {
        m34536m(enumC2052j0, this.f5662f);
    }

    /* renamed from: n */
    public void m34535n(boolean z) {
        this.f5654E = Boolean.valueOf(z);
    }

    /* renamed from: o */
    public void m34534o(InterfaceC2071m0 interfaceC2071m0) {
        this.f5667k = interfaceC2071m0;
    }

    /* renamed from: p */
    public void m34533p(InterfaceC2073n0 interfaceC2073n0) {
        this.f5674r = interfaceC2073n0;
    }

    /* renamed from: q */
    public void m34532q(InterfaceC2077p0 interfaceC2077p0) {
        this.f5671o = interfaceC2077p0;
    }

    /* renamed from: r */
    public void m34531r(InterfaceC2079q0 interfaceC2079q0) {
        this.f5670n = interfaceC2079q0;
    }

    /* renamed from: s */
    public void m34530s(InterfaceC2081r0 interfaceC2081r0) {
        this.f5673q = interfaceC2081r0;
    }

    /* renamed from: t */
    public void m34529t(InterfaceC2083s0 interfaceC2083s0) {
        this.f5672p = interfaceC2083s0;
    }

    /* renamed from: u */
    public void m34528u(String str) {
        this.f5656G = str;
    }

    /* renamed from: v */
    public void m34527v(boolean z) {
        this.f5653D = z;
    }

    /* renamed from: w */
    public void m34526w(String str) {
        this.f5663g = str;
    }

    /* renamed from: x */
    public void m34525x(String str) {
        this.f5664h = str;
    }

    /* renamed from: y */
    public void m34524y(boolean z) {
        this.f5675s = z;
    }

    /* renamed from: z */
    public void m34523z(String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.equals("url_strategy_india") && !str.equals("url_strategy_china") && !str.equals("data_residency_eu") && !str.equals("data_residency_tr") && !str.equals("data_residency_us")) {
                this.f5678v.mo34445a("Unrecognised url strategy %s", str);
            }
            this.f5655F = str;
            return;
        }
        this.f5678v.mo34444b("Invalid url strategy", new Object[0]);
    }
}