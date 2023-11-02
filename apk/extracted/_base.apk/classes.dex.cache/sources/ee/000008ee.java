package p021b1;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;

/* renamed from: b1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2030e {

    /* renamed from: a */
    private static C2057m f5608a;

    /* renamed from: A */
    public static void m34653A(C2033f c2033f) {
        m34638j().m34394H(c2033f);
    }

    /* renamed from: B */
    public static void m34652B(String str, JSONObject jSONObject) {
        m34638j().m34393I(str, jSONObject);
    }

    /* renamed from: C */
    public static void m34651C(C2049i c2049i) {
        m34638j().m34392J(c2049i);
    }

    /* renamed from: D */
    public static void m34650D(boolean z) {
        m34638j().m34391K(z);
    }

    /* renamed from: E */
    public static void m34649E(C2072n c2072n) {
        m34638j().m34390L(c2072n);
    }

    /* renamed from: F */
    public static void m34648F(C2082s c2082s) {
        m34638j().m34389M(c2082s);
    }

    /* renamed from: a */
    public static void m34647a(String str, String str2) {
        m34638j().m34388a(str, str2);
    }

    /* renamed from: b */
    public static void m34646b(String str, String str2) {
        m34638j().m34387b(str, str2);
    }

    /* renamed from: c */
    public static void m34645c(Uri uri, Context context) {
        m34638j().m34386c(uri, m34643e(context));
    }

    /* renamed from: d */
    public static void m34644d(Context context) {
        m34638j().m34382g(m34643e(context));
    }

    /* renamed from: e */
    private static Context m34643e(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    /* renamed from: f */
    public static void m34642f(Context context) {
        m34638j().m34381h(m34643e(context));
    }

    /* renamed from: g */
    public static String m34641g() {
        return m34638j().m34380i();
    }

    /* renamed from: h */
    public static String m34640h(Context context) {
        Context m34643e = m34643e(context);
        if (m34643e != null) {
            return C2043h1.m34469q(m34643e.getContentResolver());
        }
        return null;
    }

    /* renamed from: i */
    public static C2036g m34639i() {
        return m34638j().m34379j();
    }

    /* renamed from: j */
    public static synchronized C2057m m34638j() {
        C2057m c2057m;
        synchronized (C2030e.class) {
            if (f5608a == null) {
                f5608a = new C2057m();
            }
            c2057m = f5608a;
        }
        return c2057m;
    }

    /* renamed from: k */
    public static void m34637k(Context context, InterfaceC2075o0 interfaceC2075o0) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        C2043h1.m34466t(context2, interfaceC2075o0);
    }

    /* renamed from: l */
    public static String m34636l() {
        return m34638j().m34378k();
    }

    /* renamed from: m */
    public static boolean m34635m() {
        return m34638j().m34377l();
    }

    /* renamed from: n */
    public static void m34634n(C2041h c2041h) {
        m34638j().m34375n(c2041h);
    }

    /* renamed from: o */
    public static void m34633o() {
        m34638j().m34374o();
    }

    /* renamed from: p */
    public static void m34632p() {
        m34638j().m34373p();
    }

    /* renamed from: q */
    public static void m34631q(String str) {
        m34638j().m34372q(str);
    }

    /* renamed from: r */
    public static void m34630r(String str) {
        m34638j().m34371r(str);
    }

    /* renamed from: s */
    public static void m34629s() {
        m34638j().m34370s();
    }

    /* renamed from: t */
    public static void m34628t() {
        m34638j().m34369t();
    }

    /* renamed from: u */
    public static void m34627u() {
        m34638j().m34363z();
    }

    /* renamed from: v */
    public static void m34626v(boolean z) {
        m34638j().m34400B(z);
    }

    /* renamed from: w */
    public static void m34625w(boolean z) {
        m34638j().m34399C(z);
    }

    /* renamed from: x */
    public static void m34624x(String str, Context context) {
        m34638j().m34398D(str, m34643e(context));
    }

    /* renamed from: y */
    public static void m34623y(String str, Context context) {
        m34638j().m34401A(str, m34643e(context));
    }

    /* renamed from: z */
    public static void m34622z(C2080r c2080r) {
        Boolean bool = c2080r.f5821l;
        if (bool != null && bool.booleanValue()) {
            C2057m c2057m = f5608a;
            if (c2057m != null) {
                c2057m.m34395G();
            }
            f5608a = null;
            C2055l.m34432F(c2080r.f5810a);
        }
        m34638j().m34396F(c2080r);
    }
}