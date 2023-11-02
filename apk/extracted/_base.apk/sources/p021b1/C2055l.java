package p021b1;

import android.content.Context;
import p034c1.C2384d;
import p034c1.InterfaceC2381b;

/* renamed from: b1.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2055l {

    /* renamed from: a */
    private static InterfaceC2028d0 f5730a = null;

    /* renamed from: b */
    private static InterfaceC2022b0 f5731b = null;

    /* renamed from: c */
    private static InterfaceC2013a0 f5732c = null;

    /* renamed from: d */
    private static InterfaceC2025c0 f5733d = null;

    /* renamed from: e */
    private static InterfaceC2034f0 f5734e = null;

    /* renamed from: f */
    private static long f5735f = -1;

    /* renamed from: g */
    private static long f5736g = -1;

    /* renamed from: h */
    private static long f5737h = -1;

    /* renamed from: i */
    private static long f5738i = -1;

    /* renamed from: j */
    private static EnumC2104w f5739j = null;

    /* renamed from: k */
    private static EnumC2104w f5740k = null;

    /* renamed from: l */
    private static EnumC2104w f5741l = null;

    /* renamed from: m */
    private static long f5742m = -1;

    /* renamed from: n */
    private static String f5743n = null;

    /* renamed from: o */
    private static String f5744o = null;

    /* renamed from: p */
    private static String f5745p = null;

    /* renamed from: q */
    private static C2384d.InterfaceC2387c f5746q = null;

    /* renamed from: r */
    private static C2384d.InterfaceC2388d f5747r = null;

    /* renamed from: s */
    private static boolean f5748s = true;

    /* renamed from: A */
    public static void m34437A(String str) {
        f5745p = str;
    }

    /* renamed from: B */
    public static void m34436B(long j) {
        f5738i = j;
    }

    /* renamed from: C */
    public static void m34435C(long j) {
        f5735f = j;
    }

    /* renamed from: D */
    public static void m34434D(long j) {
        f5736g = j;
    }

    /* renamed from: E */
    public static void m34433E(boolean z) {
        f5748s = z;
    }

    /* renamed from: F */
    public static void m34432F(Context context) {
        if (context != null) {
            C1967a.m34853M0(context);
            C2096v0.m34252r(context);
        }
        f5730a = null;
        f5731b = null;
        f5732c = null;
        f5733d = null;
        f5734e = null;
        f5735f = -1L;
        f5736g = -1L;
        f5737h = -1L;
        f5738i = -1L;
        f5739j = null;
        f5740k = null;
        f5742m = -1L;
        f5743n = "https://app.adjust.com";
        f5744o = "https://gdpr.adjust.com";
        f5745p = "https://subscription.adjust.com";
        f5746q = null;
        f5747r = null;
        f5748s = true;
    }

    /* renamed from: a */
    public static void m34431a() {
        C2078q.m34348a(m34422j());
    }

    /* renamed from: b */
    public static void m34430b() {
        C2078q.m34347b(m34422j());
    }

    /* renamed from: c */
    public static InterfaceC2013a0 m34429c(C2041h c2041h) {
        InterfaceC2013a0 interfaceC2013a0 = f5732c;
        if (interfaceC2013a0 == null) {
            return C1967a.m34835S0(c2041h);
        }
        interfaceC2013a0.mo34732F(c2041h);
        return f5732c;
    }

    /* renamed from: d */
    public static InterfaceC2022b0 m34428d(InterfaceC2013a0 interfaceC2013a0, boolean z, InterfaceC2381b interfaceC2381b) {
        InterfaceC2022b0 interfaceC2022b0 = f5731b;
        if (interfaceC2022b0 == null) {
            return new C2087u(interfaceC2013a0, z, interfaceC2381b);
        }
        interfaceC2022b0.mo34296e(interfaceC2013a0, z, interfaceC2381b);
        return f5731b;
    }

    /* renamed from: e */
    public static String m34427e() {
        return f5743n;
    }

    /* renamed from: f */
    public static C2384d.InterfaceC2387c m34426f() {
        C2384d.InterfaceC2387c interfaceC2387c = f5746q;
        if (interfaceC2387c == null) {
            return C2384d.m33538b();
        }
        return interfaceC2387c;
    }

    /* renamed from: g */
    public static String m34425g() {
        return f5744o;
    }

    /* renamed from: h */
    public static C2384d.InterfaceC2388d m34424h() {
        C2384d.InterfaceC2388d interfaceC2388d = f5747r;
        if (interfaceC2388d == null) {
            return C2384d.m33537c();
        }
        return interfaceC2388d;
    }

    /* renamed from: i */
    public static EnumC2104w m34423i() {
        EnumC2104w enumC2104w = f5741l;
        if (enumC2104w == null) {
            return EnumC2104w.SHORT_WAIT;
        }
        return enumC2104w;
    }

    /* renamed from: j */
    public static InterfaceC2025c0 m34422j() {
        if (f5733d == null) {
            f5733d = new C2054k0();
        }
        return f5733d;
    }

    /* renamed from: k */
    public static long m34421k() {
        long j = f5742m;
        if (j == -1) {
            return 10000L;
        }
        return j;
    }

    /* renamed from: l */
    public static InterfaceC2028d0 m34420l(InterfaceC2013a0 interfaceC2013a0, Context context, boolean z, InterfaceC2381b interfaceC2381b) {
        InterfaceC2028d0 interfaceC2028d0 = f5730a;
        if (interfaceC2028d0 == null) {
            return new C2096v0(interfaceC2013a0, context, z, interfaceC2381b);
        }
        interfaceC2028d0.mo34265d(interfaceC2013a0, context, z, interfaceC2381b);
        return f5730a;
    }

    /* renamed from: m */
    public static EnumC2104w m34419m() {
        EnumC2104w enumC2104w = f5740k;
        if (enumC2104w == null) {
            return EnumC2104w.LONG_WAIT;
        }
        return enumC2104w;
    }

    /* renamed from: n */
    public static EnumC2104w m34418n() {
        EnumC2104w enumC2104w = f5739j;
        if (enumC2104w == null) {
            return EnumC2104w.SHORT_WAIT;
        }
        return enumC2104w;
    }

    /* renamed from: o */
    public static InterfaceC2034f0 m34417o(InterfaceC2013a0 interfaceC2013a0, boolean z, InterfaceC2381b interfaceC2381b) {
        InterfaceC2034f0 interfaceC2034f0 = f5734e;
        if (interfaceC2034f0 == null) {
            return new C2014a1(interfaceC2013a0, z, interfaceC2381b);
        }
        interfaceC2034f0.mo34574e(interfaceC2013a0, z, interfaceC2381b);
        return f5734e;
    }

    /* renamed from: p */
    public static long m34416p() {
        long j = f5737h;
        if (j == -1) {
            return 1800000L;
        }
        return j;
    }

    /* renamed from: q */
    public static String m34415q() {
        return f5745p;
    }

    /* renamed from: r */
    public static long m34414r() {
        long j = f5738i;
        if (j == -1) {
            return 1000L;
        }
        return j;
    }

    /* renamed from: s */
    public static long m34413s() {
        long j = f5735f;
        if (j == -1) {
            return 60000L;
        }
        return j;
    }

    /* renamed from: t */
    public static long m34412t() {
        long j = f5736g;
        if (j == -1) {
            return 60000L;
        }
        return j;
    }

    /* renamed from: u */
    public static boolean m34411u() {
        return f5748s;
    }

    /* renamed from: v */
    public static void m34410v(String str) {
        f5743n = str;
    }

    /* renamed from: w */
    public static void m34409w(String str) {
        f5744o = str;
    }

    /* renamed from: x */
    public static void m34408x(EnumC2104w enumC2104w) {
        f5740k = enumC2104w;
    }

    /* renamed from: y */
    public static void m34407y(EnumC2104w enumC2104w) {
        f5739j = enumC2104w;
    }

    /* renamed from: z */
    public static void m34406z(long j) {
        f5737h = j;
    }
}
