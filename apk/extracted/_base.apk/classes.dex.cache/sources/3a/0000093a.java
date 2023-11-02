package p021b1;

import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Date;
import java.util.Locale;
import p021b1.C2110z;

/* renamed from: b1.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2106x {

    /* renamed from: A */
    String f5905A;

    /* renamed from: B */
    String f5906B;

    /* renamed from: C */
    String f5907C;

    /* renamed from: D */
    String f5908D;

    /* renamed from: E */
    int f5909E;

    /* renamed from: a */
    String f5910a;

    /* renamed from: b */
    String f5911b;

    /* renamed from: c */
    int f5912c;

    /* renamed from: d */
    Boolean f5913d;

    /* renamed from: e */
    private boolean f5914e = false;

    /* renamed from: f */
    String f5915f;

    /* renamed from: g */
    String f5916g;

    /* renamed from: h */
    String f5917h;

    /* renamed from: i */
    String f5918i;

    /* renamed from: j */
    String f5919j;

    /* renamed from: k */
    String f5920k;

    /* renamed from: l */
    String f5921l;

    /* renamed from: m */
    String f5922m;

    /* renamed from: n */
    String f5923n;

    /* renamed from: o */
    String f5924o;

    /* renamed from: p */
    String f5925p;

    /* renamed from: q */
    String f5926q;

    /* renamed from: r */
    String f5927r;

    /* renamed from: s */
    String f5928s;

    /* renamed from: t */
    String f5929t;

    /* renamed from: u */
    String f5930u;

    /* renamed from: v */
    String f5931v;

    /* renamed from: w */
    String f5932w;

    /* renamed from: x */
    String f5933x;

    /* renamed from: y */
    String f5934y;

    /* renamed from: z */
    String f5935z;

    public C2106x(Context context, String str) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        Locale m34465u = C2043h1.m34465u(configuration);
        int i = configuration.screenLayout;
        this.f5920k = m34204v(context);
        this.f5921l = m34221e(context);
        this.f5922m = m34215k(configuration);
        this.f5923n = m34216j();
        this.f5924o = m34217i();
        this.f5925p = m34206t();
        this.f5926q = m34205u();
        this.f5927r = m34224b();
        this.f5928s = m34209q(m34465u);
        this.f5929t = m34218h(m34465u);
        this.f5930u = m34201y(i);
        this.f5931v = m34202x(i);
        this.f5932w = m34203w(displayMetrics);
        this.f5933x = m34212n(displayMetrics);
        this.f5934y = m34213m(displayMetrics);
        this.f5919j = m34219g(str);
        this.f5918i = m34211o(context);
        this.f5935z = m34210p();
        this.f5905A = m34225a();
        this.f5906B = m34220f();
        this.f5907C = m34223c(context);
        this.f5908D = m34222d(context);
        this.f5909E = m34214l(configuration);
    }

    /* renamed from: a */
    private String m34225a() {
        String[] m34513G = C2043h1.m34513G();
        if (m34513G != null && m34513G.length != 0) {
            return m34513G[0];
        }
        return C2043h1.m34470p();
    }

    /* renamed from: b */
    private String m34224b() {
        return "" + Build.VERSION.SDK_INT;
    }

    /* renamed from: c */
    private String m34223c(Context context) {
        try {
            return C2043h1.f5688b.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT).firstInstallTime));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private String m34222d(Context context) {
        try {
            return C2043h1.f5688b.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT).lastUpdateTime));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private String m34221e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private String m34220f() {
        return Build.ID;
    }

    /* renamed from: g */
    private String m34219g(String str) {
        if (str == null) {
            return "android4.28.8";
        }
        return C2043h1.m34474l("%s@%s", str, "android4.28.8");
    }

    /* renamed from: h */
    private String m34218h(Locale locale) {
        return locale.getCountry();
    }

    /* renamed from: i */
    private String m34217i() {
        return Build.MANUFACTURER;
    }

    /* renamed from: j */
    private String m34216j() {
        return Build.MODEL;
    }

    /* renamed from: k */
    private String m34215k(Configuration configuration) {
        if ((configuration.uiMode & 15) == 4) {
            return "tv";
        }
        int i = configuration.screenLayout & 15;
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return null;
            }
            return "tablet";
        }
        return "phone";
    }

    /* renamed from: l */
    private int m34214l(Configuration configuration) {
        return configuration.uiMode & 15;
    }

    /* renamed from: m */
    private String m34213m(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.heightPixels);
    }

    /* renamed from: n */
    private String m34212n(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.widthPixels);
    }

    /* renamed from: o */
    private String m34211o(Context context) {
        Cursor query;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.facebook.katana", 64).signatures;
            if (signatureArr == null || signatureArr.length != 1 || !"30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2".equals(signatureArr[0].toCharsString()) || (query = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null)) == null) {
                return null;
            }
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            String string = query.getString(query.getColumnIndex("aid"));
            query.close();
            return string;
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: p */
    private String m34210p() {
        return Build.DISPLAY;
    }

    /* renamed from: q */
    private String m34209q(Locale locale) {
        return locale.getLanguage();
    }

    /* renamed from: r */
    private String m34208r(String str) {
        if (str == null) {
            return null;
        }
        return C2043h1.m34482f0(str);
    }

    /* renamed from: s */
    private String m34207s(String str) {
        if (str == null) {
            return null;
        }
        return C2043h1.m34496X(str.replaceAll(":", ""));
    }

    /* renamed from: t */
    private String m34206t() {
        return "android";
    }

    /* renamed from: u */
    private String m34205u() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: v */
    private String m34204v(Context context) {
        return context.getPackageName();
    }

    /* renamed from: w */
    private String m34203w(DisplayMetrics displayMetrics) {
        int i = displayMetrics.densityDpi;
        if (i == 0) {
            return null;
        }
        return i < 140 ? "low" : i > 200 ? "high" : "medium";
    }

    /* renamed from: x */
    private String m34202x(int i) {
        int i2 = i & 48;
        if (i2 != 16) {
            if (i2 != 32) {
                return null;
            }
            return "long";
        }
        return "normal";
    }

    /* renamed from: y */
    private String m34201y(int i) {
        int i2 = i & 15;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                    return "xlarge";
                }
                return "large";
            }
            return "normal";
        }
        return "small";
    }

    /* renamed from: A */
    public void m34226A(Context context) {
        String str = this.f5910a;
        Boolean bool = this.f5913d;
        this.f5910a = null;
        this.f5913d = null;
        this.f5911b = null;
        this.f5912c = -1;
        for (int i = 1; i <= 3; i++) {
            try {
                C2110z.C2112b m34185a = C2110z.m34185a(context, i * 3000);
                if (this.f5910a == null) {
                    this.f5910a = m34185a.m34183a();
                }
                if (this.f5913d == null) {
                    this.f5913d = m34185a.m34182b();
                }
                if (this.f5910a != null && this.f5913d != null) {
                    this.f5911b = "service";
                    this.f5912c = i;
                    return;
                }
            } catch (Exception unused) {
            }
        }
        for (int i2 = 1; i2 <= 3; i2++) {
            Object m34473m = C2043h1.m34473m(context, 11000L);
            if (m34473m != null) {
                if (this.f5910a == null) {
                    this.f5910a = C2043h1.m34519A(context, m34473m, 1000L);
                }
                if (this.f5913d == null) {
                    this.f5913d = C2043h1.m34499U(context, m34473m, 1000L);
                }
                if (this.f5910a != null && this.f5913d != null) {
                    this.f5911b = "library";
                    this.f5912c = i2;
                    return;
                }
            }
        }
        if (this.f5910a == null) {
            this.f5910a = str;
        }
        if (this.f5913d == null) {
            this.f5913d = bool;
        }
    }

    /* renamed from: z */
    public void m34200z(Context context) {
        if (this.f5914e) {
            return;
        }
        if (!C2043h1.m34491b(context, "android.permission.ACCESS_WIFI_STATE")) {
            C2055l.m34422j().mo34445a("Missing permission: ACCESS_WIFI_STATE", new Object[0]);
        }
        String m34463w = C2043h1.m34463w(context);
        this.f5915f = m34208r(m34463w);
        this.f5916g = m34207s(m34463w);
        this.f5917h = C2043h1.m34472n(context);
        this.f5914e = true;
    }
}